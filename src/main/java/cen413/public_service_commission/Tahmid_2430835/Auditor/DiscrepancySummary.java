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

public class DiscrepancySummary
{
    @javafx.fxml.FXML
    private Label emailDiscrepancyLabel;
    @javafx.fxml.FXML
    private Label phoneDiscrepancyLabel;
    @javafx.fxml.FXML
    private Label nameDiscrepancyLabel;
    @javafx.fxml.FXML
    private TextField circularIdTF;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label ageDiscrepancyLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        int circularId = Integer.parseInt(circularIdTF.getText());
        int nameDiscrepancy = 0;
        int ageDiscrepancy = 0;
        int phoneDiscrepancy = 0;
        int emailDiscrepancy = 0;

        try {
            FileInputStream fis = new FileInputStream("Applicant.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Applicant a = (Applicant) ois.readObject();
                    if (a.getCircularId() == circularId) {
                        if (a.getName() == null || a.getName().isEmpty()) {
                            nameDiscrepancy++;
                        }
                        if (a.getAge() <= 0) {
                            ageDiscrepancy++;
                        }
                        if (a.getPhone() == null || a.getPhone().isEmpty()) {
                            phoneDiscrepancy++;
                        }
                        if (a.getEmail() == null || a.getEmail().isEmpty()) {
                            emailDiscrepancy++;
                        }
                    }
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

            nameDiscrepancyLabel.setText(Integer.toString(nameDiscrepancy));
            ageDiscrepancyLabel.setText(Integer.toString(ageDiscrepancy));
            phoneDiscrepancyLabel.setText(Integer.toString(phoneDiscrepancy));
            emailDiscrepancyLabel.setText(Integer.toString(emailDiscrepancy));

            messageLabel.setText("Report loaded successfully");

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