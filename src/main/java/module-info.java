module com.example.test1_11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.test1_11 to javafx.fxml;
    exports com.example.test1_11;
}