/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import quanlynhahang.dao.ThongKeDAO;
import quanlynhahang.entity.BieuDo;
import quanlynhahang.entity.ThongKe;
import quanlynhahang.entity.ThongKeMatHang;
import quanlynhahang.helper.MsgBox;
import quanlynhahang.helper.XDate;
import quanlynhahang.panelChild.BanPanelChild;
import quanlynhahang.panelChild.ThongKePanelChild;


/**
 *
 * @author Admin
 */
public class ThongKeJPanel extends javax.swing.JPanel {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
        initComponents();
        
        //set Type and Date here;
        jdcFrom.setDate(new Date());
        jdcTo.setDate(new Date());
        
        String dateFrom = sdf.format(jdcFrom.getDate());
        String dateTo = sdf.format(jdcTo.getDate());            
        popularThongKe(dateFrom, dateTo);
        
    }

    ThongKeDAO tkd = new ThongKeDAO();

    public void popularThongKe(String dateFrom, String dateTo){
        ThongKe result = tkd.getThongKe(dateFrom, dateTo);
        
        //đổ tổng thống kê
        lbTongDoanhThu.setText(String.format("%,.0f", result.getTongDoanhThu()));
        lbSoGiaoDich.setText(result.getSoGiaoDich()+"");
        
        //đổ mặt hàng bán chạy
        try{
            List<ThongKeMatHang> matHangs = tkd.getMatHang(dateFrom, dateTo);
            pnBanChay.removeAll();       

            for(int i=0;i<matHangs.size();i++){
                ThongKePanelChild tkpn = new ThongKePanelChild(matHangs.get(i),i+1);
                //tkpn.setSize(563, 102);
                pnBanChay.add(tkpn);
            }
            pnBanChay.validate();
            fillBieuDo(dateFrom, dateTo);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public void fillBieuDo(String from,String to){
//        SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sdfTarget = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
//            Date from = sdf.parse(dateFrom);
//            Date to = sdf.parse(dateTo);
            
            DefaultCategoryDataset bieuDoData = new DefaultCategoryDataset();
            List<BieuDo> data = tkd.getDuLieuBieuDo(from , to);
            
            for(BieuDo bd : data ){
                bieuDoData.addValue(bd.getDoanhThu(), "Doanh thu", bd.getNgay());
            }
            
//            if(from!=null && to!=null){
//                if(from.equals(to)){
//                    double doanhthu = 0;
//                    String ngay = sdf.format(from);
//                    
//                    for (int j = 0; j < doanhThuData.size(); j++) {
//                        BieuDo tmpBieuDo = doanhThuData.get(j);
//
//                        if(ngay.equals(tmpBieuDo.getNgay())){
//                            doanhthu = tmpBieuDo.getDoanhThu();
//                        }
//                    }
//
//                    bieuDoData.addValue(doanhthu, "Doanh thu", ngay);
//                }else if(from.before(to)){
//                    //2 dòng dưới là tính ra ngày thống kê
//                    long diffInMillies = Math.abs(to.getTime() - from.getTime());
//                    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//                    
//                    for (int i = 0; i < diff; i++) {
//                        double doanhthu = 0;
//                        Date tmpNgay = null;
//                        String ngay = "";
//                        
//                        if(i==0)
//                            tmpNgay = from;
//                        else{
//                            Calendar c = Calendar.getInstance(); 
//                            c.setTime(from); 
//                            c.add(Calendar.DATE, i + 1);
//                            tmpNgay = c.getTime();
//                        }
//
//                        ngay = sdfTarget.format(tmpNgay);
//
//                        for (int j = 0; j < doanhThuData.size(); j++) {
//                            BieuDo tmpBieuDo = doanhThuData.get(j);
//
//                            if(ngay.equals(tmpBieuDo.getNgay())){
//                                doanhthu = tmpBieuDo.getDoanhThu();
//                            }
//                        }
//
//                        bieuDoData.addValue(doanhthu, "Doanh thu", ngay);
//                    }
//                }
//            }            

            JFreeChart barChart = ChartFactory.createBarChart( "BIỂU ĐỒ DOANH THU","Ngày", "Doanh thu (VND)",
                                                                bieuDoData, PlotOrientation.HORIZONTAL, true,true,false);            
            
            ChartPanel chartPanel = new ChartPanel(barChart); 
            chartPanel.setPreferredSize(new java.awt.Dimension(560, 400));      //set kích thước
            
            CategoryPlot plot = (CategoryPlot) barChart.getPlot();              //chỉnh màu nền
            plot.setBackgroundPaint(new Color(255,255,255));              

            pnBieuDo.removeAll();
            pnBieuDo.add(chartPanel);
            pnBieuDo.updateUI();
            
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnBanChay = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        lbTongDoanhThu = new javax.swing.JLabel();
        lbSoGiaoDich = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        pnBieuDo = new javax.swing.JPanel();
        jdcFrom = new com.toedter.calendar.JDateChooser();
        javax.swing.JLabel jLabel79 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel80 = new javax.swing.JLabel();
        jdcTo = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(254, 230, 254));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MẶT HÀNG BÁN CHẠY");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        pnBanChay.setBackground(new java.awt.Color(255, 255, 255));
        pnBanChay.setLayout(new java.awt.GridLayout(5, 1, 0, 3));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBanChay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBanChay, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THỐNG KÊ DOANH THU");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Tổng doanh thu (VND)");

        lbTongDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbTongDoanhThu.setForeground(new java.awt.Color(153, 0, 0));
        lbTongDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTongDoanhThu.setText("số tiền");

        lbSoGiaoDich.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbSoGiaoDich.setForeground(new java.awt.Color(153, 0, 0));
        lbSoGiaoDich.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoGiaoDich.setText("số giao dịch");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel78.setText("Tổng giao dịch");

        pnBieuDo.setBackground(new java.awt.Color(255, 255, 255));
        pnBieuDo.setRequestFocusEnabled(false);
        pnBieuDo.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTongDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSoGiaoDich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongDoanhThu)
                    .addComponent(lbSoGiaoDich))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jdcFrom.setDateFormatString("dd-MM-yyyy");
        jdcFrom.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jdcFrom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFromPropertyChange(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel79.setText("From:");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel80.setText("To:");

        jdcTo.setDateFormatString("dd-MM-yyyy");
        jdcTo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jdcTo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcToPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcTo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdcFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jdcTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jdcFromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFromPropertyChange
        // TODO add your handling code here:
        if(jdcFrom.getDate().after(jdcTo.getDate())){
            jdcFrom.setDate(jdcTo.getDate());
        }

        String dateFrom = sdf.format(jdcFrom.getDate());
        String dateTo = sdf.format(jdcTo.getDate());
        popularThongKe(dateFrom, dateTo);
    }//GEN-LAST:event_jdcFromPropertyChange

    private void jdcToPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcToPropertyChange
        // TODO add your handling code here:
        if(jdcTo.getDate().before(jdcFrom.getDate())){
            jdcTo.setDate(jdcFrom.getDate());
        }

        String dateFrom = sdf.format(jdcFrom.getDate());
        String dateTo = sdf.format(jdcTo.getDate());
        popularThongKe(dateFrom, dateTo);
    }//GEN-LAST:event_jdcToPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static com.toedter.calendar.JDateChooser jdcFrom;
    public static com.toedter.calendar.JDateChooser jdcTo;
    private javax.swing.JLabel lbSoGiaoDich;
    private javax.swing.JLabel lbTongDoanhThu;
    private javax.swing.JPanel pnBanChay;
    private javax.swing.JPanel pnBieuDo;
    // End of variables declaration//GEN-END:variables
}
