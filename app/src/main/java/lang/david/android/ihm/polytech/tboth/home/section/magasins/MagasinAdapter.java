package lang.david.android.ihm.polytech.tboth.home.section.magasins;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.model.data.Magasin;

/**
 * Created by DavidLANG on 01/05/2017.
 */

public class MagasinAdapter extends RecyclerView.Adapter<MagasinViewHolder> {

    private List<Magasin> magasins;

    public MagasinAdapter(List<Magasin> magasins) {
        this.magasins = magasins;
    }


    @Override
    public MagasinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.magasins, null);

        return new MagasinViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MagasinViewHolder holder, int position) {
        Magasin magasin = magasins.get(position);

        holder.nom.setText(magasin.getNom());
        holder.adresse.setText(magasin.getAdresse());
        holder.image.setImageResource(magasin.getIdImage());
    }

    @Override
    public int getItemCount() {
        return magasins.size();
    }
}
