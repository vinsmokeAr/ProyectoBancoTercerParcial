/*
 * Autor: Arleth Machuca Fabian 406
* fecha de creación: 20 / mayo / 23
 *fecha de modificación: 23 / mayo / 23
* Descripción: Se creó la interfáz de ingresar empleados.
 */
package view;

import controller.EmpleadoController;
import entity.Empleados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class IngresarEmpleados extends javax.swing.JFrame {
 private List<Empleados> listaEmpleados = new ArrayList<>();
    private final DefaultTableModel modelo2;           
    private String codEmpActual;
    EmpleadoController controlador = new EmpleadoController();
   
    
    /**
     * Se inicializó el método empleados
     */
    public IngresarEmpleados() {
        initComponents();
         modelo2 = (DefaultTableModel)tablaEmpleados.getModel(); // inicializar cliente

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEmpleados = new javax.swing.JPanel();
        empleadoRFC = new javax.swing.JLabel();
        empleadosNombre = new javax.swing.JLabel();
        empleadosDireccion = new javax.swing.JLabel();
        empleadosTelefono = new javax.swing.JLabel();
        ingresarRFCempleados = new javax.swing.JTextField();
        ingresarNombreEmpleados = new javax.swing.JTextField();
        ingresarDireccionEmpleados = new javax.swing.JTextField();
        ingresarTelefonoEmpleados = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        guardarEmpleados = new javax.swing.JButton();
        eliminarEmpleados = new javax.swing.JButton();
        actualizarEmpleados = new javax.swing.JButton();
        imagenBancoBienestar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEmpleados.setBackground(new java.awt.Color(255, 204, 102));
        panelEmpleados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro ExtraLight", 0, 18))); // NOI18N

        empleadoRFC.setText("Código empleado:");

        empleadosNombre.setText("Nombre:");

        empleadosDireccion.setText("Dirección:");

        empleadosTelefono.setText("Teléfono:");

        ingresarRFCempleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresarNombreEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresarDireccionEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresarTelefonoEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "Nombre", "Teléfono"
            }
        ));
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        guardarEmpleados.setText("Guardar");
        guardarEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarEmpleadosMouseClicked(evt);
            }
        });

        eliminarEmpleados.setText("Eliminar");
        eliminarEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarEmpleadosMouseClicked(evt);
            }
        });

        actualizarEmpleados.setText("Actualizar");
        actualizarEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actualizarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarEmpleadosMouseClicked(evt);
            }
        });

        imagenBancoBienestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BancoDelBienestar_logoHor (1).png"))); // NOI18N

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(guardarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(eliminarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(actualizarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(imagenBancoBienestar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(empleadosNombre)
                                .addGap(94, 94, 94)
                                .addComponent(ingresarNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(empleadoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ingresarRFCempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empleadosDireccion)
                            .addComponent(empleadosTelefono))
                        .addGap(18, 18, 18)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresarTelefonoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresarDireccionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addComponent(imagenBancoBienestar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empleadoRFC)
                        .addComponent(ingresarRFCempleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empleadosDireccion)
                        .addComponent(ingresarDireccionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadosNombre)
                    .addComponent(empleadosTelefono)
                    .addComponent(ingresarTelefonoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarEmpleados)
                    .addComponent(eliminarEmpleados)
                    .addComponent(actualizarEmpleados))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * Se creó el método con Mouse Clicked del botón guardar empleados
 */
    private void guardarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEmpleadosMouseClicked
        if(validRegistro(ingresarRFCempleados.getText())){
            Empleados empleados = new Empleados(this.ingresarRFCempleados.getText(),
            this.ingresarNombreEmpleados.getText(),
            this.ingresarTelefonoEmpleados.getText(),
            this.ingresarDireccionEmpleados.getText());
            
//            Aqui guarda
            mostrarDatosEmpleadosTabla();
        } else{
            JOptionPane.showMessageDialog(this, "Este empleado ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_guardarEmpleadosMouseClicked

 /**
 * 
 * Se creó el método con Mouse Clicked del botón eliminar empleados
 */
    
    private void eliminarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarEmpleadosMouseClicked

       
    String RFC = tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0).toString();
    
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
    
    if (respuesta == JOptionPane.YES_OPTION) {
        // Aqui elimina:
        mostrarDatosEmpleadosTabla();
}
    }//GEN-LAST:event_eliminarEmpleadosMouseClicked

 /**
 * 
 * Se creó el método con Mouse Clicked del botón actualizar empleados
 */
    
    private void actualizarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarEmpleadosMouseClicked
        int i = 0;
        for(Empleados empleado : listaEmpleados){
            if(empleado.getCodEmpleado().equals(codEmpActual)){
                listaEmpleados.set(i,new Empleados(ingresarRFCempleados.getText(), 
                        ingresarNombreEmpleados.getText(), 
                        ingresarTelefonoEmpleados.getText(), 
                        ingresarDireccionEmpleados.getText()));
                break;
            }
            i++;
        }
        mostrarDatosEmpleadosTabla();
    }//GEN-LAST:event_actualizarEmpleadosMouseClicked
/**
 * 
 *  Se inicializó el método para 
 */
    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        codEmpActual = tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0).toString();
        for(Empleados empleado : listaEmpleados){
            if(empleado.getCodEmpleado().equals(codEmpActual)){
                ingresarRFCempleados.setText(empleado.getCodEmpleado());
                ingresarNombreEmpleados.setText(empleado.getNombre());
                ingresarDireccionEmpleados.setText(empleado.getDireccion());
                ingresarTelefonoEmpleados.setText(empleado.getTelefono());
                
                break;
            }
        }
    }//GEN-LAST:event_tablaEmpleadosMouseClicked
    
    
/**
 * 
 * Se creó el método para validar el registro para que no se repitan empleados
 */
    private boolean validRegistro(String id){
        for(Empleados empleado : listaEmpleados){
            if(empleado.getCodEmpleado().equals(id)){
                return false;
            }
        }
        return true;
    }
   
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarEmpleados;
    private javax.swing.JButton eliminarEmpleados;
    private javax.swing.JLabel empleadoRFC;
    private javax.swing.JLabel empleadosDireccion;
    private javax.swing.JLabel empleadosNombre;
    private javax.swing.JLabel empleadosTelefono;
    private javax.swing.JButton guardarEmpleados;
    private javax.swing.JLabel imagenBancoBienestar;
    private javax.swing.JTextField ingresarDireccionEmpleados;
    private javax.swing.JTextField ingresarNombreEmpleados;
    private javax.swing.JTextField ingresarRFCempleados;
    private javax.swing.JTextField ingresarTelefonoEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatosEmpleadosTabla() {
        
        modelo2.setRowCount(0);
        for (Empleados empleados : listaEmpleados){
            Object[]fila = new Object[3];
            fila[0]=empleados.getCodEmpleado();
            fila[1]=empleados.getNombre();
            fila[2]=empleados.getTelefono();
            modelo2.addRow(fila);       
        }
    }
        
        
        
    }

