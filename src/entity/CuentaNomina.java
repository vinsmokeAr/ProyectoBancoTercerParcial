/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 may. 2023
* Fecha de modificación: 30 may. 2023
* Descripción: Se creó la cuenta nómina
 */
package entity;

import javax.swing.JOptionPane;

public class CuentaNomina extends Cuenta {

    private String empresa;

    public CuentaNomina(int numeroCuenta, double saldo, Cliente cliente,
            String empresa) {
        super(numeroCuenta, saldo, cliente);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public void retirar(double monto) {
        // No se permite retirar dinero de una cuenta de nómina
        JOptionPane.showMessageDialog(null,
                "No está permitidi retirar dinero de una cuenta de nómina.",
                "Error de retiro", JOptionPane.ERROR_MESSAGE);
        System.out.println("No está permitido retirar dinero de una cuenta de nómina.");
    }
}
