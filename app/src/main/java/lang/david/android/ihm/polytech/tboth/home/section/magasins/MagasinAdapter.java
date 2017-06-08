package lang.david.android.ihm.polytech.tboth.home.section.magasins;

import android.graphics.Color;
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
    public void onBindViewHolder(final MagasinViewHolder holder, int position) {
        final Magasin magasin = magasins.get(position);

        if (magasin.isSelectionne()) {
            selectMagasin(holder);
        } else {
            unselectMagasin(holder);
        }
        holder.nom.setText(magasin.getNom());
        holder.adresse.setText(magasin.getAdresse());
        holder.image.setImageResource(magasin.getIdImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((Integer)holder.button.getTag() == R.drawable.ic_custom_star_off) {
                    selectMagasin(holder);
                    magasin.setSelectionne(true);
                } else {
                    unselectMagasin(holder);
                    magasin.setSelectionne(false);
                }
            }
        });
    }

    private void selectMagasin(MagasinViewHolder holder) {
        holder.button.setBackgroundResource(R.drawable.ic_custom_star_on);
        holder.button.setTag(R.drawable.ic_custom_star_on);
        holder.itemView.setBackgroundColor(Color.argb(255, 0, 128, 255));
    }

    private void unselectMagasin(MagasinViewHolder holder) {
        holder.button.setBackgroundResource(R.drawable.ic_custom_star_off);
        holder.button.setTag(R.drawable.ic_custom_star_off);
        holder.itemView.setBackgroundColor(Color.WHITE);
    }

    @Override
    public int getItemCount() {
        return magasins.size();
    }
}
