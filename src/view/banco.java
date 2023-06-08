//Arleth Machuca Fabian
package view;

public class banco extends javax.swing.JFrame {

 
    public banco() {
        initComponents();
        this.setTitle("BANCO BIENESTAR");
        this.setLocationRelativeTo(null); // Centra la intefaz enmedio de la pantalla.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NombreCliente = new javax.swing.JLabel();
        IngresarNombre = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        ingresarTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        clienteNombre = new javax.swing.JLabel();
        cuentaNClienteBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tipocuentabox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BancoDelBienestar_logoHor (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, 80));

        jPanel1.setBackground(new java.awt.Color(239, 225, 141));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreCliente.setText("Nombre:");
        jPanel1.add(NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        IngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarNombreActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, -1));

        telefono.setText("Teléfono:");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(ingresarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));

        jLabel1.setText("Dirección:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, 30));

        jButton1.setText("Agregar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 270, 210));

        jPanel2.setBackground(new java.awt.Color(239, 225, 141));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CUENTA"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clienteNombre.setText("Cliente:");
        jPanel2.add(clienteNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cuentaNClienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cuentaNClienteBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaNClienteBoxActionPerformed(evt);
            }
        });
        jPanel2.add(cuentaNClienteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, -1));

        jLabel2.setText("Tipo de cuenta:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        tipocuentabox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(tipocuentabox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 280, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("MOVIMIENTOS"));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 980, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE CONSULTA")));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 350, 240));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 520, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarNombreActionPerformed
      
    }//GEN-LAST:event_IngresarNombreActionPerformed

    private void cuentaNClienteBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaNClienteBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuentaNClienteBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IngresarNombre;
    private javax.swing.JLabel NombreCliente;
    private javax.swing.JLabel clienteNombre;
    private javax.swing.JComboBox<String> cuentaNClienteBox;
    private javax.swing.JTextField ingresarTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel telefono;
    private javax.swing.JComboBox<String> tipocuentabox;
    // End of variables declaration//GEN-END:variables
}
