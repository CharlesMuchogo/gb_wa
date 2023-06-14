package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import com.google.android.gms.ads.AdView;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

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