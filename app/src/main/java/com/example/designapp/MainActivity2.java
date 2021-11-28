package com.example.designapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.designapp.activities.BottomSheetActivity;
import com.example.designapp.fragments.HeartFragment;
import com.example.designapp.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationViewMainActivity;
    private FloatingActionButton fabMainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomNavigationViewMainActivity = findViewById(R.id.bottomNavigationViewMainActivity);
        fabMainActivity = findViewById(R.id.fabMainActivity);

        getSupportActionBar().hide();

        bottomNavigationViewMainActivity.setBackground(null);
        bottomNavigationViewMainActivity.getMenu().getItem(1).setEnabled(false);

        bottomNavigationViewMainActivity.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());

        // Floating Actiong Button Listener
        fabMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "fab clicked..!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity2.this, BottomSheetActivity.class));
            }
        });
        {

        }


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = new Fragment();

        switch (item.getItemId()) {
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.heart:
                fragment = new HeartFragment();
                break;
        }

        if (fragment != null) {
            loadFragment(fragment);
        }

        return true;
    }


    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_host_main_activity, fragment).commit();
    }
}