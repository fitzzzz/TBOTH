package lang.david.android.ihm.polytech.tboth.gift;

import lang.david.android.ihm.polytech.tboth.home.HomeSection;

/**
 * Created by DavidLANG on 10/05/2017.
 */

public enum GiftSection {
    RECAPITULATIF,
    ACHETER,
    RECEVOIR;

    public static GiftSection getSectionFromInt(int section) {
        return GiftSection.values()[section];
    }

}
