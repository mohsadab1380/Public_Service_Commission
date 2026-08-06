package cen413.public_service_commission.Tahmid_2430835;

import java.io.Serializable;
import java.time.LocalDate;

public class ActivityLog implements Serializable {

    private int logId;
    private int circularId;
    private String postTitle;
    private String doneBy;
    private String role;
    private LocalDate date;

    public ActivityLog(int logId, int circularId, String postTitle, String doneBy, String role, LocalDate date) {
        this.logId = logId;
        this.circularId = circularId;
        this.postTitle = postTitle;
        this.doneBy = doneBy;
        this.role = role;
        this.date = date;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getCircularId() {
        return circularId;
    }

    public void setCircularId(int circularId) {
        this.circularId = circularId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ActivityLog{" +
                "logId=" + logId +
                ", circularId=" + circularId +
                ", postTitle='" + postTitle + '\'' +
                ", doneBy='" + doneBy + '\'' +
                ", role='" + role + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
