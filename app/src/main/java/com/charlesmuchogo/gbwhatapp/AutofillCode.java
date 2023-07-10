package com.charlesmuchogo.gbwhatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;

public class AutofillCode extends AppCompatActivity {
    private Button continueButton;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autofill_code);
        continueButton = findViewById(R.id.continueButton);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);


        continueButton.setOnClickListener(view1 -> {
            startActivity(new Intent(AutofillCode.this, Restore.class));
            finish();
        });

        new Handler().postDelayed(() -> {
            et1.setText("8");
            et2.setText("4");
            et3.setText("1");
            et4.setText("2");
            et5.setText("4");
            et6.setText("5");
            MyAds ads = new MyAds(this);
            ads.ShowInterestialAds();
        }, 3000);
    }
}