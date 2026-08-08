package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.Logistics;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CenterLogisticsController
{
    @javafx.fxml.FXML
    private TableView<Logistics> roomTableView;
    @javafx.fxml.FXML
    private TableView <Logistics>invigilatorTableView;
    @javafx.fxml.FXML
    private TextField roomNumberField;
    @javafx.fxml.FXML
    private TableColumn <Logistics, String>districtCol;
    @javafx.fxml.FXML
    private ComboBox <String>roomCenterComboBox;
    @javafx.fxml.FXML
    private Button deleteCenterButton;
    @javafx.fxml.FXML
    private Button addCenterButton;
    @javafx.fxml.FXML
    private Label totalRoomsStatLabel;
    @javafx.fxml.FXML
    private TextField centerCodeField;
    @javafx.fxml.FXML
    private TableColumn <Logistics, String>centerNameCol;
    @javafx.fxml.FXML
    private TableColumn <Logistics, Double>utilizationCol;
    @javafx.fxml.FXML
    private Label totalInvigilatorsStatLabel;
    @javafx.fxml.FXML
    private TableColumn <Logistics, String>centerCodeCol;
    @javafx.fxml.FXML
    private Label logisticsStatusLabel;
    @javafx.fxml.FXML
    private Button assignInvigilatorButton;
    @javafx.fxml.FXML
    private Button refreshButton;
    @javafx.fxml.FXML
    private PieChart generatePieChart;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextField roomCapacityField;
    @javafx.fxml.FXML
    private TextField invigilatorNameField;
    @javafx.fxml.FXML
    private Button generateSeatingButton;
    @javafx.fxml.FXML
    private CheckBox autoSeatingCheckbox;
    @javafx.fxml.FXML
    private TextField capacityField;
    @javafx.fxml.FXML
    private TextField designationField;
    @javafx.fxml.FXML
    private ComboBox <String>districtComboBox;
    @javafx.fxml.FXML
    private Button addRoomButton;
    @javafx.fxml.FXML
    private ComboBox <String>centerAssignComboBox;
    @javafx.fxml.FXML
    private TextField centerNameField;
    @javafx.fxml.FXML
    private Button generateReportButton;
    @javafx.fxml.FXML
    private TableColumn <Logistics, String>actionCol;
    @javafx.fxml.FXML
    private TextField contactField;
    @javafx.fxml.FXML
    private Label totalCapacityStatLabel;
    @javafx.fxml.FXML
    private TableColumn <Logistics, Integer>capacityCol;
    @javafx.fxml.FXML
    private Label totalCentersStatLabel;
    @javafx.fxml.FXML
    private TableView <Logistics>centerTableView;

    private ObservableList<Logistics> centerItems = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {// Setup ComboBoxes
        String[] districts = {"Dhaka", "Chittagong", "Rajshahi", "Khulna", "Barishal", "Sylhet", "Rangpur", "Mymensingh"};
        districtComboBox.getItems().addAll(districts);
        centerAssignComboBox.getItems().addAll("Dhaka Center", "Chittagong Center", "Rajshahi Center", "Khulna Center");
        roomCenterComboBox.getItems().addAll("Dhaka Center", "Chittagong Center", "Rajshahi Center", "Khulna Center");


        centerCodeCol.setCellValueFactory(new PropertyValueFactory<>("centerCode"));
        centerNameCol.setCellValueFactory(new PropertyValueFactory<>("centerName"));
        districtCol.setCellValueFactory(new PropertyValueFactory<>("district"));
        capacityCol.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        utilizationCol.setCellValueFactory(new PropertyValueFactory<>("utilization"));

        // Load Sample Data
        loadSampleData();
        loadPieChartData();
        updateStats();

        logisticsStatusLabel.setText(" Logistics management ready");
    }
    private void loadSampleData() {
        centerItems.clear();
        centerItems.add(new Logistics("DHA-01", "Dhaka Center", "Dhaka", 500, 80.0, "ACTIVE"));
        centerItems.add(new Logistics("CTG-01", "Chittagong Center", "Chittagong", 400, 75.0, "ACTIVE"));
        centerItems.add(new Logistics("RAJ-01", "Rajshahi Center", "Rajshahi", 300, 66.7, "ACTIVE"));
        centerItems.add(new Logistics("KHL-01", "Khulna Center", "Khulna", 250, 60.0, "ACTIVE"));
        centerItems.add(new Logistics("SYL-01", "Sylhet Center", "Sylhet", 200, 55.0, "ACTIVE"));
        centerTableView.setItems(centerItems);
    }
    private void loadPieChartData() {
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList();

        if (centerItems.isEmpty()) {
            pieData.add(new PieChart.Data("No Data", 1));
        } else {
            for (Logistics item : centerItems) {
                pieData.add(new PieChart.Data(
                        item.getCenterName() + " (" + (int) item.getUtilization() + "%)",
                        item.getUtilization()
                ));
            }
        }

        generatePieChart.setData(pieData);
        generatePieChart.setTitle("Center Utilization Distribution");
        generatePieChart.setLegendVisible(true);
        generatePieChart.setLabelsVisible(true);
    }
    private void updateStats() {
        totalCentersStatLabel.setText(String.valueOf(centerItems.size()));

        int totalCapacity = centerItems.stream()
                .mapToInt(Logistics::getCapacity)
                .sum();
        totalCapacityStatLabel.setText(String.valueOf(totalCapacity));

        // Sample calculations
        totalInvigilatorsStatLabel.setText(String.valueOf(centerItems.size() * 6));
        totalRoomsStatLabel.setText(String.valueOf(centerItems.size() * 20));
    }

    @javafx.fxml.FXML
    public void handleAddCenter(ActionEvent actionEvent) {
        if (centerNameField.getText().isEmpty() || capacityField.getText().isEmpty()) {
            logisticsStatusLabel.setText(" Please fill all required fields");
            return;
        }

        String code = centerCodeField.getText().isEmpty() ?
                "CTR-" + System.currentTimeMillis() : centerCodeField.getText();
        String name = centerNameField.getText();
        String district = districtComboBox.getValue() != null ?
                districtComboBox.getValue() : "Unknown";
        int capacity = Integer.parseInt(capacityField.getText());

        centerItems.add(new Logistics(code, name, district, capacity, 0.0, "ACTIVE"));
        centerTableView.setItems(centerItems);

        loadPieChartData();
        updateStats();
        clearCenterForm();

        logisticsStatusLabel.setText("Center added successfully! Code: " + code);

    }

    @javafx.fxml.FXML
    public void handleBack(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/controller-dashboard.fxml", "Dashboard");
    }

    @javafx.fxml.FXML
    public void handleAddRoom(ActionEvent actionEvent) {
        if (roomNumberField.getText().isEmpty() || roomCapacityField.getText().isEmpty()) {
            logisticsStatusLabel.setText(" Please fill all room fields");
            return;
        }

        if (roomCenterComboBox.getValue() == null) {
            logisticsStatusLabel.setText(" Please select a center");
            return;
        }

        logisticsStatusLabel.setText(" Room " + roomNumberField.getText() +
                " added to " + roomCenterComboBox.getValue());
        clearRoomForm();
    }

    @javafx.fxml.FXML
    public void handleDeleteCenter(ActionEvent actionEvent) {
        Logistics selected = centerTableView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            logisticsStatusLabel.setText(" Please select a center to delete");
            return;
        }

        centerItems.remove(selected);
        centerTableView.setItems(centerItems);

        loadPieChartData();
        updateStats();

        logisticsStatusLabel.setText("Center deleted successfully!");
    }

    @javafx.fxml.FXML
    public void handleAssignInvigilator(ActionEvent actionEvent) {
        if (invigilatorNameField.getText().isEmpty()) {
            logisticsStatusLabel.setText(" Please enter invigilator name");
            return;
        }

        if (centerAssignComboBox.getValue() == null) {
            logisticsStatusLabel.setText("Please select a center");
            return;
        }

        logisticsStatusLabel.setText(" Invigilator assigned to " + centerAssignComboBox.getValue());
        clearInvigilatorForm();
    }

    @javafx.fxml.FXML
    public void handleGenerateSeating(ActionEvent actionEvent) {

        String seatingType = autoSeatingCheckbox.isSelected() ? "Auto-seating" : "Manual seating";

        if (roomCenterComboBox.getValue() == null) {
            logisticsStatusLabel.setText(" Please select a center");
            return;
        }

        logisticsStatusLabel.setText( seatingType + " arrangement generated for " +
                roomCenterComboBox.getValue());

    }

    @javafx.fxml.FXML
    public void handleRefresh(ActionEvent actionEvent) {
        loadSampleData();
        loadPieChartData();
        updateStats();
        logisticsStatusLabel.setText("All data refreshed!");
    }

    @javafx.fxml.FXML
    public void generatePieCharOnAction(ActionEvent actionEvent) {
        loadPieChartData();
        logisticsStatusLabel.setText("Pie chart updated successfully!");

    }
    private void clearCenterForm() {
        centerCodeField.clear();
        centerNameField.clear();
        capacityField.clear();
        districtComboBox.setValue(null);
    }

    private void clearInvigilatorForm() {
        invigilatorNameField.clear();
        designationField.clear();
        contactField.clear();
        centerAssignComboBox.setValue(null);
    }

    private void clearRoomForm() {
        roomNumberField.clear();
        roomCapacityField.clear();
        roomCenterComboBox.setValue(null);
        autoSeatingCheckbox.setSelected(false);
    }


}
