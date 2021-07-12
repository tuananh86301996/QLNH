/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.panelChild;

import java.awt.Color;
import quanlynhahang.dao.BanDAO;
import quanlynhahang.dao.DatBanDAO;
import quanlynhahang.entity.Ban;
import quanlynhahang.entity.DatBan;
import quanlynhahang.helper.Auth;
import quanlynhahang.ui.BanJPanel;

/**
 *
 * @author SONY
 */
public class BanPanelChild extends javax.swing.JPanel {

    int soban;
    /**
     * Creates new form BanPanelChild
     */
    public BanPanelChild(int num, String status) {
        initComponents();
        soban = num;
        this.init(num,status);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kpnlBan = new keeptoo.KGradientPanel();
        lblBan = new javax.swing.JLabel();
        lblTrangthai = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        kpnlBan.setBackground(new java.awt.Color(255, 255, 255));
        kpnlBan.setkBorderRadius(40);
        kpnlBan.setkEndColor(new java.awt.Color(204, 255, 204));
        kpnlBan.setkStartColor(new java.awt.Color(204, 255, 204));
        kpnlBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kpnlBanMouseClicked(evt);
            }
        });

        lblBan.setBackground(new java.awt.Color(255, 255, 255));
        lblBan.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblBan.setForeground(new java.awt.Color(153, 0, 0));
        lblBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBan.setText("BÀN 1");

        lblTrangthai.setBackground(new java.awt.Color(255, 255, 255));
        lblTrangthai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTrangthai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTrangthai.setText("Trống ");
        lblTrangthai.setToolTipText("");

        javax.swing.GroupLayout kpnlBanLayout = new javax.swing.GroupLayout(kpnlBan);
        kpnlBan.setLayout(kpnlBanLayout);
        kpnlBanLayout.setHorizontalGroup(
            kpnlBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBan, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kpnlBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kpnlBanLayout.setVerticalGroup(
            kpnlBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kpnlBanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBan, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTrangthai)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kpnlBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kpnlBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void kpnlBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kpnlBanMouseClicked
        // TODO add your handling code here:
        DatBan db = dbd.selectById(String.valueOf(soban));
        Ban ban = bd.selectById(String.valueOf(soban));
        Auth.ban = ban;
        Auth.datban = db;
        bpnl.setForm(ban, db);
    }//GEN-LAST:event_kpnlBanMouseClicked

    BanJPanel bpnl = null;
    DatBanDAO dbd = new DatBanDAO();
    BanDAO bd = new BanDAO();
    
    //setLayout
    public static void init(int num,String status){
        lblBan.setText("BÀN "+num);
        lblTrangthai.setText(status);
        if(status.equalsIgnoreCase("trống")){
            kpnlBan.setkStartColor(new Color(204,255,204));
            kpnlBan.setkEndColor(new Color(204,255,204));
        }
        else if(status.equalsIgnoreCase("order")){
            kpnlBan.setkStartColor(new Color(255,204,204));
            kpnlBan.setkEndColor(new Color(255,204,204));
        }
        else{
            kpnlBan.setkStartColor(new Color(255,255,153));
            kpnlBan.setkEndColor(new Color(255,255,153));
        }           
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel kpnlBan;
    public static javax.swing.JLabel lblBan;
    public static javax.swing.JLabel lblTrangthai;
    // End of variables declaration//GEN-END:variables
}
