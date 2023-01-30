package com.example.ejemploradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rdbRed, rdbGreen, rdbBlue, rdbYellow;
    RadioGroup rg1;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdbBlue = findViewById(R.id.rdbBlue);
        rdbGreen = findViewById(R.id.rdbGreen);
        rdbRed = findViewById(R.id.rdbRed);
        rdbYellow = findViewById(R.id.rdbYellow);
        rg1 = findViewById(R.id.rg1);
        tvResult = findViewById(R.id.lbResult);
    }

    public void onClickChangeColor(View view){
        int selectedRdb = rg1.getCheckedRadioButtonId(); //Seleccionar el radio button de este grupo;
        switch (selectedRdb){
            case R.id.rdbBlue:
                tvResult.setTextColor(Color.BLUE);
                break;
            case R.id.rdbGreen:
                tvResult.setTextColor(Color.GREEN);
                break;
            case R.id.rdbRed:
                tvResult.setTextColor(Color.RED);
                break;
            case R.id.rdbYellow:
                tvResult.setTextColor(Color.YELLOW);
                break;
        }
    }

    public void onChangeRadioButton(View view){
        int selectedRdb = rg1.getCheckedRadioButtonId(); //Seleccionar el radio button de este grupo;
        switch (selectedRdb){
            case R.id.rdbBlue:
                tvResult.setTextColor(Color.BLUE);
                break;
            case R.id.rdbGreen:
                tvResult.setTextColor(Color.GREEN);
                break;
            case R.id.rdbRed:
                tvResult.setTextColor(Color.RED);
                break;
            case R.id.rdbYellow:
                tvResult.setTextColor(Color.YELLOW);
                break;
        }
    }
}