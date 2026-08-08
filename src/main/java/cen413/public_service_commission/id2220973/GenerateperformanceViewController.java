package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class GenerateperformanceViewController
{

    @javafx.fxml.FXML
    private ComboBox<String> reportingPeriodCB;
    @javafx.fxml.FXML
    private Label verifyingExaminationRecordsAvailabilityLabel;
    @javafx.fxml.FXML
    private Label checkingReportingPeriodValidityLabel;
    @javafx.fxml.FXML
    private Label downloadableReportFileAlertLabel;
    @javafx.fxml.FXML
    private Label processingExaminationAndAttendanceDataLabel;
    @javafx.fxml.FXML
    private TextArea displaysCentrePerformanceReportTA;

    @javafx.fxml.FXML
    public void initialize() {
        reportingPeriodCB.getItems().addAll("Morning", "Evening");
    }

    @javafx.fxml.FXML
    public void exportReportButtonOA(ActionEvent actionEvent) {
        downloadableReportFileAlertLabel.setText("Exported");
    }

    @javafx.fxml.FXML
    public void processPerformanceReportsButtonOA(ActionEvent actionEvent) {
        checkingReportingPeriodValidityLabel.setText("Checked");
        verifyingExaminationRecordsAvailabilityLabel.setText("Verified");
        processingExaminationAndAttendanceDataLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void performanceReportsButtonOA(ActionEvent actionEvent) {
        checkingReportingPeriodValidityLabel.setText("Waiting");
        verifyingExaminationRecordsAvailabilityLabel.setText("Waiting");
        processingExaminationAndAttendanceDataLabel.setText("Waiting");
    }
}