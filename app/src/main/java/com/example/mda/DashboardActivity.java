package com.example.mda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.mda.databinding.ActivityDashboardBinding;
import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ActivityDashboardBinding binding;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_dashboard);
        drawerLayout=binding.drawerlayout;
        navigationView=binding.navView;
        toolbar=binding.toolbar;
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        navigationView.bringToFront();

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case  R.id.nav_home:break;
            case R.id.nav_profile:
                Toast.makeText(DashboardActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_aboutus:
                startActivity(new Intent(DashboardActivity.this,AboutUsActivity.class));
                break;
            case R.id.nav_contactus:
                Toast.makeText(DashboardActivity.this, "Contact us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_logout:
                startActivity(new Intent(DashboardActivity.this,LoginActivity.class));
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }

    public void gotoservices(View view) {
        startActivity(new Intent(DashboardActivity.this,ServicesActivity.class));
    }

    public void gototrainings(View view) {
        startActivity(new Intent(DashboardActivity.this,TrainingActivity.class));

    }

    public void gotowebhosting(View view) {
        startActivity(new Intent(DashboardActivity.this,WebHostingActivity.class));
    }

    public void gotoaboutus(View view) {
        startActivity(new Intent(DashboardActivity.this,AboutUsActivity.class));
    }
}