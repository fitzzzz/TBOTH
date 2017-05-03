package lang.david.android.ihm.polytech.tboth.gift;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import lang.david.android.ihm.polytech.tboth.home.HomeSection;
import lang.david.android.ihm.polytech.tboth.home.RankFragment;


public class GiftAdapter extends FragmentPagerAdapter {
    Context ctxt=null;

    public GiftAdapter(Context ctxt, FragmentManager mgr) {
        super(mgr);
        this.ctxt=ctxt;
    }

    @Override
    public int getCount() {
        return(4);
    }

    @Override
    public Fragment getItem(int position) {
        HomeSection section = HomeSection.getSectionFromInt(position);
        switch (section) {
            case RANK:
                break;
            case MAGASINS:
                break;
            case ITEMS:
                break;
            default:
                break;
        }
        return(RankFragment.newInstance(position));
    }

    @Override
    public String getPageTitle(int position) {
        HomeSection section = HomeSection.getSectionFromInt(position);
        switch (section) {
            case RANK:
                break;
            case MAGASINS:
                break;
            case ITEMS:
                break;
            default:
                break;
        }
        return(RankFragment.getTitle(ctxt, position));
    }
}
