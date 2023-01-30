package com.example.ejemploradiobutton2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inputName, lbResult;
    RadioGroup rgCase, rgColor;
    RadioButton rdbUpperCase, rdbLowerCase, rdbBlue, rdbRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgCase = findViewById(R.id.rgCase);
        rgColor = findViewById(R.id.rgColor);

        rdbUpperCase = findViewById(R.id.rdbUpperCase);
        rdbLowerCase = findViewById(R.id.rdbLowerCase);
        rdbRed = findViewById(R.id.rdbRed);
        rdbBlue = findViewById(R.id.rdbBlue);

        inputName = findViewById(R.id.inputName);
        lbResult = findViewById(R.id.lbResult);
    }

    @SuppressLint("SetTextI18n")
    public void onClickSendButton(View view) {
        lbResult.setText(inputName.getText().toString());
        int selectedRdbCase = rgCase.getCheckedRadioButtonId();
        int selectedRdbColor = rgColor.getCheckedRadioButtonId();

        if (lbResult.length() == 0) lbResult.setText(R.string.no_text);

        switch (selectedRdbCase) {
            case R.id.rdbUpperCase:
                lbResult.setAllCaps(true);
                break;
            case R.id.rdbLowerCase:
                lbResult.setAllCaps(false);
                break;
        }

        switch (selectedRdbColor) {
            case R.id.rdbBlue:
                lbResult.setTextColor(Color.BLUE);
                break;

            case R.id.rdbRed:
                lbResult.setTextColor(Color.RED);
                break;
        }
    }
}