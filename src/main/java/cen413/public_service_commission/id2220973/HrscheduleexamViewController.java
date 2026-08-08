package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HrscheduleexamViewController
{

    @javafx.fxml.FXML
    private TextArea examinationScheduleDisplayViewTA;
    @javafx.fxml.FXML
    private Label verifyingVenueAvailabityAndScheduleConflictsLabel;
    @javafx.fxml.FXML
    private DatePicker examDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> examVenueCB;
    @javafx.fxml.FXML
    private ComboBox<String> examSessionCB;
    @javafx.fxml.FXML
    private Label processingExaminationScheduleDataLabel;
    @javafx.fxml.FXML
    private Label publicationConfirmationAlertLabel;
    @javafx.fxml.FXML
    private Label checkingCompletenessOfSchedulingInfoLabel;
    @javafx.fxml.FXML
    private ComboBox<String> examCenterCB;

    @javafx.fxml.FXML
    public void initialize() {
        examVenueCB.getItems().addAll("Dhaka", "Comilla", "Ctg");
        examCenterCB.getItems().addAll("Dhaka", "Comilla", "Ctg");
        examSessionCB.getItems().addAll("Morning", "Night");
    }

    @javafx.fxml.FXML
    public void publishScheduleButtonOA(ActionEvent actionEvent) {
        publicationConfirmationAlertLabel.setText("Published");
    }

    @javafx.fxml.FXML
    public void verifyAndProcessScheduleButtonOA(ActionEvent actionEvent) {
        checkingCompletenessOfSchedulingInfoLabel.setText("Checked");
        verifyingVenueAvailabityAndScheduleConflictsLabel.setText("Verified");
        publicationConfirmationAlertLabel.setText("Published");
    }

    @javafx.fxml.FXML
    public void scheduleExaminationButtonOA(ActionEvent actionEvent) {
        checkingCompletenessOfSchedulingInfoLabel.setText("Waiting");
    }
}