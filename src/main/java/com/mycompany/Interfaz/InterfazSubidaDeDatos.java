package com.mycompany.Interfaz;

import com.mycompany.GestorArchivos.SubidaDeArchivos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InterfazSubidaDeDatos extends javax.swing.JInternalFrame {
    private SubidaDeArchivos sub;
    private String archivoALeer;
    private String nombreArchivoALeer;
    private static DefaultListModel modeloLista;
    public InterfazSubidaDeDatos(String nom) {
        initComponents();
        tituloN.setText("**** "+nom.toUpperCase()+" ****");
         modeloLista = new DefaultListModel();
         jList1.setModel(modeloLista);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tituloN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO A LA SUBIDA DE DATOS");

        tituloN.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N
        tituloN.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTROL DE DATOS INGRESADOR");

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        logo.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logoEmpresa.png")); // NOI18N

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/subidaD.png")); // NOI18N
        jMenu1.setText("CARGAR ARCHIVO");
        jMenu1.setFont(new java.awt.Font("aakar", 3, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("aakar", 3, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/daniel/NetBeansProjects/Proyecto2IPC/logo2.png")); // NOI18N
        jMenuItem1.setText("SUBIR ARCHIVO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(tituloN, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultListModel getModeloLista(){
        return this.modeloLista;
    }
    
    // metodo estatico que introduce lineas de texto a la lista 
    public void introducirDatosALaLista(String linea){
        modeloLista.addElement(linea);
    }
     public void guardarInformacionLista(){
        String[] componentesLista= new String[modeloLista.getSize()];
        int tamañoLista=modeloLista.getSize();
        for(int i=0;i<modeloLista.getSize();i++){
            componentesLista[i]=(String) modeloLista.getElementAt(i);
        }
        // abre un archivo
        File archivoAGuardar= new File("controlReportes.jp");
        for(int j=0;j<componentesLista.length;j++){
            // guarda datos de la lista
            try(FileWriter out = new FileWriter(archivoAGuardar,true); BufferedWriter archivoSalida = new BufferedWriter(out);){
                archivoSalida.write(componentesLista[j]);
                archivoSalida.newLine();
                archivoSalida.flush();
            }catch (IOException ex) {
                System.err.println("ERROR IOEXEPTION");
            }
        }
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          JFileChooser buscadorArchivos = new JFileChooser();
          int opcion = buscadorArchivos.showOpenDialog(this);
          
          if(opcion == JFileChooser.APPROVE_OPTION){
            String archivo = buscadorArchivos.getSelectedFile().getAbsolutePath();
            String archivo1 = buscadorArchivos.getSelectedFile().toString();
            // si se encuentra el archivo pide el tiempo en milisegundos
            System.out.println("Se ha encontrado el archivo: "+archivo1);
            try {
                this.archivoALeer = archivo;
                this.nombreArchivoALeer = archivo1;
            } catch (Exception e) {
                // si no se introdujo un dato entero muestra error y no hace nada mas
                JOptionPane.showMessageDialog(null, "No metiste un dato entero");
                System.out.println("No se introdujo un dato entero");
                
            }      
        }
        
        else if(opcion == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo");
            System.out.println("No se ha cargado ningun archivo");
        }
        try{
            // crea el archivo que se selecciono
        File archivoAProcesar = new File(archivoALeer);
        
        // solo es prueba para ver si se crea exitosamente el archivo
        if(archivoAProcesar.exists()){
           // llama al metodo cargar datos de la clase thread
            System.out.println("Se ha almacenado con exito");
            sub = new SubidaDeArchivos(archivoAProcesar, nombreArchivoALeer,this);
            //inicia el hilo de los archivos
            sub.start();
        }
        }catch(Exception e){
            System.out.println("No se selecciono ningun archivo");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel tituloN;
    // End of variables declaration//GEN-END:variables
}
