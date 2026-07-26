package cen413.public_service_commission.Tahmid_2430835.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DiscrepancyReport
{
    @javafx.fxml.FXML
    private TableColumn phoneCol;
    @javafx.fxml.FXML
    private TableColumn ageCol;
    @javafx.fxml.FXML
    private TableView applicantsTableView;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn examResultCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableColumn applicantIdCol;
    @javafx.fxml.FXML
    private TextField circularIdTF;
    @javafx.fxml.FXML
    private TableColumn emailCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markDiscrepancyButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/client/Tahmid_2430835/Auditor/0AuditorDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }

    @javafx.fxml.FXML
    public void loadApplicantsButtonOA(ActionEvent actionEvent) {
    }
}