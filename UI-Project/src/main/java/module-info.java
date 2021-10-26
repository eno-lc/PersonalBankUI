module com.example.uiproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uiproject to javafx.fxml;
    exports com.example.uiproject;
}