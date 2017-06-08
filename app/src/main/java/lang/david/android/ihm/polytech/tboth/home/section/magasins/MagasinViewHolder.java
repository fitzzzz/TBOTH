package lang.david.android.ihm.polytech.tboth.home.section.magasins;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class MagasinViewHolder extends RecyclerView.ViewHolder {
    public TextView nom;
    public TextView adresse;
    public ImageView image;
    public ImageButton button;

    public MagasinViewHolder(View v) {
        super(v);
        nom = (TextView) v.findViewById(R.id.gift_title);
        adresse = (TextView) v.findViewById(R.id.gift_montant);
        button = (ImageButton) v.findViewById(R.id.gift_utiliser_button);
        image = (ImageView) v.findViewById(R.id.gift_image);
    }
}
