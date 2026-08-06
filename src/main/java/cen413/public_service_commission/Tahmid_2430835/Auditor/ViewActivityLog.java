package cen413.public_service_commission.Tahmid_2430835.Auditor;

import cen413.public_service_commission.Tahmid_2430835.ActivityLog;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class ViewActivityLog
{
    @javafx.fxml.FXML
    private TableColumn<ActivityLog, Integer> circularIdCol;
    @javafx.fxml.FXML
    private TableColumn<ActivityLog, LocalDate> dateCol;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TableColumn<ActivityLog, Integer> logIdCol;
    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> doneByCol;
    @javafx.fxml.FXML
    private TableView<ActivityLog> activityLogTableView;
    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> roleCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<ActivityLog, String> postTitleCol;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    ObservableList<ActivityLog> activityLogList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        logIdCol.setCellValueFactory(new PropertyValueFactory<>("logId"));
        circularIdCol.setCellValueFactory(new PropertyValueFactory<>("circularId"));
        postTitleCol.setCellValueFactory(new PropertyValueFactory<>("postTitle"));
        doneByCol.setCellValueFactory(new PropertyValueFactory<>("doneBy"));
        roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        activityLogTableView.getItems().clear();
        activityLogList.clear();

        LocalDate fromDate = fromDateDP.getValue();
        LocalDate toDate = toDateDP.getValue();

        try {
            FileInputStream fis = new FileInputStream("Log.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    ActivityLog log = (ActivityLog) ois.readObject();
                    LocalDate logDate = log.getDate();

                    if ((logDate.isEqual(fromDate) || logDate.isAfter(fromDate)) &&
                            (logDate.isEqual(toDate) || logDate.isBefore(toDate))) {
                        activityLogList.add(log);
                        activityLogTableView.getItems().add(log);
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            messageLabel.setText("Activity logs loaded successfully");
        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/0AuditorDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}