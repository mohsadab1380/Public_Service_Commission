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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/user2411699/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 680);
        stage.setTitle("Public Service Commission");
        stage.setScene(scene);
        stage.show();
    }
}
