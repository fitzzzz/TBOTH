package lang.david.android.ihm.polytech.tboth;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import lang.david.android.ihm.polytech.tboth.gift.GiftPagerFragment;
import lang.david.android.ihm.polytech.tboth.home.HomePagerFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager.beginTransaction().replace(R.id.frag_content, new HomePagerFragment()).commit();
                    return true;
                case R.id.navigation_cadeaux:
                    fragmentManager.beginTransaction().replace(R.id.frag_content, new GiftPagerFragment()).commit();
                    return true;
                case R.id.navigation_fidelite:
                    //TODO
                    return true;
                case R.id.navigation_parrainage:
                    //TODO
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frag_content, new HomePagerFragment()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
