package Dao;

import Entity.TheLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TheLoaiDAO {
     Connection con;
    PreparedStatement stm;
    int TheLoaiID;
    
     private void autoMaTheLoai() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaTheLoai) from TheLoai");
            rs.next();
            TheLoaiID = rs.getInt(1)+1;
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
     
     public int addTheLoai(TheLoai tl){
        try {
            autoMaTheLoai();
            String sql = "Insert TheLoai (MaTheLoai, TenTheLoai)" + 
                            "values (?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, TheLoaiID);
            stm.setString(2, tl.getTenTheLoai());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm thể loại: "+e.toString());
        }
        return -1;     
    }
     
    public int deleteTheLoai(TheLoai tl){
        try {
            String sql = "Delete TheLoai where MaTheLoai = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, tl.getMaTheLoai());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa thể loại: "+e.toString());
        }
        return -1;     
    }
     
     public int updateTheLoai(TheLoai tl){
        try {
            String sql = "update TheLoai set TenTheLoai = ? Where MaTheLoai = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setString(1, tl.getTenTheLoai());
            stm.setInt(2, tl.getMaTheLoai());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update thể loại: "+e.toString());
        }
        return -1;     
    }
     
     public List<TheLoai> layDSTheLoai(){    
        List<TheLoai> dsTL = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from TheLoai";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TheLoai tl = new TheLoai();
                tl.setMaTheLoai(rs.getInt(1));
                tl.setTenTheLoai(rs.getString(2));
                dsTL.add(tl);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds thể loại: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsTL;
    }
     
    public TheLoai layTheLoaiTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from TheLoai where TenTheLoai = N'" +name+ "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TheLoai tl = new TheLoai();
                tl.setMaTheLoai(rs.getInt(1));
                tl.setTenTheLoai(rs.getString(2));
                return tl;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy thể loại theo tên: "+e.toString());
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
    
    public TheLoai layTheLoaiTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from TheLoai where MaTheLoai = N'" +name+ "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TheLoai tl = new TheLoai();
                tl.setMaTheLoai(rs.getInt(1));
                tl.setTenTheLoai(rs.getString(2));
                return tl;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy thể loại theo mã: "+e.toString());
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
