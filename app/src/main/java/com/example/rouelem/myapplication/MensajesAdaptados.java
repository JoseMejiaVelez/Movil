package com.example.rouelem.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

/**
 * Created by Rouelem on 8/06/2017.
 */

public class MensajesAdaptados extends RecyclerView.Adaptados<MensajesAdaptados.MensajesViewHolder> {

    private list<MensajesTexto> mensajestexto;

    public MensajesAdaptados(list<MensajesTexto> mensajestexto) {
        this.mensajestexto = mensajestexto;
    }

    @Override
    public MensajesViewHolder onCreateViewHolder(ViewGroup parent, int viewType){



    }
    @Override

    public void onBindViewHolder(MensajesViewHolder holder, int position){
        View v= LayoutInflater.from(parent.getContex()).inflate(R.layout.card_view_mensajes,parent,false);
        return new MensajesViewHolder(v);

    }

    @Override
    public int getItemCount(){

        return 0;
    }


    static class MensajesViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView TvMensaje;
        TextView TvHora;

        MensajesViewHolder(View itemView){
            super(itemView);
            CardView=(CardView) itemView.findViewById(R.id.cvMensaje);
            TextView=(CardView) itemView.findViewById(R.id.TextView);
            TextView=(CardView) itemView.findViewById(R.id.TextView);


        }


    }



}
