package cen413.public_service_commission.Tahmid_2430835.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ViewActivityLog
{
    @javafx.fxml.FXML
    private TableColumn circularIdCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TableColumn logIdCol;
    @javafx.fxml.FXML
    private TableColumn doneByCol;
    @javafx.fxml.FXML
    private TableView activityLogTableView;
    @javafx.fxml.FXML
    private TableColumn roleCol;
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

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/client/Tahmid_2430835/Auditor/0AuditorDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}