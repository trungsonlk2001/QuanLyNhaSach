package Entity;

public class ChiTietHoaDon {
    private int maCTHD;
    private Sach sach;
    private HoaDon hoaDon;
    private int soLuong;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maCTHD, Sach sach, HoaDon hoaDon, int soLuong) {
        this.maCTHD = maCTHD;
        this.sach = sach;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
    }

    public int getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
