
package com.mycompany.Interfaz;

import com.mycompany.GestorArchivos.ManejadorOperadorVuelo;
import java.awt.Frame;

public class MenuPrincipal extends javax.swing.JFrame{
    
    public MenuPrincipal() {
        initComponents();
        origenTextAnimacion.setVisible(false);
        destinoTextAnimacion.setVisible(false);
        avionImagen.setVisible(false);
        this.setExtendedState(Frame.MAXIMIZED_BOTH); 
        System.out.println(avionImagen.getLocation());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JDesktopPane();
        imagenLogo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        origenTextAnimacion = new javax.swing.JLabel();
        destinoTextAnimacion = new javax.swing.JLabel();
        avionImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicioSesion = new javax.swing.JMenu();
        botonInicioSesion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
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

        origenTextAnimacion.setText("jLabel1");

        destinoTextAnimacion.setText("jLabel1");

        avionImagen.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/avionAnimacion.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(origenTextAnimacion)
                    .addComponent(avionImagen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(destinoTextAnimacion)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(destinoTextAnimacion)
                .addGap(47, 47, 47)
                .addComponent(avionImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(origenTextAnimacion)
                .addGap(20, 20, 20))
        );

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
        botonInicioSesion.setText("INICIAR SESION");
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });
        inicioSesion.add(botonInicioSesion);

        jMenuItem1.setText("COMPRA DE BOLETO SIN USUARIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        inicioSesion.add(jMenuItem1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IngresarReservacion NR= new IngresarReservacion();
        pantalla.add(NR);
        NR.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    public void limpiarPantalla(){
        pantalla.removeAll();
        pantalla.repaint();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel avionImagen;
    private javax.swing.JMenuItem botonInicioSesion;
    private javax.swing.JMenuItem cerrarSesion;
    public static javax.swing.JLabel destinoTextAnimacion;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JMenu inicioSesion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel origenTextAnimacion;
    public static javax.swing.JDesktopPane pantalla;
    private javax.swing.JMenu salir;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables

   
}

