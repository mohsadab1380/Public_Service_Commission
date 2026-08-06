package cen413.public_service_commission.Tahmid_2430835.Auditor;
import cen413.public_service_commission.Tahmid_2430835.Applicant;
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

public class ApplicantCountPerCircular
{
    @javafx.fxml.FXML
    private TableColumn<JobCircular, Integer> circularIdCol;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> departmentCol;
    @javafx.fxml.FXML
    private TableView<JobCircular> circularsTableView;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private Label totalApplicantLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> postTitleCol;

    ObservableList<JobCircular> jobCircularList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        circularIdCol.setCellValueFactory(new PropertyValueFactory<>("circularId"));
        postTitleCol.setCellValueFactory(new PropertyValueFactory<>("postTitle"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        circularsTableView.getItems().clear();
        jobCircularList.clear();
        totalApplicantLabel.setText("");

        LocalDate fromDate = fromDateDP.getValue();
        LocalDate toDate = toDateDP.getValue();

        try {
            FileInputStream fis = new FileInputStream("JobCircular.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    JobCircular j = (JobCircular) ois.readObject();
                    LocalDate submissionDate = j.getSubmissionDate();

                    if ((submissionDate.isEqual(fromDate) || submissionDate.isAfter(fromDate)) &&
                            (submissionDate.isEqual(toDate) || submissionDate.isBefore(toDate))) {
                        jobCircularList.add(j);
                        circularsTableView.getItems().add(j);
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            messageLabel.setText("Circulars loaded successfully");
            messageLabel.setStyle("-fx-text-fill: #006400;");

        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void showTotalApplicantButtonOA(ActionEvent actionEvent) {

        JobCircular selectedCircular = circularsTableView.getSelectionModel().getSelectedItem();

        int circularId = selectedCircular.getCircularId();
        int totalApplicants = 0;

        try {
            FileInputStream fis = new FileInputStream("Applicant.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Applicant a = (Applicant) ois.readObject();
                    if (a.getCircularId() == circularId) {
                        totalApplicants++;
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            totalApplicantLabel.setText(Integer.toString(totalApplicants));
            messageLabel.setText("Total applicants loaded successfully");

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