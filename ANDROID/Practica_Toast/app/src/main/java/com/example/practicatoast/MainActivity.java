package com.example.practicatoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSave, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);
    }

    public void toastOnClick(View view) {
        int idBtn = view.getId();
        if (idBtn == btnSave.getId()){
            messageToast("Guardando");
        } else if (idBtn == btnCancel.getId()){
            messageToast("Cancelando");
        }
    }
    public void messageToast(String toastMessage){
        Toast message = new Toast(getApplicationContext());
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.lyToast));

        TextView txtMsg = (TextView) layout.findViewById(R.id.txtMessage);
        txtMsg.setText(toastMessage);

        message.setDuration(Toast.LENGTH_SHORT);
        message.setView(layout);
        message.show();
    }
}