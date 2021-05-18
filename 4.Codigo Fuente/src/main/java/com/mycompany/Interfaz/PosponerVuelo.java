
package com.mycompany.Interfaz;

import static com.mycompany.GestorArchivos.ManejadorOperadorVuelo.posponerVuelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class PosponerVuelo extends javax.swing.JInternalFrame {
private String codVuelo;
    public PosponerVuelo(String codVuelo) {
        initComponents();
        this.codVuelo=codVuelo;
        codigoText.setText(this.codVuelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        newFecha = new javax.swing.JFormattedTextField();
        botonPosponer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("CODIGO DEL VUELO");

        codigoText.setEditable(false);

        jLabel2.setText("NUEVA FECHA DE VUELO");

        try {
            newFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botonPosponer.setText("POSPONER VUELO");
        botonPosponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPosponerActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoText)
                            .addComponent(newFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(botonPosponer)))
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(botonPosponer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPosponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPosponerActionPerformed
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String codVu= codigoText.getText();
        Date newFech= sdf.parse(newFecha.getText());
        posponerVuelo(codVu,newFech);
        JOptionPane.showMessageDialog(null, "HEMOS INGRESADO LA SOLICITUD PARA POSPONER EL VUELO");
        this.dispose();
        
    } catch (ParseException ex) {
        JOptionPane.showMessageDialog(null, "NO CUMPLE EL FORMATO DE FECHA INTENTA NUEVAMENTE");
    }
        
        
    }//GEN-LAST:event_botonPosponerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPosponer;
    private javax.swing.JTextField codigoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField newFecha;
    // End of variables declaration//GEN-END:variables
}
