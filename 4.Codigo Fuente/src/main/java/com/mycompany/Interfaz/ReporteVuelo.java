/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Vuelo;
import com.mycompany.Enum.ESTADO_VUELO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import com.mycompany.Manejador.Manejador_Admin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ReporteVuelo extends javax.swing.JInternalFrame {
    private static DefaultListModel modeloLista;
    public ReporteVuelo() {
        initComponents();
        modeloLista = new DefaultListModel();
        jList1.setModel(modeloLista);
    }
    public static void limpiarListaAd(){
        modeloLista.clear();
    }

    public JList<String> getjList1() {
        return jList1;
    }


    public void añadirParaReporte(String linea){
        modeloLista.addElement(linea);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setClosable(true);

        jLabel1.setText("AQUI MOSTRAREMOS EL REPORTE DE VUELOS");

        jButton1.setText("Ver Reporte por Vuelo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1)))
                .addContainerGap(620, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codV= JOptionPane.showInputDialog(null,operarVuelo()+"\n INGRESE EL CODIGO DE VUELO QUE DESEA VER: ");
         try {
             Manejador_Admin MA= new Manejador_Admin(this);
             MA.presentarPasajeros(codV);
        } catch (NumberFormatException exepcionNula) {
            JOptionPane.showMessageDialog(null, "**CAMPO VACIO** DEBES DIGITAR UNA OPCION PARA CONTINUAR");
        } catch (java.lang.NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "*** CAMPO VACIO ***");
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed
    
     public String operarVuelo() {
        String[] posiblesVuelos = FILE_VUELO.list();
        String presentar = "";
        int contador = 0;
        for (int i = 0; i < posiblesVuelos.length; i++) {
            FileInputStream archivoL;
            try {
                archivoL = new FileInputStream(FILE_VUELO + "/" + posiblesVuelos[i]);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Vuelo vuelo = (Vuelo) lectura.readObject();

                FileInputStream archivoA = new FileInputStream(FILE_AVIONES + "/" + vuelo.getCodAvion().toUpperCase());
                ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
                Avion avion = (Avion) lecturaA.readObject();
                if (vuelo.getEstado().equals(ESTADO_VUELO.CANCELADO)) {
                }else{
                    contador++;
                    presentar += contador + ". CODIGO DE VUELO: " + vuelo.getCodigoVuelo().toUpperCase() + "\n";
                }
                lectura.close();
                lectura.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showConfirmDialog(null, "NO HAS INGRESADO UN CODIGO DE VUELO VALIDO :(");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASNOTFOUN OPERARVuelo");
            }

        }

        return presentar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
