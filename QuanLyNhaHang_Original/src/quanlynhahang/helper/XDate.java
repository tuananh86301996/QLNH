/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SONY
 */
public class XDate {
    static SimpleDateFormat formater = new SimpleDateFormat();
    
    //chuyen tu String sang date
    public static Date toDate(String date, String pattern){
        try{
            formater.applyPattern(pattern);
            return formater.parse(date);
        }
        catch(ParseException e){
            throw new RuntimeException(e);
        }
    }
    
    //chuyen tu Date sang String
    public static String toString(Date date, String pattern){
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
    //lấy giờ hiện tại
    public static String getTime(Date date){
        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
        return timeformat.format(date);
    }
    
    //cong them ngay
    public static Date addDays(Date date, long day){
        date.setTime(date.getTime()+day*24*60*60*1000);
        return date;
    }
}
