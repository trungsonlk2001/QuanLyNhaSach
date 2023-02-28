package Dao;

import Entity.NhanVien;
import Entity.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAO {
    Connection con;
    PreparedStatement stm;
    int TaiKhoanID;
    NhanVienDAO nvDao = new NhanVienDAO();
    
    private void autoMaTaiKhoan() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaTaiKhoan) from TaiKhoan");
            rs.next();
            TaiKhoanID = rs.getInt(1)+1;
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
    
    public int addTaiKhoan(TaiKhoan tk){
        try {
            autoMaTaiKhoan();
            String sql = "Insert TaiKhoan (MaTaiKhoan,MaNhanVien,TenDangNhap,MatKhau)" + 
                            "values (?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, TaiKhoanID);
            stm.setInt(2, tk.getNhanVien().getMaNhanVien());
            stm.setString(3, tk.getTenDangNhap());
            stm.setString(4, tk.getMatKhau());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi them tai khoan: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteTaiKhoan(TaiKhoan tk){
        try {
            String sql = "Delete TaiKhoan where MaTaiKhoan = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, tk.getMaTaiKhoan());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xoa tai khoan: "+e.toString());
        }
        return -1;     
    }
    
    public int updateTaiKhoan(TaiKhoan tk){
        try {
            String sql = "update TaiKhoan set MaNhanVien = ?, TenDangNhap = ?, MatKhau = ? Where MaTaiKhoan = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setInt(1, tk.getNhanVien().getMaNhanVien());
            stm.setString(2, tk.getTenDangNhap());
            stm.setString(3, tk.getMatKhau());  
            stm.setInt(4, tk.getMaTaiKhoan());  
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi cap nhat tai khoan: "+e.toString());
        }
        return -1;     
    }
    
    public List<TaiKhoan> layDSTaiKhoan(){    
        List<TaiKhoan> dsTK = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from TaiKhoan";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TaiKhoan tk = new TaiKhoan();
                tk.setMaTaiKhoan(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(2));
                tk.setNhanVien(nv);
                tk.setTenDangNhap(rs.getString(3));
                tk.setMatKhau(rs.getString(4));
                dsTK.add(tk);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lay danh sach: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsTK;
    }
    
    public TaiKhoan layTaiKhoanTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from TaiKhoan Where MaTaiKhoan = '" +name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TaiKhoan tk = new TaiKhoan();
                tk.setMaTaiKhoan(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(2));
                tk.setNhanVien(nv);
                tk.setTenDangNhap(rs.getString(3));
                tk.setMatKhau(rs.getString(4));
                return tk;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lay danh sach: "+e.toString());
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
    
    public TaiKhoan layTaiKhoanTheoTKVaMK(String username, String password){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from TaiKhoan WHERE TenDangNhap = N'" + username + "' AND MatKhau = N'" + password + "'" ;
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TaiKhoan tk = new TaiKhoan();
                tk.setMaTaiKhoan(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(2));
                tk.setNhanVien(nv);
                tk.setTenDangNhap(rs.getString(3));
                tk.setMatKhau(rs.getString(4));
                return tk;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lay danh sach: "+e.toString());
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
