
package com.mycompany.Interfaz;

import com.mycompany.Clases.Aeropuerto;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROPUERTO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class IngresarNuevoAeropuerto extends javax.swing.JInternalFrame {

    public IngresarNuevoAeropuerto(String nomA) {
        initComponents();
        tituloNombre.setText("**** "+nomA.toUpperCase()+" ****");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreAText = new javax.swing.JTextField();
        ciuidadText = new javax.swing.JTextField();
        paisText = new javax.swing.JTextField();
        botonNuevoAeropuerto = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("BIENVENIDO AL INGRESO DE AEROPUERTOS");

        jLabel2.setText("Nombre del Aeropuerto");

        jLabel3.setText("Ciudad");

        jLabel4.setText("Pais");

        ciuidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciuidadTextActionPerformed(evt);
            }
        });

        botonNuevoAeropuerto.setText("GUARDAR DATOS ");
        botonNuevoAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoAeropuertoActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jLabel5.setText("USUARIO EN SESION:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ciuidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreAText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(botonNuevoAeropuerto))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreAText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ciuidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addComponent(botonNuevoAeropuerto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciuidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciuidadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciuidadTextActionPerformed

    private void botonNuevoAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoAeropuertoActionPerformed
       String nom= nombreAText.getText();
       String ciu= ciuidadText.getText();
       String pa= paisText.getText();
       try {
            FileInputStream archivoB = new FileInputStream(FILE_AEROPUERTO + "/" +nom.toUpperCase());
            JOptionPane.showMessageDialog(null, "YA EXISTE ESTE AEROPUERTO");
            nombreAText.setText("");
            ciuidadText.setText("");
            paisText.setText("");
        } catch (FileNotFoundException ex) {
            Aeropuerto aero;
           if (nom != null && ciu != null && pa != null) {
               aero = new Aeropuerto(nom, ciu, pa);
               GuardarArchivoBinario.guardarAeroPuertos(aero);
               JOptionPane.showMessageDialog(null, "HEMOS INGRESADO TU SOLICITUD");
               nombreAText.setText("");
               ciuidadText.setText("");
               paisText.setText("");
               this.dispose();
           } else {
               JOptionPane.showMessageDialog(null, "TENEMOS PROBLEMAS, POQUE HAY CAMOS VACIOS");
           }

        }
       
    }//GEN-LAST:event_botonNuevoAeropuertoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNuevoAeropuerto;
    private javax.swing.JTextField ciuidadText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nombreAText;
    private javax.swing.JTextField paisText;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables
}
