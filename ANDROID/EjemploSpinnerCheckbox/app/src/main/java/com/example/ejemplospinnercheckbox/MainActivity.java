package com.example.ejemplospinnercheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lbHelloWorld;
    CheckBox chkBgColor, chkTextColor;
    Spinner spColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbHelloWorld = findViewById(R.id.lbHelloWorld);
        spColor = findViewById(R.id.spColor);
        chkBgColor = findViewById(R.id.chkBgColor);
        chkTextColor = findViewById(R.id.chkTextColor);
        //Array de Strings para volcar sobre el spinner;
        String[] spinnerOptions = {getString(R.string.red), getString(R.string.blue)};
        //ArrayAdapter es propia de android. El spinner se carga con un objeto del tipo array adapter
        //recibe tres argumentos (la clase en la que estamos, el tipo de spinner y el array del que recibe los datos;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerOptions);
        spColor.setAdapter(adapter);
    }

    public void showColor(View view) {
        String dato = spColor.getSelectedItem().toString();
        if (chkTextColor.isChecked() && dato.equals(getString(R.string.blue)))
            lbHelloWorld.setTextColor(Color.BLUE);
        if (chkTextColor.isChecked() && dato.equals(getString(R.string.red)))
            lbHelloWorld.setTextColor(Color.RED);
        if (chkBgColor.isChecked() && dato.equals(getString(R.string.blue)))
            lbHelloWorld.setBackgroundColor(Color.BLUE);
        if (chkBgColor.isChecked() && dato.equals(getString(R.string.red)))
            lbHelloWorld.setBackgroundColor(Color.RED);
        if (!chkBgColor.isChecked())
            lbHelloWorld.setBackgroundColor(Color.WHITE);
        if (!chkTextColor.isChecked())
            lbHelloWorld.setTextColor(Color.BLACK);
    }
}