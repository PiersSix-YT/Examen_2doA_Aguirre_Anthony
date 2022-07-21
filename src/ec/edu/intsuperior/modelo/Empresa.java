
package ec.edu.intsuperior.modelo;

import java.util.Date;


public class Empresa extends Persona{
private String nombreEmpresa;

    public Empresa(String nombre, String apellido, int cedula, Date fechaNac) {
        super(nombre, apellido, cedula, fechaNac);
        this.nombreEmpresa = nombreEmpresa;
        
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
  
}


