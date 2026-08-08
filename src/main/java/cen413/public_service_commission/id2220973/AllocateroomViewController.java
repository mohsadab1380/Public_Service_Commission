package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AllocateroomViewController
{

    @javafx.fxml.FXML
    private Label allocationConfirmationAlertLabel;
    @javafx.fxml.FXML
    private Label processingCandidateAndRoomAllocationDataLabel;
    @javafx.fxml.FXML
    private ComboBox<String> examSessionCB;
    @javafx.fxml.FXML
    private TextArea roomAllocationListDisplayViewTA;
    @javafx.fxml.FXML
    private Label checkingRoomCapacityInformationLabel;
    @javafx.fxml.FXML
    private Label verifyingRoomAvailabilityForTheSessionLabel;

    @javafx.fxml.FXML
    public void initialize() {
        examSessionCB.getItems().addAll("Morning", "Evening");

    }
    @javafx.fxml.FXML
    public void confirmAllocationButtonOA(ActionEvent actionEvent) {
        allocationConfirmationAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void roomAllocationButtonOA(ActionEvent actionEvent) {
        checkingRoomCapacityInformationLabel.setText("Waiting");
        verifyingRoomAvailabilityForTheSessionLabel.setText("Waiting");
        processingCandidateAndRoomAllocationDataLabel.setText("Waiting");
    }

    @javafx.fxml.FXML
    public void processRoomAllocationButtonOA(ActionEvent actionEvent) {
        checkingRoomCapacityInformationLabel.setText("Checked");
        verifyingRoomAvailabilityForTheSessionLabel.setText("Verified");
        processingCandidateAndRoomAllocationDataLabel.setText("Processed");
    }
}