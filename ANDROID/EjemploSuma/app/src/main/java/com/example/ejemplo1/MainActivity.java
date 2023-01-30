package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText caja1, caja2, caja3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caja1 = findViewById(R.id.txtNumero1);
        caja2 = findViewById(R.id.txtNumero2);
        caja3 = findViewById(R.id.txtResultado);
    }

    public void sumarNumeros(View view) {
        int num1 = Integer.parseInt(this.caja1.getText().toString());
        int num2 = Integer.parseInt(this.caja2.getText().toString());
        int suma = num1 + num2;
        caja3.setText(Integer.toString(suma));

    }
}