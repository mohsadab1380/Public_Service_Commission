package user_2411699_controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import user_2411699_model.SupplierInvoice;
import util.BinaryFileUtil;
import util.SceneSwitcher;

import java.time.LocalDate;
import java.util.ArrayList;

public class SupplierPaymentController {
    @FXML
    private TableColumn<SupplierInvoice, Boolean> deliveryColumn;
    @FXML
    private TableColumn<SupplierInvoice, Double> amountColumn;
    @FXML
    private TableColumn<SupplierInvoice, String> invoiceIdColumn;
    @FXML
    private Label statusLabel;
    @FXML
    private TableColumn<SupplierInvoice, String> paymentStatusColumn;
    @FXML
    private TableView<SupplierInvoice> invoiceTable;
    @FXML
    private TableColumn<SupplierInvoice, String> supplierNameColumn;
    @FXML
    private TableColumn<SupplierInvoice, LocalDate> dueDateColumn;
    @FXML
    private ComboBox<String> supplierComboBox;
    @FXML
    private Label verifyLabel;

    private ArrayList<SupplierInvoice> supplierList = new ArrayList<>();


    @FXML
    public void initialize() {
        supplierList = BinaryFileUtil.readObjects("data/supplier.txt");

        supplierComboBox.getItems().addAll("Bangla Printers Ltd.", "Meghna Stationery", "Dhaka IT Solutions", "Rupali Catering");

        invoiceIdColumn.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        supplierNameColumn.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        deliveryColumn.setCellValueFactory(new PropertyValueFactory<>("delivery"));
        paymentStatusColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));

        invoiceTable.getItems().clear();
        invoiceTable.getItems().addAll(supplierList);
    }
    @FXML
    public void onVerifyClick(ActionEvent actionEvent) {
        verifyLabel.setText("Verified");
    }

    @FXML
    public void onProcessClick(ActionEvent actionEvent) {
        statusLabel.setText("process Completed!");
    }

    @FXML
    public void onSearchClick(ActionEvent actionEvent) {
        String selectedSupplier = supplierComboBox.getValue();
        if (selectedSupplier == null && selectedSupplier.trim().isEmpty())
        { invoiceTable.setItems( FXCollections.observableArrayList(supplierList) );
            statusLabel.setText("Please select a supplier.");
            return; }
        ObservableList<SupplierInvoice> filteredList = FXCollections.observableArrayList();
        for (SupplierInvoice invoice : supplierList) {
            if (invoice.getSupplierName() != null && invoice.getSupplierName().equalsIgnoreCase(selectedSupplier)) {
                filteredList.add(invoice);
            }
        }
        invoiceTable.setItems(filteredList);
        if (filteredList.isEmpty()) {
            statusLabel.setText( "No invoices found for " + selectedSupplier ); }
        else { statusLabel.setText( filteredList.size() + " invoice(s) found for " + selectedSupplier );
        }
    }


    @FXML
    public void OnClickDashboard(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/user2411699/Accountant/accountant-dashboard-view.fxml",
                "Accountant Dashboard");
    }
}

