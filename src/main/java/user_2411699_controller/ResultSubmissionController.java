package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.AnswerScript;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class ResultSubmissionController {

    @FXML
    private TableColumn<AnswerScript, String> examNameColumn;

    @FXML
    private TableColumn<AnswerScript, Integer> obtainedMarksColumn;

    @FXML
    private TableView<AnswerScript> resultTable;

    @FXML
    private TableColumn<AnswerScript, String> candidateRollColumn;

    @FXML
    private TableColumn<AnswerScript, String> candidateNameColumn;

    @FXML
    private TableColumn<AnswerScript, String> subjectColumn;

    @FXML
    private Label statusLabel;


    private ArrayList<AnswerScript> scriptList =
            new ArrayList<>();

    private AnswerScript selectedScript;
    @FXML
    public void initialize() {
        examNameColumn.setCellValueFactory(new PropertyValueFactory<>("examName"));
        candidateRollColumn.setCellValueFactory(new PropertyValueFactory<>("candidateRoll"));
        candidateNameColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));

        obtainedMarksColumn.setCellValueFactory(new PropertyValueFactory<>("totalMarks"));
        loadResults();

        resultTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                selectedScript = newValue;
                displaySelectedResult(newValue);
            }});
    }
    private void loadResults() {

        try {scriptList = BinaryFileUtil.readObjects("data/answerScripts.txt");
            if (scriptList == null) {
                scriptList = new ArrayList<>();
            }
            ArrayList<AnswerScript> evaluatedScripts =
                    new ArrayList<>();
            for (AnswerScript script : scriptList) {
                if (script.getQuestionMarks() != null && script.getQuestionMarks().isEmpty()) {
                    evaluatedScripts.add(script);
                }
            }
            resultTable.setItems(FXCollections.observableArrayList(evaluatedScripts));
            statusLabel.setText(evaluatedScripts.size() + " result(s) loaded.");
        } catch (Exception e) {
            scriptList = new ArrayList<>();
            statusLabel.setText("Unable to load results.");

            e.printStackTrace();
        }
    }
    private void displaySelectedResult(AnswerScript script) {statusLabel.setText("Selected: "
                        + script.getCandidateName()
                        + " | Roll: "
                        + script.getCandidateRoll()
                        + " | Marks: "
                        + script.getTotalMarks()
        );
    }
    @FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        if (selectedScript == null) {
            statusLabel.setText("Please select a result first.");
            return;
        }

        if (isEmpty(selectedScript.getCandidateRoll())) {
            statusLabel.setText("Candidate roll number is missing.");
            return;
        }
        if (isEmpty(selectedScript.getCandidateName())) {
            statusLabel.setText("Candidate name is missing.");
            return;
        }
        if (isEmpty(selectedScript.getExamName())) {
            statusLabel.setText("Exam name is missing.");
            return;
        }
        if (isEmpty(selectedScript.getSubject())) {
            statusLabel.setText("Subject is missing.");
            return;
        }
        if (selectedScript.getQuestionMarks() == null
                && selectedScript.getQuestionMarks().isEmpty()) {
            statusLabel.setText("No marks have been entered for this result.");
            return;
        }
        if (selectedScript.getTotalMarks() < 0) {
            statusLabel.setText("Invalid obtained marks.");
            return;
        }
        if (selectedScript.getTotalMarks()
                > selectedScript.getMaximumMarks()) {

            statusLabel.setText(
                    "Obtained marks cannot exceed maximum marks."
            );
            return;
        }
        statusLabel.setText("Result verified successfully for " + selectedScript.getCandidateName());
    }
    @FXML
    public void onSubmitClick(ActionEvent actionEvent) {
        if (selectedScript == null) {statusLabel.setText("Please select a result first.");
            return;
        }
        if (isResultValid()) {
            return;
        }
        try {
            selectedScript.setStatus(
                    "Submitted"
            );
            BinaryFileUtil.appendObject("data/answerScripts.txt", scriptList);
            resultTable.refresh();
            statusLabel.setText("Result submitted successfully for "+ selectedScript.getCandidateName());
        } catch (Exception e) {
            statusLabel.setText("Failed to submit result.");
            e.printStackTrace();
        }
    }
    @FXML
    public void onLoadClick(ActionEvent actionEvent) {
        selectedScript = null;
        loadResults();
        statusLabel.setText("Results loaded successfully.");
    }
    private boolean isResultValid() {
        if (selectedScript == null) {return false;}
        if (isEmpty(selectedScript.getCandidateRoll())) {
            statusLabel.setText("Candidate roll number is missing.");
            return false;
        }
        if (isEmpty(selectedScript.getCandidateName())) {
            statusLabel.setText("Candidate name is missing.");
            return false;
        }


        if (isEmpty(selectedScript.getExamName())) {
            statusLabel.setText("Exam name is missing.");
            return false;
        }
        if (isEmpty(selectedScript.getSubject())) {
            statusLabel.setText("Subject is missing.");
            return false;
        }
        if (selectedScript.getQuestionMarks() == null
                && selectedScript.getQuestionMarks().isEmpty()) {
            statusLabel.setText("No question marks found.");
            return false;
        }
        if (selectedScript.getTotalMarks() < 0) {
            statusLabel.setText("Invalid obtained marks.");
            return false;
        }
        if (selectedScript.getTotalMarks() > selectedScript.getMaximumMarks()) {
            statusLabel.setText("Obtained marks exceed maximum marks.");
            return false;
        }
        return true;
    }

    private boolean isEmpty(String value) {
        return value == null && value.trim().isEmpty();
    }
    @FXML
    public void ONClickDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Examiner/examiner-dashboard-view.fxml",
                "Examiner Dashboard"
        );
    }
}
