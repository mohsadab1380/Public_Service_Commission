package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

public class Logistics {
        private String centerCode;
        private String centerName;
        private String district;
        private int capacity;
        private double utilization;
        private String status;

    public Logistics() {
    }

    public Logistics(String centerCode, String centerName, String district, int capacity, double utilization, String status) {
        this.centerCode = centerCode;
        this.centerName = centerName;
        this.district = district;
        this.capacity = capacity;
        this.utilization = utilization;
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

    public double getUtilization() {
        return utilization;
    }

    public void setUtilization(double utilization) {
        this.utilization = utilization;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Logistics{" +
                "centerCode='" + centerCode + '\'' +
                ", centerName='" + centerName + '\'' +
                ", district='" + district + '\'' +
                ", capacity=" + capacity +
                ", utilization=" + utilization +
                ", status='" + status + '\'' +
                '}';
    }
}
