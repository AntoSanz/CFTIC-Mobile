package com.example.parametrosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtName, txtLastName, txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);
        txtAge = findViewById(R.id.txtAge);
    }

    public void getMainData(View view) {
        //String dataArray[] = {txtName.toString(), txtLastName.toString(), txtAge.toString()};
        //Intent i = new Intent(this, MainActivity2.class);
        Intent i = new Intent(this, DataActivity2.class);
        i.putExtra("name", txtName.getText().toString());
        i.putExtra("lastName", txtLastName.getText().toString());
        i.putExtra("age", txtAge.getText().toString());
        clearInputs();
        startActivity(i);
    }

    public  void clearInputs() {
        txtName.setText("");
        txtAge.setText("");
        txtLastName.setText("");
    }
}