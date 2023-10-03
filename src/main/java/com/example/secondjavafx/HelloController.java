package com.example.secondjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    // Metodo per inizializzare la seconda scena
    public void initializeSecondScene(Label label) {
        label.setText("Welcome to the Second Scene!");
    }

    public Label getWelcomeText() {
        return welcomeText;
    }
}
