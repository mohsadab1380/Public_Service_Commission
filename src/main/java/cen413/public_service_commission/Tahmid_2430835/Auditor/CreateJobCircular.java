package cen413.public_service_commission.Tahmid_2430835.Auditor;

import cen413.public_service_commission.Tahmid_2430835.ActivityLog;
import cen413.public_service_commission.Tahmid_2430835.AppendableObjectOutputStream;
import cen413.public_service_commission.Tahmid_2430835.JobCircular;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class CreateJobCircular
{
    @javafx.fxml.FXML
    private TextField postTitleTF;
    @javafx.fxml.FXML
    private TextArea eligibilityCriteriaTA;
    @javafx.fxml.FXML
    private TextField ageLimitTF;
    @javafx.fxml.FXML
    private DatePicker applicationDeadlineDP;
    @javafx.fxml.FXML
    private TextField vacancyCountTF;
    @javafx.fxml.FXML
    private TextField circularIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> departmentCB;
    @javafx.fxml.FXML
    private TextArea jobDescriptionTA;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {

        departmentCB.getItems().addAll("Software Engineering", "Human Resources", "Finance", "Marketing");
    }

    @javafx.fxml.FXML
    public void forwardToChairmanButtonOA(ActionEvent actionEvent) throws IOException{

        int circularId = Integer.parseInt(circularIdTF.getText());
        String postTitle = postTitleTF.getText();
        String department = departmentCB.getValue();
        int vacancyCount = Integer.parseInt(vacancyCountTF.getText());
        int ageLimit = Integer.parseInt(ageLimitTF.getText());
        LocalDate applicationDeadline = applicationDeadlineDP.getValue();
        String jobDescription = jobDescriptionTA.getText();
        String eligibilityCriteria = eligibilityCriteriaTA.getText();
        int logID = (int)(Math.random() * 1000000000) + 1;


        JobCircular newCircular = new JobCircular( circularId, postTitle, department, vacancyCount, ageLimit, applicationDeadline, jobDescription, eligibilityCriteria);
        ActivityLog newActivityLog = new ActivityLog(logID, circularId, postTitle, "Author", "Author", LocalDate.now());

        File f = new File("JobCircular.bin");
        File logFile = new File("Log.bin");


        FileOutputStream fos;
        ObjectOutputStream oos;
        FileOutputStream fos1;
        ObjectOutputStream oos1;

        if (f.exists()){
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
            fos1 = new FileOutputStream(logFile, true);
            oos1 = new AppendableObjectOutputStream(fos1);
        }
        else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            fos1 = new FileOutputStream(logFile);
            oos1 = new ObjectOutputStream(fos1);
        }
        oos.writeObject(newCircular);
        oos.close();
        oos1.writeObject(newActivityLog);
        oos1.close();

        messageLabel.setText("Circular created and forwarded to Chairman successfully");

    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cen413/public_service_commission/Tahmid_2430835/Auditor/0AuditorDashboardView.fxml"));
        Node node = fxmlLoader.load();
        mainPane.getChildren().setAll(node);

    }

}