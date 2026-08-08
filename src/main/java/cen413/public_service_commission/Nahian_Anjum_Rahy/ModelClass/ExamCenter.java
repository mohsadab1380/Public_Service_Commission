package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

public class ExamCenter {
    private String centerCode;
    private String centerName;
    private String address;
    private String district;
    private int capacity;
    private int currentCapacity;
    private String status; // ACTIVE, INACTIVE, FULL

    public ExamCenter() {
    }

    public ExamCenter(String centerCode, String centerName, String address, String district, int capacity, int currentCapacity, String status) {
        this.centerCode = centerCode;
        this.centerName = centerName;
        this.address = address;
        this.district = district;
        this.capacity = capacity;
        this.currentCapacity = currentCapacity;
        this.status = status;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ExamCenter{" +
                "centerCode='" + centerCode + '\'' +
                ", centerName='" + centerName + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", capacity=" + capacity +
                ", currentCapacity=" + currentCapacity +
                ", status='" + status + '\'' +
                '}';
    }
}
