package com.frases.frasesmotivacionais;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        getSupportActionBar().hide(); //Esconder Barr de cima (Action Bar)

    }
}