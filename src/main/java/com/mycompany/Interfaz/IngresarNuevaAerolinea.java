package com.mycompany.Interfaz;

import com.mycompany.Clases.Aerolinea;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROLINEA;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class IngresarNuevaAerolinea extends javax.swing.JInternalFrame {

    public IngresarNuevaAerolinea(String nom) {
        initComponents();
        tituloNombre.setText("**** "+nom.toUpperCase()+" ****");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aeropuertoText = new javax.swing.JTextField();
        aerolineaText = new javax.swing.JTextField();
        botonNuevaAerolinea = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("BIENVENIDO AL INGRESO DE AEROLINEAS");

        jLabel2.setText("NOMBRE DEL AEROPUERTO");

        jLabel3.setText("NOMBRE DE LA AEROLINEA");

        botonNuevaAerolinea.setText("GUARDAR DATOS");
        botonNuevaAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaAerolineaActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aeropuertoText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevaAerolinea))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aeropuertoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonNuevaAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevaAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaAerolineaActionPerformed
        String nomA= aeropuertoText.getText();
        String nomAER=aerolineaText.getText();
        Aerolinea aerolinea;
          try {
            FileInputStream archivoB = new FileInputStream(FILE_AEROLINEA + "/" + nomA.toUpperCase() + "_" + nomAER.toUpperCase());
            JOptionPane.showMessageDialog(null, "YA EXISTE ESTA AEROLINEA EN EL AEROPUERTO " + nomA.toUpperCase());
            aerolineaText.setText("");
        } catch (FileNotFoundException ex) {
            if (nomA != null && nomA != "" && nomAER != null && nomAER != "") {
                aerolinea = new Aerolinea(nomA, nomAER);
                GuardarArchivoBinario.guardarAerolineas(aerolinea);
                JOptionPane.showMessageDialog(null, "HEMOS REGISTRADO TU SOLICITUD");
                aeropuertoText.setText("");
                aerolineaText.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "HEMOS VISTO QUE HAY CAMPOS VACIOS REVISALOS");
            }

        }
                
    }//GEN-LAST:event_botonNuevaAerolineaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aerolineaText;
    private javax.swing.JTextField aeropuertoText;
    private javax.swing.JButton botonNuevaAerolinea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables
}
