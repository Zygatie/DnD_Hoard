module com.unknown {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.unknown to javafx.fxml;
    exports com.unknown;
}
