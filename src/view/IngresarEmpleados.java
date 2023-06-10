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
        modelo2 = (DefaultTableModel) tablaEmpleados.getModel(); // inicializar cliente

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panelEmpleados = new javax.swing.JPanel();
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
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEmpleados.setBackground(new java.awt.Color(4, 92, 76));
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

        imagenBancoBienestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BancoDelBienestar_LogoBlanco.png"))); // NOI18N

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                .addComponent(imagenBancoBienestar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(ingresarTelefonoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingresarDireccionEmpleados))))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(guardarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(eliminarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actualizarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(botonRegresar)))
                .addGap(35, 35, 35))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonRegresar)
                .addGap(23, 23, 23)
                .addComponent(imagenBancoBienestar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoRFC)
                    .addComponent(ingresarRFCempleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadosDireccion)
                    .addComponent(ingresarDireccionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empleadosNombre)
                    .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ingresarNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empleadosTelefono)
                        .addComponent(ingresarTelefonoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarEmpleados)
                    .addComponent(eliminarEmpleados)
                    .addComponent(actualizarEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * Se creó el método con Mouse Clicked del botón guardar empleados
     */
    private void guardarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEmpleadosMouseClicked
        if (validRegistro(ingresarRFCempleados.getText())) {
            Empleados empleados = new Empleados(this.ingresarRFCempleados.getText(),
                    this.ingresarNombreEmpleados.getText(),
                    this.ingresarTelefonoEmpleados.getText(),
                    this.ingresarDireccionEmpleados.getText());

//            Aqui guarda
            controlador.agregarRegistro(listaEmpleados, empleados);
            mostrarDatosEmpleadosTabla();
        } else {
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
            controlador.eliminarRegistro(listaEmpleados, RFC);
            mostrarDatosEmpleadosTabla();
        }
    }//GEN-LAST:event_eliminarEmpleadosMouseClicked

    /**
     *
     * Se creó el método con Mouse Clicked del botón actualizar empleados
     */

    private void actualizarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarEmpleadosMouseClicked

        Empleados empleado = new Empleados(this.ingresarRFCempleados.getText(),
                this.ingresarNombreEmpleados.getText(),
                this.ingresarTelefonoEmpleados.getText(),
                this.ingresarDireccionEmpleados.getText());

        // Aqui actualiza 
        controlador.modificarRegistro(listaEmpleados, empleado);

        mostrarDatosEmpleadosTabla();
    }//GEN-LAST:event_actualizarEmpleadosMouseClicked
    /**
     *
     * Se inicializó el método para
     */
    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        codEmpActual = tablaEmpleados.getValueAt(tablaEmpleados.getSelectedRow(), 0).toString();
        for (Empleados empleado : listaEmpleados) {
            if (empleado.getCodEmpleado().equals(codEmpActual)) {
                ingresarRFCempleados.setText(empleado.getCodEmpleado());
                ingresarNombreEmpleados.setText(empleado.getNombre());
                ingresarDireccionEmpleados.setText(empleado.getDireccion());
                ingresarTelefonoEmpleados.setText(empleado.getTelefono());
                break;
            }
        }

    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       FramePrincipal fPrincipal = new FramePrincipal();
       fPrincipal.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_botonRegresarActionPerformed

    /**
     *
     * Se creó el método para validar el registro para que no se repitan
     * empleados
     */
    private boolean validRegistro(String id) {
        for (Empleados empleado : listaEmpleados) {
            if (empleado.getCodEmpleado().equals(id)) {
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
    private javax.swing.JButton botonRegresar;
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
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatosEmpleadosTabla() {
        controlador.mostrarRegistros(listaEmpleados, modelo2);
    }

}
