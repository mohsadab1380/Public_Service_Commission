package user_2411699_model_class;

import java.time.LocalDate;

public class ReevaluationRequest {
    private final String requestId, candidateRoll, candidateName, subject, scriptId;
    private final int previousMarks;
    private final LocalDate requestDate;
    private Integer updatedMarks;
    private String status, examinerRemarks;

    public ReevaluationRequest(String requestId, String candidateRoll, String candidateName, String subject, String scriptId, int previousMarks, LocalDate requestDate, String status, String examinerRemarks) {
        this.requestId = requestId;
        this.candidateRoll = candidateRoll;
        this.candidateName = candidateName;
        this.subject = subject;
        this.scriptId = scriptId;
        this.previousMarks = previousMarks;
        this.requestDate = requestDate;
        this.status = status;
        this.examinerRemarks = examinerRemarks;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getCandidateRoll() {
        return candidateRoll;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSubject() {
        return subject;
    }

    public String getScriptId() {
        return scriptId;
    }

    public int getPreviousMarks() {
        return previousMarks;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public Integer getUpdatedMarks() {
        return updatedMarks;
    }

    public String getStatus() {
        return status;
    }

    public String getExaminerRemarks() {
        return examinerRemarks;
    }

    public void setUpdatedMarks(Integer updatedMarks) {
        this.updatedMarks = updatedMarks;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExaminerRemarks(String examinerRemarks) {
        this.examinerRemarks = examinerRemarks;
    }

    @Override
    public String toString() {
        return "ReevaluationRequest{" +
                "requestId='" + requestId + '\'' +
                ", candidateRoll='" + candidateRoll + '\'' +
                ", subject='" + subject + '\'' +
                ", previousMarks=" + previousMarks +
                ", updatedMarks=" + updatedMarks +
                ", status='" + status + '\'' +
                '}';
    }
}
