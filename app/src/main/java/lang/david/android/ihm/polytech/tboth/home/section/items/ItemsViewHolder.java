package lang.david.android.ihm.polytech.tboth.home.section.items;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 02/05/2017.
 */

public class ItemsViewHolder extends RecyclerView.ViewHolder {
    public TextView nom;
    public TextView description;
    public ImageView image;
    public ToggleButton button;

    public ItemsViewHolder(View v) {
        super(v);
        nom = (TextView) v.findViewById(R.id.item_name);
        description = (TextView) v.findViewById(R.id.item_description);
        button = (ToggleButton) v.findViewById(R.id.item_button);
        image = (ImageView) v.findViewById(R.id.item_image);
    }
}
