
package com.mycompany.Interfaz;

import com.mycompany.Clases.Gerente;

public class MenuGerente extends javax.swing.JInternalFrame {

    public MenuGerente(Gerente gerente) {
        initComponents();
        tituloGerente.setText("*** "+gerente.getNombreG().toUpperCase()+" ***");
        tituloAerolinea.setText("*** "+gerente.getAerolinea().toUpperCase()+" ***");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tituloGerente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tituloAerolinea = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel1.setText("GERENTE EN SESION:");

        jLabel2.setText("NOMBRE DE LA AEROLINEA:");

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/reporte.png")); // NOI18N
        jMenu1.setText("REPORTES");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/ruta.png")); // NOI18N
        jMenuItem1.setText("RUTAS");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/pasaporte.png")); // NOI18N
        jMenuItem2.setText("PASAPORTES RECHAZADOS");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/ganancias.png")); // NOI18N
        jMenuItem3.setText("GANANCIAS");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/vuelosS.png")); // NOI18N
        jMenuItem4.setText("VUELOS DE SUCURSALES ");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/otrasOp.png")); // NOI18N
        jMenu2.setText("OTRAS FUNCIONES");
        jMenu2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem5.setText("OPERAR VUELO");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo2.png")); // NOI18N
        jMenuItem6.setText("OBSERVAR DISTRIBUCION");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(tituloGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tituloAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tituloGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tituloAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel tituloAerolinea;
    private javax.swing.JLabel tituloGerente;
    // End of variables declaration//GEN-END:variables
}
