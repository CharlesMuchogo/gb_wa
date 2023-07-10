package com.charlesmuchogo.gbwhatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class Restore extends AppCompatActivity {
private Button restore;
private Button skip;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore);
        restore = findViewById(R.id.restore);
        skip = findViewById(R.id.skip);
        MyAds ads = new MyAds(this);


        restore.setOnClickListener(view1 -> {
            ads.ShowInterestialAds();
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setView(R.layout.dialog_progress); // Set the custom layout

            AlertDialog dialog = alertDialog.create();
            dialog.show();

            new Handler().postDelayed(() -> {
                dialog.dismiss();
                startActivity(new Intent(Restore.this, TwoStepVerification.class));
            }, 5000);
        });


        skip.setOnClickListener(view1 -> {
            startActivity(new Intent(Restore.this, TwoStepVerification.class));

        });
    }
}