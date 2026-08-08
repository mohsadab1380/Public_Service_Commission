package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ReportincidentViewController
{

    @javafx.fxml.FXML
    private ComboBox<String> incidentCB;
    @javafx.fxml.FXML
    private Label verifyingExaminationSessionDetailsLabel;
    @javafx.fxml.FXML
    private Label processingIncidentReportInformationLabel;
    @javafx.fxml.FXML
    private Label submissionConfirmedAlertLabel;
    @javafx.fxml.FXML
    private Label checkingWhetherIncidentInformationIsCompleteLabel;
    @javafx.fxml.FXML
    private TextArea displaysIncidentReportPreviewTA;

    @javafx.fxml.FXML
    public void initialize() {
        incidentCB.getItems().addAll("No", "Yes");

    }

    @javafx.fxml.FXML
    public void submitIncidentReportButtonOA(ActionEvent actionEvent) {
        submissionConfirmedAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void processReportIncidentButtonOA(ActionEvent actionEvent) {
        checkingWhetherIncidentInformationIsCompleteLabel.setText("Checked");
        verifyingExaminationSessionDetailsLabel.setText("Verified");
        processingIncidentReportInformationLabel.setText("Processed");
    }

    @javafx.fxml.FXML
    public void reportIncidentButtonOA(ActionEvent actionEvent) {
        checkingWhetherIncidentInformationIsCompleteLabel.setText("Waiting");
        verifyingExaminationSessionDetailsLabel.setText("Waiting");
        processingIncidentReportInformationLabel.setText("Waiting");
    }
}