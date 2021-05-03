package com.mycompany.Interfaz;

import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Reservacion;
import com.mycompany.Clases.Tarjeta;
import com.mycompany.Clases.Vuelo;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_RESERVACIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_TARJETAS;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class InterfazMenuUsuario extends javax.swing.JInternalFrame {
    private String nombreU;
    private String usuario;
    public InterfazMenuUsuario(String usuario) {
        this.usuario=usuario;
        initComponents();
        this.nombreU=usuario;
        noUsuarioText.setText(nombreU);
        nomUsuario.setText(verNombre(usuario));
    }
    public static String verNombre(String usuario){
        String nombreU="";
        try {
            FileInputStream archivoL = new FileInputStream(FILE_CLIENTES+"/"+usuario);
            ObjectInputStream lectura = new ObjectInputStream(archivoL);
            Cliente cliente =(Cliente)lectura.readObject();
            nombreU= "*** "+cliente.getNombre().toUpperCase()+" "+cliente.getApellido().toUpperCase()+" ***";
        } catch (IOException ex) {
            System.err.println("ERROR EN LECTURA DE NOMBRE");
        } catch (ClassNotFoundException ex) {
            System.err.println("NO SE ENCONTRO CON EL ARCHIVO");
        }
        return nombreU;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noUsuarioText = new javax.swing.JLabel();
        tituloLogo = new javax.swing.JLabel();
        nomUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel1.setText("NO DE USUARIO EN SESION");

        noUsuarioText.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        noUsuarioText.setForeground(new java.awt.Color(0, 0, 0));

        tituloLogo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/otrasOp.png")); // NOI18N
        jMenu1.setText("MAS OPCIONES");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/boleto.png")); // NOI18N
        jMenuItem1.setText("BOLETOS COMPRADOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/tarjeta.png")); // NOI18N
        jMenuItem2.setText("GASTOS POR TARJETA");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/imagen.png")); // NOI18N
        jMenuItem3.setText("DATOS PERSONALES");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/avion.png")); // NOI18N
        jMenuItem4.setText("MILLAS RECCORRIDAS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(noUsuarioText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(noUsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(tituloLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "*** MILLAS RECORRIDAS *** \n"+MillasRecorridas());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "*** BOLETOS COMPRADOS *** \n"+boletosComprados());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       JOptionPane.showMessageDialog(null, "*** GASTOS POR TARJETA *** \n"+gastosPorTarjeta());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(null, "*** DATOS PERSONALES *** \n"+DatosPersonales());
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    public String boletosComprados(){
        String presentar="";
        String[] resevarciones=FILE_RESERVACIONES.list();
        String[] Aclientes= new String[resevarciones.length];
        try{
            int contador=1;
            for(int i=0;i<resevarciones.length;i++){
                FileInputStream archivoL = new FileInputStream(FILE_RESERVACIONES+"/"+resevarciones[i]);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Reservacion rev =(Reservacion)lectura.readObject();
                FileInputStream archivo2 = new FileInputStream(FILE_VUELO+"/"+rev.getCodigo_vuelo().toUpperCase());
                ObjectInputStream lectura2 = new ObjectInputStream(archivo2);
                Vuelo vue =(Vuelo)lectura2.readObject();
                if(Integer.parseInt(usuario)==rev.getNo_Pasaporte()){
                    presentar+= contador+"."+ " NO. PASAPORTE: "+rev.getNo_Pasaporte()+" CODIGO DEL VUELO: "+rev.getCodigo_vuelo().toUpperCase()+" ASIENTO UTILIZADO: "+rev.getNo_Asiento()+" ORIGEN: "+ vue.getAeroOrigen().toUpperCase()+" HASTA: "+vue.getAeroDestino().toUpperCase()+"\n";
                    contador++;
                }
                lectura.close();
             }
        } catch (FileNotFoundException ex) {     
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return presentar;
    }
    public String gastosPorTarjeta(){
        String presentar="";
        String[] resevarciones=FILE_RESERVACIONES.list();
        String[] Aclientes= new String[resevarciones.length];
        String[] tarjeta=FILE_TARJETAS.list();
        String[] TClientes= new String[tarjeta.length];
        try{
            int contador=1;
            for(int i=0;i<resevarciones.length;i++){
                FileInputStream archivoU = new FileInputStream(FILE_CLIENTES+"/"+usuario);
                ObjectInputStream lectura3 = new ObjectInputStream(archivoU);
                Cliente cliente =(Cliente)lectura3.readObject();
                
                FileInputStream archivoL = new FileInputStream(FILE_RESERVACIONES+"/"+resevarciones[i]);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Reservacion rev =(Reservacion)lectura.readObject();
                
                
                FileInputStream archivo4 = new FileInputStream(FILE_TARJETAS+"/"+tarjeta[i]);
                ObjectInputStream lectura4 = new ObjectInputStream(archivo4);
                Tarjeta tar =(Tarjeta)lectura4.readObject();
                
                FileInputStream archivo2 = new FileInputStream(FILE_VUELO+"/"+rev.getCodigo_vuelo().toUpperCase());
                ObjectInputStream lectura2 = new ObjectInputStream(archivo2);
                Vuelo vue =(Vuelo)lectura2.readObject();
                if(tar.getNoPasaporte()==rev.getNo_Pasaporte()){
                    presentar+= contador+"."+ " NO. PASAPORTE: "+rev.getNo_Pasaporte()+" NO. TARJETA: "+tar.getNumeroTarjeta()+" CODIGO DEL VUELO: "+rev.getCodigo_vuelo().toUpperCase()+" COSTO DE VUELO: Q."+vue.getPrecioBoleto()+" ORIGEN: "+ vue.getAeroOrigen().toUpperCase()+" HASTA: "+vue.getAeroDestino().toUpperCase()+"\n";
                    contador++;
                }
                lectura.close();
             }
        } catch (FileNotFoundException ex) {     
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return presentar;
    }
    public String DatosPersonales(){
        String presentar="";
        try{
            int contador=1;
                FileInputStream archivoL = new FileInputStream(FILE_CLIENTES+"/"+usuario.toUpperCase());
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Cliente clien =(Cliente)lectura.readObject();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                presentar+= contador+"."+ " NO. PASAPORTE: "+clien.getNoPasaporte()+"\nFECHA DE NACIMIENTO: "+ sdf.format(clien.getFecha_nacimiento())+"\nNACIONALIDAD: "+ clien.getNacionalidad().toUpperCase()+"\nNOMBRE: "+ clien.getNombre().toUpperCase()+"\nAPELLIDO: "+clien.getApellido().toUpperCase()+"\nGENERO: "+ clien.getSexo()+ "\nESTADO CIVIL: "+clien.getEstado();
                contador++;
                lectura.close();
        } catch (FileNotFoundException ex) {     
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return presentar;
    }
    public String MillasRecorridas(){
        String presentar="";
        try{
            int contador=1;
                FileInputStream archivoL = new FileInputStream(FILE_CLIENTES+"/"+usuario.toUpperCase());
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Cliente clien =(Cliente)lectura.readObject();
                presentar+= clien.getNombre().toUpperCase()+" "+"HAZ RECORRIDO: "+ clien.getMillas_Recorridas()+" MILLAS";
                contador++;
                lectura.close();
        } catch (FileNotFoundException ex) {     
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfazMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return presentar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel noUsuarioText;
    private javax.swing.JLabel nomUsuario;
    private javax.swing.JLabel tituloLogo;
    // End of variables declaration//GEN-END:variables
}
