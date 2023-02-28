package Entity;

import java.util.Date;

public class KhachHang implements Cloneable{

    private int maKhachHang;
    private String tenKhachHang, diaChi, SDT, email;
    private LoaiKhachHang loai;
    private Date ngaySinh;

    public KhachHang() {
    }

    public KhachHang(int maKhachHang, String tenKhachHang, Date ngaySinh, String email, String diaChi, String SDT, LoaiKhachHang loai) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.loai = loai;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public LoaiKhachHang getLoai() {
        return loai;
    }

    public void setLoai(LoaiKhachHang loai) {
        this.loai = loai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
