public class Fauteuil {
    private String rangee;
    private String numero;

    public Fauteuil(String rangee, String numero) {
        this.rangee = rangee;
        this.numero = numero;
    }

    public String getRangee() {
        return rangee;
    }

    public void setRangee(String rangee) {
        this.rangee = rangee;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}