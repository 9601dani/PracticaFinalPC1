package com.mycompany.Interfaz;

import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Reservacion;
import com.mycompany.Enum.ESTADO_CIVIL;
import com.mycompany.Enum.GENERO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_RESERVACIONES;
import com.mycompany.Manejador.Manejador_Admin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ZREPORTEPASAJERO extends javax.swing.JInternalFrame {
    private static DefaultListModel modeloLista;
    public ZREPORTEPASAJERO() {
        initComponents();
        modeloLista = new DefaultListModel();
        jList1.setModel(modeloLista);
    }
    public static void limpiarListaAdmin(){
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setClosable(true);

        jButton1.setText("Estado Civil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Nacionalidad");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Genero");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("AQUI SE MOSTRARAN QUE VIAJA MAS DEPENDIENDO EL BOTON SELECCIONADO");

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(57, 57, 57)
                        .addComponent(jButton4)))
                .addContainerGap(443, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarListaAdmin();
        int sol = 0, cas = 0, div = 0;
        String[] reservaciones = FILE_RESERVACIONES.list();
        for (int i = 0; i < reservaciones.length; i++) {
            try {
                FileInputStream archivoRev = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                ObjectInputStream lecturaR = new ObjectInputStream(archivoRev);
                Reservacion reservacion = (Reservacion) lecturaR.readObject();

                try {
                    FileInputStream archivoCliente = new FileInputStream(FILE_CLIENTES + "/" + reservacion.getNo_Pasaporte());
                    ObjectInputStream lecturaC = new ObjectInputStream(archivoCliente);
                    Cliente cliente = (Cliente) lecturaC.readObject();
                    if (cliente.getEstado().equals(ESTADO_CIVIL.SOLTERO)) {
                        sol++;
                    } else if (cliente.getEstado().equals(ESTADO_CIVIL.CASADO)) {
                        cas++;
                    } else if (cliente.getEstado().equals(ESTADO_CIVIL.DIVORCIADO)) {
                        div++;
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println("NO SE ENCUENTRAN ARCHIVOS");
                } catch (IOException ex) {
                    System.err.println("ERROR IO");
                } catch (ClassNotFoundException ex) {
                    System.err.println("CLASE NO SE PUEDE LEER");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRAN ARCHIVOS");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
        }
        Manejador_Admin NM= new Manejador_Admin(this);
        String opcion=NM.verGeneroMayor(sol, cas, div);
        this.añadirParaReporte("EL ESTADO CIVIL QUE VIAJA MAS ES: /"+opcion.toUpperCase()+"/");
        for (int i = 0; i < reservaciones.length; i++) {
            
            try {
                FileInputStream archivoRev = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                ObjectInputStream lecturaR = new ObjectInputStream(archivoRev);
                Reservacion reservacion = (Reservacion) lecturaR.readObject();

                try {
                    FileInputStream archivoCliente = new FileInputStream(FILE_CLIENTES + "/" + reservacion.getNo_Pasaporte());
                    ObjectInputStream lecturaC = new ObjectInputStream(archivoCliente);
                    Cliente cliente = (Cliente) lecturaC.readObject();
                    if(cliente.getEstado().equalsIgnoreCase(opcion)){
                        this.añadirParaReporte("\nCLIENTE: "+cliente.getApellido().toUpperCase()+","+cliente.getNombre().toUpperCase()+" ESTADO CIVIL: "+cliente.getEstado());
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println("NO SE ENCUENTRAN ARCHIVOS");
                } catch (IOException ex) {
                    System.err.println("ERROR IO");
                } catch (ClassNotFoundException ex) {
                    System.err.println("CLASE NO SE PUEDE LEER");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRAN ARCHIVOS");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
        }
        
        
        
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarListaAdmin();
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        String[] reservaciones = FILE_RESERVACIONES.list();
        for (int i = 0; i < reservaciones.length; i++) {
            try {
                FileInputStream archivoRev = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                ObjectInputStream lecturaR = new ObjectInputStream(archivoRev);
                Reservacion reservacion = (Reservacion) lecturaR.readObject();

                try {
                    FileInputStream archivoCliente = new FileInputStream(FILE_CLIENTES + "/" + reservacion.getNo_Pasaporte());
                    ObjectInputStream lecturaC = new ObjectInputStream(archivoCliente);
                    Cliente cliente = (Cliente) lecturaC.readObject();
                     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                     LocalDate horaL= LocalDate.now();
                     System.out.println(horaL.getYear());
                    int año= cliente.getFecha_nacimiento().getYear()+1900;
                    int edad= horaL.getYear()-año;
                    System.out.println(edad);
                    if (edad<=20 && edad>=0) {
                        a++;
                        System.out.println(a);
                    } else if (edad<=40 && edad>=21) {
                        b++;
                         System.out.println(b);
                    } else if (edad<=60 && edad>=41) {
                        c++;
                         System.out.println(c);
                    }else if(edad<=80 && edad>=61){
                        d++;
                         System.out.println(d);
                    }else if(edad<=100 && edad>=81){
                        e++;
                         System.out.println(e);
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println("NO SE ENCUENTRAN ARCHIVOS");
                } catch (IOException ex) {
                    System.err.println("ERROR IO");
                } catch (ClassNotFoundException ex) {
                    System.err.println("CLASE NO SE PUEDE LEER");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRAN ARCHIVOS");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
        }
        Manejador_Admin N = new Manejador_Admin(this);
        int opcion = N.verEdadMayor(a,b,c,d,e);
        System.out.println("opcion "+opcion);
        int rango=0;
        if (opcion == a) {
            rango=20;
        } else if (opcion == b) {
            rango=40;
        } else if (opcion == c) {
            rango=60;
        }else if (opcion == d) {
            rango=80;
        } else if (opcion == e) {
            rango=100;
        }this.añadirParaReporte("LA EDAD QUE MAS VIAJA ES ENTRE EL RANGO DE /"+(rango-19) +" y "+(rango)+ "/");
        for (int i = 0; i < reservaciones.length; i++) {
            
            try {
                FileInputStream archivoRev = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                ObjectInputStream lecturaR = new ObjectInputStream(archivoRev);
                Reservacion reservacion = (Reservacion) lecturaR.readObject();

                try {
                    FileInputStream archivoCliente = new FileInputStream(FILE_CLIENTES + "/" + reservacion.getNo_Pasaporte());
                    ObjectInputStream lecturaC = new ObjectInputStream(archivoCliente);
                    Cliente cliente = (Cliente) lecturaC.readObject();
                    LocalDate horaL= LocalDate.now();
                    int edad= horaL.getYear()-(cliente.getFecha_nacimiento().getYear()+1900);
                    if (edad<=rango && edad>=(rango-19)) {
                        this.añadirParaReporte("\nCLIENTE: ^^" + cliente.getApellido().toUpperCase() + "," + cliente.getNombre().toUpperCase() + "^^ EDAD: "+edad+" AÑOS");
                    }
                } catch (FileNotFoundException ex) {
                    System.err.println("NO SE ENCUENTRAN ARCHIVOS");
                } catch (IOException ex) {
                    System.err.println("ERROR IO");
                } catch (ClassNotFoundException ex) {
                    System.err.println("CLASE NO SE PUEDE LEER");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRAN ARCHIVOS");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiarListaAdmin();
        int m = 0, f = 0, s = 0;
        String[] reservaciones = FILE_RESERVACIONES.list();
        for (int i = 0; i < reservaciones.length; i++) {
            try {
                FileInputStream archivoRev = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                ObjectInputStream lecturaR = new ObjectInputStream(archivoRev);
                Reservacion reservacion = (Reservacion) lecturaR.readObject();

                try {
                    FileInputStream archivoCliente = new FileInputStream(FILE_CLIENTES + "/" + reservacion.getNo_Pasaporte());
                    ObjectInputStream lecturaC = new ObjectInputStream(archivoCliente);
                    Cliente cliente = (Cliente) lecturaC.readObject();
                    if (cliente.getSexo().equals(GENERO.MASCULINO)) {
                        m++;
                    } else if (cliente.getSexo().equals(GENERO.FEMENINO)) {
                        f++;
                    } else if (cliente.getSexo().equals(GENERO.SIN_DEFINIR)) {
                        s++;
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println("NO SE ENCUENTRAN ARCHIVOS");
                } catch (IOException ex) {
                    System.err.println("ERROR IO");
                } catch (ClassNotFoundException ex) {
                    System.err.println("CLASE NO SE PUEDE LEER");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRAN ARCHIVOS");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
        }
        Manejador_Admin NM = new Manejador_Admin(this);
        String opcion = NM.verSexoMayor(m,f,s);
        this.añadirParaReporte("EL GENERO QUE VIAJA MAS ES: /" + opcion.toUpperCase() + "/");
        for (int i = 0; i < reservaciones.length; i++) {
            
            try {
                FileInputStream archivoRev = new FileInputStream(FILE_RESERVACIONES + "/" + reservaciones[i]);
                ObjectInputStream lecturaR = new ObjectInputStream(archivoRev);
                Reservacion reservacion = (Reservacion) lecturaR.readObject();

                try {
                    FileInputStream archivoCliente = new FileInputStream(FILE_CLIENTES + "/" + reservacion.getNo_Pasaporte());
                    ObjectInputStream lecturaC = new ObjectInputStream(archivoCliente);
                    Cliente cliente = (Cliente) lecturaC.readObject();
                    if (cliente.getSexo().equalsIgnoreCase(opcion)) {
                        this.añadirParaReporte("\nCLIENTE: " + cliente.getApellido().toUpperCase() + "," + cliente.getNombre().toUpperCase() + " GENERO: " + cliente.getSexo());
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println("NO SE ENCUENTRAN ARCHIVOS");
                } catch (IOException ex) {
                    System.err.println("ERROR IO");
                } catch (ClassNotFoundException ex) {
                    System.err.println("CLASE NO SE PUEDE LEER");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("NO SE ENCUENTRAN ARCHIVOS");
            } catch (IOException ex) {
                System.err.println("ERROR IO");
            } catch (ClassNotFoundException ex) {
                System.err.println("CLASE NO SE PUEDE LEER");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String[] arreglo={};
        int[] arregloE={};
        
       
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
