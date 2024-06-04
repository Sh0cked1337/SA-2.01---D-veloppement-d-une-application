import java.util.List;

public class Spectacle {
    private String nom;
    private int duree;
    private int nombreMaxSpect;
    private String genre;
    private List<Artiste> artistes;
    private List<Representation> representations;

    public Spectacle(String nom, int duree, int nombreMaxSpect, String genre, List<Artiste> artistes, List<Representation> representations) {
        this.nom = nom;
        this.duree = duree;
        this.nombreMaxSpect = nombreMaxSpect;
        this.genre = genre;
        this.artistes = artistes;
        this.representations = representations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getNombreMaxSpect() {
        return nombreMaxSpect;
    }

    public void setNombreMaxSpect(int nombreMaxSpect) {
        this.nombreMaxSpect = nombreMaxSpect;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Artiste> getArtistes() {
        return artistes;
    }

    public void setArtistes(List<Artiste> artistes) {
        this.artistes = artistes;
    }

    public List<Representation> getRepresentations() {
        return representations;
    }

    public void setRepresentations(List<Representation> representations) {
        this.representations = representations;
    }
}