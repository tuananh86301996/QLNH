/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.ui;

import java.awt.Color;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import quanlynhahang.dao.BanDAO;
import quanlynhahang.dao.DatBanDAO;
import quanlynhahang.dao.HoaDonDao;
import quanlynhahang.entity.Ban;
import quanlynhahang.entity.DatBan;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.helper.Auth;
import quanlynhahang.helper.MsgBox;
import quanlynhahang.panelChild.BanPanelChild;
import static quanlynhahang.ui.Main.btnBan;
import static quanlynhahang.ui.Main.btnOrder;

/**
 *
 * @author SONY
 */
public class BanJPanel extends javax.swing.JPanel {

    int soban;
    
    /**
     * Creates new form BanJPanel
     */
    public BanJPanel() {
        initComponents();
        this.init();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlChitiet = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        txtSoDt = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        txtThoigian = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        txtKhach = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhichu = new javax.swing.JTextArea();
        cboSonguoi = new javax.swing.JComboBox<>();
        btnTrong = new keeptoo.KButton();
        btnSua = new keeptoo.KButton();
        btnDatBan = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        rdoTrong = new javax.swing.JRadioButton();
        rdoDatban = new javax.swing.JRadioButton();
        rdoOrder = new javax.swing.JRadioButton();
        btnNhanOrder = new keeptoo.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlBan = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        kGradientPanel13 = new keeptoo.KGradientPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        kGradientPanel14 = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        kGradientPanel15 = new keeptoo.KGradientPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        kGradientPanel16 = new keeptoo.KGradientPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        kGradientPanel17 = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 230, 254));

        pnlChitiet.setBackground(new java.awt.Color(255, 255, 255));
        pnlChitiet.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(153, 153, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông Tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 0, 0))), "Thông Tin Đặt Bàn", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel153.setText("Số ĐT :");

        txtSoDt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel154.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel154.setText("Thời Gian :");

        txtThoigian.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel155.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel155.setText("Số Người :");

        jLabel157.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel157.setText("Tên Khách :");

        txtKhach.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel158.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel158.setText("Ghi Chú :");

        txtGhichu.setColumns(20);
        txtGhichu.setRows(5);
        jScrollPane1.setViewportView(txtGhichu);

        cboSonguoi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cboSonguoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        btnTrong.setText("Trống");
        btnTrong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTrong.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnTrong.setkBorderRadius(15);
        btnTrong.setkEndColor(new java.awt.Color(255, 204, 204));
        btnTrong.setkForeGround(new java.awt.Color(0, 0, 0));
        btnTrong.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btnTrong.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnTrong.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        btnTrong.setkStartColor(new java.awt.Color(153, 255, 153));
        btnTrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrongActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa TT");
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnSua.setkBorderRadius(15);
        btnSua.setkEndColor(new java.awt.Color(255, 204, 204));
        btnSua.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSua.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btnSua.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSua.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        btnSua.setkStartColor(new java.awt.Color(153, 255, 153));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnDatBan.setText("Đặt Bàn");
        btnDatBan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDatBan.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnDatBan.setkBorderRadius(15);
        btnDatBan.setkEndColor(new java.awt.Color(255, 204, 204));
        btnDatBan.setkForeGround(new java.awt.Color(0, 0, 0));
        btnDatBan.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btnDatBan.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnDatBan.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        btnDatBan.setkStartColor(new java.awt.Color(153, 255, 153));
        btnDatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel158)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel154, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboSonguoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtThoigian, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel153)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoDt, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel157)
                                .addGap(18, 18, 18)
                                .addComponent(txtKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(txtKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153)
                    .addComponent(txtSoDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel154)
                    .addComponent(txtThoigian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(cboSonguoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel158))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 51), null, null, new java.awt.Color(153, 153, 153)), "Trạng Thái Bàn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        rdoTrong.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoTrong);
        rdoTrong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoTrong.setSelected(true);
        rdoTrong.setText("Trống");
        rdoTrong.setEnabled(false);

        rdoDatban.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoDatban);
        rdoDatban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoDatban.setText("Đặt Bàn");
        rdoDatban.setEnabled(false);

        rdoOrder.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoOrder);
        rdoOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoOrder.setText("Order");
        rdoOrder.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(rdoTrong)
                .addGap(45, 45, 45)
                .addComponent(rdoDatban)
                .addGap(45, 45, 45)
                .addComponent(rdoOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTrong)
                    .addComponent(rdoDatban)
                    .addComponent(rdoOrder))
                .addGap(12, 12, 12))
        );

        btnNhanOrder.setText("Nhận Order");
        btnNhanOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNhanOrder.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnNhanOrder.setkBorderRadius(15);
        btnNhanOrder.setkEndColor(new java.awt.Color(255, 204, 204));
        btnNhanOrder.setkForeGround(new java.awt.Color(0, 0, 0));
        btnNhanOrder.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btnNhanOrder.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnNhanOrder.setkHoverStartColor(new java.awt.Color(255, 204, 204));
        btnNhanOrder.setkStartColor(new java.awt.Color(153, 255, 153));
        btnNhanOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChitietLayout = new javax.swing.GroupLayout(pnlChitiet);
        pnlChitiet.setLayout(pnlChitietLayout);
        pnlChitietLayout.setHorizontalGroup(
            pnlChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChitietLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pnlChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(pnlChitietLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(btnNhanOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChitietLayout.setVerticalGroup(
            pnlChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChitietLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNhanOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SƠ ĐỒ BÀN ĂN");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        pnlBan.setBackground(new java.awt.Color(255, 255, 255));
        pnlBan.setLayout(new java.awt.GridLayout(0, 4, 20, 20));

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkBorderRadius(40);
        kGradientPanel3.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel3.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BÀN 1");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Trống ");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel3);

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkBorderRadius(40);
        kGradientPanel4.setkEndColor(new java.awt.Color(255, 255, 153));
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 153));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("BÀN 2");

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel35.setText("Đặt Bàn ");
        jLabel35.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel4);

        kGradientPanel5.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setkBorderRadius(40);
        kGradientPanel5.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel5.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(153, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("BÀN 3");

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Trống ");
        jLabel55.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel5);

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkBorderRadius(40);
        kGradientPanel6.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 204, 204));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(153, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("BÀN 4");

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel49.setText("Order ");
        jLabel49.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel49))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel6);

        kGradientPanel7.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel7.setkBorderRadius(40);
        kGradientPanel7.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(255, 204, 204));

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("BÀN 5");

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Order ");
        jLabel51.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel7);

        kGradientPanel8.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel8.setkBorderRadius(40);
        kGradientPanel8.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel8.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("BÀN 6");

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel47.setText("Trống ");
        jLabel47.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel47))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel8);

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkBorderRadius(40);
        kGradientPanel9.setkEndColor(new java.awt.Color(255, 255, 153));
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 255, 153));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("BÀN 7");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel45.setText("Đặt Bàn ");
        jLabel45.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel45))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel9);

        kGradientPanel10.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel10.setkBorderRadius(40);
        kGradientPanel10.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel10.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("BÀN 8");

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel43.setText("Trống ");
        jLabel43.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel43))
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel10);

        kGradientPanel11.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel11.setkBorderRadius(40);
        kGradientPanel11.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel11.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("BÀN 9");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel41.setText("Trống ");
        jLabel41.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel41))
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel11);

        kGradientPanel12.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel12.setkBorderRadius(40);
        kGradientPanel12.setkEndColor(new java.awt.Color(255, 255, 153));
        kGradientPanel12.setkStartColor(new java.awt.Color(255, 255, 153));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("BÀN 10");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel39.setText("Đặt Bàn ");
        jLabel39.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel12Layout = new javax.swing.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39))
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel12);

        kGradientPanel13.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel13.setkBorderRadius(40);
        kGradientPanel13.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel13.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("BÀN 11");

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel37.setText("Trống ");
        jLabel37.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel13Layout = new javax.swing.GroupLayout(kGradientPanel13);
        kGradientPanel13.setLayout(kGradientPanel13Layout);
        kGradientPanel13Layout.setHorizontalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel37))
        );
        kGradientPanel13Layout.setVerticalGroup(
            kGradientPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel13);

        kGradientPanel14.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel14.setkBorderRadius(40);
        kGradientPanel14.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel14.setkStartColor(new java.awt.Color(255, 204, 204));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("BÀN 12");

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel33.setText("Order ");
        jLabel33.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel14Layout = new javax.swing.GroupLayout(kGradientPanel14);
        kGradientPanel14.setLayout(kGradientPanel14Layout);
        kGradientPanel14Layout.setHorizontalGroup(
            kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33))
        );
        kGradientPanel14Layout.setVerticalGroup(
            kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel14);

        kGradientPanel15.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel15.setkBorderRadius(40);
        kGradientPanel15.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel15.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("BÀN 13");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setText("Trống ");
        jLabel31.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel15Layout = new javax.swing.GroupLayout(kGradientPanel15);
        kGradientPanel15.setLayout(kGradientPanel15Layout);
        kGradientPanel15Layout.setHorizontalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel31))
        );
        kGradientPanel15Layout.setVerticalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel15);

        kGradientPanel16.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel16.setkBorderRadius(40);
        kGradientPanel16.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel16.setkStartColor(new java.awt.Color(153, 255, 153));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("BÀN 14");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setText("Trống ");
        jLabel29.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel16Layout = new javax.swing.GroupLayout(kGradientPanel16);
        kGradientPanel16.setLayout(kGradientPanel16Layout);
        kGradientPanel16Layout.setHorizontalGroup(
            kGradientPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29))
        );
        kGradientPanel16Layout.setVerticalGroup(
            kGradientPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel16);

        kGradientPanel17.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel17.setkBorderRadius(40);
        kGradientPanel17.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel17.setkStartColor(new java.awt.Color(255, 204, 204));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("BÀN 15");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("Order ");
        jLabel27.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel17Layout = new javax.swing.GroupLayout(kGradientPanel17);
        kGradientPanel17.setLayout(kGradientPanel17Layout);
        kGradientPanel17Layout.setHorizontalGroup(
            kGradientPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .addGroup(kGradientPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel27))
        );
        kGradientPanel17Layout.setVerticalGroup(
            kGradientPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        pnlBan.add(kGradientPanel17);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBan, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBan, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(pnlChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlChitiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //btnDatBan
    private void btnDatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBanActionPerformed
        // TODO add your handling code here:
        if(this.checkValidate()){
            this.datBan();
        }
    }//GEN-LAST:event_btnDatBanActionPerformed

    //btn Sua thông tin
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(MsgBox.confirm(this, "Bạn muốn sửa thông tin đặt bàn ?")){
            this.editInfor();
        }
        else
            return;
    }//GEN-LAST:event_btnSuaActionPerformed

    //btn Trả về bàn Trống
    private void btnTrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrongActionPerformed
        // TODO add your handling code here:
        if(MsgBox.confirm(this, "Bạn muốn trả bàn "+lblTitle.getText().toString().substring(4)+" về trạng thái bàn trống ?")){
            this.setEmpty();
        }
        else
            return;
    }//GEN-LAST:event_btnTrongActionPerformed

    //btn Nhận order
    private void btnNhanOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanOrderActionPerformed
        // TODO add your handling code here:
        if(MsgBox.confirm(this, "Bắt đầu nhận order ?")){
            this.startOrder();
        }
        else
            return;
    }//GEN-LAST:event_btnNhanOrderActionPerformed
    
    BanDAO bd = new BanDAO();
    DatBanDAO dbd = new DatBanDAO();
    HoaDonDao hdd = new HoaDonDao();
    
    public void init(){
        this.fillBan();
        Auth.ban = null;
        updateStatus(Auth.ban);
    }
    
    
    //đổ dữ liệu lên list bàn
    public void fillBan(){
        pnlBan.removeAll();
        List<Ban> bl = bd.selectAll();
        BanPanelChild bpnl[] = new BanPanelChild[bl.size()] ;
        try{
            for(int i=0;i<bl.size();i++){
                bpnl[i] = new BanPanelChild(bl.get(i).getSoBan(),bl.get(i).getTrangThai());
                bpnl[i].setSize(135, 84);
                pnlBan.add(bpnl[i]);
            }           
        }
        catch(Exception e){
            MsgBox.alert(this, "Lỗi kết nối dữ liệu");
        }
    }
    
    //setForm
    public static void setForm(Ban ban, DatBan db){
        lblTitle.setText("BÀN "+ban.getSoBan());
        if(ban.getTrangThai().equalsIgnoreCase("trống")){
            rdoTrong.setSelected(true);
            clearForm();
        }
        else if(ban.getTrangThai().equalsIgnoreCase("order")){         
            rdoOrder.setSelected(true);
            clearForm();
        }
        else{
            rdoDatban.setSelected(true);
            txtKhach.setText(db.getTenKhach());
            txtSoDt.setText(db.getSodt());
            txtGhichu.setText(db.getGhiChu());
            txtThoigian.setText(db.getThoiGian());
            cboSonguoi.setSelectedItem(String.valueOf(db.getSoNguoi()));
        }
        updateStatus(ban);
    }
    
    //getForm DatBan
    public DatBan getForm(){
        soban = Integer.valueOf(lblTitle.getText().toString().substring(4));
       
        DatBan db = new DatBan();
        db.setSodt(txtSoDt.getText());
        db.setTenKhach(txtKhach.getText());
        db.setSoBan(soban);
        db.setSoNguoi(Integer.valueOf(cboSonguoi.getSelectedItem().toString()));
        db.setGhiChu(txtGhichu.getText());
        db.setThoiGian(txtThoigian.getText());
        return db;
    }
    
    
    //clearForm
    public static void clearForm(){
        txtGhichu.setText("");
        txtKhach.setText("");
        txtSoDt.setText("");
        txtThoigian.setText("");
        cboSonguoi.setSelectedIndex(0);
    }
    
    //datban
    public void datBan(){
        Auth.datban = this.getForm();
        try{
            dbd.insert(Auth.datban);                                            //them thong tin dat ban
            bd.update("Đặt Bàn",soban);                                         //update trang thai ban
            this.fillBan();                                                     //đổ lại list bàn
            pnlBan.validate();
            Auth.ban = bd.selectById(String.valueOf(soban));
            updateStatus(Auth.ban);
            MsgBox.alert(this, "Đặt Bàn thành công");
            rdoDatban.setSelected(true);
        }
        catch(Exception e){
            MsgBox.alert(this, "Thất Bại");
            //throw new RuntimeException(e);
        }
    }
    
    //sửa thông tin đặt
    public void editInfor(){
        DatBan db = this.getForm();
        try{
            dbd.update(db);                                                     //update thông tin đặt bàn
            MsgBox.alert(this, "Sửa thông tin đặt Bàn thành công");
        }
        catch(Exception e){
            MsgBox.alert(this, "Thất Bại");
            //throw new RuntimeException(e);
        }
    }
    
    //trả về bàn trống
    public void setEmpty(){
        soban = Integer.valueOf(lblTitle.getText().toString().substring(4));
        try{
            dbd.delete(String.valueOf(soban));                                  //delete thông tin đặt bàn
            bd.update("Trống", soban);                                          //update lại trạng thái bàn
            this.fillBan();                                                     //đổ lại list bàn
            pnlBan.validate();           
            clearForm();
            Auth.ban = bd.selectById(String.valueOf(soban));
            Auth.datban = null;
            updateStatus(Auth.ban);
            rdoTrong.setSelected(true);
            MsgBox.alert(this, "Bàn Trống");
        }
        catch(Exception e){
            MsgBox.alert(this, "Thất Bại");
            throw new RuntimeException(e);
        }
    }
    
    //nhận order
    public void startOrder(){
        soban = Integer.valueOf(lblTitle.getText().toString().substring(4));
        Ban b = bd.selectById(String.valueOf(soban));
        try{
            hdd.insert(soban);                                                  //insert 1 hóa đơn mới
            if(b.getTrangThai().equalsIgnoreCase("Đặt Bàn")){
                dbd.delete(String.valueOf(soban));                              //delete thông tin đặt bàn
            }
            bd.update("Order", soban);                                          //update lại trạng thái bàn
            this.fillBan();                                                     //đổ lại list bàn
            pnlBan.validate();           
            clearForm();
            rdoOrder.setSelected(true);
            updateStatus(bd.selectById(String.valueOf(soban)));
            MsgBox.alert(this, "Đã có thể gọi món cho bàn "+soban);
            this.changePanel(soban);                                                 //chuyển qua form order   
        }
        catch(Exception e){
            MsgBox.alert(this, "Thất Bại");
            throw new RuntimeException(e);
        }
    }
    
    //update status các btn
    public static void updateStatus(Ban ban){
        if(ban == null || ban.getTrangThai().equalsIgnoreCase("Order")){
            btnDatBan.setEnabled(false);
            btnSua.setEnabled(false);
            btnTrong.setEnabled(false);
            btnNhanOrder.setEnabled(false);
            btnDatBan.setkStartColor(new Color(204,204,204));
            btnSua.setkStartColor(new Color(204,204,204));
            btnTrong.setkStartColor(new Color(204,204,204));
            btnNhanOrder.setkStartColor(new Color(204,204,204));
            pnlChitiet.validate();
        }
        else if(Auth.datban == null){
            btnSua.setEnabled(false);
            btnTrong.setEnabled(false);
            btnSua.setkStartColor(new Color(204,204,204));
            btnTrong.setkStartColor(new Color(204,204,204));
            btnNhanOrder.setEnabled(true);
            btnNhanOrder.setkStartColor(new Color(153,255,153));
            pnlChitiet.validate();
            btnDatBan.setEnabled(true);
            btnDatBan.setkStartColor(new Color(153,255,153));
        }
        else if(Auth.datban != null){
            btnDatBan.setEnabled(false);
            btnSua.setEnabled(true);
            btnTrong.setEnabled(true);
            btnNhanOrder.setEnabled(true);
            btnDatBan.setkStartColor(new Color(204,204,204));
            btnSua.setkStartColor(new Color(153,255,153));
            btnTrong.setkStartColor(new Color(153,255,153));
            btnNhanOrder.setkStartColor(new Color(153,255,153));
            pnlChitiet.validate();
        }
//        else{
//            btnDatBan.setEnabled(true);
//            btnSua.setEnabled(true);
//            btnTrong.setEnabled(true);
//            btnNhanOrder.setEnabled(true);
//            btnDatBan.setkStartColor(new Color(153,255,153));
//            btnSua.setkStartColor(new Color(153,255,153));
//            btnTrong.setkStartColor(new Color(153,255,153));
//            btnNhanOrder.setkStartColor(new Color(153,255,153));
//            pnlChitiet.validate();
//        }
    }
    
    //chuyển Panel 
    public void changePanel(int soban){
        Main main = null;
        main.addPanel(new OrderJPanel(soban));
    }
    
    //check validate
    public boolean checkValidate(){
        DatBan db = dbd.selectByPhone(txtSoDt.getText().toString());
        String pattPhone = "0+([0-9]{9})";
        Pattern patternP = Pattern.compile(pattPhone);
        Matcher matcher = patternP.matcher(txtSoDt.getText());
        
        if(txtKhach.getText().length()==0){
            MsgBox.alert(this, "Xin nhập tên khách");
            txtKhach.requestFocus();
            return false;
        }
        else if(!matcher.matches()){
            MsgBox.alert(this, "Xin nhập số đt theo đúng quy chuẩn");
            txtSoDt.requestFocus();
            return false;
        }else if(txtThoigian.getText().length()==0){
            MsgBox.alert(this, "Xin nhập thời gian");
            txtThoigian.requestFocus();
            return false;
        }
        else if(db != null){
            MsgBox.alert(this, "Khách này đã đăng kí rồi");
            return false;
        }
        else
            return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KButton btnDatBan;
    public static keeptoo.KButton btnNhanOrder;
    public static keeptoo.KButton btnSua;
    public static keeptoo.KButton btnTrong;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cboSonguoi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel13;
    private keeptoo.KGradientPanel kGradientPanel14;
    private keeptoo.KGradientPanel kGradientPanel15;
    private keeptoo.KGradientPanel kGradientPanel16;
    private keeptoo.KGradientPanel kGradientPanel17;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    public static javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBan;
    public static javax.swing.JPanel pnlChitiet;
    public static javax.swing.JRadioButton rdoDatban;
    public static javax.swing.JRadioButton rdoOrder;
    public static javax.swing.JRadioButton rdoTrong;
    public static javax.swing.JTextArea txtGhichu;
    public static javax.swing.JTextField txtKhach;
    public static javax.swing.JTextField txtSoDt;
    public static javax.swing.JTextField txtThoigian;
    // End of variables declaration//GEN-END:variables
}
