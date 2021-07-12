/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.entity;

/**
 *
 * @author SONY
 */
public class DatBan {
    String sodt;
    String tenKhach;
    String thoiGian;
    int soNguoi;
    String ghiChu;
    int soBan;

    public DatBan(String sodt, String tenKhach, String thoiGian, int soNguoi, String ghiChu, int soBan) {
        this.sodt = sodt;
        this.tenKhach = tenKhach;
        this.thoiGian = thoiGian;
        this.soNguoi = soNguoi;
        this.ghiChu = ghiChu;
        this.soBan = soBan;
    }

    public DatBan() {
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    
    
}
