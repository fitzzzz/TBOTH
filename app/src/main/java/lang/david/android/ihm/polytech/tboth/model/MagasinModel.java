package lang.david.android.ihm.polytech.tboth.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public enum MagasinModel {

    ANTIBES(new Magasin(R.drawable.antibes, "TBOTH ANTIBES", "930 Route des Colles, 06410 Biot", new LatLng(43.6284391,7.0938517))),
    NICE(new Magasin(R.drawable.nice, "TBOTH NICE", "Place de l'Hôtel de ville, 06000 Nice", new LatLng(43.696211,7.271467))),
    CANNE(new Magasin(R.drawable.cannes, "TBOTH CANNE", "1 Place Bernard Cornut Gentille, 06400 Cannes", new LatLng(43.551337,7.0103963))),
    CAGNES_SUR_MER(new Magasin(R.drawable.cagnes_sur_mer, "TBOTH CAGNE-SUR-MER", "Place de l'Hôtel de ville, 06800 Cagnes-sur-Mer", new LatLng(43.6637479,7.146601)));

    private static List<Magasin> magasins = new ArrayList<>();

    static {
        initMagasinList();
    }

    public static List<Magasin> getMagasins() { return magasins;}


    public static List<Magasin> getMagasinsSelectionne() {
        List<Magasin> selected = new ArrayList<>();
        for (Magasin magasin : magasins) {
            if (magasin.isSelectionne())
                selected.add(magasin);
        }
        return selected;
    }

    private static void initMagasinList() {
        for (MagasinModel magasinModel : MagasinModel.values()) {
            magasins.add(magasinModel.getMagasin());
        }
    }

    private Magasin magasin;

    MagasinModel(Magasin magasin) { this.magasin = magasin; }

    public Magasin getMagasin() {
        return magasin;
    }

}
