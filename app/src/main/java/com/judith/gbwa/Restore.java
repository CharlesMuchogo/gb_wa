package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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


        restore.setOnClickListener(view1 -> {
            startActivity(new Intent(Restore.this, TwoStepVerification.class));
            finish();
        });
        skip.setOnClickListener(view1 -> {
            startActivity(new Intent(Restore.this, TwoStepVerification.class));
            finish();
        });
    }
}