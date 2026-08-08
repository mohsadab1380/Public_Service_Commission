package user_2411699_controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.AuditRecord;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class AuditSupportController {
    @javafx.fxml.FXML
    private TableColumn<AuditRecord, String> transactionIdColumn;
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private TableColumn<AuditRecord, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<AuditRecord, String>  voucherIdColumn;
    @javafx.fxml.FXML
    private TableView<AuditRecord>  auditTable;
    @javafx.fxml.FXML
    private TableColumn<AuditRecord, String>  auditStatusColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField AmountTextField;
    @javafx.fxml.FXML
    private TextField voucherIdTextField;
    @javafx.fxml.FXML
    private TextField TransactionIdTextField;
    @FXML
    private RadioButton StatusCompleted;
    @FXML
    private RadioButton StatusPending;
    @FXML
    private ToggleGroup AuditStatus;

    private ArrayList<AuditRecord> auditList = new ArrayList<>();

    @FXML
   public void initialize(){

       auditList = BinaryFileUtil.readObjects("data/Audit.bin");

       transactionIdColumn.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
       amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
       voucherIdColumn.setCellValueFactory(new PropertyValueFactory<>("VoucherId"));
       auditStatusColumn.setCellValueFactory(new PropertyValueFactory<>("auditStatus"));
        auditTable.getItems().clear();
        auditTable.getItems().addAll(auditList);

    }

    @javafx.fxml.FXML
    public void onGenerateClick(ActionEvent actionEvent) {
        showSuccessAlert("Report Generated Successfully!");
        }


    @javafx.fxml.FXML
    public void OnClickDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void onUpdateClick(ActionEvent actionEvent) {
        showSuccessAlert("Financial Record updated Successfully!");

    }

    @javafx.fxml.FXML
    public void onCompleteClick(ActionEvent actionEvent) {
        statusLabel.setText("AuditCompleted");
    }

    @javafx.fxml.FXML
    public void onLoadClick(ActionEvent actionEvent) {
        auditTable.getItems().clear();
        auditTable.getItems().addAll(auditList);

    }

    @javafx.fxml.FXML
    public void OnClickAddAuditRec(ActionEvent actionEvent) {
        String transactionId = TransactionIdTextField.getText();
        String voucherId = voucherIdTextField.getText();
        Double amount = Double.parseDouble(AmountTextField.getText());

        String AuditStatus = "Completed";
        if(StatusCompleted.isSelected()){
            AuditStatus="Completed";
        }
        else if(StatusPending.isSelected()){
            AuditStatus="Pending";

        }

        if (transactionId.length() >= 7) {
            showAlert("ID length must be 7");
        }
        if (voucherId.length() >= 7) {
            showAlert("ID length must be 7");
        }

        for (AuditRecord Ar: auditList){
            if (Ar.getTransactionId().equals(transactionId)){
                showAlert("Duplicate ID");
                return;
            }
        }
        for (AuditRecord Ar: auditList){
            if (Ar.getVoucherId().equals(voucherId)){
                showAlert("Duplicate ID");
                return;
            }
        }
        AuditRecord auditRecord = new AuditRecord(transactionId,voucherId,amount,AuditStatus);
        BinaryFileUtil.appendObject("data/Audit.bin", auditRecord);
        showSuccessAlert("Added Successfully.");
        initialize();

    }
    public void showAlert(String t){
        Alert a= new Alert(Alert.AlertType.WARNING);
        a.setContentText(t);
    }
    public void showSuccessAlert(String t){
        Alert a= new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText(t);
    }
}