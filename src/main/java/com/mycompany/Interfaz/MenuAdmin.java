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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE DE ADMIN: ");

        nomAdmin.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        nomAdmin.setForeground(new java.awt.Color(0, 0, 0));

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/imagen.png")); // NOI18N
        jMenu1.setText("INGRESO DE DATOS");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem1.setText("CREAR NUEVO USUARIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem2.setText("CREAR NUEVO AEROPUERTO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem3.setText("CREAR NUEVA DISTANCIA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem4.setText("CREAR NUEVA AEROLINEA");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/subidaD.png")); // NOI18N
        jMenu2.setText("CARGAR INFORMACION");
        jMenu2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo2.png")); // NOI18N
        jMenuItem5.setText("CARGAR DATOS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/actu.png")); // NOI18N
        jMenu3.setText("ACTUALIZAR DATOS");
        jMenu3.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/actua.png")); // NOI18N
        jMenuItem6.setText("ACTUALIZAR FECHA VENCIMIENTO DE PASAPORTE");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(nomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        IngresarNuevoAeropuerto NA= new IngresarNuevoAeropuerto(nomAdmi);
       pantalla.add(NA);
       NA.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CrearUsuario nuevo= new CrearUsuario(nomAdmi);
            pantalla.add(nuevo);
            nuevo.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IngresarNuevaDistancia ND= new IngresarNuevaDistancia(nomAdmi);
        pantalla.add(ND);
        ND.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         CrearUsuario nuevo= new CrearUsuario(nomAdmi);
            pantalla.add(nuevo);
            nuevo.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        InterfazSubidaDeDatos SD= new InterfazSubidaDeDatos(nomAdmi);
        pantalla.add(SD);
        SD.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RenovacionPasaporte RP= new RenovacionPasaporte(nomAdmi);
        pantalla.add(RP);
        RP.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomAdmin;
    // End of variables declaration//GEN-END:variables
}
