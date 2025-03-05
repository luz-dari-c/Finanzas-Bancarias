package finanzas.bancareras;

import java.util.List;


public class Organizacion extends Cliente {
    
private String tipo;
private String representante;
private int cantidadEmpleados;

    public Organizacion(String tipo, String representante, int cantidadEmpleados, String nombre, String direccion, String codigoIdentificacion, List<Cuenta> cuentas) {
        super(nombre, direccion, codigoIdentificacion, cuentas);
        this.tipo = tipo;
        this.representante = representante;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

 

@Override
    public String toString() {
        return "Organizacion\n" +
               "Nombre: " + getNombre() + "\n" +
               "Dirección: " + getDireccion() + "\n" +
               "Código de Identificación: " + getCodigoIdentificacion() + "\n" +
               "Tipo: " + tipo + "\n" +
               "Representante: " + representante + "\n" +
               "Cantidad de Empleados: " + cantidadEmpleados + "\n" +
               "Cuentas: " + getCuentas() + '.';
    }

}
