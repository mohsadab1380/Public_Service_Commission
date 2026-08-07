package cen413.public_service_commission.id2220973;

import java.time.LocalDate;

public class Candidate {
    private int candidateID,recruitmentID,nidNumber;
    private String name,parentsName,gender,qualification;
    private LocalDate dob;

    public Candidate(int candidateID, int recruitmentID, int nidNumber, String name, String parentsName, String gender, String qualification, LocalDate dob) {
        this.candidateID = candidateID;
        this.recruitmentID = recruitmentID;
        this.nidNumber = nidNumber;
        this.name = name;
        this.parentsName = parentsName;
        this.gender = gender;
        this.qualification = qualification;
        this.dob = dob;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public int getRecruitmentID() {
        return recruitmentID;
    }

    public void setRecruitmentID(int recruitmentID) {
        this.recruitmentID = recruitmentID;
    }

    public int getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(int nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateID=" + candidateID +
                ", recruitmentID=" + recruitmentID +
                ", nidNumber=" + nidNumber +
                ", name='" + name + '\'' +
                ", parentsName='" + parentsName + '\'' +
                ", gender='" + gender + '\'' +
                ", qualification='" + qualification + '\'' +
                ", dob=" + dob +
                '}';
    }
}
