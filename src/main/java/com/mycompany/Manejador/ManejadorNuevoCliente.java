package com.mycompany.Manejador;

import com.mycompany.Clases.Cliente;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_USUARIOS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import javax.swing.JOptionPane;


public class ManejadorNuevoCliente {
    Cliente cliente;
    public void registrarNuevoCliente(int noPasaporte, String contraseña, Date fechaN,String naci,int selecC,String nom, String apelli,int selecG, Date fechaV, Date fechaE, String pais){
        FileInputStream archivoB;
        try {
            archivoB = new FileInputStream(FILE_USUARIOS+"/"+noPasaporte);
            JOptionPane.showMessageDialog(null, "EL USUARIO YA EXISTE");
        } catch (FileNotFoundException ex) {
                if(noPasaporte!=0 && contraseña!=null && fechaN!=null && naci!=null && nom!=null && apelli!=null && fechaV!=null && fechaE!=null && pais!=null){
                    cliente= new Cliente(noPasaporte,contraseña,fechaN,naci,selecC,nom,apelli,selecG,fechaV,fechaE,pais);
                    GuardarArchivoBinario.guardarUsuarioCliente(cliente);
                }else{
                    JOptionPane.showMessageDialog(null,"REVISA EL INGRESO DE CAMPOS");
                }   
        }
    }
}
