/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import quanlynhahang.entity.DatBan;
import quanlynhahang.helper.JDBCHelper;

/**
 *
 * @author SONY
 */
public class DatBanDAO extends fiveGuyDAO<DatBan,String> {

    @Override
    public void insert(DatBan entity) {
        String sql = "insert into ct_datban(sodt,tenkhach,thoigian,songuoi,ghichu,soban) values(?,?,?,?,?,?)";
        JDBCHelper.update(sql,
                        entity.getSodt(),
                        entity.getTenKhach(),
                        entity.getThoiGian(),
                        entity.getSoNguoi(),
                        entity.getGhiChu(),
                        entity.getSoBan());
    }

    @Override
    public void update(DatBan entity) {
        String sql = "update ct_datban set sodt=?,tenkhach=?,thoigian=?,songuoi=?,ghichu=? where soban=?";
        JDBCHelper.update(sql,
                        entity.getSodt(),
                        entity.getTenKhach(),
                        entity.getThoiGian(),
                        entity.getSoNguoi(),
                        entity.getGhiChu(),
                        entity.getSoBan());
    }

    @Override
    public void delete(String soban) {
        String sql = "delete from ct_datban where soban=?";
        JDBCHelper.update(sql, soban);
    }

    @Override //tìm theo số bàn
    public DatBan selectById(String soban) {
        String sql = "select * from ct_datban where soban=?";
        List<DatBan> list = this.selectBySql(sql , soban);
        return list.size()>0 ? list.get(0) : null;
    }
    
    //tìm theo số đt
    public DatBan selectByPhone(String phone) {
        String sql = "select * from ct_datban where sodt=?";
        List<DatBan> list = this.selectBySql(sql , phone);
        return list.size()>0 ? list.get(0) : null;
    }

    @Override
    public List<DatBan> selectAll() {
        String sql = "select * from ct_datban";
        return this.selectBySql(sql);
    }

    @Override
    protected List<DatBan> selectBySql(String sql, Object... args) {
        List<DatBan> list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, args);
                while(rs.next()){
                    DatBan entity = new DatBan();
                    entity.setSodt(rs.getString("sodt"));
                    entity.setTenKhach(rs.getString("tenkhach"));
                    entity.setSoNguoi(rs.getInt("songuoi"));
                    entity.setThoiGian(rs.getString("thoigian"));
                    entity.setGhiChu(rs.getString("ghichu"));
                    entity.setSoBan(rs.getInt("soban"));
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
