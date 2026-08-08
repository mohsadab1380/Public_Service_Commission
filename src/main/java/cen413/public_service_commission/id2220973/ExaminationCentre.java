package cen413.public_service_commission.id2220973;

public class ExaminationCentre {
    private int centerID;
    private String centerName;
    private String address;
    private int capacity;

    public ExaminationCentre(int centerID, String centerName, String address, int capacity) {
        this.centerID = centerID;
        this.centerName = centerName;
        this.address = address;
        this.capacity = capacity;
    }

    public int getCenterID() {
        return centerID;
    }

    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ExaminationCentre{" +
                "centerID=" + centerID +
                ", centerName='" + centerName + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
