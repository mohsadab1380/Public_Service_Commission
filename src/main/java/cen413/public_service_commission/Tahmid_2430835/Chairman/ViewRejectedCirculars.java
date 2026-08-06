package cen413.public_service_commission.Tahmid_2430835.Chairman;

import cen413.public_service_commission.Tahmid_2430835.JobCircular;
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

public class ViewRejectedCirculars
{
    @javafx.fxml.FXML
    private TableColumn<JobCircular, Integer> circularIdCol;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> departmentCol;
    @javafx.fxml.FXML
    private TableView<JobCircular> rejectedCircularsTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> rejectedByCol;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> rejectionReasonCol;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, LocalDate> rejectionDateCol;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, LocalDate> submissionDateCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> postTitleCol;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    ObservableList<JobCircular> jobCircularList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        circularIdCol.setCellValueFactory(new PropertyValueFactory<>("circularId"));
        postTitleCol.setCellValueFactory(new PropertyValueFactory<>("postTitle"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        submissionDateCol.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
        rejectedByCol.setCellValueFactory(new PropertyValueFactory<>("rejectedBy"));
        rejectionReasonCol.setCellValueFactory(new PropertyValueFactory<>("rejectionReason"));
        rejectionDateCol.setCellValueFactory(new PropertyValueFactory<>("rejectionDate"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        rejectedCircularsTableView.getItems().clear();
        jobCircularList.clear();

        try {
            FileInputStream fis = new FileInputStream("JobCircular.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    JobCircular j = (JobCircular) ois.readObject();
                    jobCircularList.add(j);
                    if (j.getSubmissionDate().equals(dateDP.getValue()) && j.getStatus().equals("Rejected")) {
                        rejectedCircularsTableView.getItems().add(j);
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            messageLabel.setText("Rejected circulars loaded successfully");

        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/0ChairmanDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}