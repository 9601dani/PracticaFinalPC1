package com.mycompany.Clases;

import java.io.Serializable;

public class Reservacion implements Serializable{
    private int no_Pasaporte;
    private String codigo_vuelo;
    private int no_Tarjeta;
    private String no_Asiento;

    public Reservacion(int no_Pasaporte, String codigo_vuelo, int no_Tarjeta, String no_Asiento) {
        this.no_Pasaporte = no_Pasaporte;
        this.codigo_vuelo = codigo_vuelo;
        this.no_Tarjeta = no_Tarjeta;
        this.no_Asiento = no_Asiento;
    }

    public int getNo_Pasaporte() {
        return no_Pasaporte;
    }

    public String getCodigo_vuelo() {
        return codigo_vuelo;
    }

    public int getNo_Tarjeta() {
        return no_Tarjeta;
    }

    public String getNo_Asiento() {
        return no_Asiento;
    }

    public void setNo_Pasaporte(int no_Pasaporte) {
        this.no_Pasaporte = no_Pasaporte;
    }

    public void setCodigo_vuelo(String codigo_vuelo) {
        this.codigo_vuelo = codigo_vuelo;
    }

    public void setNo_Tarjeta(int no_Tarjeta) {
        this.no_Tarjeta = no_Tarjeta;
    }

    public void setNo_Asiento(String no_Asiento) {
        this.no_Asiento = no_Asiento;
    }
    
}
