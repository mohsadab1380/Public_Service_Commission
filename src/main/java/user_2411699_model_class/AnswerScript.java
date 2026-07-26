package user_2411699_model_class;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AnswerScript {
    private final String scriptId, candidateRoll, candidateName, examName, subject;
    private final int examinerId;
    private final ArrayList<QuestionMark> questionMarks;
    private String status, submissionStatus;
    private LocalDateTime evaluatedAt, submittedAt;
    private int evaluationMinutes;

    public AnswerScript(String scriptId, String candidateRoll, String candidateName, String examName, String subject, int examinerId, ArrayList<QuestionMark> questionMarks, String status, String submissionStatus, LocalDateTime evaluatedAt, LocalDateTime submittedAt, int evaluationMinutes) {
        this.scriptId = scriptId;
        this.candidateRoll = candidateRoll;
        this.candidateName = candidateName;
        this.examName = examName;
        this.subject = subject;
        this.examinerId = examinerId;
        this.questionMarks = questionMarks;
        this.status = status;
        this.submissionStatus = submissionStatus;
        this.evaluatedAt = evaluatedAt;
        this.submittedAt = submittedAt;
        this.evaluationMinutes = evaluationMinutes;
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

    public ArrayList<QuestionMark> getQuestionMarks() {
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
                ", candidateName='" + candidateName + '\'' +
                ", examName='" + examName + '\'' +
                ", subject='" + subject + '\'' +
                ", examinerId=" + examinerId +
                ", questionMarks=" + questionMarks +
                ", status='" + status + '\'' +
                ", submissionStatus='" + submissionStatus + '\'' +
                ", evaluatedAt=" + evaluatedAt +
                ", submittedAt=" + submittedAt +
                ", evaluationMinutes=" + evaluationMinutes +
                '}';
    }
}
