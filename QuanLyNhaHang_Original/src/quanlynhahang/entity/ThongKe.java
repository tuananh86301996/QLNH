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
public class ThongKe {
    double tongDoanhThu;
    int soGiaoDich;

    public ThongKe(double tongDoanhThu, int soGiaoDich) {
        this.tongDoanhThu = tongDoanhThu;
        this.soGiaoDich = soGiaoDich;
    }

    public ThongKe() {
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public int getSoGiaoDich() {
        return soGiaoDich;
    }

    public void setSoGiaoDich(int soGiaoDich) {
        this.soGiaoDich = soGiaoDich;
    }
    
    
}
