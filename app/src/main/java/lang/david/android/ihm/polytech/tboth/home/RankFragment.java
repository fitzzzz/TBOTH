package lang.david.android.ihm.polytech.tboth.home;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 27/04/2017.
 */

public class RankFragment extends Fragment {
    private static final String KEY_POSITION="position";

    public static RankFragment newInstance(int position) {
        RankFragment frag=new RankFragment();
        Bundle args=new Bundle();

        args.putInt(KEY_POSITION, position);
        frag.setArguments(args);

        return(frag);
    }

    public static String getTitle(Context ctxt, int position) {
//        return(String.format(ctxt.getString(R.string.hint), position + 1));
        return  ("classement");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.editor, container, false);

        return(result);
    }
}