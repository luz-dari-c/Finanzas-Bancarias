
package finanzas.bancareras;

import java.util.Date;


public class Cuenta {
private  int saldoActual;
private  int saldoMedio;
private String numeroDeCuenta;
private   String identificadorBanco;
private  String identificadorSucursal;
private   Cliente cliente;
private String CCC;
private Sucursal sucursal;
private Date fechaDeApertura;
private int antiguedad;

    public Cuenta(int saldoActual, int saldoMedio, String numeroDeCuenta, String identificadorBanco, String identificadorSucursal, Cliente cliente, String CCC, Sucursal sucursal, Date fechaDeApertura, int antiguedad) {
        this.saldoActual = saldoActual;
        this.saldoMedio = saldoMedio;
        this.numeroDeCuenta = numeroDeCuenta;
        this.identificadorBanco = identificadorBanco;
        this.identificadorSucursal = identificadorSucursal;
        this.cliente = cliente;
        this.CCC = CCC;
        this.sucursal = sucursal;
        this.fechaDeApertura = fechaDeApertura;
        this.antiguedad = antiguedad;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(int saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getIdentificadorBanco() {
        return identificadorBanco;
    }

    public void setIdentificadorBanco(String identificadorBanco) {
        this.identificadorBanco = identificadorBanco;
    }

    public String getIdentificadorSucursal() {
        return identificadorSucursal;
    }

    public void setIdentificadorSucursal(String identificadorSucursal) {
        this.identificadorSucursal = identificadorSucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCCC() {
        return CCC;
    }

    public void setCCC(String CCC) {
        this.CCC = CCC;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //METODOS
    
   
    
    
    
  




    @Override
    public String toString() {
        return "Cuenta\n" + "SaldoActual: " + saldoActual + "\nSaldo Medio: " + saldoMedio + "\nNumero De Cuenta: " + numeroDeCuenta + "\nIdentificador Banco: " + identificadorBanco + "\nIdentificador Sucursal: " + identificadorSucursal + "\nCliente: " + cliente + "\nCCC: " + CCC;
    }





}
