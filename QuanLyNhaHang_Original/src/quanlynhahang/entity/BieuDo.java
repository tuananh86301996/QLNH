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
public class BieuDo {
    String ngay;
    Double doanhThu;

    public BieuDo(String ngay, Double doanhThu) {
        this.ngay = ngay;
        this.doanhThu = doanhThu;
    }

    public BieuDo() {
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public Double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
