package cen413.public_service_commission.Nahian_Anjum_Rahy;

import java.time.LocalDate;

public class Appeal {
    private String appealId;
    private String applicationId;
    private String reason;
    private float originalMarks;
    private float recheckedMarks;
    private String status; // PENDING, UNDER_REVIEW, RESOLVED, REJECTED
    private LocalDate filingDate;
    private String assignedExaminer;
    private LocalDate assignedDate;
    private String decision;
    private LocalDate resolutionDate;

    public Appeal() {
    }

    public Appeal(String appealId, String applicationId, String reason, float originalMarks, float recheckedMarks, String status, LocalDate filingDate, String assignedExaminer, LocalDate assignedDate, String decision, LocalDate resolutionDate) {
        this.appealId = appealId;
        this.applicationId = applicationId;
        this.reason = reason;
        this.originalMarks = originalMarks;
        this.recheckedMarks = recheckedMarks;
        this.status = status;
        this.filingDate = filingDate;
        this.assignedExaminer = assignedExaminer;
        this.assignedDate = assignedDate;
        this.decision = decision;
        this.resolutionDate = resolutionDate;
    }

    public String getAppealId() {
        return appealId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getReason() {
        return reason;
    }

    public float getOriginalMarks() {
        return originalMarks;
    }

    public float getRecheckedMarks() {
        return recheckedMarks;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getFilingDate() {
        return filingDate;
    }

    public String getAssignedExaminer() {
        return assignedExaminer;
    }

    public LocalDate getAssignedDate() {
        return assignedDate;
    }

    public String getDecision() {
        return decision;
    }

    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    public void setOriginalMarks(float originalMarks) {
        this.originalMarks = originalMarks;
    }

    public void setRecheckedMarks(float recheckedMarks) {
        this.recheckedMarks = recheckedMarks;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFilingDate(LocalDate filingDate) {
        this.filingDate = filingDate;
    }

    public void setAssignedExaminer(String assignedExaminer) {
        this.assignedExaminer = assignedExaminer;
    }

    public void setAssignedDate(LocalDate assignedDate) {
        this.assignedDate = assignedDate;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public void setResolutionDate(LocalDate resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    @Override
    public String toString() {
        return "Appeal{" +
                "appealId='" + appealId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", reason='" + reason + '\'' +
                ", originalMarks=" + originalMarks +
                ", recheckedMarks=" + recheckedMarks +
                ", status='" + status + '\'' +
                ", filingDate=" + filingDate +
                ", assignedExaminer='" + assignedExaminer + '\'' +
                ", assignedDate=" + assignedDate +
                ", decision='" + decision + '\'' +
                ", resolutionDate=" + resolutionDate +
                '}';
    }
}
