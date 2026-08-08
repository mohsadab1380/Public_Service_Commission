package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDateTime;

public class ExamSchedule {
    private String scheduleId;
    private String examName;
    private LocalDateTime preliminaryDate;
    private LocalDateTime writtenDate;
    private LocalDateTime vivaStartDate;
    private LocalDateTime vivaEndDate;
    private String status; // CREATED, PUBLISHED, COMPLETED, CANCELLED
    private LocalDateTime publishedDate;

    public ExamSchedule() {
    }

    public ExamSchedule(String scheduleId, String examName, LocalDateTime preliminaryDate, LocalDateTime writtenDate, LocalDateTime vivaStartDate, LocalDateTime vivaEndDate, String status, LocalDateTime publishedDate) {
        this.scheduleId = scheduleId;
        this.examName = examName;
        this.preliminaryDate = preliminaryDate;
        this.writtenDate = writtenDate;
        this.vivaStartDate = vivaStartDate;
        this.vivaEndDate = vivaEndDate;
        this.status = status;
        this.publishedDate = publishedDate;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public LocalDateTime getPreliminaryDate() {
        return preliminaryDate;
    }

    public void setPreliminaryDate(LocalDateTime preliminaryDate) {
        this.preliminaryDate = preliminaryDate;
    }

    public LocalDateTime getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(LocalDateTime writtenDate) {
        this.writtenDate = writtenDate;
    }

    public LocalDateTime getVivaStartDate() {
        return vivaStartDate;
    }

    public void setVivaStartDate(LocalDateTime vivaStartDate) {
        this.vivaStartDate = vivaStartDate;
    }

    public LocalDateTime getVivaEndDate() {
        return vivaEndDate;
    }

    public void setVivaEndDate(LocalDateTime vivaEndDate) {
        this.vivaEndDate = vivaEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "ExamSchedule{" +
                "scheduleId='" + scheduleId + '\'' +
                ", examName='" + examName + '\'' +
                ", preliminaryDate=" + preliminaryDate +
                ", writtenDate=" + writtenDate +
                ", vivaStartDate=" + vivaStartDate +
                ", vivaEndDate=" + vivaEndDate +
                ", status='" + status + '\'' +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
