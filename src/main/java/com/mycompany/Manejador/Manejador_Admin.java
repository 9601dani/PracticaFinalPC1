package com.mycompany.Manejador;

import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Distancia;
import com.mycompany.Clases.Reservacion;
import com.mycompany.Clases.Vuelo;
import com.mycompany.Enum.ESTADO_VUELO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_DISTANCIA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_RESERVACIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import com.mycompany.Interfaz.ReportePorAvion;
import static com.mycompany.Interfaz.ReportePorAvion.limpiarListaAv;
import com.mycompany.Interfaz.ReporteVuelo;
import static com.mycompany.Interfaz.ReporteVuelo.limpiarListaAd;
import com.mycompany.Interfaz.ZREPORTEPASAJERO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Manejador_Admin {
ZREPORTEPASAJERO datos;
ReporteVuelo datos2;
ReportePorAvion datos3;

    public Manejador_Admin(ZREPORTEPASAJERO datos) {
        this.datos = datos;
    }

    public Manejador_Admin(ReporteVuelo datos2) {
        this.datos2 = datos2;
    }

    public Manejador_Admin(ReportePorAvion datos3) {
        this.datos3 = datos3;
    }
    
    
    

    public String verGeneroMayor(int a, int b, int c){
        String op="";
        int []arreglo ={a,b,c};
        //UTILIZANDO METODO BURBUJA 
        
        for(int i=0; i<(arreglo.length-1);i++){
            for(int j=0;j<(arreglo.length-1);j++){
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
    
    public int verEdadMayor(int a,int b,int c, int d,int e){
        int regreso=0;
        int [] arreglo={a,b,c,d,e};
            for (int i = 0; i < (arreglo.length-1); i++) {
                for (int j = 0; j < (arreglo.length-1 ); j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }
            }
        if (arreglo[arreglo.length - 1] == a) {
            regreso = a;
            System.out.println("a");
        } else if (arreglo[arreglo.length - 1] == b) {
            regreso = b;
            System.out.println("b");
        } else if (arreglo[arreglo.length - 1] == c) {
            regreso = c;
            System.out.println("c");
        }else if (arreglo[arreglo.length - 1] == d) {
            regreso = d;
            System.out.println("d");
        } else if (arreglo[arreglo.length - 1] == e) {
            regreso = e;
            System.out.println("e");
        }
        return regreso;
        
    }
   
    public String verSexoMayor(int a, int b, int c){
        String op="";
        int []arreglo ={a,b,c};
        //UTILIZANDO METODO BURBUJA 
        
        for(int i=0; i<(arreglo.length-1);i++){
            for(int j=0;j<(arreglo.length-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]= aux;
                }
            }
        }
        if(arreglo[arreglo.length-1]==a){
           op="MASCULINO";
        }else if(arreglo[arreglo.length-1]==b){
            op="FEMENINO";
        }else if(arreglo[arreglo.length-1]==c){
            op="SIN_DEFINIR";
        }
        return op;
    }
    
    public void presentarPasajeros(String codA){
        limpiarListaAd();
        String[]reser= FILE_RESERVACIONES.list();
        int contador=0;
        for(int i=0;i<reser.length;i++){
            FileInputStream archivoL;
            try {
                FileInputStream archivoA = new FileInputStream(FILE_RESERVACIONES + "/"+ reser[i]);
                ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
                Reservacion rev = (Reservacion) lecturaA.readObject();
                
                if(rev.getCodigo_vuelo().toUpperCase().equals(codA.toUpperCase())){
                    contador++;
                    archivoL = new FileInputStream(FILE_CLIENTES + "/" +rev.getNo_Pasaporte());
                    ObjectInputStream lectura = new ObjectInputStream(archivoL);
                    Cliente cl = (Cliente) lectura.readObject();
                    datos2.añadirParaReporte(contador + ". VUELO: " + codA.toUpperCase() + " NO. PASAPORTE "+ rev.getNo_Pasaporte()+" NOMBRE: "+cl.getNombre().toUpperCase()+" APELLIDO: "+cl.getApellido().toUpperCase()+" ASIENTO: "+rev.getNo_Asiento());
                    lectura.close();
                }
                
                
                
                lecturaA.close();
            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRA EL ARCHIVO");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASNOTFOUN OPERARVuelo");
            }
        }
        if(contador==0){
            datos2.añadirParaReporte("AUN NO SE POSEEN PASAJEROS EN EL VUELO");
        }
        
    }
    
    public void presentarAvion(String codA){
        limpiarListaAv();
        String[] rev = FILE_VUELO.list();
        String presentar = "";
        int contador = 0;
        double millasRecorridas=0;
        double consumo=0;
        FileInputStream archivoA;
    try {
        archivoA = new FileInputStream(FILE_AVIONES + "/" + codA.toUpperCase());
        ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
        Avion a = (Avion) lecturaA.readObject();
        consumo= a.getConsumoMilla();
        lecturaA.close();
    } catch (FileNotFoundException ex) {
        datos3.añadirParaReport("NO EXISTE EL AVION INGRESO");
    } catch (IOException ex) {
        Logger.getLogger(Manejador_Admin.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Manejador_Admin.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        for (int i = 0; i < rev.length; i++) {
            FileInputStream archivoL;
            FileInputStream archivoD;
            try {
                archivoL = new FileInputStream(FILE_VUELO + "/" + rev[i]);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Vuelo r = (Vuelo) lectura.readObject();
                
                if(r.getCodAvion().toUpperCase().equals(codA.toUpperCase())){
                    if(r.getEstado().equals(ESTADO_VUELO.COMPLETADO)){
                        try {
                            archivoD = new FileInputStream(FILE_DISTANCIA + "/" + r.getAeroOrigen().toUpperCase() + "_" + r.getAeroDestino().toUpperCase());
                            ObjectInputStream lecturaD = new ObjectInputStream(archivoD);
                            Distancia d = (Distancia) lecturaD.readObject();
                            millasRecorridas += d.getCantMillas();
                        } catch (FileNotFoundException ex) {
                            JOptionPane.showConfirmDialog(null, "NO HAS INGRESADO UN CODIGO DE VUELO VALIDO :(");
                        } catch (IOException ex) {
                            System.err.println("ERROR IO");
                        } catch (ClassNotFoundException ex) {
                            System.err.println("CLASNOTFOUN OPERARVuelo");
                        }
                    }
                    
                }
                lectura.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showConfirmDialog(null, "NO HAS INGRESADO UN CODIGO DE VUELO VALIDO :(");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASNOTFOUN OPERARVuelo");
            }

        }
        
        datos3.añadirParaReport("CODIGO DEL AVION: "+codA.toUpperCase()+" CANTIDAD RECORRIDA: "+millasRecorridas+" MILLAS"+" CONSUMO DE GASOLINA: "+(millasRecorridas*consumo)+" GALONES");
    }
    
}
