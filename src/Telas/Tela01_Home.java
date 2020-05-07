package Telas;

import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Denise Trevizo (usp)
 */
public class Tela01_Home extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Tela01_Home() {
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

        jPanel1 = new javax.swing.JPanel();
        gerenciaHome = new javax.swing.JButton();
        atendimentoHome = new javax.swing.JButton();
        caixaHome = new javax.swing.JButton();
        logoLogin1 = new Telas.logoLogin();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(603, 412));

        gerenciaHome.setBackground(new java.awt.Color(254, 248, 232));
        gerenciaHome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        gerenciaHome.setForeground(new java.awt.Color(67, 1, 101));
        gerenciaHome.setText("Gerência");
        gerenciaHome.setBorder(null);
        gerenciaHome.setBorderPainted(false);
        gerenciaHome.setFocusPainted(false);
        gerenciaHome.setOpaque(false);
        gerenciaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciaHomeActionPerformed(evt);
            }
        });

        atendimentoHome.setBackground(new java.awt.Color(254, 248, 232));
        atendimentoHome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        atendimentoHome.setForeground(new java.awt.Color(67, 1, 101));
        atendimentoHome.setText("Atendimento");
        atendimentoHome.setBorder(null);
        atendimentoHome.setBorderPainted(false);
        atendimentoHome.setFocusPainted(false);
        atendimentoHome.setOpaque(false);
        atendimentoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendimentoHomeActionPerformed(evt);
            }
        });

        caixaHome.setBackground(new java.awt.Color(254, 248, 232));
        caixaHome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        caixaHome.setForeground(new java.awt.Color(67, 1, 101));
        caixaHome.setText("Caixa");
        caixaHome.setBorder(null);
        caixaHome.setBorderPainted(false);
        caixaHome.setFocusPainted(false);
        caixaHome.setOpaque(false);
        caixaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaHomeActionPerformed(evt);
            }
        });

        logoLogin1.setImg(new ImageIcon("C:/Users/denis/Documents/NetBeansProjects/PataPe/src/main/java/img/logoPatapeCinza.jpg"));
        logoLogin1.setOpaque(false);

        javax.swing.GroupLayout logoLogin1Layout = new javax.swing.GroupLayout(logoLogin1);
        logoLogin1.setLayout(logoLogin1Layout);
        logoLogin1Layout.setHorizontalGroup(
            logoLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        logoLogin1Layout.setVerticalGroup(
            logoLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(gerenciaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atendimentoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caixaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(logoLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logoLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(atendimentoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gerenciaHome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciaHomeActionPerformed
        Tela02_Login telaLogin = new Tela02_Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_gerenciaHomeActionPerformed

    private void atendimentoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendimentoHomeActionPerformed
        Tela02_Login telaLogin = new Tela02_Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_atendimentoHomeActionPerformed

    private void caixaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaHomeActionPerformed
        Tela02_Login telaLogin = new Tela02_Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_caixaHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Tela01_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela01_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela01_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela01_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela01_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atendimentoHome;
    private javax.swing.JButton caixaHome;
    private javax.swing.JButton gerenciaHome;
    private javax.swing.JPanel jPanel1;
    private Telas.logoLogin logoLogin1;
    // End of variables declaration//GEN-END:variables
}
