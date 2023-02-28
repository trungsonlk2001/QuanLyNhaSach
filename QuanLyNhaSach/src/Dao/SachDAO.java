package Dao;

import Entity.NhaXuatBan;
import Entity.Sach;
import Entity.TacGia;
import Entity.TheLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SachDAO {
    Connection con;
    PreparedStatement stm;
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    int SachID;
    
    private void autoMaSach() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select (MaSach) from Sach");
            ArrayList<Integer> listMaSach = new ArrayList<Integer>();
            while(rs.next()){
                listMaSach.add(rs.getInt(1));
            }
            Integer max = Collections.max(listMaSach);
            this.SachID = max+1;
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
    
    public int addSach(Sach s){
        try {
            autoMaSach();
            String sql = "Insert Sach (MaSach,TenSach,TacGia,TheLoai,NhaXuatBan,DonGia,SoLuong,HinhAnh)" + 
                            "values (?,?,?,?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, Integer.toString(SachID));
            stm.setString(2, s.getTenSach());
            stm.setInt(3, s.getTacGia().getMaTacGia());  
            stm.setInt(4, s.getTheLoai().getMaTheLoai());
            stm.setInt(5, s.getNXB().getMaNXB());
            stm.setString(6, Double.toString(s.getDonGia()));
            stm.setInt(7, s.getSoLuong());
            stm.setBytes(8, s.getHinhAnh());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm sách: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteSach(Sach s){
        try {
            String sql = "Delete Sach where MaSach = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setString(1, s.getMaSach());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa sách: "+e.toString());
        }
        return -1;     
    }
    
    public int updateSach(Sach s){
        try {
            String sql = "update Sach set TenSach = ?, TacGia = ?, TheLoai = ?, NhaXuatBan = ?, DonGia = ?, SoLuong = ?, HinhAnh = ? Where MaSach = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setString(1, s.getTenSach());
            stm.setInt(2, s.getTacGia().getMaTacGia());
            stm.setInt(3, s.getTheLoai().getMaTheLoai());
            stm.setInt(4, s.getNXB().getMaNXB());
            stm.setString(5, Double.toString(s.getDonGia()));
            stm.setInt(6, s.getSoLuong());
            stm.setBytes(7, s.getHinhAnh());
            stm.setString(8,s.getMaSach());            
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update sách: "+e.toString());
        }
        return -1;     
    }
    
    public List<Sach> layDSSach(){    
        List<Sach> dsS = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaSach, TenSach, \n" +
                        "TG.MaTacGia, TG.TenTacGia, TG.QueQuan, TG.NgaySinh, TG.NgayMat, TG.QuocTich, TG.ChiTiet,\n" +
                        "TL.MaTheLoai, TL.TenTheLoai, \n" +
                        "N.MaNhaXuatBan,N.TenNhaXuatBan, N.DiaChi, N.SDT, N.Email, \n" +
                        "DonGia, SoLuong, HinhAnh\n" +
                        "From Sach S JOIN TheLoai TL ON TL.MaTheLoai = S.TheLoai\n" +
                        "JOIN TacGia TG ON TG.MaTacGia = S.TacGia\n" +
                        "JOIN NhaXuatBan N ON N.MaNhaXuatBan = S.NhaXuatBan";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Sach s = new Sach();
                TacGia tg = new TacGia();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                tg.setMaTacGia(rs.getInt(3));
                tg.setTenTacGia(rs.getString(4));
                tg.setQueQuan(rs.getString(5));
                tg.setNgaySinh(dfm.parse(rs.getString(6)));
                if(rs.getString(7) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(7)));
                }              
                tg.setQuocTich(rs.getString(8));
                tg.setChiTiet(rs.getString(9));
                s.setTacGia(tg);
                s.setTheLoai(new TheLoai(rs.getInt(10), rs.getString(11)));
                s.setNXB(new NhaXuatBan(rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
                s.setDonGia(Double.parseDouble(rs.getString(17)));
                s.setSoLuong(rs.getInt(18));
                s.setHinhAnh(rs.getBytes(19));
                dsS.add(s);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds sách: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsS;
    }
    
    public List<Sach> layDSSachHetHang(){    
        List<Sach> dsS = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaSach, TenSach, \n" +
                        "TG.MaTacGia, TG.TenTacGia, TG.QueQuan, TG.NgaySinh, TG.NgayMat, TG.QuocTich, TG.ChiTiet,\n" +
                        "TL.MaTheLoai, TL.TenTheLoai, \n" +
                        "N.MaNhaXuatBan,N.TenNhaXuatBan, N.DiaChi, N.SDT, N.Email, \n" +
                        "DonGia, SoLuong, HinhAnh\n" +
                        "From Sach S JOIN TheLoai TL ON TL.MaTheLoai = S.TheLoai\n" +
                        "JOIN TacGia TG ON TG.MaTacGia = S.TacGia\n" +
                        "JOIN NhaXuatBan N ON N.MaNhaXuatBan = S.NhaXuatBan\n" +
                        "WHERE s.SoLuong <= 10";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Sach s = new Sach();
                TacGia tg = new TacGia();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                tg.setMaTacGia(rs.getInt(3));
                tg.setTenTacGia(rs.getString(4));
                tg.setQueQuan(rs.getString(5));
                tg.setNgaySinh(dfm.parse(rs.getString(6)));
                if(rs.getString(7) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(7)));
                }              
                tg.setQuocTich(rs.getString(8));
                tg.setChiTiet(rs.getString(9));
                s.setTacGia(tg);
                s.setTheLoai(new TheLoai(rs.getInt(10), rs.getString(11)));
                s.setNXB(new NhaXuatBan(rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
                s.setDonGia(Double.parseDouble(rs.getString(17)));
                s.setSoLuong(rs.getInt(18));
                s.setHinhAnh(rs.getBytes(19));
                dsS.add(s);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds sách hết hàng: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsS;
    }
    
    public List<Sach> layDSSachCanHetHang(){    
        List<Sach> dsS = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaSach, TenSach,\n" +
                        "TG.MaTacGia, TG.TenTacGia, TG.QueQuan, TG.NgaySinh, TG.NgayMat, TG.QuocTich, TG.ChiTiet,\n" +
                        "TL.MaTheLoai, TL.TenTheLoai, \n" +
                        "N.MaNhaXuatBan,N.TenNhaXuatBan, N.DiaChi, N.SDT, N.Email, \n" +
                        "DonGia, SoLuong, HinhAnh\n" +
                        "From Sach S JOIN TheLoai TL ON TL.MaTheLoai = S.TheLoai\n" +
                        "JOIN TacGia TG ON TG.MaTacGia = S.TacGia\n" +
                        "JOIN NhaXuatBan N ON N.MaNhaXuatBan = S.NhaXuatBan\n" +
                        "WHERE s.SoLuong <= 20 AND s.SoLuong >= 1";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Sach s = new Sach();
                TacGia tg = new TacGia();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                tg.setMaTacGia(rs.getInt(3));
                tg.setTenTacGia(rs.getString(4));
                tg.setQueQuan(rs.getString(5));
                tg.setNgaySinh(dfm.parse(rs.getString(6)));
                if(rs.getString(7) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(7)));
                }              
                tg.setQuocTich(rs.getString(8));
                tg.setChiTiet(rs.getString(9));
                s.setTacGia(tg);
                s.setTheLoai(new TheLoai(rs.getInt(10), rs.getString(11)));
                s.setNXB(new NhaXuatBan(rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
                s.setDonGia(Double.parseDouble(rs.getString(17)));
                s.setSoLuong(rs.getInt(18));
                s.setHinhAnh(rs.getBytes(19));
                dsS.add(s);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds sách cận hết hàng: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsS;
    }
    
    public Sach laySachTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaSach, TenSach, \n" +
                        "TG.MaTacGia, TG.TenTacGia, TG.QueQuan, TG.NgaySinh, TG.NgayMat, TG.QuocTich, TG.ChiTiet,\n" +
                        "TL.MaTheLoai, TL.TenTheLoai, \n" +
                        "N.MaNhaXuatBan,N.TenNhaXuatBan, N.DiaChi, N.SDT, N.Email, \n" +
                        "DonGia, SoLuong, HinhAnh\n" +
                        "From Sach S JOIN TheLoai TL ON TL.MaTheLoai = S.TheLoai\n" +
                        "JOIN TacGia TG ON TG.MaTacGia = S.TacGia\n" +
                        "JOIN NhaXuatBan N ON N.MaNhaXuatBan = S.NhaXuatBan \n" +
                        "WHERE TenSach = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Sach s = new Sach();
                TacGia tg = new TacGia();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                tg.setMaTacGia(rs.getInt(3));
                tg.setTenTacGia(rs.getString(4));
                tg.setQueQuan(rs.getString(5));
                tg.setNgaySinh(dfm.parse(rs.getString(6)));
                if(rs.getString(7) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(7)));
                }              
                tg.setQuocTich(rs.getString(8));
                tg.setChiTiet(rs.getString(9));
                s.setTacGia(tg);
                s.setTheLoai(new TheLoai(rs.getInt(10), rs.getString(11)));
                s.setNXB(new NhaXuatBan(rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
                s.setDonGia(Double.parseDouble(rs.getString(17)));
                s.setSoLuong(rs.getInt(18));
                s.setHinhAnh(rs.getBytes(19));
                return s;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds sách theo tên: "+e.toString());
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
    
    public Sach laySachTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT MaSach, TenSach, \n" +
                        "TG.MaTacGia, TG.TenTacGia, TG.QueQuan, TG.NgaySinh, TG.NgayMat, TG.QuocTich, TG.ChiTiet,\n" +
                        "TL.MaTheLoai, TL.TenTheLoai, \n" +
                        "N.MaNhaXuatBan,N.TenNhaXuatBan, N.DiaChi, N.SDT, N.Email, \n" +
                        "DonGia, SoLuong, HinhAnh\n" +
                        "From Sach S JOIN TheLoai TL ON TL.MaTheLoai = S.TheLoai\n" +
                        "JOIN TacGia TG ON TG.MaTacGia = S.TacGia\n" +
                        "JOIN NhaXuatBan N ON N.MaNhaXuatBan = S.NhaXuatBan \n" +
                        "WHERE MaSach = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Sach s = new Sach();
                TacGia tg = new TacGia();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                tg.setMaTacGia(rs.getInt(3));
                tg.setTenTacGia(rs.getString(4));
                tg.setQueQuan(rs.getString(5));
                tg.setNgaySinh(dfm.parse(rs.getString(6)));
                if(rs.getString(7) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(7)));
                }              
                tg.setQuocTich(rs.getString(8));
                tg.setChiTiet(rs.getString(9));
                s.setTacGia(tg);
                s.setTheLoai(new TheLoai(rs.getInt(10), rs.getString(11)));
                s.setNXB(new NhaXuatBan(rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
                s.setDonGia(Double.parseDouble(rs.getString(17)));
                s.setSoLuong(rs.getInt(18));
                s.setHinhAnh(rs.getBytes(19));
                return s;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy sách theo mã: "+e.toString());
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
    
    public int updateSoLuongSach(String name, int soLuong){
        try {
            String sql = "update Sach set  SoLuong = ? Where MaSach = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setInt(1, soLuong);
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update số lượng sách: "+e.toString());
        }
        return -1;     
    }
}
