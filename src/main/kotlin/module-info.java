module com.example.logistica {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    requires java.sql;

    opens com.example.logistica to javafx.fxml;
    exports com.example.logistica;



}