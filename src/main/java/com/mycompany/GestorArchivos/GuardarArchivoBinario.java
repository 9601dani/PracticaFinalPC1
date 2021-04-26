
package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Cliente;
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
              System.err.println("ERROR EN EL ARCHIVO");
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
              System.err.println("ERROR EN EL ARCHIVO");
          }
     }
}
