package com.example.michi_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado_michiEspacial extends AppCompatActivity {
    private TextView txtRespuestaDato;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_michi_espacial);


        txtRespuestaDato = (TextView) findViewById(R.id.txt_resultado);

        String DatoRecibido = getIntent().getStringExtra("enviarDato");
        txtRespuestaDato.setText("Su resultado es: " + DatoRecibido);


    }

    //metodo para regresar
    public void Regresar(View view) {
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);
    }
}
