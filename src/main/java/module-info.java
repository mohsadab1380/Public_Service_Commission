module cen413.public_service_commission {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    exports cen413.public_service_commission;

    opens cen413.public_service_commission to javafx.fxml;

    opens User_2411699_Controller to javafx.fxml;
}
