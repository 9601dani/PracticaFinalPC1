package com.mycompany.Interfaz;

import javax.swing.JOptionPane;


public class InterfazMenuUsuario extends javax.swing.JInternalFrame {
    private String nombreU;
    public InterfazMenuUsuario(String usuario) {
        initComponents();
        this.nombreU=usuario;
        noUsuarioText.setText(nombreU);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noUsuarioText = new javax.swing.JLabel();
        tituloLogo = new javax.swing.JLabel();
        botonBoletosComprados = new javax.swing.JButton();
        botonGastosPorTarjeta = new javax.swing.JButton();
        botonDatosPersonales = new javax.swing.JButton();
        botonMillasRecorridas = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("NO DE USUARIO EN SESION");

        noUsuarioText.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        noUsuarioText.setForeground(new java.awt.Color(0, 0, 0));

        tituloLogo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        botonBoletosComprados.setText("Boletos Comprados");
        botonBoletosComprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBoletosCompradosActionPerformed(evt);
            }
        });

        botonGastosPorTarjeta.setText("Gastos Por Tarjeta");
        botonGastosPorTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGastosPorTarjetaActionPerformed(evt);
            }
        });

        botonDatosPersonales.setText("Datos Personales");
        botonDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosPersonalesActionPerformed(evt);
            }
        });

        botonMillasRecorridas.setText("Millas Recorridas");
        botonMillasRecorridas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMillasRecorridasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(noUsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonBoletosComprados)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonGastosPorTarjeta)
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(botonMillasRecorridas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(tituloLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(noUsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBoletosComprados, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(botonDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGastosPorTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMillasRecorridas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tituloLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBoletosCompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBoletosCompradosActionPerformed
      JOptionPane.showMessageDialog(null,"VAMOS A VER TUS BOLETOS COMPRADOS");
      
    }//GEN-LAST:event_botonBoletosCompradosActionPerformed

    private void botonDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosPersonalesActionPerformed
        JOptionPane.showMessageDialog(null,"VAMOS A VER TUS DATOS PERSONALES");
    }//GEN-LAST:event_botonDatosPersonalesActionPerformed

    private void botonGastosPorTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGastosPorTarjetaActionPerformed
       JOptionPane.showMessageDialog(null,"VAMOS A VER LOS GASTOS DE TU TARJETA");
    }//GEN-LAST:event_botonGastosPorTarjetaActionPerformed

    private void botonMillasRecorridasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMillasRecorridasActionPerformed
        JOptionPane.showMessageDialog(null,"VAMOS A VER TUS MILLAS RECORRIDAS");
    }//GEN-LAST:event_botonMillasRecorridasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBoletosComprados;
    private javax.swing.JButton botonDatosPersonales;
    private javax.swing.JButton botonGastosPorTarjeta;
    private javax.swing.JButton botonMillasRecorridas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel noUsuarioText;
    private javax.swing.JLabel tituloLogo;
    // End of variables declaration//GEN-END:variables
}
