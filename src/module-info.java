module app.gpa_tracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens app to javafx.fxml;
    exports app;

    exports controllers;
    opens controllers;
}
