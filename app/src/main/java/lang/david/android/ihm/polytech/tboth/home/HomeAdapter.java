package lang.david.android.ihm.polytech.tboth.home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import lang.david.android.ihm.polytech.tboth.home.section.rank.RankFragment;
import lang.david.android.ihm.polytech.tboth.home.section.items.ItemsFragment;
import lang.david.android.ihm.polytech.tboth.home.section.magasins.MagasinsFragment;

/**
 * Created by DavidLANG on 27/04/2017.
 */

public class HomeAdapter extends FragmentPagerAdapter {
    Context ctxt=null;

    public HomeAdapter(Context ctxt, FragmentManager mgr) {
        super(mgr);
        this.ctxt=ctxt;
    }

    @Override
    public int getCount() {
        return(HomeSection.values().length);
    }

    @Override
    public Fragment getItem(int position) {
        HomeSection section = HomeSection.getSectionFromInt(position);
        Fragment fragment;
        switch (section) {
            case RANK:
                fragment = new RankFragment();
                break;
            case MAGASINS:
                fragment = new MagasinsFragment();
                break;
            case ITEMS:
                fragment = new ItemsFragment();
                break;
            default:
                fragment = new RankFragment();
                break;
        }
        return(fragment);
    }

    @Override
    public String getPageTitle(int position) {
        HomeSection section = HomeSection.getSectionFromInt(position);
        String title;
        switch (section) {
            case MAGASINS:
                title = MagasinsFragment.getTitle();
                break;
            case ITEMS:
                title = ItemsFragment.getTitle();
                break;
            default:
                title = RankFragment.getTitle();
                break;
        }
        return title;
    }
}