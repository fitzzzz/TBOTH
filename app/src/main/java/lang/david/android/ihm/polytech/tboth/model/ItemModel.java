package lang.david.android.ihm.polytech.tboth.model;

import java.util.ArrayList;
import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.data.Item;

import static lang.david.android.ihm.polytech.tboth.model.data.ItemType.*;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class ItemModel {

    // Singleton
    private static ItemModel instance = new ItemModel();

    // List des produits
    private List<Item> items = new ArrayList<>();

    private ItemModel() {
        items.add(new Item(CD, "Justice Cross", "Album Cross 11/06/2007", R.drawable.justice_cross));
        items.add(new Item(BD, "Tintin au tibet", "BD tintin ecrit en 1960", R.drawable.tintin_au_tibet));
        items.add(new Item(FILM, "Oldboy", "Film de Park Chan-wook 29/09/2004", R.drawable.olbboy));
        items.add(new Item(LIVRE, "L'Apprenti assassin", "Livre de Robin Hobb 1995", R.drawable.lapprenti_assassin));
        items.add(new Item(MANGAS, "BERSEK TOME 1", "Mangas de Kentaro Miura (Octobre 2004)", R.drawable.bersek_tome1));
    }

    public static ItemModel getInstance() {
        return instance;
    }

    public List<Item> getItems() {
        return items;
    }
}
