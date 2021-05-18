package com.mycompany.Clases;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{
   public static final String CASADO="CASADO";
   public static final String  SOLTERO="SOLTERO";
   public static final String  DIVORCIADO="DIVORCIADO";
   public static final String  MASCULINO="MASCULINO";
   public static final String  FEMENINO="FEMENINO";
   public static final String  SIN_DEFINIR="SIN_DEFINIR";
    private long noPasaporte;
    private String contraseña;
    private Date fecha_nacimiento;
    private String nacionalidad;
    private String estado;
    private String nombre;
    private String apellido;
    private String sexo;
    private Date fecha_vencimiento;
    private Date fecha_emision;
    private String paisActual;
    private double millas_Recorridas;
    // CONTRUCTOR PARA UN NUEVO CLIENTE
    public Cliente(long noPasaporte, String contraseña, Date fecha_nacimiento, String nacionalidad,int selecC, String nombre, String apellido,int selecG, Date fecha_vencimiento, Date fecha_emision, String paisActual) {
        this.noPasaporte = noPasaporte;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.estado = establecerEstadoCivil(selecC);
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo= establecerGenero(selecG);
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_emision = fecha_emision;
        this.paisActual = paisActual;
        this.millas_Recorridas = 0;
    }
    //CONTRUCTR PARA LA CARGA DE DATOS
    public Cliente(long noPasaporte, String contraseña, Date fecha_nacimiento, String nacionalidad,int selecC, String nombre, String apellido,int selecG, Date fecha_vencimiento, Date fecha_emision, String paisActual, double millas_Recorridas) {
        this.noPasaporte = noPasaporte;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
         this.estado = establecerEstadoCivil(selecC);
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo= establecerGenero(selecG);
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_emision = fecha_emision;
        this.paisActual = paisActual;
        this.millas_Recorridas = millas_Recorridas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public long getNoPasaporte() {
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

    public String getEstado() {
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

    public void setEstado(String estado) {
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
    public String establecerEstadoCivil(int op){
        String estado="";
        switch(op){
            case 0:
                estado=CASADO;
                break;
            case 1:
                estado=SOLTERO;
                break;
            case 2:
                estado=DIVORCIADO;
                break;
                
        }
        return estado;
    }
    public String establecerGenero(int opc){
        String sexo="";
             switch(opc){
            case 0:
                sexo=MASCULINO;
                break;
            case 1:
                sexo=FEMENINO;
                break;
            case 2:
                sexo=SIN_DEFINIR;
                break;
                
        }
        return sexo;
    }
    
    
}
