
package com.mycompany.Clases;

import java.io.Serializable;

public class Aerolinea implements Serializable{
    private String nombreA;
    private String nombreaerolinea;

    public Aerolinea(String nombreA, String nombreaerolinea) {
        this.nombreA = nombreA;
        this.nombreaerolinea = nombreaerolinea;
    }

    public String getNombreA() {
        return nombreA;
    }

    public String getNombreaerolinea() {
        return nombreaerolinea;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public void setNombreaerolinea(String nombreaerolinea) {
        this.nombreaerolinea = nombreaerolinea;
    }
    
}
