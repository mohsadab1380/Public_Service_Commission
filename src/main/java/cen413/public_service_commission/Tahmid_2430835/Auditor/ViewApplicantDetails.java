package cen413.public_service_commission.Tahmid_2430835.Auditor;

import cen413.public_service_commission.Tahmid_2430835.Applicant;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ViewApplicantDetails
{
    @javafx.fxml.FXML
    private Label circularIdLabel;
    @javafx.fxml.FXML
    private TextField applicantIdTF;
    @javafx.fxml.FXML
    private Label addressLabel;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label phoneLabel;
    @javafx.fxml.FXML
    private Label examResultLabel;
    @javafx.fxml.FXML
    private Label applicantIdLabel;
    @javafx.fxml.FXML
    private Label applicationDateLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;
    @javafx.fxml.FXML
    private Label ageLabel;
    @javafx.fxml.FXML
    private Label emailLabel;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {

        int applicantId = Integer.parseInt(applicantIdTF.getText());

        try {
            FileInputStream fis = new FileInputStream("Applicant.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            boolean found = false;

            while (true) {
                try {
                    Applicant a = (Applicant) ois.readObject();
                    if (a.getApplicantId() == applicantId) {
                        applicantIdLabel.setText(Integer.toString(a.getApplicantId()));
                        nameLabel.setText(a.getName());
                        phoneLabel.setText(a.getPhone());
                        emailLabel.setText(a.getEmail());
                        addressLabel.setText(a.getAddress());
                        ageLabel.setText(Integer.toString(a.getAge()));
                        examResultLabel.setText(Double.toString(a.getExamResult()));
                        circularIdLabel.setText(Integer.toString(a.getCircularId()));
                        statusLabel.setText(a.getStatus());
                        applicationDateLabel.setText(a.getApplicationDate().toString());

                        messageLabel.setText("Applicant details loaded successfully");
                        found = true;
                        break;
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }
            if (!found) {
                messageLabel.setText("Applicant not found");
            }

        } catch (Exception e) {
            //
        }
    }


    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/0AuditorDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }
}