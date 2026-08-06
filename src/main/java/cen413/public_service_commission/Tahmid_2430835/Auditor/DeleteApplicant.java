package cen413.public_service_commission.Tahmid_2430835.Auditor;

import cen413.public_service_commission.Tahmid_2430835.Applicant;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;

public class DeleteApplicant
{
    @javafx.fxml.FXML
    private TableColumn<Applicant, Integer> circularIdCol;
    @javafx.fxml.FXML
    private TableView<Applicant> applicantsTableView;
    @javafx.fxml.FXML
    private TableColumn<Applicant, String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Applicant, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Applicant, Integer> applicantIdCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField applicantIdTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    ObservableList<Applicant> applicantList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        applicantIdCol.setCellValueFactory(new PropertyValueFactory<>("applicantId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        circularIdCol.setCellValueFactory(new PropertyValueFactory<>("circularId"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        applicantsTableView.getItems().clear();
        applicantList.clear();

        int applicantId = Integer.parseInt(applicantIdTF.getText());

        try {
            FileInputStream fis = new FileInputStream("Applicant.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Applicant a = (Applicant) ois.readObject();
                    if (a.getApplicantId() == applicantId) {
                        applicantList.add(a);
                        applicantsTableView.getItems().add(a);
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            messageLabel.setText("Applicants loaded");
            messageLabel.setStyle("-fx-text-fill: #006400;");

        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {

        Applicant selectedApplicant = applicantsTableView.getSelectionModel().getSelectedItem();

        for (Applicant a : applicantList) {
            if (a.getApplicantId() == selectedApplicant.getApplicantId()) {
                applicantList.remove(a);
                break;
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("Applicant.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Applicant a : applicantList) {
                oos.writeObject(a);
            }
            oos.close();

            applicantsTableView.getItems().remove(selectedApplicant);
            messageLabel.setText("Applicant deleted");

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