package com.example;

import Classes.Spectacle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddSpectacleController {

    @FXML
    private TextField nomTextField;
    @FXML
    private TextField dureeTextField;
    @FXML
    private TextField nombreMaxSpectTextField;
    @FXML
    private TextField genreTextField;

    private Stage dialogStage;
    private boolean okClicked = false;

    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleAdd() {
        // Validate input
        String nom = nomTextField.getText();
        int duree = Integer.parseInt(dureeTextField.getText());
        int nombreMaxSpect = Integer.parseInt(nombreMaxSpectTextField.getText());
        String genre = genreTextField.getText();

        // Create new Spectacle and add to list
        Spectacle spectacle = new Spectacle(nom, duree, nombreMaxSpect, genre, null, null);
        MainController.addSpectacle(spectacle);

        okClicked = true;
        dialogStage.close();
    }
}
