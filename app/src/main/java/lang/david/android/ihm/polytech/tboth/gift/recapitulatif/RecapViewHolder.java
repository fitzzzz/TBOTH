package lang.david.android.ihm.polytech.tboth.gift.recapitulatif;

import android.support.v7.widget.RecyclerView;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import lang.david.android.ihm.polytech.tboth.R;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public class RecapViewHolder extends RecyclerView.ViewHolder {

    public TextView giftTitle;
    public TextView giftAmount;
    public Button  giftUtiliserButton;


    public RecapViewHolder (View itemView) {
        super(itemView);
        giftTitle = (TextView) itemView.findViewById(R.id.gift_title);
        giftUtiliserButton = (Button) itemView.findViewById(R.id.gift_utiliser_button);
        giftAmount = (TextView) itemView.findViewById(R.id.gift_montant);
    }
}
