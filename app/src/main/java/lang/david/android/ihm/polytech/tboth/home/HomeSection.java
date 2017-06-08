package lang.david.android.ihm.polytech.tboth.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.home.section.items.ItemsFragment;
import lang.david.android.ihm.polytech.tboth.home.section.magasins.MagasinsFragment;
import lang.david.android.ihm.polytech.tboth.home.section.rank.RankFragment;

/**
 * Created by DavidLANG on 04/06/2017.
 */

public class HomeSection extends Fragment {

    private Button buttonMagasins;
    private Button buttonProduits;
    private Button buttonClassement;
    protected FragmentManager fragmentManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.home_section, container, false);
        buttonClassement = (Button) inflatedView.findViewById(R.id.classement_button);
        buttonProduits = (Button) inflatedView.findViewById(R.id.produits_button);
        buttonMagasins = (Button) inflatedView.findViewById(R.id.gift_utiliser_button);
        fragmentManager = getActivity().getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.fragment_home, new MagasinsFragment()).commit();

        this.initButtonNavigation();
        return inflatedView;
    }

    private void initButtonNavigation() {
        buttonClassement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragment_home, new RankFragment()).commit();
            }
        });
        buttonMagasins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragment_home, new MagasinsFragment()).commit();
            }
        });
        buttonProduits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragment_home, new ItemsFragment()).commit();
            }
        });

    }
}
