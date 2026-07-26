package cen413.public_service_commission.Tahmid_2430835.Chairman;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ViewAllJobCirculars
{
    @javafx.fxml.FXML
    private TableColumn circularIdCol;
    @javafx.fxml.FXML
    private TableColumn departmentCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableView allCircularsTableView;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn submissionDateCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn postTitleCol;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/client/Tahmid_2430835/Chairman/0ChairmanDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}