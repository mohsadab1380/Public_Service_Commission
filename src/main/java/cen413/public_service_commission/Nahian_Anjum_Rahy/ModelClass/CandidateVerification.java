package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDateTime;

public class CandidateVerification {
    private String verificationId;
    private String applicationId;
    private String nid;
    private LocalDateTime verificationDate;
    private String nidVerificationStatus; // VALID, INVALID, PENDING
    private String eligibilityStatus; // ELIGIBLE, INELIGIBLE, PENDING
    private String photoMatch; // YES, NO
    private String reason; // If ineligible
    private String verifiedBy;

    public CandidateVerification() {
    }

    public CandidateVerification(String verificationId, String applicationId, String nid, LocalDateTime verificationDate, String nidVerificationStatus, String eligibilityStatus, String photoMatch, String reason, String verifiedBy) {
        this.verificationId = verificationId;
        this.applicationId = applicationId;
        this.nid = nid;
        this.verificationDate = verificationDate;
        this.nidVerificationStatus = nidVerificationStatus;
        this.eligibilityStatus = eligibilityStatus;
        this.photoMatch = photoMatch;
        this.reason = reason;
        this.verifiedBy = verifiedBy;
    }

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public LocalDateTime getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(LocalDateTime verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getNidVerificationStatus() {
        return nidVerificationStatus;
    }

    public void setNidVerificationStatus(String nidVerificationStatus) {
        this.nidVerificationStatus = nidVerificationStatus;
    }

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public String getPhotoMatch() {
        return photoMatch;
    }

    public void setPhotoMatch(String photoMatch) {
        this.photoMatch = photoMatch;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    @Override
    public String toString() {
        return "CandidateVerification{" +
                "verificationId='" + verificationId + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", nid='" + nid + '\'' +
                ", verificationDate=" + verificationDate +
                ", nidVerificationStatus='" + nidVerificationStatus + '\'' +
                ", eligibilityStatus='" + eligibilityStatus + '\'' +
                ", photoMatch='" + photoMatch + '\'' +
                ", reason='" + reason + '\'' +
                ", verifiedBy='" + verifiedBy + '\'' +
                '}';
    }
}
