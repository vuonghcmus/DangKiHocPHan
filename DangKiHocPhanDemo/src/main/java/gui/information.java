/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.TeacherDAO;
import pojo.teacher;

/**
 *
 * @author HP
 */
public class information extends javax.swing.JFrame {

    /**
     * Creates new form information
     */
    public information() {
        initComponents();
        setLocationRelativeTo(null);
        showInfo();
    }
    
    public void showInfo(){
        teacher t = TeacherDAO.layThongTinTeacher(login.staticUsername);
        if (t == null)
            return;
        tfNameTab3.setText(t.getName());
        tfAddressTab3.setText(t.getAddress());
        tfEmailTab3.setText(t.getEmail());
        tfPhoneNumberTab3.setText(t.getPhoneNumber());
        tfUsernameTab3.setText(t.getUsername());
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
        lableEmailTab3 = new javax.swing.JLabel();
        tfAddressTab3 = new javax.swing.JTextField();
        lableNameTab3 = new javax.swing.JLabel();
        tfPhoneNumberTab3 = new javax.swing.JTextField();
        tfEmailTab3 = new javax.swing.JTextField();
        lableTab3 = new javax.swing.JLabel();
        tfNameTab3 = new javax.swing.JTextField();
        lableUsernameTab3 = new javax.swing.JLabel();
        lableAddressTab3 = new javax.swing.JLabel();
        lablePhoneNumberTab3 = new javax.swing.JLabel();
        tfUsernameTab3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Thông tin tài khoản");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(229, 231, 233));

        lableEmailTab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableEmailTab3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableEmailTab3.setText("Email");

        tfAddressTab3.setEditable(false);
        tfAddressTab3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddressTab3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lableNameTab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableNameTab3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableNameTab3.setText("Họ và tên");

        tfPhoneNumberTab3.setEditable(false);
        tfPhoneNumberTab3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPhoneNumberTab3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tfEmailTab3.setEditable(false);
        tfEmailTab3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEmailTab3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lableTab3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lableTab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableTab3.setText("THÔNG TIN TÀI KHOẢN");

        tfNameTab3.setEditable(false);
        tfNameTab3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNameTab3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lableUsernameTab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableUsernameTab3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableUsernameTab3.setText("Username");

        lableAddressTab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableAddressTab3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableAddressTab3.setText("Địa chỉ");

        lablePhoneNumberTab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lablePhoneNumberTab3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lablePhoneNumberTab3.setText("Số điện thoại");

        tfUsernameTab3.setEditable(false);
        tfUsernameTab3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfUsernameTab3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_close_window_35px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableEmailTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lablePhoneNumberTab3)
                    .addComponent(lableAddressTab3)
                    .addComponent(lableUsernameTab3)
                    .addComponent(lableNameTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUsernameTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfAddressTab3, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                        .addComponent(tfPhoneNumberTab3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfEmailTab3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfNameTab3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lableTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lableTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableNameTab3)
                    .addComponent(tfNameTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableEmailTab3)
                    .addComponent(tfEmailTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablePhoneNumberTab3)
                    .addComponent(tfPhoneNumberTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableAddressTab3)
                    .addComponent(tfAddressTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableUsernameTab3)
                    .addComponent(tfUsernameTab3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lableAddressTab3;
    private javax.swing.JLabel lableEmailTab3;
    private javax.swing.JLabel lableNameTab3;
    private javax.swing.JLabel lablePhoneNumberTab3;
    private javax.swing.JLabel lableTab3;
    private javax.swing.JLabel lableUsernameTab3;
    private javax.swing.JTextField tfAddressTab3;
    private javax.swing.JTextField tfEmailTab3;
    private javax.swing.JTextField tfNameTab3;
    private javax.swing.JTextField tfPhoneNumberTab3;
    private javax.swing.JTextField tfUsernameTab3;
    // End of variables declaration//GEN-END:variables
}
