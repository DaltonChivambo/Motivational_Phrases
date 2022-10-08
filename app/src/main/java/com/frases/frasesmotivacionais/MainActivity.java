package com.frases.frasesmotivacionais;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv_frases;
    private Button btn_gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_frases = findViewById(R.id.tv_frases);
        btn_gerarFrases = findViewById(R.id.btn_gerarFrases);

        getSupportActionBar().hide(); //Esconder Barra de cima (Action Bar)

        //evento no button
        btn_gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] frasesMotivacionais = {"aaaaa","bbbb","ccccc"};

                tv_frases.setText(frasesMotivacionais[0]);
            }
        });

    }
}