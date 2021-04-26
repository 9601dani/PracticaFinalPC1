
package com.mycompany.Ejecutable;

import com.mycompany.Interfaz.MenuPrincipal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejecutable {
    public static SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/YYYY");
    public static void main(String[] args) {
          Date fechas = new Date();
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
    }
}
