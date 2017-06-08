package lang.david.android.ihm.polytech.tboth.model.data;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by DavidLANG on 10/05/2017.
 */

public class Promotion {
    private GregorianCalendar debut;
    private GregorianCalendar fin;
    private Item  item;
    private Magasin magasin;
    private double reduction;

    public Promotion(GregorianCalendar debut, GregorianCalendar fin, Item item, Magasin magasin, double reduction) {
        this.debut = debut;
        this.fin = fin;
        this.item = item;
        this.magasin = magasin;
        this.reduction = reduction;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public GregorianCalendar getDebut() {
        return debut;
    }

    public GregorianCalendar getFin() {
        return fin;
    }

    public Item getItem() {
        return item;
    }

    public double getReduction() {
        return reduction;
    }
}
