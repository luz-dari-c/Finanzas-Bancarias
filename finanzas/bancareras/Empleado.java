
package finanzas.bancareras;


public class Empleado {
private String DNI;
private String nombre;
private String fechaDeNacimiento;
private String sexo;
private Sucursal sucursal;
private Cliente cliente;
private boolean esDirector;

    public Empleado(String DNI, String nombre, String fechaDeNacimiento, String sexo, Sucursal sucursal, Cliente cliente, boolean esDirector) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.esDirector = esDirector;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEsDirector() {
        return esDirector;
    }

    public void setEsDirector(boolean esDirector) {
        this.esDirector = esDirector;
    }


    @Override
    public String toString() {
        return "Empleado\n" +"Es Director: "+ esDirector + "DNI: " + DNI + "\nNombre: " + nombre + "\nFechaDeNacimiento: " + fechaDeNacimiento + "\nSexo: " + sexo + "\nSucursal: " + sucursal;
    }

    
    

}
