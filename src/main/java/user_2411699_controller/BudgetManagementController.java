package user_2411699_controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.Budget;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class BudgetManagementController {
    @javafx.fxml.FXML
    private TextField AllocatedBUdgetTextfield;
    @javafx.fxml.FXML
    private TableColumn<Budget, String> departmentColumn;
    @javafx.fxml.FXML
    private TableColumn<Budget, Double> usedColumn;
    @javafx.fxml.FXML
    private TextField UsedBudgetTextField;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableView<Budget>  budgetTable;
    @javafx.fxml.FXML
    private TableColumn<Budget, Double>  allocatedColumn;
    private ArrayList<Budget> budgetArrayList = new ArrayList<>();
    @FXML
    public void initialize(){
        budgetArrayList= BinaryFileUtil.readObjects("data/budget.bin");

        departmentComboBox.getItems().addAll("Examination","IT","Finance","Administration");

        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        allocatedColumn.setCellValueFactory(new PropertyValueFactory<>("allocatedBudget"));
        usedColumn.setCellValueFactory(new PropertyValueFactory<>("usedBudget"));
        budgetTable.getItems().clear();
        budgetTable.getItems().addAll(budgetArrayList);
    }

    @javafx.fxml.FXML
    public void onGenerateReportClick(ActionEvent actionEvent) {
        statusLabel.setText("Report generated successfully!");

    }

    @javafx.fxml.FXML
    public void OnDashboardClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard");
    }


    @javafx.fxml.FXML
    public void onSearchClick(ActionEvent actionEvent) {
        String department = departmentComboBox.getValue();
        Double allocatedBudget = Double.parseDouble(AllocatedBUdgetTextfield.getText());
        Double usedBudget = Double.parseDouble(UsedBudgetTextField.getText());
        departmentComboBox.getValue();

        if (allocatedBudget <= 10000) {
            showAlert("Allocated Budget Must be more than 10000");
        }
        if (usedBudget > allocatedBudget) {
            showAlert("Used Budget Must be less than allocated Budget");
        }
        Budget budget = new Budget(department, allocatedBudget, usedBudget);
        BinaryFileUtil.appendObject("data/budget.bin", budget);
        showSuccessAlert("Added Successfully.");
        initialize();
    }
    public void showAlert(String t){
        Alert a= new Alert(Alert.AlertType.WARNING);
        a.setContentText(t);
    }
    public void showSuccessAlert(String t) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText(t);
    }
}