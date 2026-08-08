package user_2411699_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.ExamPaymentRequest;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;
import java.util.function.BinaryOperator;


public class FeeVerificationController {
    @javafx.fxml.FXML
    private TextField applicantIdTextfField;
    @javafx.fxml.FXML
    private TableView<ExamPaymentRequest> transactionTable;
    @javafx.fxml.FXML
    private TableColumn<ExamPaymentRequest,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<ExamPaymentRequest,Double> amountColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @FXML
    private TableColumn<ExamPaymentRequest,String> ExamTypeColumn;
    @FXML
    private TableColumn<ExamPaymentRequest,String> applicantIdColumn;
    private ArrayList<ExamPaymentRequest>verificationList = new ArrayList<>();

    @FXML
    public void initialize(){
        verificationList = BinaryFileUtil.readObjects("data/ePayment.bin");

        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        ExamTypeColumn.setCellValueFactory(new PropertyValueFactory<>("examName"));
        applicantIdColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        transactionTable.getItems().clear();
        transactionTable.getItems().addAll(verificationList);
    }

    @javafx.fxml.FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        statusLabel.setText("Verified");
    }

    @javafx.fxml.FXML
    public void onConfirmClick(ActionEvent actionEvent) {
        showSuccessAlert("Verification Confirmed Successfully!");
    }
    public void showSuccessAlert(String t){
        Alert a= new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText(t);
    }

    @javafx.fxml.FXML
    public void OnClickDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void onSearchClick(ActionEvent actionEvent) {
        String ApplicationId = applicantIdTextfField.getText();

        if(ApplicationId.equals(verificationList)){
            transactionTable.getItems().addAll(verificationList);
        }
        initialize();
    }
}