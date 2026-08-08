package cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;

import java.time.LocalDate;

public class Applicant {
    private String applicantId;
    private String nid;
    private LocalDate dateOfBirth;
    private String address;
    private String phone;
    private String district;
    private String gender;
    private String level; // SSC, HSC, GRADUATION, POST_GRADUATION
    private String degree;
    private float gpa;
    private String institution;
    private int passingYear;
    private String board; // For Bangladesh education system
    private boolean isActive;

    public Applicant() {
    }

    public Applicant(String applicantId, String nid, LocalDate dateOfBirth, String address, String phone, String district, String gender, String level, String degree, float gpa, String institution, int passingYear, String board, boolean isActive) {
        this.applicantId = applicantId;
        this.nid = nid;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.district = district;
        this.gender = gender;
        this.level = level;
        this.degree = degree;
        this.gpa = gpa;
        this.institution = institution;
        this.passingYear = passingYear;
        this.board = board;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
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
                ", level='" + level + '\'' +
                ", degree='" + degree + '\'' +
                ", gpa=" + gpa +
                ", institution='" + institution + '\'' +
                ", passingYear=" + passingYear +
                ", board='" + board + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
