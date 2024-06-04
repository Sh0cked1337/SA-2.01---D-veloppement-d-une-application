public class TarifReduit extends Tarification {
    private double reductionStat;

    public TarifReduit(double pleinTarif, double reductionStat) {
        super(pleinTarif);
        this.reductionStat = reductionStat;
    }

    public double getReductionStat() {
        return reductionStat;
    }

    public void setReductionStat(double reductionStat) {
        this.reductionStat = reductionStat;
    }
}