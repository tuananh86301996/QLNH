/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlynhahang.entity.CTHD;
import quanlynhahang.entity.SanPham;
import quanlynhahang.helper.JDBCHelper;

/**
 *
 * @author SONY
 */
public class CTHDDao extends fiveGuyDAO <CTHD, String> {

    public void insert(String mahd,SanPham entity,int sl) {
        String sql = "insert into ct_hd(mahd,masp,soluong,dongia) values(?,?,?,?)";
        JDBCHelper.update(sql,
                        mahd,
                        entity.getMaSp(),
                        sl,
                        entity.getDonGia());
    }

    public void update(String mahd, int soluong, String tensp) {
        String sql = "update ct_hd set soluong = ? where mahd = ? and masp = (select masp from sanpham where tensp=?)";
        JDBCHelper.update(sql,soluong, mahd, tensp);
    }

    //xoá món ăn được chọn trong 1 hd
    public void delete(String mahd, String tensp) {
        String sql = "delete from ct_hd where mahd = ? and masp = (select masp from sanpham where tensp=?)";
        JDBCHelper.update(sql, mahd,tensp);
    }

    //xóa tất cả món trong hóa đơn đc chọn
    public void deleteAll(String mahd){
        String sql = "delete from ct_hd where mahd = ?";
        JDBCHelper.update(sql, mahd);
    }
    
    
    //select all join để thể hiện tên sp
    public List<CTHD> selectbyID(String mahd){
        String sql = "select * from CT_HD ct join SANPHAM sp on ct.MASP = sp.MASP where ct.MAHD = ?";
        return this.selectBySql(sql, mahd);
    }
    
    @Override
    public List<CTHD> selectAll() {
        String sql = "select * from cthd";
        return this.selectBySql(sql);
    }

    @Override
    protected List<CTHD> selectBySql(String sql, Object... args) {
        List<CTHD> list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, args);
                while(rs.next()){
                    CTHD entity = new CTHD();
                    entity.setMaHD(rs.getInt("mahd"));
                    entity.setMaSP(rs.getInt("masp"));
                    entity.setTenSp(rs.getString("tensp"));
                    entity.setSoLuong(rs.getInt("soluong"));
                    entity.setDonGia(rs.getDouble("dongia"));
                    list.add(entity);
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
        return list;
    }
    
    //select theo mã món ăn trong mã hd
    public CTHD selectOrder(String mahd, int masp){
        String sql = "select * from ct_hd ct join sanpham sp on ct.masp=sp.masp where ct.mahd=? and ct.masp=?";
        List<CTHD> list = this.selectBySql(sql,mahd,masp);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void update(CTHD entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(CTHD entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public CTHD selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
