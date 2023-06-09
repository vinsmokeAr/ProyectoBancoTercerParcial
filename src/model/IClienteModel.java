/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 17 / mayo / 23
* Fecha de modificación: 23 / mayo / 23
* Descripción: Se creó la interfáz de clientes.
 */
package model;
import entity.Cliente;
import javax.swing.table.DefaultTableModel;



public interface IClienteModel {
    void agregarRegistro(Cliente cliente);
    void eliminarRegistro(String rfc);
    void modificarRegistro(Cliente cliente);
    void mostrarRegistros(DefaultTableModel modeloT); 
}
