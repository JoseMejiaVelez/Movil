package com.example.rouelem.myapplication.Mensajes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Rouelem on 8/06/2017.
 */

public class Mensajeria {
    private RecyclerView rv;
    private List<MensajeTexto> mensajetexto;
    private mensajesAdaptados adaptados;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContetView(R.layout.mensajeria);
        mensajetexto = new ArrayList<>();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        rv = (RecyclerView) findViewById(R.id.rvmensajes);
        LinearLayoutManager lm = new > LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        for (int i=0;i<10;i++){
            mensajetexto mensajesTexto=new mensajeTexto();
            mensajetextoAuxiliar.setId(""+i);
            mensajetextoAuxiliar.setMensaje("hola" + i);
            mensajetextoAuxiliar.setHoraDelMensaje("10:34")

            mensajesTexto.add(mensajesTextoAuxiliar);


        }

        adaptados=new MensajesAdaptados(mensajestexto);
            rv.setAdaptados(adaptados)


        toolbar.setNavigationOnClickListener(new View.OnContextClickListener()){
            @Override

                public void onClick(View view){
                    finish();
            }


        };



    }
}
