package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class GestionSalleSpectacleApp extends Application {

    ObservableList<Spectacle> spectacles = FXCollections.observableArrayList();

    TableView<Spectacle> tableView = new TableView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gestion de spectacles");

        TableColumn<Spectacle, String> nomCol = new TableColumn<>("Nom");
        nomCol.setCellValueFactory(new PropertyValueFactory<>("nom"));

        TableColumn<Spectacle, Integer> nbRepresentationsCol = new TableColumn<>("Nb. de représentations");
        nbRepresentationsCol.setCellValueFactory(new PropertyValueFactory<>("nbRepresentations"));

        TableColumn<Spectacle, Integer> nbBilletsVendusCol = new TableColumn<>("Nb. de billets vendus");
        nbBilletsVendusCol.setCellValueFactory(new PropertyValueFactory<>("nbBilletsVendus"));

        TableColumn<Spectacle, Double> totalRecetteCol = new TableColumn<>("Recette totale");
        totalRecetteCol.setCellValueFactory(new PropertyValueFactory<>("totalRecette"));

        tableView.getColumns().addAll(nomCol, nbRepresentationsCol, nbBilletsVendusCol, totalRecetteCol);
        tableView.setItems(spectacles);

        VBox vBox = new VBox(tableView);
        Scene scene = new Scene(vBox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Simulation de données
        Spectacle spectacle1 = new Spectacle("Spectacle 1");
        spectacle1.ajouterRepresentation(LocalDate.of(2024, 5, 21), 100, 200);
        spectacle1.ajouterRepresentation(LocalDate.of(2024, 5, 22), 150, 250);
        spectacles.add(spectacle1);

        Spectacle spectacle2 = new Spectacle("Spectacle 2");
        spectacle2.ajouterRepresentation(LocalDate.of(2024, 5, 21), 120, 180);
        spectacle2.ajouterRepresentation(LocalDate.of(2024, 5, 22), 130, 200);
        spectacles.add(spectacle2);
    }
}

class Spectacle {
    private String nom;
    private ObservableList<Representation> representations = FXCollections.observableArrayList();

    public Spectacle(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ObservableList<Representation> getRepresentations() {
        return representations;
    }

    public void ajouterRepresentation(LocalDate date, int nbBilletsVendus, double prixUnitaire) {
        representations.add(new Representation(date, nbBilletsVendus, prixUnitaire));
    }

    public int getNbRepresentations() {
        return representations.size();
    }

    public int getNbBilletsVendus() {
        int total = 0;
        for (Representation rep : representations) {
            total += rep.getNbBilletsVendus();
        }
        return total;
    }

    public double getTotalRecette() {
        double total = 0;
        for (Representation rep : representations) {
            total += rep.getNbBilletsVendus() * rep.getPrixUnitaire();
        }
        return total;
    }
}

class Representation {
    private LocalDate date;
    private int nbBilletsVendus;
    private double prixUnitaire;

    public Representation(LocalDate date, int nbBilletsVendus, double prixUnitaire) {
        this.date = date;
        this.nbBilletsVendus = nbBilletsVendus;
        this.prixUnitaire = prixUnitaire;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNbBilletsVendus() {
        return nbBilletsVendus;
    }

    public void setNbBilletsVendus(int nbBilletsVendus) {
        this.nbBilletsVendus = nbBilletsVendus;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
