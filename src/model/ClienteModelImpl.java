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


public class ClienteModelImpl implements IClienteModel{
    List<Cliente> listaC =  new ArrayList<>();
    
    @Override
    public void agregarRegistro(Cliente cliente) {
        if(validRegistro(cliente.getRFC())){
            
            listaC.add(cliente);
            
        }else{
            JOptionPane.showMessageDialog(null, "Este cliente "
                    + "ya existe en el registro.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void eliminarRegistro(String rfc) {
       
        
        
        
        
    }

    @Override
    public void modificarRegistro(Cliente cliente) {
        
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modeloT) {
        
    }
    
    private boolean validRegistro(String id){
        for(Cliente cliente : listaC){
            if(cliente.getRFC().equals(id)){
                return false;
            }
        }
        return true;
    }
}
