package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HrpreparemeritViewController
{
    @javafx.fxml.FXML
    private TextField recruitmentIdTF;
    @javafx.fxml.FXML
    private Label verifyingCandidateScoresWithExamRecordsLabel;
    @javafx.fxml.FXML
    private Label approvalConfirmationAlertLabel;
    @javafx.fxml.FXML
    private Label processingScoresAndRankingCandidatesLabel;
    @javafx.fxml.FXML
    private Label checkingAvailabilityOfAllCandidateMarksLabel;
    @javafx.fxml.FXML
    private ComboBox<String> evaluationCB;
    @javafx.fxml.FXML
    private TextArea meritListDisplayViewTA;

    @javafx.fxml.FXML
    public void initialize() {
        evaluationCB.getItems().addAll("Writing", "Viva");
    }

    @javafx.fxml.FXML
    public void approveMeritListButtonOA(ActionEvent actionEvent) {
        approvalConfirmationAlertLabel.setText("Approved");
    }

    @javafx.fxml.FXML
    public void processAndCreateMeritListButtonOA(ActionEvent actionEvent) {
        checkingAvailabilityOfAllCandidateMarksLabel.setText("Checked");
        verifyingCandidateScoresWithExamRecordsLabel.setText("Verified");
        processingScoresAndRankingCandidatesLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void generateMeritListButtonOA(ActionEvent actionEvent) {
        checkingAvailabilityOfAllCandidateMarksLabel.setText("Waiting");
        verifyingCandidateScoresWithExamRecordsLabel.setText("Waiting");
        processingScoresAndRankingCandidatesLabel.setText("Waiting");
    }
}