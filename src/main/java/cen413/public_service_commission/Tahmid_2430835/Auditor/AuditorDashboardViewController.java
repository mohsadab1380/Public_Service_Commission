package cen413.public_service_commission.Tahmid_2430835.Auditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AuditorDashboardViewController {

    @FXML
    private AnchorPane mainPane;

    @FXML
    public void initialize() {

    }

    @FXML
    public void ViewApplicantsByCircularButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/3ViewApplicantsbyCircular.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void ViewActivityLogButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/6ViewActivityLog.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void CreateJobCircularButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/1CreateJobCircular.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void EditApplicantButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/5ViewApplicantDetails.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void DeleteApplicantButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/4DeleteApplicant.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void ExportDiscrepancyReportButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/7DiscrepancySummary.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void DiscrepancyReportButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/2DiscrepancyReport.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void applicantCountPerCircularButtonOA(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/8ApplicantCountPerCircular.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }
}