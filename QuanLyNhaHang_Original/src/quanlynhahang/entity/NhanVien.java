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
public class NhanVien {
    String maNV;
    String tenNV;
    String matkhau;
    Boolean vaiTro;
    Boolean gioiTinh;
    String soDT;
    String ca;
    String email;
    Date ngaySinh;
    Date ngayLam;
    String diaChi;
    String avata;

    public NhanVien(String maNV, String tenNV, String matkhau, Boolean vaiTro, Boolean gioiTinh, String soDT, String ca, String email, Date ngaySinh, Date ngayLam, String diaChi, String avata) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matkhau = matkhau;
        this.vaiTro = vaiTro;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ca = ca;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.ngayLam = ngayLam;
        this.diaChi = diaChi;
        this.avata = avata;
    }   

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public Boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(Date ngayLam) {
        this.ngayLam = ngayLam;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getAvata() {
        return avata;
    }

    public void setAvata(String avata) {
        this.avata = avata;
    }

    
    
}
