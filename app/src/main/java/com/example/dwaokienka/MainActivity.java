package com.example.dwaokienka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void otworz2Okno(View view) {
        Intent drugieOkno = new Intent(this, DrugaActivity.class);
        EditText wiadomosc = findViewById(R.id.wiadomosc);
        String wiadomoscStr = wiadomosc.getText().toString();
        drugieOkno.putExtra("wiadomosc", wiadomoscStr);
        startActivity(drugieOkno);
    }
}