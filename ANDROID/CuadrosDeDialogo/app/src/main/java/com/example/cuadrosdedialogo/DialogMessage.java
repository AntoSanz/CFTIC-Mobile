package com.example.cuadrosdedialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class DialogMessage extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.ic_menu_add)
                .setTitle("Solo Aceptar")
                .setPositiveButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                ((MainActivity) getActivity()).acceptAction();
                            }
                        }
                )

                //POR ÚLTIMO, CREAMOS EL CUADRO
                .create();
    }
}

//Paso 1: Crear clase nueva que erede de la clase DialogFragment y sobreescribimos la clase onCreateDialog
