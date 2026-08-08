package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HrnotifycandidateViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> notificationTypeCB;
    @javafx.fxml.FXML
    private ComboBox<String> candidateGroupCB;
    @javafx.fxml.FXML
    private TextArea notificationsPreviewDisplayTA;
    @javafx.fxml.FXML
    private Label checkingCompletenessOfNotificationDetailsLabel;
    @javafx.fxml.FXML
    private Label deliveryConfirmationAlertLabel;
    @javafx.fxml.FXML
    private TextArea notificationMessageContentTA;
    @javafx.fxml.FXML
    private Label verifyingCandidateContactInformationLabel;
    @javafx.fxml.FXML
    private Label processingAndPreparingMessagesLabel;

    @javafx.fxml.FXML
    public void initialize() {
        notificationTypeCB.getItems().addAll("Email", "SMS");
        candidateGroupCB.getItems().addAll("Bsc in CSE", "BBA", "Bsc in IT");
    }

    @javafx.fxml.FXML
    public void sendNotificationButtonOA(ActionEvent actionEvent) {
        deliveryConfirmationAlertLabel.setText("Delivered");
    }

    @javafx.fxml.FXML
    public void processAndPreviewNotificationButtonOA(ActionEvent actionEvent) {
        checkingCompletenessOfNotificationDetailsLabel.setText("Checked");
        verifyingCandidateContactInformationLabel.setText("Verified");
        processingAndPreparingMessagesLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void sendCandidateNotificationsButtonOA(ActionEvent actionEvent) {
        checkingCompletenessOfNotificationDetailsLabel.setText("Waiting");
        verifyingCandidateContactInformationLabel.setText("Waiting");
    }
}