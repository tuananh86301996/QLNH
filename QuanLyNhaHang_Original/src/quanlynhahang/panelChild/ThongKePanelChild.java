/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.panelChild;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import quanlynhahang.dao.CTHDDao;
import quanlynhahang.entity.CTHD;
import quanlynhahang.entity.SanPham;
import quanlynhahang.entity.ThongKeMatHang;
import quanlynhahang.helper.MsgBox;
import quanlynhahang.helper.XMoney;
import quanlynhahang.ui.OrderJPanel;

/**
 *
 * @author SONY
 */
public class ThongKePanelChild extends javax.swing.JPanel {
    
    ThongKeMatHang tkmh;
    
    /**
     * Creates new form OrderPanelChild
     */
    public ThongKePanelChild(ThongKeMatHang tkmh, int num) {
        initComponents();
        this.tkmh = tkmh;
        this.init(num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChild = new javax.swing.JPanel();
        lblSoluong = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblSoluong1 = new javax.swing.JLabel();
        lblTop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlChild.setBackground(new java.awt.Color(255, 255, 255));
        pnlChild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlChild.setPreferredSize(new java.awt.Dimension(563, 102));

        lblSoluong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSoluong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSoluong.setText("0");

        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTen.setForeground(new java.awt.Color(204, 0, 0));
        lblTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTen.setText("TRỨNG HẤP");

        lblSoluong1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSoluong1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSoluong1.setText("Số lượng:");

        lblTop.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTop.setForeground(new java.awt.Color(0, 0, 153));
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTop.setText("Top");

        javax.swing.GroupLayout pnlChildLayout = new javax.swing.GroupLayout(pnlChild);
        pnlChild.setLayout(pnlChildLayout);
        pnlChildLayout.setHorizontalGroup(
            pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChildLayout.createSequentialGroup()
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChildLayout.createSequentialGroup()
                        .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTop, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlChildLayout.createSequentialGroup()
                        .addGap(0, 236, Short.MAX_VALUE)
                        .addComponent(lblSoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        pnlChildLayout.setVerticalGroup(
            pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChildLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChildLayout.createSequentialGroup()
                        .addComponent(lblTop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChildLayout.createSequentialGroup()
                        .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChild, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChild, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //set layout
    public void init(int num){
        lblTen.setText(tkmh.getTenSP());
        lblSoluong.setText(tkmh.getSoLuong()+"");
        lblTop.setText("Top "+num);
        
        ImageIcon icon = new ImageIcon("src/quanlynhahang/image/"+tkmh.getHinh());
        lblHinh.setSize(138, 100);
        Image img = icon.getImage();
        ImageIcon avata = new ImageIcon(img.getScaledInstance(lblHinh.getWidth(),lblHinh.getHeight(),img.SCALE_SMOOTH ));
        lblHinh.setIcon(avata);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblSoluong;
    private javax.swing.JLabel lblSoluong1;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPanel pnlChild;
    // End of variables declaration//GEN-END:variables
}
