/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se creó .
 */
package model;

import entity.Empleados;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EmpleadoModelImpl implements IEmpleadoModel {

    @Override
    public void agregarRegistro(List<Empleados> listaE, Empleados empleado) {
        listaE.add(empleado);
    }

    @Override
    public void eliminarRegistro(List<Empleados> listaE, String cod) {
        for (Empleados empleados : listaE) {
            if (empleados.getCodEmpleado().compareTo(cod) == 0) {
                listaE.remove(empleados);

                break;
            }
        }
    }

    @Override
    public void modificarRegistro(List<Empleados> listaE, Empleados empleado) {
        int i = 0;
        for (Empleados empleados : listaE) {
            if (empleado.getCodEmpleado().equals(empleados.getCodEmpleado())) {
                listaE.set(i, empleado);
                break;
            }
            i++;
        }
    }

    @Override
    public void mostrarRegistros(List<Empleados> listaE, DefaultTableModel modeloT) {
        modeloT.setRowCount(0);
        for (Empleados empleados : listaE) {
            Object[] fila = new Object[3];
            fila[0] = empleados.getCodEmpleado();
            fila[1] = empleados.getNombre();
            fila[2] = empleados.getTelefono();
            modeloT.addRow(fila);
        }

    }
}
