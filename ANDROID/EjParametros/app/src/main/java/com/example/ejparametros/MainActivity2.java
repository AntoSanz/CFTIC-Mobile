package com.example.ejparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView lbClients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lbClients = findViewById(R.id.lbClients);

        ArrayList<String> data = getIntent().getStringArrayListExtra("clients");

        String cadena = " ";
        for (int i = 0; i < data.size(); i++) {
            cadena += data.get(i) + "<BR/>";

        }
        this.lbClients.setText(Html.fromHtml(cadena));
        //this.lbClients.setText(Html.fromHtml("<p><h2>Clientes</h2></p>" + cadena)                 , TextView.BufferType.SPANNABLE);

    }

    public void closeWindow(View view) {
        finish();
    }
}