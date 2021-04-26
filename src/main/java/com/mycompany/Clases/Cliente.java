
package com.mycompany.Clases;

import com.mycompany.Enum.ESTADO_CIVIL;
import java.util.Date;

public class Cliente {
    private int noPasaporte;
    private String contraseña;
    private Date fecha_nacimiento;
    private String nacionalidad;
    private ESTADO_CIVIL estado;
    private String nombre;
    private String apellido;
    private Date fecha_vencimiento;
    private Date fecha_emision;
    private String paisActual;
    private double millas_Recorridas;
    // CONTRUCTOR PARA UN NUEVO CLIENTE
    public Cliente(int noPasaporte, String contraseña, Date fecha_nacimiento, String nacionalidad, ESTADO_CIVIL estado, String nombre, String apellido, Date fecha_vencimiento, Date fecha_emision, String paisActual) {
        this.noPasaporte = noPasaporte;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_emision = fecha_emision;
        this.paisActual = paisActual;
    }
    //CONTRUCTR PARA LA CARGA DE DATOS
    public Cliente(int noPasaporte, String contraseña, Date fecha_nacimiento, String nacionalidad, ESTADO_CIVIL estado, String nombre, String apellido, Date fecha_vencimiento, Date fecha_emision, String paisActual, double millas_Recorridas) {
        this.noPasaporte = noPasaporte;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_emision = fecha_emision;
        this.paisActual = paisActual;
        this.millas_Recorridas = millas_Recorridas;
    }
    

    public int getNoPasaporte() {
        return noPasaporte;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public ESTADO_CIVIL getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public String getPaisActual() {
        return paisActual;
    }

    public double getMillas_Recorridas() {
        return millas_Recorridas;
    }

    public void setNoPasaporte(int noPasaporte) {
        this.noPasaporte = noPasaporte;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstado(ESTADO_CIVIL estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }

    public void setMillas_Recorridas(double millas_Recorridas) {
        this.millas_Recorridas = millas_Recorridas;
    }
    
    
    
}
