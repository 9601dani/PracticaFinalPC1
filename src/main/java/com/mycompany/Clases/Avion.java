
package com.mycompany.Clases;

import java.io.Serializable;

public class Avion implements Serializable{
    private String nomAerolinea;
    private String aeropuertoActual;
    private String codigoAvion;
    private int capacidadP;
    private double cantGasolina;
    private double consumoMilla;
    private int[]asientos;
    private int[]pasillos;
    private int residuo=0;

    public Avion(String nomAerolinea, String aeropuertoActual, String codigoAvion, int capacidadP, double cantGasolina, double consumoMilla) {
        this.nomAerolinea = nomAerolinea;
        this.aeropuertoActual = aeropuertoActual;
        this.codigoAvion = codigoAvion;
        this.capacidadP = capacidadP;
        this.cantGasolina = cantGasolina;
        this.consumoMilla = consumoMilla;
        
        //DEFINIR COLUMNAS Y PASILLOS
        int num1= capacidadP/4;
        residuo=capacidadP%4;
        if(residuo>=0){
            num1=num1+1;
        }
        this.pasillos= new int[num1];
        this.asientos=new int[capacidadP];
        
        int numAsiento=0;
        for (int i = 0; i < capacidadP; i++) {
                asientos[i]=0;
        }
        for(int j=0; j<num1;j++){
            pasillos[j]=0;
        }
        
    }

    public Avion(String nomAerolinea, String aeropuertoActual, String codigoAvion, int capacidadP, double cantGasolina, double consumoMilla, int[] asientos) {
        this.nomAerolinea = nomAerolinea;
        this.aeropuertoActual = aeropuertoActual;
        this.codigoAvion = codigoAvion;
        this.capacidadP = capacidadP;
        this.cantGasolina = cantGasolina;
        this.consumoMilla = consumoMilla;
        this.asientos = asientos;
    }
    

    public int[] getAsientos() {
        return asientos;
    }

    public int[] getPasillos() {
        return pasillos;
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

    public void setAsientos(int[] asientos) {
        this.asientos = asientos;
    }

    public void setPasillos(int[] pasillos) {
        this.pasillos = pasillos;
    }
    
    
}
