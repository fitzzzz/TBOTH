package lang.david.android.ihm.polytech.tboth.model.data;

import java.io.Serializable;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public class Gift implements Serializable {
    private int amount;

    public Gift(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
