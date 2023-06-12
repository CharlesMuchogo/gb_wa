package com.judith.gbwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AutofillCode extends AppCompatActivity {
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autofill_code);
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(view1 -> {
            startActivity(new Intent(AutofillCode.this, Restore.class));
            finish();
        });
    }
}