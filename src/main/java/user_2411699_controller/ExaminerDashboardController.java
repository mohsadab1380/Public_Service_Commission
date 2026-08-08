package User_2411699_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import util.SceneSwitcher;

public class ExaminerDashboardController {

    @FXML
    private Label userLabel;

    @FXML
    private Label assignedSummaryLabel;

    @FXML
    private BorderPane dashboardPane;

    @FXML
    public void initialize() {
        userLabel.setText("Welcome, Examiner");
        assignedSummaryLabel.setText("Assigned Scripts: null");
    }

    @FXML
    public void onCandidateVerificationClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/candidate-verification-view.fxml",
                "Candidate Verification"
        );
    }

    @FXML
    public void onReevaluationClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/reevaluation-view.fxml",
                "Re-evaluation"
        );
    }

    @FXML
    public void onResultSubmissionClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/result-submission-view.fxml",
                "Result Submission"
        );
    }

    @FXML
    public void onAssignedScriptsClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/assigned-script-view.fxml",
                "Assigned Scripts"
        );
    }

    @FXML
    public void onMalpracticeClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/malpractice-view.fxml",
                "Malpractice Reports"
        );
    }

    @FXML
    public void onRemarksClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/remarks-view.fxml",
                "Remarks"
        );
    }

    @FXML
    public void onEvaluationReportsClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/reevaluation-view.fxml",
                "Evaluation Reports"
        );
    }

    @FXML
    public void onProgressReportClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/Examiner/progress-report-view.fxml",
                "Progress Report"
        );
    }

    @FXML
    public void onLogOutClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/login-view.fxml",
                "Login"
        );
    }
}
