/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se hizo la conexión de la capa controller del empleado.
 */

package controller;

import entity.Empleados;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.EmpleadoModelImpl;
import model.IEmpleadoModel;

public class EmpleadoController {
    IEmpleadoModel modelo = new EmpleadoModelImpl();
    
    public void agregarRegistro(List<Empleados> listaE,Empleados empleado){
        modelo.agregarRegistro(listaE, empleado);
    }
    public void eliminarRegistro(List<Empleados> listaE,String cod){
        modelo.eliminarRegistro(listaE, cod);
    }
    public void modificarRegistro(List<Empleados> listaE, Empleados empleado){
        modelo.modificarRegistro(listaE, empleado);
    }
    public void mostrarRegistros(List<Empleados> listaE,DefaultTableModel modeloT){
        modelo.mostrarRegistros(listaE, modeloT);
    }
    
}
