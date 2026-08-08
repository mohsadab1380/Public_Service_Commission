package user_2411699_model;

import java.time.LocalDateTime;
import java.util.List;

public class AnswerScript {
    private final String scriptId, candidateRoll, candidateName, examName, subject;
    private final int examinerId;
    private final List<QuestionMark> questionMarks;
    private String status, submissionStatus;
    private LocalDateTime evaluatedAt, submittedAt;
    private int evaluationMinutes;

    public AnswerScript(String scriptId, String candidateRoll, String candidateName, String examName, String subject, int examinerId, List<QuestionMark> questionMarks, String status) {
        this.scriptId = scriptId;
        this.candidateRoll = candidateRoll;
        this.candidateName = candidateName;
        this.examName = examName;
        this.subject = subject;
        this.examinerId = examinerId;
        this.questionMarks = questionMarks;
        this.status = status;
        this.submissionStatus = "Not Submitted";
    }

    public String getScriptId() {
        return scriptId;
    }

    public String getCandidateRoll() {
        return candidateRoll;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getExamName() {
        return examName;
    }

    public String getSubject() {
        return subject;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public List<QuestionMark> getQuestionMarks() {
        return questionMarks;
    }

    public String getStatus() {
        return status;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public LocalDateTime getEvaluatedAt() {
        return evaluatedAt;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public int getEvaluationMinutes() {
        return evaluationMinutes;
    }

    public int getTotalMarks() {
        int total = 0;
        for (QuestionMark q : questionMarks) {
            total += q.getObtainedMark();
        }
        return total;
    }

    public int getMaximumMarks() {
        int total = 0;
        for (QuestionMark q : questionMarks) {
            total += q.getMaxMark();
        }
        return total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public void setEvaluatedAt(LocalDateTime evaluatedAt) {
        this.evaluatedAt = evaluatedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public void setEvaluationMinutes(int evaluationMinutes) {
        this.evaluationMinutes = evaluationMinutes;
    }

    @Override
    public String toString() {
        return "AnswerScript{" +
                "scriptId='" + scriptId + '\'' +
                ", candidateRoll='" + candidateRoll + '\'' +
                ", examName='" + examName + '\'' +
                ", subject='" + subject + '\'' +
                ", totalMarks=" + getTotalMarks() +
                ", status='" + status + '\'' +
                '}';
    }
}
