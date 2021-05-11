
package com.mycompany.Clases;

import java.io.Serializable;

public class Tarjeta implements Serializable{
   private long numeroTarjeta;
   private int noPasaporte;
   private double dineroActual;
   private String codigo_CVC;

    public Tarjeta(long numeroTarjeta, int noPasaporte, double dineroActual, String codigo_CVC) {
        this.numeroTarjeta = numeroTarjeta;
        this.noPasaporte = noPasaporte;
        this.dineroActual = dineroActual;
        this.codigo_CVC = codigo_CVC;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getNoPasaporte() {
        return noPasaporte;
    }

    public double getDineroActual() {
        return dineroActual;
    }

    public String getCodigo_CVC() {
        return codigo_CVC;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setNoPasaporte(int noPasaporte) {
        this.noPasaporte = noPasaporte;
    }

    public void setDineroActual(double dineroActual) {
        this.dineroActual = dineroActual;
    }

    public void setCodigo_CVC(String codigo_CVC) {
        this.codigo_CVC = codigo_CVC;
    }
   
}
