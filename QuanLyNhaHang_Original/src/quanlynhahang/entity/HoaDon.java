/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.entity;

import java.util.Date;

/**
 *
 * @author SONY
 */
public class HoaDon {
    int maHD;
    Date ngay;
    String ca;
    int chietKhau;
    String lyDo;
    Double thanhTien;
    Boolean thanhToan;
    int soBan;
    String maNV;
    String thoiGian;

    public HoaDon(int maHD, Date ngay, String ca, int chietKhau, String lyDo, Double thanhTien, boolean thanhToan, int soBan, String maNV) {
        this.maHD = maHD;
        this.ngay = ngay;
        this.ca = ca;
        this.chietKhau = chietKhau;
        this.lyDo = lyDo;
        this.thanhTien = thanhTien;
        this.thanhToan = thanhToan;
        this.soBan = soBan;
        this.maNV = maNV;
    }

    public HoaDon() {
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Boolean getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(Boolean thanhToan) {
        this.thanhToan = thanhToan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String toString(){
        return String.valueOf(this.soBan);
    }
}
