package user_2411699_controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.FinancialReport;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.time.LocalDate;
import java.util.ArrayList;

public class FinancialReportsController {
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private TableColumn<FinancialReport,String> recordIdColumn;
    @javafx.fxml.FXML
    private TableColumn<FinancialReport, Double> amountColumn;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<FinancialReport, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<FinancialReport, String> categoryColumn;
    @javafx.fxml.FXML
    private DatePicker recordDatePicker;
    @javafx.fxml.FXML
    private TableView<FinancialReport> recordTable;

    private ArrayList<FinancialReport>FinancialReportList=new ArrayList<>();
    @FXML
    private TextField recordIdField;
    @FXML
    private TextField amountField;

    @FXML
    public void initialize() {
        FinancialReportList = BinaryFileUtil.readObjects("data/fin.txt");

        recordIdColumn.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("recordDate"));

        reportTypeComboBox.getItems().addAll("Income", "Expense", "Tax", "Audit", "Budget");

        recordTable.getItems().clear();
        recordTable.getItems().addAll(FinancialReportList);
    }

    @javafx.fxml.FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        validationLabel.setText("Verified");
    }

    @javafx.fxml.FXML
    public void onGenerateClick(ActionEvent actionEvent) {
        showSuccessAlert("Report Generated successfully!");
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
        String recordId= recordIdField.getText();
        String reportType = reportTypeComboBox.getValue();
        Double amount = Double.parseDouble(amountField.getText());

        FinancialReport financialReport = new FinancialReport(recordId,reportType,amount,recordDatePicker.getValue());
        BinaryFileUtil.saveObject("data/Fin.txt",financialReport);
        initialize();
    }
}