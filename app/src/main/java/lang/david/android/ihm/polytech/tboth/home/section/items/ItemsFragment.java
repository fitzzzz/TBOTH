package lang.david.android.ihm.polytech.tboth.home.section.items;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.ItemModel;
import lang.david.android.ihm.polytech.tboth.model.data.Item;
import lang.david.android.ihm.polytech.tboth.model.data.ItemType;

/**
 * Created by DavidLANG on 02/05/2017.
 */

public class ItemsFragment extends Fragment {

    private EditText search;
    private RecyclerView recyclerView;

    private List<Item> itemList;
    private List<Item> toPrint;
    private ItemType currentCategory = null;
    private String searchContent = "";

    public static String getTitle() {
        return "produits";
    }

    public ItemsFragment() {
        this.itemList = ItemModel.getItems();
        this.toPrint = itemList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result=inflater.inflate(R.layout.home_items_section, container, false);

        return(result);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.search = (EditText) this.getActivity().findViewById(R.id.item_search);
        this.initRecyclerView();
        this.initCategorySpinner();
        this.initSpinnerListener();
        this.initSearchListerner();
    }

    private void initSearchListerner() {
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                searchContent = s.toString();
                updateRecyclerView();
            }
        });
    }

    private void initSpinnerListener() {
        Spinner category = (Spinner) this.getActivity().findViewById(R.id.item_category_spinner);

        category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    currentCategory = null;
                } else {
                    currentCategory = ItemType.values()[position - 1];
                }
                updateRecyclerView();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void updateRecyclerView() {
        toPrint = null;
        toPrint = new ArrayList<Item>();


        for (Item item : itemList) {
            if (item.getNom().toLowerCase().contains(searchContent.toLowerCase())) {
                if ((currentCategory == ItemType.SELECTIONNE && item.isSelectionne()) ||
                        (currentCategory == null || item.getType() == currentCategory)) {
                    toPrint.add(item);
                }
            }
        }
        recyclerView.setAdapter(new ItemsAdapter(toPrint));
        recyclerView.invalidate();
    }

    private void initCategorySpinner() {
        Spinner category = (Spinner) this.getActivity().findViewById(R.id.item_category_spinner);

        String categories[] = new String[ItemType.values().length + 1];
        categories[0] = "";
        int i = 1;
        for (ItemType itemType : ItemType.values()) {
            categories[i] = itemType.name();
            i += 1;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, categories);
        category.setAdapter(arrayAdapter);
    }


    private void initRecyclerView() {
        this.recyclerView = (RecyclerView) this.getActivity().findViewById(R.id.item_recyclerview);
        ItemsAdapter itemsAdapter = new ItemsAdapter(this.toPrint);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());

        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(itemsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
