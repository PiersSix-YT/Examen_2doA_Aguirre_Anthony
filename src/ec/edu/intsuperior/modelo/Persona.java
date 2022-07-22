
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Persona {
     
    private String nombre;
    private String apellido;
    private int cedula;
    private Date fechaNac;
    private String nacionalidad;
    public enum EstadoCivil{CASADO,SOLTERO,VIUDO}
    EstadoCivil estadoCi;
    public enum Sexo{MASCULINO,FEMENINO}
    Sexo sex;
    public Persona(String nombre, String apellido, int cedula, Date fechaNac, String nacionalidad, EstadoCivil estadoCi,Sexo sex) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.estadoCi = estadoCi;
        this.sex = sex;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public EstadoCivil getEstadoCi() {
        return estadoCi;
    }

    public void setEstadoCi(EstadoCivil estadoCi) {
        this.estadoCi = estadoCi;
    }

    public Sexo getSex() {
        return sex;
    }

    public void setSex(Sexo sex) {
        this.sex = sex;
    }
    
    
    
}