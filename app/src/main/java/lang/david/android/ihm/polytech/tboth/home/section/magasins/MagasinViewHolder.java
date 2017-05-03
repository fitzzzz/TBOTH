package lang.david.android.ihm.polytech.tboth.home.section.magasins;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class MagasinViewHolder extends RecyclerView.ViewHolder {
    public TextView nom;
    public TextView adresse;
    public ImageView image;
    public Switch aSwitch;

    public MagasinViewHolder(View v) {
        super(v);
        nom = (TextView) v.findViewById(R.id.magasin_nom);
        adresse = (TextView) v.findViewById(R.id.magasin_adresse);
        aSwitch = (Switch) v.findViewById(R.id.magasin_switch);
        image = (ImageView) v.findViewById(R.id.magasin_image);
    }
}
