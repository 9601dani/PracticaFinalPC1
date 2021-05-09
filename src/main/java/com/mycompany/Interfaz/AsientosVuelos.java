package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AsientosVuelos extends javax.swing.JInternalFrame {
private String codAvion;
private static final int aumentoX=50;
private static final int aumentoY=50;
private static final int ancho=50;
private static final int largo=100;
private static final int posInicialx=25;
    public AsientosVuelos(String codAvion) {
        initComponents();
        this.codAvion=codAvion.toUpperCase();
        titulo.setText("*** "+this.codAvion+" ***");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("CODIGO DEL AVION");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(804, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public  void generarLabels(){
        try {
            FileInputStream archivoAvion = new FileInputStream(FILE_AVIONES + "/" + codAvion.toUpperCase());
            ObjectInputStream lecturaA = new ObjectInputStream(archivoAvion);
            Avion avion = (Avion) lecturaA.readObject();
            int posInicialX=posInicialx;
            int posInicialY=20;
            for (int i = 1; i <= avion.getAsientos().length; i++) {
                    if(i==3 || i==7 || i==11 || i==15 ||i==19 ||i==23 ||i==27 ||i==27 ||i==31 ||i==35 ||i==39 ||i==43 ||i==47 ||i==51 ||i==55 ||i==59 ||i==63 ||i==67 ||i==71 ||i==75 ||i==79 ||i==83 ||i==87 ||i==91 ||i==95 ||i==99 ||i==103 ||i==107 ||i==111 ||i==115){
                    posInicialX+=aumentoX+30;
                    }
               
                System.out.println(avion.getAsientos()[i-1]);
                JLabel label = new JLabel();
                label.setText(Integer.toString(i));
                label.setVisible(true);
                label.setBounds(posInicialX, posInicialY, ancho, largo);
                if(avion.getAsientos()[i-1]==1){
                  label.setIcon(new ImageIcon("x.jpg"));
                }else{
                   label.setIcon(new ImageIcon("cheque.png"));
                   
                }
                panel1.add(label);
                
                if(i==0){
                    posInicialX+=aumentoX;
                }else if(i%4==0){
                    posInicialY+=aumentoY;
                    posInicialX=posInicialx;
                }else{
                    posInicialX+=aumentoX;
                }
               
            }
            lecturaA.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
