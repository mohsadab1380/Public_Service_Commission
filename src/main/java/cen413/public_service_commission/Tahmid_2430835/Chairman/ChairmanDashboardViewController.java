package cen413.public_service_commission.Tahmid_2430835.Chairman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ChairmanDashboardViewController {

    @FXML
    private AnchorPane mainPane;

    @FXML
    public void initialize() {

    }

    @FXML
    public void EditCircularButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/5RejectJobCircular.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void ApprovedCircularsButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/6ViewApprovedCirculars.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void RecruitmentSummaryReportButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/2RecruitmentSummaryReport.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }


    @FXML
    public void ViewAllJobCircularsButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/4ViewAllJobCirculars.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void RejectedCircularsButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/7ViewRejectedCirculars.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void DepartmentWiseCircularReportButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/8DepartmentWiseCircularReport.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void DeleteCircularButtonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/3DeleteJobCircular.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);
    }

    @FXML
    public void PendingJobCircularButtonOA(ActionEvent actionEvent) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/1ApproveJobCircular.fxml")
        );
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}