package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Distancia;
import com.mycompany.Clases.Vuelo;
import com.mycompany.Enum.ESTADO_AVION;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROLINEA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_DISTANCIA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NuevoVuelo extends javax.swing.JInternalFrame {

    public NuevoVuelo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonIngresarVuelo = new javax.swing.JButton();
        n6 = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("INGRESO DE VUELOS");

        jLabel1.setText("CODIGO DEL VUELO");

        jLabel2.setText("CODIGO DEL AVION");

        jLabel3.setText("NOMBRE DEL AEROPUERTO DE ORIGEN");

        jLabel4.setText("NOMBRE DEL AEROPUERTO DESTINO");

        jLabel5.setText("PRECIO BOLETO");

        jLabel6.setText("FECHA DE SALIDA");

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        botonIngresarVuelo.setText("INGRESAR VUELO");
        botonIngresarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarVueloActionPerformed(evt);
            }
        });

        try {
            n6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(25, 25, 25)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n5)
                            .addComponent(n4)
                            .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(botonIngresarVuelo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(botonIngresarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarVueloActionPerformed
        try {                                         
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String m1= n1.getText();
                String m2= n2.getText();
                String m3=n3.getText();
                String m4= n4.getText();
                double m5= Double.parseDouble(n5.getText());
                Date m6= sdf.parse(n6.getText());
            try {
                FileInputStream archivoVuelo = new FileInputStream(FILE_VUELO + "/" + m1.toUpperCase());
                JOptionPane.showMessageDialog(null, "YA EXISTE EL CODIGO DEL VUELO");
            } catch (FileNotFoundException ex) {
                try {
                    FileInputStream archivoAvion = new FileInputStream(FILE_AVIONES + "/" + m2.toUpperCase());
                    ObjectInputStream lecturaA = new ObjectInputStream(archivoAvion);
                    Avion avion = (Avion) lecturaA.readObject();
                            try {
                                FileInputStream archivoDistancia = new FileInputStream(FILE_DISTANCIA + "/" + m3.toUpperCase() + "_" + m4.toUpperCase());
                                ObjectInputStream lecturaDistancia = new ObjectInputStream(archivoDistancia);
                                Distancia distancia = (Distancia) lecturaDistancia.readObject();
                                    try {
                                        FileInputStream archivoAeroDestino = new FileInputStream(FILE_AEROLINEA + "/" + m4.toUpperCase() + "_" + avion.getNomAerolinea().toUpperCase());
                                        FileInputStream archivoAerOrigen = new FileInputStream(FILE_AEROLINEA + "/" + m3.toUpperCase() + "_" + avion.getNomAerolinea().toUpperCase());
                                        double gasMini = avion.getConsumoMilla() * distancia.getCantMillas();
                                        if (gasMini <= avion.getCantGasolina()) {
                                            if (avion.getAeropuertoActual().equalsIgnoreCase(m3)) {
                                                if (avion.getEstado().equals(ESTADO_AVION.DISPONIBLE)) {
                                                    Avion av = new Avion(avion.getNomAerolinea(), avion.getAeropuertoActual(), avion.getCodigoAvion(), avion.getCapacidadP(), avion.getCantGasolina(), avion.getConsumoMilla(), avion.getAsientos(), ESTADO_AVION.OCUPADO);
                                                    Vuelo NV = new Vuelo(m1, m2, m3, m4, m5, m6);
                                                    GuardarArchivoBinario.guardarVuelo(NV);
                                                    GuardarArchivoBinario.guardarAvion(av);
                                                    JOptionPane.showMessageDialog(null, "SE HA INGRESADO EL VUELO");
                                                    limpiarTodo();
                                                    lecturaA.close();
                                                } else if (avion.getEstado().equals(ESTADO_AVION.OCUPADO)) {
                                                     JOptionPane.showMessageDialog(null," EL AVION " + avion.getCodigoAvion().toUpperCase() + "ACUTALMENTE NO ESTA DISPONIBLE");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null," EL AVION " + avion.getCodigoAvion().toUpperCase() + " NO SE ENCUENTRA EN " + m3.toUpperCase());
                                                limpiarTodo();
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null," NO SE PUDO GUARDAR YA QUE EL AVION NO TIENE EL SUFICIENTE ESPACIO DE GASOLINA");
                                            limpiarTodo();
                                        }
                                    } catch (FileNotFoundException dis) {
                                         JOptionPane.showMessageDialog(null," NO SE PUDO GUARDAR YA QUE LA AEROLINEA NO EXISTE EN EL AEROPUERTO");
                                         limpiarTodo();
                                    }
                            } catch (FileNotFoundException e) {
                               JOptionPane.showMessageDialog(null,"NO SE PUDO GUARDAR PORQUE NO EXISTE DATOS DE LA DISTANCIA ENTRE " + m3.toUpperCase() + " HASTA " + m4.toUpperCase());
                               limpiarTodo();
                            } catch (ClassNotFoundException e) {
                                System.err.println("NO SE PUDO LEER LA DISTANCIA");
                            }
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "NO EXISTE EL AVION INGRESADO");
                    n2.setText("");
                } catch (IOException e) {
                    System.err.println("1");
                } catch (ClassNotFoundException e) {
                    System.err.println("2");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(AsientosVuelos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "VERIFICA EL FORMATO DE LA FECHAS INGRESADAS");
        }
        
    }//GEN-LAST:event_botonIngresarVueloActionPerformed

     public void limpiarTodo(){
         n1.setText("");
         n2.setText("");
         n3.setText("");
         n4.setText("");
         n5.setText("");
         n6.setText("");
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresarVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JFormattedTextField n6;
    // End of variables declaration//GEN-END:variables
}
