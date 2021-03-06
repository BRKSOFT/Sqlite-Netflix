/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite_netflix;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author berka
 */
public class Oturum extends javax.swing.JFrame {

    /**
     * Creates new form Oturum
     */
    public Oturum() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_Programlari_Listele = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton_Filme_Gore = new javax.swing.JButton();
        jButton_Program_Izle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Program Adı", "Tip", "Uzunluk", "Bölüm Sayısı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 140, 1286, 548);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aramak İstediğin Filmin Adını Gir");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 261, 247, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("İZLEMEK İSTEDİĞİN TÜRÜ SEÇ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(28, 455, 247, 35);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(28, 330, 247, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(28, 522, 247, 30);

        jButton_Programlari_Listele.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Programlari_Listele.setText("Tüm Programları Listele");
        jButton_Programlari_Listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Programlari_ListeleActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Programlari_Listele);
        jButton_Programlari_Listele.setBounds(28, 685, 247, 81);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Seçtiğin türdeki filmleri listele");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(28, 585, 247, 33);

        jButton_Filme_Gore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Filme_Gore.setText("Filmi Ara");
        jButton_Filme_Gore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Filme_GoreActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Filme_Gore);
        jButton_Filme_Gore.setBounds(28, 398, 247, 25);

        jButton_Program_Izle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Program_Izle.setText("İzleme Ekranına Geç");
        jButton_Program_Izle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Program_IzleActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Program_Izle);
        jButton_Program_Izle.setBounds(1471, 760, 240, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("İzlemek İstediğin Programı Seç");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 750, 216, 90);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(690, 760, 227, 80);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(1187, 760, 230, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Bölümleri Getir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(935, 760, 210, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/oturum_son.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Programlari_ListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Programlari_ListeleActionPerformed
        showTableData();
        
    }//GEN-LAST:event_jButton_Programlari_ListeleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String value = (String)jComboBox1.getSelectedItem();
            //String sql = "SELECT *FROM programtur where tur_ismi = '" + value +"'" ;
            String sql = "SELECT program_ismi,tur_ismi FROM programtur where tur_ismi = '" + value +"'" ;
            PreparedStatement pst = Sqlite_netflix.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_Filme_GoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Filme_GoreActionPerformed
        try{
            String value = (String)jTextField1.getText();
            String sql = "SELECT *FROM program where program_adi = '" + value +"'" ;
            PreparedStatement pst = Sqlite_netflix.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton_Filme_GoreActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton_Program_IzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Program_IzleActionPerformed
        new FilmIzle().setVisible(true);
    }//GEN-LAST:event_jButton_Program_IzleActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String izlenecek_program = jTextField2.getText();
        String query = "SELECT bolum_sayisi from program where program_adi = '"+izlenecek_program+"';";
        Statement stmt=null;
        int bolumSayisi=0;
        try {
            stmt = Sqlite_netflix.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                bolumSayisi =  rs.getInt("bolum_sayisi");   
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Oturum.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0 ; i<bolumSayisi ; i++){
            jComboBox3.addItem(Integer.toString(i+1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void showTableData(){
        try{
            String sql = "SELECT program_adi,tip,uzunluk,bolum_sayisi,rate FROM program group by rate order by rate desc";
            PreparedStatement pst = Sqlite_netflix.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            //System.out.println("Error : " + e);        
            JOptionPane.showMessageDialog(null,e);
        }
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
            java.util.logging.Logger.getLogger(Oturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oturum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oturum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Filme_Gore;
    private javax.swing.JButton jButton_Program_Izle;
    private javax.swing.JButton jButton_Programlari_Listele;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
