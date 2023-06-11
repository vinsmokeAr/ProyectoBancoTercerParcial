/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 11 junio 2023
* Descripción: Se hizo la conexión de la capa controller del cliente.
*/

package controller;
import entity.Cliente;
import javax.swing.table.DefaultTableModel;
import model.ClienteModelImpl;
import model.IClienteModel;

public class ClienteController {
    IClienteModel modelo = new ClienteModelImpl();
    public void agregarRegistro(Cliente cliente){
        this.modelo.agregarRegistro(cliente);
    }
    public void eliminarRegistro(String rfc){
        this.modelo.eliminarRegistro(rfc);
    }
    public void modificarRegistro(Cliente cliente){
        this.modelo.modificarRegistro(cliente);
    }
    public void mostrarRegistros(DefaultTableModel modeloT){
        this.modelo.mostrarRegistros( modeloT);
    }
    public Cliente obtenerCliente(String rfc){   
        return  this.modelo.obtenerRegistro(rfc);
    } 
}
