package lang.david.android.ihm.polytech.tboth.home.section.rank;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 05/05/2017.
 */

public class RankViewHolder extends RecyclerView.ViewHolder {

    public TextView nom;
    public TextView adresse;
    public ImageView image;
    public TextView rank;
    public TextView prix;
    public TextView reduction;

    public RankViewHolder(View v) {
        super(v);
        nom = (TextView) v.findViewById(R.id.rank_magasin_name);
        adresse = (TextView) v.findViewById(R.id.rank_adresse_magasin);
        image = (ImageView) v.findViewById(R.id.rank_magasin_image);
        rank = (TextView) v.findViewById(R.id.rank_magasin_position);
        prix = (TextView) v.findViewById(R.id.rank_price);
        reduction = (TextView) v.findViewById(R.id.rank_reduction);
    }
}

