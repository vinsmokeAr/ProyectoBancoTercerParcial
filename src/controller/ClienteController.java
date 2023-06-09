/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se creó la interfáz de ingresar clientes.
 */

package controller;
import entity.Cliente;
import javax.swing.table.DefaultTableModel;
import model.ClienteModelImpl;
import model.IClienteModel;

public class ClienteController {
    IClienteModel cliente = new ClienteModelImpl();
    public void agregarRegistro(Cliente cliente){
        this.cliente.agregarRegistro(cliente);
    }
    public void eliminarRegistro(String rfc){
        cliente.eliminarRegistro(rfc);
    }
    public void modificarRegistro(Cliente cliente){
        this.cliente.modificarRegistro(cliente);
    }
    public void mostrarRegistros(DefaultTableModel modeloT){
        cliente.mostrarRegistros( modeloT);
    }
    
}
