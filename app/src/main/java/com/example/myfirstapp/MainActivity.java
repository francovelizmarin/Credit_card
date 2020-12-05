package com.example.myfirstapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstapp.modelo.AdmnSQLiteOpenHelper;
import com.example.myfirstapp.modelo.Cliente;

public class  MainActivity extends AppCompatActivity  {

    Cliente E1 = new Cliente ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Button btn_Buscar = findViewById(R.id.btnMainBuscar);

        Button btn_Registrar  = (Button) findViewById(R.id.btnMainRegistrar);
        btn_Registrar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                AdmnSQLiteOpenHelper admin = new AdmnSQLiteOpenHelper(MainActivity.this, "administrador", null, 1);
                final EditText nombre = (EditText) findViewById(R.id.etMainNombre);
                SQLiteDatabase baseDeDatos = admin.getWritableDatabase();

                ContentValues registros = new ContentValues();
                registros.put("nombre", E1.getNombre());
                registros.put("apellidos", E1.getApellido());
                registros.put("numerodetarjeta", E1.getnumeroDeTarjeta());

              long resultado =  baseDeDatos.insert("clientes", null, registros);

              Cursor filas = baseDeDatos.rawQuery("SELECT numerodetarjeta FROM clientes", null);

              if(filas.moveToFirst()) {
                  do {
                  } while (filas.moveToNext());
              }
                final EditText apellido = (EditText) findViewById(R.id.etMainApellido);
                final EditText numerodetarjeta = (EditText) findViewById(R.id.etMainNumTarjeta);
                final EditText mes = (EditText) findViewById(R.id.etMainMes);
                final EditText año = (EditText) findViewById(R.id.etMainAño);
                final EditText codigo = (EditText) findViewById(R.id.etMainCodigo);
                final EditText calleynumero = (EditText) findViewById(R.id.etMainCalleyNum);
                final EditText ciudad = (EditText) findViewById(R.id.etMainCiudad);
                final EditText estado = (EditText) findViewById(R.id.etMainEstado);
                final EditText codigopost = (EditText) findViewById(R.id.etMainCodPost);

                E1.setNombre(nombre.getText().toString());
                E1.setApellido(apellido.getText().toString());
                E1.setNumeroDeTarjeta(Integer.parseInt(numerodetarjeta.getText().toString()));
                E1.setMes(mes.getInputType());
                E1.setAño(año.getInputType());
                E1.setCodigo(Integer.parseInt(codigo.getText().toString()));
                E1.setCalle(calleynumero.getText().toString());
                E1.setCiudad(ciudad.getText().toString());
                E1.setEstado(estado.getText().toString());


            }
               // Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                //detailIntent.putExtra( "el_nombre", E1.getNombre());
                //detailIntent.putExtra( "el_apellido", E1.getApellido());
                //detailIntent.putExtra( "el_numero_de_tarjeta", E1.getnumeroDeTarjeta());
                // Cliente cliente = new Cliente();
            }
    }} } }
