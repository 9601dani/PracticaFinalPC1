
package com.mycompany.Clases;

import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable{
    private String codigoVuelo;
    private String codAvion;
    private String aeroOrigen;
    private String aeroDestino;
    private double precioBoleto;
    private Date fechaSalida;
    private boolean listo;

    public Vuelo(String codigoVuelo, String codAvion, String aeroOrigen, String aeroDestino, double precioBoleto, Date fechaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.codAvion = codAvion;
        this.aeroOrigen = aeroOrigen;
        this.aeroDestino = aeroDestino;
        this.precioBoleto = precioBoleto;
        this.fechaSalida = fechaSalida;
        this.listo=true;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public String getAeroOrigen() {
        return aeroOrigen;
    }

    public String getAeroDestino() {
        return aeroDestino;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }

    public void setAeroOrigen(String aeroOrigen) {
        this.aeroOrigen = aeroOrigen;
    }

    public void setAeroDestino(String aeroDestino) {
        this.aeroDestino = aeroDestino;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
    
}
