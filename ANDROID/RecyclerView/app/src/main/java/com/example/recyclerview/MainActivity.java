package com.example.recyclerview;

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
        myRecicler.setHasFixedSize(true);
        myRecicler.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new Adaptador(ClientData());
        myRecicler.setAdapter(myAdapter);
    }
    public List<Clientes> ClientData() {
        List<Clientes> ClientList = new ArrayList<>();
        ClientList.add(new Clientes("Rey"));
        ClientList.add(new Clientes("Gil"));
        ClientList.add(new Clientes("Alonso"));
        ClientList.add(new Clientes("Tovar"));
        ClientList.add(new Clientes("Cerezo"));
        ClientList.add(new Clientes("Arroyo"));
        ClientList.add(new Clientes("Sala"));
        ClientList.add(new Clientes("Martín"));
        ClientList.add(new Clientes("Jimeno"));
        ClientList.add(new Clientes("Muñoz"));
        ClientList.add(new Clientes("Negro"));
        ClientList.add(new Clientes("Fernández"));
        return ClientList;
    }

}
