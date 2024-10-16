package com.example.sesion_9_git;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("My First Applitacion!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        System.out.println("Cambie algo");
    }

    public static void main(String[] args) {
        launch();
    }
}