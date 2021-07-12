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
public class SanPham {
    int maSp;
    String tenSp;
    Double donGia;
    Boolean tinhTrang;
    String hinh;
    String mota;
    int maloai;

    public SanPham(int maSp, String tenSp, Double donGia, boolean tinhTrang, String hinh, String mota, int maloai) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.tinhTrang = tinhTrang;
        this.hinh = hinh;
        this.mota = mota;
        this.maloai = maloai;
    }

    public SanPham() {
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }


    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    
}
