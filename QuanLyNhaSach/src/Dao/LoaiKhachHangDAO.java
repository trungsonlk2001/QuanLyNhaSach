package Dao;

import Entity.LoaiKhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoaiKhachHangDAO {
    Connection con;
    PreparedStatement stm;
    int LoaiKhachHangID;
    
     private void autoMaLoaiKhachHang() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaLoaiKhachHang) from LoaiKhachHang");
            rs.next();
            LoaiKhachHangID = rs.getInt(1)+1;
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
    
    public int addLoaiKhachHang(LoaiKhachHang lkh){
        try {
            autoMaLoaiKhachHang();
            String sql = "Insert LoaiKhachHang (MaLoaiKhachHang, TenLoaiKhachHang)" + 
                            "values (?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1,Integer.toString(LoaiKhachHangID));
            stm.setString(2, lkh.getTenLoaiKhachHang());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm loại khách hàng: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteLoaiKhachHang(LoaiKhachHang lkh){
        try {
            String sql = "Delete LoaiKhachHang where MaLoaiKhachHang = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, lkh.getMaLoaiKhachHang());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa loại khách hàng: "+e.toString());
        }
        return -1;     
    }
    
    public int updateLoaiKhachHang(LoaiKhachHang lkh){
        try {
            String sql = "update LoaiKhachHang set TenLoaiKhachHang = ? Where MaLoaiKhachHang = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setString(1, lkh.getTenLoaiKhachHang());
            stm.setInt(2, lkh.getMaLoaiKhachHang());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update loại khách hàng: "+e.toString());
        }
        return -1;     
    }
    
    
    public List<LoaiKhachHang> layDSLoaiKhachHang(){    
        List<LoaiKhachHang> dsTL = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from LoaiKhachHang";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                LoaiKhachHang lkh = new LoaiKhachHang();
                lkh.setMaLoaiKhachHang(rs.getInt(1));
                lkh.setTenLoaiKhachHang(rs.getString(2));
                dsTL.add(lkh);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds loại khách hàng: "+e.toString());
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
    
    public LoaiKhachHang layTenLoaiKhachHang(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from LoaiKhachHang where TenLoaiKhachHang = N'" +name+ "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                LoaiKhachHang lkh = new LoaiKhachHang();
                lkh.setMaLoaiKhachHang(rs.getInt(1));
                lkh.setTenLoaiKhachHang(rs.getString(2));
                return lkh;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds theo tên loại khách hàng: "+e.toString());
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
    
    public LoaiKhachHang lay1KhachHang(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from LoaiKhachHang where MaLoaiKhachHang = N'" +name+ "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                LoaiKhachHang lkh = new LoaiKhachHang();
                lkh.setMaLoaiKhachHang(rs.getInt(1));
                lkh.setTenLoaiKhachHang(rs.getString(2));
                return lkh;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy 1 loại khách hàng theo tên: "+e.toString());
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
