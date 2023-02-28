package Entity;

public class LoaiKhachHang {
    private int maLoaiKhachHang;
    private String tenLoaiKhachHang;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(int maLoaiKhachHang, String tenLoaiKhachHang) {
        this.maLoaiKhachHang = maLoaiKhachHang;
        this.tenLoaiKhachHang = tenLoaiKhachHang;
    }

    public int getMaLoaiKhachHang() {
        return maLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(int maLoaiKhac) {
        this.maLoaiKhachHang = maLoaiKhac;
    }

    public String getTenLoaiKhachHang() {
        return tenLoaiKhachHang;
    }

    public void setTenLoaiKhachHang(String tenLoaiKhach) {
        this.tenLoaiKhachHang = tenLoaiKhach;
    }
    
    
}
