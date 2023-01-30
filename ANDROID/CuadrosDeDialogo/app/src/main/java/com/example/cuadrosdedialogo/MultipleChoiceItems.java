package com.example.cuadrosdedialogo;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class MultipleChoiceItems  extends DialogFragment{


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //PARA PODER MOSTRAR UN MENSAJE DE SELECCIÓN MULTIPLE,
        //DEBEMOS CREARNOS LA LISTA DE ELEMENTOS
        //QUE DESEAMOS VISUALIZAR EN EL MENSAJE
        //Y CREARNOS OTRO ARRAY DE BOOLEAN
        //CON LAS OPCIONES QUE DESEAMOS QUE APAREZCAN
        //SELECCIONADAS, EN NUESTRO EJEMPLO
        //NO APARECERÁ NINGUNA OPCIÓN SELECCIONADA.
        final String[] elementos = {"Español", "Inglés", "Francés", "Alemán"};
        final boolean[] opciones = {false, false, false, false};

        return new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.ic_menu_alarm)
                .setTitle("¿Qué idiomas hablas?")

                .setMultiChoiceItems(elementos, opciones, new DialogInterface.OnMultiChoiceClickListener() {
                    public void onClick(DialogInterface dialog, int item, boolean isChecked) {
                        String seleccionados="";
                        for (int i = 0; i < opciones.length; i++)
                        {
                            if (opciones[i] == true)
                            {
                                seleccionados += elementos[i] + "\n";
                            }
                        }
                        ((MainActivity)getActivity()).capturarDatos(seleccionados);
                    }
                })
                .create();
    }
}
