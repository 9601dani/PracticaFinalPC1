package com.mycompany.Clases;

public class Reservaciones {
    private int noPas;
    private String codigoVuelo;
    private int noTarjeta;
    private String noAsiento;

    public Reservaciones(int noPas, String codigoVuelo, int noTarjeta, String noAsiento) {
        this.noPas = noPas;
        this.codigoVuelo = codigoVuelo;
        this.noTarjeta = noTarjeta;
        this.noAsiento = noAsiento;
    }

    public int getNoPas() {
        return noPas;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getNoTarjeta() {
        return noTarjeta;
    }

    public String getNoAsiento() {
        return noAsiento;
    }

    public void setNoPas(int noPas) {
        this.noPas = noPas;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public void setNoTarjeta(int noTarjeta) {
        this.noTarjeta = noTarjeta;
    }

    public void setNoAsiento(String noAsiento) {
        this.noAsiento = noAsiento;
    }
    
    
    
    
}
