package cen413.public_service_commission.Nahian_Anjum_Rahy;

import java.time.LocalDate;


public class Application {
        private String applicationId;
        private String circularId;
        private String applicantId;
        private LocalDate applicationDate;
        private String status; // SUBMITTED, UNDER_REVIEW, ACCEPTED, REJECTED
        private String paymentStatus; // PENDING, PAID, FAILED, REFUNDED
        private LocalDate paymentDate;
        private String preferredCenter;
        private String rollNumber;

    public Application() {
    }

    public Application(String applicationId, String circularId, String applicantId, LocalDate applicationDate, String status, String paymentStatus, LocalDate paymentDate, String preferredCenter, String rollNumber) {
        this.applicationId = applicationId;
        this.circularId = circularId;
        this.applicantId = applicantId;
        this.applicationDate = applicationDate;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.preferredCenter = preferredCenter;
        this.rollNumber = rollNumber;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getCircularId() {
        return circularId;
    }

    public void setCircularId(String circularId) {
        this.circularId = circularId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPreferredCenter() {
        return preferredCenter;
    }

    public void setPreferredCenter(String preferredCenter) {
        this.preferredCenter = preferredCenter;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationId='" + applicationId + '\'' +
                ", circularId='" + circularId + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", applicationDate=" + applicationDate +
                ", status='" + status + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paymentDate=" + paymentDate +
                ", preferredCenter='" + preferredCenter + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
}
