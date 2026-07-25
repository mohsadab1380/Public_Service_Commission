package cen413.public_service_commission.Tahmid_2430835.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CreateJobCircular
{
    @javafx.fxml.FXML
    private TextField postTitleTF;
    @javafx.fxml.FXML
    private TextArea eligibilityCriteriaTA;
    @javafx.fxml.FXML
    private TextField ageLimitTF;
    @javafx.fxml.FXML
    private DatePicker applicationDeadlineDP;
    @javafx.fxml.FXML
    private TextField vacancyCountTF;
    @javafx.fxml.FXML
    private TextField circularIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private TextArea jobDescriptionTA;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void forwardToChairmanButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/client/Tahmid_2430835/Auditor/0AuditorDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}