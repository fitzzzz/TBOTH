package lang.david.android.ihm.polytech.tboth.home.section.items;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.ItemModel;
import lang.david.android.ihm.polytech.tboth.model.data.ItemType;

/**
 * Created by DavidLANG on 02/05/2017.
 */

public class ItemsFragment extends Fragment {

    public static String getTitle() {
        return "produits";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.home_items_section, container, false);

        return(result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.initRecyclerView();
        this.initCategorySpinner();
    }

    private void initCategorySpinner() {
        Spinner category = (Spinner) this.getActivity().findViewById(R.id.item_category_spinner);

        String categories[] = new String[ItemType.values().length + 1];
        int i = 0;
        for (ItemType itemType : ItemType.values()) {
            categories[i] = itemType.name();
            i += 1;
        }
        categories[i] = "selectionné";
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, categories);
        category.setAdapter(arrayAdapter);
    }


    private void initRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) this.getActivity().findViewById(R.id.item_recyclerview);
        ItemsAdapter itemsAdapter = new ItemsAdapter(ItemModel.getInstance().getItems());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());

        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(itemsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
