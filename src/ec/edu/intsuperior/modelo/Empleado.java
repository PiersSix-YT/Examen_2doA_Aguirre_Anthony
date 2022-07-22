
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Empleado extends Persona{
  
    private int sueldoBruto;
    private int salarioNeto;
    
public Empleado(String nombre, String apellido, int cedula, Date fechaNac, int sueldoBruto, int salarioNeto, String nacionalidad, EstadoCivil estadoCi,Sexo sex){
    super(nombre, apellido,cedula,fechaNac,nacionalidad,estadoCi,sex);
    this.sueldoBruto = sueldoBruto;
    this.salarioNeto = salarioNeto;
}

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public int getSalarioNeto() {
        return salarioNeto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setSalarioNeto(int salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public void mostrarDatosEmpleado(){
        System.out.println("==== DATOS DEL EMPLEADO ====");
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nCedula: "+getCedula()+
                "\nFecha de nacimiento: "+getFechaNac()+
                "\nNacionalidad: "+getNacionalidad()+
                "\nEstado Civil: "+getEstadoCi()+
                "\nSexo: "+getSex()+
                "\nSueldo bruto: "+sueldoBruto+
                "\nSalario neto: "+salarioNeto);
    }
}
