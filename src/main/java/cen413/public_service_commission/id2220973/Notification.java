package cen413.public_service_commission.id2220973;

import java.time.LocalDate;

public class Notification {
    private int notificationID;
    private int recruitmentID;
    private String message, role, isRead;
    private LocalDate senAt;

    public Notification(int notificationID, int recruitmentID, String message, String role, String isRead, LocalDate senAt) {
        this.notificationID = notificationID;
        this.recruitmentID = recruitmentID;
        this.message = message;
        this.role = role;
        this.isRead = isRead;
        this.senAt = senAt;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public int getRecruitmentID() {
        return recruitmentID;
    }

    public void setRecruitmentID(int recruitmentID) {
        this.recruitmentID = recruitmentID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public LocalDate getSenAt() {
        return senAt;
    }

    public void setSenAt(LocalDate senAt) {
        this.senAt = senAt;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationID=" + notificationID +
                ", recruitmentID=" + recruitmentID +
                ", message='" + message + '\'' +
                ", role='" + role + '\'' +
                ", isRead='" + isRead + '\'' +
                ", senAt=" + senAt +
                '}';
    }
}
