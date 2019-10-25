package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrasi_main);

        Button dafButton = findViewById(R.id.buttonDaf);
        dafButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idaf = new Intent(getBaseContext(), DashboardActivity.class);
                startActivity(idaf);
            }
        });

        Button masButton = findViewById(R.id.buttonMas);
        masButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imas = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(imas);
            }
        });
    }
}
