package lang.david.android.ihm.polytech.tboth.home;

import android.support.v4.view.PagerAdapter;

import lang.david.android.ihm.polytech.tboth.PagerFragment;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class HomePagerFragment extends PagerFragment {

    @Override
    protected PagerAdapter buildAdapter() {
        return(new HomeAdapter(getActivity(), getChildFragmentManager()));
    }
}
