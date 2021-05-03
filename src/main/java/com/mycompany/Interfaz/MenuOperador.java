package com.mycompany.Interfaz;

import com.mycompany.Clases.Operador;

public class MenuOperador extends javax.swing.JInternalFrame {
    private String nombreOperador;
    public MenuOperador(Operador operador) {
        initComponents();
        nomAerolinea.setText("*** "+operador.getAerolinea().toUpperCase()+" ***");
        nomTitulo.setText("*** "+operador.getNombreG().toUpperCase()+" ***");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomAerolinea = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setText("OPERADOR EN SESION:");

        nomTitulo.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jLabel2.setText("AEROLINEA:");

        nomAerolinea.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/avion.png")); // NOI18N
        jMenu1.setText("VUELOS");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/boleto.png")); // NOI18N
        jMenuItem1.setText("OPERAR VUELO");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/otrasOp.png")); // NOI18N
        jMenu2.setText("OTRAS FUNCIONES");
        jMenu2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/ruta.png")); // NOI18N
        jMenuItem2.setText("VER DISTRIBUCION DE AVION");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nomTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel2))))
                .addGap(67, 67, 67)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(nomTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomAerolinea;
    private javax.swing.JLabel nomTitulo;
    // End of variables declaration//GEN-END:variables
}
