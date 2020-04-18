package com.example.gmiembrosapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private String color;
    private CardView primero, segundo, tercero, ajuste;
    private String back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero = (CardView) findViewById(R.id.carPrimero);
        segundo = (CardView) findViewById(R.id.carSegundo);
        tercero = (CardView) findViewById(R.id.carTercero);
        ajuste = (CardView) findViewById(R.id.carAjuste);


        if (getIntent().getStringExtra("background")==null)
        {
            color = "#F4F5F6";
        }

        else
            {
            color = getIntent().getStringExtra("background");
        }

        primero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, Detalle.class);
                ii.putExtra("imagen", R.drawable.alexander);
                ii.putExtra("nombre","Alexander Rosso");
                ii.putExtra("ciudad","Azua, Republica Dominicana");
                ii.putExtra("matricula", "CF-8233");
                ii.putExtra("expresion", "Alexander nacio el 25 de octubre del año 1985, estuddia Licenciatura en informatica en UASD, su pasatiempo favorito es el Basquetbol");
                ii.putExtra("background", color);
                startActivity(ii);
            }
        });
        segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, Segundo.class);
                ii.putExtra("imagen", R.drawable.rosa1);
                ii.putExtra("nombre","Rosa Julia Morales");
                ii.putExtra("ciudad","Santo Domingo, Republica Dominicana");
                ii.putExtra("matricula", "CB-5890");
                ii.putExtra("expresion", "Nacida en la Ciudad de Santo Domingo, apasionada con enseñar ingles a los niños para que aprendan de otra cultura por medio a un idioma, estudiante de termino de Lic. Informática, mi pasatiempo favorito es leer. Una de mis filosofías en la vida es ser positiva siempre");
                ii.putExtra("background", color);
                startActivity(ii);
            }
        });
        tercero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, Main2Activity.class);
                ii.putExtra("imagen", R.drawable.victor);
                ii.putExtra("nombre","Victor Campusano");
                ii.putExtra("ciudad","Santo Domingo, Republica Dominicana");
                ii.putExtra("matricula", "BB-7860");
                ii.putExtra("expresion", "siempre");
                ii.putExtra("background", color);
                startActivity(ii);
            }
        });
        ajuste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, Ajuste.class);
                startActivity(ii);
            }
        });
    }

}
