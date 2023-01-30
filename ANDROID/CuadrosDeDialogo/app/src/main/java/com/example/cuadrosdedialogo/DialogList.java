package com.example.cuadrosdedialogo;



import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class DialogList extends DialogFragment {
    //Creamos un array de string con los elementos que queremos mostrar para que el usuario elija uno

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = {"Barcelona", "Real Madrid", "Atletico Madrid"};
        return new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.ic_menu_add)
                .setTitle("Lista")
                //setItems permite mostrar la lista de elemento sen el dialogo
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        String selectedItem = items[item];
                        ((MainActivity)getActivity()).capturarSeleccionado(selectedItem);
                    }
                })
                .create();
    }
}




