package lang.david.android.ihm.polytech.tboth;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import lang.david.android.ihm.polytech.tboth.gift.GiftSection;
import lang.david.android.ihm.polytech.tboth.home.HomeSection;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    public MainActivity() {

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager.beginTransaction().replace(R.id.frag_content, new HomeSection()).commit();
                    return true;
                case R.id.navigation_cadeaux:
                    fragmentManager.beginTransaction().replace(R.id.frag_content, new GiftSection()).commit();
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
        fragmentManager.beginTransaction().replace(R.id.frag_content, new HomeSection()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
