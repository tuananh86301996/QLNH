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
import quanlynhahang.helper.JDBCHelper;

/**
 *
 * @author SONY
 */
public class BanDAO extends fiveGuyDAO<Ban,String> {

    @Override
    public void insert(Ban entity) {        
    }

    @Override
    public void update(Ban entity) {
        String sql = "update Ban set trangthai=? where soban=?";
        JDBCHelper.update(sql,
                        entity.getTrangThai(),
                        entity.getSoBan());
    }
    
    public void update(String status,int soban) {
        String sql = "update Ban set trangthai=? where soban=?";
        JDBCHelper.update(sql,status, soban);
    }

    @Override
    public void delete(String id) {       
    }

    @Override
    public Ban selectById(String id) {
        String sql = "select * from ban where soban=?";
        List<Ban> list = this.selectBySql(sql , id);
        return list.size()>0 ? list.get(0) : null;
    }

    @Override
    public List<Ban> selectAll() {
        String sql = "select * from ban order by soban asc";
        return this.selectBySql(sql);
    }

    @Override
    protected List<Ban> selectBySql(String sql, Object... args) {
        List<Ban> list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, args);
                while(rs.next()){
                    Ban entity = new Ban();
                    entity.setSoBan(rs.getInt("soban"));
                    entity.setTrangThai(rs.getString("trangthai"));
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
