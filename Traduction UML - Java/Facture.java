public class Facture {
    private String numero;
    private double montantHT;
    private double statutTauxTVA;

    public Facture(String numero, double montantHT, double statutTauxTVA) {
        this.numero = numero;
        this.montantHT = montantHT;
        this.statutTauxTVA = statutTauxTVA;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(double montantHT) {
        this.montantHT = montantHT;
    }

    public double getStatutTauxTVA() {
        return statutTauxTVA;
    }

    public void setStatutTauxTVA(double statutTauxTVA) {
        this.statutTauxTVA = statutTauxTVA;
    }
}
