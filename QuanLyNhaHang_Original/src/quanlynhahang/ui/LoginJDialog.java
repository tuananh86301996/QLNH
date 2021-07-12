
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.ui;
import java.awt.Color;
import javax.swing.JOptionPane;
import keeptoo.Drag;
import quanlynhahang.dao.NhanVienDAO;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.helper.Auth;
import quanlynhahang.helper.MsgBox;

public class LoginJDialog extends javax.swing.JDialog {

    int num =0;
    /**
     * Creates new form LoginJDialog
     */
    public LoginJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public LoginJDialog(int num) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.num = num;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel3 = new keeptoo.KGradientPanel();
        txtUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        btnSignin = new keeptoo.KButton();
        chkHide = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        lblQrcode = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        lblExit = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setUndecorated(true);

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkBorderRadius(0);
        kGradientPanel3.setkEndColor(new java.awt.Color(217, 113, 146));
        kGradientPanel3.setkGradientFocus(750);
        kGradientPanel3.setkStartColor(new java.awt.Color(80, 76, 158));
        kGradientPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel3MouseDragged(evt);
            }
        });
        kGradientPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel3MousePressed(evt);
            }
        });
        kGradientPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel3KeyPressed(evt);
            }
        });
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new Color(0,0,0,0));
        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUser.setOpaque(false);
        kGradientPanel3.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 267, 33));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User Name");
        kGradientPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        kGradientPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Login");
        kGradientPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jPasswordField3.setEditable(false);
        jPasswordField3.setBackground(new Color(0,0,0,0));
        jPasswordField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPasswordField3.setOpaque(false);
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 270, 10));

        btnSignin.setText("SignIn");
        btnSignin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSignin.setkBorderRadius(40);
        btnSignin.setkEndColor(new java.awt.Color(255, 255, 255));
        btnSignin.setkFillButton(false);
        btnSignin.setkHoverColor(new java.awt.Color(153, 0, 0));
        btnSignin.setkHoverEndColor(new java.awt.Color(255, 204, 0));
        btnSignin.setkHoverForeGround(new java.awt.Color(255, 204, 0));
        btnSignin.setkHoverStartColor(new java.awt.Color(255, 204, 0));
        btnSignin.setkStartColor(new java.awt.Color(255, 255, 255));
        btnSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigninMouseClicked(evt);
            }
        });
        kGradientPanel3.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 160, 40));

        chkHide.setBackground(new Color(0,0,0,0));
        chkHide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkHide.setForeground(new java.awt.Color(255, 255, 255));
        chkHide.setText("Hiển thị mật khẩu.");
        chkHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHideActionPerformed(evt);
            }
        });
        kGradientPanel3.add(chkHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quên mật khẩu?");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        kGradientPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        lblQrcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhahang/icon/Qrcode.png"))); // NOI18N
        lblQrcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQrcodeMouseClicked(evt);
            }
        });
        kGradientPanel3.add(lblQrcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 30, -1));

        txtPass.setBackground(new Color(0,0,0,0));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPass.setOpaque(false);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        kGradientPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 270, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Chức năng khác");
        kGradientPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 110, -1));

        kGradientPanel4.setkBorderRadius(0);
        kGradientPanel4.setkEndColor(new java.awt.Color(217, 113, 146));
        kGradientPanel4.setkGradientFocus(780);
        kGradientPanel4.setkStartColor(new java.awt.Color(80, 76, 158));

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhahang/icon/iconfinder_Artboard_1_1790660.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 840, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel3.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhahang/icon/logoHimari.png"))); // NOI18N
        kGradientPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 30, 710, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void kGradientPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MouseDragged
        // TODO add your handling code here:
        new Drag(kGradientPanel3).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel3MouseDragged

    private void kGradientPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MousePressed
        // TODO add your handling code here:
        new Drag(kGradientPanel3).onPress(evt);
    }//GEN-LAST:event_kGradientPanel3MousePressed

    private void kGradientPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel3KeyPressed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigninMouseClicked
        // TODO add your handling code here:
        this.login();
    }//GEN-LAST:event_btnSigninMouseClicked

    private void chkHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHideActionPerformed
        // TODO add your handling code here:
        this.checkHide();
    }//GEN-LAST:event_chkHideActionPerformed

    private void lblQrcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQrcodeMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ScandQRcodeJDialog().setVisible(true);
    }//GEN-LAST:event_lblQrcodeMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new QuenMatkhauJDialog().setVisible(true);     
    }//GEN-LAST:event_jLabel12MouseClicked

    public void checkHide(){
        if(chkHide.isSelected()){
            txtPass.setEchoChar((char)0);
        }
        else
            txtPass.setEchoChar('0');
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
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJDialog dialog = new LoginJDialog(new javax.swing.JFrame(), true);
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
    private keeptoo.KButton btnSignin;
    private javax.swing.JCheckBox chkHide;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField3;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblQrcode;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    
    NhanVienDAO nvd = new NhanVienDAO();
    public void login(){
        String manv = txtUser.getText().toString();
        String pass = txtPass.getText().toString();
        
        //kiem tra manv co ton tai ko
        NhanVien nv = nvd.selectById(manv);
        if(nv == null){
            MsgBox.alert(this, "Mã nhân viên chưa tồn tại");
            txtUser.requestFocus();
        }
        //kiem tra pass
        else if(!pass.equals(nv.getMatkhau().toString())){
            MsgBox.alert(this, "Mật khẩu không đúng");
            txtPass.requestFocus();
        }
        else{
            Auth.user = nv;
            if(Auth.isManager()){
                MsgBox.alert(this, "ban dang nhap voi vai tro quan ly");
            }
            else{
                MsgBox.alert(this, "ban dang nhap voi vai tro nhan vien");
            }
            
            this.dispose();          
        }
    }
}
