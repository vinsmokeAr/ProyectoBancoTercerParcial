/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se hizo la conexión de con capa Model del cliente.
 */
package model;

import entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Se creó la clase de cliente model implements, a la cual se le implementará la
 * interfáz del cliente
 */
public class ClienteModelImpl implements IClienteModel {

    List<Cliente> listaC = new ArrayList<>();

    /**
     *
     * Se creó la clase de cliente model implements, a la cual se le
     * implementará la interfáz del cliente
     */
    @Override
    public void agregarRegistro(Cliente cliente) {
        if (validRegistro(cliente.getRFC())) {
            listaC.add(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Este cliente ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     *
     * Se creó el método para eliminar el registro de un cliente
     */
    @Override
    public void eliminarRegistro(String rfc) {
        for (Cliente cliente : listaC) {
            if (cliente.getRFC().equals(rfc)) {
                listaC.remove(cliente);
                break;
            }
        }
    }

    /**
     *
     * Se creó el método para modificar el registro de un cliente
     */
    @Override
    public void modificarRegistro(Cliente cliente) {
        int i = 0;
        for (Cliente cliente1 : listaC) {
            if (cliente.getRFC().equals(cliente.getRFC())) {
                //listaC.set(i, cliente);
                break;
            }
            i++;
        }
    }

    /**
     *
     * Se creó el método para mostrar en la tabla el registro de un cliente
     *
     */
    @Override
    public void mostrarRegistros(DefaultTableModel modeloT) {
        modeloT.setRowCount(0);
        for (Cliente cliente : listaC) {
            Object[] fila = new Object[3];
            fila[0] = cliente.getRFC();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getTelefono();
            modeloT.addRow(fila);
        }
    }

    /**
     *
     * Se creó el método para validar el registro de un cliente
     */
    private boolean validRegistro(String id) {
        for (Cliente cliente : listaC) {
            if (cliente.getRFC().equals(id)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * Se creó el método para obtener el registro de un cliente
     *
     */
    @Override
    public Cliente obtenerRegistro(String rfc) {
        for (Cliente cliente : listaC) {
            if (cliente.getRFC().equals(rfc)) {
                return cliente;
            }
        }
        return null;
    }
}
