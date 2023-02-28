package Dao;

import Entity.NhaCungCap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NhaCungCapDAO {
    java.sql.Connection con;
    PreparedStatement stm;
    int NhaCungCapID;
    
    private void autoMaNhaCungCap() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaNhaCungCap) from NhaCungCap");
            rs.next();
            NhaCungCapID = rs.getInt(1)+1;
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
    
    public int addNhaCungCap(NhaCungCap ncc){
        try {
            autoMaNhaCungCap();
            String sql = "Insert NhaCungCap (MaNhaCungCap,TenNhaCungCap,DiaChi,SDT,Email)" + 
                            "values (?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, Integer.toString(NhaCungCapID));
            stm.setString(2, ncc.getTenNCC());
            stm.setString(3, ncc.getDiaChi());
            stm.setString(4, ncc.getSDT());
            stm.setString(5, ncc.getEmail());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteNhaCungCap(NhaCungCap ncc){
        try {
            String sql = "Delete NhaCungCap where MaNhaCungCap = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, ncc.getMaNCC());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
        return -1;     
    }
    
    public int updateNhaCungCap(NhaCungCap ncc){
        try {
            String sql = "update NhaCungCap set TenNhaCungCap = ?, DiaChi = ?, SDT = ?, Email = ? Where MaNhaCungCap = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);           
            stm.setString(1, ncc.getTenNCC());
            stm.setString(2, ncc.getDiaChi());
            stm.setString(3, ncc.getSDT());
            stm.setString(4, ncc.getEmail());
            stm.setString(5, ncc.getMaNCC());
            if(stm.executeUpdate() > 0){
                System.out.println("Cập nhật thành công");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
        return -1;     
    }
    
    public List<NhaCungCap> layDSNhaCungCap(){    
        List<NhaCungCap> dsNCC = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaCungCap";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChi(rs.getString(3));
                ncc.setSDT(rs.getString(4));
                ncc.setEmail(rs.getString(5));
                dsNCC.add(ncc);
            }
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
        return dsNCC;
    }
    
    public NhaCungCap layNhaCungCapTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaCungCap Where MaNhaCungCap = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChi(rs.getString(3));
                ncc.setSDT(rs.getString(4));
                ncc.setEmail(rs.getString(5));
                return ncc;
            }
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
        return null;
    }
    
     public NhaCungCap layNhaCungCapTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM NhaCungCap Where TenNhaCungCap = N'" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhaCungCap ncc = new NhaCungCap();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChi(rs.getString(3));
                ncc.setSDT(rs.getString(4));
                ncc.setEmail(rs.getString(5));
                return ncc;
            }
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
        return null;
    }
}
