package Entity;

import java.util.Date;

public class TacGia {
    private int maTacGia;
    private String  tenTacGia, queQuan, quocTich, chiTiet;
    private Date ngaySinh, ngayMat;

    public TacGia() {
    }

    public TacGia(int maTacGia, String tenTacGia, String queQuan, Date ngaySinh, Date ngayMat, String quocTich, String chiTiet) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
        this.queQuan = queQuan;
        this.quocTich = quocTich;
        this.ngaySinh = ngaySinh;
        this.ngayMat = ngayMat;
        this.chiTiet = chiTiet;
    }

    public int getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(int maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayMat() {
        return ngayMat;
    }

    public void setNgayMat(Date ngayMat) {
        this.ngayMat = ngayMat;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    
    
}
