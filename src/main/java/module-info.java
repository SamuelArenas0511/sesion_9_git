module com.example.sesion_9_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sesion_9_git to javafx.fxml;
    exports com.example.sesion_9_git;
}