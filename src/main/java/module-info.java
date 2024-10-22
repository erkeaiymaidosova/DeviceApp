module com.example.deviceapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.deviceapp to javafx.fxml;
    exports com.example.deviceapp;
}