
package view;

import javax.swing.ImageIcon;


public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicio
     */
    public FramePrincipal() {
        initComponents();
        



    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        registrarClientes = new javax.swing.JButton();
        ingresarEmpleados = new javax.swing.JButton();
        salirPrincipal = new javax.swing.JButton();
        logoClientes = new javax.swing.JLabel();
        logoEmpleados = new javax.swing.JLabel();
        logoSalir = new javax.swing.JLabel();
        LabelInicioBienestar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarClientes.setBackground(new java.awt.Color(238, 226, 201));
        registrarClientes.setText("Registrar clientes");
        registrarClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClientesActionPerformed(evt);
            }
        });
        loginPanel.add(registrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, 50));

        ingresarEmpleados.setBackground(new java.awt.Color(238, 226, 201));
        ingresarEmpleados.setText("Registrar empleados");
        ingresarEmpleados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingresarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarEmpleadosActionPerformed(evt);
            }
        });
        loginPanel.add(ingresarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 210, 50));

        salirPrincipal.setBackground(new java.awt.Color(238, 226, 201));
        salirPrincipal.setText("Salir");
        salirPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginPanel.add(salirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 210, 50));

        logoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credencial.png"))); // NOI18N
        loginPanel.add(logoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, 60));

        logoEmpleados.setText("skjdf");
        loginPanel.add(logoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        logoSalir.setText("jLabel1");
        loginPanel.add(logoSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        LabelInicioBienestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        loginPanel.add(LabelInicioBienestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarClientesActionPerformed

    private void ingresarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelInicioBienestar;
    private javax.swing.JButton ingresarEmpleados;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoClientes;
    private javax.swing.JLabel logoEmpleados;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JButton registrarClientes;
    private javax.swing.JButton salirPrincipal;
    // End of variables declaration//GEN-END:variables
}
