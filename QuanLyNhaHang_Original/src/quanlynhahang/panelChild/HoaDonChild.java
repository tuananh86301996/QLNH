/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.panelChild;

import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import quanlynhahang.dao.CTHDDao;
import quanlynhahang.dao.NhanVienDAO;
import quanlynhahang.dao.SanPhamDAO;
import quanlynhahang.entity.CTHD;
import quanlynhahang.entity.HoaDon;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.helper.XDate;
import quanlynhahang.helper.XMoney;
import quanlynhahang.ui.HoaDonJPanel;
import static quanlynhahang.ui.HoaDonJPanel.*;


/**
 *
 * @author SONY
 */
public class HoaDonChild extends javax.swing.JPanel {

    HoaDon hd = null;
    /**
     * Creates new form HoaDonChild
     */
    public HoaDonChild(HoaDon hd) {
        initComponents();
        this.hd = hd;
        this.setLayout();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChild = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        lblMahd = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        lblBan = new javax.swing.JLabel();
        lblTien = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 63));

        pnlChild.setBackground(new java.awt.Color(255, 255, 255));
        pnlChild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlChild.setPreferredSize(new java.awt.Dimension(500, 63));
        pnlChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlChildMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlChildMouseExited(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhahang/icon/invoice.png"))); // NOI18N

        lblMahd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblMahd.setForeground(new java.awt.Color(153, 0, 0));
        lblMahd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMahd.setText("Mã Hóa Đơn");

        lblNgay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNgay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNgay.setText("25-11-2020");

        lblGio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGio.setText("12:30:00");

        lblBan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBan.setText("Bàn : 01");

        lblTien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTien.setForeground(new java.awt.Color(153, 0, 0));
        lblTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTien.setText("Tiền : VND");

        javax.swing.GroupLayout pnlChildLayout = new javax.swing.GroupLayout(pnlChild);
        pnlChild.setLayout(pnlChildLayout);
        pnlChildLayout.setHorizontalGroup(
            pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChildLayout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlChildLayout.createSequentialGroup()
                        .addComponent(lblMahd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBan))
                    .addGroup(pnlChildLayout.createSequentialGroup()
                        .addComponent(lblNgay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(lblTien)))
                .addContainerGap())
        );
        pnlChildLayout.setVerticalGroup(
            pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlChildLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMahd)
                    .addComponent(lblBan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgay)
                    .addComponent(lblTien)
                    .addComponent(lblGio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //mouse click pnl Child
    private void pnlChildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlChildMouseClicked
        // TODO add your handling code here:
        pnlChild.setBackground(new Color(204,255,255));
        this.fillInfor();
    }//GEN-LAST:event_pnlChildMouseClicked

    //pnlChild mouse exit
    private void pnlChildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlChildMouseExited
        // TODO add your handling code here:
        if(hd.getChietKhau()>0)
            pnlChild.setBackground(new Color(255,255,180));
        else
            pnlChild.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pnlChildMouseExited

    
    NhanVienDAO nvd = new NhanVienDAO();
    CTHDDao ctd = new CTHDDao();
    SanPhamDAO spd = new SanPhamDAO();
    
    
    //set layout
    public void setLayout(){
        lblMahd.setText("HĐ "+hd.getMaHD());
        lblNgay.setText(XDate.toString(hd.getNgay(), "dd-MM-yyyy"));
        lblGio.setText(hd.getThoiGian().toString());
        lblBan.setText("Bàn "+hd.getSoBan());
        lblTien.setText(XMoney.toString(hd.getThanhTien())+" VND");
        if((hd.getChietKhau()>0))
            pnlChild.setBackground(new Color(255,255,180));
    }
    
     //đổ thông tin
    public void fillInfor(){
        //thông tin hóa đơn
        NhanVien nv = nvd.selectById(hd.getMaNV());
        txtMaHD.setText(String.valueOf(hd.getMaHD()));
        txtBan.setText(String.valueOf(hd.getSoBan()));
        txtNgay.setText(XDate.toString(hd.getNgay(), "dd-MM-yyyy"));
        txtGio.setText(hd.getThoiGian());
        txtTenNv.setText(nv.getTenNV());
        txtLydo.setText(hd.getLyDo());
        txtGiam.setText(hd.getChietKhau()+"%");
        txtThanhTien.setText(XMoney.toString(hd.getThanhTien()));
        
        //đổ order
        DefaultTableModel model = (DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);
        double tong =0;
        List<CTHD> ctl = ctd.selectbyID(String.valueOf(hd.getMaHD()));
        for(int i=0;i<ctl.size();i++){
            double donGia = ctl.get(i).getDonGia();
            int sl = ctl.get(i).getSoLuong();
            double tien = donGia * sl;
            tong += tien;
            Object[] row ={i+1,ctl.get(i).getTenSp(),donGia,sl,tien};
            model.addRow(row);
        }
        txtTongCong.setText(XMoney.toString(tong));
        txtChietKhau.setText(XMoney.toString(tong * hd.getChietKhau()/100));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel lblBan;
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblMahd;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblTien;
    private javax.swing.JPanel pnlChild;
    // End of variables declaration//GEN-END:variables
}
