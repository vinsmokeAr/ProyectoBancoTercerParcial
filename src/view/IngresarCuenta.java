/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 09 / junio / 23
* Fecha de modificación: 11 / junio / 23
* Descripción: Se creó un jDialog para ingresar las cuentas y el monto inicial 
* de un cliente.
*/
package view;

public class IngresarCuenta extends javax.swing.JDialog {


    public IngresarCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    IngresarCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArriba = new javax.swing.JPanel();
        CabeceraBanco = new javax.swing.JLabel();
        tipoDeCuenta = new javax.swing.JLabel();
        montoInicial = new javax.swing.JLabel();
        elegirCuenta = new javax.swing.JComboBox<>();
        ingresarMonto = new javax.swing.JTextField();
        agregarCuentaC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelArriba.setBackground(new java.awt.Color(4, 92, 76));

        CabeceraBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BancoB.png"))); // NOI18N

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CabeceraBanco)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CabeceraBanco)
        );

        tipoDeCuenta.setForeground(new java.awt.Color(255, 255, 255));
        tipoDeCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TipoC.png"))); // NOI18N

        montoInicial.setForeground(new java.awt.Color(255, 255, 255));
        montoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MontoInicial.png"))); // NOI18N

        elegirCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta ahorro", "Cuenta corriente", "Cuenta nómina", " " }));

        agregarCuentaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agregar.png"))); // NOI18N
        agregarCuentaC.setBorder(null);
        agregarCuentaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCuentaCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoDeCuenta)
                    .addComponent(montoInicial))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elegirCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(agregarCuentaC))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoDeCuenta)
                    .addComponent(elegirCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(agregarCuentaC)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     /**
     *
     * Se creó el método para agregar un tipo de cuenta al cliente 
     */
    private void agregarCuentaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCuentaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarCuentaCActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IngresarCuenta dialog = new IngresarCuenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CabeceraBanco;
    private javax.swing.JButton agregarCuentaC;
    private javax.swing.JComboBox<String> elegirCuenta;
    private javax.swing.JTextField ingresarMonto;
    private javax.swing.JLabel montoInicial;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JLabel tipoDeCuenta;
    // End of variables declaration//GEN-END:variables
}
