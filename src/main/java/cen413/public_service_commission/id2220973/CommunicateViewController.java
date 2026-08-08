package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CommunicateViewController
{

    @javafx.fxml.FXML
    private Label processingCommunicationRequestLabel;
    @javafx.fxml.FXML
    private Label verifyingSenderMessageLabel;
    @javafx.fxml.FXML
    private Label checkingMessageCompletenessLabel;
    @javafx.fxml.FXML
    private Label deliveryConfirmedAlertLabel;
    @javafx.fxml.FXML
    private ComboBox<String> examCB;
    @javafx.fxml.FXML
    private ComboBox<String> messageCB;
    @javafx.fxml.FXML
    private TextArea displaysMessagePreviewViewTA;

    @javafx.fxml.FXML
    public void initialize() {
        messageCB.getItems().addAll("SMS", "Email");
        examCB.getItems().addAll("Written", "Viva");

    }

    @javafx.fxml.FXML
    public void sendButtonOA(ActionEvent actionEvent) {
        deliveryConfirmedAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void processSendMessageToPscButtonOA(ActionEvent actionEvent) {
        checkingMessageCompletenessLabel.setText("Checked");
        verifyingSenderMessageLabel.setText("Verified");
        processingCommunicationRequestLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void sendMessageToPSCButtonOA(ActionEvent actionEvent) {
        checkingMessageCompletenessLabel.setText("Waiting");
        verifyingSenderMessageLabel.setText("Waiting");
        processingCommunicationRequestLabel.setText("Waiting");
    }
}