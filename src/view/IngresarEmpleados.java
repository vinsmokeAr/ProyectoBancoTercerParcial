/*
* Autor: Arleth Machuca Fabian 406
* fecha de creación: 20 / mayo / 23
*fecha de modificación: 11 / junio / 23
* Descripción: Se creó la interfáz de ingresar empleados.
 */
package view;

import controller.EmpleadoController;
import entity.Empleados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
        botonRegresar = new javax.swing.JButton();
        imgEmpleados = new javax.swing.JLabel();
        cambiarFoto = new javax.swing.JLabel();
        botonImagen = new javax.swing.JButton();
        guardarEmpleados = new javax.swing.JButton();
        eliminarEmpleados = new javax.swing.JButton();
        actualizarEmpleados = new javax.swing.JButton();
        panelNumerodos = new javax.swing.JPanel();
        ingresarRFCempleados = new javax.swing.JTextField();
        ingresarNombreEmpleados = new javax.swing.JTextField();
        ingresarDireccionEmpleados = new javax.swing.JTextField();
        ingresarTelefonoEmpleados = new javax.swing.JTextField();
        empleadoRFC = new javax.swing.JLabel();
        empleadosNombre = new javax.swing.JLabel();
        empleadosDireccion = new javax.swing.JLabel();
        empleadosTelefono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEmpleados.setBackground(new java.awt.Color(4, 92, 76));

        botonRegresar.setBackground(new java.awt.Color(4, 92, 76));
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Regresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        imgEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AvatarEmpleada2.png"))); // NOI18N

        cambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        cambiarFoto.setText("Cambiar fotografía:");

        botonImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CargarFotoUsuario.png"))); // NOI18N
        botonImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonImagenMouseClicked(evt);
            }
        });

        guardarEmpleados.setBackground(new java.awt.Color(4, 92, 76));
        guardarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCaféGuardar.png"))); // NOI18N
        guardarEmpleados.setBorder(null);
        guardarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarEmpleadosMouseClicked(evt);
            }
        });

        eliminarEmpleados.setBackground(new java.awt.Color(4, 92, 76));
        eliminarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCaféEliminar.png"))); // NOI18N
        eliminarEmpleados.setBorder(null);
        eliminarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarEmpleadosMouseClicked(evt);
            }
        });

        actualizarEmpleados.setBackground(new java.awt.Color(4, 92, 76));
        actualizarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonCaféActualizar.png"))); // NOI18N
        actualizarEmpleados.setBorder(null);
        actualizarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarEmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(botonRegresar))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cambiarFoto)
                                .addGap(18, 18, 18)
                                .addComponent(botonImagen))
                            .addComponent(imgEmpleados))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guardarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualizarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(botonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addComponent(imgEmpleados)
                        .addGap(37, 37, 37)
                        .addComponent(cambiarFoto)
                        .addGap(11, 11, 11))
                    .addComponent(botonImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(guardarEmpleados)
                .addGap(29, 29, 29)
                .addComponent(eliminarEmpleados)
                .addGap(29, 29, 29)
                .addComponent(actualizarEmpleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNumerodos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de los empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        ingresarRFCempleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresarNombreEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresarDireccionEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresarTelefonoEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empleadoRFC.setBackground(new java.awt.Color(248, 147, 31));
        empleadoRFC.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        empleadoRFC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        empleadoRFC.setText("Código empleado:");
        empleadoRFC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        empleadosNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        empleadosNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlantillaLabel.png"))); // NOI18N
        empleadosNombre.setText("Nombre:");
        empleadosNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        empleadosDireccion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        empleadosDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DireccionE.png"))); // NOI18N

        empleadosTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TeléfonoE.png"))); // NOI18N

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Empleado", "Nombre", "Teléfono"
            }
        ));
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout panelNumerodosLayout = new javax.swing.GroupLayout(panelNumerodos);
        panelNumerodos.setLayout(panelNumerodosLayout);
        panelNumerodosLayout.setHorizontalGroup(
            panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumerodosLayout.createSequentialGroup()
                .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNumerodosLayout.createSequentialGroup()
                        .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNumerodosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(empleadoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(empleadosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ingresarRFCempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresarNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empleadosTelefono)
                            .addComponent(empleadosDireccion))
                        .addGap(49, 49, 49)
                        .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingresarTelefonoEmpleados)
                            .addComponent(ingresarDireccionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelNumerodosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelNumerodosLayout.setVerticalGroup(
            panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumerodosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empleadoRFC)
                        .addComponent(ingresarRFCempleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empleadosDireccion))
                    .addComponent(ingresarDireccionEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empleadosNombre)
                        .addComponent(ingresarNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNumerodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empleadosTelefono)
                        .addComponent(ingresarTelefonoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        empleadoRFC.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNumerodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNumerodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
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
     * Se creó el método events Mouse Clicked del botón actualizar para que
     * actualice los datos de los empleados
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
     * Se inicializó el método para obtener la información de los empleados
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
     /**
     *
     * Se creó el método para regresar al menú principal
     */
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        FramePrincipal fPrincipal = new FramePrincipal();
        fPrincipal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonRegresarActionPerformed
     
    /**
     *
     * Se creó el método para importar una imagen de usuario
     */
    
    private void botonImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonImagenMouseClicked
        JFileChooser jF = new JFileChooser();
        jF.setMultiSelectionEnabled(false);
        if (jF.showOpenDialog(this) == JFileChooser.APPROVE_OPTION);
        imgEmpleados.setIcon(new ImageIcon(jF.getSelectedFile().toString()));
    }//GEN-LAST:event_botonImagenMouseClicked

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
    private javax.swing.JButton botonImagen;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel cambiarFoto;
    private javax.swing.JButton eliminarEmpleados;
    private javax.swing.JLabel empleadoRFC;
    private javax.swing.JLabel empleadosDireccion;
    private javax.swing.JLabel empleadosNombre;
    private javax.swing.JLabel empleadosTelefono;
    private javax.swing.JButton guardarEmpleados;
    private javax.swing.JLabel imgEmpleados;
    private javax.swing.JTextField ingresarDireccionEmpleados;
    private javax.swing.JTextField ingresarNombreEmpleados;
    private javax.swing.JTextField ingresarRFCempleados;
    private javax.swing.JTextField ingresarTelefonoEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelNumerodos;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
    
    /**
     *
     * Se creó el método para mostrar los datos del cliente en la tabla
     */
    
    private void mostrarDatosEmpleadosTabla() {
        controlador.mostrarRegistros(listaEmpleados, modelo2);
    }

}
