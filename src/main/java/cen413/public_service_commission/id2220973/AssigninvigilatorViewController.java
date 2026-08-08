package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AssigninvigilatorViewController
{

    @javafx.fxml.FXML
    private TextArea displaysInvigilatoAssignmentListViewTA;
    @javafx.fxml.FXML
    private Label assignmentConfirmationAlertLabel;
    @javafx.fxml.FXML
    private ComboBox<String> examHallCB;
    @javafx.fxml.FXML
    private Label verifyingInvigilatorsEligibilityAndScheduleConflictsLabel;
    @javafx.fxml.FXML
    private Label processingAssignmentDataLabel;
    @javafx.fxml.FXML
    private Label checkingWhetherEnoughInvigilatorAreAvailableLabel;

    @javafx.fxml.FXML
    public void initialize() {
        examHallCB.getItems().addAll("Dhaka", "Comilla", "Ctg");


    }


    @javafx.fxml.FXML
    public void finalizeAssignmentButtonOA(ActionEvent actionEvent) {
        assignmentConfirmationAlertLabel.setText("Confirmed");
    }

    @javafx.fxml.FXML
    public void AssignInvigilatorsButtonOA(ActionEvent actionEvent) {
        checkingWhetherEnoughInvigilatorAreAvailableLabel.setText("Waiting");
        verifyingInvigilatorsEligibilityAndScheduleConflictsLabel.setText("Waiting");
        processingAssignmentDataLabel.setText("Waiting");
    }

    @javafx.fxml.FXML
    public void processAssignInvigilatorsButtonOA(ActionEvent actionEvent) {
        checkingWhetherEnoughInvigilatorAreAvailableLabel.setText("Checked");
        verifyingInvigilatorsEligibilityAndScheduleConflictsLabel.setText("Verified");
        processingAssignmentDataLabel.setText("Processed");
    }
}