package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
private Button button1;
private Button button2;
private Button button3;
private Button button4;
private Button button5;
private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        MyAds ads = new MyAds(this);


         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);
         button5 = findViewById(R.id.button5);
         button6 = findViewById(R.id.button6);

        button1.setOnClickListener(v -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(HomePage.this, ConnectionError.class));});

        button2.setOnClickListener(v -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(HomePage.this, ConnectionError.class));
        });

        button3.setOnClickListener(v -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(HomePage.this, ConnectionError.class));
        });

        button4.setOnClickListener(v -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(HomePage.this, ConnectionError.class));
        });

        button5.setOnClickListener(v -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(HomePage.this, ConnectionError.class));});

        button6.setOnClickListener(v -> {
            ads.ShowInterestialAds();
            startActivity(new Intent(HomePage.this, ConnectionError.class));
        });
    }


}