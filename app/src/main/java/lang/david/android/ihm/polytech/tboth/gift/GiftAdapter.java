package lang.david.android.ihm.polytech.tboth.gift;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import lang.david.android.ihm.polytech.tboth.gift.acheter.AcheterFragment;
import lang.david.android.ihm.polytech.tboth.gift.recapitulatif.RecapitulatifFragment;
import lang.david.android.ihm.polytech.tboth.gift.recevoir.RecevoirFragment;
import lang.david.android.ihm.polytech.tboth.home.HomeSection;
import lang.david.android.ihm.polytech.tboth.home.section.rank.RankFragment;


public class GiftAdapter extends FragmentPagerAdapter {
    Context ctxt=null;

    public GiftAdapter(Context ctxt, FragmentManager mgr) {
        super(mgr);
        this.ctxt=ctxt;
    }

    @Override
    public int getCount() {
        return(GiftSection.values().length);
    }

    @Override
    public Fragment getItem(int position) {
        GiftSection section = GiftSection.getSectionFromInt(position);
        Fragment fragment = new RecapitulatifFragment();
        switch (section) {
            case RECAPITULATIF:
                fragment = new RecapitulatifFragment();
                break;
            case ACHETER:
                fragment = new AcheterFragment();
                break;
            case RECEVOIR:
                fragment = new RecevoirFragment();
                break;
        }
        return fragment;
    }

    @Override
    public String getPageTitle(int position) {
        GiftSection section = GiftSection.getSectionFromInt(position);
        String title;
        switch (section) {
            case RECAPITULATIF:
                title = RecapitulatifFragment.getTitle();
                break;
            case ACHETER:
                title = AcheterFragment.getTitle();
                break;
            case RECEVOIR:
                title = RecevoirFragment.getTitle();
                break;
            default:
                title = "";
                break;
        }
        return title;
    }
}
