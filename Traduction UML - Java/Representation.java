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

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public void setAnnulee(boolean annulee) {
        this.annulee = annulee;
    }

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    public List<Fauteuil> getFauteuils() {
        return fauteuils;
    }

    public void setFauteuils(List<Fauteuil> fauteuils) {
        this.fauteuils = fauteuils;
    }
}