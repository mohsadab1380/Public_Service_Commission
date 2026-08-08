package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDate;

public class Application {

    private String applicationId;
    private String circularId;
    private String applicantId;
    private LocalDate applicationDate;
    private String status;          // SUBMITTED, UNDER_REVIEW, ACCEPTED, REJECTED
    private String paymentStatus;   // PENDING, PAID, FAILED, REFUNDED
    private LocalDate paymentDate;
    private String preferredCenter;
    private String rollNumber;

    // Additional fields for education
    private String postTitle;
    private String department;
    private String sscGpa;
    private String sscInstitution;
    private String hscGpa;
    private String hscInstitution;
    private String graduationDegree;
    private String graduationGpa;
    private String graduationInstitution;

    // ========== CONSTRUCTORS ==========

    // Default Constructor
    public Application() {
        this.applicationDate = LocalDate.now();
        this.status = "SUBMITTED";
        this.paymentStatus = "PENDING";
    }

    // Full Constructor
    public Application(String applicationId, String circularId, String applicantId,
                       LocalDate applicationDate, String status, String paymentStatus,
                       LocalDate paymentDate, String preferredCenter, String rollNumber) {
        this.applicationId = applicationId;
        this.circularId = circularId;
        this.applicantId = applicantId;
        this.applicationDate = applicationDate;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.preferredCenter = preferredCenter;
        this.rollNumber = rollNumber;
    }

    // Constructor for Application Submission (with education)
    public Application(String applicationId, String applicantId, String circularId,
                       String postTitle, String department, String preferredCenter,
                       String sscGpa, String sscInstitution, String hscGpa,
                       String hscInstitution, String graduationDegree,
                       String graduationGpa, String graduationInstitution) {
        this.applicationId = applicationId;
        this.applicantId = applicantId;
        this.circularId = circularId;
        this.postTitle = postTitle;
        this.department = department;
        this.preferredCenter = preferredCenter;
        this.applicationDate = LocalDate.now();
        this.status = "SUBMITTED";
        this.paymentStatus = "PENDING";
        this.sscGpa = sscGpa;
        this.sscInstitution = sscInstitution;
        this.hscGpa = hscGpa;
        this.hscInstitution = hscInstitution;
        this.graduationDegree = graduationDegree;
        this.graduationGpa = graduationGpa;
        this.graduationInstitution = graduationInstitution;
    }

    // ========== GETTERS ==========

    public String getApplicationId() { return applicationId; }
    public String getCircularId() { return circularId; }
    public String getApplicantId() { return applicantId; }
    public LocalDate getApplicationDate() { return applicationDate; }
    public String getStatus() { return status; }
    public String getPaymentStatus() { return paymentStatus; }
    public LocalDate getPaymentDate() { return paymentDate; }
    public String getPreferredCenter() { return preferredCenter; }
    public String getRollNumber() { return rollNumber; }

    // Additional Getters
    public String getPostTitle() { return postTitle; }
    public String getDepartment() { return department; }
    public String getSscGpa() { return sscGpa; }
    public String getSscInstitution() { return sscInstitution; }
    public String getHscGpa() { return hscGpa; }
    public String getHscInstitution() { return hscInstitution; }
    public String getGraduationDegree() { return graduationDegree; }
    public String getGraduationGpa() { return graduationGpa; }
    public String getGraduationInstitution() { return graduationInstitution; }

    // ========== SETTERS ==========

    public void setApplicationId(String applicationId) { this.applicationId = applicationId; }
    public void setCircularId(String circularId) { this.circularId = circularId; }
    public void setApplicantId(String applicantId) { this.applicantId = applicantId; }
    public void setApplicationDate(LocalDate applicationDate) { this.applicationDate = applicationDate; }
    public void setStatus(String status) { this.status = status; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }
    public void setPreferredCenter(String preferredCenter) { this.preferredCenter = preferredCenter; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    // Additional Setters
    public void setPostTitle(String postTitle) { this.postTitle = postTitle; }
    public void setDepartment(String department) { this.department = department; }
    public void setSscGpa(String sscGpa) { this.sscGpa = sscGpa; }
    public void setSscInstitution(String sscInstitution) { this.sscInstitution = sscInstitution; }
    public void setHscGpa(String hscGpa) { this.hscGpa = hscGpa; }
    public void setHscInstitution(String hscInstitution) { this.hscInstitution = hscInstitution; }
    public void setGraduationDegree(String graduationDegree) { this.graduationDegree = graduationDegree; }
    public void setGraduationGpa(String graduationGpa) { this.graduationGpa = graduationGpa; }
    public void setGraduationInstitution(String graduationInstitution) {
        this.graduationInstitution = graduationInstitution;
    }



    //  if application is paid
    public boolean isPaid() {
        return "PAID".equals(paymentStatus);
    }

    // if application is submitted
    public boolean isSubmitted() {
        return "SUBMITTED".equals(status);
    }

    // Get status with label
    public String getStatusLabel() {
        if (status == null) return "Unknown";
        return status;
    }

    // Get payment status with label
    public String getPaymentStatusLabel() {
        if (paymentStatus == null) return "Unknown";
        return paymentStatus;
    }

    // ========== TO STRING ==========
    @Override
    public String toString() {
        return "Application{" +
                "applicationId='" + applicationId + '\'' +
                ", circularId='" + circularId + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", status='" + status + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
