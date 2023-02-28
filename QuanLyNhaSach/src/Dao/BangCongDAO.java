package Dao;

import Entity.BangCong;
import Entity.NhanVien;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class BangCongDAO {
    java.sql.Connection con;
    PreparedStatement stm;
    int BangCongID;
    NhanVienDAO nvDao = new NhanVienDAO();
    
    private void autoMaBangCong() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaBangCong) from BangCong");
            rs.next();
            BangCongID = rs.getInt(1)+1;
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
    
    public int addBangCong(BangCong bc){
        try {
            autoMaBangCong();
            String sql = "Insert BangCong (MaBangCong,MaNhanVien,SoNgayLam,NghiCoPhep,NghiKhongPhep,Thang,TongTien)" + 
                            "values (?,?,?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, BangCongID);
            stm.setInt(2, bc.getNhanVien().getMaNhanVien());
            stm.setInt(3, bc.getSoNgayLam());
            stm.setInt(4, bc.getNghiCoPhep());
            stm.setInt(5, bc.getNghiKhongPhep());
            stm.setString(6, bc.getThang());
            stm.setDouble(7, bc.getTongTien());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm bảng công: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteBangCong(BangCong bc){
        try {
            String sql = "Delete BangCong where MaBangCong = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, bc.getMaBangCong());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa bảng công: "+e.toString());
        }
        return -1;     
    }
    
    public int updateBangCong(BangCong bc){
        try {
            String sql = "update BangCong set MaNhanVien = ?, SoNgayLam = ?, NghiCoPhep = ?, NghiKhongPhep = ?, Thang = ?, TongTien = ? Where MaBangCong = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setInt(1, bc.getNhanVien().getMaNhanVien());
            stm.setInt(2, bc.getSoNgayLam());
            stm.setInt(3, bc.getNghiCoPhep());
            stm.setInt(4, bc.getNghiKhongPhep());
            stm.setString(5, bc.getThang());           
            stm.setDouble(6, bc.getTongTien());
            stm.setInt(7,bc.getMaBangCong());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update bảng công: "+e.toString());
        }
        return -1;     
    }
    
    public List<BangCong> layDSBangCong(){    
        List<BangCong> dsBC = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from BangCong";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                BangCong bc = new BangCong();
                bc.setMaBangCong(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(String.valueOf(rs.getInt(2)));
                bc.setNhanVien(nv);
                bc.setSoNgayLam(rs.getInt(3));
                bc.setNghiCoPhep(rs.getInt(4));
                bc.setNghiKhongPhep(rs.getInt(5));
                bc.setThang(rs.getString(6));
                bc.setTongTien(rs.getInt(7));
                dsBC.add(bc);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds bang cong: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsBC;
    }
    
    public BangCong layBangCongTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from BangCong Where MaBangCong = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                BangCong bc = new BangCong();
                bc.setMaBangCong(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(String.valueOf(rs.getInt(2)));
                bc.setNhanVien(nv);
                bc.setSoNgayLam(rs.getInt(3));
                bc.setNghiCoPhep(rs.getInt(4));
                bc.setNghiKhongPhep(rs.getInt(5));
                bc.setThang(rs.getString(6));
                bc.setTongTien(rs.getInt(7));
                return bc;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds bang cong: "+e.toString());
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
    
    public BangCong layBangCongTheoMaNVVaThang(String ma, String thang){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from BangCong Where MaNhanVien = '" + ma + "'" +
                            "AND Thang = '" + thang + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                BangCong bc = new BangCong();
                bc.setMaBangCong(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(String.valueOf(rs.getInt(2)));
                bc.setNhanVien(nv);
                bc.setSoNgayLam(rs.getInt(3));
                bc.setNghiCoPhep(rs.getInt(4));
                bc.setNghiKhongPhep(rs.getInt(5));
                bc.setThang(rs.getString(6));
                bc.setTongTien(rs.getInt(7));
                return bc;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds bang cong: "+e.toString());
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
    
    public List<BangCong> layDSBangCongTheoThang(String thang){    
        List<BangCong> dsBC = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from BangCong Where Thang = '" + thang + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                BangCong bc = new BangCong();
                bc.setMaBangCong(rs.getInt(1));
                NhanVien nv = nvDao.layNhanVienTheoMa(String.valueOf(rs.getInt(2)));
                bc.setNhanVien(nv);
                bc.setSoNgayLam(rs.getInt(3));
                bc.setNghiCoPhep(rs.getInt(4));
                bc.setNghiKhongPhep(rs.getInt(5));
                bc.setThang(rs.getString(6));
                bc.setTongTien(rs.getInt(7));
                dsBC.add(bc);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds bang cong theo thang: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsBC;
    }
}
