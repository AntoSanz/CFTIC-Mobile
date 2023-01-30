package com.example.cuadrosdedialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnMessage, btnAccept, btnMultipleSelect, btnSimpleSelect;
    TextView txtResp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResp = findViewById(R.id.txtResp);
        btnMessage = findViewById(R.id.btnMessage);
        btnAccept = findViewById(R.id.btnAccept);
        btnMultipleSelect = findViewById(R.id.btnMultipleSelect);
        btnSimpleSelect = findViewById(R.id.btnSimpleSelect);

        btnMessage.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                mostrarDialogo();
            }
        });
        btnAccept.setOnClickListener((new OnClickListener() {
            public void onClick(View v) {
                mostrarDialogoAceptarCancelar();
            }
        }));
        btnSimpleSelect.setOnClickListener((new OnClickListener() {
            public void onClick(View v) {
                mostrarDialogoLista();
            }
        }));
        btnMultipleSelect.setOnClickListener((new OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogoMultiple();
            }
        }));

    }

    void mostrarDialogo() {
        DialogMessage mensajesimple = new DialogMessage();
        mensajesimple.show(getFragmentManager(), "Cuadro simple");
    }
    void mostrarDialogoAceptarCancelar(){
        DialogConfirm mensajeAceptarCancelar = new DialogConfirm();
        mensajeAceptarCancelar.show(getFragmentManager(), "Cuadro Aceptar Cancelar");
    }
    void mostrarDialogoLista(){
        DialogList mensajeList = new DialogList();
        mensajeList.show(getFragmentManager(), "Selección simple");

    }

    void mostrarDialogoMultiple(){
        MultipleChoiceItems mensajeMultiple = new MultipleChoiceItems();
        mensajeMultiple.show(getFragmentManager(), "Selección Multiple");
    }
    public void acceptAction() {
        txtResp.setText("Has pulsado en ACEPTAR");
    }
    public void cancelAction(){
        txtResp.setText("Has pulsado en CANCELAR");
    }
    public void capturarSeleccionado(String dato){
        txtResp.setText("Equipo campeon "+ dato);
    };
    public void capturarDatos(String dato) {
        txtResp.setText(dato);
    }
}