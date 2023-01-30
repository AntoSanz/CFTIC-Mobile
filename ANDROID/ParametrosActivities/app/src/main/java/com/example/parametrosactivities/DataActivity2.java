package com.example.parametrosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class DataActivity2 extends AppCompatActivity {
    TextView lbData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);
        lbData = findViewById(R.id.lbData);

        Bundle bundle = getIntent().getExtras();
        String dataName = bundle.getString("name");
        String dataLastName = bundle.getString("lastName");
        String dataAge = bundle .getString("age");
        lbData.setText(Html.fromHtml( dataName + "<br/>" + dataLastName + "<br/>" + dataAge));
    }

    public void closeWindow(View view){
        finish();
    }
}