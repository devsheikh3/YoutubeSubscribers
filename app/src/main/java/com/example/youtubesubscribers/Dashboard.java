package com.example.youtubesubscribers;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public class Dashboard extends AppCompatActivity {

    BottomNavigationView navigation;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        navigation=(BottomNavigationView)findViewById(R.id.navigationid);
        navigation.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.navfragid,new Campaign()).commit();

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment=null;

            switch(menuItem.getItemId()){

                case R.id.campaign:
                    selectedFragment=new Campaign();
                    break;
                case R.id.subscribe:
                    selectedFragment=new Subscribe();
                    break;
                case R.id.earn:
                    selectedFragment=new EarnCoin();
                    break;
                case R.id.more:
                    selectedFragment=new More();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.navfragid,selectedFragment).commit();

            return true;
        }
    };



}
