package lang.david.android.ihm.polytech.tboth.gift.acheter;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import lang.david.android.ihm.polytech.tboth.model.GiftModel;
import lang.david.android.ihm.polytech.tboth.model.data.Gift;
import lang.david.android.ihm.polytech.tboth.R;


/**
 * Created by DavidLANG on 05/06/2017.
 */

public class ConfirmationAchatActivity extends FragmentActivity {

    private Gift gift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_achat);
        this.gift = (Gift) getIntent().getSerializableExtra("gift");
        System.out.println(gift);

        TextView confirmationText = (TextView) findViewById(R.id.confirmation_achat_text);
        String text = "Veuillez confirmer l'achat de votre cadeau d'une valeur de " + gift.getAmount()
                + "€.Il vous sera débité " +  gift.getAmount() + "€.";


        Button confirmationButton = (Button) findViewById(R.id.button_confirmer_achat);
        confirmationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GiftModel.addGift(gift);
                finish();
            }
        });

        confirmationText.setText(text);

    }



}
