package user_2411699_model_class;

import java.time.LocalDate;
import java.util.ArrayList;


public class MalpracticeCase {
    private final String caseId, candidateRoll, candidateName, examCentre, incidentType, invigilatorRemarks, candidateHistory;
    private final LocalDate reportDate;
    private final ArrayList<String> evidenceFiles;
    private String recommendation, disciplinaryAction, status;
    private boolean authorityNotified;

    public MalpracticeCase(String caseId, String candidateRoll, String candidateName, String examCentre, String incidentType, String invigilatorRemarks, String candidateHistory, LocalDate reportDate, ArrayList<String> evidenceFiles, String status) {
        this.caseId = caseId;
        this.candidateRoll = candidateRoll;
        this.candidateName = candidateName;
        this.examCentre = examCentre;
        this.incidentType = incidentType;
        this.invigilatorRemarks = invigilatorRemarks;
        this.candidateHistory = candidateHistory;
        this.reportDate = reportDate;
        this.evidenceFiles = evidenceFiles;
        this.status = status;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getCandidateRoll() {
        return candidateRoll;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getExamCentre() {
        return examCentre;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public String getInvigilatorRemarks() {
        return invigilatorRemarks;
    }

    public String getCandidateHistory() {
        return candidateHistory;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public ArrayList<String> getEvidenceFiles() {
        return evidenceFiles;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public String getDisciplinaryAction() {
        return disciplinaryAction;
    }

    public String getStatus() {
        return status;
    }

    public boolean isAuthorityNotified() {
        return authorityNotified;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public void setDisciplinaryAction(String disciplinaryAction) {
        this.disciplinaryAction = disciplinaryAction;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAuthorityNotified(boolean authorityNotified) {
        this.authorityNotified = authorityNotified;
    }

    @Override
    public String toString() {
        return "MalpracticeCase{" +
                "caseId='" + caseId + '\'' +
                ", candidateRoll='" + candidateRoll + '\'' +
                ", incidentType='" + incidentType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}