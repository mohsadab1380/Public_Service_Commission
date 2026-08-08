package cen413.public_service_commission.id2220973;

import java.time.LocalDate;

public class Recruitment {
    private int recruitmentID;
    private String postName;
    private String departmentName;
    private int vacancy;
    private LocalDate startDate, endDate;

    public Recruitment(int recruitmentID, String postName, String departmentName, int vacancy, LocalDate startDate, LocalDate endDate) {
        this.recruitmentID = recruitmentID;
        this.postName = postName;
        this.departmentName = departmentName;
        this.vacancy = vacancy;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getRecruitmentID() {
        return recruitmentID;
    }

    public void setRecruitmentID(int recruitmentID) {
        this.recruitmentID = recruitmentID;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "recruitmentID=" + recruitmentID +
                ", postName='" + postName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", vacancy=" + vacancy +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
