module com.example.forpks319 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forpks319 to javafx.fxml;
    exports com.example.forpks319;
}