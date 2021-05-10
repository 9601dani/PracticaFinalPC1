package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import com.mycompany.Enum.ESTADO_AVION;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROLINEA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROPUERTO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CrearAvion extends javax.swing.JInternalFrame {

    public CrearAvion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aerolineaText = new javax.swing.JTextField();
        aeropuertoText = new javax.swing.JTextField();
        codigoAvionText = new javax.swing.JTextField();
        pasajerosText = new javax.swing.JTextField();
        gasolinaText = new javax.swing.JTextField();
        consumoText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonCrearAvion = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("NOMBRE DE AEROLINEA");

        jLabel2.setText("AEROPUERTO ACTUAL");

        jLabel3.setText("CODIGO DEL AVION");

        jLabel4.setText("CAPACIDAD DE PASAJEROS");

        jLabel5.setText("CAPACIDAD DE GASOLINA");

        jLabel6.setText("CONSUMO POR MILLA");

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        botonCrearAvion.setText("CREAR AVION");
        botonCrearAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearAvionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pasajerosText, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(gasolinaText)
                            .addComponent(consumoText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aeropuertoText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoAvionText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(botonCrearAvion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(aeropuertoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(codigoAvionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pasajerosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gasolinaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(consumoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonCrearAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearAvionActionPerformed
        String n= aerolineaText.getText();
        String n2= aeropuertoText.getText();
        String n3= codigoAvionText.getText();
        int n4= Integer.parseInt(pasajerosText.getText());
        double n5= Double.parseDouble(gasolinaText.getText());
        double n6= Double.parseDouble(consumoText.getText());
        try {
            FileInputStream archivoAviones = new FileInputStream(FILE_AVIONES + "/" + n3.toUpperCase());
        }catch (FileNotFoundException ex) {
            try {
                FileInputStream archivoAerolinea = new FileInputStream(FILE_AEROLINEA + "/" + n2.toUpperCase() + "_" + n.toUpperCase());
                    Avion NA= new Avion(n,n2,n3,n4,n5,n6,ESTADO_AVION.DISPONIBLE);
                    GuardarArchivoBinario.guardarAvion(NA);
                    aerolineaText.setText("");
                    aeropuertoText.setText("");
                    codigoAvionText.setText("");
                    pasajerosText.setText("");
                    gasolinaText.setText("");
                    consumoText.setText("");
                    JOptionPane.showMessageDialog(null, "HEMOS GUARDADO EL AVION");
                    this.dispose();
            }catch (FileNotFoundException e) {
               JOptionPane.showMessageDialog(null,"NO EXISTE LA AEROLINEA EN EL AEROPUERTO");
            } catch (IOException e) {
                System.err.println("ERROR IO");
            }
        } catch (IOException ex) {
            System.err.println("ERROR IO");
        }
    }//GEN-LAST:event_botonCrearAvionActionPerformed

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aerolineaText;
    private javax.swing.JTextField aeropuertoText;
    private javax.swing.JButton botonCrearAvion;
    private javax.swing.JTextField codigoAvionText;
    private javax.swing.JTextField consumoText;
    private javax.swing.JTextField gasolinaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pasajerosText;
    // End of variables declaration//GEN-END:variables
}
