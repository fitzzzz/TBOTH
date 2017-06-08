package lang.david.android.ihm.polytech.tboth.gift;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import lang.david.android.ihm.polytech.tboth.R;
import lang.david.android.ihm.polytech.tboth.gift.acheter.AcheterFragment;
import lang.david.android.ihm.polytech.tboth.gift.recapitulatif.RecapitulatifFragment;
import lang.david.android.ihm.polytech.tboth.gift.recevoir.RecevoirFragment;
import lang.david.android.ihm.polytech.tboth.home.section.items.ItemsFragment;
import lang.david.android.ihm.polytech.tboth.home.section.magasins.MagasinsFragment;
import lang.david.android.ihm.polytech.tboth.home.section.rank.RankFragment;

/**
 * Created by DavidLANG on 04/06/2017.
 */

public class GiftSection extends Fragment {

    private Button buttonRecap;
    private Button buttonAchat;
    private Button buttonRecevoir;
    protected FragmentManager fragmentManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.gift_section, container, false);
        buttonRecevoir = (Button) inflatedView.findViewById(R.id.recevoir_button);
        buttonAchat = (Button) inflatedView.findViewById(R.id.achat_button);
        buttonRecap = (Button) inflatedView.findViewById(R.id.recap_button);
        fragmentManager = getActivity().getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.fragment_gift, new RecapitulatifFragment()).commit();

        this.initButtonNavigation();
        return inflatedView;
    }

    private void initButtonNavigation() {
        buttonRecevoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragment_gift, new RecevoirFragment()).commit();
            }
        });
        buttonRecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragment_gift, new RecapitulatifFragment()).commit();
            }
        });
        buttonAchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fragment_gift, new AcheterFragment()).commit();
            }
        });

    }
}
