
package com.mycompany.Clases;

import com.mycompany.Enum.EstadoUsuario;
import java.io.Serializable;


public class Usuario implements Serializable{
   public static final String ADMINISTRADOR="ADMINISTADOR";
   public static final String GERENTE="GERENTE";
   public static final String OPERADOR="OPERADOR";
   private String nombre;
   private String contraseña;
   private int tipo;
   private String nomArea;
   private EstadoUsuario estado;

    public Usuario(String nombre, String contraseña, int tipo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.nomArea=asignarArea(tipo);
        this.estado= estado.ACTIVO;
    }
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = 3;
        this.nomArea="Usuario";
        this.estado= estado.ACTIVO;
    }
   public String asignarArea(int num){
       String nomb="";
       if(num==0){
           nomb=ADMINISTRADOR;
       }else if(num==1){
           nomb=GERENTE;
       }else if(num==2){
           nomb=OPERADOR;
       }
       return nomb;
   }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNomArea() {
        return nomArea;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }
    
    
}
