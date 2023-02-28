package Dao;

import Entity.KhachHang;
import Entity.LoaiKhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KhachHangDAO {
    Connection con;
    PreparedStatement stm;
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    int KhachHangID;
    
    private void autoMaKhachHang() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select (MaKhachHang) from KhachHang");
            ArrayList<Integer> listMaKH = new ArrayList<Integer>();
            while(rs.next()){
                listMaKH.add(rs.getInt(1));
            }
            Integer max = Collections.max(listMaKH);
            this.KhachHangID = max+1;
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
    
    public int addKhachHang(KhachHang kh){
        try {
            autoMaKhachHang();
            String sql = "Insert KhachHang (MaKhachHang,TenKhachHang,NgaySinh,Email,DiaChi,SoDienThoai,LoaiKhachHang)" + 
                            "values (?,?,?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, KhachHangID);
            stm.setString(2, kh.getTenKhachHang());
            stm.setString(3, dfm.format(kh.getNgaySinh()));  
            stm.setString(4, kh.getEmail());
            stm.setString(5, kh.getDiaChi());
            stm.setString(6, kh.getSDT());
            stm.setInt(7, kh.getLoai().getMaLoaiKhachHang());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm khách hàng: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteKhachHang(KhachHang kh){
        try {
            String sql = "Delete KhachHang where MaKhachHang = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, kh.getMaKhachHang());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa khách hàng: "+e.toString());
        }
        return -1;     
    }
    
    public int updateKhachHang(KhachHang kh){
        try {
            String sql = "update KhachHang set TenKhachHang = ?, NgaySinh = ?, Email = ?, DiaChi = ?, SoDienThoai = ?, LoaiKhachHang = ? Where MaKhachHang = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setString(1, kh.getTenKhachHang());
            stm.setString(2, dfm.format(kh.getNgaySinh()));
            stm.setString(3, kh.getEmail());
            stm.setString(4, kh.getDiaChi());
            stm.setString(5, kh.getSDT());           
            stm.setInt(6, kh.getLoai().getMaLoaiKhachHang());
            stm.setInt(7,kh.getMaKhachHang());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update khách hàng: "+e.toString());
        }
        return -1;     
    }
    
    
    public List<KhachHang> layDSKhachHang(){    
        List<KhachHang> dsKH = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "select MaKhachHang, TenKhachHang, NgaySinh,Email, DiaChi,SoDienThoai,MaLoaiKhachHang,TenLoaiKhachHang \n "
                    + "from KhachHang Join LoaiKhachHang on KhachHang.LoaiKhachHang = LoaiKhachHang.MaLoaiKhachHang";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setNgaySinh(dfm.parse(rs.getString(3)));
                kh.setEmail(rs.getString(4));
                kh.setDiaChi(rs.getString(5));
                kh.setSDT(rs.getString(6));
                kh.setLoai(new LoaiKhachHang(rs.getInt(7), rs.getString(8)));
                dsKH.add(kh);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds khách hàng: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsKH;
    }
    
    public KhachHang layKhachHangTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT  MaKhachHang, TenKhachHang, NgaySinh, Email, DiaChi, SoDienThoai, MaLoaiKhachHang, TenLoaiKhachHang\n" +
                            "FROM KhachHang K JOIN LoaiKhachHang L \n" +
                            "ON K.LoaiKhachHang = L.MaLoaiKhachHang \n" +
                            "WHERE MaKhachHang = '" + name + " '";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setNgaySinh(dfm.parse(rs.getString(3)));
                kh.setEmail(rs.getString(4));
                kh.setDiaChi(rs.getString(5));
                kh.setSDT(rs.getString(6));
                kh.setLoai(new LoaiKhachHang(rs.getInt(7), rs.getString(7)));
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds khách hàng theo mã: "+e.toString());
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
    
    public KhachHang layKhachHangTheoSDT(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT  MaKhachHang, TenKhachHang, NgaySinh, Email, DiaChi, SoDienThoai, MaLoaiKhachHang, TenLoaiKhachHang\n" +
                            "FROM KhachHang K JOIN LoaiKhachHang L \n" +
                            "ON K.LoaiKhachHang = L.MaLoaiKhachHang \n" +
                            "WHERE SoDienThoai = '" + name + " '";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setNgaySinh(dfm.parse(rs.getString(3)));
                kh.setEmail(rs.getString(4));
                kh.setDiaChi(rs.getString(5));
                kh.setSDT(rs.getString(6));
                kh.setLoai(new LoaiKhachHang(rs.getInt(7), rs.getString(7)));
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds khách hàng theo sdt: "+e.toString());
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
    
    public LoaiKhachHang layTenLoaiKhachHang(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "Select * from LoaiKhachHang where TenLoaiKhachHang = N'" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                LoaiKhachHang loai = new LoaiKhachHang();
                loai.setMaLoaiKhachHang(rs.getInt(1));
                loai.setTenLoaiKhachHang(rs.getString(2));
                return loai;
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
    
    public List<LoaiKhachHang> layDSLoaiKhachHang(){
        List<LoaiKhachHang> dsLoai  = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "select * from LoaiKhachHang";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                LoaiKhachHang loai = new LoaiKhachHang();
                loai.setMaLoaiKhachHang(rs.getInt(1));
                loai.setTenLoaiKhachHang(rs.getString(2));
                dsLoai.add(loai);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsLoai;
    }
    
}
