package com.example.rouelem.myapplication.Mensajes;

/**
 * Created by Rouelem on 8/06/2017.
 */

public class MensajeTexto {
    private String id;
    private String mensaje;
    private int tipoMensaje;
    private String Horamensaje;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(int tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public String getHoramensaje() {
        return Horamensaje;
    }

    public void setHoramensaje(String horamensaje) {
        Horamensaje = horamensaje;
    }

    public MensajeTexto() {


    }
}
