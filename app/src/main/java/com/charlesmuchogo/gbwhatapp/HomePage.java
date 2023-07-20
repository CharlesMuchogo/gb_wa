package com.charlesmuchogo.gbwhatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hbb20.CCPCountry;
import com.hbb20.CountryCodePicker;

public class HomePage extends AppCompatActivity {
private Button button1;
private Button button2;
private Button button3;
private CountryCodePicker countryCode;
private Button button4;
private Button button5;
private Button button6;
private EditText phoneNumberField;
private EditText messageField;
private Button SendMessageBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        MyAds ads = new MyAds(this);

        phoneNumberField = findViewById(R.id.phoneNumber);
        messageField = findViewById(R.id.messageField);

        SendMessageBtn = findViewById(R.id.SendMessageBtn);
        countryCode = findViewById(R.id.countryCode);


        SendMessageBtn.setOnClickListener(view -> {
            if (!phoneNumberField.getText().toString().isEmpty() && !messageField.getText().toString().isEmpty() ) {

                PackageManager pm = this. getPackageManager();
                try {
                    countryCode.registerCarrierNumberEditText(phoneNumberField);
                    String phoneNumber = countryCode.getFullNumber();

                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+phoneNumber.replaceAll(" ", "") +"&text="+messageField.getText().toString()));
                    startActivity(sendIntent);

                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(this,"it may be you don't have Whatsapp",Toast.LENGTH_LONG).show();

                }
            }else{
                Toast.makeText(this,"Both phone number and message must not be empty",Toast.LENGTH_LONG).show();

            }

        });


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