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

public class ClienteModelImpl implements IClienteModel {

    List<Cliente> listaC = new ArrayList<>();

    @Override
    public void agregarRegistro(Cliente cliente) {
        if (validRegistro(cliente.getRFC())) {
            listaC.add(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Este cliente ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void eliminarRegistro(String rfc) {
        for (Cliente cliente : listaC) {
            if (cliente.getRFC().equals(rfc)) {
                listaC.remove(cliente);
                break;
            }
        }
    }

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

    private boolean validRegistro(String id) {
        for (Cliente cliente : listaC) {
            if (cliente.getRFC().equals(id)) {
                return false;
            }
        }
        return true;
    }

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
