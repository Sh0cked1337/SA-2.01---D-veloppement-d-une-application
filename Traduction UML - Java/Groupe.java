public class Groupe extends Tarification {
    private double reductionStatic;

    public Groupe(double pleinTarif, double reductionStatic) {
        super(pleinTarif);
        this.reductionStatic = reductionStatic;
    }

    // Getters and Setters
}
