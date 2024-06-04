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

    // Getters and Setters
}
