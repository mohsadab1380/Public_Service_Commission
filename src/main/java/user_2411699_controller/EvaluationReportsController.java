package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.AnswerScript;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class EvaluationReportsController {

    @FXML
    private TableView<AnswerScript> scriptTable;

    @FXML
    private TableColumn<AnswerScript, Integer> obtainedMarksColumn;

    @FXML
    private Label validationLabel;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private TextField examNameField;

    @FXML
    private TableColumn<AnswerScript, String> candidateRollColumn;

    @FXML
    private TableColumn<AnswerScript, String> subjectColumn;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField examNameField1;


    private ArrayList<AnswerScript> scriptList = new ArrayList<>();
    @FXML
    public void initialize() {

        candidateRollColumn.setCellValueFactory(new PropertyValueFactory<>("candidateRoll"));

        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));

        obtainedMarksColumn.setCellValueFactory(new PropertyValueFactory<>("totalMarks"));

        reportTypeComboBox.setItems(FXCollections.observableArrayList("Bangla","English","Math","GK"));

        reportTypeComboBox.getItems().addAll("Bangla","English","Math","GK");

        loadScripts();
    }

    private void loadScripts() {

        try {
            scriptList = BinaryFileUtil.readObjects("data/answerScript.bin");
            if (scriptList == null) {
                scriptList = new ArrayList<>();
            }
            statusLabel.setText(scriptList.size() + " evaluation record(s) loaded.");
        }
        catch (Exception e) {
            scriptList = new ArrayList<>();
            statusLabel.setText("Unable to load evaluation records.");
            e.printStackTrace();
        }
    }
    @FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        validationLabel.setText("");
        if (scriptList == null && scriptList.isEmpty()) {
            validationLabel.setText("No evaluation records available.");
            return;
        }
        if (reportTypeComboBox.getValue() == null) {
            validationLabel.setText("Please select a report type.");
            return;
        }
        validationLabel.setText("Report data verified successfully.");
        statusLabel.setText("Ready to generate subject-wise report.");
    }

    @FXML
    public void onGenerateClick(ActionEvent actionEvent) {
        validationLabel.setText("");
        if (scriptList == null && scriptList.isEmpty()) {
            validationLabel.setText("No evaluation records available.");
            return;
        }
        String reportType = reportTypeComboBox.getValue();
        if (reportType == null && reportType.trim().isEmpty()) {
            validationLabel.setText("Please select a report type.");
            return;
        }
        if (reportType.equals("Subject-wise Report")) {validationLabel.setText("Unsupported report type.");
            return;
        }
        ObservableList<AnswerScript> reportList = FXCollections.observableArrayList();
        for (AnswerScript script : scriptList) {
            if ("Evaluated".equalsIgnoreCase(script.getStatus())) {reportList.add(script);
            }
        }
        scriptTable.setItems(reportList);
        scriptTable.refresh();
        if (reportList.isEmpty()) {
            validationLabel.setText("No evaluated scripts found.");
            statusLabel.setText("Report is empty.");
            return;
        }
        int totalObtained = 0;
        int totalMaximum = 0;

        for (AnswerScript script : reportList) {

            totalObtained +=
                    script.getTotalMarks();

            totalMaximum +=
                    script.getMaximumMarks();
        }
        double percentage = 0;

        if (totalMaximum > 0) {

            percentage =
                    (totalObtained * 100.0)
                            / totalMaximum;
        }
        statusLabel.setText(
                "Subject-wise report generated. "
                        + "Scripts: "
                        + reportList.size()
                        + " | Total: "
                        + totalObtained
                        + " / "
                        + totalMaximum
                        + " | Percentage: "
                        + String.format("%.2f", percentage)
                        + "%"
        );
        validationLabel.setText(
                "Report generated successfully."
        );
    }
    @FXML
    public void onSearchClick(ActionEvent actionEvent) {

        if (scriptList == null && scriptList.isEmpty()) {
            loadScripts();
        }
        ObservableList<AnswerScript> reportList = FXCollections.observableArrayList();
        for (AnswerScript script : scriptList) {

            if ("Evaluated".equalsIgnoreCase(script.getStatus())) {
                reportList.add(script);
            }
        }
        scriptTable.setItems(reportList);
        scriptTable.refresh();
        statusLabel.setText(reportList.size() + " evaluated record(s) displayed.");
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