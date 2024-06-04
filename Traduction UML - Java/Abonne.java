public class Abonne extends Tarification {
    private double reductionStatic;

    public Abonne(double pleinTarif, double reductionStatic) {
        super(pleinTarif);
        this.reductionStatic = reductionStatic;
    }

    public double getReductionStatic() {
        return reductionStatic;
    }

    public void setReductionStatic(double reductionStatic) {
        this.reductionStatic = reductionStatic;
    }
}
