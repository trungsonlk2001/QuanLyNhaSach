package Dao;


import Entity.NhaXuatBan;
import Entity.NhanVien;
import Entity.PhieuNhap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhapDAO {
    Connection con;
    PreparedStatement stm;
    int PhieuNhapID;
        NhaXuatBanDAO nxbDao = new NhaXuatBanDAO();
    NhanVienDAO nvDao = new NhanVienDAO();
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    
    private void autoMaPhieuNhap() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaPhieuNhap) from PhieuNhap");
            rs.next();
            PhieuNhapID = rs.getInt(1)+1;
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
    
    public int addPhieuNhap(PhieuNhap pn){
        try {
            autoMaPhieuNhap();
            String sql = "Insert PhieuNhap (MaPhieuNhap,MaNhanVien,MaNhaXuatBan,NgayLap,TongTien)" + 
                            "values (?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, PhieuNhapID);
            stm.setInt(2, pn.getNhanVien().getMaNhanVien());
            stm.setInt(3, pn.getNXB().getMaNXB());
            stm.setString(4, dfm.format(pn.getNgayLap()));
            stm.setString(5, Double.toString(pn.getTongTien()));
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm phiếu nhập: "+e.toString());
        }
        return -1;     
    }
    
    public int deletePhieuNhap(PhieuNhap s){
        try {
            String sql = "Delete PhieuNhap where MaPhieuNhap = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, s.getMaPhieuNhap());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa phiếu nhập: "+e.toString());
        }
        return -1;     
    }
    
    public List<PhieuNhap> layDSPhieuNhap(){    
        List<PhieuNhap> dsPN = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaPhieuNhap, N.MaNhanVien, C.MaNhaXuatBan, NgayLap, TongTien\n" +
                         "from PhieuNhap P Join NhanVien N On P.MaNhanVien = N.MaNhanVien\n" +
                         "Join NhaXuatBan C ON P.MaNhaXuatBan= C.MaNhaXuatBan";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                PhieuNhap pn = new PhieuNhap();
                pn.setMaPhieuNhap(rs.getInt(1));
                NhaXuatBan nxb = nxbDao.layNhaXuatBanTheoMa(rs.getString(3));
                pn.setNXB(nxb);
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(2));
                pn.setNhanVien(nv);
                pn.setNgayLap(dfm.parse(rs.getString(4)));
                pn.setTongTien(Double.parseDouble(rs.getString(5)));
                dsPN.add(pn);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds phiếu nhập: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsPN;
    }
    
    public PhieuNhap layPhieuNhapTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaPhieuNhap, N.MaNhanVien, C.MaNhaXuatBan, NgayLap, TongTien\n" +
                         "from PhieuNhap P Join NhanVien N On P.MaNhanVien = N.MaNhanVien\n" +
                         "Join NhaXuatBan C ON P.MaNhaXuatBan= C.MaNhaXuatBan WHERE MaPhieuNhap = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                PhieuNhap pn = new PhieuNhap();
                pn.setMaPhieuNhap(rs.getInt(1));
                NhaXuatBan nxb = nxbDao.layNhaXuatBanTheoMa(rs.getString(3));
                pn.setNXB(nxb);
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(2));
                pn.setNhanVien(nv);
                pn.setNgayLap(dfm.parse(rs.getString(4)));
                pn.setTongTien(Double.parseDouble(rs.getString(5)));
                return pn;
            }
        } catch (Exception e) {
            System.out.println("Lỗi phiếu nhập theo mã: "+e.toString());
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
    
    public List<PhieuNhap> timPhieuNhap (String dateFrom, String dateTo){
        List<PhieuNhap> dsPN = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try{
        String sql = "Select MaPhieuNhap, N.MaNhanVien, C.MaNhaXuatBan, NgayLap, TongTien\n" +
                     "from PhieuNhap P Join NhanVien N On P.MaNhanVien = N.MaNhanVien\n" +
                     "Join NhaXuatBan C ON C.MaNhaXuatBan = P.MaNhaXuatBan WHERE NgayLap Between '" + dateFrom + "' and '" + dateTo + "'";
        con = Connect.DatabaseHelper.getConnection();
        stm = con.createStatement();
        rs = stm.executeQuery(sql); 
        while(rs.next()){
                PhieuNhap pn = new PhieuNhap();
                pn.setMaPhieuNhap(rs.getInt(1));
                NhaXuatBan nxb = nxbDao.layNhaXuatBanTheoMa(rs.getString(3));
                pn.setNXB(nxb);
                NhanVien nv = nvDao.layNhanVienTheoMa(rs.getString(2));
                pn.setNhanVien(nv);
                pn.setNgayLap(dfm.parse(rs.getString(4)));
                pn.setTongTien(Double.parseDouble(rs.getString(5)));
                dsPN.add(pn);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds phiếu nhập theo ngày: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsPN;
    }
}
