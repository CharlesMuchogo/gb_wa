package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.ads.AdView;

public class TwoStepSuccess extends AppCompatActivity {
    private Button continueButton;
    private AdView mAdView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_step_success);

        continueButton = findViewById(R.id.continueButton);
        mAdView = findViewById(R.id.adView);
        MyAds ads = new MyAds(this);

        ads.ShowBannerAds(mAdView);

        continueButton.setOnClickListener(view1 -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(TwoStepSuccess.this, HomePage.class));
            finish();
        });
    }
}