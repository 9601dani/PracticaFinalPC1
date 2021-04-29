package com.mycompany.Interfaz;

import com.mycompany.Clases.Usuario;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import com.mycompany.Manejador.ManejadorNuevoCliente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class IngresarNuevoCliente extends javax.swing.JInternalFrame {
 public static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 private String noUsuario;
    public IngresarNuevoCliente(String noUsuario) {
        initComponents();
        this.noUsuario=noUsuario;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        contraseñaText = new javax.swing.JTextField();
        fechaNacimientoText = new javax.swing.JFormattedTextField();
        nacionalidadText = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        nombreText = new javax.swing.JTextField();
        apellidoText = new javax.swing.JTextField();
        comboEstadoCivil = new javax.swing.JComboBox<>();
        fechaVencimientoText = new javax.swing.JFormattedTextField();
        fechaEmisionText = new javax.swing.JFormattedTextField();
        paisAcutalText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        noPasaporteText = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("NO. PASAPORTE");

        jLabel2.setText("CONTRASEÑA ");

        jLabel3.setText("FECHA DE NACIMIENTO");

        jLabel4.setText("NACIONALIDAD");

        jLabel5.setText("ESTADO CIVIL");

        jLabel6.setText("NOMBRE/ NOMBRES");

        jLabel7.setText("APELLIDO/ APELLIDOS");

        jLabel8.setText("SEXO");

        jLabel9.setText("FECHA DE VENCIMIENTO (PASAPORTE)");

        jLabel10.setText("FECHA DE EMISION (PASAPORTE)");

        jLabel11.setText("PAIS ACTUAL DE REGISTRO");

        try {
            fechaNacimientoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        nacionalidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadTextActionPerformed(evt);
            }
        });

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Sin Definir" }));

        apellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextActionPerformed(evt);
            }
        });

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Soltero", "Divorciado", " " }));

        try {
            fechaVencimientoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fechaEmisionText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N
        jLabel12.setText("jLabel12");

        botonRegistrar.setText("REGISTRAR CLIENTE");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaEmisionText)
                            .addComponent(fechaVencimientoText)
                            .addComponent(paisAcutalText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contraseñaText)
                                    .addComponent(fechaNacimientoText)
                                    .addComponent(nacionalidadText)
                                    .addComponent(nombreText)
                                    .addComponent(apellidoText)
                                    .addComponent(comboEstadoCivil, 0, 194, Short.MAX_VALUE)
                                    .addComponent(noPasaporteText))))))
                .addGap(36, 36, 36)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(botonRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(noPasaporteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fechaNacimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nacionalidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fechaVencimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fechaEmisionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(paisAcutalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nacionalidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadTextActionPerformed

    private void apellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTextActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
     try {
         int noPas= Integer.parseInt(noPasaporteText.getText());
         String contra= contraseñaText.getText();
         Date fechaN= formato.parse(fechaNacimientoText.getText());
         String nacio= nacionalidadText.getText();
         int selecC= comboEstadoCivil.getSelectedIndex();
         String nom= nombreText.getText();
         String ape= apellidoText.getText();
         int selecG= comboGenero.getSelectedIndex();
         Date fechaV= formato.parse(fechaVencimientoText.getText());
         Date fechaE= formato.parse(fechaEmisionText.getText());
         String pa= paisAcutalText.getText();
         
         
            try {
                FileInputStream archivoB = new FileInputStream(FILE_CLIENTES + "/" + noPas);
                JOptionPane.showMessageDialog(null, "YA EXISTE ESTE USUARIO");
                noPasaporteText.setText("");
                contraseñaText.setText("");
                fechaNacimientoText.setText("");
                nacionalidadText.setText("");
                comboEstadoCivil.setSelectedIndex(0);
                nombreText.setText("");
                apellidoText.setText("");
                comboGenero.setSelectedIndex(0);
                fechaVencimientoText.setText("");
                fechaEmisionText.setText("");
                paisAcutalText.setText("");

            } catch (FileNotFoundException ex) {
                if (noPas != 0 && contra != null && fechaN != null && nacio != null && nom != null && ape != null && fechaV != null && fechaE != null && pa != null) {
                    ManejadorNuevoCliente NCl = new ManejadorNuevoCliente();
                    NCl.registrarNuevoCliente(noPas, contra, fechaN, nacio, selecC, nom, ape, selecG, fechaV, fechaE, pa);
                    Usuario usuario = new Usuario(Integer.toString(noPas), contra);
                    GuardarArchivoBinario.guardarUsuario(usuario);
                    noPasaporteText.setText("");
                    contraseñaText.setText("");
                    fechaNacimientoText.setText("");
                    nacionalidadText.setText("");
                    comboEstadoCivil.setSelectedIndex(0);
                    nombreText.setText("");
                    apellidoText.setText("");
                    comboGenero.setSelectedIndex(0);
                    fechaVencimientoText.setText("");
                    fechaEmisionText.setText("");
                    paisAcutalText.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "REVISA EL INGRESO DE CAMPOS, PARECE QUE HAY CAMPOS VACIOS");
                }

         }
     } catch (ParseException ex) {
         System.err.println("ERROR EN LAS FECHAS");
     } catch(java.lang.NumberFormatException ex){
         JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
     }
        
        
    }//GEN-LAST:event_botonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> comboEstadoCivil;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JTextField contraseñaText;
    private javax.swing.JFormattedTextField fechaEmisionText;
    private javax.swing.JFormattedTextField fechaNacimientoText;
    private javax.swing.JFormattedTextField fechaVencimientoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacionalidadText;
    private javax.swing.JTextField noPasaporteText;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField paisAcutalText;
    // End of variables declaration//GEN-END:variables
}
