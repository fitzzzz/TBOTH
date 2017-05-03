package lang.david.android.ihm.polytech.tboth.model;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class MagasinModel {

    // Singleton
    private static MagasinModel instance = new MagasinModel();

    // Liste des magasins
    private List<Magasin> magasins = new ArrayList<>();

    /**
     * Constructeur par defaut
     */
    private MagasinModel() {
        magasins.add(new Magasin(R.drawable.antibes, "TBOTH ANTIBES", "930 Route des Colles, 06410 Biot"));
        magasins.add(new Magasin(R.drawable.nice, "TBOTH NICE", "Place de l'Hôtel de ville, 06800 Cagnes-sur-Mer"));
        magasins.add(new Magasin(R.drawable.cannes, "TBOTH CANNE", "1 Place Bernard Cornut Gentille, 06400 Cannes"));
        magasins.add(new Magasin(R.drawable.cagnes_sur_mer, "TBOTH CAGNE-SUR-MER", "Place de l'Hôtel de ville, 06800 Cagnes-sur-Mer"));
    }


    public static MagasinModel getInstance() { return instance; }


    public List<Magasin> getMagasins() {
        return magasins;
    }

}
