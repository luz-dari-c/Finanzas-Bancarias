
package finanzas.bancareras;

import java.util.ArrayList;
import java.util.List;


public class Sucursal {
private int numero;
private String direccion;
private String codigoPostal;
private String ciudad;
private List <Empleado>empleados;
private List <Cuenta> cuentas;
private Empleado director;
private String identificador;

    public Sucursal(int numero, String direccion, String codigoPostal, String ciudad, List<Empleado> empleados, Empleado director,String identificador) {
        this.numero = numero;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.empleados = empleados;
        this.director = director;
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
    
    
    
    //METODOS
    
    //Agregar Cuenta
     public void agregarCuenta(Cuenta cuenta) {
        if (cuenta == null) {
            throw new IllegalArgumentException("La cuenta no puede ser nula.");
        }
        this.cuentas.add(cuenta);
    }
     
    //Obtener Cuenta
     public List<Cuenta> obtenerCuentas(){
         return this.cuentas;
     } 
     
     
     //Agregar Empleado
     public void agregarEmpleado(Empleado empleado){
         if (empleado == null) {      
             throw new IllegalArgumentException("El empleado no puede estar vacio");
         }         
         this.empleados.add(empleado);
     }
     
     
     public List <Empleado> obtenerEmpleados(){    
         return this.empleados;
     }
     
     
     public void asignarDirector(Empleado director){
         if (director == null) { 
             throw new IllegalArgumentException("El director no puede estar vacio");            
         }
         
         this.director = director;
     }
         
     

}
