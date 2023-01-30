package com.example.ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputNumber;
    TextView lbNota;
    final String INSF = "Insuficiente";
    final String SUF = "Suficiente";
    final String BIEN = "Bien";
    final String NOT = "Notable";
    final String SOBR = "Sobresaliente";
    final String ERR1 = "La nota debe estar entre 0 y 10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNumber = findViewById(R.id.inputNumber);
        lbNota = findViewById(R.id.lbNota);
    }

    public void calcGrade(View view) {
        int grade = Integer.parseInt(inputNumber.getText().toString());
        if (grade > 10 || grade < 0) {
            lbNota.setText(ERR1);
        } else {
            if (grade < 5) {
                lbNota.setText(INSF);
                //lbNota.setTextColor(Color.parseColor(cInsf));
            } else if (grade == 5) {
                lbNota.setText(SUF);
                //lbNota.setTextColor(Color.parseColor(cSobr));
            } else if (grade < 5 && grade < 7) {
                lbNota.setText(BIEN);
                //lbNota.setTextColor(Color.parseColor(cSobr));
            } else if (grade <= 7 && grade <= 9) {
                lbNota.setText(NOT);
                //lbNota.setTextColor(Color.parseColor(cSobr));
            } else if (grade == 10) {
                lbNota.setText(SOBR);
                lbNota.setTextColor(Color.BLUE);
            }
        }
    }
}