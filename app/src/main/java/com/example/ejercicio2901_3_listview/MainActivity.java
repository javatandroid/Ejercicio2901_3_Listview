package com.example.ejercicio2901_3_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    //Declarar los elementos o vistas con los que voy a trabajar
    ListView lvciudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identiifcando vistas
        lvciudades=(ListView)findViewById(R.id.lv_listaciudades);

        //Datos a mostrar en el ListView
        String[] ciudades = {"Cádiz", "Málaga", "Huelva", "Almería",
                "Jaén", "Córdoba", "Sevilla", "Valencia", "Madrid",
                "Barcelona", "San Sebastián", "Bilbao", "Zaragoza"};

        //Creamos el adaptador
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>();
    }
}
