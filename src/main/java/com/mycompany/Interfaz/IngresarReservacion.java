package com.mycompany.Interfaz;

import com.mycompany.GestorArchivos.NuevaReservacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class IngresarReservacion extends javax.swing.JInternalFrame {
    private static DefaultListModel modeloLista;
    private int pasaporteCliente;
    public IngresarReservacion(int noPas) {
        initComponents();
        this.pasaporteCliente=noPas;
        NuevaReservacion.inicio();
        modeloLista = new DefaultListModel();
        jList1.setModel(modeloLista);
        noPasText.setText(Integer.toString(this.pasaporteCliente));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        origen = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        aerolineaText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        botonBuscar = new javax.swing.JButton();
        fechaS = new javax.swing.JFormattedTextField();
        titulo = new javax.swing.JLabel();
        noPasText = new javax.swing.JFormattedTextField();
        titulo1 = new javax.swing.JLabel();
        codVuelo = new javax.swing.JTextField();
        titulo2 = new javax.swing.JLabel();
        noAsiento = new javax.swing.JTextField();
        botonReservacion = new javax.swing.JButton();
        botonVerAsientos = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("CIUDAD DE ORIGEN");

        jLabel2.setText("CIUDAD DESTINO");

        jLabel3.setText("FECHA DE VUELO");

        jLabel4.setText("AEROLINEA");

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        botonBuscar.setText("BUSCAR VUELO");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        try {
            fechaS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        titulo.setText("INGRESA NUMERO DE PASAPORTE");

        noPasText.setEditable(false);
        try {
            noPasText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        titulo1.setText("INGRESA CODIGO DE VUELO QUE DESEA");

        titulo2.setText("INGRESAR ASIENTO QUE DESEA");

        botonReservacion.setText("HACER RESERVACION");

        botonVerAsientos.setText("VER ASIENTOS");
        botonVerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerAsientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(origen)
                            .addComponent(destino)
                            .addComponent(aerolineaText)
                            .addComponent(fechaS, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscar)
                                .addGap(32, 32, 32)
                                .addComponent(botonVerAsientos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReservacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(titulo)
                                        .addGap(41, 41, 41)
                                        .addComponent(noPasText, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(titulo1)
                                            .addComponent(titulo2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(codVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(noAsiento))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo)
                    .addComponent(noPasText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo1)
                    .addComponent(codVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo2)
                            .addComponent(noAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aerolineaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonBuscar))
                    .addComponent(botonReservacion)
                    .addComponent(botonVerAsientos))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String ciudad_origen= origen.getText();
            String ciudad_destino= destino.getText();
            Date fecha_vuelo=sdf.parse(fechaS.getText());
            String aerolinea= aerolineaText.getText();
            if(ciudad_origen!="" && ciudad_destino!="" && aerolinea!=""){
                NuevaReservacion NR= new NuevaReservacion(this,ciudad_origen.toUpperCase(),ciudad_destino.toUpperCase(),fecha_vuelo,aerolinea.toUpperCase());
                NR.verVuelos();
            }
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"EL FORMATO DE FECHA NO ES CORRECTO");
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed
    
    public static void limpiarLista(){
        modeloLista.clear();
    }
    public static DefaultListModel getModeloLista() {
        return modeloLista;
    }
    public void verVuelosLista(String linea){
        modeloLista.addElement(linea);
    }
    
    private void botonVerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerAsientosActionPerformed
        String codV= JOptionPane.showInputDialog("DIGITA EL CODIGO DEL VUELO");
        NuevaReservacion.verAsientosAvion(codV);
    }//GEN-LAST:event_botonVerAsientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aerolineaText;
    private javax.swing.JButton botonBuscar;
    public static javax.swing.JButton botonReservacion;
    public static javax.swing.JButton botonVerAsientos;
    public static javax.swing.JTextField codVuelo;
    private javax.swing.JTextField destino;
    private javax.swing.JFormattedTextField fechaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField noAsiento;
    public static javax.swing.JFormattedTextField noPasText;
    private javax.swing.JTextField origen;
    public static javax.swing.JLabel titulo;
    public static javax.swing.JLabel titulo1;
    public static javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
