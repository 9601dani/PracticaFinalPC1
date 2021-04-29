package com.mycompany.Interfaz;

import static com.mycompany.Interfaz.MenuPrincipal.pantalla;

public class MenuAdmin extends javax.swing.JInternalFrame {
    private String nomAdmi;
    public MenuAdmin(String nom) {
        initComponents();
        this.nomAdmi= nom;
        nomAdmin.setText("**** " +nomAdmi.toUpperCase()+" ****");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomAdmin = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        botonNuevoUsuario = new javax.swing.JButton();
        botonNuevoAeropuerto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonNuevaDistancia = new javax.swing.JButton();
        botonNuevaAerolinea = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE DE ADMIN: ");

        nomAdmin.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        nomAdmin.setForeground(new java.awt.Color(0, 0, 0));

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        botonNuevoUsuario.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        botonNuevoUsuario.setText("CREAR NUEVO USUARIO");
        botonNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoUsuarioActionPerformed(evt);
            }
        });

        botonNuevoAeropuerto.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        botonNuevoAeropuerto.setText("CREAR NUEVO AEROPUERTO");
        botonNuevoAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoAeropuertoActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingreso Datos: ");

        botonNuevaDistancia.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        botonNuevaDistancia.setText("CREAR NUEVA DISTANCIA");
        botonNuevaDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaDistanciaActionPerformed(evt);
            }
        });

        botonNuevaAerolinea.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        botonNuevaAerolinea.setText("CREAR NUEVA AEROLINEA");
        botonNuevaAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaAerolineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonNuevaDistancia)
                            .addComponent(jLabel1)
                            .addComponent(nomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevoUsuario)
                            .addComponent(botonNuevoAeropuerto)
                            .addComponent(botonNuevaAerolinea))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(botonNuevoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNuevoAeropuerto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNuevaDistancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonNuevaAerolinea)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoUsuarioActionPerformed
            CrearUsuario nuevo= new CrearUsuario(nomAdmi);
            pantalla.add(nuevo);
            nuevo.show();
    }//GEN-LAST:event_botonNuevoUsuarioActionPerformed

    private void botonNuevoAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoAeropuertoActionPerformed
       IngresarNuevoAeropuerto NA= new IngresarNuevoAeropuerto(nomAdmi);
       pantalla.add(NA);
       NA.show();
    }//GEN-LAST:event_botonNuevoAeropuertoActionPerformed

    private void botonNuevaDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaDistanciaActionPerformed
        IngresarNuevaDistancia ND= new IngresarNuevaDistancia(nomAdmi);
        pantalla.add(ND);
        ND.show();
    }//GEN-LAST:event_botonNuevaDistanciaActionPerformed

    private void botonNuevaAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaAerolineaActionPerformed
       IngresarNuevaAerolinea NA= new IngresarNuevaAerolinea(nomAdmi);
       pantalla.add(NA);
       NA.show();
    }//GEN-LAST:event_botonNuevaAerolineaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNuevaAerolinea;
    private javax.swing.JButton botonNuevaDistancia;
    private javax.swing.JButton botonNuevoAeropuerto;
    private javax.swing.JButton botonNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomAdmin;
    // End of variables declaration//GEN-END:variables
}
