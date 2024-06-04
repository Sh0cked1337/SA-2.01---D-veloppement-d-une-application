import java.util.List;

public class Representation {
    private String jour;
    private String heure;
    private boolean annulee;
    private Spectacle spectacle;
    private List<Fauteuil> fauteuils;

    public Representation(String jour, String heure, boolean annulee, Spectacle spectacle, List<Fauteuil> fauteuils) {
        this.jour = jour;
        this.heure = heure;
        this.annulee = annulee;
        this.spectacle = spectacle;
        this.fauteuils = fauteuils;
    }

    // Getters and Setters
}
