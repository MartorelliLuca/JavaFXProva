module com.example.secondjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.secondjavafx to javafx.fxml;
    exports com.example.secondjavafx;
}