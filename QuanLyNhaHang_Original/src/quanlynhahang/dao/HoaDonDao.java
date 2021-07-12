/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import quanlynhahang.entity.HoaDon;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.helper.Auth;
import quanlynhahang.helper.JDBCHelper;
import quanlynhahang.helper.XDate;

/**
 *
 * @author SONY
 */
public class HoaDonDao extends fiveGuyDAO <HoaDon, String> {


    public void insert(int soban) {
        String sql = "insert into hoadon(ngay,thoigian,ca,chietkhau,lydo,thanhtoan,soban,manv) values(?,?,?,?,?,?,?,?)";
        int h = new Date().getHours();
        int m = new Date().getMinutes();
        int s = new Date().getSeconds();
        String ca;
        if(h<12)
            ca = "Sáng";
        else if(h<17)
            ca = "Chiều";
        else
            ca = "Tối";
        JDBCHelper.update(sql,
                        new java.sql.Date(new Date().getTime()),
                        new java.sql.Time(h, m, s),
                        ca,
                        0,
                        "Không Áp Dụng",
                        false,
                        soban,
                        Auth.user.getMaNV());
    }

    @Override
    public void update(HoaDon entity) {
        String sql = "update hoadon set lydo=?,chietkhau=? where mahd=?";
        JDBCHelper.update(sql,
                        entity.getLyDo(),
                        entity.getChietKhau(),
                        entity.getMaHD());
    }

    @Override
    public void delete(String mahd) {
        String sql = "delete from hoadon where mahd =?";
        JDBCHelper.update(sql, mahd);
    }

    @Override
    public HoaDon selectById(String mahd) {
        String sql = "select * from hoadon where mahd=?";
        List<HoaDon> list = this.selectBySql(sql, mahd);
        return list.size()>0 ? list.get(0) : null;
    }
    
    //select boi soban
    public HoaDon selectByBan(String soban) {
        String sql = "select * from hoadon where soban=? and thanhtoan=0";
        List<HoaDon> list = this.selectBySql(sql, soban);
        return list.size()>0 ? list.get(0) : null;
    }

    //update Sau khi nhấn sự kiện thanh toán
    public void upBill(HoaDon entity){
        String sql ="update hoadon set thanhtien=?,thanhtoan=? where mahd=?";
        JDBCHelper.update(sql,
                        entity.getThanhTien(),
                        1,
                        entity.getMaHD());
    }
    
    //select theo ngày hiện hành (để đổ list hóa đơn pnl) - chỉ đổ hóa đớn đã thanh toán
    public List<HoaDon> selectByNow(String date){
        String sql = "select * from hoadon where ngay>=? and thanhtoan=1 order by ngay desc, thoigian desc";
        return this.selectBySql(sql, date);
    }
    
    //select list hóa đơn theo bộ lọc
    public List<HoaDon> selectWithFilter(String from, String to, String time, float min, float max){
        String sql;
        if(max != 0){
            sql = "select * from hoadon where ngay >= ? and ngay <= ? and ca like ? "
                    +"and thanhtien >= ? and thanhtien <= ? "
                    + "order by ngay desc, thoigian desc";
            return this.selectBySql(sql, from,to,"%"+time,min,max);
        }
        else{
            sql = "select * from hoadon where ngay >= ? and ngay <= ? and ca like ? "
                    +"and thanhtien >= ? and thanhtien <= (select max(thanhtien) from hoadon) "
                    + "order by ngay desc, thoigian desc";
            return this.selectBySql(sql, from,to,"%"+time,min);
        }
    }
    
    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = JDBCHelper.query(sql, args);
                while(rs.next()){
                    HoaDon entity = new HoaDon();
                    entity.setMaHD(rs.getInt("mahd"));
                    entity.setNgay(rs.getDate("ngay"));
                    entity.setCa(rs.getString("ca"));
                    entity.setChietKhau(rs.getInt("chietkhau"));
                    entity.setLyDo(rs.getString("lydo"));
                    entity.setThanhTien(rs.getDouble("thanhtien"));
                    entity.setThanhToan(rs.getBoolean("thanhtoan"));
                    entity.setSoBan(rs.getInt("soban"));
                    entity.setMaNV(rs.getString("manv"));
                    entity.setThoiGian(rs.getTime("thoigian").toString());
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

    @Override
    public void insert(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Tìm các hóa đơn chưa thanh toán
    public List<HoaDon> selectByStatus(){
        String sql = "select * from hoadon where thanhtoan = 0 order by soban asc";
        return this.selectBySql(sql);
    }
    
    @Override
    public List<HoaDon> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
