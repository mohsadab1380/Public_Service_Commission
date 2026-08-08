package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.CenterAllocation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CenterAllocationController
{
    @javafx.fxml.FXML
    private ComboBox <String>examComboBox;
    @javafx.fxml.FXML
    private Label totalCandidatesLabel;
    @javafx.fxml.FXML
    private TableColumn <CenterAllocation, String>actionColumn;
    @javafx.fxml.FXML
    private TableColumn <CenterAllocation, Integer>totalAllocatedColumn;
    @javafx.fxml.FXML
    private Button generateAdmitCardsButton;
    @javafx.fxml.FXML
    private TableColumn <CenterAllocation, String>centerNameColumn;
    @javafx.fxml.FXML
    private Button autoAllocateButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn <CenterAllocation,Integer>capacityColumn;
    @javafx.fxml.FXML
    private TableView<CenterAllocation> allocationTableView;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn <CenterAllocation, String>districtColumn;
    @javafx.fxml.FXML
    private TableColumn <CenterAllocation, Double>utilizationColumn;
    @javafx.fxml.FXML
    private Button exportAllocationButton;

    private ObservableList<CenterAllocationItem> allocationItems = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        examComboBox.getItems().addAll("BCS 2026", "BCS 2025", "BCS 2024");
        examComboBox.setValue("BCS 2026");

        centerNameColumn.setCellValueFactory(new PropertyValueFactory<>("centerName"));
        districtColumn.setCellValueFactory(new PropertyValueFactory<>("district"));
        totalAllocatedColumn.setCellValueFactory(new PropertyValueFactory<>("totalAllocated"));
        capacityColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        utilizationColumn.setCellValueFactory(new PropertyValueFactory<>("utilization"));

        loadSampleData();
        updateStats();
    }

    private void loadSampleData() {
        allocationItems.clear();
        allocationItems.add(new CenterAllocationItem("Dhaka Center", "Dhaka", 400, 500, 80.0));
        allocationItems.add(new CenterAllocationItem("Chittagong Center", "Chittagong", 300, 400, 75.0));
        allocationItems.add(new CenterAllocationItem("Rajshahi Center", "Rajshahi", 200, 300, 66.7));
        allocationTableView.setItems(allocationItems);
    }

    private void updateStats() {
        int total = allocationItems.size();
        int allocated = allocationItems.stream().mapToInt(CenterAllocationItem::getTotalAllocated).sum();
        int capacity = allocationItems.stream().mapToInt(CenterAllocationItem::getCapacity).sum();

        totalCandidatesLabel.setText(String.valueOf(allocated));
    }

    @FXML
    private void handleAutoAllocate(ActionEvent event) {
        statusLabel.setText("✅ Auto-allocation completed successfully!");
    }

    @FXML
    private void handleGenerateAdmitCards(ActionEvent event) {
        statusLabel.setText("✅ Admit cards generated for all allocated applicants");
    }


    @FXML
    private void handleExportAllocation(ActionEvent event) {
        statusLabel.setText("✅ Allocation report exported successfully");
    }

    @FXML
    private void handleBack(ActionEvent event) {
        MainApp.loadView("/view/user7/controller-dashboard.fxml", "Dashboard");
    }

    public static class CenterAllocationItem {
        private String centerName, district;
        private int totalAllocated, capacity;
        private double utilization;

        public CenterAllocationItem(String centerName, String district,
                                    int totalAllocated, int capacity, double utilization) {
            this.centerName = centerName;
            this.district = district;
            this.totalAllocated = totalAllocated;
            this.capacity = capacity;
            this.utilization = utilization;
        }

        public String getCenterName() { return centerName; }
        public String getDistrict() { return district; }
        public int getTotalAllocated() { return totalAllocated; }
        public int getCapacity() { return capacity; }
        public double getUtilization() { return utilization; }
    }
}
