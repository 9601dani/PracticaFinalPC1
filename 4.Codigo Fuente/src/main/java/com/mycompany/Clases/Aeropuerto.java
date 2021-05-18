
package com.mycompany.Clases;

import java.io.Serializable;

public class Aeropuerto implements Serializable{
    private String nombreA;
    private String ciudad;
    private String pais;

    public Aeropuerto(String nombreA, String ciudad, String pais) {
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

    public String getPais() {
        return pais;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
