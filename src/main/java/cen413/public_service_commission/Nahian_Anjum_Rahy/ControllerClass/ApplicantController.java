package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class ApplicantController
{
    @javafx.fxml.FXML
    private Label profileProgressLabel;
    @javafx.fxml.FXML
    private Button paymentButton;
    @javafx.fxml.FXML
    private Label pendingPaymentsLabel;
    @javafx.fxml.FXML
    private Label admitCardsLabel;
    @javafx.fxml.FXML
    private Button statusButton;
    @javafx.fxml.FXML
    private Button activeCircularsButton;
    @javafx.fxml.FXML
    private Button admitCardButton;
    @javafx.fxml.FXML
    private Button logoutButton;
    @javafx.fxml.FXML
    private ProgressBar profileProgressBar;
    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private Button appealButton;
    @javafx.fxml.FXML
    private Label totalApplicationsLabel;
    @javafx.fxml.FXML
    private Label applicantIdLabel;
    @javafx.fxml.FXML
    private Label appealsLabel;
    @javafx.fxml.FXML
    private Button resultButton;
    @javafx.fxml.FXML
    private Button profileButton;
    @javafx.fxml.FXML
    private Button notificationsButton;

    @javafx.fxml.FXML
    public void initialize() {
        welcomeLabel.setText("Welcome, Nahian ");

        applicantIdLabel.setText("ID: APP-2026-004523");

        profileProgressBar.setProgress(0.85);
        profileProgressLabel.setText("85%");

        totalApplicationsLabel.setText("5");
        pendingPaymentsLabel.setText("2");
        admitCardsLabel.setText("3");
        appealsLabel.setText("1");
    }

    @javafx.fxml.FXML
    public void handleActiveCirculars(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-apply.fxml", "Active Circulars");
    }

    @javafx.fxml.FXML
    public void handleApplicationStatus(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-status.fxml", "Application Status");

    }

    @javafx.fxml.FXML
    public void handleAdmitCard(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-admitcard.fxml", "Admit Card");

    }

    @javafx.fxml.FXML
    public void handleResult(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-result.fxml", "Exam Results");
    }

    @javafx.fxml.FXML
    public void handlePayment(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-payment.fxml", "Make Payment");
    }

    @javafx.fxml.FXML
    public void handleProfile(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-profile.fxml", "My Profile");
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/applicant-dashboard.fxml", "Applicant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleNotifications(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/applicant-dashboard.fxml", "Applicant DashBoard");
    }

    @javafx.fxml.FXML
    public void handleAppeal(ActionEvent actionEvent) {
        MainApp.loadView("/view/user8/applicant-appeal.fxml", "File Appeal");
    }
}