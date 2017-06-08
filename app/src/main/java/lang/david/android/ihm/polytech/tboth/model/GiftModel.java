package lang.david.android.ihm.polytech.tboth.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lang.david.android.ihm.polytech.tboth.model.data.Gift;
import lang.david.android.ihm.polytech.tboth.model.data.OwnedGift;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public enum GiftModel {
    DIX(new Gift(10)),
    VINGT(new Gift(20)),
    TRENTE(new Gift(30)),
    CINQUANTE(new Gift(50)),
    CENT(new Gift(100));

    private static List<Gift> gifts = new ArrayList<>();
    private static final Map<Integer, Gift> associationGiftAmount = new HashMap<>();
    private static Map<Integer, Integer> owned = new HashMap<>();

    static {
        initGift();
        initOwnedGift();
        initAssociationGiftAmount();
    }

    private static void initAssociationGiftAmount() {
        for (GiftModel gift : GiftModel.values())
            associationGiftAmount.put(gift.getGift().getAmount(), gift.getGift());
    }


    private static void initGift() {
        for (GiftModel gift : GiftModel.values())
            gifts.add(gift.getGift());
    }

    private static void initOwnedGift() {
        for (GiftModel gift : GiftModel.values())
            owned.put(gift.getGift().getAmount(), 0);
    }



    public static void addGift(Gift gift) {
        owned.put(gift.getAmount(), owned.get(gift.getAmount()) + 1);
    }

    public static void removeGift(Gift gift) {
        owned.put(gift.getAmount(), owned.get(gift.getAmount()) - 1);
    }

    public static List<OwnedGift> getOwnedGift() {
       List<OwnedGift> ownedGifts = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : owned.entrySet()) {
            if (entry.getValue() > 0) {
                ownedGifts.add(new OwnedGift(associationGiftAmount.get(entry.getKey()), entry.getValue()));
            }
        }

        return ownedGifts;
    }

    public static List<Gift> getGifts()  {return gifts; }

    private Gift gift;

    GiftModel(Gift gift) {
        this.gift = gift;
    }

    public Gift getGift() {
        return gift;
    }
}
