package lang.david.android.ihm.polytech.tboth.model.data;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public class OwnedGift {

    private Gift gift;
    private int amount;

    public OwnedGift(Gift gift, int amount) {
        this.gift = gift;
        this.amount = amount;
    }

    public Gift getGift() {
        return gift;
    }

    public int getAmount() {
        return amount;
    }

    public void decreaseAmount() {
        amount -= 1;
    }
}
