public class Groupe extends Tarification {
    private double reductionStatic;

    public Groupe(double pleinTarif, double reductionStatic) {
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