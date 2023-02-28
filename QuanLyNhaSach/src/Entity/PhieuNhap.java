package Entity;

import java.util.Date;

public class PhieuNhap {
    private int maPhieuNhap;
    private NhanVien nhanVien;
    private NhaXuatBan NXB;
    private Date ngayLap;
    private double tongTien;

    public PhieuNhap() {
    }

    public PhieuNhap(int maPhieuNhap, NhanVien nhanVien, NhaXuatBan NXB, Date ngayLap, double tongTien) {
        this.maPhieuNhap = maPhieuNhap;
        this.nhanVien = nhanVien;
        this.NXB = NXB;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
    }

    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public NhaXuatBan getNXB() {
        return NXB;
    }

    public void setNXB(NhaXuatBan NXB) {
        this.NXB = NXB;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    
    
    
}
