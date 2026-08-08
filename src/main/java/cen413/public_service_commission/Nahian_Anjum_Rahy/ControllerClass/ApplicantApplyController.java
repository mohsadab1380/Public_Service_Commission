package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.Application;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.ControllerOfExamination;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.logging.FileHandler;

public class ApplicantApplyController
{
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, Void> actionColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination,String> postTitleColumn;
    @javafx.fxml.FXML
    private TextField hscGpaField;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> circularIdColumn;
    @javafx.fxml.FXML
    private Button submitApplicationButton;
    @javafx.fxml.FXML
    private TextField circularIdField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableView<ControllerOfExamination> circularTableView;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination,String> deadlineColumn;
    @javafx.fxml.FXML
    private TextField graduationGpaField;
    @javafx.fxml.FXML
    private ComboBox<String> examCenterComboBox;
    @javafx.fxml.FXML
    private TextField sscGpaField;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> departmentColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination,Integer> vacancyColumn;
    @javafx.fxml.FXML
    private Button clearFormButton;
    @javafx.fxml.FXML
    private TextField postTitleField;
    @javafx.fxml.FXML
    private Button saveDraftButton;

    @javafx.fxml.FXML
    public void initialize() {
        examCenterComboBox.getItems().addAll("Dhaka", "Chittagong", "Rajshahi", "Khulna", "Barishal", "Sylhet");
        circularIdColumn.setCellValueFactory(new PropertyValueFactory<>("circularId"));
        postTitleColumn.setCellValueFactory(new PropertyValueFactory<>("postTitle"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        vacancyColumn.setCellValueFactory(new PropertyValueFactory<>("vacancy"));
        deadlineColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));

        loadCirculars();
        statusLabel.setText("Ready to apply");
    }
    private void loadCirculars() {
        // Sample data - In real app, load from database
        ObservableList<Application> items = FXCollections.observableArrayList();
        items.add(new Application("CIRC-001", "Assistant Professor", "Computer Science", 5, "30 June 2026"));
        items.add(new Application ("CIRC-002", "Lecturer", "Physics", 10, "15 July 2026"));
        items.add(new Application("CIRC-003", "Research Associate", "Chemistry", 3, "20 August 2026"));
        circularTableView.setItems(items);
    }

    @javafx.fxml.FXML
    public void handleBack(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-dashboard.fxml", "Dashboard");

    }

    @javafx.fxml.FXML
    public void handleClearForm(ActionEvent actionEvent) {
        sscGpaField.clear();
        hscGpaField.clear();
        graduationGpaField.clear();
        examCenterComboBox.setValue(null);
        statusLabel.setText("Form cleared");
    }

    @javafx.fxml.FXML
    public void handleSubmitApplication(ActionEvent actionEvent) {
        if (sscGpaField.getText().isEmpty() || hscGpaField.getText().isEmpty()) {
            statusLabel.setText(" Please fill all required fields");
            return;
        }

        String appId = "APP-" + System.currentTimeMillis();
        String applicantId = "APP-2026-001";
        String circularId = "CIRC-001";
        String postTitle = "Assistant Professor";
        String department = "Computer Science";
        String preferredCenter = examCenterComboBox.getValue() != null ? examCenterComboBox.getValue() : "Dhaka";

        // Create Application
        Application application = new Application(
                appId, applicantId, circularId, postTitle, department,
                preferredCenter,
                sscGpaField.getText(), "Dhaka College",
                hscGpaField.getText(), "Dhaka College",
                "BSc", graduationGpaField.getText(), "BUET"
        );

        FileHandler.saveApplication(application);

        statusLabel.setText("✅ Application submitted! ID: " + appId);
    }

}

