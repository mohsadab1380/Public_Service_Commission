package user_2411699_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.ExamPaymentRequest;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class ExaminationPaymentsController {
    @javafx.fxml.FXML
    private RadioButton paidRadioButton;
    @javafx.fxml.FXML
    private ComboBox<String> examinationTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<ExamPaymentRequest,String> paymentStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<ExamPaymentRequest,String> examNameColumn;
    @javafx.fxml.FXML
    private TableView<ExamPaymentRequest> requestTable;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn<ExamPaymentRequest,Double> amountColumn;
    @javafx.fxml.FXML
    private RadioButton UnpaidRadioButton;
    @javafx.fxml.FXML
    private ToggleGroup PaymentStatus;
    @javafx.fxml.FXML
    private TextField requestIdTextField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<ExamPaymentRequest,String> requestIdColumn;

    private ArrayList<ExamPaymentRequest>paymentRequestArrayList= new ArrayList<>();


    @FXML
    public void initialize(){
        paymentRequestArrayList = BinaryFileUtil.readObjects("data/ePayment.bin");

        examinationTypeComboBox.getItems().addAll("BCS","BCS preliminary","Non Cadre Written");

        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        requestIdColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        examNameColumn.setCellValueFactory(new PropertyValueFactory<>("examName"));
        paymentStatusColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        requestTable.getItems().clear();
        requestTable.getItems().addAll(paymentRequestArrayList);
    }

    @javafx.fxml.FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        showSuccessAlert("Payment Information Verified!");
    }

    @javafx.fxml.FXML
    public void OnClickDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void onAddPaymentReq(ActionEvent actionEvent) {
        String requestId = requestIdTextField.getText();
        String examName =examinationTypeComboBox.getValue();
        Double amount = Double.parseDouble(amountTextField.getText());

        String paymentStatus = "paid";
        if(paidRadioButton.isSelected()){
            paymentStatus ="paid";
        }
        else if(UnpaidRadioButton.isSelected()){
            paymentStatus = "Unpaid";
        }
        ExamPaymentRequest examPaymentRequest= new ExamPaymentRequest(requestId,examName,amount,paymentStatus);
        BinaryFileUtil.appendObject("data/ePayment",examPaymentRequest);
        showSuccessAlert("Added Successfully.");
        initialize();
    }
    public void showSuccessAlert(String t){
        Alert a= new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText(t);
    }

    @javafx.fxml.FXML
    public void onProcessClick(ActionEvent actionEvent) {
        statusLabel.setText("Payment process successful.");

    }

    @javafx.fxml.FXML
    public void onLoadClick(ActionEvent actionEvent) {
        requestTable.getItems().clear();
        requestTable.getItems().addAll(paymentRequestArrayList);
        initialize();
    }
}