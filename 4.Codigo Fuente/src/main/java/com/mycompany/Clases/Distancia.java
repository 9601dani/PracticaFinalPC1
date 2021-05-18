package com.mycompany.Clases;

import java.io.Serializable;

public class Distancia implements Serializable {
   private String aeroOrigen;
   private String aeroDestino;
   private double cantMillas;

    public Distancia(String aeroOrigen, String aeroDestino, double cantMillas) {
        this.aeroOrigen = aeroOrigen;
        this.aeroDestino = aeroDestino;
        this.cantMillas = cantMillas;
    }

    public String getAeroOrigen() {
        return aeroOrigen;
    }

    public String getAeroDestino() {
        return aeroDestino;
    }

    public double getCantMillas() {
        return cantMillas;
    }

    public void setAeroOrigen(String aeroOrigen) {
        this.aeroOrigen = aeroOrigen;
    }

    public void setAeroDestino(String aeroDestino) {
        this.aeroDestino = aeroDestino;
    }

    public void setCantMillas(double cantMillas) {
        this.cantMillas = cantMillas;
    }
   
}
