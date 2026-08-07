package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HrmanagevacancyViewController
{

    @javafx.fxml.FXML
    private ComboBox<String> ministryNameCB;
    @javafx.fxml.FXML
    private TextArea vacancyListViewTA;
    @javafx.fxml.FXML
    private Label calculatingAvailablePostsLabel;
    @javafx.fxml.FXML
    private ComboBox<String> departmentNameCB;
    @javafx.fxml.FXML
    private Label departmentExistenceCheckLabel;
    @javafx.fxml.FXML
    private Label verifyingStaffingRecordsLabel;
    @javafx.fxml.FXML
    private Label updateConfirmationAlertLabel;

    @javafx.fxml.FXML
    public void initialize() {
        departmentNameCB.getItems().addAll("Education", "Health", "ICT");
        ministryNameCB.getItems().addAll("Education Ministry", "Health Ministry", "ICT Ministry");
    }

    @javafx.fxml.FXML
    public void updateVacancyStatusButtonOA(ActionEvent actionEvent) {
        calculatingAvailablePostsLabel.setText("Updated");

    }

    @javafx.fxml.FXML
    public void manageVacanciesButtonOA(ActionEvent actionEvent) {
        departmentExistenceCheckLabel.setText("Waiting");
        verifyingStaffingRecordsLabel.setText("Waiting");
        calculatingAvailablePostsLabel.setText("Waiting");
    }

    @javafx.fxml.FXML
    public void searchAndVerifyVacancyButtonOA(ActionEvent actionEvent) {
        departmentExistenceCheckLabel.setText("Okay and Done");
    }
}