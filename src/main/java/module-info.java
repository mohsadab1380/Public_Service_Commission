module cen413.public_service_commission {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens cen413.public_service_commission to javafx.fxml;
    exports cen413.public_service_commission;
    exports cen413.public_service_commission.Nahian_Anjum_Rahy;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy to javafx.fxml;
    exports cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass to javafx.fxml;
    exports cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass to javafx.fxml;
}