package com.example.gmiembrosapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Detalle extends AppCompatActivity {
    private TextView nombre, ciudad, matricula, expresion;
    private ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle);
        nombre = (TextView) findViewById(R.id.txNombre);
        ciudad = (TextView) findViewById(R.id.txciudad);
        matricula = (TextView) findViewById(R.id.txMatricula);
        expresion = (TextView) findViewById(R.id.txExpresion);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);


         imgFoto.setImageResource(R.drawable.alexander);

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
