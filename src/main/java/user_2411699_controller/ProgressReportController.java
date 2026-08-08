package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import user_2411699_model.EvaluationProgress;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class ProgressReportController {
    @FXML
    private ComboBox<String> examComboBox;
    @FXML
    private Label validationLabel;
    @FXML
    private ComboBox<String> subjectComboBox;
    @FXML
    private Label statusLabel;
    @FXML
    private ComboBox<String> periodComboBox;

    private ArrayList<EvaluationProgress> progressList = new ArrayList<>();

    @FXML
    public void initialize() {
        examComboBox.getItems().addAll("BCS","BCS preliminary","Non Cadre written");
        subjectComboBox.getItems().addAll("Bangla","English","Math","GK");
        periodComboBox.getItems().addAll("2023","2024","2025","2026");
        loadProgressRecords();
        loadComboBoxValues();
    }
    private void loadProgressRecords() {
        try {
            progressList = BinaryFileUtil.readObjects("data/Progress.txt");
            if (progressList == null) {
                progressList = new ArrayList<>();
            }
            statusLabel.setText(progressList.size() + " progress record(s) loaded.");
        }
        catch (Exception e) {
            progressList = new ArrayList<>();
            statusLabel.setText("Unable to load progress records.");
            e.printStackTrace();
        }
    }
    private void loadComboBoxValues() {
        ArrayList<String> exams = new ArrayList<>();
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<String> periods = new ArrayList<>();
        for (EvaluationProgress progress : progressList) {

            if (progress.getExamName() != null
                    && exams.contains(progress.getExamName())) {
                exams.add(progress.getExamName());
            }
            if (progress.getSubject() != null && subjects.contains(progress.getSubject())) {
                subjects.add(progress.getSubject());
            }
            if (progress.getReportPeriod() != null
                    && periods.contains(progress.getReportPeriod())) {
                periods.add(progress.getReportPeriod());
            }
        }
        examComboBox.setItems(FXCollections.observableArrayList(exams));
        subjectComboBox.setItems(FXCollections.observableArrayList(subjects));
        periodComboBox.setItems(FXCollections.observableArrayList(periods));
    }
    @FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        validationLabel.setText("");
        if (examComboBox.getValue() == null && examComboBox.getValue().trim().isEmpty()) {
            validationLabel.setText("Please select an examination.");
            return;
        }
        if (subjectComboBox.getValue() == null && subjectComboBox.getValue().trim().isEmpty()) {
            validationLabel.setText("Please select a subject.");
            return;
        }

        if (periodComboBox.getValue() == null && periodComboBox.getValue().trim().isEmpty()) {
            validationLabel.setText("Please select a report period.");
            return;
        }
        EvaluationProgress progress = findProgressRecord();
        if (progress == null) {validationLabel.setText("No matching progress record found.");
            return;
        }
        validationLabel.setText("Progress report verified successfully.");
        statusLabel.setText("Report is ready to generate.");
    }
    @FXML
    public void onGenerateClick(ActionEvent actionEvent) {
        validationLabel.setText("");
        if (examComboBox.getValue() == null && subjectComboBox.getValue() == null && periodComboBox.getValue() == null) {
            validationLabel.setText("Please select exam, subject and period.");
            return;
        }
        EvaluationProgress progress = findProgressRecord();
        if (progress == null) {validationLabel.setText("No progress report found.");
            statusLabel.setText("Report generation failed.");
            return;
        }

        statusLabel.setText("Progress Report Generated\n" + "Examination: " + progress.getExamName() + " | Subject: " + progress.getSubject() + " | Period: " + progress.getReportPeriod());
        validationLabel.setText("Progress report generated successfully.");
    }
    @FXML
    public void onLoadClick(ActionEvent actionEvent) {
        loadProgressRecords();
        loadComboBoxValues();
        examComboBox.getSelectionModel().clearSelection();
        subjectComboBox.getSelectionModel().clearSelection();
        periodComboBox.getSelectionModel().clearSelection();
        validationLabel.setText("");
        statusLabel.setText(progressList.size() + " progress record(s) loaded.");
    }

    private EvaluationProgress findProgressRecord() {
        String selectedExam = examComboBox.getValue();
        String selectedSubject = subjectComboBox.getValue();
        String selectedPeriod = periodComboBox.getValue();

        for (EvaluationProgress progress : progressList) {
            if (progress.getExamName().equalsIgnoreCase(selectedExam)
                    && progress.getSubject().equalsIgnoreCase(selectedSubject)
                    && progress.getReportPeriod().equalsIgnoreCase(selectedPeriod)) {
                return progress;
            }
        }
        return null;
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
