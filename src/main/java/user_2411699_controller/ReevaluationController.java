package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.ReevaluationRequest;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReevaluationController {
    @FXML
    private Label validationLabel;
    @FXML
    private TableColumn<ReevaluationRequest, String> candidateRollColumn;
    @FXML
    private TableColumn<ReevaluationRequest, String> subjectColumn;
    @FXML
    private Label statusLabel;
    @FXML
    private TableView<ReevaluationRequest> requestTable;
    @FXML
    private TableColumn<ReevaluationRequest, Integer> previousMarksColumn;
    @FXML
    private Label candidateLabel;
    @FXML
    private TableColumn<ReevaluationRequest, String> requestIdColumn;
    @FXML
    private TextField remarksTextField;
    @FXML
    private TextField updatedMarksTextField;
    @FXML
    private ComboBox<String> subjectComboBox;
    @FXML
    private TextField presentMarkTextField;
    @FXML
    private TextField previousMarkTextField;
    @FXML
    private TableColumn<ReevaluationRequest, Integer> PrersentColumn;
    @FXML
    private TextField candidateRollTextField;
    @FXML
    private TextField requestIdTextField;

    private ArrayList<ReevaluationRequest> requestList = new ArrayList<>();

    private ReevaluationRequest selectedRequest;

    @FXML
    public void initialize() {
        subjectComboBox.getItems().addAll("BCS","BCS preliminary","Non Cadre Written");

        requestIdColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        candidateRollColumn.setCellValueFactory(new PropertyValueFactory<>("candidateRoll"));
        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        previousMarksColumn.setCellValueFactory(new PropertyValueFactory<>("previousMarks"));
        PrersentColumn.setCellValueFactory(new PropertyValueFactory<>("updatedMarks"));
        loadRequests();
        requestTable.getItems().addAll(requestList);

    }
    private void loadRequests() {
        try {
            requestList = BinaryFileUtil.readObjects("data/reevaluation.txt");
            if (requestList == null) {
                requestList = new ArrayList<>();
            }
            requestTable.setItems(FXCollections.observableArrayList(requestList));
            loadSubjects();
            statusLabel.setText(requestList.size() + " reevaluation request(s) loaded.");
        }
        catch (Exception e) {
            requestList = new ArrayList<>();
            statusLabel.setText("Unable to load reevaluation requests.");
            e.printStackTrace();
        }
    }
    private void loadSubjects() {ArrayList<String> subjects = new ArrayList<>();
        for (ReevaluationRequest request : requestList) {
            if (request.getSubject() != null
                    && !subjects.contains(request.getSubject())) {
                subjects.add(request.getSubject());
            }
        }
        subjectComboBox.setItems(FXCollections.observableArrayList(subjects));
    }
    private void displayRequest(
            ReevaluationRequest request) {
        requestIdTextField.setText(request.getRequestId());
        candidateRollTextField.setText(request.getCandidateRoll());
        previousMarkTextField.setText(String.valueOf(request.getPreviousMarks()));

        if (request.getUpdatedMarks() != null) {
            presentMarkTextField.setText(String.valueOf(request.getUpdatedMarks()));
            updatedMarksTextField.setText(String.valueOf(request.getUpdatedMarks()));
        }
        else {
            presentMarkTextField.clear();
            updatedMarksTextField.clear();
        }
        subjectComboBox.setValue(request.getSubject());
        if (request.getExaminerRemarks() != null) {
            remarksTextField.setText(request.getExaminerRemarks());
        }
        else {
            remarksTextField.clear();
        }
        candidateLabel.setText("Candidate: " + request.getCandidateName() + " | Roll: " + request.getCandidateRoll());
        validationLabel.setText("");
        statusLabel.setText("Request " + request.getRequestId() + " selected | Status: " + request.getStatus());
    }
    @FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        validationLabel.setText("");
        if (selectedRequest == null) {
            validationLabel.setText("Please select a reevaluation request.");
            return;
        }
        if (requestIdTextField.getText().trim().isEmpty()) {
            validationLabel.setText("Request ID is required.");
            return;
        }
        if (candidateRollTextField.getText().trim().isEmpty()) {
            validationLabel.setText("Candidate roll is required.");
            return;
        }
        if (subjectComboBox.getValue() == null
                && subjectComboBox.getValue().trim().isEmpty()) {
            validationLabel.setText("Please select a subject.");
            return;
        }
        try {
            int previousMarks = Integer.parseInt(previousMarkTextField.getText().trim());
            if (previousMarks < 0) {
                validationLabel.setText("Previous marks cannot be negative.");
                return;
            }
        }
        catch (NumberFormatException e) {
            validationLabel.setText("Previous marks must be a valid number.");
            return;
        }
        if (updatedMarksTextField.getText().trim().isEmpty()) {
            validationLabel.setText("Please enter updated marks.");
            return;
        }
        try {int updatedMarks = Integer.parseInt(updatedMarksTextField.getText().trim());
            if (updatedMarks < 0) {
                validationLabel.setText("Updated marks cannot be negative.");
                return;
            }
            if (updatedMarks > 100) {
                validationLabel.setText("Updated marks cannot exceed 100.");
                return;
            }
        }
        catch (NumberFormatException e) {
            validationLabel.setText("Updated marks must be a valid number.");
            return;
        }
        validationLabel.setText("Reevaluation details verified successfully.");
        statusLabel.setText("Request is ready to save.");
    }
    @FXML
    public void onSaveClick(ActionEvent actionEvent) {
        if (selectedRequest == null) {
            validationLabel.setText("Please select a request first.");
            return;
        }
        if (validateForSave()) {
            return;
        }
        try {
            int updatedMarks = Integer.parseInt(updatedMarksTextField.getText().trim());
            String remarks = remarksTextField.getText().trim();
            selectedRequest.setUpdatedMarks(updatedMarks);
            selectedRequest.setExaminerRemarks(remarks);
            selectedRequest.setStatus("Reevaluated");

            BinaryFileUtil.appendObject("data/reevaluation.txt", requestList);
            requestTable.setItems(FXCollections.observableArrayList(requestList));
            requestTable.refresh();

            presentMarkTextField.setText(String.valueOf(updatedMarks));

            validationLabel.setText("Reevaluation saved successfully.");
            statusLabel.setText("Request "
                            + selectedRequest.getRequestId()
                            + " has been reevaluated.");
        }
        catch (Exception e) {
            statusLabel.setText("Error saving reevaluation.");
            e.printStackTrace();
        }
    }
    private boolean validateForSave() {
        if (requestIdTextField.getText().trim().isEmpty()) {
            validationLabel.setText("Request ID is required.");
            return false;
        }
        if (candidateRollTextField.getText().trim().isEmpty()) {
            validationLabel.setText("Candidate roll is required.");
            return false;
        }
        if (subjectComboBox.getValue() == null && subjectComboBox.getValue().trim().isEmpty()) {
            validationLabel.setText("Subject is required.");
            return false;
        }
        if (updatedMarksTextField.getText().trim().isEmpty()) {
            validationLabel.setText("Updated marks are required.");
            return false;
        }
        try {
            int updatedMarks = Integer.parseInt(updatedMarksTextField.getText().trim());
            if (updatedMarks < 0 &&
                    updatedMarks > 100) {
                validationLabel.setText("Updated marks must be between 0 and 100.");
                return false;
            }
        }
        catch (NumberFormatException e) {
            validationLabel.setText("Updated marks must be a valid number.");
            return false;
        }
        return true;
    }
    @FXML
    public void handleAddandLoad(ActionEvent actionEvent) {
        loadRequests();
        requestIdTextField.clear();
        candidateRollTextField.clear();
        previousMarkTextField.clear();
        presentMarkTextField.clear();
        updatedMarksTextField.clear();
        remarksTextField.clear();
        subjectComboBox.getSelectionModel().clearSelection();
        candidateLabel.setText("");
        validationLabel.setText("");
        statusLabel.setText(requestList.size() + " reevaluation request(s) loaded.");
        selectedRequest = null;
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
