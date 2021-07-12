/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlynhahang.entity.Ban;
import quanlynhahang.entity.BieuDo;
import quanlynhahang.entity.ThongKe;
import quanlynhahang.entity.ThongKeMatHang;
import quanlynhahang.helper.JDBCHelper;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    public ThongKe getThongKe(String dateFrom, String dateTo){
        String sql = ""
                + "select isnull(sum(hd.THANHTIEN), 0) tongDoanhThu, count(hd.MAHD) soGiaoDich from HOADON hd where hd.NGAY >= ? and hd.NGAY <= ?";
        
        List<ThongKe> tmpResult = new ArrayList<>();
        
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, dateFrom, dateTo);
                while(rs.next()){
                    ThongKe entity = new ThongKe();
                    entity.setTongDoanhThu(rs.getDouble("tongDoanhThu"));
                    entity.setSoGiaoDich(rs.getInt("soGiaoDich"));
                    tmpResult.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }          
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        
        return tmpResult.size()>0?tmpResult.get(0):new ThongKe(0, 0);
    }
    
    public List<ThongKeMatHang> getMatHang(String dateFrom, String dateTo){
//        String sql =  "SELECT	sp.TENSP, sp.HINH, tmp.TONGSOLUONG " +
//                "FROM		SANPHAM sp " +
//                "INNER JOIN	(SELECT		TOP 5 cthd.MASP, SUM(cthd.SOLUONG) AS TONGSOLUONG " +
//                "		FROM		HOADON hd INNER JOIN CT_HD cthd ON hd.MAHD = cthd.MAHD " +
//                "		WHERE		hd.NGAY >= ? and hd.NGAY <= ? " +
//                "		GROUP BY MASP ORDER BY TONGSOLUONG DESC) as tmp " +
//                "ON		sp.MASP = tmp.MASP";
        
        String sql = "select top 5 sp.tensp, sum(ct.soluong) tongsoluong, sp.hinh\n" +
                        "from hoadon hd join CT_HD ct on hd.MAHD=ct.mahd \n" +
                        "	join sanpham sp on ct.masp = sp.masp\n" +
                        "where sp.maloai not in (5) and ngay >= ? and ngay <= ?\n" +
                        "group by sp.tensp,sp.hinh\n" +
                        "order by tongsoluong desc";

        List<ThongKeMatHang> result = new ArrayList<>();
        
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, dateFrom, dateTo);
                while(rs.next()){
                    ThongKeMatHang entity = new ThongKeMatHang();
                    entity.setTenSP(rs.getString("tensp"));
                    entity.setSoLuong(rs.getInt("tongsoluong"));
                    entity.setHinh(rs.getString("hinh"));
                    result.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        
        return result;
    }
    
    public List<BieuDo> getDuLieuBieuDo(String dateFrom, String dateTo){
        String sql = "" + 
                "SELECT	hd.NGAY, SUM(hd.THANHTIEN) AS DOANHTHU " +
                "FROM	HOADON hd " +
                "WHERE	hd.NGAY >= ? and hd.NGAY <= ? " +
                "GROUP BY hd.NGAY ORDER BY hd.NGAY ASC";
        
        List<BieuDo> result = new ArrayList<>();
        
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, dateFrom, dateTo);
                while(rs.next()){
                    BieuDo entity = new BieuDo();
                    entity.setNgay(rs.getString("ngay"));
                    entity.setDoanhThu(rs.getDouble("doanhthu"));
                    result.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        
        return result;
    }
}
