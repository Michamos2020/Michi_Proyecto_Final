package com.example.michi_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MichiEspacial extends AppCompatActivity {
    private EditText txt_peso;
    private Spinner sp2;
    private Button btn_enviar;
    public void Regresar (View view){
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_michi_espacial);
        txt_peso = (EditText) findViewById(R.id.txt_peso);
        sp2 = (Spinner) findViewById(R.id.spinner_espacial);
        btn_enviar = (Button) findViewById(R.id.btn_enviar);
        String[] planetas = {"Makemake", "Europa", "Encelado"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, R.layout.spinner_cambios, planetas);
        sp2.setAdapter(adapter3);
        String datoIngresado = txt_peso.getText().toString();


        String seleccion = sp2.getSelectedItem().toString();
        Double txtPesoMichi_int = Double.parseDouble(datoIngresado);


    }
//metodo de enviar
        public void Enviar(View view){
            String datoIngresado = txt_peso.getText().toString();
            String seleccion = sp2.getSelectedItem().toString();
            Double txtPesoMichi_int = Double.parseDouble(datoIngresado);
            if (seleccion.equals("Makemake")) {
                Double resultado_Makemake = txtPesoMichi_int * .5;
                Double resultado_fuerza = resultado_Makemake * .5;
                String resultado_mostrar = String.valueOf(resultado_Makemake);
                String resultado_mostrar2 = String.valueOf(resultado_fuerza);
                String resultado_definitivo = "Su michi pesa en Europa: " + resultado_mostrar + "Y la fuerza de su Michi es: " + resultado_mostrar2 + "N";
                Intent pantallaResultado = new Intent(this, Resultado_michiEspacial.class);
                pantallaResultado.putExtra("enviarDato",resultado_definitivo);
                startActivity(pantallaResultado);
            } else if (seleccion.equals("Europa")) {
                Double resultado_Europa = txtPesoMichi_int * 1.314;
                Double resultado_fuerza = resultado_Europa * 1.314;
                String resultado_mostrar = String.valueOf(resultado_Europa);
                String resultado_mostrar2 = String.valueOf(resultado_fuerza);
                String resultado_definitivo = "Su michi pesa en Europa: " + resultado_mostrar + "Y la fuerza de su Michi es: " + resultado_mostrar2 + "N";
                Intent pantallaResultado = new Intent(this, Resultado_michiEspacial.class);
                pantallaResultado.putExtra("enviarDato",resultado_definitivo);
                startActivity(pantallaResultado);
            } else if (seleccion.equals("Encelado")) {
                Double resultado_Encelado = txtPesoMichi_int * 0.111;
                Double resultado_fuerza = resultado_Encelado * 0.111;
                String resultado_mostrar = String.valueOf(resultado_Encelado);
                String resultado_mostrar2 = String.valueOf(resultado_fuerza);
                String resultado_definitivo = "Su michi pesa en Encelado: " + resultado_mostrar + "Y la fuerza de su Michi es: " + resultado_mostrar2 + "N";
                Intent pantallaResultado = new Intent(this, Resultado_michiEspacial.class);
                pantallaResultado.putExtra("enviarDato",resultado_definitivo);
                startActivity(pantallaResultado);
            }

        }
    }




