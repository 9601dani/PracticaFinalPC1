
package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Aerolinea;
import com.mycompany.Clases.Aeropuerto;
import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Distancia;
import com.mycompany.Clases.Gerente;
import com.mycompany.Clases.Operador;
import com.mycompany.Clases.Reservacion;
import com.mycompany.Clases.Tarjeta;
import com.mycompany.Clases.Usuario;
import com.mycompany.Clases.Vuelo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class GuardarArchivoBinario {
     public static final File  FILE_USUARIOS= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Usuarios");
     public static final File FILE_CLIENTES= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Cliente");
     public static final File FILE_TARJETAS= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Tarjeta");
     public static final File FILE_GERENTE= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Gerente");
     public static final File FILE_AEROPUERTO= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Aeropuerto");
     public static final File FILE_DISTANCIA= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Distancias");
     public static final File FILE_AEROLINEA= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Aerolineas");
     public static final File FILE_RESERVACIONES= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Reservaciones");
     public static final File FILE_VUELO= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Vuelo");
     public static final File FILE_AVIONES= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Aviones");
     public static final File FILE_OPERADORES= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Operador");
      
     
     public static void guardarUsuario(Usuario usuario){ 
        try {
            FileOutputStream archivoL;
            ObjectOutputStream salida;
            archivoL = new FileOutputStream(FILE_USUARIOS+"/"+usuario.getNombre());
            salida = new ObjectOutputStream(archivoL);
            salida.writeObject(usuario);
            salida.close();
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO USUARIO");
          }
     }
     public static void guardarOperador(Operador operador){ 
        try {
            FileOutputStream archivoL;
            ObjectOutputStream salida;
            archivoL = new FileOutputStream(FILE_OPERADORES+"/"+operador.getNombreG());
            salida = new ObjectOutputStream(archivoL);
            salida.writeObject(operador);
            salida.close();
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO OPERADOR");
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
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO DISTANCIA");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO DISTANCIA");
          }
          
    }
     public static void guardarResevacion(Reservacion reservacion){
          
         try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_RESERVACIONES+"/"+reservacion.getNo_Pasaporte()+"_"+reservacion.getCodigo_vuelo().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(reservacion);
            salida.close();
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO RESERVACION");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO RESERVACION");
          }
     }  
      public static void guardarVuelo (Vuelo vuelo){
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_VUELO+"/"+vuelo.getCodigoVuelo().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(vuelo);
            salida.close();
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO VUELO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO VUELO");
          }
     }  
      public static void guardarAvion (Avion avion){
          try {
            FileOutputStream archivoU;
            ObjectOutputStream salida;
            archivoU = new FileOutputStream(FILE_AVIONES+"/"+avion.getCodigoAvion().toUpperCase());
            salida = new ObjectOutputStream(archivoU);
            salida.writeObject(avion);
            salida.close();
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO DEL AVION");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO AVION");
          }
     }  
         
    public static int VerEstado(String estado) {
        int x = 0;
        if (estado.equalsIgnoreCase("CASADO")) {
            x = 0;
        } else if (estado.equalsIgnoreCase("SOLTERO")) {
            x = 1;
        } else if (estado.equalsIgnoreCase("DIVORCIADO")) {
            x = 2;
        }
        return x;
    }
    public static int VerGenero(String estado) {
        int x = 0;
        if (estado.equalsIgnoreCase("MASCULINO")) {
            x = 0;
        } else if (estado.equalsIgnoreCase("FEMENINO")) {
            x = 1;
        } else if (estado.equalsIgnoreCase("SIN_DEFINIR")) {
            x = 2;
        }
        return x;
    }
    public void borrarArchivo(File archivoEliminar) {

        File fichero = new File(archivoEliminar.getAbsolutePath());

        if (fichero.delete()) {
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El fichero no pudó ser borrado");
        }

    }
     
}
