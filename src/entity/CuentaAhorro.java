/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 may. 2023
* Fecha de modificación: 30 may. 2023
* Descripción: Se creó la cuenta ahorro.
 */

package entity;


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
        System.out.println("Saldo insuficiente para realizar el retiro. Tu saldo es: " + getSaldo());
    }
    }
}


    
    
    

