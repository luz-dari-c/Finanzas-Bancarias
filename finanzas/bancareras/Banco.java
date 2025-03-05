package finanzas.bancareras;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Banco {
    private String identificadorBanco;
    private List<Sucursal> sucursales;
    private List<Cliente> clientes;

    public Banco(String identificador, List<Sucursal> sucursales, List<Cliente> clientes) {
        this.identificadorBanco = identificador;
        this.sucursales = sucursales;
        this.clientes = clientes;
    }

    public String getIdentificador() {
        return identificadorBanco;
    }

    public void setIdentificador(String identificador) {
        this.identificadorBanco = identificador;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Método para abrir una cuenta
    
    public Cuenta abrirCuenta(Cliente cliente, String tipoCuenta, Sucursal sucursal, double depositoInicial) {
        if (!validarCliente(cliente)) {
            throw new IllegalArgumentException("Información del cliente no válida.");
        }

        // GENERAR EL CCC
        String CCC = generarCCC(sucursal);

        // CREAR LA CUENTA SEGUN EL TIPO
        Cuenta cuenta;
        if (tipoCuenta.equalsIgnoreCase("corriente")) {
            if (depositoInicial < 100) {
                throw new IllegalArgumentException("Depósito inicial insuficiente para cuenta corriente.");
            }
            cuenta = new CuentaCorriente(0, 0, generarNumeroCuenta(), identificadorBanco, sucursal.getIdentificador(), cliente, CCC, sucursal, new Date(), 0);
        } else if (tipoCuenta.equalsIgnoreCase("ahorro")) {
            if (depositoInicial < 50) { 
                throw new IllegalArgumentException("Saldo inicial insuficiente para cuenta de ahorro.");
            }
            cuenta = new CuentaAhorro(0, 0, generarNumeroCuenta(), identificadorBanco, sucursal.getIdentificador(), cliente, CCC, sucursal, new Date(), 0, "Sistema de amortización francés");
        } else {
            throw new IllegalArgumentException("Tipo de cuenta no válido.");
        }

        // ASOCIAR LA CUENTA AL CLIENTE Y A LA SUCURSAL
        cliente.agregarCuenta(cuenta);
        sucursal.agregarCuenta(cuenta);

        return cuenta;
    }

    // Método para validar la información del cliente
    private boolean validarCliente(Cliente cliente) {
        return cliente.getNombre() != null && !cliente.getNombre().isEmpty() &&
               cliente.getDireccion() != null && !cliente.getDireccion().isEmpty() &&
               cliente.getCodigoIdentificacion() != null && !cliente.getCodigoIdentificacion().isEmpty();
    }

    // Método para generar el CCC (Código Cuenta Cliente)
    private String generarCCC(Sucursal sucursal) {
        return this.identificadorBanco + "-" + sucursal.getIdentificador() + "-" + generarNumeroCuenta();
    }

    // Método para generar un número de cuenta único
    private String generarNumeroCuenta() {
        return UUID.randomUUID().toString().substring(0, 8); 
    }

    // Método para agregar una sucursal
    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal == null) {
            System.out.println("La sucursal no puede estar vacía.");
            return;
        }

        if (sucursales.contains(sucursal)) {
            System.out.println("La sucursal ya existe.");
            return;
        }

        sucursales.add(sucursal);
        System.out.println("Sucursal agregada correctamente.");
    }

    public Sucursal buscarSucursalPorIdentificador(String identificadorIngresado) {
        for (Sucursal s : sucursales) {
            if (s.getIdentificador().equals(identificadorIngresado)) {
                return s;
            }
        }
        return null; 
    }

    public Cliente buscarCliente(String codigoIdentificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigoIdentificacion().equals(codigoIdentificacion)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Banco\n" +
               "Identificador: " + identificadorBanco + "\n" +
               "Sucursales: " + sucursales + "\nClientes: " + clientes;
    }
}