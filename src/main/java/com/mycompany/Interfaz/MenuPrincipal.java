
package com.mycompany.Interfaz;

import java.awt.Frame;

public class MenuPrincipal extends javax.swing.JFrame {
    //varibales del fondo

    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(Frame.MAXIMIZED_BOTH);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JDesktopPane();
        imagenLogo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        logoDaniel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicioSesion = new javax.swing.JMenu();
        botonInicioSesion = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        imagenLogo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoPersonalizado.png")); // NOI18N

        titulo.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("MISION");

        titulo1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("VISION");

        logoDaniel.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoDaniel.png")); // NOI18N

        inicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        inicioSesion.setText("Comenzar");
        inicioSesion.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSesionActionPerformed(evt);
            }
        });

        botonInicioSesion.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        botonInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        botonInicioSesion.setText("Inicia Sesion");
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });
        inicioSesion.add(botonInicioSesion);

        jMenuBar1.add(inicioSesion);

        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("Salir");
        salir.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N

        cerrarSesion.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        salir.add(cerrarSesion);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoDaniel, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pantalla))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla))
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addGap(48, 48, 48)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoDaniel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSesionActionPerformed
       
    }//GEN-LAST:event_inicioSesionActionPerformed

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
       InicioSesion inicio = new InicioSesion(); //CREO LA PANTALLA PARA GENERAR EL INICIO DE SESION
          this.pantalla.add(inicio);
            inicio.show();
          
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        limpiarPantalla();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    
    public void limpiarPantalla(){
        pantalla.removeAll();
        pantalla.repaint();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botonInicioSesion;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JMenu inicioSesion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel logoDaniel;
    public static javax.swing.JDesktopPane pantalla;
    private javax.swing.JMenu salir;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}

