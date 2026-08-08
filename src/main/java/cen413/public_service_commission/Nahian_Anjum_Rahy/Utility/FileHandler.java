package cen413.public_service_commission.Nahian_Anjum_Rahy.Utility;

import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.Application;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;

public class FileHandler {

    private static final String DATA_DIR = "src/main/java/cen413/public_service_commission/Nahian_Anjum_Rahy/Data/Files/";

    // ========== WRITE TO FILE ==========
    public static void writeToFile(String filename, String content) {
        try {
            Files.createDirectories(Paths.get(DATA_DIR));
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_DIR + filename))) {
                writer.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ========== READ FROM FILE ==========
    public static String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(DATA_DIR + filename);
            if (!file.exists()) {
                return "";
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // ========== SAVE APPLICATION ==========
    public static void saveApplication(Application application) {
        // Format: applicationId|applicantId|circularId|postTitle|department|applicationDate|status|paymentStatus|preferredCenter
        //          |sscGpa|sscInstitution|hscGpa|hscInstitution|graduationDegree|graduationGpa|graduationInstitution
        String data = String.join("|",
                application.getApplicationId(),
                application.getApplicantId(),
                application.getCircularId(),
                application.getPostTitle(),
                application.getDepartment(),
                application.getApplicationDate().toString(),
                application.getStatus(),
                application.getPaymentStatus(),
                application.getPreferredCenter(),
                application.getSscGpa(),
                application.getSscInstitution(),
                application.getHscGpa(),
                application.getHscInstitution(),
                application.getGraduationDegree(),
                application.getGraduationGpa(),
                application.getGraduationInstitution()
        );

        String existing = readFromFile("applications.txt");
        writeToFile("applications.txt", existing + data + "\n");
    }

    // ========== GET ALL APPLICATIONS ==========
    public static List<Application> getAllApplications() {
        List<Application> applications = new ArrayList<>();
        String content = readFromFile("applications.txt");
        if (content.isEmpty()) return applications;

        String[] lines = content.split("\n");
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                String[] parts = line.split("\\|");
                if (parts.length >= 9) {
                    Application app = new Application();
                    app.setApplicationId(parts[0]);
                    app.setApplicantId(parts[1]);
                    app.setCircularId(parts[2]);
                    app.setPostTitle(parts[3]);
                    app.setDepartment(parts[4]);
                    app.setApplicationDate(LocalDate.parse(parts[5]));
                    app.setStatus(parts[6]);
                    app.setPaymentStatus(parts[7]);
                    app.setPreferredCenter(parts[8]);

                    // Education fields (if available)
                    if (parts.length > 9) {
                        app.setSscGpa(parts[9]);
                        app.setSscInstitution(parts[10]);
                        app.setHscGpa(parts[11]);
                        app.setHscInstitution(parts[12]);
                        app.setGraduationDegree(parts[13]);
                        app.setGraduationGpa(parts[14]);
                        app.setGraduationInstitution(parts[15]);
                    }
                    applications.add(app);
                }
            }
        }
        return applications;
    }

    // ========== GET APPLICATION BY ID ==========
    public static Application getApplicationById(String applicationId) {
        List<Application> applications = getAllApplications();
        for (Application app : applications) {
            if (app.getApplicationId().equals(applicationId)) {
                return app;
            }
        }
        return null;
    }

    // ========== GET APPLICATIONS BY APPLICANT ID ==========
    public static List<Application> getApplicationsByApplicantId(String applicantId) {
        List<Application> allApps = getAllApplications();
        List<Application> applicantApps = new ArrayList<>();
        for (Application app : allApps) {
            if (app.getApplicantId().equals(applicantId)) {
                applicantApps.add(app);
            }
        }
        return applicantApps;
    }

    // ========== UPDATE APPLICATION STATUS ==========
    public static void updateApplicationStatus(String applicationId, String newStatus) {
        List<Application> applications = getAllApplications();
        StringBuilder content = new StringBuilder();

        for (Application app : applications) {
            if (app.getApplicationId().equals(applicationId)) {
                app.setStatus(newStatus);
            }
            // Rebuild file content
            content.append(String.join("|",
                    app.getApplicationId(),
                    app.getApplicantId(),
                    app.getCircularId(),
                    app.getPostTitle(),
                    app.getDepartment(),
                    app.getApplicationDate().toString(),
                    app.getStatus(),
                    app.getPaymentStatus(),
                    app.getPreferredCenter(),
                    app.getSscGpa(),
                    app.getSscInstitution(),
                    app.getHscGpa(),
                    app.getHscInstitution(),
                    app.getGraduationDegree(),
                    app.getGraduationGpa(),
                    app.getGraduationInstitution()
            )).append("\n");
        }

        writeToFile("applications.txt", content.toString());
    }
}