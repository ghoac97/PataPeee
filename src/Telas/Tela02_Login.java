/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Denise Trevizo (usp)
 */
public class Tela02_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Tela02_Login() {
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

        painelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entrarLogin = new javax.swing.JButton();
        senhaLogin = new javax.swing.JPasswordField();
        logoLogin1 = new Telas.logoLogin();
        cancelarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha");

        entrarLogin.setBackground(new java.awt.Color(30, 0, 45));
        entrarLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        entrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        entrarLogin.setText("Entrar");
        entrarLogin.setBorderPainted(false);
        entrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarLoginActionPerformed(evt);
            }
        });

        senhaLogin.setText("jPasswordField1");

        logoLogin1.setImg(new ImageIcon("C:/Users/denis/Documents/NetBeansProjects/PataPe/src/main/java/img/logoPatape.jpg"));
        logoLogin1.setOpaque(false);

        javax.swing.GroupLayout logoLogin1Layout = new javax.swing.GroupLayout(logoLogin1);
        logoLogin1.setLayout(logoLogin1Layout);
        logoLogin1Layout.setHorizontalGroup(
            logoLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        logoLogin1Layout.setVerticalGroup(
            logoLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        cancelarLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelarLogin.setForeground(new java.awt.Color(204, 0, 0));
        cancelarLogin.setText("Cancelar");
        cancelarLogin.setContentAreaFilled(false);
        cancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addComponent(cancelarLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entrarLogin))
                            .addGroup(painelLoginLayout.createSequentialGroup()
                                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(usuarioLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senhaLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(logoLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarLoginActionPerformed
        // Acesso Gerência
        if (usuarioLogin.getText().equals("gerencia") && senhaLogin.getText().equals("senhaGerencia")){
            Tela03_B_HomeGerencia telaHomeGerencia = new Tela03_B_HomeGerencia();
            telaHomeGerencia.setVisible(true);
            dispose();
        }       
        // Acesso Atendimento
        else if (usuarioLogin.getText().equals("atendimento") && senhaLogin.getText().equals("senhaAtendimento")){
            Tela03_A_HomeAtendimento telaHomeAtendimento = new Tela03_A_HomeAtendimento();
            telaHomeAtendimento.setVisible(true);
            dispose();
        }      
        // Acesso Caixa
        else if (usuarioLogin.getText().equals("caixa") && senhaLogin.getText().equals("senhaCaixa")){
            Tela03_C_HomeCaixa telaHomeCaixa = new Tela03_C_HomeCaixa();
            telaHomeCaixa.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Acesso negado.");
        }
    }//GEN-LAST:event_entrarLoginActionPerformed

    private void cancelarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLoginActionPerformed
        Tela01_Home telaHome = new Tela01_Home();
        telaHome.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Tela02_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela02_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela02_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela02_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela02_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarLogin;
    private javax.swing.JButton entrarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Telas.logoLogin logoLogin1;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField senhaLogin;
    private javax.swing.JTextField usuarioLogin;
    // End of variables declaration//GEN-END:variables
}