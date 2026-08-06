package cen413.public_service_commission.id2220973;

public class Headofcentre {
    private int hocID;
    private int userID;
    private int centerID;
    private int phone;

    public Headofcentre(int hocID, int userID, int centerID, int phone) {
        this.hocID = hocID;
        this.userID = userID;
        this.centerID = centerID;
        this.phone = phone;
    }

    public int getHocID() {
        return hocID;
    }

    public void setHocID(int hocID) {
        this.hocID = hocID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCenterID() {
        return centerID;
    }

    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Headofcentre{" +
                "hocID=" + hocID +
                ", userID=" + userID +
                ", centerID=" + centerID +
                ", phone=" + phone +
                '}';
    }
}
