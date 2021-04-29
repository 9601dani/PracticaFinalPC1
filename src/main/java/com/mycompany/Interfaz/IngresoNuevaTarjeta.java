
package com.mycompany.Interfaz;

import com.mycompany.Clases.Tarjeta;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_TARJETAS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class IngresoNuevaTarjeta extends javax.swing.JInternalFrame {
private String noTarj;
private int noPasaporte;
    public IngresoNuevaTarjeta(String noTarjeta, int noPasaport) {
        this.noTarj=noTarjeta;
        this.noPasaporte=noPasaport;
        initComponents();
        pasaporteText.setText(noTarjeta);
        tarjetaText.setText(Integer.toString(noPasaport));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        botoNuevaTarjeta = new javax.swing.JButton();
        tarjetaText = new javax.swing.JTextField();
        pasaporteText = new javax.swing.JTextField();
        dineroText = new javax.swing.JTextField();
        codigoText = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO AL INGRESO DE UNA NUEVA TARJETA");

        jLabel2.setText("NUMERO DE TARJETA");

        jLabel3.setText("NUMERO DE PASAPORTE");

        jLabel4.setText("DINERO ACTUAL");

        jLabel5.setText("CODIGO DE SEGURIDAD");

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        botoNuevaTarjeta.setText("CREAR TARJETA");
        botoNuevaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoNuevaTarjetaActionPerformed(evt);
            }
        });

        tarjetaText.setEditable(false);

        pasaporteText.setEnabled(false);

        codigoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pasaporteText)
                                    .addComponent(tarjetaText)
                                    .addComponent(dineroText)
                                    .addComponent(codigoText, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(botoNuevaTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tarjetaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pasaporteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dineroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(botoNuevaTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextActionPerformed

    private void botoNuevaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoNuevaTarjetaActionPerformed
        double dineroA= Double.parseDouble(dineroText.getText());
        String cod= codigoText.getText();
        try {
                FileInputStream archivoB = new FileInputStream(FILE_TARJETAS + "/" +noTarj );
                JOptionPane.showMessageDialog(null, "YA EXISTE ESTA TARJETA");
                dineroText.setText("");
                codigoText.setText("");
            } catch (FileNotFoundException ex) {
                if (dineroA != 0 && (cod != "" || cod != null)) {
                    Tarjeta NTarjeta = new Tarjeta(noTarj, noPasaporte, dineroA, cod);
                    GuardarArchivoBinario.guardarTarjeta(NTarjeta);
                    JOptionPane.showMessageDialog(null, "VAMOS A INGRESAR LA SOLICITUD");
                    dineroText.setText("");
                    codigoText.setText("");
                } else {
                 JOptionPane.showMessageDialog(null, "REVISA EL INGRESO DE CAMPOS, PARECE QUE HAY CAMPOS VACIOS");
                }

         }


        
        
        
       
    }//GEN-LAST:event_botoNuevaTarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoNuevaTarjeta;
    private javax.swing.JTextField codigoText;
    private javax.swing.JTextField dineroText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField pasaporteText;
    private javax.swing.JTextField tarjetaText;
    // End of variables declaration//GEN-END:variables
}
