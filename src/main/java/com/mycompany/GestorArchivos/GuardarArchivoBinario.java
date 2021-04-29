
package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Aerolinea;
import com.mycompany.Clases.Aeropuerto;
import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Distancia;
import com.mycompany.Clases.Gerente;
import com.mycompany.Clases.Tarjeta;
import com.mycompany.Clases.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;


public class GuardarArchivoBinario {
     public static final File  FILE_USUARIOS= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Usuarios");
     public static final File FILE_CLIENTES= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Cliente");
     public static final File FILE_TARJETAS= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Tarjeta");
     public static final File FILE_GERENTE= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Gerente");
     public static final File FILE_AEROPUERTO= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Aeropuerto");
     public static final File FILE_DISTANCIA= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Distancias");
     public static final File FILE_AEROLINEA= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Aerolineas");
     
     public static void guardarUsuario(Usuario usuario){ 
        try {
            FileOutputStream archivoL;
            ObjectOutputStream salida;
            archivoL = new FileOutputStream(FILE_USUARIOS+"/"+usuario.getNombre());
            salida = new ObjectOutputStream(archivoL);
            salida.writeObject(usuario);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se creo el usuario: "+usuario.getNombre().toUpperCase() +" Exitosamente");
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO USUARIO");
          }
     }
     public static void guardarUsuarioCliente(Cliente cliente){  
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_CLIENTES+"/"+cliente.getNoPasaporte());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(cliente);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se creo el usuario: "+cliente.getNombre().toUpperCase() +" Exitosamente");
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO CLIENTE");
          }
     }
      public static void guardarTarjeta(Tarjeta tarjeta){  
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_TARJETAS+"/"+tarjeta.getNumeroTarjeta());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(tarjeta);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se Guardo la tarjeta "+ tarjeta.getNumeroTarjeta() +" Exitosamente");
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO TARJETA");
          }
     }
      public static void guardarGerente(Gerente gerente){  
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_GERENTE+"/"+gerente.getAerolinea().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(gerente);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se Guardo el gerente de la aerolinea"+ gerente.getAerolinea() +" Exitosamente");
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO GERENTE");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO GERENTE");
          }
     }
       public static void guardarAeroPuertos(Aeropuerto aeropuerto){  
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_AEROPUERTO+"/"+aeropuerto.getNombreA().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(aeropuerto);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se Guardo el aeropuerto"+ aeropuerto.getNombreA() +" de "+ aeropuerto.getCiudad() +" Exitosamente");
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO AEROPUERTO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO GERENTE");
          }
     }
        public static void guardarDistancias(Distancia distancia){  
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_DISTANCIA+"/"+distancia.getAeroOrigen().toUpperCase()+"_"+distancia.getAeroDestino().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(distancia);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se Guardo la distancia de "+ distancia.getAeroOrigen() +" hasta "+ distancia.getAeroDestino());
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO DISTANCIA");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO DISTANCIA");
          }
     }
            public static void guardarAerolineas(Aerolinea aerolinea){  
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_AEROLINEA+"/"+aerolinea.getNombreA().toUpperCase()+"_"+aerolinea.getNombreaerolinea().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(aerolinea);
            salida.close();
            JOptionPane.showMessageDialog(null, "Se Guardo la aerolinea "+ aerolinea.getNombreaerolinea() +" en el aeropuerto "+ aerolinea.getNombreA());
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO DISTANCIA");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO DISTANCIA");
          }
     }
     
}
