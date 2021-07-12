/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SONY
 */
public class JDBCHelper {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost;database=PRO104_QLNH";
    static String user ="sa";
    static String pass ="songlong";
    static{
        try{
            Class.forName(driver);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    //chuan bi cau lenh
    public static PreparedStatement getStm(String sql,Object...args)throws SQLException{
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stm;
        if(sql.trim().startsWith("{")){
            stm = conn.prepareCall(sql);
        }
        else{
            stm = conn.prepareStatement(sql);
        }
        
        for(int i=0;i<args.length;i++){
            stm.setObject(i+1, args[i]);
        }
        
        return stm;
    }
    
    //cau lenh query cho select nhieu gia tri
    public static ResultSet query(String sql, Object...args) throws SQLException{
        PreparedStatement stm = JDBCHelper.getStm(sql, args);
        return stm.executeQuery();
    }
    
    //cau lenh tra ve select 1 gia tri
    public static Object value(String sql, Object...args){
        try{
            ResultSet rs = JDBCHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    //cau lenh cho update, insert va delete
    public static int update(String sql,Object...args){
        try{
            PreparedStatement stm = JDBCHelper.getStm(sql, args);
            try{
                return stm.executeUpdate();
            }
            finally{
                stm.getConnection().close();
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
