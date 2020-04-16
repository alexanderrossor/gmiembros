package com.example.gmiembrosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Segundo extends AppCompatActivity {

    private TextView nombre, ciudad, matricula, expresion;
    private ImageView imgFoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        nombre = (TextView) findViewById(R.id.txNombre);
        ciudad = (TextView) findViewById(R.id.txciudad);
        matricula = (TextView) findViewById(R.id.txMatricula);
        expresion = (TextView) findViewById(R.id.txExpresion);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);


        imgFoto.setImageResource(R.drawable.rosa1);

        String name1 = getIntent().getStringExtra("nombre");
        nombre.setText(name1);
        String ciudade = getIntent().getStringExtra("ciudad");
        ciudad.setText(ciudade);
        String matric = getIntent().getStringExtra("matricula");
        matricula.setText(matric);
        String expres = getIntent().getStringExtra("expresion");
        expresion.setText(expres);

    }
}
