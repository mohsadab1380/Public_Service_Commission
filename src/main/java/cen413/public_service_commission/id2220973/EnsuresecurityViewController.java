package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class EnsuresecurityViewController
{

    @javafx.fxml.FXML
    private Label verifyingSecurityStaffAssignmentsLabel;
    @javafx.fxml.FXML
    private Label processingSecurityMonitoringRecordsLabel;
    @javafx.fxml.FXML
    private Label confirmationMessageAlertLabel;
    @javafx.fxml.FXML
    private ComboBox<String> examInfoCB;
    @javafx.fxml.FXML
    private Label checkingMonitoringRequirementsLabel;
    @javafx.fxml.FXML
    private TextArea displaysSecurityStatusDashboardTA;

    @javafx.fxml.FXML
    public void initialize() {
        examInfoCB.getItems().addAll("Written", "Viva");

    }

    @javafx.fxml.FXML
    public void acknowledgeSecurityReportButtonOA(ActionEvent actionEvent) {
        confirmationMessageAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void securityMonitoringButtonOA(ActionEvent actionEvent) {
        checkingMonitoringRequirementsLabel.setText("Waiting");
        verifyingSecurityStaffAssignmentsLabel.setText("Waiting");
        processingSecurityMonitoringRecordsLabel.setText("Waiting");
    }

    @javafx.fxml.FXML
    public void processSecurityMonitoringButtonOA(ActionEvent actionEvent) {
        checkingMonitoringRequirementsLabel.setText("Checked");
        verifyingSecurityStaffAssignmentsLabel.setText("Verified");
        processingSecurityMonitoringRecordsLabel.setText("Processed");
    }
}