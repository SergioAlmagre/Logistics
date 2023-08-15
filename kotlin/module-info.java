module com.example.logistics {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.logistics to javafx.fxml;
    exports com.example.logistics;
}