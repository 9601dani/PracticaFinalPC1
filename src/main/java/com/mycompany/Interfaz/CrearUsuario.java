package com.mycompany.Interfaz;

import com.mycompany.Clases.Gerente;
import com.mycompany.Clases.Usuario;
import com.mycompany.GestorArchivos.GuardarArchivoBinario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_GERENTE;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_USUARIOS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
public class CrearUsuario extends javax.swing.JInternalFrame {
private String noUsuario;
    public CrearUsuario(String nom) {
        initComponents();
        this.noUsuario=nom;
        tituloAdmin.setText(nom.toUpperCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        newNombreText = new javax.swing.JTextField();
        newContraseñaText = new javax.swing.JTextField();
        comboArea = new javax.swing.JComboBox<>();
        botonNewUsuario = new javax.swing.JButton();
        tituloImagen = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        Aerolinea = new javax.swing.JTextField();
        titulo5 = new javax.swing.JLabel();
        tituloAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        titulo.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("CREAR NUEVO USUARIO");

        titulo2.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo2.setText("NOMBRE");

        titulo3.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        titulo3.setForeground(new java.awt.Color(0, 0, 0));
        titulo3.setText("CONTRASEÑA");

        titulo4.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        titulo4.setForeground(new java.awt.Color(0, 0, 0));
        titulo4.setText("AREA");

        newNombreText.setBackground(new java.awt.Color(255, 255, 255));
        newNombreText.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        newNombreText.setForeground(new java.awt.Color(0, 0, 0));
        newNombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNombreTextActionPerformed(evt);
            }
        });

        newContraseñaText.setBackground(new java.awt.Color(255, 255, 255));
        newContraseñaText.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        newContraseñaText.setForeground(new java.awt.Color(0, 0, 0));

        comboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administracion", "Gerencia", "Operador" }));
        comboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreaActionPerformed(evt);
            }
        });

        botonNewUsuario.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        botonNewUsuario.setForeground(new java.awt.Color(0, 0, 0));
        botonNewUsuario.setText("Crear Usuario");
        botonNewUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNewUsuarioActionPerformed(evt);
            }
        });

        tituloImagen.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        titulo1.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("AEROLINEA");

        Aerolinea.setBackground(new java.awt.Color(255, 255, 255));

        titulo5.setText("ADMIN EN SESION:");

        tituloAdmin.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        tituloAdmin.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("*SI LO AMERITA, SINO DEJAR EN BLANCO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo3)
                                    .addComponent(titulo4)
                                    .addComponent(titulo1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newContraseñaText)
                                    .addComponent(Aerolinea, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(titulo2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newNombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloImagen)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(botonNewUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(titulo)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titulo2)
                                    .addComponent(newNombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titulo3)
                                    .addComponent(newContraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tituloImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo4)
                            .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo1)
                            .addComponent(Aerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(tituloAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(botonNewUsuario)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAreaActionPerformed

    private void newNombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNombreTextActionPerformed

    private void botonNewUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNewUsuarioActionPerformed
        PreCreacionUsuario();
    }//GEN-LAST:event_botonNewUsuarioActionPerformed
    public void PreCreacionUsuario(){
        String nombre=newNombreText.getText();
        String contra=newContraseñaText.getText();
        int Area=comboArea.getSelectedIndex();
        if(Area==1){
                Aerolinea.setVisible(true);
                titulo1.setVisible(true);
                String Aeroline= Aerolinea.getText();
                if(Aeroline!=null && Aeroline!=""){
                    Usuario usuario;
                    Gerente gerente;
                    FileInputStream archivoB;
                    FileInputStream archivoB2;
                        try {
                                archivoB = new FileInputStream(FILE_USUARIOS+"/"+nombre);
                                JOptionPane.showMessageDialog(null, "EL USUARIO YA EXISTE");
                        }catch (FileNotFoundException ex) {
                            try {
                                 archivoB2= new FileInputStream(FILE_GERENTE+"/"+Aeroline.toUpperCase());
                                 JOptionPane.showMessageDialog(null, "YA NO PUEDES CREAR OTRO GERENTE PORQUE YA EXISTE UNO DE ESTA AEROLINEA");
                            } catch (FileNotFoundException ex1) {
                                if(newNombreText.getText()!=""  || newContraseñaText.getText()!=""){
                                    usuario = new Usuario(nombre, contra, Area);
                                    GuardarArchivoBinario.guardarUsuario(usuario);
                                    gerente= new Gerente(Aeroline,nombre);
                                    GuardarArchivoBinario.guardarGerente(gerente);
                                    newNombreText.setText("");
                                    newContraseñaText.setText("");
                                    comboArea.setSelectedIndex(1);

                                }else{
                                    JOptionPane.showMessageDialog(null,"REVISA EL INGRESO DE CAMPOS");
                                }
                             }

                        }
                } else{
                    JOptionPane.showMessageDialog(null, "INGRESA UNA AEROLINEA");
                }
        }else{
            Usuario usuario;
            FileInputStream archivoB;
            try {
                    archivoB = new FileInputStream(FILE_USUARIOS+"/"+nombre);
                    JOptionPane.showMessageDialog(null, "EL USUARIO YA EXISTE");
                } catch (FileNotFoundException ex) {
                    if(newNombreText.getText()!=null || newContraseñaText.getText()!=null){
                        usuario = new Usuario(nombre, contra, Area);
                        GuardarArchivoBinario.guardarUsuario(usuario);
                        this.setVisible(false);
                        newNombreText.setText("");
                        newContraseñaText.setText("");
                        comboArea.setSelectedIndex(1);

                    }else{
                        JOptionPane.showMessageDialog(null,"REVISA EL INGRESO DE CAMPOS");
                    }   
                }
        }
       
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aerolinea;
    private javax.swing.JButton botonNewUsuario;
    private javax.swing.JComboBox<String> comboArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField newContraseñaText;
    private javax.swing.JTextField newNombreText;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel tituloAdmin;
    private javax.swing.JLabel tituloImagen;
    // End of variables declaration//GEN-END:variables
}
