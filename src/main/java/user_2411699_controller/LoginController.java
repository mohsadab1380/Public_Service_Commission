package user_2411699_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import util.SceneSwitcher;

public class LoginController {

    @FXML
    private TextField userIdField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    public void onLoginClick(ActionEvent actionEvent) {

        String userId = userIdField.getText();
        String password = passwordField.getText();

        if (userId.isEmpty() && password.isEmpty()) {
            messageLabel.setText("Please enter User ID and Password.");
            return;
        }

        // Accountant Login
        if (userId.equals("5555") && password.equals("Account2026")) {

            messageLabel.setText("Login Successful.");

            SceneSwitcher.switchScene(
                    actionEvent,
                    "/user2411699/Accountant/accountant-dashboard-view.fxml",
                    "Accountant Dashboard"
            );

        }

        // Examiner Login
        else if (userId.equals("6666") && password.equals("Examiner2026")) {

            messageLabel.setText("Login Successful.");

            SceneSwitcher.switchScene(
                    actionEvent,
                    "/user2411699/Examiner/examiner-dashboard-view.fxml",
                    "Examiner Dashboard"
            );
        }

        else {
            messageLabel.setText("Invalid User ID or Password.");
        }
    }

    @FXML
    public void onApplicantClick(ActionEvent actionEvent) {

        messageLabel.setText("Applicant Registration is not available.");

        //SceneSwitcher.switchScene(
        //        actionEvent,
        //        "Applicant-dashboard.fxml",
        //         "Applicant Registration");
    }
}