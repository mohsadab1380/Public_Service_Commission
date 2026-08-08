package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.AnswerScript;
import user_2411699_model.QuestionMark;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AssignedScriptsController {

    @FXML
    private TableColumn<AnswerScript, String> examNameColumn;

    @FXML
    private Label validationLabel;

    @FXML
    private TableColumn<AnswerScript, String> candidateRollColumn;

    @FXML
    private TableColumn<AnswerScript, String> subjectColumn;

    @FXML
    private Label statusLabel;

    @FXML
    private Label totalLabel;

    @FXML
    private TableColumn<QuestionMark, Integer> maxMarkColumn;

    @FXML
    private TableView<AnswerScript> scriptTable;

    @FXML
    private TableColumn<QuestionMark, Integer> obtainedMarkColumn;

    @FXML
    private Label candidateLabel;

    @FXML
    private TableColumn<QuestionMark, Integer> questionNoColumn;

    @FXML
    private TableColumn<AnswerScript, String> scriptIdColumn;

    @FXML
    private TableView<QuestionMark> markTable;


    private ArrayList<AnswerScript> scriptList = new ArrayList<>();

    private AnswerScript selectedScript;


    @FXML
    public void initialize() {

        scriptIdColumn.setCellValueFactory(new PropertyValueFactory<>("scriptId"));

        candidateRollColumn.setCellValueFactory(new PropertyValueFactory<>("candidateRoll"));

        examNameColumn.setCellValueFactory(new PropertyValueFactory<>("examName"));

        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));

        loadScripts();
        scriptTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                displayScript(newValue);
            }
        });
    }
    private void loadScripts() {
        try {

            scriptList =
                    BinaryFileUtil.readObjects(
                            "data/answerScript.bin"
                    );

            if (scriptList == null) {
                scriptList = new ArrayList<>();
            }

            ObservableList<AnswerScript> scripts =
                    FXCollections.observableArrayList(scriptList);

            scriptTable.setItems(scripts);

            statusLabel.setText(
                    scriptList.size()
                            + " assigned script(s) loaded."
            );

        } catch (Exception e) {

            scriptList = new ArrayList<>();

            statusLabel.setText(
                    "Unable to load assigned scripts."
            );

            e.printStackTrace();
        }
    }

    private void displayScript(AnswerScript script) {

        selectedScript = script;
        candidateLabel.setText(
                "Candidate: "
                        + script.getCandidateName()
                        + " ("
                        + script.getCandidateRoll()
                        + ")"
        );

        validationLabel.setText("");

        ObservableList<QuestionMark> marks = FXCollections.observableArrayList(script.getQuestionMarks());

        markTable.setItems(marks);
        questionNoColumn.setCellValueFactory(new PropertyValueFactory<>("questionNo"));

        maxMarkColumn.setCellValueFactory(new PropertyValueFactory<>("maxMark"));

        obtainedMarkColumn.setCellValueFactory(new PropertyValueFactory<>("obtainedMark"));

        updateTotal(script);


        // Display current status
        statusLabel.setText(
                "Script selected: "
                        + script.getScriptId()
                        + " | Status: "
                        + script.getStatus()
        );
    }
    private void updateTotal(AnswerScript script) {

        int obtained = script.getTotalMarks();
        int maximum = script.getMaximumMarks();

        totalLabel.setText(
                "Total: "
                        + obtained
                        + " / "
                        + maximum
        );
    }


    @FXML
    public void onValidateClick(ActionEvent actionEvent) {

        if (selectedScript == null) {

            validationLabel.setText(
                    "Please select a script first."
            );

            return;
        }


        List<QuestionMark> questionMarks =
                selectedScript.getQuestionMarks();


        if (questionMarks == null ||
                questionMarks.isEmpty()) {

            validationLabel.setText(
                    "This script has no questions."
            );

            return;
        }
        for (QuestionMark question : questionMarks) {

            int obtained = question.getObtainedMark();
            int maximum = question.getMaxMark();


            // Negative mark
            if (obtained < 0) {

                validationLabel.setText(
                        "Question "
                                + question.getQuestionNo()
                                + ": obtained mark cannot be negative."
                );

                return;
            }


            // Obtained mark greater than maximum
            if (obtained > maximum) {

                validationLabel.setText(
                        "Question "
                                + question.getQuestionNo()
                                + ": obtained mark cannot exceed "
                                + maximum
                                + "."
                );

                return;
            }
            if (maximum < 0) {

                validationLabel.setText(
                        "Question "
                                + question.getQuestionNo()
                                + ": maximum mark is invalid."
                );

                return;
            }
        }
        validationLabel.setText(
                "All marks are valid."
        );


        statusLabel.setText(
                "Validation completed successfully."
        );


        updateTotal(selectedScript);
    }

    @FXML
    public void onSaveClick(ActionEvent actionEvent) {

        if (selectedScript == null) {

            statusLabel.setText(
                    "Please select a script first."
            );

            return;
        }


        // Validate before saving
        if (!validateMarks()) {

            return;
        }


        try {

            // Update script status
            selectedScript.setStatus("Evaluated");

            selectedScript.setSubmissionStatus(
                    "Submitted"
            );
            selectedScript.setEvaluatedAt(
                    LocalDateTime.now()
            );

            selectedScript.setSubmittedAt(
                    LocalDateTime.now()
            );

            BinaryFileUtil.appendObject(
                    "data/answerScript.bin",
                    scriptList
            );

            scriptTable.setItems(
                    FXCollections.observableArrayList(
                            scriptList
                    )
            );

            scriptTable.refresh();
            markTable.setItems(
                    FXCollections.observableArrayList(
                            selectedScript.getQuestionMarks()
                    )
            );

            markTable.refresh();


            validationLabel.setText(
                    "Marks validated successfully."
            );

            statusLabel.setText(
                    "Script saved successfully."
            );


            updateTotal(selectedScript);

        } catch (Exception e) {

            statusLabel.setText(
                    "Error saving script."
            );

            e.printStackTrace();
        }
    }
    private boolean validateMarks() {

        if (selectedScript == null) {
            return false;
        }


        List<QuestionMark> questionMarks =
                selectedScript.getQuestionMarks();


        if (questionMarks == null ||
                questionMarks.isEmpty()) {

            validationLabel.setText(
                    "No question marks found."
            );

            return false;
        }

        for (QuestionMark question : questionMarks) {
            int maximum = question.getMaxMark();
            int obtained = question.getObtainedMark();

            if (maximum < 0) {
                validationLabel.setText("Question " + question.getQuestionNo() + " has an invalid maximum mark.");

                return false;
            }


            if (obtained < 0) {
                validationLabel.setText("Question " + question.getQuestionNo() + ": mark cannot be negative.");
                return false;
            }


            if (obtained > maximum) {
                validationLabel.setText("Question " + question.getQuestionNo() + ": obtained mark (" + obtained + ") exceeds maximum mark (" + maximum + ")."
                );
                return false;
            }
        }
        return true;
    }

    @FXML
    public void OnClickDashboard(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Examiner/Examiner-dashboard-view.fxml",
                "Examiner Dashboard"
        );
    }
}