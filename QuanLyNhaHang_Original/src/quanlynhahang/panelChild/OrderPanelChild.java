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
import quanlynhahang.helper.MsgBox;
import quanlynhahang.helper.XImage;
import quanlynhahang.helper.XMoney;
import quanlynhahang.ui.OrderJPanel;

/**
 *
 * @author SONY
 */
public class OrderPanelChild extends javax.swing.JPanel {

    SanPham sp;
    /**
     * Creates new form OrderPanelChild
     */
    public OrderPanelChild(SanPham sp) {
        initComponents();
        this.sp = sp;
        this.init();
        this.loadImg();
    }

    CTHDDao ctd = new CTHDDao();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChild = new javax.swing.JPanel();
        lblGia = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblNoiDung = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlChild.setBackground(new java.awt.Color(255, 255, 255));
        pnlChild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlChild.setPreferredSize(new java.awt.Dimension(563, 102));
        pnlChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlChildMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlChildMouseExited(evt);
            }
        });

        lblGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGia.setText("VND 68,000");

        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTen.setForeground(new java.awt.Color(204, 0, 0));
        lblTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTen.setText("TRỨNG HẤP");

        lblNoiDung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNoiDung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNoiDung.setText("Món Trứng hấp Nhật Bản vô cùng giàu");

        javax.swing.GroupLayout pnlChildLayout = new javax.swing.GroupLayout(pnlChild);
        pnlChild.setLayout(pnlChildLayout);
        pnlChildLayout.setHorizontalGroup(
            pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChildLayout.createSequentialGroup()
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlChildLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlChildLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        pnlChildLayout.setVerticalGroup(
            pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChildLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNoiDung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlChild, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //mouseclick pnl
    private void pnlChildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlChildMouseClicked
        // TODO add your handling code here:
        OrderJPanel pnl = null;
        pnlChild.setBackground(new Color(204,255,255));
        if(!sp.getTinhTrang()){
            MsgBox.alert(this, "Món này đã hết, xin vui lòng chọn món khác !");
            return;
        }
        else{
            String mahd = pnl.lblMaHD.getText();
            CTHD cthd = ctd.selectOrder(mahd, sp.getMaSp());
            if(mahd.length()==0){
                MsgBox.alert(this, "Vui lòng chọn bàn order rồi mới chọn món ăn");
            }
            else if(cthd != null){
                MsgBox.alert(this, "Món này đã được chọn");
                return;
            }
            else{
                String sl=null;
                int num;
                try{
                    sl = MsgBox.prompt(this, "Món : "+sp.getTenSp()+"\n Nhập số lượng :");
                    if(sl.length()==0 || sl==null)
                        return;
                    num = Integer.parseInt(sl);                  
                }
                catch(Exception e){
                    MsgBox.alert(this, "Vui lòng nhập số");
                    return;
                }
                if(num<=1)
                    ctd.insert(mahd,sp,1);
                else
                    ctd.insert(mahd,sp,num);
                pnl.fillOrder();
            }
        }
    }//GEN-LAST:event_pnlChildMouseClicked

    //mouse exit pnl
    private void pnlChildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlChildMouseExited
        // TODO add your handling code here:
        if(!sp.getTinhTrang()){
            pnlChild.setBackground(new Color(204,204,204));
        }
        else{
            pnlChild.setBackground(new Color(255,255,255));
        }
    }//GEN-LAST:event_pnlChildMouseExited

    //set layout
    public void init(){
        lblTen.setText(sp.getTenSp());
        lblNoiDung.setText(sp.getMota());
        if(!sp.getTinhTrang()){
            pnlChild.setBackground(new Color(204,204,204));
            lblGia.setText("Đã Hết");            
        }
        else{
            lblGia.setText("VND "+XMoney.toString(sp.getDonGia()));
        }
    }
    
    //load img
    public void loadImg(){
        lblHinh.setSize(138, 100);
        ImageIcon avata = XImage.readImg(sp.getHinh(), lblHinh);
        lblHinh.setIcon(avata);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblNoiDung;
    private javax.swing.JLabel lblTen;
    private javax.swing.JPanel pnlChild;
    // End of variables declaration//GEN-END:variables
}
