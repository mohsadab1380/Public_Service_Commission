package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDate;

public class AdmitCard {
        private String admitCardId;
        private String applicationId;
        private String rollNumber;
        private String centerName;
        private String centerAddress;
        private LocalDate examDate;
        private String examTime;
        private String roomNumber;
        private String seatNumber;
        private LocalDate generationDate;
        private LocalDate downloadDate;

    public AdmitCard() {
    }

    public AdmitCard(String admitCardId, String applicationId, String rollNumber, String centerName, String centerAddress, LocalDate examDate, String examTime, String roomNumber, String seatNumber, LocalDate generationDate, LocalDate downloadDate) {
        this.admitCardId = admitCardId;
        this.applicationId = applicationId;
        this.rollNumber = rollNumber;
        this.centerName = centerName;
        this.centerAddress = centerAddress;
        this.examDate = examDate;
        this.examTime = examTime;
        this.roomNumber = roomNumber;
        this.seatNumber = seatNumber;
        this.generationDate = generationDate;
        this.downloadDate = downloadDate;
    }

    public String getAdmitCardId() {
        return admitCardId;
    }

    public void setAdmitCardId(String admitCardId) {
        this.admitCardId = admitCardId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
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

    public LocalDate getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(LocalDate generationDate) {
        this.generationDate = generationDate;
    }

    public LocalDate getDownloadDate() {
        return downloadDate;
    }

    public void setDownloadDate(LocalDate downloadDate) {
        this.downloadDate = downloadDate;
    }

    @Override
    public String toString() {
        return "AdmitCard{" +
                "admitCardId='" + admitCardId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", centerName='" + centerName + '\'' +
                ", centerAddress='" + centerAddress + '\'' +
                ", examDate=" + examDate +
                ", examTime='" + examTime + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", generationDate=" + generationDate +
                ", downloadDate=" + downloadDate +
                '}';
    }
}
