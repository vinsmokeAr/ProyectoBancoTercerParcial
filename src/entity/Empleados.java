/*
 * Autor: Arleth Machuca Fabian
 */
package entity;

public class Empleados extends Persona{
    String codEmpleado;
    
    public Empleados(String RFC, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        
        codEmpleado = RFC;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    
    

}
