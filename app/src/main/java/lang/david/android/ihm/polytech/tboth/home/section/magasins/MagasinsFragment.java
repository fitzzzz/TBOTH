package lang.david.android.ihm.polytech.tboth.home.section.magasins;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.MagasinModel;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class MagasinsFragment extends Fragment {

    public static String getTitle() {
        return "magasins";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.home_magasins_section, container, false);

        return(result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) this.getActivity().findViewById(R.id.magasin_recycler_view);
        MagasinAdapter magasinAdapter = new MagasinAdapter(MagasinModel.getInstance().getMagasins());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());

        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(magasinAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
