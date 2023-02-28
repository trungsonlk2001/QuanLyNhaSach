package Entity;

import java.util.Date;

public class BangCong {
   private int maBangCong, soNgayLam, NghiCoPhep, nghiKhongPhep;
   private NhanVien nhanVien;
   private String thang;
   private double tongTien;

    public BangCong() {
    }

    public BangCong(int maBangCong, int soNgayLam, int NghiCoPhep, int nghiKhongPhep, NhanVien nhanVien, String thang, double tongTien) {
        this.maBangCong = maBangCong;
        this.soNgayLam = soNgayLam;
        this.NghiCoPhep = NghiCoPhep;
        this.nghiKhongPhep = nghiKhongPhep;
        this.nhanVien = nhanVien;
        this.thang = thang;
        this.tongTien = tongTien;
    }

    public int getMaBangCong() {
        return maBangCong;
    }

    public void setMaBangCong(int maBangCong) {
        this.maBangCong = maBangCong;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public int getNghiCoPhep() {
        return NghiCoPhep;
    }

    public void setNghiCoPhep(int NghiCoPhep) {
        this.NghiCoPhep = NghiCoPhep;
    }

    public int getNghiKhongPhep() {
        return nghiKhongPhep;
    }

    public void setNghiKhongPhep(int nghiKhongPhep) {
        this.nghiKhongPhep = nghiKhongPhep;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
   
   
    
}
