package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AsientosVuelos extends javax.swing.JInternalFrame {
private String codAvion;
private static final int aumentoX=50;
private int aumentoFinalY;
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

        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jLabel1.setText("CODIGO DEL AVION");

        titulo.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jScrollPane1.setAutoscrolls(true);

        panel1.setColumns(20);
        panel1.setRows(5);
        jScrollPane1.setViewportView(panel1);

        jLabel2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("DEJA PRESIONADO ENTER PARA VISUALIZAR TODOS LOS ASIENTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 150, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public  void generarLabels(){
        try {
            aumentoFinalY=0;
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
                   aumentoFinalY+=aumentoY;
                    posInicialX=posInicialx;
                }else{
                    posInicialX+=aumentoX;
                }
               
            }
            lecturaA.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL ARCHIVO");
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea panel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
