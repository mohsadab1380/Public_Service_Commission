package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDateTime;

public class ExamResult {
    private String resultId;
    private String applicationId;
    private float mcqMarks;
    private float writtenMarks;
    private float vivaMarks;
    private float totalMarks;
    private int meritPosition;
    private int totalApplicants;
    private String qualifyingStatus; // SELECTED, WAITLISTED, NOT_SELECTED
    private String status; // APPROVED, PUBLISHED, APPEALED
    private LocalDateTime publicationDate;
    private String appealStatus; // NONE, APPEALED, UNDER_REVIEW, RESOLVED

    public ExamResult() {
    }
    public ExamResult(String resultId, String applicationId, float mcqMarks, float writtenMarks, float vivaMarks, float totalMarks, int meritPosition, int totalApplicants, String qualifyingStatus, String status, LocalDateTime publicationDate, String appealStatus) {
        this.resultId = resultId;
        this.applicationId = applicationId;
        this.mcqMarks = mcqMarks;
        this.writtenMarks = writtenMarks;
        this.vivaMarks = vivaMarks;
        this.totalMarks = totalMarks;
        this.meritPosition = meritPosition;
        this.totalApplicants = totalApplicants;
        this.qualifyingStatus = qualifyingStatus;
        this.status = status;
        this.publicationDate = publicationDate;
        this.appealStatus = appealStatus;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public float getMcqMarks() {
        return mcqMarks;
    }

    public void setMcqMarks(float mcqMarks) {
        this.mcqMarks = mcqMarks;
    }

    public float getWrittenMarks() {
        return writtenMarks;
    }

    public void setWrittenMarks(float writtenMarks) {
        this.writtenMarks = writtenMarks;
    }

    public float getVivaMarks() {
        return vivaMarks;
    }

    public void setVivaMarks(float vivaMarks) {
        this.vivaMarks = vivaMarks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getMeritPosition() {
        return meritPosition;
    }

    public void setMeritPosition(int meritPosition) {
        this.meritPosition = meritPosition;
    }

    public int getTotalApplicants() {
        return totalApplicants;
    }

    public void setTotalApplicants(int totalApplicants) {
        this.totalApplicants = totalApplicants;
    }

    public String getQualifyingStatus() {
        return qualifyingStatus;
    }

    public void setQualifyingStatus(String qualifyingStatus) {
        this.qualifyingStatus = qualifyingStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAppealStatus() {
        return appealStatus;
    }

    public void setAppealStatus(String appealStatus) {
        this.appealStatus = appealStatus;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "resultId='" + resultId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", mcqMarks=" + mcqMarks +
                ", writtenMarks=" + writtenMarks +
                ", vivaMarks=" + vivaMarks +
                ", totalMarks=" + totalMarks +
                ", meritPosition=" + meritPosition +
                ", totalApplicants=" + totalApplicants +
                ", qualifyingStatus='" + qualifyingStatus + '\'' +
                ", status='" + status + '\'' +
                ", publicationDate=" + publicationDate +
                ", appealStatus='" + appealStatus + '\'' +
                '}';
    }
}


