package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MonitorattendanceViewController
{

    @javafx.fxml.FXML
    private TextArea displaysAttendanceSummaryViewTA;
    @javafx.fxml.FXML
    private Label processingAttendanceDataLabel;
    @javafx.fxml.FXML
    private ComboBox<String> examSessionCB;
    @javafx.fxml.FXML
    private Label verifyingCandidateRegistrationRecordsLabel;
    @javafx.fxml.FXML
    private Label attendanceReportAlertLabel;
    @javafx.fxml.FXML
    private Label checkingSessionValidityLabel;

    @javafx.fxml.FXML
    public void initialize() {
        examSessionCB.getItems().addAll("Morning", "Evening");

    }

    @javafx.fxml.FXML
    public void generateAttendanceReportButtonOA(ActionEvent actionEvent) {
        attendanceReportAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void processAttendanceMonitoringButtonOA(ActionEvent actionEvent) {
        checkingSessionValidityLabel.setText("Checked");
        verifyingCandidateRegistrationRecordsLabel.setText("Verified");
        processingAttendanceDataLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void attendanceMonitoringButtonOA(ActionEvent actionEvent) {
        checkingSessionValidityLabel.setText("Waiting");
        verifyingCandidateRegistrationRecordsLabel.setText("Waiting");
        processingAttendanceDataLabel.setText("Waiting");
    }
}