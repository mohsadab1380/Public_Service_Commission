package user_2411699_model;

import java.util.Map;

public class CandidateVerification {
    private final String applicationId, candidateName, rollNumber, examName, educationalQualification;
    private final Map<String, Boolean> documents;
    private final int candidateAge;
    private String verificationStatus, verificationRemarks;

    public CandidateVerification(String applicationId, String candidateName, String rollNumber, String examName, String educationalQualification, int candidateAge, Map<String, Boolean> documents, String verificationStatus) {
        this.applicationId = applicationId;
        this.candidateName = candidateName;
        this.rollNumber = rollNumber;
        this.examName = examName;
        this.educationalQualification = educationalQualification;
        this.candidateAge = candidateAge;
        this.documents = documents;
        this.verificationStatus = verificationStatus;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getExamName() {
        return examName;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public int getCandidateAge() {
        return candidateAge;
    }

    public Map<String, Boolean> getDocuments() {
        return documents;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public String getVerificationRemarks() {
        return verificationRemarks;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void setVerificationRemarks(String verificationRemarks) {
        this.verificationRemarks = verificationRemarks;
    }

    @Override
    public String toString() {
        return "CandidateVerification{" +
                "applicationId='" + applicationId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                '}';
    }
}
