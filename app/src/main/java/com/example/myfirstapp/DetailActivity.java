package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString( "el_nombre");
        String apellido = datos.getString( "el_apellido");
        String numerodetarjeta = datos.getString( "el_numero_de_tarjeta");
    }
}