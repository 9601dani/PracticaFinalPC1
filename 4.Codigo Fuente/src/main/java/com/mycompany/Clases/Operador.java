package com.mycompany.Clases;

import java.io.Serializable;

public class Operador implements Serializable{
    private String nombreG;
    private String Aerolinea;

    public Operador(String nombreG, String Aerolinea) {
        this.nombreG = nombreG;
        this.Aerolinea = Aerolinea;
    }

    public String getNombreG() {
        return nombreG;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setNombreG(String nombreG) {
        this.nombreG = nombreG;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }
    

}
