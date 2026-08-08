package cen413.public_service_commission.Nahian_Anjum_Rahy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;

        // ====== CHANGE THIS LINE TO SWITCH BETWEEN USER ROLES ======
        // For Controller: "/view/user7/controller-dashboard.fxml"
        // For Applicant: "/view/user8/applicant-dashboard.fxml"

        loadView("/view/user7/controller-dashboard.fxml", "Controller Dashboard");
         loadView("/view/user8/applicant-dashboard.fxml", "Applicant Dashboard");

        primaryStage.show();
    }

    public static void loadView(String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlPath));
            Parent root = loader.load();
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle(title);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}