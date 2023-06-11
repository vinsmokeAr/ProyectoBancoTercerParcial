/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 21 mayo 2023
* Fecha de modificación: 09 junio 2023
* Descripción: Se realizó la clase cliente que hereda atributos de la clase
* persona.
*/
package entity;

//import java.util.ArrayList;

public class Cliente extends Persona{
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    public Cliente(String RFC, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.RFC = RFC;
    }

  
}

