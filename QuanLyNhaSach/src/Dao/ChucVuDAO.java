package Dao;

import Entity.ChucVu;
import Entity.ChucVu;
import Entity.ChucVu;
import Entity.ChucVu;
import Entity.ChucVu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChucVuDAO {
    Connection con;
    PreparedStatement stm;
    int ChucVuID;
    
     private void autoMaChucVu() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaChucVu) from ChucVu");
            rs.next();
            ChucVuID = rs.getInt(1)+1;
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        } 
    }
     
     public int addChucVu(ChucVu cv){
        try {
            autoMaChucVu();
            String sql = "Insert ChucVu (MaChucVu, TenChucVu)" + 
                            "values (?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1,ChucVuID);
            stm.setString(2, cv.getTenChucVu());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi add chức vụ: "+e.toString());
        }
        return -1;     
    }
     
    public int deleteChucVu(ChucVu cv){
        try {
            String sql = "Delete ChucVu where MaChucVu = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, cv.getMaChucVu());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa chức vụ: "+e.toString());
        }
        return -1;     
    }
    
    public int updateChucVu(ChucVu cv){
        try {
            String sql = "update ChucVu set TenChucVu = ? Where MaChucVu = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setString(1, cv.getTenChucVu());
            stm.setInt(2, cv.getMaChucVu());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi cập nhật chức vụ: "+e.toString());
        }
        return -1;     
    }
    
    public List<ChucVu> layDSChucVu(){    
        List<ChucVu> dsCV = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from ChucVu";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChucVu cv = new ChucVu();
                cv.setMaChucVu(rs.getInt(1));
                cv.setTenChucVu(rs.getString(2));
                dsCV.add(cv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds chức vụ: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsCV;
    }
    
    public ChucVu layChucVuTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from ChucVu where TenChucVu = N'" +name+ "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChucVu cv = new ChucVu();
                cv.setMaChucVu(rs.getInt(1));
                cv.setTenChucVu(rs.getString(2));
                return cv;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds chức vụ theo tên: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return null;
    }
    
    public ChucVu layChucVuTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from ChucVu where MaChucVu = N'" +name+ "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChucVu cv = new ChucVu();
                cv.setMaChucVu(rs.getInt(1));
                cv.setTenChucVu(rs.getString(2));
                return cv;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds chức vụ theo mã: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return null;
    }
}
