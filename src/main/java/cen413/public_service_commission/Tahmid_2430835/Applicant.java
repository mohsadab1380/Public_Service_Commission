package cen413.public_service_commission.Tahmid_2430835;

import java.io.Serializable;
import java.time.LocalDate;

public class Applicant implements Serializable {

    private int applicantId;
    private int circularId;
    private String name;
    private String phone;
    private String email;
    private String address;
    private int age;
    private double examResult;
    private String status; // "Applied", "Discrepancy", etc.
    private LocalDate applicationDate;

    public Applicant(int applicantId, int circularId, String name, String phone,
                     String email, String address, int age, double examResult,
                     String status, LocalDate applicationDate) {
        this.applicantId = applicantId;
        this.circularId = circularId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.age = age;
        this.examResult = examResult;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getCircularId() {
        return circularId;
    }

    public void setCircularId(int circularId) {
        this.circularId = circularId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getExamResult() {
        return examResult;
    }

    public void setExamResult(double examResult) {
        this.examResult = examResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantId=" + applicantId +
                ", circularId=" + circularId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", examResult=" + examResult +
                ", status='" + status + '\'' +
                ", applicationDate=" + applicationDate +
                '}';
    }

}
