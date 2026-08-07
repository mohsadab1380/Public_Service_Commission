package cen413.public_service_commission.id2220973;

import java.time.LocalDate;

public class Examination {
    private int examID, recruitmentID, totalMarks;
    private String examName, status;
    private LocalDate examDate;

    public Examination(int examID, int recruitmentID, int totalMarks, String examName, String status, LocalDate examDate) {
        this.examID = examID;
        this.recruitmentID = recruitmentID;
        this.totalMarks = totalMarks;
        this.examName = examName;
        this.status = status;
        this.examDate = examDate;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public int getRecruitmentID() {
        return recruitmentID;
    }

    public void setRecruitmentID(int recruitmentID) {
        this.recruitmentID = recruitmentID;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "examID=" + examID +
                ", recruitmentID=" + recruitmentID +
                ", totalMarks=" + totalMarks +
                ", examName='" + examName + '\'' +
                ", status='" + status + '\'' +
                ", examDate=" + examDate +
                '}';
    }
}
