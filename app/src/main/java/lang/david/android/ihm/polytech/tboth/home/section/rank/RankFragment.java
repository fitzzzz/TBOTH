package lang.david.android.ihm.polytech.tboth.home.section.rank;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.ItemModel;
import lang.david.android.ihm.polytech.tboth.model.MagasinModel;

/**
 * Created by DavidLANG on 27/04/2017.
 */

public class RankFragment  extends Fragment {

    private View view;

    public static String getTitle() {
        return "classement";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.home_rank_section, container, false);

        return(view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (!MagasinModel.getMagasinsSelectionne().isEmpty() && !ItemModel.getItemsSelctionne().isEmpty()) {
            ((TextView)this.getActivity().findViewById(R.id.rank_explication)).setText(R.string.rank_explication);
            RecyclerView recyclerView = (RecyclerView) this.getActivity().findViewById(R.id.magasin_rank_recycler_view);
            RankAdapter rankAdapter = new RankAdapter(MagasinModel.getMagasins(), getActivity());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                    linearLayoutManager.getOrientation());

            recyclerView.addItemDecoration(dividerItemDecoration);
            recyclerView.setAdapter(rankAdapter);
            recyclerView.setLayoutManager(linearLayoutManager);

        } else {
            ((TextView)this.getActivity().findViewById(R.id.rank_explication)).setText(R.string.rank_explication_instruction);
        }

    }
}
