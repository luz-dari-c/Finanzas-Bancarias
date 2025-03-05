
package finanzas.bancareras;

import java.util.List;


public class Cliente {
    
private  String nombre;
private  String direccion;
private  String codigoIdentificacion;
private List <Cuenta> cuentas;

    public Cliente(String nombre, String direccion, String codigoIdentificacion, List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoIdentificacion = codigoIdentificacion;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    
    
    
    // Metodo para agregar una cuenta al cliente
    public void agregarCuenta(Cuenta cuenta){
        
        if (cuenta == null) {
            throw new IllegalArgumentException("La cuenta no puede estar vacio");          
        }  
        this.cuentas.add(cuenta);   
    }
    
    //Metodo para obtener la lista de cuenta del cliente
    
    public List <Cuenta> Obtenercuentas(){
        return this.cuentas;
    }
    
    
    //Metodo para verificar si el cliente es una Organización
    
   public boolean esOrganizacion(){
       return this instanceof Organizacion;
   }
    
      //Metodo para verificar si el cliente es una persona fisica

    public boolean esPersosaFisica(){
       return this instanceof Persona;
   }
    
    
    
    
    

  @Override

public String toString() {
    return "Cliente\n" +
           "Nombre: " + nombre + "\n" +
           "Dirección: " + direccion + "\n" +
           "Código de Identificación: " + codigoIdentificacion + "\n" +
           "Cuentas: " + cuentas + '.';
}


}

