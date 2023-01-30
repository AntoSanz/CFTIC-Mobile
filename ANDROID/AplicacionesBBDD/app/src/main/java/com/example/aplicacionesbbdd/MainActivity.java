package com.example.aplicacionesbbdd;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText resultado;
    SQLiteDatabase db = null;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.resultado = (EditText) findViewById(R.id.EditText01);
    }

    public void crearBd(View view) {
        BaseDatosHelper usdbh = new BaseDatosHelper(this, "DBUsuarios", null, 1);
        db = usdbh.getWritableDatabase();
        //Si hemos abierto correctamente la base de datos
        if (db != null) {
            //Insertamos 5 usuarios de ejemplo
            for (int i = 1; i <= 5; i++) {
                //Generamos los datos
                int codigo = i;
                String nombre = "Usuario" + i;
                //Insertamos los datos en la tabla Usuarios
                db.execSQL("INSERT INTO Usuarios (codigo, nombre) " +  "VALUES (" + codigo + ", '" + nombre + "')");
            }
            Log.d(TAG, "INSERTADO!!!!!!!");
            //Cerramos la base de datos
            //db.close();
        }
    }

    public void recuperarDatos(View view) {
        try {
            String[] args = new String[]{"Usuario1"};
            String codigo = "", nombre = "";
            BaseDatosHelper usdbh = new BaseDatosHelper(this, "DBUsuarios", null, 1);

            SQLiteDatabase db = usdbh.getReadableDatabase();
            Cursor c = db.rawQuery("SELECT codigo,nombre FROM Usuarios where nombre=?", args);
            //Nos aseguramos de que existe al menos un registro
            if (c.moveToFirst()) {
                //Recorremos el cursor hasta que no haya más registros
                do {
                    codigo = c.getString(0);
                    nombre = c.getString(1);
                } while (c.moveToNext());
            }

            resultado.setText("Código usuario:" + codigo);
        } catch (Exception e) {
            Log.d(TAG, "ERROR: " + e.toString());

        }
    }

}