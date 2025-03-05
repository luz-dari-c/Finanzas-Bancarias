
package finanzas.bancareras;

import java.util.Date;

public class CuentaAhorro extends Cuenta {
private String tipoDeAmortizacion;

    public CuentaAhorro(int saldoActual, int saldoMedio, String numeroDeCuenta, String identificadorBanco, String identificadorSucursal, Cliente cliente, String CCC, Sucursal sucursal, Date fechaDeApertura, int antiguedad, String tipoDeAmortizacion) {
       
    super(saldoActual, saldoMedio, numeroDeCuenta, identificadorBanco, identificadorSucursal, cliente, CCC, sucursal, fechaDeApertura, antiguedad);
    this.tipoDeAmortizacion = tipoDeAmortizacion;
    }

 

    public String getTipoDeAmortizacion() {
        return tipoDeAmortizacion;
    }

    public void setTipoDeAmortizacion(String tipoDeAmortizacion) {
        this.tipoDeAmortizacion = tipoDeAmortizacion;
    }

   
    
    @Override
    public String toString() {
        return "CuentaAhorro\n" +
                "Tipo De Amortizacion: " + tipoDeAmortizacion +
                "\nSaldo Actual: " + getSaldoActual() +
                "\nSaldo Medio: " + getSaldoMedio() +
                "\nNumero De Cuenta: " + getNumeroDeCuenta() +
                "\nIdentificador Banco: " + getIdentificadorBanco() +
                "\nIdentificador Sucursal: " + getIdentificadorSucursal() +
                "\nCliente: " + getCliente().getNombre();
    }


}
