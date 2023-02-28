package Dao;


import Entity.ChiTietPhieuNhap;
import Entity.PhieuNhap;
import Entity.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ChiTietPhieuNhapDAO {
    java.sql.Connection con;
    PreparedStatement stm;
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    SachDAO sachDao = new SachDAO();
    PhieuNhapDAO pnDao = new PhieuNhapDAO();
    int chiTietPhieuNhapID;
    
    private void autoMaChiTietPhieuNhap() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaChiTietPhieuNhap) from ChiTietPhieuNhap");
            rs.next();
            chiTietPhieuNhapID = rs.getInt(1)+1;
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
    
    public int addChiTietPhieuNhap(ChiTietPhieuNhap ctpn){
        try {
            autoMaChiTietPhieuNhap();
            String sql = "Insert ChiTietPhieuNhap (MaChiTietPhieuNhap,MaSach,MaPhieuNhap,SoLuong,DonGia)" + 
                            "values (?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1,chiTietPhieuNhapID);
            stm.setString(2, ctpn.getSach().getMaSach());
            stm.setInt(3, ctpn.getPhieuNhap().getMaPhieuNhap());           
            stm.setInt(4, ctpn.getSoLuong());
            stm.setDouble(5, ctpn.getDonGia());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteChiTietPhieuNhap(String name){
        try {
            String sql = "Delete ChiTietPhieuNhap where MaPhieuNhap = ?";
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
    
    public List<ChiTietPhieuNhap> layDSChiTietPhieuNhap(String name){    
        List<ChiTietPhieuNhap> dsCTPN = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select MaChiTietPhieuNhap, S.MaSach, H.MaPhieuNhap, C.SoLuong, C.DonGia \n" +
                            "From ChiTietPhieuNhap C Join PhieuNhap H\n" +
                            "On C.MaPhieuNhap = H.MaPhieuNhap Join Sach S\n" +
                            "On C.MaSach = S.MaSach \n" +
                            "Where H.MaPhieuNhap = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
                ctpn.setMaCTPN(rs.getInt(1));
                Sach s = sachDao.laySachTheoMa(rs.getString(2));  
                ctpn.setSach(s);
                PhieuNhap hd = pnDao.layPhieuNhapTheoMa(rs.getString(3));
                ctpn.setPhieuNhap(hd);
                ctpn.setSoLuong(Integer.parseInt(rs.getString(4)));
                ctpn.setDonGia(rs.getDouble(5));
                dsCTPN.add(ctpn);
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
        return dsCTPN;
    }
    
    public List<ChiTietPhieuNhap> layDSThongKeSachNhap(){    
        List<ChiTietPhieuNhap> dsCTPN = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT C.MaSach, C.MaPhieuNhap, SUM(C.SoLuong) AS TONG FROM ChiTietPhieuNhap C\n" +
                         "JOIN Sach S ON S.MaSach = C.MaSach\n" +
                         "GROUP BY C.MaSach, C.MaPhieuNhap";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
                Sach s = sachDao.laySachTheoMa(rs.getString(1));  
                ctpn.setSach(s);
                PhieuNhap hd = pnDao.layPhieuNhapTheoMa(rs.getString(2));
                ctpn.setPhieuNhap(hd);
                ctpn.setSoLuong(Integer.parseInt(rs.getString(3)));
                dsCTPN.add(ctpn);
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
        return dsCTPN;
    }
}
