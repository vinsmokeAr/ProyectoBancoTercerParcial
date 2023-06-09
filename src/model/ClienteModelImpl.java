/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se creó la interfáz de ingresar clientes.
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
       listaC.add(cliente);
    }

    @Override
    public void eliminarRegistro(String rfc) {
        for (Cliente cliente : listaC) {
            if (cliente.getRFC().compareTo(rfc) == 0) {
                listaC.remove(cliente);
                break;
            } else {
            JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        }
        }
    }

    @Override
    public void modificarRegistro(Cliente cliente) {
        int i = 0;
        for (Cliente cliente1 : listaC){
            if (cliente.getRFC().equals(cliente.getRFC())) {
                listaC.set(i, cliente);
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

   
}
