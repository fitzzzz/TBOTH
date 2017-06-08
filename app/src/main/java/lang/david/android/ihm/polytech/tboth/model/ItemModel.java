package lang.david.android.ihm.polytech.tboth.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.data.Item;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;

import static lang.david.android.ihm.polytech.tboth.model.data.ItemType.*;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public enum  ItemModel {

    JUSTICE(new Item(CD, "Justice Cross", "Album Cross 11/06/2007", R.drawable.justice_cross, 15)),
    TINTIN_AU_TIBET(new Item(BD, "Tintin au tibet", "BD tintin ecrit en 1960", R.drawable.tintin_au_tibet, 9.80)),
    OLDBOY(new Item(FILM, "Oldboy", "Film de Park Chan-wook 29/09/2004", R.drawable.olbboy, 12.50)),
    LAPPRENTI_ASSASSIN(new Item(LIVRE, "L'Apprenti assassin", "Livre de Robin Hobb 1995", R.drawable.lapprenti_assassin, 12.15)),
    BERSEK_TOME1(new Item(MANGAS, "BERSEK TOME 1", "Mangas de Kentaro Miura (Octobre 2004)", R.drawable.bersek_tome1, 8.90));

    // ##############################
    // Map et List des Items du model
    // ##############################

    private static List<Item> items = new ArrayList<>();
    private static Map<String, Item> itemMap;

    static {
        initItemsList();
    }

    private static void initItemsList() {
        for (ItemModel itemModel : ItemModel.values()) {
            items.add(itemModel.getItem());
        }
    }

    private static void initItemMap() {
        for (Item item : items) itemMap.put(item.getNom(), item);
    }


    public static List<Item> getItems() {
        return items;
    }

    public static Map<String, Item> getItemsMap() {
        return itemMap;
    }

    // ###############################################
    // Constructeur et attribut des elements de l'enum
    // ###############################################


    private Item item;

    ItemModel(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public static List<Item> getItemsSelctionne() {
        List<Item> selectionnes = new ArrayList<>();
        for (Item item : items) {
            if (item.isSelectionne())
                selectionnes.add(item);
        }
        return selectionnes;
    }

}
