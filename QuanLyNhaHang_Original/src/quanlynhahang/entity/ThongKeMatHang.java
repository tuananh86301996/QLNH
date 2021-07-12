/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.entity;

/**
 *
 * @author Admin
 */
public class ThongKeMatHang {
    String tenSP;
    String hinh;
    int soLuong;

    public ThongKeMatHang(String tenSP, String hinh, int soLuong) {
        this.tenSP = tenSP;
        this.hinh = hinh;
        this.soLuong = soLuong;
    }

    public ThongKeMatHang() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
