package lang.david.android.ihm.polytech.tboth.home;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public enum HomeSection {
    RANK,
    MAGASINS,
    ITEMS;

    public static HomeSection getSectionFromInt(int section) {
        return HomeSection.values()[section];
    }
}
