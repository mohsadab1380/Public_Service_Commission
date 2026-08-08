package User_2411699_Controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.MalpracticeCase;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MalpracticeController {

    @FXML
    private Label notificationLabel;

    @FXML
    private TableColumn<MalpracticeCase, String> caseIdColumn;

    @FXML
    private TableColumn<MalpracticeCase, String> incidentTypeColumn;

    @FXML
    private TableView<MalpracticeCase> caseTable;

    @FXML
    private TableColumn<MalpracticeCase, String> examCentreColumn;

    @FXML
    private TableColumn<MalpracticeCase, LocalDate> reportDateColumn;

    @FXML
    private Label validationLabel;

    @FXML
    private TableColumn<MalpracticeCase, String> candidateRollColumn;

    @FXML
    private TableColumn<MalpracticeCase, String> candidateNameColumn;

    @FXML
    private Label statusLabel;


    private ArrayList<MalpracticeCase> caseList = new ArrayList<>();
    private MalpracticeCase selectedCase;


    @FXML
    public void initialize() {

        caseIdColumn.setCellValueFactory(new PropertyValueFactory<>("caseId"));
        candidateRollColumn.setCellValueFactory(new PropertyValueFactory<>("candidateRoll"));
        candidateNameColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        incidentTypeColumn.setCellValueFactory(new PropertyValueFactory<>("incidentType"));
        examCentreColumn.setCellValueFactory(new PropertyValueFactory<>("examCentre"));
        reportDateColumn.setCellValueFactory(new PropertyValueFactory<>("reportDate"));

        loadCases();

        caseTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                    selectedCase = newValue;
                    if (newValue != null) {
                        displaySelectedCase(newValue);
                    }
                });
    }
    private void loadCases() {
        try {
            caseList = BinaryFileUtil.readObjects("data/malpractice.txt");
            if (caseList == null) {
                caseList = new ArrayList<>();
            }

            caseTable.setItems(FXCollections.observableArrayList(caseList));
            statusLabel.setText(caseList.size() + " malpractice case(s) loaded.");
        }
        catch (Exception e) {
            caseList = new ArrayList<>();
            statusLabel.setText("Unable to load malpractice cases."
            );
            e.printStackTrace();
        }
    }
    private void displaySelectedCase(MalpracticeCase malpracticeCase) {
        validationLabel.setText("");

        statusLabel.setText("Selected Case: " + malpracticeCase.getCaseId() + " | Status: " + malpracticeCase.getStatus());
        if (malpracticeCase.isAuthorityNotified()) {notificationLabel.setText("Authority already notified.");
        }
        else {
            notificationLabel.setText(
                    "Authority has not been notified.");
        }
    }
    @FXML
    public void onValidateClick(ActionEvent actionEvent) {
        if (selectedCase == null) {validationLabel.setText("Please select a malpractice case.");
            return;
        }
        if (isEmpty(selectedCase.getCaseId())) {
            validationLabel.setText("Case ID is missing.");
            return;
        }
        if (isEmpty(selectedCase.getCandidateRoll())) {
            validationLabel.setText("Candidate roll number is missing.");
            return;
        }
        if (isEmpty(selectedCase.getCandidateName())) {
            validationLabel.setText("Candidate name is missing.");
            return;
        }
        if (isEmpty(selectedCase.getExamCentre())) {
            validationLabel.setText("Exam centre is missing.");
            return;
        }
        if (isEmpty(selectedCase.getIncidentType())) {
            validationLabel.setText("Incident type is missing.");
            return;
        }
        if (selectedCase.getReportDate() == null) {
            validationLabel.setText("Report date is missing.");
            return;
        }
        List<String> evidenceFiles = selectedCase.getEvidenceFiles();

        if (evidenceFiles == null && evidenceFiles.isEmpty()) {
            validationLabel.setText("No evidence files found.");
            return;
        }
        validationLabel.setText("Malpractice case validated successfully.");
        statusLabel.setText("Validation completed for case " + selectedCase.getCaseId());
    }
    @FXML
    public void onNotifyClick(ActionEvent actionEvent) {
        if (selectedCase == null) {
            notificationLabel.setText("Please select a malpractice case first.");
            return;
        }
        if (!validateCase()) {
            return;
        }
        try {
            selectedCase.setAuthorityNotified(true);
            BinaryFileUtil.appendObject("data/malpractice.txt", caseList);
            notificationLabel.setText("Authority notified successfully.");
            statusLabel.setText("Notification sent for case " + selectedCase.getCaseId());
        }
        catch (Exception e) {
            notificationLabel.setText("Failed to notify authority.");
            e.printStackTrace();
        }
    }
    @FXML
    public void onPendingClick(ActionEvent actionEvent) {
        ArrayList<MalpracticeCase> pendingCases =
                new ArrayList<>();
        for (MalpracticeCase malpracticeCase : caseList) {
            if ("Pending".equalsIgnoreCase(malpracticeCase.getStatus())) {
                pendingCases.add(malpracticeCase);
            }
        }
        caseTable.setItems(FXCollections.observableArrayList(pendingCases));
        selectedCase = null;
        validationLabel.setText("");
        notificationLabel.setText("");
        statusLabel.setText(pendingCases.size() + " pending case(s) found.");
    }
    private boolean validateCase() {
        if (selectedCase == null) {return false;
        }
        if (isEmpty(selectedCase.getCaseId())) {
            validationLabel.setText("Case ID is missing."
            );
            return false;
        }
        if (isEmpty(selectedCase.getCandidateRoll())) {
            validationLabel.setText("Candidate roll number is missing.");
            return false;
        }
        if (isEmpty(selectedCase.getCandidateName())) {
            validationLabel.setText("Candidate name is missing.");
            return false;
        }
        if (isEmpty(selectedCase.getExamCentre())) {
            validationLabel.setText("Exam centre is missing.");
            return false;
        }
        if (isEmpty(selectedCase.getIncidentType())) {
            validationLabel.setText("Incident type is missing.");
            return false;
        }
        if (selectedCase.getReportDate() == null) {
            validationLabel.setText("Report date is missing.");
            return false;
        }
        List<String> evidenceFiles = selectedCase.getEvidenceFiles();
        if (evidenceFiles == null && evidenceFiles.isEmpty()) {

            validationLabel.setText("No evidence files available.");
            return false;
        }
        validationLabel.setText("Case information is valid.");
        return true;
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
