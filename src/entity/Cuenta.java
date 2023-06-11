/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 21 mayo 2023
* Fecha de modificación: 09 junio 2023
* Descripción: Se realizó la clase abstracta cuenta.
*/
package entity;

public abstract class Cuenta {

    private int numeroCuenta;
    protected double saldo;
    private Cliente cliente;

    public Cuenta(int numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public abstract void retirar(double monto);
}



