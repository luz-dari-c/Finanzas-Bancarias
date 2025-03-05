
package finanzas.bancareras;

import java.util.List;


public class Persona extends Cliente{
   private String fechaDeNacimiento;
   private String sexo;

    public Persona(String fechaDeNacimiento, String sexo, String nombre, String direccion, String codigoIdentificacion, List<Cuenta> cuentas) {
        super(nombre, direccion, codigoIdentificacion, cuentas);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 

    @Override
    public String toString() {
        return "Persona\n" + "Fecha De Nacimiento: " + fechaDeNacimiento + "\nSexo: " + sexo;
    }
    
    
   
   
}



