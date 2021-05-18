
package com.mycompany.Clases;

import com.mycompany.Enum.ESTADO_VUELO;
import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable{
    private String codigoVuelo;
    private String codAvion;
    private String aeroOrigen;
    private String aeroDestino;
    private double precioBoleto;
    private Date fechaSalida;
    private ESTADO_VUELO estado;

    public Vuelo(String codigoVuelo, String codAvion, String aeroOrigen, String aeroDestino, double precioBoleto, Date fechaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.codAvion = codAvion;
        this.aeroOrigen = aeroOrigen;
        this.aeroDestino = aeroDestino;
        this.precioBoleto = precioBoleto;
        this.fechaSalida = fechaSalida;
        this.estado= ESTADO_VUELO.EN_ESPERA;
    }

    public Vuelo(String codigoVuelo, String codAvion, String aeroOrigen, String aeroDestino, double precioBoleto, Date fechaSalida, ESTADO_VUELO estado) {
        this.codigoVuelo = codigoVuelo;
        this.codAvion = codAvion;
        this.aeroOrigen = aeroOrigen;
        this.aeroDestino = aeroDestino;
        this.precioBoleto = precioBoleto;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
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

    public ESTADO_VUELO getEstado() {
        return estado;
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

    public void setEstado(ESTADO_VUELO estado) {
        this.estado = estado;
    }
    
    
    
}
