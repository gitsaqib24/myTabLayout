package com.example.mytablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = findViewById(R.id.tab1);
        viewPager = findViewById(R.id.viewpager1);

        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter); //set adapter to viewpager

        tab.setupWithViewPager(viewPager); //synchronize with viewpager to tab



    }
}