package lang.david.android.ihm.polytech.tboth.gift.recapitulatif;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;


import lang.david.android.ihm.polytech.tboth.R;


/**
 * Created by DavidLANG on 05/06/2017.
 */

public class UtiliserGiftActivity  extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_utiliser);
        ((ImageView) findViewById(R.id.qr_code_image)).setImageResource(R.drawable.qrcode);
    }
}
