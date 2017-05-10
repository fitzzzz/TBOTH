package lang.david.android.ihm.polytech.tboth.home.section.items;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.data.Item;

/**
 * Created by DavidLANG on 02/05/2017.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsViewHolder> {

    private List<Item> items;


    public ItemsAdapter(List<Item> items) {
        this.items = items;
    }


    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items, null);

        return new ItemsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemsViewHolder holder, int position) {
        Item item = items.get(position);

        holder.nom.setText(item.getNom());
        holder.description.setText(item.getDescription());
        holder.image.setImageResource(item.getIdImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

