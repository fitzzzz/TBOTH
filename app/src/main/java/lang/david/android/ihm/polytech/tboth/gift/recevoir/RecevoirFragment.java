package lang.david.android.ihm.polytech.tboth.gift.recevoir;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lang.david.android.ihm.polytech.tboth.R;


/**
 * Created by DavidLANG on 10/05/2017.
 */

public class RecevoirFragment extends Fragment {

    public static String getTitle() {
        return "recevoir";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.gift_recevoir_section, container, false);

        return(result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
