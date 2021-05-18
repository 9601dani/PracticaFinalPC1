package com.mycompany.Interfaz;

import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Operador;
import com.mycompany.Clases.Vuelo;
import com.mycompany.Enum.ESTADO_VUELO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import static com.mycompany.GestorArchivos.ManejadorOperadorVuelo.MenuOperarVuelo;
import static com.mycompany.Interfaz.MenuPrincipal.pantalla;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class MenuOperador extends javax.swing.JInternalFrame {
    private String nombreOperador;
    private String aerolinea;
    public MenuOperador(Operador operador) {
        initComponents();
        nomAerolinea.setText("*** "+operador.getAerolinea().toUpperCase()+" ***");
        nomTitulo.setText("*** "+operador.getNombreG().toUpperCase()+" ***");
        this.aerolinea= operador.getAerolinea();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomAerolinea = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setText("OPERADOR EN SESION:");

        nomTitulo.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jLabel2.setText("AEROLINEA:");

        nomAerolinea.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/avion.png")); // NOI18N
        jMenu1.setText("VUELOS");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/boleto.png")); // NOI18N
        jMenuItem1.setText("OPERAR VUELO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem3.setText("PROGRAMAR VUELO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/otrasOp.png")); // NOI18N
        jMenu2.setText("OTRAS FUNCIONES");
        jMenu2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/ruta.png")); // NOI18N
        jMenuItem2.setText("VER DISTRIBUCION DE AVION");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nomTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel2))))
                .addGap(67, 67, 67)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(nomTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String codA=JOptionPane.showInputDialog(null, vuelosVuelos()+"\nINGRESE EL CODIGO DEL VUELO A OPERAR");
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
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String codV= JOptionPane.showInputDialog(null,operarVuelo()+"\n INGRESE EL CODIGO DE AVION QUE DESEA VER: ");
         try {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.INICIAR VUELO\n2.CANCELAR VUELO\n3.POSPONER VUELO\n" + "INGRESE LA OPCION QUE DESEA DEL VUELO A OPERAR:"));
             try { 
                 MenuOperarVuelo(codV, opcion);
             } catch (NumberFormatException exepcionNul) {
                 JOptionPane.showMessageDialog(null, "**CAMPO VACIO** DEBES DIGITAR UNA OPCION PARA CONTINUAR");
             } catch (java.lang.NullPointerException e) {
                 JOptionPane.showMessageDialog(null, "*** CAMPO VACIO ***");
             }
        } catch (NumberFormatException exepcionNula) {
            JOptionPane.showMessageDialog(null, "**CAMPO VACIO** DEBES DIGITAR UNA OPCION PARA CONTINUAR");
        } catch (java.lang.NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "*** CAMPO VACIO ***");
        }
            
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       NuevoVuelo NV= new NuevoVuelo();
        pantalla.add(NV);
        NV.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
                
                if(avion.getNomAerolinea().equalsIgnoreCase(this.aerolinea)){
                    if(vuelo.getEstado().equals(ESTADO_VUELO.EN_ESPERA) || vuelo.getEstado().equals(ESTADO_VUELO.RETRASADO) ){
                        contador++;
                        presentar += contador + ". CODIGO DE AVION " + avion.getCodigoAvion().toUpperCase() + " \n";
                    }
                   
                }
                lectura.close();
                lecturaA.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showConfirmDialog(null, "NO HAS INGRESADO UNA OPCION VALIDA :(");
            } catch (IOException ex) {
                System.err.println("ERROR IO VUELVOSVUELOS");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASSNOT VUELOVUELOS");
            }
                
             }
        
        return presentar;
    }
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
                if (avion.getNomAerolinea().equalsIgnoreCase(this.aerolinea)) {
                    if (vuelo.getEstado().equals(ESTADO_VUELO.EN_ESPERA) || vuelo.getEstado().equals(ESTADO_VUELO.RETRASADO)) {
                        contador++;
                        presentar += contador + ". CODIGO DE VUELO: " + vuelo.getCodigoVuelo().toUpperCase() + "\n";
                    }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomAerolinea;
    private javax.swing.JLabel nomTitulo;
    // End of variables declaration//GEN-END:variables
}
