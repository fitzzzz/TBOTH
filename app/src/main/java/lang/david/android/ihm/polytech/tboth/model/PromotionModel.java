package lang.david.android.ihm.polytech.tboth.model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import lang.david.android.ihm.polytech.tboth.model.data.Item;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;
import lang.david.android.ihm.polytech.tboth.model.data.Promotion;

import static lang.david.android.ihm.polytech.tboth.model.ItemModel.*;
import static lang.david.android.ihm.polytech.tboth.model.MagasinModel.ANTIBES;
import static lang.david.android.ihm.polytech.tboth.model.MagasinModel.CAGNES_SUR_MER;
import static lang.david.android.ihm.polytech.tboth.model.MagasinModel.CANNE;

/**
 * Created by DavidLANG on 10/05/2017.
 */

public class PromotionModel {


    // Instance
    private static PromotionModel instance = new PromotionModel();

    // List des promotions
    private List<Promotion> promotions = new ArrayList<>();


    private PromotionModel() {
        promotions.add(new Promotion(new GregorianCalendar(2017, 5, 11),new GregorianCalendar(2017, 10, 11), JUSTICE.getItem(), ANTIBES.getMagasin(),30.0));
        promotions.add(new Promotion(new GregorianCalendar(2017, 5, 11),new GregorianCalendar(2017, 10, 11), TINTIN_AU_TIBET.getItem(), CANNE.getMagasin(),30.0));
        promotions.add(new Promotion(new GregorianCalendar(2017, 5, 11),new GregorianCalendar(2017, 10, 11), OLDBOY.getItem(), CAGNES_SUR_MER.getMagasin(),30.0));

    }

    public static PromotionModel getInstance() {
        return instance;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public List<Promotion> getPromotions(List<Item> items, Magasin magasin) {
        List<Promotion> correspondedPromotions = new ArrayList<>();
        for (Promotion promotion : promotions) {
            if (items.contains(promotion.getItem()) && promotion.getMagasin().equals(magasin)) {
                correspondedPromotions.add(promotion);
            }
        }
        return correspondedPromotions;
    }
}
