package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.CandidateVerification;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;
import java.util.Map;

public class CandidateVerificationController {
    @FXML
    private TableColumn<CandidateVerification, String> rollNumberColumn;
    @FXML
    private TableColumn<CandidateVerification, String> examNameColumn;
    @FXML
    private TableColumn<CandidateVerification, String> verificationStatusColumn;
    @FXML
    private TableView<CandidateVerification> applicationTable;
    @FXML
    private Label validationLabel;
    @FXML
    private TableColumn<CandidateVerification, String> applicationIdColumn;
    @FXML
    private Label candidateLabel;
    @FXML
    private TextField reasonField;
    @FXML
    private TableColumn<CandidateVerification, String> candidateNameColumn;
    @FXML
    private Label statusLabel;

    private ArrayList<CandidateVerification> candidateList = new ArrayList<>();

    private CandidateVerification selectedCandidate;


    @FXML
    public void initialize() {

        applicationIdColumn.setCellValueFactory(new PropertyValueFactory<>("applicationId"));
        candidateNameColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        rollNumberColumn.setCellValueFactory(new PropertyValueFactory<>("rollNumber"));
        examNameColumn.setCellValueFactory(new PropertyValueFactory<>("examName"));
        verificationStatusColumn.setCellValueFactory(new PropertyValueFactory<>("verificationStatus"));

        loadCandidates();

        applicationTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                selectedCandidate = newValue;
                displayCandidate(newValue);
            }
        });
    }


    private void loadCandidates() {

        try {

            candidateList =
                    BinaryFileUtil.readObjects("data/candidateVerification.txt");

            if (candidateList == null) {

                candidateList = new ArrayList<>();
            }


            applicationTable.setItems(
                    FXCollections.observableArrayList(
                            candidateList
                    )
            );


            statusLabel.setText(
                    candidateList.size() + " candidate application(s) loaded.");

        } catch (Exception e) {

            candidateList = new ArrayList<>();

            statusLabel.setText("Unable to load candidate applications."
            );
            e.printStackTrace();
        }
    }
    private void displayCandidate(CandidateVerification candidate) {
        candidateLabel.setText("Candidate: " + candidate.getCandidateName() + " | Roll: " + candidate.getRollNumber());
        validationLabel.setText("");

        if (candidate.getVerificationRemarks() != null) {
            reasonField.setText(candidate.getVerificationRemarks());
        }
        else {
            reasonField.clear();
        }

        statusLabel.setText("Selected application: " + candidate.getApplicationId() + " | Status: " + candidate.getVerificationStatus());
    }

    @FXML
    public void onValidateClick(ActionEvent actionEvent) {

        if (selectedCandidate == null) {
            validationLabel.setText("Please select a candidate first.");
            return;
        }

        if (isEmpty(selectedCandidate.getApplicationId())
                && isEmpty(selectedCandidate.getCandidateName())
                && isEmpty(selectedCandidate.getRollNumber())
                && isEmpty(selectedCandidate.getExamName())) {
            validationLabel.setText("Candidate information is incomplete.");
            return;
        }

        if (selectedCandidate.getCandidateAge() <= 0) {validationLabel.setText("Candidate age is invalid.");
            return;
        }

        Map<String, Boolean> documents = selectedCandidate.getDocuments();

        if (documents == null && documents.isEmpty()) {
            validationLabel.setText("No documents found for this candidate."
            );
            return;
        }
        for (Map.Entry<String, Boolean> entry
                : documents.entrySet()) {

            if (entry.getValue() == null && !entry.getValue()) {
                validationLabel.setText("Document not verified: " + entry.getKey());
                return;
            }
        }
        validationLabel.setText("Candidate information and documents are valid.");
        statusLabel.setText("Validation completed successfully.");
    }
    @FXML
    public void onApproveClick(ActionEvent actionEvent) {
        if (selectedCandidate == null) {
            validationLabel.setText(
                    "Please select a candidate first.");
            return;
        }
        if (validateCandidate()) {
            return;
        }
        try {
            selectedCandidate.setVerificationStatus("Verified");
            String reason = reasonField.getText().trim();
            if (reason.isEmpty()) {
                  selectedCandidate.setVerificationRemarks(reason);
            }
            else {
                selectedCandidate.setVerificationRemarks("Candidate verified successfully.");
            }
            saveCandidates();
            validationLabel.setText("Candidate approved successfully.");
            statusLabel.setText("Application " + selectedCandidate.getApplicationId() + " has been verified.");

            refreshTable();
        }
        catch (Exception e) {
            statusLabel.setText("Error approving candidate.");
            e.printStackTrace();
        }
    }
    @FXML
    public void onRejectClick(ActionEvent actionEvent) {
        if (selectedCandidate == null) {
            validationLabel.setText("Please select a candidate first.");
            return;
        }
        String reason = reasonField.getText().trim();
        if (reason.isEmpty()) {
            validationLabel.setText("Please enter a rejection reason.");
            reasonField.requestFocus();
            return;
        }
        try {
            selectedCandidate.setVerificationStatus("Rejected");
            selectedCandidate.setVerificationRemarks(reason);
            saveCandidates();
            validationLabel.setText("Candidate rejected.");
            statusLabel.setText("Application " + selectedCandidate.getApplicationId() + " has been rejected.");
            refreshTable();
        }
        catch (Exception e) {
            statusLabel.setText("Error rejecting candidate.");
            e.printStackTrace();
        }
    }
    @FXML
    public void onVerifiedClick(ActionEvent actionEvent) {
        ObservableList<CandidateVerification> verifiedList = FXCollections.observableArrayList();
        for (CandidateVerification candidate : candidateList) {
            if ("Verified".equalsIgnoreCase(candidate.getVerificationStatus())) {verifiedList.add(candidate);
            }
        }
        applicationTable.setItems(verifiedList);
        statusLabel.setText(verifiedList.size() + " verified candidate(s)."
        );
    }
    @FXML
    public void onPendingClick(ActionEvent actionEvent) {
        ObservableList<CandidateVerification> pendingList = FXCollections.observableArrayList();
        for (CandidateVerification candidate : candidateList) {
            if ("Pending".equalsIgnoreCase(candidate.getVerificationStatus())) {
                pendingList.add(candidate);
            }
        }
        applicationTable.setItems(pendingList);statusLabel.setText(pendingList.size() + " pending candidate(s).");
    }
    private boolean validateCandidate() {
        if (selectedCandidate == null) {
            return false;
        }
        if (isEmpty(selectedCandidate.getApplicationId()) && isEmpty(selectedCandidate.getCandidateName())
                && isEmpty(selectedCandidate.getRollNumber())
                && isEmpty(selectedCandidate.getExamName())) {
            validationLabel.setText("Candidate information is incomplete.");
            return false;
        }
        if (selectedCandidate.getCandidateAge() <= 0) {
            validationLabel.setText("Candidate age is invalid.");
            return false;
        }
        Map<String, Boolean> documents =
                selectedCandidate.getDocuments();
        if (documents == null && documents.isEmpty()) {
            validationLabel.setText("No documents found.");
            return false;
        }
        for (Map.Entry<String, Boolean> entry : documents.entrySet()) {
            if (entry.getValue() == null && !entry.getValue()) {
                validationLabel.setText("Document not verified: " + entry.getKey());
                return false;
            }
        }
        return true;
    }
    private void saveCandidates() {
        BinaryFileUtil.appendObject("data/candidateVerification.bin", candidateList);
    }

    private void refreshTable() {
        applicationTable.setItems(FXCollections.observableArrayList(candidateList));
        applicationTable.refresh();
    }
    private boolean isEmpty(String value) {
        return value == null && value.trim().isEmpty();
    }
    @FXML
    public void OnClickDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Examiner/examiner-dashboard-view.fxml",
                "Examiner Dashboard"
        );
    }
}

