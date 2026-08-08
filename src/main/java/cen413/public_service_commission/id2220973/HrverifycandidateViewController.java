package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HrverifycandidateViewController
{
    @javafx.fxml.FXML
    private TextField candidateIdTF;
    @javafx.fxml.FXML
    private Label checkingCandidateIdExistenceLabel;
    @javafx.fxml.FXML
    private Label processingVerificationResultsLabel;
    @javafx.fxml.FXML
    private Label verificationConfirmationAlertLabel;
    @javafx.fxml.FXML
    private Label verifyingQualificationsAgainstPscRulesLabel;
    @javafx.fxml.FXML
    private TextArea candidateEligibilityStatusViewTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveVerificationButtonOA(ActionEvent actionEvent) {
        verificationConfirmationAlertLabel.setText("Verified");
    }

    @javafx.fxml.FXML
    public void checkAndProcessEligibiltyButtonOA(ActionEvent actionEvent) {
        checkingCandidateIdExistenceLabel.setText("Checked");
        verifyingQualificationsAgainstPscRulesLabel.setText("Verified");
        processingVerificationResultsLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void verifyEligibilityButtonOA(ActionEvent actionEvent) {
        checkingCandidateIdExistenceLabel.setText("Waiting");
        verificationConfirmationAlertLabel.setText("Waiting");
    }
}