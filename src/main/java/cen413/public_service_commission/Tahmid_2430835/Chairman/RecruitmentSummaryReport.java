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

public class RecruitmentSummaryReport
{
    @javafx.fxml.FXML
    private Label totalApprovedLabel;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private Label totalRejectedLabel;
    @javafx.fxml.FXML
    private DatePicker startDateDP;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label totalPostedLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOA(ActionEvent actionEvent) {
        LocalDate startDate = startDateDP.getValue();
        LocalDate endDate = endDateDP.getValue();


        int totalPosted = 0;
        int totalApproved = 0;
        int totalRejected = 0;

        try {
            FileInputStream fis = new FileInputStream("JobCircular.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    JobCircular j = (JobCircular) ois.readObject();
                    LocalDate submissionDate = j.getSubmissionDate();

                    if ((submissionDate.isEqual(startDate) || submissionDate.isAfter(startDate)) &&
                            (submissionDate.isEqual(endDate) || submissionDate.isBefore(endDate))) {

                        totalPosted++;

                        if (j.getStatus().equals("Approved")) {
                            totalApproved++;
                        } else if (j.getStatus().equals("Rejected")) {
                            totalRejected++;
                        }
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            totalPostedLabel.setText(Integer.toString(totalPosted));
            totalApprovedLabel.setText(Integer.toString(totalApproved));
            totalRejectedLabel.setText(Integer.toString(totalRejected));

            messageLabel.setText("Report loaded successfully");

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