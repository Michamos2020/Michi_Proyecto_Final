package com.example.michi_proyecto_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Planetas extends AppCompatActivity {
    private MediaPlayer makemake, Europa,Encelado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetas);
        makemake = MediaPlayer.create(this, R.raw.makemake);
        Europa= MediaPlayer.create(this, R.raw.europa);
        Encelado= MediaPlayer.create(this, R.raw.encelado);
    }
    public void MensajeMakemake(View view){
        Toast.makeText(this, "Soy un planeta enano", Toast.LENGTH_SHORT).show();
        makemake.start();

    }
    public void MensajeEuropa(View view){
        Toast.makeText(this, "Soy un satèlite", Toast.LENGTH_SHORT).show();
        Europa.start();

    }
    public void MensajeEncelado(View view) {
        Toast.makeText(this, "Soy un satélite", Toast.LENGTH_SHORT).show();
        Encelado.start();
    }
    public void Regresa(View view) {
            Intent pantallaPrincipal = new Intent(this, MainActivity.class);
            startActivity(pantallaPrincipal);
        }
    }