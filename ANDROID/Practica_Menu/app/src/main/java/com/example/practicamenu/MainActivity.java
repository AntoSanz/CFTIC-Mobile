package com.example.practicamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spMenu;
    CheckBox chkOption1, chkOption2, chkOption3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // String[] spinnerOptions = {getString(R.string.red), getString(R.string.blue)};
        spMenu = findViewById(R.id.spMenu);
        chkOption1 = findViewById((R.id.chkOption1));
        chkOption2 = findViewById(R.id.chkOption2);
        chkOption3 = findViewById(R.id.chkOption3);


    }
    public void  openNewWindow(View view){

    }
}