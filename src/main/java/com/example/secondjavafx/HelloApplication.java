package com.example.secondjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HelloApplication extends Application {

    Button openNewSceneButton;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Primo stage.");
        openNewSceneButton = new Button("Vai avanti");

        VBox layout = new VBox();
        layout.getChildren().add(openNewSceneButton);

        openNewSceneButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("second_scene.fxml"));
                    Parent root = loader.load();
                    Scene newScene = new Scene(root, 300, 250);

                    // Ottieni il controller della seconda scena
                    HelloController secondSceneController = loader.getController();

                    // Passa la Label 'welcomeText' al metodo di inizializzazione
                    secondSceneController.initializeSecondScene(secondSceneController.getWelcomeText());

                    // Imposta la nuova scena sullo stesso stage
                    primaryStage.setScene(newScene);
                } catch (IOException e) {
                    e.printStackTrace();
                    // Puoi aggiungere altre operazioni per gestire l'errore qui
                }
            }
        });


        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        // Mostra il primaryStage
        primaryStage.show();
    }
}