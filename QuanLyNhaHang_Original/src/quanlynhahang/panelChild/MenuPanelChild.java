/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.panelChild;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import quanlynhahang.dao.SanPhamDAO;
import quanlynhahang.entity.SanPham;
import quanlynhahang.helper.Auth;
import quanlynhahang.helper.XMoney;
import quanlynhahang.ui.MeNuJPanel;
import static quanlynhahang.ui.MeNuJPanel.lblHinh;

/**
 *
 * @author SONY
 */
public class MenuPanelChild extends javax.swing.JPanel {

    int masp;
    SanPham sp;
    /**
     * Creates new form MenuPanelChild
     */
    public MenuPanelChild(SanPham sp) {
        initComponents();
        this.sp = sp;
        this.init();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMnChild = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblHinhChild = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(200, 190));

        pnlMnChild.setBackground(new java.awt.Color(255, 255, 255));
        pnlMnChild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMnChild.setPreferredSize(new java.awt.Dimension(200, 190));
        pnlMnChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMnChildMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMnChildMouseExited(evt);
            }
        });

        lblTen.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTen.setForeground(new java.awt.Color(153, 51, 0));
        lblTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTen.setText("Trứng hấp");

        lblGia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGia.setForeground(new java.awt.Color(51, 0, 51));
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGia.setText("VND 68,000");

        lblHinhChild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlMnChildLayout = new javax.swing.GroupLayout(pnlMnChild);
        pnlMnChild.setLayout(pnlMnChildLayout);
        pnlMnChildLayout.setHorizontalGroup(
            pnlMnChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMnChildLayout.createSequentialGroup()
                .addGroup(pnlMnChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMnChildLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMnChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(lblHinhChild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlMnChildLayout.setVerticalGroup(
            pnlMnChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMnChildLayout.createSequentialGroup()
                .addComponent(lblHinhChild, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMnChild, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMnChild, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    SanPhamDAO spd = new SanPhamDAO();
    
    private void pnlMnChildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMnChildMouseClicked
        // TODO add your handling code here:
        pnlMnChild.setBackground(new Color(204,255,255));
        Auth.sanpham = this.sp;
        MeNuJPanel.setForm(Auth.sanpham);
    }//GEN-LAST:event_pnlMnChildMouseClicked

    private void pnlMnChildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMnChildMouseExited
        // TODO add your handling code here:
        pnlMnChild.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pnlMnChildMouseExited

    //set layout
    public void init(){
        lblTen.setText(sp.getTenSp());
        this.loadImg(sp.getHinh());
        lblGia.setText("VND "+XMoney.toString(sp.getDonGia()));
    }
    
    //đổ hình vào lbl
    public void loadImg(String hinh){
        ImageIcon icon = new ImageIcon("src/quanlynhahang/image/"+hinh);
        lblHinhChild.setSize(178, 123);
        Image img = icon.getImage();
        ImageIcon avata = new ImageIcon(img.getScaledInstance(lblHinhChild.getWidth(),lblHinhChild.getHeight(),img.SCALE_SMOOTH ));
        lblHinhChild.setIcon(avata);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblHinhChild;
    private javax.swing.JLabel lblTen;
    private javax.swing.JPanel pnlMnChild;
    // End of variables declaration//GEN-END:variables
}
