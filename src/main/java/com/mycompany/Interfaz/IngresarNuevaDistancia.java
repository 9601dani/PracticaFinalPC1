
package com.mycompany.Interfaz;


import com.mycompany.Clases.Distancia;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_DISTANCIA;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class IngresarNuevaDistancia extends javax.swing.JInternalFrame {

    public IngresarNuevaDistancia(String nm) {
        initComponents();
        titutoNombre.setText("**** "+ nm.toUpperCase() +" ****");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        origenText = new javax.swing.JTextField();
        destinoText = new javax.swing.JTextField();
        millasText = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        botonNuevaDistancia = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        titutoNombre = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("BIENVENIDO AL INGRESO DE DISTANCIAS");

        jLabel2.setText("Nombre del Aeropuerto Origen");

        jLabel3.setText("Nombre del Aeropuerto Destino");

        jLabel4.setText("Cantidad de Millas");

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        botonNuevaDistancia.setText("Guardar Datos");
        botonNuevaDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaDistanciaActionPerformed(evt);
            }
        });

        jLabel5.setText("USUARIO EN SESION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(origenText)
                                    .addComponent(destinoText)
                                    .addComponent(millasText, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(botonNuevaDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titutoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(origenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(destinoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(millasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(botonNuevaDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titutoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevaDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaDistanciaActionPerformed
        String origen= origenText.getText();
        String destino= destinoText.getText();
        double millaje= Double.parseDouble(millasText.getText());
        try {
            FileInputStream archivoB = new FileInputStream(FILE_DISTANCIA + "/" + origen.toUpperCase() + "_" + destino.toUpperCase());
            JOptionPane.showMessageDialog(null, "YA EXISTE ESTA LA DISTANCIA DE " + origen.toUpperCase() + " hasta " + destino.toUpperCase());
            origenText.setText("");
            destinoText.setText("");
            millasText.setText("");
        } catch (FileNotFoundException ex) {
            Distancia des;
            if (origen != null && destino != null && millaje != 0) {
                des = new Distancia(origen, destino, millaje);
                GuardarArchivoBinario.guardarDistancias(des);
                JOptionPane.showMessageDialog(null, "INGRESAMOS TU SOLICITUD DE DESTINO");
                origenText.setText("");
                destinoText.setText("");
                millasText.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "HEMOS VISTO QUE HAY CAMPOS VACIOS REVISALOS");
            }

        }
        
        
        
        
    }//GEN-LAST:event_botonNuevaDistanciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNuevaDistancia;
    private javax.swing.JTextField destinoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField millasText;
    private javax.swing.JTextField origenText;
    private javax.swing.JLabel titutoNombre;
    // End of variables declaration//GEN-END:variables
}
