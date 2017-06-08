package lang.david.android.ihm.polytech.tboth.gift.acheter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public class GiftViewHolder extends RecyclerView.ViewHolder {

    public TextView desc;

    public GiftViewHolder(View itemView) {
        super(itemView);
        desc = (TextView) itemView.findViewById(R.id.gift_montant);
    }
}
