package cen413.public_service_commission.Tahmid_2430835.Chairman;

import cen413.public_service_commission.Tahmid_2430835.JobCircular;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class DepartmentWiseCircularReport
{
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label hrDeptCount;
    @javafx.fxml.FXML
    private Label financeDeptCount;
    @javafx.fxml.FXML
    private Label marketingDeptCount;
    @javafx.fxml.FXML
    private Label softwareDeptCount;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOA(ActionEvent actionEvent) {
        LocalDate fromDate = fromDateDP.getValue();
        LocalDate toDate = toDateDP.getValue();

        int softwareCount = 0;
        int hrCount = 0;
        int financeCount = 0;
        int marketingCount = 0;

        try {
            FileInputStream fis = new FileInputStream("JobCircular.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    JobCircular j = (JobCircular) ois.readObject();
                    LocalDate submissionDate = j.getSubmissionDate();

                    if ((submissionDate.isEqual(fromDate) || submissionDate.isAfter(fromDate)) &&
                            (submissionDate.isEqual(toDate) || submissionDate.isBefore(toDate))) {

                        String dept = j.getDepartment();
                        if (dept.equals("Software Engineering")) {
                            softwareCount++;
                        } else if (dept.equals("Human Resources")) {
                            hrCount++;
                        } else if (dept.equals("Finance")) {
                            financeCount++;
                        } else if (dept.equals("Marketing")) {
                            marketingCount++;
                        }
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            softwareDeptCount.setText(Integer.toString(softwareCount));
            hrDeptCount.setText(Integer.toString(hrCount));
            financeDeptCount.setText(Integer.toString(financeCount));
            marketingDeptCount.setText(Integer.toString(marketingCount));

            messageLabel.setText("Report generated");

        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Chairman/0ChairmanDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}