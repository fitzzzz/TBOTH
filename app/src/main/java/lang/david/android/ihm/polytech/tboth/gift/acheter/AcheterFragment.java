package lang.david.android.ihm.polytech.tboth.gift.acheter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.GiftModel;


/**
 * Created by DavidLANG on 10/05/2017.
 */

public class AcheterFragment extends Fragment {

    public static String getTitle() {
        return "acheter";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.gift_acheter_section, container, false);

        return(result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) this.getActivity().findViewById(R.id.achat_recyclerview);
        AchatRecyclerAdapter achatRecyclerAdapter = new AchatRecyclerAdapter(getActivity());
        recyclerView.setAdapter(achatRecyclerAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }


}