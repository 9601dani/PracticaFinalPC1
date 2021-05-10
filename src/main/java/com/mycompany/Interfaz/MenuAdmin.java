package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Vuelo;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import static com.mycompany.Interfaz.MenuPrincipal.pantalla;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MenuAdmin extends javax.swing.JInternalFrame {
    private String nomAdmi;
    public MenuAdmin(String nom) {
        initComponents();
        this.nomAdmi= nom;
        nomAdmin.setText("**** " +nomAdmi.toUpperCase()+" ****");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomAdmin = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE DE ADMIN: ");

        nomAdmin.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        nomAdmin.setForeground(new java.awt.Color(0, 0, 0));

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/imagen.png")); // NOI18N
        jMenu1.setText("INGRESO DE DATOS");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem1.setText("CREAR NUEVO USUARIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem2.setText("CREAR NUEVO AEROPUERTO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem3.setText("CREAR NUEVA DISTANCIA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem4.setText("CREAR NUEVA AEROLINEA");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem13.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem13.setText("CREAR NUEVA TARJETA");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem14.setText("CREAR NUEVO CLIENTE");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem15.setText("CREAR NUEVO AVION");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo1.png")); // NOI18N
        jMenuItem16.setText("CREAR NUEVO VUELO");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/subidaD.png")); // NOI18N
        jMenu2.setText("CARGAR INFORMACION");
        jMenu2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo2.png")); // NOI18N
        jMenuItem5.setText("CARGAR DATOS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/actu.png")); // NOI18N
        jMenu3.setText("MAS OPCIONES");
        jMenu3.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("aakar", 3, 10)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/actua.png")); // NOI18N
        jMenuItem6.setText("ACTUALIZAR FECHA VENCIMIENTO DE PASAPORTE");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem17.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/avion.png")); // NOI18N
        jMenuItem17.setText("VER DISTRIBUCION DE LOS AVIONES");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/vuelosS.png")); // NOI18N
        jMenuItem18.setText("OPERAR VUELO");
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/reporte.png")); // NOI18N
        jMenu4.setText("REPORTES");
        jMenu4.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/avion.png")); // NOI18N
        jMenuItem7.setText("RUTAS");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/vuelosS.png")); // NOI18N
        jMenuItem8.setText("AEROLINEAS MAS USADAS");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/reporte.png")); // NOI18N
        jMenuItem9.setText("AVIONES");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/actua.png")); // NOI18N
        jMenuItem10.setText("VUELO");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/actu.png")); // NOI18N
        jMenuItem11.setText("DE GASOLINA");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/ganancias.png")); // NOI18N
        jMenuItem12.setText("GANANCIAS");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(nomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        IngresarNuevoAeropuerto NA= new IngresarNuevoAeropuerto(nomAdmi);
       pantalla.add(NA);
       NA.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CrearUsuario nuevo= new CrearUsuario(nomAdmi);
            pantalla.add(nuevo);
            nuevo.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        IngresarNuevaDistancia ND= new IngresarNuevaDistancia(nomAdmi);
        pantalla.add(ND);
        ND.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         IngresarNuevaAerolinea nuevo= new IngresarNuevaAerolinea(nomAdmi);
            pantalla.add(nuevo);
            nuevo.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        InterfazSubidaDeDatos SD= new InterfazSubidaDeDatos(nomAdmi);
        pantalla.add(SD);
        SD.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RenovacionPasaporte RP= new RenovacionPasaporte(nomAdmi);
        pantalla.add(RP);
        RP.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        IngresoNuevaTarjeta NT= new IngresoNuevaTarjeta();
        pantalla.add(NT);
        NT.show();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        IngresarNuevoCliente NC= new IngresarNuevoCliente(nomAdmi);
        pantalla.add(NC);
        NC.show();
        
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        CrearAvion NA= new CrearAvion();
        pantalla.add(NA);
        NA.show();
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        NuevoVuelo NV= new NuevoVuelo();
        pantalla.add(NV);
        NV.show();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        String codA=JOptionPane.showInputDialog(null,vuelosVuelos()+"\n INGRESE EL CODIGO DE AVION QUE DESEA VER: ");
        try{
            AsientosVuelos VA = new AsientosVuelos(codA);
            pantalla.add(VA);
            VA.show();
            VA.generarLabels();
        }catch(NumberFormatException exepcionNula){
                    JOptionPane.showMessageDialog(null, "**CAMPO VACIO** DEBES DIGITAR UNA OPCION PARA CONTINUAR");
        }catch(java.lang.NullPointerException ex){
            JOptionPane.showMessageDialog(null,"*** CAMPO VACIO ***");
        }
        
    }//GEN-LAST:event_jMenuItem17ActionPerformed

     public String vuelosVuelos(){
        String[]posiblesVuelos= FILE_VUELO.list();
        String presentar="";
        int contador=0;
            for(int i=0;i<posiblesVuelos.length;i++){
                FileInputStream archivoL;
            try {
                archivoL = new FileInputStream(FILE_VUELO+"/"+posiblesVuelos[i]);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Vuelo vuelo =(Vuelo)lectura.readObject();
                
                FileInputStream archivoA = new FileInputStream(FILE_AVIONES+"/"+vuelo.getCodAvion().toUpperCase());
                ObjectInputStream lecturaA = new ObjectInputStream(archivoA);
                Avion avion =(Avion)lecturaA.readObject();
                    contador++;
                    presentar+= contador+". CODIGO DE VUELO: "+avion.getCodigoAvion().toUpperCase()+" \n";
                lectura.close();
                lectura.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showConfirmDialog(null, "NO HAS INGRESADO UNA OPCION VALIDA :(");
            } catch (IOException ex) {
                Logger.getLogger(MenuOperador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuOperador.class.getName()).log(Level.SEVERE, null, ex);
            }
                
             }
        
        return presentar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomAdmin;
    // End of variables declaration//GEN-END:variables
}
