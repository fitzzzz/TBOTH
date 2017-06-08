package lang.david.android.ihm.polytech.tboth.gift.recapitulatif;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.gift.acheter.ConfirmationAchatActivity;
import lang.david.android.ihm.polytech.tboth.gift.acheter.GiftViewHolder;
import lang.david.android.ihm.polytech.tboth.model.GiftModel;
import lang.david.android.ihm.polytech.tboth.model.data.Gift;
import lang.david.android.ihm.polytech.tboth.model.data.OwnedGift;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public class RecapitulatifRecyclerAdapter  extends RecyclerView.Adapter<RecapViewHolder> {

    private final Activity activity;
    private  List<OwnedGift> ownedGifts;

    public RecapitulatifRecyclerAdapter(Activity activity) {
        this.ownedGifts = GiftModel.getOwnedGift();
        this.activity = activity;
    }


    @Override
    public RecapViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gift_recap_item, null);

        return new RecapViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecapViewHolder holder, final int position) {
        final OwnedGift ownedGift = this.ownedGifts.get(position);
        holder.giftTitle.setText("Carte cadeau " + ownedGift.getGift().getAmount() + "€" );
        holder.giftAmount.setText(String.valueOf(ownedGift.getAmount()) + " carte possédée(s)");
        holder.giftUtiliserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ownedGift.getAmount() == 1) {
                    ownedGifts.remove(position);
                    notifyItemRemoved(position);
                    notifyItemRangeChanged(position, ownedGifts.size());
                    if (ownedGifts.isEmpty())
                        activity.findViewById(R.id.recap_information_text).setVisibility(View.VISIBLE);
                } else {
                    ownedGift.decreaseAmount();
                    notifyItemChanged(position);
                }
                GiftModel.removeGift(ownedGift.getGift());
                Intent intent = new Intent(activity, UtiliserGiftActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ownedGifts.size();
    }
}
