/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 mayo 2023
* Fecha de modificación: 08 junio 2023
* Descripción: Se creó la cuenta ahorro que hereda atributos de la clase abstracta 
* cuenta.
 */

package entity;

import javax.swing.JOptionPane;


public class CuentaAhorro extends Cuenta {

    private final double tasaInteres;

    public CuentaAhorro(int numeroCuenta, double saldo, Cliente cliente, 
            double tasaInteres) {
        super(numeroCuenta, saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
    
    /**
     * Lógica específica para retirar dinero de una cuenta de ahorros
     * @param monto : Es el monto que se va retirar de la cuenta.
     */
    @Override
    public void retirar(double monto) {
    // Verificar si el saldo es suficiente para el retiro
    if (monto <= getSaldo()) {
        // Realizar el retiro
        saldo -= monto;
    } else {
        JOptionPane.showInputDialog(null, "saldo insuficiente");
    }
    }
}


    
    
    

