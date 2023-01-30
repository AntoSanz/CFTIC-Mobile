package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastNormal(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), "Mensaje Toast normal", Toast.LENGTH_SHORT);
        mensaje.show();
    }

    public void toastPosicion(View view) {
        Toast mensaje = Toast.makeText(getApplicationContext(), "Toast con posicion gravity", Toast.LENGTH_SHORT);
        mensaje.setGravity(Gravity.CENTER | Gravity.LEFT, 0, 0);
        mensaje.show();
    }

    public void toastPersonalizado(View view) {
        /*
        Toast mesaje = new Toast(getApplicationContext());

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main);

        (ViewGroup) findViewById(R.id.lytLayout));

        TextView txtMsg = (TextView)layout.findViewById(R.id.txtMensaje);
        txtMsg.setText("Toast Personalizado Icono");

        mensaje.setDuration(Toast.LENGTH_SHORT);
        mensaje.setView(layout);
        mensaje.show();

*/
    }
}