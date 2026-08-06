package cen413.public_service_commission.Nahian_Anjum_Rahy;

import java.time.LocalDate;

public class Exam {
    private String examId;
    private String examName;
    private LocalDate preliminaryDate;
    private LocalDate writtenDate;
    private LocalDate vivaStartDate;
    private LocalDate vivaEndDate;
    private String status; // CREATED, PUBLISHED, COMPLETED, CANCELLED
    private LocalDate publishedDate;

    public Exam() {
    }

    public Exam(String examId, String examName, LocalDate preliminaryDate, LocalDate writtenDate, LocalDate vivaStartDate, LocalDate vivaEndDate, String status, LocalDate publishedDate) {
        this.examId = examId;
        this.examName = examName;
        this.preliminaryDate = preliminaryDate;
        this.writtenDate = writtenDate;
        this.vivaStartDate = vivaStartDate;
        this.vivaEndDate = vivaEndDate;
        this.status = status;
        this.publishedDate = publishedDate;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public LocalDate getPreliminaryDate() {
        return preliminaryDate;
    }

    public void setPreliminaryDate(LocalDate preliminaryDate) {
        this.preliminaryDate = preliminaryDate;
    }

    public LocalDate getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(LocalDate writtenDate) {
        this.writtenDate = writtenDate;
    }

    public LocalDate getVivaStartDate() {
        return vivaStartDate;
    }

    public void setVivaStartDate(LocalDate vivaStartDate) {
        this.vivaStartDate = vivaStartDate;
    }

    public LocalDate getVivaEndDate() {
        return vivaEndDate;
    }

    public void setVivaEndDate(LocalDate vivaEndDate) {
        this.vivaEndDate = vivaEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
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
