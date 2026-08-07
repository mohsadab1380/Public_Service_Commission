package user_2411699.controller;

import cen413.public_service_commission.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import user_2411699.Accountant;
import user_2411699.Examiner;
import user_2411699.Navigator;
import user_2411699.PscDataStore;
import user_2411699.Session;

/** Process-1 of the report: login screen, validation, verification and role routing. */
public class LoginController {
    @FXML
    private TextField userIdField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    @FXML
    protected void onLoginClick() {
        String userId = userIdField.getText() == null ? "" : userIdField.getText().trim();
        String password = passwordField.getText() == null ? "" : passwordField.getText();

        String validation = validate(userId, password);
        if (validation != null) {
            messageLabel.setText(validation);
            return;
        }

        User user = PscDataStore.getInstance().verifyLogin(Integer.parseInt(userId), password);
        if (user == null) {
            messageLabel.setText("No active employee profile matches these credentials.");
            return;
        }

        Session.start(user);
        PscDataStore.getInstance().auditLog(user.getClass().getSimpleName(), user.getId(), "Logged in");
        messageLabel.setText("");
        userIdField.clear();
        passwordField.clear();

        if (user instanceof Accountant) {
            Navigator.show("/user_2411699/accountant-dashboard.fxml", "Accountant Dashboard - Public Service Commission");
        } else if (user instanceof Examiner) {
            Navigator.show("/user_2411699/examiner-dashboard.fxml", "Examiner Dashboard - Public Service Commission");
        } else {
            messageLabel.setText("This workspace only supports the Accountant and Examiner roles.");
        }
    }

    @FXML
    protected void onRegisterClick() {
        messageLabel.setText("Citizen registration is handled by the Applicant module of the system.");
    }

    /** User ID must be exactly 4 or 8 characters, password 8+ characters with upper case, lower case and digits. */
    private String validate(String userId, String password) {
        if (userId.length() != 4 && userId.length() != 8) {
            return "User ID must be exactly 4 or 8 characters.";
        }
        if (!userId.matches("\\d+")) {
            return "User ID must contain digits only.";
        }
        if (password.length() < 8) {
            return "Password must be at least 8 characters long.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Password must contain at least one uppercase letter.";
        }
        if (!password.matches(".*[a-z].*")) {
            return "Password must contain at least one lowercase letter.";
        }
        if (!password.matches(".*\\d.*")) {
            return "Password must contain at least one number.";
        }
        return null;
    }
}
