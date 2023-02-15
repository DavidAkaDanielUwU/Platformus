module com.example.demojumpandrun {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.demojumpandrun to javafx.fxml;
    exports com.example.demojumpandrun;
}