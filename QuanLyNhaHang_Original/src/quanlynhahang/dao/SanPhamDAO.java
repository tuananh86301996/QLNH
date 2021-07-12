/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlynhahang.entity.SanPham;
import quanlynhahang.helper.JDBCHelper;

/**
 *
 * @author SONY
 */
public class SanPhamDAO extends fiveGuyDAO<SanPham,String> {

    @Override
    public void insert(SanPham entity) {
        String sql = "insert into Sanpham(tensp,dongia,tinhtrang,hinh,mota,maloai) values(?,?,?,?,?,?)";
        JDBCHelper.update(sql,
                        entity.getTenSp(),
                        entity.getDonGia(),
                        entity.getTinhTrang(),
                        entity.getHinh(),
                        entity.getMota(),
                        entity.getMaloai());
    }

    @Override
    public void update(SanPham entity) {
        String sql = "update Sanpham set tensp=?,dongia=?,tinhtrang=?,hinh=?,mota=?,maloai=? where masp=?";
        JDBCHelper.update(sql,
                        entity.getTenSp(),
                        entity.getDonGia(),
                        entity.getTinhTrang(),
                        entity.getHinh(),
                        entity.getMota(),
                        entity.getMaloai(),
                        entity.getMaSp());
    }

    @Override
    public void delete(String id) {
        String sql = "delete from sanpham where masp=?";
        JDBCHelper.update(sql, id);
    }

    @Override
    public SanPham selectById(String id) {
        String sql = "select * from Sanpham where masp=?";
        List<SanPham> list = this.selectBySql(sql , id);
        return list.size()>0 ? list.get(0) : null;
    }
    
    //tìm theo đúng tên
    public SanPham selectByName(String name){
        String sql = "select * from Sanpham where tensp=?";
        List<SanPham> list = this.selectBySql(sql , name);
        return list.size()>0 ? list.get(0) : null;
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "select * from Sanpham order by dongia asc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, args);
                while(rs.next()){
                    SanPham entity = new SanPham();
                    entity.setMaSp(rs.getInt("masp"));
                    entity.setTenSp(rs.getString("tensp"));
                    entity.setDonGia(rs.getDouble("dongia"));
                    entity.setTinhTrang(rs.getBoolean("tinhtrang"));
                    entity.setHinh(rs.getString("hinh"));
                    entity.setMota(rs.getString("mota"));
                    entity.setMaloai(rs.getInt("maloai"));
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
    
}
