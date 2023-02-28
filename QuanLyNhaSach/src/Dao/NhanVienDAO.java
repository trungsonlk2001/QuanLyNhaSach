package Dao;

import Entity.ChucVu;
import Entity.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {
    
    ChucVuDAO cvDao = new ChucVuDAO();
    Connection con;
    PreparedStatement stm;
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    int NhanVienID;
    
    private void autoMaNhanVien() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaNhanVien) from NhanVien");
            rs.next();
            NhanVienID = rs.getInt(1)+1;
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
    
    public int addNhanVien(NhanVien nv){
        try {
            autoMaNhanVien();
            String sql = "Insert NhanVien (MaNhanVien,TenNhanVien,NgaySinh,DiaChi,SDT,LuongCoBan,ChucVu)" + 
                            "values (?,?,?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, NhanVienID);
            stm.setString(2, nv.getTenNhanVien());
            stm.setString(3, dfm.format(nv.getNgaySinh()));  
            stm.setString(4, nv.getDiaChi());
            stm.setString(5, nv.getSDT());
            stm.setString(6, Double.toString(nv.getLuongCoBan()));
            stm.setInt(7, nv.getCv().getMaChucVu());    
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm nhân viên: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteNhanVien(NhanVien nv){
        try {
            String sql = "Delete NhanVien where MaNhanVien = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, nv.getMaNhanVien());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa nhân viên: "+e.toString());
        } 
        return -1;     
    }
    
    public int updateNhanVien(NhanVien nv){
        try {
            String sql = "update NhanVien set TenNhanVien = ?, NgaySinh = ?, DiaChi = ?, SDT = ?, LuongCoBan = ?, ChucVu = ? Where MaNhanVien = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setString(1, nv.getTenNhanVien());
            stm.setString(2, dfm.format(nv.getNgaySinh()));           
            stm.setString(3, nv.getDiaChi());
            stm.setString(4, nv.getSDT());   
            stm.setString(5, Double.toString(nv.getLuongCoBan()));
            stm.setInt(6, nv.getCv().getMaChucVu());
            stm.setInt(7,nv.getMaNhanVien());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update nhân viên: "+e.toString());
        }
        return -1;     
    }
    
    public List<NhanVien> layDSNhanVien(){    
        List<NhanVien> dsNV = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT N.MaNhanVien, N.TenNhanVien, N.NgaySinh, N.DiaChi, N.SDT, N.LuongCoBan, \n" +
                         "C.MaChucVu, C.TenChucVu\n" +
                         "FROM NhanVien N JOIN ChucVu C ON N.ChucVu = C.MaChucVu";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setNgaySinh(dfm.parse(rs.getString(3)));
                nv.setDiaChi(rs.getString(4));
                nv.setSDT(rs.getString(5));
                nv.setLuongCoBan(Double.parseDouble(rs.getString(6)));
                nv.setCv(new ChucVu(rs.getInt(7), rs.getString(8)));
                dsNV.add(nv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds nhân viên: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsNV;
    }
    
    public NhanVien layNhanVienTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT N.MaNhanVien, N.TenNhanVien, N.NgaySinh, N.DiaChi, N.SDT, N.LuongCoBan, \n" +
                         "C.MaChucVu, C.TenChucVu\n" +
                         "FROM NhanVien N JOIN ChucVu C ON N.ChucVu = C.MaChucVu\n" +
                         "WHERE MaNhanVien = '" + name +"'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setNgaySinh(dfm.parse(rs.getString(3)));
                nv.setDiaChi(rs.getString(4));
                nv.setSDT(rs.getString(5));
                nv.setLuongCoBan(Double.parseDouble(rs.getString(6)));
                nv.setCv(new ChucVu(rs.getInt(7), rs.getString(8)));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy nhân viên theo mã: "+e.toString());
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
    
    public NhanVien layNhanVienTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT N.MaNhanVien, N.TenNhanVien, N.NgaySinh, N.DiaChi, N.SDT, N.LuongCoBan, \n" +
                         "C.MaChucVu, C.TenChucVu\n" +
                         "FROM NhanVien N JOIN ChucVu C ON N.ChucVu = C.MaChucVu\n" +
                         "WHERE N.TenNhanVien = N'" + name +"'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setNgaySinh(dfm.parse(rs.getString(3)));
                nv.setDiaChi(rs.getString(4));
                nv.setSDT(rs.getString(5));
                nv.setLuongCoBan(Double.parseDouble(rs.getString(6)));
                nv.setCv(new ChucVu(rs.getInt(7), rs.getString(8)));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds nhân viên theo tên: "+e.toString());
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
    
    public NhanVien layNhanVienTheoTKVaMK(String username, String password){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT N.MaNhanVien, N.TenNhanVien, N.NgaySinh, N.DiaChi, N.SDT,N.LuongCoBan, N.ChucVu \n" +
                            "FROM NhanVien N \n" +
                            "JOIN TaiKhoan T ON T.MaNhanVien = N.MaNhanVien\n" +
                            "WHERE T.TenDangNhap = N'" + username + "' AND T.MatKhau = N'" + password +"'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setNgaySinh(dfm.parse(rs.getString(3)));
                nv.setDiaChi(rs.getString(4));
                nv.setSDT(rs.getString(5));
                nv.setLuongCoBan(Double.parseDouble(rs.getString(6)));
                ChucVu cv = cvDao.layChucVuTheoMa(rs.getString(7));
                nv.setCv(cv);
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy nhân viên theo tk mk: "+e.toString());
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
