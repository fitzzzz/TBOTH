package lang.david.android.ihm.polytech.tboth;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lang.david.android.ihm.polytech.tboth.home.HomeAdapter;


/**
 * Created by DavidLANG on 28/04/2017.
 */

public  abstract class PagerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.pager, container, false);
        ViewPager pager=(ViewPager)result.findViewById(R.id.pager);
        pager.setAdapter(buildAdapter());

        TabLayout tabLayout = (TabLayout) result.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
        return(result);
    }


    protected abstract PagerAdapter buildAdapter();
}