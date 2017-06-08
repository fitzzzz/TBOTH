package lang.david.android.ihm.polytech.tboth.gift.recapitulatif;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.GiftModel;

/**
 * Created by DavidLANG on 10/05/2017.
 */

public class RecapitulatifFragment extends Fragment {

    public static String getTitle() {
        return "recapitulatif";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.gift_recapitulatif_section, container, false);

        return(result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (!GiftModel.getOwnedGift().isEmpty()) {
            getActivity().findViewById(R.id.recap_information_text).setVisibility(View.INVISIBLE);
            RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.gift_recap_recycler_view);
            RecapitulatifRecyclerAdapter recapitulatifRecyclerAdapter = new RecapitulatifRecyclerAdapter(getActivity());
            recyclerView.setAdapter(recapitulatifRecyclerAdapter);
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        }
    }

}

