package lang.david.android.ihm.polytech.tboth.model.data;

import android.support.annotation.NonNull;

/**
 * Created by DavidLANG on 16/05/2017.
 */

public class PriceReduction implements  Comparable {
    private double price;
    private double reduction;

    public PriceReduction(double price, double reduction) {
        this.price = price;
        this.reduction = reduction;
    }

    public double getPrice() {
        return price;
    }

    public double getReduction() {
        return reduction;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        PriceReduction pr2 = (PriceReduction) o;
        if (this.price - pr2.price > 0)
            return 1;
        else if (this.price - pr2.price  < 0)
            return -1;
        return 0;
    }
}
