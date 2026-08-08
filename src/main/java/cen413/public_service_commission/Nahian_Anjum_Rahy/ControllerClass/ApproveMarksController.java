package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.ControllerOfExamination;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ApproveMarksController
{
    @javafx.fxml.FXML
    private ComboBox<String> examComboBox;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, Void> actionColumn;
    @javafx.fxml.FXML
    private Button searchButton;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, Float> writtenMarksColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, Double> mcqMarksColumn;
    @javafx.fxml.FXML
    private ComboBox<String> subjectComboBox;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExaminationController,Integer> vivaMarksColumn;
    @javafx.fxml.FXML
    private Button rejectSelectedButton;
    @javafx.fxml.FXML
    private Button verifyAllButton;
    @javafx.fxml.FXML
    private Button approveSelectedButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExaminationController,String> candidateNameColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> subjectColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, Float> totalMarksColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, Integer> rollNumberColumn;
    @javafx.fxml.FXML
    private TableColumn<ControllerOfExamination, String> statusColumn;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableView<ControllerOfExamination> marksTableView;
    @javafx.fxml.FXML
    private Button resetButton;

    @javafx.fxml.FXML
    public void initialize() {
        // Setup ComboBoxes
        examComboBox.getItems().addAll("BCS 2026", "BCS 2025", "BCS 2024");
        subjectComboBox.getItems().addAll("Mathematics", "Physics", "Chemistry", "Biology", "English", "Bangla");

        // Set initial status
        statusLabel.setText("Ready for approval");
    }

    // ========== HANDLE SEARCH ==========
    @javafx.fxml.FXML
    private void handleSearch(ActionEvent event) {
        String exam = examComboBox.getValue();
        String subject = subjectComboBox.getValue();

        if (exam == null && subject == null) {
            statusLabel.setText("Please select exam or subject to search");
        } else {
            statusLabel.setText(" Results loaded for: " + (exam != null ? exam : "") +
                    (subject != null ? " - " + subject : ""));
        }
    }

    // ========== HANDLE RESET ==========
    @javafx.fxml.FXML
    private void handleReset(ActionEvent event) {
        examComboBox.setValue(null);
        subjectComboBox.setValue(null);
        statusLabel.setText("Filters cleared - showing all marks");
    }

    // ========== HANDLE VERIFY ALL ==========
    @javafx.fxml.FXML
    private void handleVerifyAll(ActionEvent event) {
        statusLabel.setText(" All marks verified successfully!");

        // Show confirmation alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Verification Complete");
        alert.setHeaderText("All Marks Verified");
        alert.setContentText("All marks have been verified successfully.");
        alert.showAndWait();
    }

    // ========== HANDLE APPROVE SELECTED ==========
    @javafx.fxml.FXML
    private void handleApproveSelected(ActionEvent event) {
        statusLabel.setText("Selected marks approved successfully!");
    }

    // ========== HANDLE REJECT SELECTED ==========
    @javafx.fxml.FXML
    private void handleRejectSelected(ActionEvent event) {
        statusLabel.setText(" Selected marks rejected");
    }

    // ========== HANDLE BACK ==========
    @javafx.fxml.FXML
    private void handleBack(ActionEvent event) {
        MainApp.loadView("/view/user7/controller-dashboard.fxml", "Dashboard");
    }
}