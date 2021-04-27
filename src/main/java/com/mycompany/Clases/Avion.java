
package com.mycompany.Clases;

import java.io.Serializable;

public class Avion implements Serializable{
    private String nomAerolinea;
    private String aeropuertoActual;
    private String codigoAvion;
    private int capacidadP;
    private double cantGasolina;
    private double consumoMilla;

    public Avion(String nomAerolinea, String aeropuertoActual, String codigoAvion, int capacidadP, double cantGasolina, double consumoMilla) {
        this.nomAerolinea = nomAerolinea;
        this.aeropuertoActual = aeropuertoActual;
        this.codigoAvion = codigoAvion;
        this.capacidadP = capacidadP;
        this.cantGasolina = cantGasolina;
        this.consumoMilla = consumoMilla;
    }

    public String getNomAerolinea() {
        return nomAerolinea;
    }

    public String getAeropuertoActual() {
        return aeropuertoActual;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public int getCapacidadP() {
        return capacidadP;
    }

    public double getCantGasolina() {
        return cantGasolina;
    }

    public double getConsumoMilla() {
        return consumoMilla;
    }

    public void setNomAerolinea(String nomAerolinea) {
        this.nomAerolinea = nomAerolinea;
    }

    public void setAeropuertoActual(String aeropuertoActual) {
        this.aeropuertoActual = aeropuertoActual;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public void setCapacidadP(int capacidadP) {
        this.capacidadP = capacidadP;
    }

    public void setCantGasolina(double cantGasolina) {
        this.cantGasolina = cantGasolina;
    }

    public void setConsumoMilla(double consumoMilla) {
        this.consumoMilla = consumoMilla;
    }
    
}
