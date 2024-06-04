import java.util.Date;
import java.util.List;

public class Reservation {
    private String numero;
    private Date date;
    private Date dateEnvoiConf;
    private Client client;
    private List<Billet> billets;

    public Reservation(String numero, Date date, Date dateEnvoiConf, Client client, List<Billet> billets) {
        this.numero = numero;
        this.date = date;
        this.dateEnvoiConf = dateEnvoiConf;
        this.client = client;
        this.billets = billets;
    }

    // Getters and Setters
}
