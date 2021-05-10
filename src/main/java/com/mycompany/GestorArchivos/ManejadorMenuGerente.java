
package com.mycompany.GestorArchivos;

import static com.mycompany.Interfaz.MenuPrincipal.avionImagen;
import static com.mycompany.Interfaz.MenuPrincipal.destinoTextAnimacion;
import static com.mycompany.Interfaz.MenuPrincipal.origenTextAnimacion;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejadorMenuGerente extends Thread {
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
        
        System.out.println(origenTextAnimacion.getLocation());
        System.out.println(destinoTextAnimacion.getLocation());
        int dx= avionImagen.getX();
        int dy= avionImagen.getY();
        do{
           try {
                
                Thread.sleep(10);
                if (dx <= destinoTextAnimacion.getX()) {
                    dx++;
                    dy--;
                }else{
                    System.out.println("holis");
                    detener();
                }
                avionImagen.setLocation(dx, dy);
            } catch (InterruptedException ex) {
                System.err.println("PROBLEMA EN EL HILO DE ANIMACION");
            }  
        }while(ejecutar);
    try {
        Thread.sleep(1000);
        System.out.println("SE PARO");
        System.out.println(avionImagen.getLocation());
        origenTextAnimacion.setText("");
        destinoTextAnimacion.setText("");
        origenTextAnimacion.setVisible(false);
        destinoTextAnimacion.setVisible(false);
        avionImagen.setVisible(false);
        avionImagen.setLocation(posI);
    } catch (InterruptedException ex) {
        Logger.getLogger(ManejadorMenuGerente.class.getName()).log(Level.SEVERE, null, ex);
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
    
}
