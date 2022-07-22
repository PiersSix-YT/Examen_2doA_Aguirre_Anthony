
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Persona {
     
    private String nombre;
    private String apellido;
    private int cedula;
    private Date fechaNac;
    
    public Persona(String nombre, String apellido, int cedula, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}