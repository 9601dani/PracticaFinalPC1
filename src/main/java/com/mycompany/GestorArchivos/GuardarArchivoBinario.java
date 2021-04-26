
package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class GuardarArchivoBinario {
     public static final File  FILE_USUARIOS= new File("/home/daniel/NetBeansProjects/Proyecto2IPC/Usuarios");
    
     public static void guardarUsuario(Usuario usuario){
     FileOutputStream fileOutput; 
     ObjectOutputStream salida;  
          try {
            fileOutput = new FileOutputStream(FILE_USUARIOS+"/"+usuario.getNombre());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(usuario);
            salida.close();
          } catch (FileNotFoundException ex) {
              System.err.println("NO SE ENCONTRO EL ARCHIVO");
          } catch (IOException ex) {
              System.err.println("ERROR EN EL ARCHIVO");
          }
           
        
     }
}
