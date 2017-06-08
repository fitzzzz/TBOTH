package lang.david.android.ihm.polytech.tboth.home.section.rank;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lang.david.android.ihm.polytech.tboth.MapsActivity;
import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.home.section.rank.RankViewHolder;
import lang.david.android.ihm.polytech.tboth.model.ItemModel;
import lang.david.android.ihm.polytech.tboth.model.MagasinModel;
import lang.david.android.ihm.polytech.tboth.model.PromotionModel;
import lang.david.android.ihm.polytech.tboth.model.data.Item;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;
import lang.david.android.ihm.polytech.tboth.model.data.MagasinPrice;
import lang.david.android.ihm.polytech.tboth.model.data.PriceReduction;
import lang.david.android.ihm.polytech.tboth.model.data.Promotion;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class RankAdapter extends RecyclerView.Adapter<RankViewHolder> {

    private List<MagasinPrice> magasinPrices = new ArrayList<>();
    private List<Magasin> magasins;
    private List<Item> items = new ArrayList<>();

    private Activity activity;

    public RankAdapter(List<Magasin> magasins, Activity activity) {
        double price;
        double prixWithReduction;
        double reduction;

        this.activity = activity;
        this.items = ItemModel.getItemsSelctionne();
        this.magasins = MagasinModel.getMagasinsSelectionne();
        price = calculTotalPrice();
        for (Magasin magasin : magasins) {
            prixWithReduction = calculTotalPriceWithReduction(magasin);
            reduction = 100 - ((prixWithReduction / price) * 100);
            magasinPrices.add(new MagasinPrice(magasin, new PriceReduction(prixWithReduction, reduction)));
        }

        Collections.sort(magasinPrices);
    }



    @Override
    public RankViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rank, null);


        return new RankViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RankViewHolder holder, int position) {
        MagasinPrice magasinPrice = magasinPrices.get(position);
        PriceReduction priceReduction = magasinPrice.getPriceReduction();
        final Magasin magasin = magasinPrice.getMagasin();
        double reduction = priceReduction.getReduction();
        double price = priceReduction.getPrice();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, MapsActivity.class);
                intent.putExtra("adresse", magasin.getLatLng());
                intent.putExtra("nom", magasin.getNom());
                activity.startActivity(intent);
            }
        });
        holder.nom.setText(magasin.getNom());
        holder.adresse.setText(magasin.getAdresse());
        holder.image.setImageResource(magasin.getIdImage());
        holder.rank.setText("" +  position);
        NumberFormat formatter = new DecimalFormat("#0.00");
        holder.reduction.setText("- " + formatter.format(reduction)+ "%");
        holder.prix.setText(formatter.format(price) + "€");

    }

    private  double calculTotalPrice() {
        double price = 0;
        for (Item item : items)
            price += item.getPrix();
        return price;
    }

    private double calculTotalPriceWithReduction(Magasin magasin) {
        double price = 0;
        List<Promotion> correspondedPromotions = PromotionModel.getInstance().getPromotions(items, magasin);
        for (Item item : items) {
            price += getPriceItem(correspondedPromotions, item);
        }
        return price;
    }

    private double getPriceItem(List<Promotion> promotions, Item item) {
        for (Promotion promotion : promotions) {
            if (promotion.getItem().equals(item)) {
                promotions.remove(promotion);
                return item.getPrix() - (item.getPrix() * (promotion.getReduction() / 100));
            }
        }
        return item.getPrix();
    }

    @Override
    public int getItemCount() {
        return magasins.size();
    }


}
