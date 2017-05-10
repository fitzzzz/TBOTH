package lang.david.android.ihm.polytech.tboth.home.section.rank;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.home.section.rank.RankViewHolder;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class RankAdapter extends RecyclerView.Adapter<RankViewHolder> {

    private List<Magasin> magasins;

    public RankAdapter(List<Magasin> magasins) {
        this.magasins = magasins;
    }


    @Override
    public RankViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rank, null);

        return new RankViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RankViewHolder holder, int position) {
        Magasin magasin = magasins.get(position);

        holder.nom.setText(magasin.getNom());
        holder.adresse.setText(magasin.getAdresse());
        holder.image.setImageResource(magasin.getIdImage());
        holder.rank.setText("" +  position);
    }

    @Override
    public int getItemCount() {
        return magasins.size();
    }
}
