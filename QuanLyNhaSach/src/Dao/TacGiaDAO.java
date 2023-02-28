package Dao;

import Entity.TacGia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.Types;
import java.util.Collections;

public class TacGiaDAO {
     Connection con;
    PreparedStatement stm;
    SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
    int TacGiaID;
    
    private void autoMaTacGia() throws SQLException{
        Statement stm = null;
        ResultSet rs = null;        
        try {
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select Max(MaTacGia) from TacGia");
            ArrayList<Integer> listMaTacGia = new ArrayList<Integer>();
            while(rs.next()){
                listMaTacGia.add(rs.getInt(1));
            }
            Integer max = Collections.max(listMaTacGia);
            this.TacGiaID = max+1;
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
    
    public int addTacGia(TacGia tg){
        try {
            autoMaTacGia();
            String sql = "Insert TacGia (MaTacGia,TenTacGia,QueQuan,NgaySinh,NgayMat,QuocTich,ChiTiet)" + 
                            "values (?,?,?,?,?,?,?)";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, TacGiaID);
            stm.setString(2, tg.getTenTacGia());
            stm.setString(3, tg.getQueQuan());
            stm.setString(4, dfm.format(tg.getNgaySinh())); 
            if(tg.getNgayMat() == null){
                stm.setNull(5, Types.DATE);
            } else {
                stm.setString(5, dfm.format(tg.getNgayMat())); 
            }            
            stm.setString(6, tg.getQuocTich());
            stm.setString(7, tg.getChiTiet());
            if(stm.executeUpdate() > 0){
                System.out.println("Them thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi thêm tác giả: "+e.toString());
        }
        return -1;     
    }
    
    public int deleteTacGia(TacGia tg){
        try {
            String sql = "Delete TacGia where MaTacGia = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);
            stm.setInt(1, tg.getMaTacGia());
            if(stm.executeUpdate() > 0){
                System.out.println("Xoa thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi xóa tác giả: "+e.toString());
        }
        return -1;     
    }
    
    public int updateTacGia(TacGia tg){
        try {
            String sql = "update TacGia set TenTacGia = ?, QueQuan = ?, NgaySinh = ?, NgayMat = ?, QuocTich = ?, ChiTiet = ? Where MaTacGia = ?";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.prepareStatement(sql);            
            stm.setInt(7, tg.getMaTacGia());
            stm.setString(1, tg.getTenTacGia());
            stm.setString(2, tg.getQueQuan());
            stm.setString(3, dfm.format(tg.getNgaySinh())); 
            if(tg.getNgayMat() == null){
                stm.setNull(4, Types.DATE);
            } else {
                stm.setString(4, dfm.format(tg.getNgayMat())); 
            }          
            stm.setString(5, tg.getQuocTich());
            stm.setString(6, tg.getChiTiet());
            if(stm.executeUpdate() > 0){
                System.out.println("Cap nhat thanh cong");
                return 1;
            }           
        } catch (Exception e) {
            System.out.println("Lỗi update tác giả: "+e.toString());
        }
        return -1;     
    }
    
    public List<TacGia> layDSTacGia(){    
        List<TacGia> dsTG = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM TacGia";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TacGia tg = new TacGia();
                tg.setMaTacGia(rs.getInt(1));
                tg.setTenTacGia(rs.getString(2));
                tg.setQueQuan(rs.getString(3));
                tg.setNgaySinh(dfm.parse(rs.getString(4)));
                if(rs.getString(5) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(5)));
                }              
                tg.setQuocTich(rs.getString(6));
                tg.setChiTiet(rs.getString(7));
                dsTG.add(tg);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy ds tác giả: "+e.toString());
        } finally{
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return dsTG;
    }
    
    public TacGia layTacGiaTheoTen(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM TacGia WHERE TenTacGia = N'" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TacGia tg = new TacGia();
                tg.setMaTacGia(rs.getInt(1));
                tg.setTenTacGia(rs.getString(2));
                tg.setQueQuan(rs.getString(3));
                tg.setNgaySinh(dfm.parse(rs.getString(4)));
                if(rs.getString(5) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(5)));
                }
                tg.setQuocTich(rs.getString(6));
                tg.setChiTiet(rs.getString(7));
                return tg;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy tác giả theo tên: "+e.toString());
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
    
    public TacGia layTacGiaTheoMa(String name){    
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "SELECT * FROM TacGia WHERE MaTacGia = '" + name + "'";
            con = Connect.DatabaseHelper.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                TacGia tg = new TacGia();
                tg.setMaTacGia(rs.getInt(1));
                tg.setTenTacGia(rs.getString(2));
                tg.setQueQuan(rs.getString(3));
                tg.setNgaySinh(dfm.parse(rs.getString(4)));
                if(rs.getString(5) == null){
                    tg.setNgayMat(null);
                } else{
                    tg.setNgayMat(dfm.parse(rs.getString(5)));
                }
                tg.setQuocTich(rs.getString(6));
                tg.setChiTiet(rs.getString(7));
                return tg;
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy tác giả theo mã: "+e.toString());
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
