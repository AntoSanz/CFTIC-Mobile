package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecicler;
    private RecyclerView.Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecicler = findViewById(R.id.rv1);
        myAdapter = new Adaptador(ClientData());

        myRecicler.setHasFixedSize(true);
        myRecicler.setLayoutManager(new LinearLayoutManager(this));
        myRecicler.setAdapter(myAdapter);

    }

    public List<Clientes> ClientData() {
        List<Clientes> ClientList = new ArrayList<>();
        ClientList.add(new Clientes("Rey", 87));
        ClientList.add(new Clientes("Gil", 75));
        ClientList.add(new Clientes("Alonso", 75));
        ClientList.add(new Clientes("Tovar",21));
        ClientList.add(new Clientes("Cerezo", 81));
        ClientList.add(new Clientes("Arroyo",35));
        ClientList.add(new Clientes("Sala",64));
        ClientList.add(new Clientes("Martín",32));
        ClientList.add(new Clientes("Jimeno",34));
        ClientList.add(new Clientes("Muñoz",54));
        ClientList.add(new Clientes("Negro",23));
        ClientList.add(new Clientes("Fernández",19));
        return ClientList;
    }
}