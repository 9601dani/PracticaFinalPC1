package com.mycompany.Manejador;

import com.mycompany.Interfaz.ZREPORTEPASAJERO;

public class Manejador_Admin {
ZREPORTEPASAJERO datos;

    public Manejador_Admin(ZREPORTEPASAJERO datos) {
        this.datos = datos;
    }

    public String verGeneroMayor(int a, int b, int c){
        String op="";
        int regreso=0;
        int []arreglo ={a,b,c};
        //UTILIZANDO METODO BURBUJA 
        
        for(int i=0; i<(arreglo.length-1);i++){
            for(int j=0;i<(arreglo.length-1);i++){
                if(arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]= aux;
                }
            }
        }
        if(arreglo[arreglo.length-1]==a){
           op="SOLTERO";
        }else if(arreglo[arreglo.length-1]==b){
            op="CASADO";
        }else if(arreglo[arreglo.length-1]==c){
            op="DIVORCIADO";
        }
        return op;
    }
    
    
}
