package sqlite_netflix;

import javax.swing.*;
//import Netflix.Netflix;
//import Netflix.Giris;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Giris extends javax.swing.JFrame {

    public static String username="";
    public Giris() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        OturumAc2 = new javax.swing.JButton();
        Kayit_Ol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField_Username.setText("E - Posta ");
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Username);
        jTextField_Username.setBounds(738, 388, 388, 50);

        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_password.setText("Sifre");
        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField_password);
        jPasswordField_password.setBounds(738, 448, 388, 50);

        OturumAc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/OturumAc2.JPG"))); // NOI18N
        OturumAc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OturumAc2ActionPerformed(evt);
            }
        });
        getContentPane().add(OturumAc2);
        OturumAc2.setBounds(738, 508, 388, 40);

        Kayit_Ol.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Kayit_Ol.setText("Hesap Oluştur");
        Kayit_Ol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayit_OlActionPerformed(evt);
            }
        });
        getContentPane().add(Kayit_Ol);
        Kayit_Ol.setBounds(850, 690, 190, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/netflix_giris.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, -30, 1920, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void OturumAc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OturumAc2ActionPerformed
        //Netflix n = new Netflix();
        //Giris g = new Giris();
        //n.conn=null;
        PreparedStatement pst_giris;
        ResultSet rs;
        username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField_password.getPassword());
        //String query = "SELECT * FROM kullanici WHERE Kullanici_ad =  '" + username +"'  AND sifre = '"+password+"'";
        String query = "SELECT * FROM kullanici WHERE email = ? AND sifre = ?";
        
        try {
            
            pst_giris=Sqlite_netflix.conn.prepareStatement(query);
            pst_giris.setString(1,username);
            pst_giris.setString(2,password);
            rs = pst_giris.executeQuery();
            
            if(rs.next())
            {
                this.dispose();
                new Oturum().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username / Password","Login Error",2);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(Giris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_OturumAc2ActionPerformed

    private void Kayit_OlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayit_OlActionPerformed
        this.dispose();
        new kayit().setVisible(true);
        //PreparedStatement pst_kayit;
        //ResultSet rs;
        
    }//GEN-LAST:event_Kayit_OlActionPerformed

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
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kayit_Ol;
    private javax.swing.JButton OturumAc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
