package com.example.gmiembrosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;

public class Ajuste extends AppCompatActivity {
    private String color;
    private RadioButton amarillo, normal;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuste);
        amarillo = (RadioButton) findViewById(R.id.rdAmarillo);
        normal = (RadioButton) findViewById(R.id.Normal);
        button = (Button) findViewById(R.id.btnAtras);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ii = new Intent(Ajuste.this, MainActivity.class);
               ii.putExtra("background", color);
               startActivity(ii);
           }
       });
    }
    public void eventoClic (View view){

        switch (view.getId())
        {
            case R.id.rdAmarillo:
                color = "#FDF6B1";
            break;
            case R.id.Normal:
                color = "#F4F5F6";
                break;
        }
    }


}
