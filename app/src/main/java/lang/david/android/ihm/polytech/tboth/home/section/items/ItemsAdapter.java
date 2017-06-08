package lang.david.android.ihm.polytech.tboth.home.section.items;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.ItemModel;
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
    public void onBindViewHolder(final ItemsViewHolder holder, int position) {
        final Item item = items.get(position);

        holder.nom.setText(item.getNom());
        holder.description.setText(item.getDescription());
        holder.image.setImageResource(item.getIdImage());
        holder.button.setTag(android.R.drawable.ic_input_add);
        if (item.isSelectionne())
            selectItem(holder, item);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((Integer)holder.button.getTag() == android.R.drawable.ic_input_add) {
                    selectItem(holder, item);
                } else {
                    unselectItem(holder, item);
                }
            }
        });
    }

    private void selectItem(ItemsViewHolder holder, Item item) {
        holder.button.setImageResource(android.R.drawable.ic_delete);
        holder.button.setTag(android.R.drawable.ic_delete);
        holder.itemView.setBackgroundColor(Color.argb(255, 0, 128, 255));
        item.setSelectionne(true);
    }

    private void unselectItem(ItemsViewHolder holder, Item item) {
        holder.button.setImageResource(android.R.drawable.ic_input_add);
        holder.button.setTag(android.R.drawable.ic_input_add);
        holder.itemView.setBackgroundColor(Color.WHITE);
        item.setSelectionne(false);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

