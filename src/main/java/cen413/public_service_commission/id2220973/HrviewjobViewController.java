package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HrviewjobViewController
{
    @javafx.fxml.FXML
    private TextField recruitmentIdTF;
    @javafx.fxml.FXML
    private ComboBox< String> postNameCB;
    @javafx.fxml.FXML
    private Label screeningConfirmationAlertLabel;
    @javafx.fxml.FXML
    private Label verifyingSubmittedApplicationsLabel;
    @javafx.fxml.FXML
    private Label processingApplicantInformationLabel;
    @javafx.fxml.FXML
    private Label recruitmentIdVerifyCheckLabel;
    @javafx.fxml.FXML
    private TextArea applicantListViewTA;

    @javafx.fxml.FXML
    public void initialize() {
        postNameCB.getItems().addAll("Advisor", "Teacher", "Executive");
    }

    @javafx.fxml.FXML
    public void proceedToScreeningButtonOA(ActionEvent actionEvent) {
        recruitmentIdVerifyCheckLabel.setText("Waiting");
        verifyingSubmittedApplicationsLabel.setText("Waiting");
        processingApplicantInformationLabel.setText("Waiting");
    }

    @javafx.fxml.FXML
    public void reviewApplicationsButtonOA(ActionEvent actionEvent) {
        screeningConfirmationAlertLabel.setText("Enter ID");

    }

    @javafx.fxml.FXML
    public void fetchAndVerifyApplicationsButtonOA(ActionEvent actionEvent) {
        recruitmentIdVerifyCheckLabel.setText("Valid");
        verifyingSubmittedApplicationsLabel.setText("Verified");
        processingApplicantInformationLabel.setText("Processed");
    }

}