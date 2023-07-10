package com.charlesmuchogo.gbwhatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdView;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

public class VerifyPhoneNumber extends AppCompatActivity {
    private Button continueButton;
    private AdView mAdView;
    private EditText phoneNumber;
    private PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone_number);
        MyAds ads = new MyAds(this);

        continueButton = findViewById(R.id.continueButton);
        phoneNumber = findViewById(R.id.phoneNumber);
        mAdView = findViewById(R.id.adView);
        ads.ShowBannerAds(mAdView);

        continueButton.setOnClickListener(view1 -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(VerifyPhoneNumber.this, AutofillCode.class));

        });

    }
}