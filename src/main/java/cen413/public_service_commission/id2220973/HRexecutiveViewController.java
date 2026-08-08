package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HRexecutiveViewController
{
    @javafx.fxml.FXML
    private Label creatingRecruitmentScheduleLabel;
    @javafx.fxml.FXML
    private Label confirmationMessageAlertLabel;
    @javafx.fxml.FXML
    private TextField postNameTF;
    @javafx.fxml.FXML
    private TextField numberOfVacanciesTF;
    @javafx.fxml.FXML
    private AnchorPane postNameTextF;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private Label checkingMandatoryFieldsLabel;
    @javafx.fxml.FXML
    private TextArea recruitmentSummaryViewTA;
    @javafx.fxml.FXML
    private Label checkingDuplicateRecruitmentLabel;
    @javafx.fxml.FXML
    private TextField qualificationTF;

    @javafx.fxml.FXML
    public void initialize() {
        departmentCB.getItems().addAll("Public Works Department (PWD)", "Education Ministry", "Heath and Family")
    }

    @javafx.fxml.FXML
    public void verifyAndProcessDetailsButtonOA(ActionEvent actionEvent) {
        checkingDuplicateRecruitmentLabel.setText("No active cycle");
        checkingMandatoryFieldsLabel.setText("Passed");
        creatingRecruitmentScheduleLabel.setText("Done");
    }

    @javafx.fxml.FXML
    public void startRecruittmentCycleButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmRecruitmentButtonOA(ActionEvent actionEvent) {
    }
}