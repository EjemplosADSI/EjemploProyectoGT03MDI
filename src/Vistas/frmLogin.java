/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Vistas.Components.RoundJXTextField;
import Vistas.Components.RoundJPasswordField;
import Vistas.Components.RoundedPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Instructor
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jpnPanelPrincipal = new RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jxtfUsuario = new RoundJXTextField();
        jxbtnIngresar = new org.jdesktop.swingx.JXButton();
        jLabel3 = new javax.swing.JLabel();
        jpfContrasena = new RoundJPasswordField();
        jxbtnSalir = new org.jdesktop.swingx.JXButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(230, 230, 230));
        kGradientPanel1.setkEndColor(new java.awt.Color(200, 80, 192));
        kGradientPanel1.setkStartColor(new java.awt.Color(65, 88, 208));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jpnPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpnPanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Iniciar Sesion");

        jxtfUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jxtfUsuario.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jxtfUsuario.setPrompt("Usuario");
        jxtfUsuario.setPromptBackround(new java.awt.Color(204, 204, 204));

        jxbtnIngresar.setBackground(new java.awt.Color(87, 184, 70));
        jxbtnIngresar.setText("Ingresar");
        jxbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxbtnIngresarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Recursos/Imagenes/loginImage.png"))); // NOI18N

        jpfContrasena.setBackground(new java.awt.Color(204, 204, 204));
        jpfContrasena.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N

        jxbtnSalir.setBackground(new java.awt.Color(87, 184, 70));
        jxbtnSalir.setText("Salir");
        jxbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxbtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPanelPrincipalLayout = new javax.swing.GroupLayout(jpnPanelPrincipal);
        jpnPanelPrincipal.setLayout(jpnPanelPrincipalLayout);
        jpnPanelPrincipalLayout.setHorizontalGroup(
            jpnPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(jpnPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jpfContrasena)
                    .addComponent(jxtfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jxbtnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jxbtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jpnPanelPrincipalLayout.setVerticalGroup(
            jpnPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPanelPrincipalLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jxtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jxbtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jxbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jpnPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jpnPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, 880, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, 656, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jxbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxbtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jxbtnSalirActionPerformed

    private void jxbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxbtnIngresarActionPerformed
        // TODO add your handling code here:
        String Usuario = jxtfUsuario.getText();
        String Contrasena = String.valueOf(jpfContrasena.getPassword());
        ImageIcon icon = new ImageIcon("src\\Vistas\\Recursos\\ImagenesuserError.png");
        if(Usuario.equals("Admin") && Contrasena.equals("123")){
            
        }else{
            JOptionPane.showMessageDialog(null, "Datos de acceso erroneos", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jxbtnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jpfContrasena;
    private javax.swing.JPanel jpnPanelPrincipal;
    private org.jdesktop.swingx.JXButton jxbtnIngresar;
    private org.jdesktop.swingx.JXButton jxbtnSalir;
    private org.jdesktop.swingx.JXTextField jxtfUsuario;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}