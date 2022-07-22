
package ec.edu.intsuperior.modelo;

import java.util.Date;


public class Empresa extends Persona{
private String nombreEmpresa;

    public Empresa(String nombre, String apellido, int cedula, Date fechaNac, String nacionalidad, EstadoCivil estadoCi,Sexo sex) {
        super(nombre, apellido, cedula, fechaNac, nacionalidad, estadoCi, sex);
        this.nombreEmpresa = nombreEmpresa;
        
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
  
    public void mostrarDatosEmpresa(){
        System.out.println("==== DATOS DE LA EMPRESA ====");
        System.out.println("Nombre de la empresa: "+getNombre());
    }
}


