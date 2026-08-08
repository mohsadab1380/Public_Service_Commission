package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerOfExaminationController
{
    @javafx.fxml.FXML
    private Label pendingVerificationsLabel;
    @javafx.fxml.FXML
    private Button centerAllocationButton;
    @javafx.fxml.FXML
    private Label totalCandidatesLabel;
    @javafx.fxml.FXML
    private Button verifyCandidatesButton;
    @javafx.fxml.FXML
    private Button examScheduleButton;
    @javafx.fxml.FXML
    private Button approveMarksButton;
    @javafx.fxml.FXML
    private Button logoutButton;
    @javafx.fxml.FXML
    private Label pendingAppealsLabel;
    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private Button manageAppealsButton;
    @javafx.fxml.FXML
    private Button centerLogisticsButton;
    @javafx.fxml.FXML
    private Button publishResultsButton;
    @javafx.fxml.FXML
    private Button scriptEvaluationButton;
    @javafx.fxml.FXML
    private Label totalSchedulesLabel;

    @javafx.fxml.FXML
    public void initialize() {
        welcomeLabel.setText("Welcome, Controller of Examinations");
        totalSchedulesLabel.setText("12");
        totalCandidatesLabel.setText("1,247");
        pendingAppealsLabel.setText("8");
        pendingVerificationsLabel.setText("23");
    }

    @javafx.fxml.FXML
    public void handleApproveMarks(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/approve-marks.fxml", "Approve Marks");

    }

    @javafx.fxml.FXML
    public void handleScriptEvaluation(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/script-evaluation.fxml", "Script Evaluation");
    }

    @javafx.fxml.FXML
    public void handleCenterAllocation(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/center-allocation.fxml", "Center Allocation");
    }

    @javafx.fxml.FXML
    public void handleManageAppeals(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/manage-appeals.fxml", "Manage Appeals");
    }

    @javafx.fxml.FXML
    public void handlePublishResults(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/publish-results.fxml", "Publish Results");
    }

    @javafx.fxml.FXML
    public void handleCenterLogistics(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/center-logistics.fxml", "Center Logistics");
    }

    @javafx.fxml.FXML
    public void handleVerifyCandidates(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/verify-candidates.fxml", "Verify Candidates");
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/controller-dashboard.fxml", "Controller Dashboard");
    }

    @javafx.fxml.FXML
    public void handleExamSchedule(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/exam-schedule.fxml", "Exam Schedule");
    }
}