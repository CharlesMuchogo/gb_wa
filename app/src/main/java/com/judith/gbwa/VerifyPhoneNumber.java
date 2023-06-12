package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class VerifyPhoneNumber extends AppCompatActivity {
    private Spinner countriesList;
    private Button continueButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone_number);
        countriesList = findViewById(R.id.countrySp);
        continueButton = findViewById(R.id.continueButton);

        continueButton.setOnClickListener(view1 -> {
            startActivity(new Intent(VerifyPhoneNumber.this, AutofillCode.class));
            finish();
        });

        ArrayList<String> countries = new ArrayList<>();
        for (Locale locale : Locale.getAvailableLocales()) {
            if (!TextUtils.isEmpty(locale.getDisplayCountry())) {

                if(!countries.contains(locale.getDisplayCountry())){
                    countries.add(locale.getDisplayCountry());
                }
            }
        }

        Collections.sort(countries, (country1, country2) -> country1.compareTo(country2));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                countries
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        countriesList.setAdapter(adapter);
    }
}