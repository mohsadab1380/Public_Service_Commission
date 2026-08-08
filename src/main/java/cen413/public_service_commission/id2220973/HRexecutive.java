package cen413.public_service_commission.id2220973;

public class HRexecutive {
    private int hrID;
    private int userID;
    private String department;
    private String phone;
    private String designation;

    public HRexecutive(int hrID, int userID, String department, String phone, String designation) {
        this.hrID = hrID;
        this.userID = userID;
        this.department = department;
        this.phone = phone;
        this.designation = designation;
    }

    public int getHrID() {
        return hrID;
    }

    public void setHrID(int hrID) {
        this.hrID = hrID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "HRexecutive{" +
                "hrID=" + hrID +
                ", userID=" + userID +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
