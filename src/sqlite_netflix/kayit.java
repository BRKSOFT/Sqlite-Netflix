package sqlite_netflix;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class kayit extends javax.swing.JFrame {

    /**
     * Creates new form kayit
     */
    public kayit() {
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

        jTextField_Kayit_Mail = new javax.swing.JTextField();
        jTextField_Kayit_UserName = new javax.swing.JTextField();
        jPasswordField_Kayit = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField_Kayit_Mail.setText("E - Posta");
        getContentPane().add(jTextField_Kayit_Mail);
        jTextField_Kayit_Mail.setBounds(665, 174, 590, 77);

        jTextField_Kayit_UserName.setText("Kullanici Adi");
        getContentPane().add(jTextField_Kayit_UserName);
        jTextField_Kayit_UserName.setBounds(665, 268, 590, 77);

        jPasswordField_Kayit.setText("1234");
        jPasswordField_Kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_KayitActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField_Kayit);
        jPasswordField_Kayit.setBounds(665, 361, 590, 77);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(665, 456, 590, 77);

        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/checkbox.JPG"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(660, 550, 50, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("KAYIT OL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 800, 595, 77);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LUTFEN İSTEDİĞİNİZ 3 FARKLI PROGRAM TÜRÜNÜ SEÇİNİZ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 630, 560, 40);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/MAVİ.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 620, 600, 70);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(660, 700, 600, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(660, 730, 600, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(660, 760, 600, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 160, 440, 90);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 290, 440, 80);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(130, 470, 440, 80);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(130, 570, 440, 90);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(1370, 300, 390, 90);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(1370, 420, 390, 90);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/OturumAc.JPG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1740, 30, 180, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 120, 440, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 430, 430, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1370, 250, 390, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sqlite_netflix/kayitol2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1063);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_KayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_KayitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_KayitActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jPasswordField_Kayit.setEchoChar((char)0);
        }
        else{
            jPasswordField_Kayit.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Statement stmt=null;
        try {
            stmt = Sqlite_netflix.conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(kayit.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mail_kayit = jTextField_Kayit_Mail.getText();
        String username_kayit = jTextField_Kayit_UserName.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dogum_tarihi_kayit = dateFormat.format(jDateChooser1.getDate());
        String password_kayit = String.valueOf(jPasswordField_Kayit.getPassword());
        String comboBox1 = (String)jComboBox1.getSelectedItem();
        String comboBox2 = (String)jComboBox2.getSelectedItem();
        String comboBox3 = (String)jComboBox3.getSelectedItem();
        //String insert = "INSERT INTO kullanici VALUES('"+username_kayit+"','"+mail_kayit+"','"+password_kayit+"','"+dogum_tarihi_kayit+"');";
        String insert = "INSERT INTO kullanici VALUES('"+username_kayit+"','"+mail_kayit+"','"+password_kayit+"','"+dogum_tarihi_kayit+"','"+comboBox1+"','"+comboBox2+"','"+comboBox3+"');";
        try {
            stmt.executeUpdate(insert);
            //insert.setString(1,username_kayit);
        } catch (SQLException ex) {
            Logger.getLogger(kayit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*select program_adi from program inner join programtur on programtur.program_ismi=program.program_adi where program.rate in (Select distinct rate from program Order By rate desc Limit 1 offset 4) and programtur.tur_ismi='Aksiyon ve Macera'*/
        
        /*String sorgu = "select program_adi from program inner join programtur on programtur.program_ismi=program.program_adi where program.rate in (Select distinct rate from program Order By rate desc Limit 1 offset 4) and programtur.tur_ismi='Aksiyon ve Macera'";
        Statement stm=null;
        ResultSet rs=null;
        String sonuc="";
        try {
            stm = Sqlite_netflix.conn.createStatement();
            rs = stm.executeQuery(sorgu);
            while(rs.next()){
                sonuc = rs.getString("program_adi");
            }
            
        }
        catch(Exception e ){
            System.out.println("basarisiz");
        }
        System.out.println(sonuc);
        */
        /*ArrayList<String> liste1;
        liste1 = new ArrayList<String>();
        for(int i=0 ; i<74 ; i++){
            String sorgu = "select program_adi from program inner join programtur on programtur.program_ismi=program.program_adi where program.rate in (Select distinct rate from program Order By rate desc Limit 1 offset "+i+") and programtur.tur_ismi='Aksiyon ve Macera'";
            Statement stm=null;
            ResultSet rs=null;
            String sonuc="";
            try {
                stm = Sqlite_netflix.conn.createStatement();
                rs = stm.executeQuery(sorgu);
                while(rs.next()){
                    sonuc = rs.getString("program_adi");
                }

            }
            catch(Exception e ){
                System.out.println("basarisiz");
            }
            //System.out.println(sonuc);
            if(sonuc!="")
                liste1.add(sonuc);
            if(liste1.size()>=2)
                break;
        }
        System.out.println("\n\n");
        for(int i=0 ; i<liste1.size() ; i++){
            System.out.println("liste["+i+"] : " + liste1.get(i));
        }*/
        ArrayList<String> liste1=enyuksekratebul("Aksiyon ve Macera");
        ArrayList<String> liste2=enyuksekratebul("Belgesel");
        ArrayList<String> liste3=enyuksekratebul("Bilim Kurgu ve Fantastik Yapımlar");
        ArrayList<String> liste4=enyuksekratebul("Bilim ve Doğa");
        ArrayList<String> liste5=enyuksekratebul("Çocuk ve Aile");
        ArrayList<String> liste6=enyuksekratebul("Drama");
        ArrayList<String> liste7=enyuksekratebul("Gerilim");
        ArrayList<String> liste8=enyuksekratebul("Komedi");
        ArrayList<String> liste9=enyuksekratebul("Korku");
        ArrayList<String> liste10=enyuksekratebul("Reality Program");
        ArrayList<String> liste11=enyuksekratebul("Romantik");
            
        
        if(comboBox1.equals("Aksiyon ve Macera")){
            jTextArea1.setText(liste1.get(0));
            jTextArea2.setText(liste1.get(1));
            jLabel4.setText("Aksiyon ve Macera");
        }
        else if(comboBox1.equals("Belgesel")){
            jTextArea1.setText(liste2.get(0));
            jTextArea2.setText(liste2.get(1));
            jLabel4.setText("Belgesel");
        }
        else if(comboBox1.equals("Bilim Kurgu ve Fantastik Yapımlar")){
            jTextArea1.setText(liste3.get(0));
            jTextArea2.setText(liste3.get(1));
            jLabel4.setText("Bilim Kurgu ve Fantastik Yapımlar");
        }
        else if(comboBox1.equals("Bilim ve Doğa")){
            jTextArea1.setText(liste4.get(0));
            jTextArea2.setText(liste4.get(1));
            jLabel4.setText("Bilim ve Doğa");
        }
        else if(comboBox1.equals("Çocuk ve Aile")){
            jTextArea1.setText(liste5.get(0));
            jTextArea2.setText(liste5.get(1));
            jLabel4.setText("Çocuk ve Aile");
        }
        else if(comboBox1.equals("Drama")){
            jTextArea1.setText(liste6.get(0));
            jTextArea2.setText(liste6.get(1));
            jLabel4.setText("Drama");
        }
        else if(comboBox1.equals("Gerilim")){
            jTextArea1.setText(liste7.get(0));
            jTextArea2.setText(liste7.get(1));
            jLabel4.setText("Gerilim");
        }
        else if(comboBox1.equals("Komedi")){
            jTextArea1.setText(liste8.get(0));
            jTextArea2.setText(liste8.get(1));
            jLabel4.setText("Komedi");
        }
        else if(comboBox1.equals("Korku")){
            jTextArea1.setText(liste9.get(0));
            jTextArea2.setText(liste9.get(1));
            jLabel4.setText("Korku");
        }
        else if(comboBox1.equals("Reality Program")){
            jTextArea1.setText(liste10.get(0));
            jTextArea2.setText(liste10.get(1));
            jLabel4.setText("Reality Program");
        }
        else if(comboBox1.equals("Romantik")){
            jTextArea1.setText(liste11.get(0));
            jTextArea2.setText(liste11.get(1));
            jLabel4.setText("Romantik");
        }
        
        if(comboBox2.equals("Aksiyon ve Macera")){
            jTextArea3.setText(liste1.get(0));
            jTextArea4.setText(liste1.get(1));
            jLabel5.setText("Aksiyon ve Macera");
        }
        else if(comboBox2.equals("Belgesel")){
            jTextArea3.setText(liste2.get(0));
            jTextArea4.setText(liste2.get(1));
            jLabel5.setText("Belgesel");
        }
        else if(comboBox2.equals("Bilim Kurgu ve Fantastik Yapımlar")){
            jTextArea3.setText(liste3.get(0));
            jTextArea4.setText(liste3.get(1));
            jLabel5.setText("Bilim Kurgu ve Fantastik Yapımlar");
        }
        else if(comboBox2.equals("Bilim ve Doğa")){
            jTextArea3.setText(liste4.get(0));
            jTextArea4.setText(liste4.get(1));
            jLabel5.setText("Bilim ve Doğa");
        }
        else if(comboBox2.equals("Çocuk ve Aile")){
            jTextArea3.setText(liste5.get(0));
            jTextArea4.setText(liste5.get(1));
            jLabel5.setText("Çocuk ve Aile");
        }
        else if(comboBox2.equals("Drama")){
            jTextArea3.setText(liste6.get(0));
            jTextArea4.setText(liste6.get(1));
            jLabel5.setText("Drama");
        }
        else if(comboBox2.equals("Gerilim")){
            jTextArea3.setText(liste7.get(0));
            jTextArea4.setText(liste7.get(1));
            jLabel5.setText("Gerilim");
        }
        else if(comboBox2.equals("Komedi")){
            jTextArea3.setText(liste8.get(0));
            jTextArea4.setText(liste8.get(1));
            jLabel5.setText("Komedi");
        }
        else if(comboBox2.equals("Korku")){
            jTextArea3.setText(liste9.get(0));
            jTextArea4.setText(liste9.get(1));
            jLabel5.setText("Korku");
        }
        else if(comboBox2.equals("Reality Program")){
            jTextArea3.setText(liste10.get(0));
            jTextArea4.setText(liste10.get(1));
            jLabel5.setText("Reality Program");
        }
        else if(comboBox2.equals("Romantik")){
            jTextArea3.setText(liste11.get(0));
            jTextArea4.setText(liste11.get(1));
            jLabel5.setText("Romantik");
        }
        
        if(comboBox3.equals("Aksiyon ve Macera")){
            jTextArea5.setText(liste1.get(0));
            jTextArea6.setText(liste1.get(1));
            jLabel6.setText("Aksiyon ve Macera");
        }
        else if(comboBox3.equals("Belgesel")){
            jTextArea5.setText(liste2.get(0));
            jTextArea6.setText(liste2.get(1));
            jLabel6.setText("Belgesel");
        }
        else if(comboBox3.equals("Bilim Kurgu ve Fantastik Yapımlar")){
            jTextArea5.setText(liste3.get(0));
            jTextArea6.setText(liste3.get(1));
            jLabel6.setText("Bilim Kurgu ve Fantastik Yapımlar");
        }
        else if(comboBox3.equals("Bilim ve Doğa")){
            jTextArea5.setText(liste4.get(0));
            jTextArea6.setText(liste4.get(1));
            jLabel6.setText("Bilim ve Doğa");
        }
        else if(comboBox3.equals("Çocuk ve Aile")){
            jTextArea5.setText(liste5.get(0));
            jTextArea6.setText(liste5.get(1));
            jLabel6.setText("Çocuk ve Aile");
        }
        else if(comboBox3.equals("Drama")){
            jTextArea5.setText(liste6.get(0));
            jTextArea6.setText(liste6.get(1));
            jLabel6.setText("Drama");
        }
        else if(comboBox3.equals("Gerilim")){
            jTextArea5.setText(liste7.get(0));
            jTextArea6.setText(liste7.get(1));
            jLabel6.setText("Gerilim");
        }
        else if(comboBox3.equals("Komedi")){
            jTextArea5.setText(liste8.get(0));
            jTextArea6.setText(liste8.get(1));
            jLabel6.setText("Komedi");
        }
        else if(comboBox3.equals("Korku")){
            jTextArea5.setText(liste9.get(0));
            jTextArea6.setText(liste9.get(1));
            jLabel6.setText("Korku");
        }
        else if(comboBox3.equals("Reality Program")){
            jTextArea5.setText(liste10.get(0));
            jTextArea6.setText(liste10.get(1));
            jLabel6.setText("Reality Program");
        }
        else if(comboBox3.equals("Romantik")){
            jTextArea5.setText(liste11.get(0));
            jTextArea6.setText(liste11.get(1));
            jLabel6.setText("Romantik");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public static ArrayList<String> enyuksekratebul(String str){
        ArrayList<String> liste;
        liste = new ArrayList<String>();
        for(int i=0 ; i<74 ; i++){
            String sorgu = "select program_adi from program inner join programtur on programtur.program_ismi=program.program_adi where program.rate in (Select distinct rate from program Order By rate desc Limit 1 offset "+i+") and programtur.tur_ismi='"+str+"'";
            Statement stm=null;
            ResultSet rs=null;
            String sonuc="";
            try {
                stm = Sqlite_netflix.conn.createStatement();
                rs = stm.executeQuery(sorgu);
                while(rs.next()){
                    sonuc = rs.getString("program_adi");
                }

            }
            catch(Exception e ){
                System.out.println("basarisiz");
            }
            //System.out.println(sonuc);
            if(sonuc!="")
                liste.add(sonuc);
            if(liste.size()>=2)
                break;
        }
        System.out.println("\n\n");
        for(int i=0 ; i<liste.size() ; i++){
            System.out.println("liste["+i+"] : " + liste.get(i));
        }
        return liste;
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Giris().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField_Kayit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField_Kayit_Mail;
    private javax.swing.JTextField jTextField_Kayit_UserName;
    // End of variables declaration//GEN-END:variables
}