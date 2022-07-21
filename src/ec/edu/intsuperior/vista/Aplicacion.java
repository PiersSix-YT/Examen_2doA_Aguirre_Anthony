 
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aplicacion {
    
    public static void main(String[] args) {
        SimpleDateFormat fechaNacimiento = new SimpleDateFormat("16/07/2002");
        Date fec = new Date(16/07/2002);
        System.out.println(" ");
       Empleado obj1 = new Empleado("David", "Aguirre", 1728504679, fec, 300, 400);
       obj1.mostrarDatosEmpleado();
        System.out.println(" ");
       Cliente obj2 = new Cliente("Ramiro", "Aguirre", 1728567889, fec,989896255);
       obj2.mostrarDatosCliente();
        System.out.println(" ");
       Directivo obj3 = new Directivo("Jefe", "Anthony", "Pilataxi", 172856789, fec, 1000, 5000);
       obj3.mostrarDatosDirectivo();
       
    }
    }

