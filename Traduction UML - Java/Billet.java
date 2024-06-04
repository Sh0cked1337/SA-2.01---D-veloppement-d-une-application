public class Billet {
    private String numero;
    private Representation representation;

    public Billet(String numero, Representation representation) {
        this.numero = numero;
        this.representation = representation;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Representation getRepresentation() {
        return representation;
    }

    public void setRepresentation(Representation representation) {
        this.representation = representation;
    }
}
