module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.shapes;
    opens com.example.demo.shapes to javafx.fxml;
    exports com.example.demo.Controller;
    opens com.example.demo.Controller to javafx.fxml;
}