package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HrgenerateViewController
{

    @javafx.fxml.FXML
    private ComboBox<String> reportPeriodCB;
    @javafx.fxml.FXML
    private Label verifyingRecruitmentRecordsForSelectedPeriodLabel;
    @javafx.fxml.FXML
    private Label processingRecruitmentStatisticsLabel;
    @javafx.fxml.FXML
    private Label exportConfirmationAlertLabel;
    @javafx.fxml.FXML
    private Label checkingReportParametersLabel;
    @javafx.fxml.FXML
    private TextArea recruitmentReportDisplayViewTA;
    @javafx.fxml.FXML
    private ComboBox<String> departmentNameCB;

    @javafx.fxml.FXML
    public void initialize() {
        reportPeriodCB.getItems().addAll("2025", "2026");
        departmentNameCB.getItems().addAll("BBA", "BSC");

    }

    @javafx.fxml.FXML
    public void exportReportButtonOA(ActionEvent actionEvent) {
        exportConfirmationAlertLabel.setText("Exported");
    }

    @javafx.fxml.FXML
    public void generateAndProcessReportButtonOA(ActionEvent actionEvent) {
        checkingReportParametersLabel.setText("Checked");
        verifyingRecruitmentRecordsForSelectedPeriodLabel.setText("Verified");
        processingRecruitmentStatisticsLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void recruitmentReportsButtonOA(ActionEvent actionEvent) {
        checkingReportParametersLabel.setText("Waiting");
        verifyingRecruitmentRecordsForSelectedPeriodLabel.setText("Waiting");
        processingRecruitmentStatisticsLabel.setText("Waiting");
    }
}