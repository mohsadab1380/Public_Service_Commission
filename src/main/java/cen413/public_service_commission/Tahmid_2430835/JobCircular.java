package cen413.public_service_commission.Tahmid_2430835;

import java.io.Serializable;
import java.time.LocalDate;

public class JobCircular implements Serializable {

    private int circularId;
    private String postTitle;
    private String department;
    private int vacancyCount;
    private String jobDescription;
    private String eligibilityCriteria;
    private LocalDate applicationDeadline;
    private int ageLimit;
    private String status = "Pending";
    private LocalDate submissionDate = LocalDate.now();
    private String postedBy = "Auditor";
    private String approvedBy;
    private LocalDate approvalDate;
    private String rejectedBy;
    private String rejectionReason;
    private LocalDate rejectionDate;

    public JobCircular(int circularId, String postTitle, String department, int vacancyCount, int ageLimit, LocalDate applicationDeadline, String jobDescription, String eligibilityCriteria) {
        this.circularId = circularId;
        this.postTitle = postTitle;
        this.department = department;
        this.vacancyCount = vacancyCount;
        this.ageLimit = ageLimit;
        this.applicationDeadline = applicationDeadline;
        this.jobDescription = jobDescription;
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public int getCircularId() {
        return circularId;
    }

    public void setCircularId(int circularId) {
        this.circularId = circularId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getVacancyCount() {
        return vacancyCount;
    }

    public void setVacancyCount(int vacancyCount) {
        this.vacancyCount = vacancyCount;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public LocalDate getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(LocalDate applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedBy(String rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public LocalDate getRejectionDate() {
        return rejectionDate;
    }

    public void setRejectionDate(LocalDate rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    @Override
    public String toString() {
        return "JobCircular{" +
                "circularId='" + circularId + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", department='" + department + '\'' +
                ", vacancyCount=" + vacancyCount +
                ", jobDescription='" + jobDescription + '\'' +
                ", eligibilityCriteria='" + eligibilityCriteria + '\'' +
                ", applicationDeadline=" + applicationDeadline +
                ", ageLimit=" + ageLimit +
                ", status='" + status + '\'' +
                ", submissionDate=" + submissionDate +
                ", postedBy='" + postedBy + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", approvalDate=" + approvalDate +
                ", rejectedBy='" + rejectedBy + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                ", rejectionDate=" + rejectionDate +
                '}';
    }
}
