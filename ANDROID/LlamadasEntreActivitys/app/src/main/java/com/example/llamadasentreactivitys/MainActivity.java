package com.example.llamadasentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeWindow(View view){
        //Permite llamar a otro recurso
        //clase que quiere llamar a ese recurso , nombre de la clase de la segunda ventana a la que quiero llamar
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}