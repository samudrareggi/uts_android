package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        Button logButton = findViewById(R.id.buttonLog);
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilog = new Intent(getBaseContext(), DashboardActivity.class);
                startActivity(ilog);
            }
        });

        Button regButton = findViewById(R.id.buttonReg);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ireg = new Intent(getBaseContext(), RegistrasiActivity.class);
                startActivity(ireg);
            }
        });
    }
}
