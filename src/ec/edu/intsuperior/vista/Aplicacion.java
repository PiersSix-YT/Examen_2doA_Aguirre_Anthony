package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aplicacion {

    public static void main(String[] args) {
        SimpleDateFormat fech = new SimpleDateFormat("16/07/2002");
        Date fec = new Date(16/07/2002);
       
        Cliente obj2 = new Cliente("Ramiro", "Aguirre", 1728567985, fec, 987586898, "Ecuatoriano", Persona.EstadoCivil.CASADO, Persona.Sexo.MASCULINO);
        obj2.mostrarDatosCliente();
        System.out.println(" ");
        
        Empleado obj1 = new Empleado("David", "Aguirre", 1728504679, fec, 500, 700, "Ecuatoriano", Persona.EstadoCivil.SOLTERO, Persona.Sexo.MASCULINO);
        obj1.mostrarDatosEmpleado();
        System.out.println(" ");
        
        Directivo obj3 = new Directivo("Jefe", "Maria", "Pilataxi", 1728504678, fec, 1000, 1500, "Ecuatoriano", Persona.EstadoCivil.CASADO, Persona.Sexo.FEMENINO);
        obj3.mostrarDatosDirectivo();
     
    }
}
