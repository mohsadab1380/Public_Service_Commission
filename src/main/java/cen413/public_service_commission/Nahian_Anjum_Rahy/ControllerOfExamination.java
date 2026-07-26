package cen413.public_service_commission.Nahian_Anjum_Rahy;

import java.time.LocalDateTime;

public class ControllerOfExamination {
    private String controllerId;
    private String password;
    private String name;
    private String email;
    private String designation;
    private LocalDateTime joiningDate;
    private boolean isActive;

    public ControllerOfExamination() {
    }

    public ControllerOfExamination(String controllerId, String password, String name, String email, String designation, LocalDateTime joiningDate, boolean isActive) {
        this.controllerId = controllerId;
        this.password = password;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.isActive = isActive;
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "ControllerOfExamination{" +
                "controllerId='" + controllerId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", joiningDate=" + joiningDate +
                ", isActive=" + isActive +
                '}';
    }
}
