package com.example;

import Classes.Client;
import Classes.Reservation;
import Classes.Spectacle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Date;

public class ReserveController {

    @FXML
    private TextField nomTextField;
    @FXML
    private TextField prenomTextField;
    @FXML
    private TextField spectacleTextField;

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
    private void handleReserve() {
        // Validate input
        String nom = nomTextField.getText();
        String prenom = prenomTextField.getText();
        String spectacleNom = spectacleTextField.getText();

        // Find the spectacle
        Spectacle spectacle = MainController.findSpectacle(spectacleNom);

        if (spectacle != null) {
            // Create new Client
            Client client = new Client(nom, prenom, "", "", "", "", null);

            // Create new Reservation
            Reservation reservation = new Reservation("R" + new Date().getTime(), new Date(), new Date(), client, null);
            MainController.addReservation(reservation);

            okClicked = true;
            dialogStage.close();
        } else {
            // Show error message
        }
    }
}
