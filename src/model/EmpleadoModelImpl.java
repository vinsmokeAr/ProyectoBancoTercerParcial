/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se creó la interfáz de ingresar clientes.
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
          for (int i = 0; i < listaE.size(); i++) {
        Empleados emp = listaE.get(i);
        if (emp.getCodEmpleado().equals(empleado.getCodEmpleado())) {
            listaE.set(i, empleado);
            break;
        }
    }   
    }

    @Override
    public void mostrarRegistros(List<Empleados> listaE, DefaultTableModel modeloT) {
        
         modeloT.setRowCount(0); // Limpiar el modelo de tabla antes de agregar los registros

    for (Empleados empleado : listaE) {
        Object[] fila = {
            empleado.getCodEmpleado(),
            empleado.getNombre(),
            empleado.getDireccion()
            // Agrega aquí los demás campos del empleado que desees mostrar en la tabla
        };
        modeloT.addRow(fila);
        
    }

}
}
