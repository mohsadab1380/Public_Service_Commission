package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDate;

public class JobCircular {
    private String circularId;
    private String postTitle;
    private String department;
    private String ministry;
    private int vacancyCount;
    private LocalDate submissionDate;
    private LocalDate deadline;
    private String qualifications;
    private String experience;
    private String ageLimit;
    private String postedBy;
    private String status; // PENDING, APPROVED, REJECTED, CLOSED

    public JobCircular() {
    }

    public JobCircular(String circularId, String postTitle, String department, String ministry, int vacancyCount, LocalDate submissionDate, LocalDate deadline, String qualifications, String experience, String ageLimit, String postedBy, String status) {
        this.circularId = circularId;
        this.postTitle = postTitle;
        this.department = department;
        this.ministry = ministry;
        this.vacancyCount = vacancyCount;
        this.submissionDate = submissionDate;
        this.deadline = deadline;
        this.qualifications = qualifications;
        this.experience = experience;
        this.ageLimit = ageLimit;
        this.postedBy = postedBy;
        this.status = status;
    }

    public String getCircularId() {
        return circularId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getDepartment() {
        return department;
    }

    public String getMinistry() {
        return ministry;
    }

    public int getVacancyCount() {
        return vacancyCount;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getQualifications() {
        return qualifications;
    }

    public String getExperience() {
        return experience;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setCircularId(String circularId) {
        this.circularId = circularId;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }

    public void setVacancyCount(int vacancyCount) {
        this.vacancyCount = vacancyCount;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "JobCircular{" +
                "circularId='" + circularId + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", department='" + department + '\'' +
                ", ministry='" + ministry + '\'' +
                ", vacancyCount=" + vacancyCount +
                ", submissionDate=" + submissionDate +
                ", deadline=" + deadline +
                ", qualifications='" + qualifications + '\'' +
                ", experience='" + experience + '\'' +
                ", ageLimit='" + ageLimit + '\'' +
                ", postedBy='" + postedBy + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
