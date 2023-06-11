/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 mayo 2023
* Fecha de modificación: 08 junio 2023
* Descripción: Se creó la cuenta corriente que hereda atributos de la clase 
* abstracta cuenta.
*/

package entity;


public class CuentaCorriente extends Cuenta {

    private final double limiteSobregiro;
    private final double comisionSobregiro;

    public CuentaCorriente(int numeroCuenta, double saldo, Cliente cliente, 
            double limiteSobregiro, double comisionSobregiro) {
        super(numeroCuenta, saldo, cliente);
        this.limiteSobregiro = limiteSobregiro;
        this.comisionSobregiro = comisionSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public double getComisionSobregiro() {
        return comisionSobregiro;
    }
    
    /**
     * Lógica específica para retirar dinero de una cuenta corriente
     *  
     * @param monto:
     */
    @Override
    public void retirar(double monto) {
    // Verificar si el monto del retiro supera el saldo más el límite de sobregiro
    if (monto <= getSaldo() + getLimiteSobregiro()) {
        // Realizar el retiro
        saldo -= monto;
    } else {
        System.out.println("Monto de retiro excede el saldo disponible y el "
                + "límite de sobregiro. El cual es " + getSaldo() + getLimiteSobregiro());
    }
    }
}