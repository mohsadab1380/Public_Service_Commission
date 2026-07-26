module cen413.public_service_commission {
    requires javafx.controls;
    requires javafx.fxml;


    opens cen413.public_service_commission to javafx.fxml;
    exports cen413.public_service_commission;
    exports cen413.public_service_commission.Nahian_Anjum_Rahy;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy to javafx.fxml;
}