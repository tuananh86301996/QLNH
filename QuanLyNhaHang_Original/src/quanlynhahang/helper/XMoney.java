/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.helper;

import java.text.DecimalFormat;

/**
 *
 * @author SONY
 */
public class XMoney {
    //định dạng tiền
    public static String toString(double money){
        try{
            DecimalFormat formater = new DecimalFormat();
            return formater.format(money);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
