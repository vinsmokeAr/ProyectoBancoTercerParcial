/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 21 mayo 2023
* Fecha de modificación: 05 junio 2023
* Descripción: Se creó la cuenta Empleados.
*/
package entity;

/**
 * 
 * Se creó la clase empleados, la cual heredará atributos de la clase persona
 */

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
