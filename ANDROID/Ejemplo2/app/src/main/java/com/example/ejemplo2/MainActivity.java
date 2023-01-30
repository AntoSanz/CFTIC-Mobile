package com.example.ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText caja1, caja2;
    TextView lbResult1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caja1 = findViewById(R.id.txtText1);
        caja2 = findViewById(R.id.txtText2);
        lbResult1 = findViewById(R.id.lbResult1);
    }
    
    public void generateText(View view) {
        String text1 = caja1.getText().toString();
        String text2 = caja2.getText().toString();
        String textResult = text1 + " " + text2;
        String textUpper = textResult.toUpperCase();
        lbResult1.setText(textUpper);
        clearTextBox();
    }

    public void clearTextBox(){
        caja1.setText("");
        caja2.setText("");
    }
}
