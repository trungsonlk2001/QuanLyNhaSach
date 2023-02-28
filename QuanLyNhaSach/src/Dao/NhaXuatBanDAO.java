package Dao;

import Entity.NhaXuatBan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NhaXuatBanDAO {
    java.sql.Connection con;
    PreparedStatement stm;
    int NhaXuatBanID;
    
    private void autoMaNhaXuatBan() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaNhaXuatBan) from NhaXuatBan");
            rs.next();
            NhaXuatBanID = rs.getInt(1)+1;
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
    
    public int addNhaXuatBan(NhaXuatBan nxb){
        try {
            autoMaNhaXuatBan();
            String sql = "Insert NhaXuatBan (MaNhaXuatBan,TenNhaXuatBan,DiaChi,SDT,Email)" + 
                            "values (?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, NhaXuatBanID);
            stm.setString(2, nxb.getTenNXB());
            stm.setString(3, nxb.getDiaChi());
            stm.setString(4, nxb.getSDT());
            stm.setString(5, nxb.getEmail());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm NXB: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteNhaXuatBan(NhaXuatBan nxb){
        try {
            String sql = "Delete NhaXuatBan where MaNhaXuatBan = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, nxb.getMaNXB());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa NXB: "+e.toString());
        }
        return -1;     
    }
    
    public int updateNhaXuatBan(NhaXuatBan nxb){
        try {
            String sql = "update NhaXuatBan set TenNhaXuatBan = ?, DiaChi = ?, SDT = ?, Email = ? Where MaNhaXuatBan = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);           
            stm.setString(1, nxb.getTenNXB());
            stm.setString(2, nxb.getDiaChi());
            stm.setString(3, nxb.getSDT());
            stm.setString(4, nxb.getEmail());
            stm.setInt(5, nxb.getMaNXB());
            if(stm.executeUpdate() > 0){
                System.out.println("Cập nhật thành công");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update NXB: "+e.toString());
        }
        return -1;     
    }
    
    public List<NhaXuatBan> layDSNhaXuatBan(){    
        List<NhaXuatBan> dsNXB = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaXuatBan";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getInt(1));
                nxb.setTenNXB(rs.getString(2));
                nxb.setDiaChi(rs.getString(3));
                nxb.setSDT(rs.getString(4));
                nxb.setEmail(rs.getString(5));
                dsNXB.add(nxb);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds NXB: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsNXB;
    }
    
    public NhaXuatBan layNhaXuatBanTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaXuatBan Where MaNhaXuatBan = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getInt(1));
                nxb.setTenNXB(rs.getString(2));
                nxb.setDiaChi(rs.getString(3));
                nxb.setSDT(rs.getString(4));
                nxb.setEmail(rs.getString(5));
                return nxb;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds NXB theo mã: "+e.toString());
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
    
     public NhaXuatBan layNhaXuatBanTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaXuatBan Where TenNhaXuatBan = N'" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getInt(1));
                nxb.setTenNXB(rs.getString(2));
                nxb.setDiaChi(rs.getString(3));
                nxb.setSDT(rs.getString(4));
                nxb.setEmail(rs.getString(5));
                return nxb;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds NXB theo tên: "+e.toString());
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
     
     public NhaXuatBan layNhaXuatBanTheoSDT(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaXuatBan Where SDT = N'" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getInt(1));
                nxb.setTenNXB(rs.getString(2));
                nxb.setDiaChi(rs.getString(3));
                nxb.setSDT(rs.getString(4));
                nxb.setEmail(rs.getString(5));
                return nxb;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds NXB theo sdt: "+e.toString());
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
