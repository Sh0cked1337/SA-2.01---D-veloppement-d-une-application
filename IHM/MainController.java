package com.example;

import Classes.Spectacle;
import Classes.Reservation;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML
    private ListView<Spectacle> spectacleListView;

    private static ObservableList<Spectacle> spectacleList = FXCollections.observableArrayList();
    private static ObservableList<Reservation> reservationList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Ajouter des spectacles de démonstration
        spectacleList.add(new Spectacle("Spectacle 1", 120, 200, "Opera", new ArrayList<>(), new ArrayList<>()));
        spectacleList.add(new Spectacle("Spectacle 2", 90, 150, "Cirque", new ArrayList<>(), new ArrayList<>()));
        spectacleListView.setItems(spectacleList);
    }

    @FXML
    public void handleAddSpectacle() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("add-spectacle-view.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Ajouter Spectacle");
            stage.setScene(new Scene(root));
            AddSpectacleController controller = loader.getController();
            controller.setDialogStage(stage);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleReserve() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reserve-view.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Réserver Spectacle");
            stage.setScene(new Scene(root));
            ReserveController controller = loader.getController();
            controller.setDialogStage(stage);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addSpectacle(Spectacle spectacle) {
        spectacleList.add(spectacle);
    }

    public static Spectacle findSpectacle(String nom) {
        for (Spectacle s : spectacleList) {
            if (s.getNom().equals(nom)) {
                return s;
            }
        }
        return null;
    }

    public static void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }
}
