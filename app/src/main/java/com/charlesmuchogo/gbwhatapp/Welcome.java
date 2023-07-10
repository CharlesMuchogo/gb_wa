package com.charlesmuchogo.gbwhatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
private Button agreeAndContinueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        MyAds ads = new MyAds(this);
        agreeAndContinueButton = findViewById(R.id.agreeAndContinueButton);
        agreeAndContinueButton.setOnClickListener(view1 -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(Welcome.this, VerifyPhoneNumber.class));
            finish();
        });

    }
}