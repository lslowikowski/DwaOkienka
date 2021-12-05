package com.example.dwaokienka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DrugaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga);
        Intent drugieOkno = getIntent();
        String wiadomoscStr = drugieOkno.getStringExtra("wiadomosc");
        TextView odebranaWiadomosc = findViewById(R.id.odebrana_wiadomosc);
        odebranaWiadomosc.setText(wiadomoscStr);
    }

    public void powrotDo1(View view) {
        finish();
    }
}