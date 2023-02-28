package Dao;

import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChiTietHoaDonDAO {
    java.sql.Connection con;
    PreparedStatement stm;
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    SachDAO sachDao = new SachDAO();
    HoaDonDAO hdDao = new HoaDonDAO();
    int chiTietHoaDonID;
    
    private void autoMaChiTietHoaDon() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaChiTietHoaDon) from ChiTietHoaDon");
            rs.next();
            chiTietHoaDonID = rs.getInt(1)+1;
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
    
    public int addChiTietHoaDon(ChiTietHoaDon cthd){
        try {
            autoMaChiTietHoaDon();
            String sql = "Insert ChiTietHoaDon (MaChiTietHoaDon,MaSach,MaHoaDon,SoLuong)" + 
                            "values (?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1,chiTietHoaDonID);
            stm.setString(2, cthd.getSach().getMaSach());
            stm.setInt(3, cthd.getHoaDon().getMaHoaDon());           
            stm.setInt(4, cthd.getSoLuong());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteChiTietHoaDon(String name){
        try {
            String sql = "Delete ChiTietHoaDon where MaHoaDon = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, name);
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
        return -1;     
    }
       
    public List<ChiTietHoaDon> layDSChiTietHoaDon(String name){    
        List<ChiTietHoaDon> dsCTHD = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select MaChiTietHoaDon, S.MaSach, H.MaHoaDon, C.SoLuong \n" +
                            "From ChiTietHoaDon C Join HoaDon H\n" +
                            "On C.MaHoaDon = H.MaHoaDon Join Sach S\n" +
                            "On C.MaSach = S.MaSach \n" +
                            "Where H.MaHoaDon = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaCTHD(rs.getInt(1));
                Sach s = sachDao.laySachTheoMa(rs.getString(2));  
                cthd.setSach(s);
                HoaDon hd = hdDao.layHoaDonTheoMa(rs.getString(3));
                cthd.setHoaDon(hd);
                cthd.setSoLuong(Integer.parseInt(rs.getString(4)));
                dsCTHD.add(cthd);
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
        return dsCTHD;
    }
    
     public List<ChiTietHoaDon> layDSThongKeSachBan(){    
        List<ChiTietHoaDon> dsCTHD = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT C.MaSach, S.TenSach, SUM(C.SoLuong) AS TONG FROM ChiTietHoaDon C\n" +
                            "JOIN Sach S ON S.MaSach = C.MaSach\n" +
                            "GROUP BY C.MaSach, S.TenSach";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setMaCTHD(rs.getInt(1));
                Sach s = sachDao.laySachTheoMa(rs.getString(2));  
                cthd.setSach(s);
                HoaDon hd = hdDao.layHoaDonTheoMa(rs.getString(3));
                cthd.setHoaDon(hd);
                cthd.setSoLuong(Integer.parseInt(rs.getString(4)));
                dsCTHD.add(cthd);
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
        return dsCTHD;
    }
}
