package com.cursodeandroid.caraoucoroa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class detalhe extends AppCompatActivity {

    private ImageView botaoVoltar;
    private ImageView moeda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        botaoVoltar = findViewById(R.id.botaoVoltaId);
        moeda = findViewById(R.id.moedaid);

        Bundle extra = getIntent().getExtras();

        if (extra != null) {
            String opcaoEscolhida = extra.getString("opcao");

            if (opcaoEscolhida.equals("cara")) {
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));

            } else {

                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));

            }
        }

            botaoVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent itent = new Intent(detalhe.this, MainActivity.class);

                    startActivity(itent);
                }
            });


        }
    }