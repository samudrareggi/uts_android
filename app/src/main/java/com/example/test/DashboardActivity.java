package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main);

        ImageButton elegantButton = findViewById(R.id.elegantBt);
        elegantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iele = new Intent(getBaseContext(), ElegantActivity.class);
                startActivity(iele);
            }
        });

        ImageButton royalButton = findViewById(R.id.royalBt);
        royalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iroy = new Intent(getBaseContext(), RoyalblueActivity.class);
                startActivity(iroy);
            }
        });
    }
}
