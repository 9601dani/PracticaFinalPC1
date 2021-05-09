package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Vuelo;
import com.mycompany.Enum.ESTADO_VUELO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_RESERVACIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import com.mycompany.Interfaz.AsientosVuelos;
import com.mycompany.Interfaz.IngresarReservacion;
import static com.mycompany.Interfaz.IngresarReservacion.botonReservacion;
import static com.mycompany.Interfaz.IngresarReservacion.botonVerAsientos;
import static com.mycompany.Interfaz.IngresarReservacion.codVuelo;
import static com.mycompany.Interfaz.IngresarReservacion.limpiarLista;
import static com.mycompany.Interfaz.IngresarReservacion.noAsiento;
import static com.mycompany.Interfaz.IngresarReservacion.titulo;
import static com.mycompany.Interfaz.IngresarReservacion.titulo1;
import static com.mycompany.Interfaz.IngresarReservacion.titulo2;
import static com.mycompany.Interfaz.MenuPrincipal.pantalla;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static com.mycompany.Interfaz.IngresarReservacion.noPasText;

public class NuevaReservacion {
    IngresarReservacion datos;
    private String ciudad_origen;
    private String ciudad_destino;
    private Date fecha_vuelo;
    private String aerolinea;

    public NuevaReservacion(IngresarReservacion datos, String ciudad_origen, String ciudad_destino, Date fecha_vuelo, String aerolinea) {
        this.datos = datos;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.fecha_vuelo = fecha_vuelo;
        this.aerolinea = aerolinea;
    }
    
    public void verVuelos(){
     limpiarLista();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     String[] vuelos = FILE_VUELO.list();
     String[] VUELOS = new String[vuelos.length];
     int contador=0;
        for (int i = 0; i <vuelos.length; i++) {
            FileInputStream archivoL = null;
                try {
                    archivoL = new FileInputStream(FILE_VUELO + "/" + vuelos[i]);
                    ObjectInputStream lectura = new ObjectInputStream(archivoL);
                    Vuelo vuel = (Vuelo)lectura.readObject();
                    
                    FileInputStream archivoA = new FileInputStream(FILE_AVIONES + "/" + vuel.getCodAvion().toUpperCase());
                    ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
                    Avion avion = (Avion)lecturaA.readObject();
                    if(ciudad_origen.equalsIgnoreCase(vuel.getAeroOrigen())){
                        if(ciudad_destino.equalsIgnoreCase(vuel.getAeroDestino())){
                            if(fecha_vuelo.equals(vuel.getFechaSalida()) || vuel.getFechaSalida().after(fecha_vuelo) && vuel.getEstado()==ESTADO_VUELO.EN_ESPERA){
                                if(aerolinea.equalsIgnoreCase(avion.getNomAerolinea())){
                                     contador++;
                                   datos.verVuelosLista(contador+". "+"CODIGO VUELO: "+vuel.getCodigoVuelo().toUpperCase()+ " ORIGEN: "+vuel.getAeroOrigen().toUpperCase()+" DESTINO: "+vuel.getAeroDestino().toUpperCase()+" FECHA SALIDA: "+sdf.format(vuel.getFechaSalida())+" PRECIO DEL BOLETO: "+vuel.getPrecioBoleto());
                                }
                            }
                        }
                    }
                    lectura.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(NuevaReservacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(NuevaReservacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NuevaReservacion.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }  
        
        if(contador==0){
            datos.verVuelosLista("NO TENEMOS VUELOS DISPONIBLES ");
            inicio();
        }else{
            habilitarMasCampos();
            
           
        }
    }
            
     public static void inicio(){
        titulo.setVisible(false);
        titulo1.setVisible(false);
        titulo2.setVisible(false);
        codVuelo.setVisible(false);
        noPasText.setVisible(false);
        noAsiento.setVisible(false);
        botonReservacion.setVisible(false);
        botonVerAsientos.setVisible(false);
    }
    public static void habilitarMasCampos(){
        titulo.setVisible(true);
        titulo1.setVisible(true);
        titulo2.setVisible(true);
        codVuelo.setVisible(true);
        noPasText.setVisible(true);
        noAsiento.setVisible(true);
        botonReservacion.setVisible(true); 
        botonVerAsientos.setVisible(true);
    }
    public static void verAsientosAvion(String codV){
        try {
                FileInputStream archivoVuelo = new FileInputStream(FILE_VUELO + "/" + codV.toUpperCase());
                ObjectInputStream lecturaV = new ObjectInputStream(archivoVuelo);
                Vuelo vuelo = (Vuelo) lecturaV.readObject();
                String codAvion= vuelo.getCodAvion();
                lecturaV.close();
                
                FileInputStream archivoAvion = new FileInputStream(FILE_AVIONES + "/" + codAvion.toUpperCase());
                ObjectInputStream lecturaA = new ObjectInputStream(archivoAvion);
                Avion avion = (Avion) lecturaA.readObject();
                
                for (int i = 0; i < avion.getAsientos().length; i++) {
                    System.out.println(avion.getAsientos()[i]);
                }
                AsientosVuelos AV= new AsientosVuelos(codAvion.toUpperCase());
                pantalla.add(AV);
                AV.show();
                AV.generarLabels();
                lecturaA.close();
                
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
    }
    public static void realizarReservacion(int noPas,String codVuelo,int noTarj,int noAsiento){
         try {
                    FileInputStream archivoRe = new FileInputStream(FILE_RESERVACIONES + "/" + noPas+"_"+codVuelo.toUpperCase());
                    JOptionPane.showMessageDialog(null, "YA HAS REALIZADO UNA RESERVACION");
                    try{
                        FileInputStream archivoVuelo = new FileInputStream(FILE_VUELO + "/" + codVuelo.toUpperCase());
                        ObjectInputStream lecturaA = new ObjectInputStream(archivoVuelo);
                        Avion avion = (Avion) lecturaA.readObject(); 
                        for (int i = 0; i < avion.getAsientos().length; i++) {
                            System.out.println(avion.getAsientos()[i]);
                        }
                        lecturaA.close();
                    }catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "NO EXISTE EL CODIGO DE VUELO");
                      
                    } catch (ClassNotFoundException ex) {
                         Logger.getLogger(NuevaReservacion.class.getName()).log(Level.SEVERE, null, ex);
                    }
          } /*catch (FileNotFoundException ex) {
                    FileInputStream archivoA = new FileInputStream(FILE_AVIONES + "/" + vuel.getCodAvion().toUpperCase());
                    ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
                    Avion avion = (Avion)lecturaA.readObject();
                    if(ciudad_origen.equalsIgnoreCase(vuel.getAeroOrigen())){
                        if(ciudad_destino.equalsIgnoreCase(vuel.getAeroDestino())){
                            if(fecha_vuelo.equals(vuel.getFechaSalida()) || vuel.getFechaSalida().after(fecha_vuelo) && vuel.getEstado()==ESTADO_VUELO.EN_ESPERA){
                                if(aerolinea.equalsIgnoreCase(avion.getNomAerolinea())){
                                     contador++;
                                   datos.verVuelosLista(contador+". "+"CODIGO VUELO: "+vuel.getCodigoVuelo().toUpperCase()+ " ORIGEN: "+vuel.getAeroOrigen().toUpperCase()+" DESTINO: "+vuel.getAeroDestino().toUpperCase()+" FECHA SALIDA: "+sdf.format(vuel.getFechaSalida())+" PRECIO DEL BOLETO: "+vuel.getPrecioBoleto());
                                }
                            }
                        }
                    }
                }*/ catch (IOException ex) {
                    Logger.getLogger(NuevaReservacion.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
     
    
}
