module cen413.public_service_commission {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cen413.public_service_commission to javafx.fxml;
    exports cen413.public_service_commission;
}