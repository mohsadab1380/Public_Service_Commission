package user_2411699_model;

import java.time.LocalDateTime;

public class ExaminerRemark {
    private final String candidateRoll, candidateName, examName, subject, remarks, recommendation;
    private final int examinerId;
    private final LocalDateTime createdAt;

    public ExaminerRemark(String candidateRoll, String candidateName, String examName, String subject, String remarks, String recommendation, int examinerId, LocalDateTime createdAt) {
        this.candidateRoll = candidateRoll;
        this.candidateName = candidateName;
        this.examName = examName;
        this.subject = subject;
        this.remarks = remarks;
        this.recommendation = recommendation;
        this.examinerId = examinerId;
        this.createdAt = createdAt;
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

    public String getRemarks() {
        return remarks;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "[" + createdAt + "] " + recommendation + " - " + remarks;
    }
}
