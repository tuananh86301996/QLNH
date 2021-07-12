/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.helper;

import quanlynhahang.entity.Ban;
import quanlynhahang.entity.DatBan;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.entity.SanPham;

/**
 *
 * @author SONY
 */
public class Auth {
    public static NhanVien user = null;                                         //cho người dùng
    public static Ban ban = null;
    public static SanPham sanpham = null;
    public static DatBan datban = null;
    public static NhanVien nhanvien = null;                                     //cho bảng nhân viên
    
    public static void clear(){
        Auth.user = null;
    }
    
    //kiem tra dang dang nhap
    public static boolean isLogin(){
        return Auth.user != null;
    }
    
    //kiem tra co phai la quan ly
    public static boolean isManager(){
        return Auth.isLogin() && user.getVaiTro();
    }
}
