package cen413.public_service_commission.id2220973;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class AssigninvigilatorViewController
{
    @javafx.fxml.FXML
    private TextField<Headofcentre,String> examHallTF;

    @javafx.fxml.FXML
    public void initialize() {
        examHallTF.getText()
    }

    @javafx.fxml.FXML
    public void finalizeAssignmentButtonOA(ActionEvent actionEvent) {
    }
}