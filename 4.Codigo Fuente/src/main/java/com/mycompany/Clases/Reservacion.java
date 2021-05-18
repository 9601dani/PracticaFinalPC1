package com.mycompany.Clases;

import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import com.mycompany.Interfaz.AsientosVuelos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Reservacion implements Serializable{
    private int no_Pasaporte;
    private String codigo_vuelo;
    private long no_Tarjeta;
    private String no_Asiento;

    public Reservacion(int no_Pasaporte, String codigo_vuelo, long no_Tarjeta, String no_Asiento) {
        this.no_Pasaporte = no_Pasaporte;
        this.codigo_vuelo = codigo_vuelo;
        this.no_Tarjeta = no_Tarjeta;
        this.no_Asiento = no_Asiento;
        this.modificarAsiento(no_Asiento,codigo_vuelo);
    }

    public int getNo_Pasaporte() {
        return no_Pasaporte;
    }

    public String getCodigo_vuelo() {
        return codigo_vuelo;
    }

    public long getNo_Tarjeta() {
        return no_Tarjeta;
    }

    public String getNo_Asiento() {
        return no_Asiento;
    }

    public void setNo_Pasaporte(int no_Pasaporte) {
        this.no_Pasaporte = no_Pasaporte;
    }

    public void setCodigo_vuelo(String codigo_vuelo) {
        this.codigo_vuelo = codigo_vuelo;
    }

    public void setNo_Tarjeta(int no_Tarjeta) {
        this.no_Tarjeta = no_Tarjeta;
    }

    public void setNo_Asiento(String no_Asiento) {
        this.no_Asiento = no_Asiento;
    }
    public void modificarAsiento(String numA,String codVuelo){
      try {
            FileInputStream archivoVuelo = new FileInputStream(FILE_VUELO + "/" + codVuelo.toUpperCase());
            ObjectInputStream lecturaV = new ObjectInputStream(archivoVuelo);
            Vuelo vuelo = (Vuelo)lecturaV.readObject(); 
            
            FileInputStream archivoAvion = new FileInputStream(FILE_AVIONES + "/" + vuelo.getCodAvion().toUpperCase());
            ObjectInputStream lecturaA = new ObjectInputStream(archivoAvion);
            Avion avion = (Avion) lecturaA.readObject(); 
            
            int[]newAsientos= avion.getAsientos();
            if(newAsientos[Integer.parseInt(numA)-1]==1){
                JOptionPane.showMessageDialog(null, "EL ASIENTO "+numA +" YA ESTA OCUPADO INTENTA OTRO");
            }else{
                newAsientos[Integer.parseInt(numA)-1]=1;
            
            Avion av= new Avion(avion.getNomAerolinea(),avion.getAeropuertoActual(),avion.getCodigoAvion(),avion.getCapacidadP(),avion.getCantGasolina(),avion.getConsumoMilla(),newAsientos);
            GuardarArchivoBinario.guardarAvion(av);
            lecturaA.close();
            lecturaV.close();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
