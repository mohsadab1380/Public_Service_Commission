package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDate;

public class CenterAllocation {
    private String allocationId;
    private String applicationId;
    private String centerCode;
    private LocalDate allocationDate;
    private String assignedBy;
    private String rollNumber;
    private String roomNumber;
    private String seatNumber;
    private String status; // ALLOCATED, ADMIT_CARD_GENERATED, COMPLETED

    public CenterAllocation(String dhakaCenter, String dhaka, int i, int i1, double v) {
    }

    public CenterAllocation(String allocationId, String applicationId, String centerCode, LocalDate allocationDate, String assignedBy, String rollNumber, String roomNumber, String seatNumber, String status) {
        this.allocationId = allocationId;
        this.applicationId = applicationId;
        this.centerCode = centerCode;
        this.allocationDate = allocationDate;
        this.assignedBy = assignedBy;
        this.rollNumber = rollNumber;
        this.roomNumber = roomNumber;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public LocalDate getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(LocalDate allocationDate) {
        this.allocationDate = allocationDate;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CenterAllocation{" +
                "allocationId='" + allocationId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", centerCode='" + centerCode + '\'' +
                ", allocationDate=" + allocationDate +
                ", assignedBy='" + assignedBy + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
