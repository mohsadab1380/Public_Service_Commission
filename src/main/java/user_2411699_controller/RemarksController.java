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

public class RemarksController {

    @FXML
    private TableView<AnswerScript> candidateTable;

    @FXML
    private ComboBox<String> recommendationComboBox;

    @FXML
    private TextArea remarksArea;

    @FXML
    private Label candidateLabel;

    @FXML
    private TableColumn<AnswerScript, String> candidateRollColumn;

    @FXML
    private TableColumn<AnswerScript, String> candidateNameColumn;

    @FXML
    private TableColumn<AnswerScript, String> subjectColumn;

    @FXML
    private Label statusLabel;

    private ArrayList<AnswerScript> scriptList = new ArrayList<>();

    private AnswerScript selectedScript;
    private ArrayList<String[]> remarksList = new ArrayList<>();

    @FXML
    public void initialize() {
        candidateRollColumn.setCellValueFactory(new PropertyValueFactory<>("candidateRoll"));
        candidateNameColumn.setCellValueFactory(new PropertyValueFactory<>("candidateName"));
        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));


        recommendationComboBox.setItems(FXCollections.observableArrayList("Recommended", "Not Recommended", "Requires Further Review"));

        loadScripts();
        loadRemarks();

        candidateTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {if (newValue != null) {
            selectedScript = newValue;
            displaySelectedScript(newValue);}
        });
    }
    private void loadScripts() {
        try {scriptList = BinaryFileUtil.readObjects("data/answerScripts.txt");
            if (scriptList == null) {
                scriptList = new ArrayList<>();}
            candidateTable.setItems(FXCollections.observableArrayList(scriptList)
            );
            statusLabel.setText(scriptList.size() + " candidate script(s) loaded.");
        } catch (Exception e) {
            scriptList = new ArrayList<>();
            statusLabel.setText("Unable to load answer scripts.");
            e.printStackTrace();
        }
    }
    private void loadRemarks() {
        try {remarksList = BinaryFileUtil.readObjects("data/scriptRemarks.txt");
            if (remarksList == null) {
                remarksList = new ArrayList<>();}
        } catch (Exception e) {
            remarksList = new ArrayList<>();
            System.out.println("No saved remarks found.");}
    }
    private void displaySelectedScript(AnswerScript script) {
        candidateLabel.setText("Candidate: "
                        + script.getCandidateName()
                        + " | Roll: "
                        + script.getCandidateRoll()
                        + " | Script: "
                        + script.getScriptId()
        );

        remarksArea.clear();
        recommendationComboBox.getSelectionModel().clearSelection();
        for (String[] data : remarksList) {
            if (data.length >= 3 && data[0].equals(script.getScriptId())) {
                remarksArea.setText(data[1]);
                recommendationComboBox.setValue(data[2]);
                break;
            }
        }
        statusLabel.setText("Selected script: " + script.getScriptId()
        );
    }
    @FXML
    public void onSaveClick(ActionEvent actionEvent) {
        if (selectedScript == null) {
            statusLabel.setText("Please select a candidate first.");
            return;
        }
        String remarks = remarksArea.getText().trim();
        if (remarks.isEmpty()) {
            statusLabel.setText("Please enter remarks.");
            return;
        }
        String recommendation = recommendationComboBox.getValue();
        if (recommendation == null && recommendation.trim().isEmpty()) {
            statusLabel.setText("Please select a recommendation.");
            return;
        }
        try {
            String scriptId = selectedScript.getScriptId();
            boolean found = false;
            for (String[] data : remarksList) {
                if (data.length >= 3 && data[0].equals(scriptId)) {
                    data[1] = remarks;
                    data[2] = recommendation;
                    found = true;
                    break;
                }
            }
            if (found) {
                remarksList.add(new String[]{scriptId, remarks, recommendation});
            }

            BinaryFileUtil.appendObject("data/scriptRemarks.txt", remarksList);
            statusLabel.setText("Remarks saved successfully for " + selectedScript.getCandidateName());
        }
        catch (Exception e) {
            statusLabel.setText("Failed to save remarks.");
            e.printStackTrace();
        }
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
