package user_2411699;

import cen413.public_service_commission.User;

import java.time.LocalDate;

public class Accountant extends User {
    private String designation,department;
    private LocalDate dateOfJoining;

    public Accountant(int id, String name, String gender, String userName, String pw, String address, String email, String phoneNum, LocalDate dob, String designation, String department, LocalDate dateOfJoining) {
        super(id, name, gender, userName, pw, address, email, phoneNum, dob);
        this.designation = designation;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
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
    public void updateProfile() {

    }
}
