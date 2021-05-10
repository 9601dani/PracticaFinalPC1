
package com.mycompany.Interfaz;

import com.mycompany.Clases.Cliente;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class RenovacionPasaporte extends javax.swing.JInternalFrame {

    public RenovacionPasaporte(String nomA) {
        initComponents();
       nombreAdmin.setText("**** "+nomA.toUpperCase()+" ****");
    }
    public RenovacionPasaporte(int noPas) {
        initComponents();
         nombreAdmin.setVisible(false);
         noPasText.setText(Integer.toString(noPas));
         noPasText.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        noPasText = new javax.swing.JTextField();
        newFecha = new javax.swing.JFormattedTextField();
        botonActualizarFVen = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        nombreAdmin = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO PARA LA RENOVACION DE PASAPORTE");

        jLabel2.setText("NUMERO DE PASAPORTE");

        jLabel3.setText("NUEVA FECHA DE VENCIMIENTO");

        try {
            newFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botonActualizarFVen.setText("GUARDAR NUEVOS DATOS");
        botonActualizarFVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarFVenActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botonActualizarFVen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(noPasText, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(nombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(noPasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(newFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(botonActualizarFVen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarFVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarFVenActionPerformed
        int noPasNew=Integer.parseInt(noPasText.getText());
        try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                FileInputStream archivoL = new FileInputStream(FILE_CLIENTES+"/"+noPasNew);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Date fVencimientoNew= sdf.parse(newFecha.getText());
                
                Cliente cliente;
                cliente = (Cliente)lectura.readObject(); 
                String contraseñaNew= cliente.getContraseña();
                Date fNacimientoNew = cliente.getFecha_nacimiento();
                String nacionalidadNew= cliente.getNacionalidad();
                int estadoCNew= GuardarArchivoBinario.VerEstado(cliente.getEstado());
                String nomNew= cliente.getNombre();
                String apellNew= cliente.getApellido();
                int generoNew= GuardarArchivoBinario.VerGenero(cliente.getSexo());
                Date fEmisionNew= cliente.getFecha_emision();
                String paisANew= cliente.getPaisActual();
                double millasRNew= cliente.getMillas_Recorridas();
                lectura.close();
                if(fVencimientoNew.equals(cliente.getFecha_vencimiento()) || fVencimientoNew.before(cliente.getFecha_vencimiento())){
                    JOptionPane.showMessageDialog(null, "ESTAS INGRESANDO UNA FECHA IGUAL O MENOR A LA ACTUAL");
                }else{
                    cliente = new Cliente(noPasNew, contraseñaNew, fNacimientoNew, nacionalidadNew, estadoCNew, nomNew, apellNew, generoNew, fVencimientoNew, fEmisionNew, paisANew, millasRNew);
                    GuardarArchivoBinario.guardarUsuarioCliente(cliente);
                    JOptionPane.showMessageDialog(null, "SE ACTUALIZO LA FECHA DE VENCIMIENTO DEL PASAPORTE " + noPasNew);
                }
                 noPasText.setText("");
                newFecha.setText("");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL ARCHIVO");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN EL FORMATO DE FECHAS");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "NO ENCONTRAMOS ESE PASAPORTE :(");
                noPasText.setText("");
            } catch (IOException ex) {
                System.err.println("ERROR IOException");
        }
        
        
        
    }//GEN-LAST:event_botonActualizarFVenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarFVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JFormattedTextField newFecha;
    private javax.swing.JTextField noPasText;
    private javax.swing.JLabel nombreAdmin;
    // End of variables declaration//GEN-END:variables
}
