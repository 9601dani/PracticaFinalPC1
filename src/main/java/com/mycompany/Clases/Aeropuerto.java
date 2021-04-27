
package com.mycompany.Clases;

import java.io.Serializable;

public class Aeropuerto implements Serializable{
    private String nombreA;
    private String ciudad;
    private int pais;

    public Aeropuerto(String nombreA, String ciudad, int pais) {
        this.nombreA = nombreA;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombreA() {
        return nombreA;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPais() {
        return pais;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }
    
}
