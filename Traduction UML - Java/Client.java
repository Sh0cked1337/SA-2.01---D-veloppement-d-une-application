import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mail;
    private String numero;
    private List<Reservation> reservations;

    public Client(String nom, String prenom, String adresse, String tel, String mail, String numero, List<Reservation> reservations) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.mail = mail;
        this.numero = numero;
        this.reservations = reservations;
    }

    // Getters and Setters
}
