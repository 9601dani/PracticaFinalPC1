
package com.mycompany.Interfaz;

import com.mycompany.Clases.Gerente;
import static com.mycompany.Interfaz.MenuPrincipal.pantalla;

public class MenuGerente extends javax.swing.JInternalFrame {

    public MenuGerente(Gerente gerente) {
        initComponents();
        tituloGerente.setText(gerente.getNombreG());
        tituloAerolinea.setText(gerente.getAerolinea());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tituloGerente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tituloAerolinea = new javax.swing.JLabel();
        botonIngresoNCliente = new javax.swing.JButton();

        jLabel1.setText("GERENTE EN SESION:");

        jLabel2.setText("NOMBRE DE LA AEROLINEA:");

        botonIngresoNCliente.setText("INGRESAR NUEVO CLIENTE");
        botonIngresoNCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoNClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tituloGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(botonIngresoNCliente)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonIngresoNCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tituloAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresoNClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoNClienteActionPerformed
        IngresarNuevoCliente nuev = new IngresarNuevoCliente(tituloGerente.getText());
        pantalla.add(nuev);
        nuev.show();
    }//GEN-LAST:event_botonIngresoNClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresoNCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel tituloAerolinea;
    private javax.swing.JLabel tituloGerente;
    // End of variables declaration//GEN-END:variables
}
