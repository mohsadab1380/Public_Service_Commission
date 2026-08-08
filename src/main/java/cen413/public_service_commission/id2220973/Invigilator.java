package cen413.public_service_commission.id2220973;

public class Invigilator {
    private int invigilatorID;
    private int centerID;
    private String name;
    private String destination;
    private int phone;

    public Invigilator(int invigilatorID, int centerID, String name, String destination, int phone) {
        this.invigilatorID = invigilatorID;
        this.centerID = centerID;
        this.name = name;
        this.destination = destination;
        this.phone = phone;
    }

    public int getInvigilatorID() {
        return invigilatorID;
    }

    public void setInvigilatorID(int invigilatorID) {
        this.invigilatorID = invigilatorID;
    }

    public int getCenterID() {
        return centerID;
    }

    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Invigilator{" +
                "invigilatorID=" + invigilatorID +
                ", centerID=" + centerID +
                ", name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", phone=" + phone +
                '}';
    }
}
