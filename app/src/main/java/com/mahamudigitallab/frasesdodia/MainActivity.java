package com.mahamudigitallab.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Nunca se afaste de seus sonhos porque se eles se forem , você estará vivendo mas terá deixado de existir",
                "Deus ajuda quem cedo madruga, acorda vagabundo!",
                "Falar das pinga que eu tomo é fácil, dificil é fazer o que eu faço!",
                "Nunca é tarde para começar!",
                "O sucesso não tem limite"

        };

        int numero = new Random().nextInt(5);

        TextView texto = findViewById(R.id.TextResultado);
        texto.setText(frases[numero]);
    }
}