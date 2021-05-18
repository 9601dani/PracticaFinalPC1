
package com.mycompany.Clases;

import java.io.Serializable;


public class Gerente implements Serializable{
    private String Aerolinea;
    private String nombreG;

    public Gerente(String Aerolinea, String nombreG) {
        this.Aerolinea = Aerolinea;
        this.nombreG = nombreG;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public String getNombreG() {
        return nombreG;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public void setNombreG(String nombreG) {
        this.nombreG = nombreG;
    }

    
    
    
}
