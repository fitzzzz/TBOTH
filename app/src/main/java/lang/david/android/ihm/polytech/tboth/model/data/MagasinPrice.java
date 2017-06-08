package lang.david.android.ihm.polytech.tboth.model.data;

import android.support.annotation.NonNull;

/**
 * Created by DavidLANG on 16/05/2017.
 */

public class MagasinPrice implements Comparable {
    private Magasin magasin;
    private PriceReduction priceReduction;

    public MagasinPrice(Magasin magasin, PriceReduction priceReduction) {
        this.magasin = magasin;
        this.priceReduction = priceReduction;
    }

    public PriceReduction getPriceReduction() {
        return priceReduction;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        MagasinPrice mp2 = (MagasinPrice) o;
        return this.getPriceReduction().compareTo(mp2.getPriceReduction());
    }
}
