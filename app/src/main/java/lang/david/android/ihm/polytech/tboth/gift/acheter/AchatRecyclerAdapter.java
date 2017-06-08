package lang.david.android.ihm.polytech.tboth.gift.acheter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.GiftModel;
import lang.david.android.ihm.polytech.tboth.model.data.Gift;

/**
 * Created by DavidLANG on 05/06/2017.
 */

public class AchatRecyclerAdapter extends RecyclerView.Adapter<GiftViewHolder> {

    private List<Gift> gifts;
    private Activity activity;

    public AchatRecyclerAdapter(Activity activity) {
        this.gifts = GiftModel.getGifts();
        this.activity = activity;
    }

    @Override
    public GiftViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.achat_item, null);

        return new GiftViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GiftViewHolder holder, int position) {
        final Gift gift = gifts.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, ConfirmationAchatActivity.class);
                intent.putExtra("gift", gift);
                System.out.println(gift);
                activity.startActivity(intent);
            }
        });
        holder.desc.setText("Carte cadeau : " + String.valueOf(gift.getAmount() )+ "€");
    }

    @Override
    public int getItemCount() {
        return gifts.size();
    }


}
