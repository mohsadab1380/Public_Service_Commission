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
import java.io.*;
import java.time.LocalDate;

public class ApproveJobCircular
{
    @javafx.fxml.FXML
    private TableColumn<JobCircular, Integer> circularIdCol;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, Integer> vacancyCountCol;
    @javafx.fxml.FXML
    private TableView<JobCircular> pendingCircularsTableView;
    @javafx.fxml.FXML
    private TableColumn<JobCircular, String> postedByCol;
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
        vacancyCountCol.setCellValueFactory(new PropertyValueFactory<>("vacancyCount"));
        postedByCol.setCellValueFactory(new PropertyValueFactory<>("postedBy"));
        submissionDateCol.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));

    }

    @javafx.fxml.FXML
    public void fetchButtonOA(ActionEvent actionEvent) {

        pendingCircularsTableView.getItems().clear();
        jobCircularList.clear();

        try{
            FileInputStream fis = new FileInputStream("JobCircular.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(true){
                try{
                    JobCircular j = (JobCircular) ois.readObject();
                    jobCircularList.add(j);
                    if (j.getSubmissionDate().equals(dateDP.getValue()) && j.getStatus().equals("Pending")) {
                        pendingCircularsTableView.getItems().add(j);
                    }
                }
                catch (EOFException e){
                    ois.close();
                    break;
                }
            }
        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/0ChairmanDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }

    @javafx.fxml.FXML
    public void approveButtonOA(ActionEvent actionEvent) throws IOException{

        JobCircular selectedCircular = pendingCircularsTableView.getSelectionModel().getSelectedItem();

        for (JobCircular j : jobCircularList){
            if (j.equals(selectedCircular)){
                j.setStatus("Approved");
            }
        }

        FileOutputStream fos = new FileOutputStream("JobCircular.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (JobCircular j: jobCircularList){
            oos.writeObject(j);
        }
        oos.close();

    }
}