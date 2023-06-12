/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 19 / mayo / 23
* Fecha de modificación: 11 / junio / 23
* Descripción: Se creó el Frame para el Frame Principal.
 */
package view;

public class FramePrincipal extends javax.swing.JFrame {

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

        registrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RegustrarClientes.png"))); // NOI18N
        registrarClientes.setBorder(null);
        registrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClientesActionPerformed(evt);
            }
        });
        loginPanel.add(registrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 130, 40));

        ingresarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RegistrarE.png"))); // NOI18N
        ingresarEmpleados.setBorder(null);
        ingresarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarEmpleadosActionPerformed(evt);
            }
        });
        loginPanel.add(ingresarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        salirPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SalirP.png"))); // NOI18N
        salirPrincipal.setBorder(null);
        salirPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirPrincipalMouseClicked(evt);
            }
        });
        loginPanel.add(salirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 130, -1));

        logoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credencial.png"))); // NOI18N
        loginPanel.add(logoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 70));

        logoEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RegistrarEmpleados.png"))); // NOI18N
        loginPanel.add(logoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        logoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        loginPanel.add(logoSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        LabelInicioBienestar.setBackground(new java.awt.Color(255, 255, 255));
        LabelInicioBienestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        loginPanel.add(LabelInicioBienestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    /**
     * Se creó el método que dirigirá al Frame para registrar clientes
     */
    
    private void registrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClientesActionPerformed
        IngresarClientes iClientes = new IngresarClientes();
        iClientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarClientesActionPerformed
   
    /**
     * Se creó el método que dirigirá al Frame para registrar empleados
     */
    
    private void ingresarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarEmpleadosActionPerformed
        IngresarEmpleados iEmpleados = new IngresarEmpleados();
        iEmpleados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ingresarEmpleadosActionPerformed
    
    /**
     * Se creó el método que dirigirá al Frame para salir del programa
     */
    
    private void salirPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPrincipalMouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_salirPrincipalMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
