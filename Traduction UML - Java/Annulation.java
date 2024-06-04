import java.util.Date;

public class Annulation {
    private Date date;
    private boolean remboursementEffectue;

    public Annulation(Date date, boolean remboursementEffectue) {
        this.date = date;
        this.remboursementEffectue = remboursementEffectue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRemboursementEffectue() {
        return remboursementEffectue;
    }

    public void setRemboursementEffectue(boolean remboursementEffectue) {
        this.remboursementEffectue = remboursementEffectue;
    }
}
