package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.ControllerOfExamination;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ScriptEvaluationController {
    @javafx.fxml.FXML
    private TableColumn <ControllerOfExamination, Void>actionColumn;
    @javafx.fxml.FXML
    private Label totalScriptsLabel;
    @javafx.fxml.FXML
    private TableColumn <ControllerOfExamination, String>examinerColumn;
    @javafx.fxml.FXML
    private TableView<ControllerOfExamination> scriptTableView;
    @javafx.fxml.FXML
    private ComboBox<String> examinerComboBox;
    @javafx.fxml.FXML
    private Button sendReminderButton;
    @javafx.fxml.FXML
    private Label assignedLabel;
    @javafx.fxml.FXML
    private ComboBox<String> subjectComboBox;
    @javafx.fxml.FXML
    private Button assignScriptsButton;
    @javafx.fxml.FXML
    private Button trackProgressButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> subjectColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> rollNumberColumn;
    @javafx.fxml.FXML
    private CheckBox autoAssignCheckBox;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn <ControllerOfExamination, String>evaluationStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> scriptIdColumn;
    private ObservableList<ControllerOfExamination> scriptItems = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        subjectComboBox.getItems().addAll("Mathematics", "Physics", "Chemistry", "English");
        examinerComboBox.getItems().addAll("Dr. Ahmed", "Prof. Khan", "Dr. Rahman");
        totalScriptsLabel.setText("2,500");
        assignedLabel.setText("1,800");
        statusLabel.setText("Ready for assignment");

    }


    @javafx.fxml.FXML
    public void handleBack(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/controller-dashboard.fxml", "Dashboard");

    }

    @javafx.fxml.FXML
    public void handleSendReminder(ActionEvent actionEvent) {
        statusLabel.setText(" Reminders sent!");
    }

    @javafx.fxml.FXML
    public void handleTrackProgress(ActionEvent actionEvent) {
        statusLabel.setText(" Progress: 66% completed");
    }


    @javafx.fxml.FXML
    public void handleAssignScripts(ActionEvent actionEvent) {
        statusLabel.setText(" Scripts assigned successfully!");
    }


    public ObservableList<ControllerOfExamination> getScriptItems() {
        return scriptItems;
    }

    public void setScriptItems(ObservableList<ControllerOfExamination> scriptItems) {
        this.scriptItems = scriptItems;
    }
}