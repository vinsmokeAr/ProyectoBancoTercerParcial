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


public interface IEmpleadoModel {
    void agregarRegistro(List<Empleados> listaE,Empleados empleado);
    void eliminarRegistro(List<Empleados> listaE,String cod);
    void modificarRegistro(List<Empleados> listaE, Empleados empleado);
    void mostrarRegistros(List<Empleados> listaE,DefaultTableModel modeloT);    
}
