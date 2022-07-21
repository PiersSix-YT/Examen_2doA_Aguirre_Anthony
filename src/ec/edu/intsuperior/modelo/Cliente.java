
package ec.edu.intsuperior.modelo;
import java.util.Date;

public class Cliente extends Persona{
    private int numeroTelefono;
    
public Cliente(String nombre, String apellido, int cedula, Date fechaNac,int numeroTelefono){
    super(nombre, apellido,cedula,fechaNac);
    this.numeroTelefono = numeroTelefono;
   
}

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    public void mostrarDatosCliente(){
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nCedula: "+getCedula()+
                "\nNumero de Telefono: "+numeroTelefono);  
    }
}
