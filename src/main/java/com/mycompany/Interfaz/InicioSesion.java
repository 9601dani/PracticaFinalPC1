
package com.mycompany.Interfaz;

import com.mycompany.Clases.Cliente;
import com.mycompany.Enum.EstadoUsuario;
import com.mycompany.Clases.Usuario;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_USUARIOS;
import static com.mycompany.Interfaz.MenuPrincipal.pantalla;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



public class InicioSesion extends javax.swing.JInternalFrame {
    public static Usuario usuario;
    public InicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passwordText = new javax.swing.JTextField();

        setClosable(true);

        titulo1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("BIENVENIDO AL INICIO DE SESION");

        titulo2.setFont(new java.awt.Font("aakar", 1, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo2.setText("Usuario:");

        titulo3.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        titulo3.setForeground(new java.awt.Color(0, 0, 0));
        titulo3.setText("Password:");

        usuarioText.setBackground(new java.awt.Color(255, 255, 255));
        usuarioText.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        passwordText.setBackground(new java.awt.Color(255, 255, 255));
        passwordText.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        passwordText.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(titulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo2)
                            .addComponent(titulo3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuarioText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(passwordText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton1)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo2)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo3)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String usu=usuarioText.getText();
        String pas=passwordText.getText();
        if(usu!=null && pas!=null){
            VerificarInicioSesion(usu,pas);
        } else{
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS");
            
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed
       public void VerificarInicioSesion(String name,String contraseña){
        try {
            FileInputStream archivoL= new FileInputStream(FILE_USUARIOS+"/"+name);
            ObjectInputStream lectura = new ObjectInputStream(archivoL);
            Usuario persona=(Usuario)lectura.readObject();
                   if(contraseña.equals(persona.getContraseña())){
                       if(persona.getEstado().equals(EstadoUsuario.ACTIVO)){
                           int a=persona.getTipo();
                           RediregirArea(a,name);
                           lectura.close();
                           usuarioText.setText("");
                           passwordText.setText("");
                      }else{
                           JOptionPane.showMessageDialog(null,"ACTUALMENTE TU USUARIO NO ESTA ACTIVO");
                       }
                      
                   }else{
                       JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA");
                       passwordText.setText("");
                   }  
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "USUARIO NO EXISTENTE");
            usuarioText.setText("");
            passwordText.setText("");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "USUARIO NO EXISTENTE");
        } catch (IOException ex) {
            Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void RediregirArea(int a, String name){
        switch(a){
            case 0: 
            JOptionPane.showMessageDialog(null, "BIENVENIDO ADMIN "+name.toUpperCase());
            pantalla.removeAll();
            CrearUsuario nuevo= new CrearUsuario(name);
            pantalla.add(nuevo);
            nuevo.show();
            break;
             case 1: 
           JOptionPane.showMessageDialog(null, "BIENVENIDO GERENTE "+name.toUpperCase());
           pantalla.removeAll();
           IngresarNuevoCliente nuev = new IngresarNuevoCliente(name);
           pantalla.add(nuev);
           nuev.show();
            break;
             case 2: 
            pantalla.removeAll();
            JOptionPane.showMessageDialog(null,"BIENVENIDO OPERADOR");
            break;
            case 3:
                JOptionPane.showMessageDialog(null,"BIENVENIDO USUARIO ");
                pantalla.removeAll();
                InterfazMenuUsuario MEU = new InterfazMenuUsuario(name);
                pantalla.add(MEU);
                MEU.show();
                 break;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
