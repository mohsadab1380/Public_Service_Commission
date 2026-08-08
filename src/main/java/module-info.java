module cen413.public_service_commission {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    // Open the package containing your controller
    opens cen413.public_service_commission.Tahmid_2430835.Auditor to javafx.fxml;
    opens cen413.public_service_commission.Tahmid_2430835.Chairman to javafx.fxml;

    // If you have controllers in other packages, open them too
    // opens cen413.public_service_commission.other.package to javafx.fxml;

    opens cen413.public_service_commission to javafx.fxml;
    exports cen413.public_service_commission;
}