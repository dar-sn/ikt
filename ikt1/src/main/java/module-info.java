module com.example.ikt1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ikt1 to javafx.fxml;
    exports com.example.ikt1;
}