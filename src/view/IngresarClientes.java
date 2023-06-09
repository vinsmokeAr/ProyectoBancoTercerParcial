/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 17 / mayo / 23
* Fecha de modificación: 23 / mayo / 23
* Descripción: Se creó el Frame para ingresar clientes.
 */
package view;

import entity.Cliente;
import java.util.List;
import java.util.ArrayList;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.*;
import javax.swing.JOptionPane;

public class IngresarClientes extends javax.swing.JFrame {

    ClienteController controlador = new ClienteController();
    private List<Cliente> listaCliente = new ArrayList<>();
    private final DefaultTableModel modelo2;
    String rfcActual;

    /**
     * Se inicializó el método cliente
     */
    public IngresarClientes() {
        initComponents();
        modelo2 = (DefaultTableModel) jTable2.getModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        rfc = new javax.swing.JLabel();
        ingresarRFC = new javax.swing.JTextField();
        nombreCliente = new javax.swing.JLabel();
        ingresarNombre = new javax.swing.JTextField();
        direccionCliente = new javax.swing.JLabel();
        ingresarDireccion = new javax.swing.JTextField();
        telefonoCliente = new javax.swing.JLabel();
        ingresarTelefono = new javax.swing.JTextField();
        guardarCliente = new javax.swing.JButton();
        eliminarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botonActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCliente.setBackground(new java.awt.Color(255, 204, 102));
        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro ExtraLight", 3, 18))); // NOI18N

        rfc.setText("RFC:");

        nombreCliente.setText("Nombre:");

        direccionCliente.setText("Dirección:");

        telefonoCliente.setText("Teléfono:");

        guardarCliente.setText("Guardar");
        guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarClienteActionPerformed(evt);
            }
        });

        eliminarCliente.setText("Eliminar");
        eliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarClienteMouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RFC", "Nombre", "Teléfono"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BancoDelBienestar_logoHor (1).png"))); // NOI18N

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addComponent(guardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreCliente)
                                    .addComponent(rfc))
                                .addGap(18, 18, 18)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresarRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(telefonoCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(ingresarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(direccionCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(ingresarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(82, 82, 82))))))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rfc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingresarRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionCliente)
                    .addComponent(ingresarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreCliente)
                    .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ingresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonoCliente)
                        .addComponent(ingresarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCliente)
                    .addComponent(eliminarCliente)
                    .addComponent(botonActualizar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * Se creó el método para actualizar los clie
     */
    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
       Cliente clientes = new Cliente(this.ingresarRFC.getText(),
                this.ingresarNombre.getText(),
                this.ingresarTelefono.getText(),
                this.ingresarDireccion.getText());

        controlador.modificarRegistro(clientes);
        mostrarDatosClienteTabla();
    }//GEN-LAST:event_botonActualizarActionPerformed
   
    /**
     *
     * Se creó el método eliminar clientes
     */
    
    private void eliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarClienteMouseClicked
        String RFC = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
        controlador.eliminarRegistro(RFC);
        mostrarDatosClienteTabla();
    }//GEN-LAST:event_eliminarClienteMouseClicked
   
    /**
     *
     * se creó el método
     */
    
    private void guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarClienteActionPerformed
          if (validRegistro(ingresarRFC.getText())) {
            Cliente cliente = new Cliente(this.ingresarRFC.getText(),
                    this.ingresarNombre.getText(),
                    this.ingresarTelefono.getText(),
                    this.ingresarDireccion.getText());

//            Aqui guarda
            controlador.agregarRegistro(cliente);
            mostrarDatosClienteTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Este empleado ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_guardarClienteActionPerformed
    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        rfcActual = jTable2.getValueAt(jTable2.getSelectedRow(), 0)
                .toString();
        for (Cliente cliente : listaCliente) {
            if (cliente.getRFC().equals(rfcActual)) {
                ingresarRFC.setText(cliente.getRFC());
                ingresarNombre.setText(cliente.getNombre());
                ingresarDireccion.setText(cliente.getDireccion());
                ingresarTelefono.setText(cliente.getTelefono());
                break;
            }
        }

    }//GEN-LAST:event_jTable2MouseClicked

     private boolean validRegistro(String id) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getRFC().equals(id)) {
                return false;
            }
        }
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JLabel direccionCliente;
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JButton guardarCliente;
    private javax.swing.JTextField ingresarDireccion;
    private javax.swing.JTextField ingresarNombre;
    private javax.swing.JTextField ingresarRFC;
    private javax.swing.JTextField ingresarTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JLabel rfc;
    private javax.swing.JLabel telefonoCliente;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatosClienteTabla() {
       controlador.mostrarRegistros(modelo2);
    }
}
