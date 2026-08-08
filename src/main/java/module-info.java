module cen413.public_service_commission {

    requires javafx.controls;
    requires javafx.fxml;
2312010
    requires java.logging;

    requires javafx.base;
    requires javafx.graphics;
master


    opens cen413.public_service_commission to javafx.fxml;
    exports cen413.public_service_commission;
 2312010
    exports cen413.public_service_commission.Nahian_Anjum_Rahy;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy to javafx.fxml;
    exports cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy.ModelClass to javafx.fxml;
    exports cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass;
    opens cen413.public_service_commission.Nahian_Anjum_Rahy.ControllerClass to javafx.fxml;
}


    opens cen413.public_service_commission to javafx.fxml;

    opens User_2411699_Controller to javafx.fxml;
}
 master
