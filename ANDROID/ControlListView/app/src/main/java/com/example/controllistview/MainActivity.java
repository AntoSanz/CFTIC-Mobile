package com.example.controllistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] ciudades = { "Madrid", "Valencia", "Sevilla", "Zaragoza",
            "Malaga", "Gijón", "Palma", "Bilbao", "Alicante", "Vigo" };
    private String[] habitantes = { "3233527", "797028", "702355",
            "679624", "567433", "441354", "407648", "351629",
            "334678", "297355" };

    ListView listView1;
    TextView lbMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = findViewById(R.id.lv1);
        lbMensaje = findViewById(R.id.lbMensaje);

        //Creo un array adapter para cargar los datos del array ciudades en el listview desde los arrays.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ciudades);
        this.listView1.setAdapter(adapter);

        this.listView1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id){
                lbMensaje.setText("La poblacion de " + listView1.getItemAtPosition(position) + " es " + habitantes[position]);
            }
        });
    }
}