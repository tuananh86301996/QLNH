/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.helper.JDBCHelper;

/**
 *
 * @author SONY
 */
public class NhanVienDAO extends fiveGuyDAO<NhanVien,String> {
    
    @Override
    public void insert(NhanVien entity) {
        String sql = "insert into NhanVien(manv,tennv,matkhau,vaitro,gioitinh,sodt,ca,email,ngaysinh,ngaylam,diachi,avata) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        JDBCHelper.update(sql, 
                        entity.getMaNV(),
                        entity.getTenNV(),
                        entity.getMatkhau(),
                        entity.getVaiTro(),
                        entity.getGioiTinh(),
                        entity.getSoDT(),
                        entity.getCa(),
                        entity.getEmail(),
                        entity.getNgaySinh(),
                        entity.getNgayLam(),
                        entity.getDiaChi(),
                        entity.getAvata());
    }

    @Override
    public void update(NhanVien entity) {
        String sql = "update NhanVien set tennv=?,matkhau=?,vaitro=?,gioitinh=?,sodt=?,ca=?,email=?,ngaysinh=?,ngaylam=?,diachi=?,avata=? where manv=?";
        JDBCHelper.update(sql, 
                        entity.getTenNV(),
                        entity.getMatkhau(),
                        entity.getVaiTro(),
                        entity.getGioiTinh(),
                        entity.getSoDT(),
                        entity.getCa(),
                        entity.getEmail(),
                        entity.getNgaySinh(),
                        entity.getNgayLam(),
                        entity.getDiaChi(),
                        entity.getAvata(),
                        entity.getMaNV());
    }

    
    @Override
    public void delete(String id) {
        String sql = "delete from nhanvien where manv=?";
        JDBCHelper.update(sql, id);
    }

    @Override
    public NhanVien selectById(String id) {
        String sql = "select * from NhanVien where manv=?";
        List<NhanVien> list = this.selectBySql(sql , id);
        return list.size()>0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql = "select * from NhanVien order by vaitro desc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, args);
                while(rs.next()){
                    NhanVien entity = new NhanVien();
                    entity.setMaNV(rs.getString("manv"));
                    entity.setTenNV(rs.getString("tennv"));
                    entity.setMatkhau(rs.getString("matkhau"));
                    entity.setVaiTro(rs.getBoolean("vaitro"));
                    entity.setGioiTinh(rs.getBoolean("gioitinh"));
                    entity.setSoDT(rs.getString("sodt"));
                    entity.setCa(rs.getString("ca"));
                    entity.setEmail(rs.getString("email"));
                    entity.setNgaySinh(rs.getDate("ngaysinh"));
                    entity.setNgayLam(rs.getDate("ngaylam"));
                    entity.setDiaChi(rs.getString("diachi"));
                    entity.setAvata(rs.getString("avata"));
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
    
    //tìm theo tên
    public List<NhanVien> selectByName(String name){
        String sql = "select * from nhanvien where tennv like ? order by vaitro desc";
        return this.selectBySql(sql, "%"+name+"%");
    }
    
}