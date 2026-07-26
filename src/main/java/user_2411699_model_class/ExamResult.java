package user_2411699_model_class;


import java.time.LocalDateTime;

public class ExamResult {
    private final String scriptId, candidateRoll, candidateName, examName, subject;
    private final int obtainedMarks, maximumMarks, examinerId;
    private final LocalDateTime submittedAt;
    private String submissionStatus;

    public ExamResult(String scriptId, String candidateRoll, String candidateName, String examName, String subject, int obtainedMarks, int maximumMarks, int examinerId, LocalDateTime submittedAt, String submissionStatus) {
        this.scriptId = scriptId;
        this.candidateRoll = candidateRoll;
        this.candidateName = candidateName;
        this.examName = examName;
        this.subject = subject;
        this.obtainedMarks = obtainedMarks;
        this.maximumMarks = maximumMarks;
        this.examinerId = examinerId;
        this.submittedAt = submittedAt;
        this.submissionStatus = submissionStatus;
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

    public int getObtainedMarks() {
        return obtainedMarks;
    }

    public int getMaximumMarks() {
        return maximumMarks;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "candidateRoll='" + candidateRoll + '\'' +
                ", subject='" + subject + '\'' +
                ", obtainedMarks=" + obtainedMarks +
                ", submissionStatus='" + submissionStatus + '\'' +
                '}';
    }
}
