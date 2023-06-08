/**
 * Autor: Arleth Machuca Fabian
 * Fecha de creación: 24 de mayo del 2023
 * Fecha de modificación: 24 de mayi del 2023
 * Descripción; Se creó la clase Movimientos para mostrar el cliente, su cuenta,
 * el tipo de movimiento y el monto del cliente.
 */
package entity;

public class Movimiento {
    private String tipoMov;
    private double monto;

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
