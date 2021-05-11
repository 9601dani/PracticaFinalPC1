
package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Aeropuerto;
import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Distancia;
import com.mycompany.Clases.Reservacion;
import com.mycompany.Clases.Vuelo;
import com.mycompany.Enum.ESTADO_AVION;
import com.mycompany.Enum.ESTADO_VUELO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROPUERTO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_DISTANCIA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_RESERVACIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import static com.mycompany.Interfaz.MenuPrincipal.avionImagen;
import static com.mycompany.Interfaz.MenuPrincipal.destinoTextAnimacion;
import static com.mycompany.Interfaz.MenuPrincipal.origenTextAnimacion;
import static com.mycompany.Interfaz.MenuPrincipal.pantalla;
import com.mycompany.Interfaz.PosponerVuelo;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ManejadorOperadorVuelo extends Thread {
private String origen;
private String destino;
public int x,y;
volatile boolean ejecutar= true;
    
    @Override
    public void run() { 
        origenTextAnimacion.setText(origen);
        destinoTextAnimacion.setText(destino);
        origenTextAnimacion.setVisible(true);
        destinoTextAnimacion.setVisible(true);
        avionImagen.setVisible(true);
        Point posI = avionImagen.getLocation();
        int dx= avionImagen.getX();
        int dy= avionImagen.getY();
        do{
           try {
                
                Thread.sleep(10);
                if (dx <= destinoTextAnimacion.getX()) {
                    dx++;
                    dy--;
                }else{
                    detener();
                }
                avionImagen.setLocation(dx, dy);
            } catch (InterruptedException ex) {
                System.err.println("PROBLEMA EN EL HILO DE ANIMACION");
            }  
        }while(ejecutar);
    try {
        Thread.sleep(1000);
        origenTextAnimacion.setText("");
        destinoTextAnimacion.setText("");
        origenTextAnimacion.setVisible(false);
        destinoTextAnimacion.setVisible(false);
        avionImagen.setVisible(false);
        avionImagen.setLocation(posI);
    } catch (InterruptedException ex) {
        Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        


    }
    public void iniciarHilo(String origen, String destino){
        Thread hiloAnimacion = new Thread(this);
        this.origen=origen;
        this.destino=destino;
        hiloAnimacion.start();
    }
    
    public void detener(){
        ejecutar=false;
    }
    
    public static void MenuOperarVuelo(String codVuelo,int op){
        switch(op){
            case 1:
                iniciarVuelo(codVuelo);
                break;
            case 2:
                cancelarVuelo(codVuelo);
                break;
            case 3:
                PosponerVuelo PV= new PosponerVuelo(codVuelo);
                pantalla.add(PV);
                PV.show();
                break;
            default:
                JOptionPane.showMessageDialog(null,"OPCION NO VALIDA");
                
        }
    }
    
    public static void iniciarVuelo(String codVuelo){
        String[] reservaciones = FILE_RESERVACIONES.list();
        FileInputStream archivoR = null;
        FileInputStream archivoV = null;
        FileInputStream archivoA = null;
        FileInputStream archivoD = null;
        FileInputStream archivoAV = null;
        try {
            archivoV = new FileInputStream(FILE_VUELO + "/" + codVuelo.toUpperCase());
            ObjectInputStream lecturaV = new ObjectInputStream(archivoV);
            Vuelo vuelo = (Vuelo) lecturaV.readObject();
            
            archivoAV = new FileInputStream(FILE_AVIONES + "/" + vuelo.getCodAvion().toUpperCase());
            ObjectInputStream lecturaAV = new ObjectInputStream(archivoAV);
            Avion avion = (Avion) lecturaAV.readObject();
            
            archivoA = new FileInputStream(FILE_AEROPUERTO + "/" + vuelo.getAeroDestino().toUpperCase());
            ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
            Aeropuerto aeropuerto = (Aeropuerto) lecturaA.readObject();
            
            FileInputStream archivoAORIGEN = new FileInputStream(FILE_AEROPUERTO + "/" + vuelo.getAeroOrigen().toUpperCase());
            ObjectInputStream lecturaAORIGEN = new ObjectInputStream(archivoAORIGEN);
            Aeropuerto aeropuerto2 = (Aeropuerto) lecturaAORIGEN.readObject();
            
            archivoD = new FileInputStream(FILE_DISTANCIA + "/" + vuelo.getAeroOrigen().toUpperCase()+"_"+vuelo.getAeroDestino().toUpperCase());
            ObjectInputStream lecturaD = new ObjectInputStream(archivoD);
            Distancia distancia = (Distancia) lecturaD.readObject();
            
            if (vuelo.getEstado().equals(ESTADO_VUELO.CANCELADO)) {
                JOptionPane.showMessageDialog(null, "EL VUELO FUE CANCELADO ANTERIORMENTE :(");
            } else if (vuelo.getEstado().equals(ESTADO_VUELO.COMPLETADO)) {
                JOptionPane.showMessageDialog(null, "EL VUELO YA SE COMPLETO ANTERIORMENTE");
            } else if (vuelo.getEstado().equals(ESTADO_VUELO.EN_ESPERA) || vuelo.getEstado().equals(ESTADO_VUELO.RETRASADO)) {
                for (int i = 0; i < reservaciones.length; i++) {
                    try {
                        archivoR = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                        ObjectInputStream lecturaR = new ObjectInputStream(archivoR);
                        Reservacion reservacion = (Reservacion) lecturaR.readObject();
                        int noPasAuxiliar;
                        if (codVuelo.equalsIgnoreCase(reservacion.getCodigo_vuelo())) {
                            noPasAuxiliar = reservacion.getNo_Pasaporte();
                            try {
                                FileInputStream archivoC = new FileInputStream(FILE_CLIENTES + "/" + noPasAuxiliar);
                                ObjectInputStream lecturaC = new ObjectInputStream(archivoC);
                                Cliente cliente = (Cliente) lecturaC.readObject();
                                int estadoCNew = GuardarArchivoBinario.VerEstado(cliente.getEstado());
                                int generoNew = GuardarArchivoBinario.VerGenero(cliente.getSexo());
                                String paisANew = aeropuerto.getPais();
                                double millasRNew = cliente.getMillas_Recorridas()+distancia.getCantMillas();
                                Cliente newCliente = new Cliente(cliente.getNoPasaporte(),cliente.getContraseña(),cliente.getFecha_nacimiento(),cliente.getNacionalidad(),estadoCNew,cliente.getNombre(),cliente.getApellido(),generoNew,cliente.getFecha_vencimiento(),cliente.getFecha_emision(),paisANew,millasRNew);
                                GuardarArchivoBinario.guardarUsuarioCliente(newCliente);
                                lecturaC.close();
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }
                       
                        lecturaR.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ManejadorOperadorVuelo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                //meter metodo de avion y vuelo
                String aeroActual= vuelo.getAeroDestino();
                
                Avion newAvion= new Avion(avion.getNomAerolinea(),aeroActual,avion.getCodigoAvion(),avion.getCapacidadP(),avion.getCantGasolina(),avion.getConsumoMilla(),ESTADO_AVION.DISPONIBLE);
                Vuelo newVuelo= new Vuelo(vuelo.getCodigoVuelo(),vuelo.getCodAvion(),vuelo.getAeroOrigen(),vuelo.getAeroDestino(),vuelo.getPrecioBoleto(),vuelo.getFechaSalida(),ESTADO_VUELO.COMPLETADO);
                GuardarArchivoBinario.guardarAvion(newAvion);
                GuardarArchivoBinario.guardarVuelo(newVuelo);
                ManejadorOperadorVuelo NH= new ManejadorOperadorVuelo();
                NH.iniciarHilo(aeropuerto2.getCiudad().toUpperCase(),aeropuerto.getCiudad().toUpperCase()); 
            }
            lecturaV.close();
            lecturaA.close();
            lecturaAORIGEN.close();
            lecturaD.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, " NO SE PUEDE OPERAR UN VUELO NO EXISTENTE");
        } catch (IOException ex) {
            System.err.println("IO");
        } catch (ClassNotFoundException ex) {
            System.err.println("CLASSNOTFOUNDEXCEPTION");
        }
    }
    
    public static void cancelarVuelo(String codVuelo){
        FileInputStream archivoV = null;
        try {
            archivoV = new FileInputStream(FILE_VUELO + "/" + codVuelo.toUpperCase());
            ObjectInputStream lecturaV = new ObjectInputStream(archivoV);
            Vuelo vuelo = (Vuelo) lecturaV.readObject();
            
            FileInputStream archivoAV = new FileInputStream(FILE_AVIONES + "/" + vuelo.getCodAvion().toUpperCase());
            ObjectInputStream lecturaAV = new ObjectInputStream(archivoAV);
            Avion avion = (Avion) lecturaAV.readObject();
            
            if(vuelo.getEstado().equals(ESTADO_VUELO.CANCELADO)){
                JOptionPane.showMessageDialog(null, "EL VUELO YA FUE CANCELADO ANTERIORMENTE");
            }else{
                Vuelo newVuelo = new Vuelo(vuelo.getCodigoVuelo(), vuelo.getCodAvion(), vuelo.getAeroOrigen(), vuelo.getAeroDestino(), vuelo.getPrecioBoleto(), vuelo.getFechaSalida(), ESTADO_VUELO.CANCELADO);
                GuardarArchivoBinario.guardarVuelo(newVuelo);
                Avion newAvion= new Avion(avion.getNomAerolinea(),avion.getAeropuertoActual(),avion.getCodigoAvion(),avion.getCapacidadP(),avion.getCantGasolina(),avion.getConsumoMilla(),ESTADO_AVION.DISPONIBLE);
                GuardarArchivoBinario.guardarAvion(newAvion);
                JOptionPane.showMessageDialog(null, "SE HA CANCELADO EL VUELO: " + vuelo.getCodigoVuelo().toUpperCase());
                lecturaV.close();
                lecturaAV.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "EL CODIGO DEL VUELO INGRESADO NO EXISTE");
        } catch (IOException ex) {
            System.err.println("ERROR IO");
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR CLASSNOTFOUND");
        }

    }
    public static void posponerVuelo(String codVuelo,Date nuevaFecha){
        FileInputStream archivoV = null;
        try {
            archivoV = new FileInputStream(FILE_VUELO + "/" + codVuelo.toUpperCase());
            ObjectInputStream lecturaV = new ObjectInputStream(archivoV);
            Vuelo vuelo = (Vuelo) lecturaV.readObject();
            if(nuevaFecha.before(vuelo.getFechaSalida())){
                JOptionPane.showMessageDialog(null, "ESTAS INGRESANDO UNA FECHA ANTERIOR A LA ACTUAL");
            }else{
                if(vuelo.getEstado().equals(ESTADO_VUELO.CANCELADO) || vuelo.getEstado().equals(ESTADO_VUELO.COMPLETADO)){
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE POSPONER EL VUELO PORQUE YA FUE COMPLETADO O SE CANCELO");
                }else{
                    Vuelo newVuelo = new Vuelo(vuelo.getCodigoVuelo(), vuelo.getCodAvion(), vuelo.getAeroOrigen(), vuelo.getAeroDestino(), vuelo.getPrecioBoleto(), nuevaFecha, ESTADO_VUELO.RETRASADO);
                    GuardarArchivoBinario.guardarVuelo(newVuelo);
                }
                
            }
            lecturaV.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "EL CODIGO DEL VUELO INGRESADO NO EXISTE");
        } catch (IOException ex) {
            System.err.println("ERROR IO");
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR CLASSNOTFOUND");
        }

    }
        
}
