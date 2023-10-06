package com.example.michi_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin1=(Spinner) findViewById(R.id.spinner1);
        String [] opciones = {"Michi espacial","Planetas","Michi Apolo"};
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this, R.layout.spinner_cambios,opciones);
        spin1.setAdapter(adapter);
    }
    public void Ejecutar(View view){
        String seleccion= spin1.getSelectedItem().toString();
        if (seleccion.equals("Michi espacial")) {
            Intent michi_espacial= new Intent(this, MichiEspacial.class);
            startActivity(michi_espacial);
        } else if (seleccion.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Por favor seleccione una opciòn", Toast.LENGTH_SHORT).show();

        } else if (seleccion.equals("Planetas")) {
            Intent pantalla_planetas= new Intent(this, Planetas.class);
            startActivity(pantalla_planetas);

        } else if (seleccion.equals("Michi Apolo")) {
            Intent pantalla_Apolo= new Intent(this, Michi_Apolo.class);
            startActivity(pantalla_Apolo);

        }else
            spin1.requestFocus();

    }
}