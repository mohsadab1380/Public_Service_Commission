package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ManagecenterViewController
{
    @javafx.fxml.FXML
    private TextField centerCodeTF;
    @javafx.fxml.FXML
    private Label centreConfirmationAlertLabel;
    @javafx.fxml.FXML
    private DatePicker examDateDP;
    @javafx.fxml.FXML
    private Label retrievingCentreOperationalDataAndSchedulesLabel;
    @javafx.fxml.FXML
    private Label checkingRequiredInputFieldsLabel;
    @javafx.fxml.FXML
    private TextArea centreOperationDetailsViewTA;
    @javafx.fxml.FXML
    private Label verifyingCentreRegistrationForSelectedExamLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveCentrePlanButtonOA(ActionEvent actionEvent) {
        centreConfirmationAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void checkAndRetrieveOperationsButtonOA(ActionEvent actionEvent) {
        checkingRequiredInputFieldsLabel.setText("Checked");
        verifyingCentreRegistrationForSelectedExamLabel.setText("Verified");
        retrievingCentreOperationalDataAndSchedulesLabel.setText("Retrieved");
    }

    @javafx.fxml.FXML
    public void manageCentreOperationsButtonOA(ActionEvent actionEvent) {
        checkingRequiredInputFieldsLabel.setText("Waiting");
        verifyingCentreRegistrationForSelectedExamLabel.setText("Waiting");
        retrievingCentreOperationalDataAndSchedulesLabel.setText("Waiting");
    }
}