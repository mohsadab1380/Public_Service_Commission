package User_2411699_Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import user_2411699_model.TaxRecord;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.util.ArrayList;

public class TaxComplianceController {

    @FXML
    private TableColumn<TaxRecord, String> transactionIdColumn;

    @FXML
    private TableColumn<TaxRecord, Double> taxableAmountColumn;

    @FXML
    private TextField taxRateField;

    @FXML
    private TableColumn<TaxRecord, Double> vatAmountColumn;

    @FXML
    private TableColumn<TaxRecord, Double> taxAmountColumn;

    @FXML
    private Label statusLabel;

    @FXML
    private TableColumn<TaxRecord, String> paymentStatusColumn;

    @FXML
    private TableView<TaxRecord> taxTable;

    @FXML
    private TextField vatRateField;

    @FXML
    private TableColumn<TaxRecord, String> descriptionColumn;


    // Stores all tax records
    private ArrayList<TaxRecord> taxRecordList = new ArrayList<>();


    @FXML
    public void initialize() {


        transactionIdColumn.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        taxableAmountColumn.setCellValueFactory(new PropertyValueFactory<>("taxableAmount"));
        vatAmountColumn.setCellValueFactory(new PropertyValueFactory<>("vatAmount"));
        taxAmountColumn.setCellValueFactory(new PropertyValueFactory<>("taxAmount"));
        paymentStatusColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
    }


    @FXML
    public void onLoadClick(ActionEvent actionEvent) {

        try {

            taxRecordList =
                    BinaryFileUtil.readObjects("data/tax.txt");

            if (taxRecordList == null) {
                taxRecordList = new ArrayList<>();
            }

            ObservableList<TaxRecord> observableList = FXCollections.observableArrayList(taxRecordList);
            taxTable.setItems(observableList);

            statusLabel.setText(taxRecordList.size() + " tax record(s) loaded.");

        }
        catch (Exception e) {

            statusLabel.setText(
                    "Error loading tax records."
            );

            e.printStackTrace();
        }
    }


    @FXML
    public void onCalculateClick(ActionEvent actionEvent) {

        try {
            if (vatRateField.getText().trim().isEmpty()
                    || taxRateField.getText().trim().isEmpty()) {

                statusLabel.setText(
                        "Please enter VAT rate and tax rate."
                );

                return;
            }

            double vatRate =
                    Double.parseDouble(vatRateField.getText().trim());

            double taxRate =
                    Double.parseDouble(taxRateField.getText().trim());

            if (vatRate < 0 || taxRate < 0) {

                statusLabel.setText(
                        "Rates cannot be negative."
                );

                return;
            }

            if (vatRate > 100 || taxRate > 100) {

                statusLabel.setText(
                        "Rates cannot be greater than 100%."
                );

                return;
            }

            if (taxRecordList.isEmpty()) {

                statusLabel.setText(
                        "No tax records loaded."
                );

                return;
            }

            for (TaxRecord record : taxRecordList) {

                double taxableAmount =
                        record.getTaxableAmount();

                double vatAmount =
                        taxableAmount * vatRate / 100;

                double taxAmount =
                        taxableAmount * taxRate / 100;

                record.setVatAmount(
                        Math.round(vatAmount * 100.0) / 100.0
                );

                record.setTaxAmount(
                        Math.round(taxAmount * 100.0) / 100.0
                );
            }

            taxTable.setItems(FXCollections.observableArrayList(taxRecordList));

            taxTable.refresh();


            statusLabel.setText("VAT and tax calculated successfully.");

        }
        catch (NumberFormatException e) {
            statusLabel.setText("Please enter valid numeric rates.");

        }
        catch (Exception e) {

            statusLabel.setText(
                    "Error calculating tax."
            );

            e.printStackTrace();
        }
    }

    @FXML
    public void onSubmitClick(ActionEvent actionEvent) {

        if (taxRecordList.isEmpty()) {

            statusLabel.setText("No tax records to submit.");
            return;
        }


        try {

            // Make sure calculation has been performed
            if (vatRateField.getText().trim().isEmpty()
                    || taxRateField.getText().trim().isEmpty()) {

                statusLabel.setText(
                        "Please calculate tax before submitting."
                );

                return;
            }
            for (TaxRecord record : taxRecordList) {

                record.setPaymentStatus("Submitted");
            }


            BinaryFileUtil.saveObject("data/tax.txt", taxRecordList);

            taxTable.setItems(
                    FXCollections.observableArrayList(
                            taxRecordList
                    )
            );

            taxTable.refresh();


            statusLabel.setText(
                    "Tax records submitted successfully."
            );

        } catch (Exception e) {

            statusLabel.setText(
                    "Error submitting tax records."
            );

            e.printStackTrace();
        }
    }

    @FXML
    public void OnClickDashboard(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard"
        );
    }
}
