package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TwoStepVerification extends AppCompatActivity {
private Button continueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_step_verification);   continueButton = findViewById(R.id.continueButton);

        continueButton.setOnClickListener(view1 -> {
            MyAds ads = new MyAds(this);
            ads.ShowInterestialAds();
            startActivity(new Intent(TwoStepVerification.this, TwoStepSuccess.class));
            finish();
        });

    }
}