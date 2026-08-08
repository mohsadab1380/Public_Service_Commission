package User_2411699;

import java.time.LocalDate;

public class Accountant extends User {

    private String designation, department;
    private LocalDate dateOfJoining;

    public Accountant(int id, String name, String gender, String userName, String pw, String address, String email, String phoneNum, LocalDate dob, String designation, String department, LocalDate dateOfJoining) {
        super(id, name, gender, userName, pw, address, email, phoneNum, dob);
        this.designation = designation;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
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

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", id=" + id +
                '}';
    }

    @Override
    public void updateProfile() {

    }
}
