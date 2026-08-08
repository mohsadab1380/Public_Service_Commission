package User_2411699;


import java.time.LocalDate;

public class Examiner extends User {
    private String designation, department, subject;
    private LocalDate dateOfJoining;

    public Examiner(int id, String name, String gender, String userName, String pw, String address, String email, String phoneNum, LocalDate dob, String designation, String department, String subject, LocalDate dateOfJoining) {
        super(id, name, gender, userName, pw, address, email, phoneNum, dob);
        this.designation = designation;
        this.department = department;
        this.subject = subject;
        this.dateOfJoining = dateOfJoining;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Examiner{" +
                "designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", subject='" + subject + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", id=" + id +
                '}';
    }

    @Override
    public void updateProfile() {

    }
}