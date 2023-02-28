package Entity;

public class ChiTietPhieuNhap {
    private int maCTPN;
    private Sach sach;
    private PhieuNhap phieuNhap;
    private int soLuong;
    private double donGia;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int maCTPN, Sach sach, PhieuNhap phieuNhap, int soLuong, double donGia) {
        this.maCTPN = maCTPN;
        this.sach = sach;
        this.phieuNhap = phieuNhap;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaCTPN() {
        return maCTPN;
    }

    public void setMaCTPN(int maCTPN) {
        this.maCTPN = maCTPN;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public PhieuNhap getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(PhieuNhap phieuNhap) {
        this.phieuNhap = phieuNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
}
