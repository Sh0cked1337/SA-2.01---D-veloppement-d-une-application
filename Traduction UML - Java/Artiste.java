import java.util.List;

public class Artiste {
    private String nom;
    private List<Spectacle> spectacles;

    public Artiste(String nom, List<Spectacle> spectacles) {
        this.nom = nom;
        this.spectacles = spectacles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Spectacle> getSpectacles() {
        return spectacles;
    }

    public void setSpectacles(List<Spectacle> spectacles) {
        this.spectacles = spectacles;
    }
}
