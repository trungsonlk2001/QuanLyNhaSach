package Dao;

import Entity.HoaDon;
import Entity.KhachHang;
import Entity.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO {
    Connection con;
    PreparedStatement stm;
    int HoaDonID;
    KhachHangDAO khDao = new KhachHangDAO();
    NhanVienDAO nvDao = new NhanVienDAO();
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    
    private void autoMaHoaDon() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaHoaDon) from HoaDon");
            rs.next();
            HoaDonID = rs.getInt(1)+1;
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
    
    public int addHoaDon(HoaDon hd){
        try {
            autoMaHoaDon();
            String sql = "Insert HoaDon (MaHoaDon,MaKhachHang,MaNhanVien,NgayLapHoaDon,ChietKhau,TongTien)" + 
                            "values (?,?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, HoaDonID);
            stm.setInt(2, hd.getKhachHang().getMaKhachHang());
            stm.setInt(3, hd.getNhanVien().getMaNhanVien());
            stm.setString(4, dfm.format(hd.getNgayLap()));
            stm.setFloat(5, hd.getChietKhau());
            stm.setString(6, Double.toString(hd.getTongTien()));
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm hóa đơn: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteHoaDon(HoaDon s){
        try {
            String sql = "Delete HoaDon where MaHoaDon = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, s.getMaHoaDon());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa hóa đơn: "+e.toString());
        }
        return -1;     
    }
    
    
    public List<HoaDon> layDSHoaDon(){    
        List<HoaDon> dsHD = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from HoaDon";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                KhachHang kh = khDao.layKhachHangTheoMa(rs.getString(2));
                hd.setKhachHang(kh);
                if(rs.getString(3) == null){
                    hd.setNhanVien(null);
                } else {
                    NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(3));
                    hd.setNhanVien(nv);
                }              
                hd.setNgayLap(dfm.parse(rs.getString(4)));
                hd.setChietKhau(rs.getFloat(5));
                hd.setTongTien(Double.parseDouble(rs.getString(6)));
                dsHD.add(hd);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds hóa đơn: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsHD;
    }
    
    public HoaDon layHoaDonTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from HoaDon WHERE MaHoaDon = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                KhachHang kh = khDao.layKhachHangTheoMa(rs.getString(2));
                hd.setKhachHang(kh);
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(3));
                hd.setNhanVien(nv);
                hd.setNgayLap(dfm.parse(rs.getString(4)));
                hd.setChietKhau(rs.getFloat(5));
                hd.setTongTien(Double.parseDouble(rs.getString(6)));
                return hd;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds hóa đơn theo mã: "+e.toString());
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
    
    public List<HoaDon> timHoaDon (String dateFrom, String dateTo){
        List<HoaDon> dsHD = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try{
        String sql = "Select MaHoaDon, K.MaKhachHang, N.MaNhanVien, NgayLapHoaDon, ChietKhau, TongTien\n" +
                     "from HoaDon H Join NhanVien N On H.MaNhanVien = N.MaNhanVien\n" +
                     "Join KhachHang K ON K.MaKhachHang = H.MaKhachHang WHERE NgayLapHoaDon Between '" + dateFrom + "' and '" + dateTo + "'";
        con = Connect.DatabaseHelper.getConnection();
        stm = con.createStatement();
        rs = stm.executeQuery(sql); 
        while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                KhachHang kh = khDao.layKhachHangTheoMa(rs.getString(2));
                hd.setKhachHang(kh);
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(3));
                hd.setNhanVien(nv);
                hd.setNgayLap(dfm.parse(rs.getString(4)));
                hd.setChietKhau(rs.getFloat(5));
                hd.setTongTien(Double.parseDouble(rs.getString(6)));
                dsHD.add(hd);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds hóa đơn theo ngày: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsHD;
    }
    
    public List<HoaDon> timHoaDonTheoSDTKhach (String SDT){
        List<HoaDon> dsHD = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try{
        String sql = "Select MaHoaDon, K.MaKhachHang, N.MaNhanVien, NgayLapHoaDon, ChietKhau, TongTien\n" +
                     "from HoaDon H Join NhanVien N On H.MaNhanVien = N.MaNhanVien\n" +
                     "Join KhachHang K ON K.MaKhachHang = H.MaKhachHang WHERE K.SoDienThoai = '" + SDT + "'" +
                     "Group by MaHoaDon, K.MaKhachHang, N.MaNhanVien, NgayLapHoaDon, ChietKhau, TongTien";
        con = Connect.DatabaseHelper.getConnection();
        stm = con.createStatement();
        rs = stm.executeQuery(sql); 
        while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt(1));
                KhachHang kh = khDao.layKhachHangTheoMa(rs.getString(2));
                hd.setKhachHang(kh);
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(3));
                hd.setNhanVien(nv);
                hd.setNgayLap(dfm.parse(rs.getString(4)));
                hd.setChietKhau(rs.getFloat(5));
                hd.setTongTien(Double.parseDouble(rs.getString(6)));
                dsHD.add(hd);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds hóa đơn theo SDT: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsHD;
    }
}
