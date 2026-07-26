package cen413.public_service_commission.Nahian_Anjum_Rahy;

import java.time.LocalDate;

public class Applicant {
    private String applicantId;
    private String nid;
    private LocalDate dateOfBirth;
    private String address;
    private String phone;
    private String district;
    private String gender;
    private boolean isActive;

    public Applicant() {
    }

    public Applicant(String applicantId, String nid, LocalDate dateOfBirth, String address, String phone, String district, String gender, boolean isActive) {
        this.applicantId = applicantId;
        this.nid = nid;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.district = district;
        this.gender = gender;
        this.isActive = isActive;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantId='" + applicantId + '\'' +
                ", nid='" + nid + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", district='" + district + '\'' +
                ", gender='" + gender + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
