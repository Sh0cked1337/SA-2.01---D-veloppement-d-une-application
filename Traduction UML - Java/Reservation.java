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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateEnvoiConf() {
        return dateEnvoiConf;
    }

    public void setDateEnvoiConf(Date dateEnvoiConf) {
        this.dateEnvoiConf = dateEnvoiConf;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Billet> getBillets() {
        return billets;
    }

    public void setBillets(List<Billet> billets) {
        this.billets = billets;
    }
}
