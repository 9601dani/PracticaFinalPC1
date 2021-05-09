
package com.mycompany.GestorArchivos;

import com.mycompany.Clases.Aerolinea;
import com.mycompany.Clases.Aeropuerto;
import com.mycompany.Clases.Avion;
import com.mycompany.Clases.Cliente;
import com.mycompany.Clases.Distancia;
import com.mycompany.Clases.Reservacion;
import com.mycompany.Clases.Tarjeta;
import com.mycompany.Clases.Usuario;
import com.mycompany.Clases.Vuelo;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROLINEA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AEROPUERTO;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_AVIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_CLIENTES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_DISTANCIA;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_RESERVACIONES;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_TARJETAS;
import static com.mycompany.GestorArchivos.GuardarArchivoBinario.FILE_VUELO;
import com.mycompany.Interfaz.InterfazSubidaDeDatos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class SubidaDeArchivos extends Thread {
    private File archivo;
    private String nombreArchivo;
    private InterfazSubidaDeDatos datos;
    private static final String AEROPUERTO = "AEROPUERTO";
    private static final String AEROLINEA = "AEROLINEA";
    private static final String DISTANCIA = "DISTANCIA";
    private static final String PASAPORTE= "PASAPORTE";
    private static final String TARJETA = "TARJETA";
    private static final String RENOVACION = "RENOVACION_PASAPORTE";
    private static final String RESERVACION="RESERVACION";
    private static final String VUELO="VUELO";
    private static final String AVION="AVION";
    private static final String[] NOMBRES =  { AEROPUERTO, AEROLINEA, DISTANCIA, PASAPORTE, TARJETA, RENOVACION, RESERVACION, VUELO, AVION};
    private static String lineaPrincipal=null;

    public SubidaDeArchivos(File archivoRecibido, String nombreArchivo,InterfazSubidaDeDatos datos) {
        this.archivo = archivoRecibido;
        this.nombreArchivo = nombreArchivo;
        this.datos=datos;
    }
    @Override
    public void run(){
        try {
            leerNuevosArchivos();
        } catch (FileNotFoundException ex) {
            datos.introducirDatosALaLista("ARCHIVO NO ENCONTRADO");
            System.out.println("No se puede leer el archivo");
        } catch (IOException ex) {
            System.err.println("ERROR IOEXEPTION");
        }
        
    }
    public void leerNuevosArchivos()throws FileNotFoundException, IOException{
        try{
            FileReader archivo1 = new FileReader(archivo);
            BufferedReader archivo= new BufferedReader(archivo1);
            String LArchivo = archivo.readLine();
            this.lineaPrincipal= LArchivo;
            int posicion;
            String Vauxiliar ;
            String Vauxiliar1;
            String[] datosAProcesar;
            while(LArchivo !=null){
                try{  
                posicion = LArchivo.indexOf("(");
                Vauxiliar = LArchivo.substring(0, posicion);
                Vauxiliar1 = LArchivo.substring(posicion);
                datosAProcesar=quitarParentesis(Vauxiliar1);
                System.out.println(LArchivo);
                System.out.println(Vauxiliar);
                System.out.println(Vauxiliar1);
                for (String string : datosAProcesar) {
                    System.out.println(string);
                }
               verificarMetodo(Vauxiliar,datosAProcesar);
                LArchivo= archivo.readLine();
                this.lineaPrincipal=LArchivo;
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException ex) {
                    System.err.println("ERROR EN EL HILO");
                }
                }catch(ArrayIndexOutOfBoundsException e){
                    datos.introducirDatosALaLista("NO CUMPLE EL FORMATO, LA SIGUIENTE LINEA: "+lineaPrincipal);
                    LArchivo= archivo.readLine();
                }
            }
            JOptionPane.showMessageDialog(null, "HEMOS TERMINADO LA CARGA DE ARCHIVOS");
            datos.introducirDatosALaLista("-----------------------------------------------------------------------------------------------------------------------------");
            datos.introducirDatosALaLista("**SE COMPLETO LA CARGA DE ARCHIVOS**".toUpperCase());
        }catch(Exception e){ 
            datos.introducirDatosALaLista("NO CUMPLE CON EL FORMATO VALIDO : "+lineaPrincipal);
            e.printStackTrace();
            
            
        }
    }
    public static String[] quitarParentesis(String lineaTexto){
        int posicionPrincipal;
        String texto;
        posicionPrincipal = lineaTexto.lastIndexOf(")");
        texto=lineaTexto.substring(1,posicionPrincipal); 
        String[] arregloLinea = texto.split(",");
        return arregloLinea;
    }
     public void verificarMetodo(String nombreAVerificar, String[] datosObtenidos) throws IOException{
         // si es un aeropuerto
        if(nombreAVerificar.equals(NOMBRES[0])){
            Aeropuerto aer;
            String nomA = datosObtenidos[0];
            String ciud = datosObtenidos[1];
            String pa= datosObtenidos[2];
           try {
            FileInputStream archivoB = new FileInputStream(FILE_AEROPUERTO + "/" + nomA.toUpperCase());
            datos.introducirDatosALaLista(lineaPrincipal+" NO SE PUDO CARGAR PORQUE YA ESTA REGISTRADA");
            } catch (FileNotFoundException ex) {
                aer = new Aeropuerto(nomA,ciud,pa);
                GuardarArchivoBinario.guardarAeroPuertos(aer);
               datos.introducirDatosALaLista(lineaPrincipal +" ***GUARDADA CON EXITO ***");
            }   
        }
        if(nombreAVerificar.equals(NOMBRES[1])){
            Aerolinea aerL;
            String nomA= datosObtenidos[0];
            String nomAER=datosObtenidos[1];
            try {
            FileInputStream archivoB = new FileInputStream(FILE_AEROLINEA + "/" + nomA.toUpperCase()+"_"+nomAER.toUpperCase());
            datos.introducirDatosALaLista(lineaPrincipal+" NO SE PUDO CARGAR PORQUE YA ESTA REGISTRADA");
            
           
            } catch (FileNotFoundException ex) {
                aerL = new Aerolinea(nomA,nomAER);
                GuardarArchivoBinario.guardarAerolineas(aerL);
               datos.introducirDatosALaLista(lineaPrincipal +" ***GUARDADA CON EXITO ***");
            }
        }
        if(nombreAVerificar.equals(NOMBRES[2])){
            Distancia distancia;
            String nomOrigen= datosObtenidos[0];
            String nomDestino= datosObtenidos[1];
            double cantMillas= Double.parseDouble(datosObtenidos[2]);
             try {
            FileInputStream archivoB = new FileInputStream(FILE_DISTANCIA + "/" + nomOrigen.toUpperCase()+"_"+nomDestino.toUpperCase());
            datos.introducirDatosALaLista(lineaPrincipal+" NO SE PUDO CARGAR PORQUE YA ESTA REGISTRADA");
            } catch (FileNotFoundException ex) {
                distancia = new Distancia(nomOrigen,nomDestino,cantMillas);
                GuardarArchivoBinario.guardarDistancias(distancia);
                datos.introducirDatosALaLista(lineaPrincipal +" ***GUARDADA CON EXITO ***");
            }
            
        }
        if(nombreAVerificar.equals(NOMBRES[3])){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Cliente cliente;
                Usuario usuario;
                int noPas=Integer.parseInt(datosObtenidos[0]);
                String contraseña= datosObtenidos[1];
                Date fNacimiento = sdf.parse(datosObtenidos[2]);
                String nacionalidad=datosObtenidos[3];
                int estadoC= GuardarArchivoBinario.VerEstado(datosObtenidos[4]);
                String nom= datosObtenidos[5];
                String apell= datosObtenidos[6];
                int genero= GuardarArchivoBinario.VerGenero(datosObtenidos[7]);
                Date fVencimiento= sdf.parse(datosObtenidos[8]);
                Date fEmision= sdf.parse(datosObtenidos[9]);
                String paisA= datosObtenidos[10];
                double millasR= Double.parseDouble(datosObtenidos[11]);
                try {
                    FileInputStream archivoB = new FileInputStream(FILE_CLIENTES + "/" + noPas);
                    datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE YA ESTA REGISTRADO");
                } catch (FileNotFoundException ex) {
                    usuario= new Usuario(datosObtenidos[0],contraseña);
                    GuardarArchivoBinario.guardarUsuario(usuario);
                    cliente = new Cliente(noPas,contraseña,fNacimiento,nacionalidad,estadoC,nom,apell,genero,fVencimiento,fEmision,paisA,millasR);
                    GuardarArchivoBinario.guardarUsuarioCliente(cliente);
                    datos.introducirDatosALaLista(lineaPrincipal + " ***GUARDADA CON EXITO ***");
                }
            } catch (ParseException ex) {
                System.err.println("ERRO EN EL FORMATO DE LA FECHA");
            } 
        }
        if(nombreAVerificar.equalsIgnoreCase(NOMBRES[4])){
            Tarjeta tarjeta;
            String noTarj= datosObtenidos[0];
            int noPas= Integer.parseInt(datosObtenidos[1]);
            double dineroA= Double.parseDouble(datosObtenidos[2]);
            String codigoS= datosObtenidos[3];
            try {
                    FileInputStream archivoB = new FileInputStream(FILE_TARJETAS + "/" + noTarj);
                    datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE YA ESTA REGISTRADO");
                } catch (FileNotFoundException ex) {
                    tarjeta= new Tarjeta(noTarj,noPas,dineroA,codigoS);
                    GuardarArchivoBinario.guardarTarjeta(tarjeta);
                    datos.introducirDatosALaLista(lineaPrincipal + " ***GUARDADA CON EXITO ***");
                }
        }
        if(nombreAVerificar.equals(NOMBRES[5])){
            int noPasN= Integer.parseInt(datosObtenidos[0]);
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                FileInputStream archivoL = new FileInputStream(FILE_CLIENTES+"/"+noPasN);
                ObjectInputStream lectura = new ObjectInputStream(archivoL);
                Cliente cliente;
                cliente = (Cliente)lectura.readObject(); 
                if(datosObtenidos[1].equals(sdf.format(cliente.getFecha_vencimiento()))){
                  datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO GUARDAR LA NUEVA FECHA PORQUE ES IGUAL A LA ACTUAL");  
                }else{
                int noPasNew=cliente.getNoPasaporte();
                String contraseñaNew= cliente.getContraseña();
                Date fNacimientoNew = cliente.getFecha_nacimiento();
                String nacionalidadNew= cliente.getNacionalidad();
                int estadoCNew= GuardarArchivoBinario.VerEstado(cliente.getEstado());
                String nomNew= cliente.getNombre();
                String apellNew= cliente.getApellido();
                int generoNew= GuardarArchivoBinario.VerGenero(cliente.getSexo());
                Date fVencimientoNew= sdf.parse(datosObtenidos[1]);
                Date fEmisionNew= cliente.getFecha_emision();
                String paisANew= cliente.getPaisActual();
                double millasRNew= cliente.getMillas_Recorridas();
                lectura.close();
                cliente = new Cliente(noPasNew,contraseñaNew,fNacimientoNew,nacionalidadNew,estadoCNew,nomNew,apellNew,generoNew,fVencimientoNew,fEmisionNew,paisANew,millasRNew);
                GuardarArchivoBinario.guardarUsuarioCliente(cliente);
                 datos.introducirDatosALaLista(lineaPrincipal + " ***GUARDADA CON EXITO ***");
                } 
            } catch (ClassNotFoundException ex) {
                datos.introducirDatosALaLista(lineaPrincipal+ " NO SE ENCONTRO EL NUMERO DE PASAPORTE "+datosObtenidos[0]);
            } catch (ParseException ex) {
                datos.introducirDatosALaLista(lineaPrincipal+" NO CUENTA CON EL FORMATO DE FECHAS");
            } catch (FileNotFoundException e) {
                datos.introducirDatosALaLista(lineaPrincipal+" NO SE GUARGO PORQUE NO EXISTE UN CLIENTE CON ESTE PASAPORTE ");
            }
        }
      if( nombreAVerificar.equals(NOMBRES[6])){
          int noPasNew= Integer.parseInt(datosObtenidos[0]);
          String codigoVuelo= datosObtenidos[1];
          long numT= Long.parseLong(datosObtenidos[2]);
          String asiento= datosObtenidos[3];
          Reservacion Rev;
          try{
              FileInputStream archivoL = new FileInputStream(FILE_VUELO+"/"+codigoVuelo.toUpperCase());
                 try {
                  FileInputStream archivoB = new FileInputStream(FILE_RESERVACIONES + "/" + noPasNew + "_" + codigoVuelo.toUpperCase());
                  datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE YA ESTA REGISTRADO");
              } catch (FileNotFoundException e) {
                  Rev = new Reservacion(noPasNew, codigoVuelo, numT, asiento);
                  GuardarArchivoBinario.guardarResevacion(Rev);
                  datos.introducirDatosALaLista(lineaPrincipal + " ***GUARDADA CON EXITO ***");
              }
              
          }catch (FileNotFoundException ex) {
                  datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE NO EXISTE EL CODIGO DE VUELO");
          }
      } 
      if(nombreAVerificar.equals(NOMBRES[7])){
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String codVuelo= datosObtenidos[0];
                String codAvion= datosObtenidos[1];
                String origen= datosObtenidos[2];
                String destino= datosObtenidos[3];
                double precioB= Double.parseDouble(datosObtenidos[4]);
                Date fSalida= sdf.parse(datosObtenidos[5]);
                try{
                   FileInputStream archivoL = new FileInputStream(FILE_VUELO + "/" + codVuelo.toUpperCase());
                   datos.introducirDatosALaLista(lineaPrincipal + " NO SE PUDO CARGAR PORQUE YA EXISTE LA RESERVACION"); 
                }catch (FileNotFoundException eo) {
                    try {
                    FileInputStream archivoL = new FileInputStream(FILE_AVIONES + "/" + codAvion.toUpperCase());
                     try {
                        FileInputStream archivoDistancia= new FileInputStream(FILE_DISTANCIA + "/" + origen.toUpperCase() + "_" + destino.toUpperCase());
                        ObjectInputStream lecturaDistancia = new ObjectInputStream(archivoDistancia);
                         Distancia distancia= (Distancia)lecturaDistancia.readObject();
                           try {
                             FileInputStream archivoGasNecesaria = new FileInputStream(FILE_AVIONES + "/" +codAvion.toUpperCase());
                             ObjectInputStream lecturaAvion = new ObjectInputStream(archivoGasNecesaria);
                             Avion avion= (Avion)lecturaAvion.readObject();
                             try {
                             FileInputStream archivoAeroDestino = new FileInputStream(FILE_AEROLINEA + "/" +destino.toUpperCase()+"_"+avion.getNomAerolinea().toUpperCase());
                             FileInputStream archivoAerOrigen = new FileInputStream(FILE_AEROLINEA + "/" +origen.toUpperCase()+"_"+avion.getNomAerolinea().toUpperCase());  
                             double gasMini = avion.getConsumoMilla() * distancia.getCantMillas();
                                 if (gasMini <= avion.getCantGasolina()) {
                                     if (avion.getAeropuertoActual().equalsIgnoreCase(origen)) {
                                         Vuelo NV = new Vuelo(codVuelo, codAvion, origen, destino, precioB, fSalida);
                                         GuardarArchivoBinario.guardarVuelo(NV);
                                         datos.introducirDatosALaLista(lineaPrincipal + " ***GUARDADA CON EXITO***");
                                     } else {
                                         datos.introducirDatosALaLista(lineaPrincipal + " EL AVION " + avion.getCodigoAvion().toUpperCase() + " NO SE ENCUENTRA EN " + origen.toUpperCase());
                                     }

                                 } else {
                                     datos.introducirDatosALaLista(lineaPrincipal + " NO SE PUDO GUARDAR YA QUE EL AVION NO TIENE EL SUFICIENTE ESPACIO DE GASOLINA");
                                 }
                             }catch(FileNotFoundException dis){
                                 datos.introducirDatosALaLista(lineaPrincipal + " NO SE PUDO GUARDAR YA QUE LA AEROLINEA NO EXISTE EN EL AEROPUERTO");
                             }
                         } catch (FileNotFoundException dis) {
                             
                         } catch (ClassNotFoundException ex) {
                               System.err.println("NO SE PUDO LEER EL AVION DE RESERVACION");
                        }
                         
                     } catch (FileNotFoundException e) {
                       datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE NO EXISTE DATOS DE LA DISTANCIA ENTRE "+origen.toUpperCase()+" HASTA "+destino.toUpperCase());
                    } catch (ClassNotFoundException ex) {
                         System.err.println("NO SE PUDO LEER LA DISTANCIA");
                    }

                } catch (FileNotFoundException ex) {
                    datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE NO EXISTE EL CODIGO DE AVION");
                }
                }
            } catch (ParseException ex) {
                 datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE NO CUMPLE CON EL FORMATO DE FECHA ESTABLECIDO");
            }
          
      }
      if(nombreAVerificar.equals(NOMBRES[8])){
                String nomA= datosObtenidos[0];
                String aeroActual= datosObtenidos[1];
                String codAvion= datosObtenidos[2];
                int cap= Integer.parseInt(datosObtenidos[3]);
                double cantGas= Double.parseDouble(datosObtenidos[4]);
                double cantPorMilla=Double.parseDouble(datosObtenidos[5]);
                try{
                    FileInputStream archivoA = new FileInputStream(FILE_AVIONES + "/" +codAvion.toUpperCase());
                    datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE YA EXISTE EL REGISTRO");
                }catch(FileNotFoundException ar){
                    try {
                    FileInputStream archivoA = new FileInputStream(FILE_AEROPUERTO + "/" +aeroActual.toUpperCase());
                     try {
                        FileInputStream archivoAerolinea = new FileInputStream(FILE_AEROLINEA + "/" +aeroActual.toUpperCase()+"_"+ nomA.toUpperCase());
                         Avion NA= new Avion(nomA,aeroActual,codAvion,cap,cantGas,cantPorMilla);
                         GuardarArchivoBinario.guardarAvion(NA);
                         datos.introducirDatosALaLista(lineaPrincipal + " ***GUARDADA CON EXITO***");
                     } catch (FileNotFoundException e) {
                       datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE NO EXISTE LA AEROLINEA EN EL AEROPUERTO");
                    }

                } catch (FileNotFoundException ex) {
                    datos.introducirDatosALaLista(lineaPrincipal + "NO SE PUDO CARGAR PORQUE NO EXISTE EL AEROPUERTO");
                }
                }
                   
      }
     }
     
    
        
       
    
}
