module com.itproger.converterhomework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.itproger.converterhomework to javafx.fxml;
    exports com.itproger.converterhomework;
}