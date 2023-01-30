package com.example.ejparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  showData(View view){
        Intent i = new Intent(this, MainActivity2.class);
        ArrayList<String> clientsList = new ArrayList();

        clientsList.add("Alonso");
        clientsList.add("Tovar");
        clientsList.add("Rey");

        i.putStringArrayListExtra("clients", clientsList);

        startActivity(i);
    }
}