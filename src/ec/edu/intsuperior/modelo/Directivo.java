
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Directivo extends Empleado{
    private String categoria;

    public Directivo(String categoria, String nombre, String apellido, int cedula, Date fechaNac, int sueldoBruto, int salarioNeto, String nacionalidad, EstadoCivil estadoCi,Sexo sex) {
        super(nombre, apellido, cedula, fechaNac, sueldoBruto, salarioNeto,nacionalidad,estadoCi,sex);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarDatosDirectivo(){
        System.out.println("==== DATOS DEL DIRECTIVO ====");
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nCedula: "+getCedula()+
                "\nCategoria: "+categoria+
                "\nFecha de Nacimiento: "+getFechaNac()+
                "\nNacionalidad: "+getNacionalidad()+
                "\nEstado Civil: "+getEstadoCi()+
                "\nSexo: "+getSex()+
                "\nSaldo Bruto: "+getSueldoBruto()+
                "\nSalario neto: "+getSalarioNeto());
    }
    
} 
  


    
    

