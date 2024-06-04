public class Senior extends Tarification {
    private double reductionStatic;

    public Senior(double pleinTarif, double reductionStatic) {
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