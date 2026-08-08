package User_2411699_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import util.SceneSwitcher;

import java.io.IOException;

public class AccountantDashboardController {

    @FXML
    private Label userLabel;

    @FXML
    private BorderPane dashboardPane;

    @FXML
    public void initialize() {
        userLabel.setText("Welcome Accountant");
    }


    @FXML
    public void onFeeReconciliationClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/fee-verification-view.fxml",
                "Fee Reconciliation");
    }

    @FXML
    public void onPayrollClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/payroll-management-view.fxml",
                "Payroll Management");
    }

    @FXML
    public void onSupplierPaymentClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/supplier-payment-view.fxml",
                "Supplier Payment");
    }

    @FXML
    public void onBudgetClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/budget-management-view.fxml",
                "Budget Management");
    }

    @FXML
    public void onFinancialReportsClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/financial-report-view.fxml",
                "Financial Report");
    }

    @FXML
    public void onExaminationPaymentsClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/examination-payment-view.fxml",
                "Examination Payment");
    }

    @FXML
    public void onTaxComplianceClick(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/tax-compliance-view.fxml",
                "Tax Vat Compliance");
    }

    @FXML
    public void onAuditSupportClick(ActionEvent actionEvent) { SceneSwitcher.switchScene(
            actionEvent,
            "/user2411699/Accountant/audit-support-view.fxml",
            "Audit Support");

    }

    @FXML
    public void onLogOutClick(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/User2411699/login-view.fxml",
                "Login"
        );
    }
}