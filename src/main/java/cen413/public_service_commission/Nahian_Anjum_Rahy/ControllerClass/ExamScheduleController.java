package cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;

import cen413.public_service_commission.Nahian_Anjum_Rahy.MainApp;
import cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass.ExamSchedule;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExamScheduleController
{
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule, String>actionColumn;
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule, String>examNameColumn;
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule, String> preliminaryDateColumn;
    @javafx.fxml.FXML
    private DatePicker preliminaryDatePicker;
    @javafx.fxml.FXML
    private TableView <ExamSchedule> scheduleTableView;
    @javafx.fxml.FXML
    private DatePicker vivaEndDatePicker;
    @javafx.fxml.FXML
    private TextField examNameField;
    @javafx.fxml.FXML
    private TextField examCodeField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule,String>writtenDateColumn;
    @javafx.fxml.FXML
    private Button publishScheduleButton;
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule, String>scheduleIdColumn;
    @javafx.fxml.FXML
    private Button createScheduleButton;
    @javafx.fxml.FXML
    private Button clearButton;
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule, String>vivaDateColumn;
    @javafx.fxml.FXML
    private TableColumn <ExamSchedule, String>statusColumn;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private DatePicker writtenDatePicker;
    @javafx.fxml.FXML
    private DatePicker vivaStartDatePicker;

    private ObservableList<ExamSchedule> scheduleItems = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        scheduleIdColumn.setCellValueFactory(new PropertyValueFactory<>("scheduleId"));
        examNameColumn.setCellValueFactory(new PropertyValueFactory<>("examName"));
        preliminaryDateColumn.setCellValueFactory(new PropertyValueFactory<>("preliminaryDate"));
        writtenDateColumn.setCellValueFactory(new PropertyValueFactory<>("writtenDate"));
        vivaDateColumn.setCellValueFactory(new PropertyValueFactory<>("vivaDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        loadSampleData();
    }
    private void loadSampleData() {
        scheduleItems.clear();
        scheduleItems.add(new ExamSchedule("SCH-001", "BCS 2026", "BCS-01", "2026-07-15", "2026-07-20", "2026-07-25", "CREATED"));
        scheduleItems.add(new ExamSchedule("SCH-002", "BCS 2025", "BCS-02", "2025-07-15", "2025-07-20", "2025-07-25", "PUBLISHED"));
        scheduleTableView.setItems(scheduleItems);
    }

    @javafx.fxml.FXML
    public void handleBack(ActionEvent actionEvent) {
        MainApp.loadView("/view/user7/controller-dashboard.fxml", "Dashboard");
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        clearForm();
        statusLabel.setText("Form cleared");
    }
    private void clearForm() {
        examNameField.clear();
        examCodeField.clear();
        preliminaryDatePicker.setValue(null);
        writtenDatePicker.setValue(null);
        vivaStartDatePicker.setValue(null);
        vivaEndDatePicker.setValue(null);
    }

    @javafx.fxml.FXML
    public void handleCreateSchedule(ActionEvent actionEvent) {
        if (examNameField.getText().isEmpty()) {
            statusLabel.setText("Please enter exam name");
            return;
        }
        String id = "SCH-" + System.currentTimeMillis();
        scheduleItems.add(new ExamSchedule(id, examNameField.getText(), examCodeField.getText(),
                "TBD", "TBD", "TBD", "CREATED"));
        statusLabel.setText("Schedule created! ID: " + id);
        clearForm();
    }

    @javafx.fxml.FXML
    public void handlePublishSchedule(ActionEvent actionEvent) {
        statusLabel.setText("Schedule published successfully!");
    }
    public static class ExamSchedule {
        private String scheduleId, examName, preliminaryDate, writtenDate, vivaDate, status;

        public ExamSchedule(String scheduleId, String examName, String examCode,
                                String preliminaryDate, String writtenDate,
                                String vivaDate, String status) {
            this.scheduleId = scheduleId;
            this.examName = examName;
            this.preliminaryDate = preliminaryDate;
            this.writtenDate = writtenDate;
            this.vivaDate = vivaDate;
            this.status = status;
        }

        public String getScheduleId() { return scheduleId; }
        public String getExamName() { return examName; }
        public String getPreliminaryDate() { return preliminaryDate; }
        public String getWrittenDate() { return writtenDate; }
        public String getVivaDate() { return vivaDate; }
        public String getStatus() { return status; }
    }
}