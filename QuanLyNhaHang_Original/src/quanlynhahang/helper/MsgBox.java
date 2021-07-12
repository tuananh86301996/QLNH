/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class MsgBox {
    //message thong bao
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message,"Hệ thống quản lý nhà hàng 5G",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //message cau hoi yes,no
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message,"Hệ thống quản lý nhà hàng 5G",JOptionPane.YES_NO_OPTION);
        return result == JOptionPane.YES_OPTION;
    }
    
    
    //message dien prompt
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent, message,"Hệ thống quản lý nhà hàng 5G",JOptionPane.INFORMATION_MESSAGE);
    }
}
