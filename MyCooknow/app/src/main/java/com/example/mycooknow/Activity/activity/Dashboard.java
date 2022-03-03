package com.example.mycooknow.Activity.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.mycooknow.Activity.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

    List<SlideModel> slideModelList;
    List<SlideModel> slideModelList1;

    ImageSlider imageSlider, imageSlider1;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    public void onBackPressed() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }
        this.finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(Dashboard.this, drawerLayout, R.string.open, R.string.close);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.moreApp:
                        final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=<seach_query>&c=apps")));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=<search_query>&c=apps")));
                        }


                        break;
                    case R.id.privacy:

                        startActivity(new Intent(Dashboard.this,Privacy.class));

                        break;
                    case R.id.share:
                        Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Download CookNow app");
                        String app_url = " https://play.google.com/store/apps/details?id="+getPackageName();
                        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                        startActivity(Intent.createChooser(shareIntent, "Share via"));


                        break;
                    case R.id.rate:



                        break;
                }
                return true;
            }
        });

        imageSlider = findViewById(R.id.image_slider);
        imageSlider1 = findViewById(R.id.image_slider2);

        addImages();
    }

    void addImages() {
        slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.adobongmanok, "Adobong Manok", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.tinola, "Tinolang Manok", ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModelList, ScaleTypes.FIT);


        slideModelList1 = new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.sinigang, "Sinigang na Baboy", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.bicol_express, "Bicol Express", ScaleTypes.CENTER_CROP));
        imageSlider1.setImageList(slideModelList1, ScaleTypes.FIT);

    }

    public void ViewAll(View view) {
        Intent intent = new Intent(Dashboard.this, Home.class);

        switch (view.getId()) {
            case R.id.manok:
                intent.putExtra("condition", 2);

                break;
            case R.id.porkrecipe:
                intent.putExtra("condition", 1);
                break;
        }

        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item ) || super.onOptionsItemSelected(item);
    }
}
