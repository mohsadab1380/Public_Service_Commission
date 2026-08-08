package cen413.public_service_commission;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
 2312010
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ControllerDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/user2411699/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 680);
        stage.setTitle("Public Service Commission");
 master
        stage.setScene(scene);
        stage.show();
    }
}
