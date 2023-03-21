package com.example.demogui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 130, Color.WHITE); //size of screen

        GridPane gridpane = new GridPane();

        Label label = new Label("Label");
        gridpane.add(label, 0, 0);

        Button okButton=new Button("Press Me");
        gridpane.add(okButton, 1, 0);

        Label txtlabel = new Label("Label");
        gridpane.add(label, 0, 0);

        root.getChildren().add(gridpane);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}