package User_2411699_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.PayrollRecord;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class PayrollManagementController {
    @javafx.fxml.FXML
    private TableView<PayrollRecord> payrollTable;
    @javafx.fxml.FXML
    private TableColumn<PayrollRecord, String>  processingStatusColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private ComboBox<String>  periodComboBox;
    @javafx.fxml.FXML
    private TableColumn<PayrollRecord, Double> netSalaryColumn;
    @javafx.fxml.FXML
    private TableColumn<PayrollRecord, Integer> employeeIdColumn;
    @javafx.fxml.FXML
    private TableColumn<PayrollRecord, String> employeeNameColumn;
    @javafx.fxml.FXML
    private TableColumn<PayrollRecord, String>  designationColumn;

    private ArrayList<PayrollRecord>payrollList = new ArrayList<>();

    @FXML
    public void initialize(){
        payrollList= BinaryFileUtil.readObjects("data/payroll.txt");
        periodComboBox.getItems().addAll("january 2026","February 2026","june 2026","August 2026");

        employeeIdColumn.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        employeeNameColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        designationColumn.setCellValueFactory(new PropertyValueFactory<>("designation"));
        netSalaryColumn.setCellValueFactory(new PropertyValueFactory<>("netSalary"));
        processingStatusColumn.setCellValueFactory(new PropertyValueFactory<>("processingStatus"));

        payrollTable.getItems().addAll(payrollList);

    }

    @javafx.fxml.FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        statusLabel.setText("Verified");
    }

    @javafx.fxml.FXML
    public void onProcessClick(ActionEvent actionEvent) {
        showSuccessAlert("Payroll Process Successful!");

    }
    public void showSuccessAlert(String t){
        Alert a= new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText(t);
    }

    @javafx.fxml.FXML
    public void onSearchClick(ActionEvent actionEvent) {
        String selectedPeriod = periodComboBox.getValue();

        if (selectedPeriod == null || selectedPeriod.trim().isEmpty()) {
            payrollTable.getItems().clear();
            payrollTable.getItems().addAll(payrollList);
            return;
        }
        initialize();
    }

    @javafx.fxml.FXML
    public void OnClockDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard");
    }
}