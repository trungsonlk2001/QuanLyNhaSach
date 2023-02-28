package Entity;

public class ChiTietBangCong {
    private int maCTBC;
    private NhanVien nhanVien;
    private BangCong bangCong;
    private float tongGio;
    private double tongTien;

    public ChiTietBangCong() {
    }

    public ChiTietBangCong(int maCTBC, NhanVien nhanVien, BangCong bangCong, float tongGio, double tongTien) {
        this.maCTBC = maCTBC;
        this.nhanVien = nhanVien;
        this.bangCong = bangCong;
        this.tongGio = tongGio;
        this.tongTien = tongTien;
    }

    public int getMaCTBC() {
        return maCTBC;
    }

    public void setMaCTBC(int maCTBC) {
        this.maCTBC = maCTBC;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public float getTongGio() {
        return tongGio;
    }

    public void setTongGio(float tongGio) {
        this.tongGio = tongGio;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public BangCong getBangCong() {
        return bangCong;
    }

    public void setBangCong(BangCong bangCong) {
        this.bangCong = bangCong;
    }
    
    
}
