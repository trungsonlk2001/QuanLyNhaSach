package Entity;

public class Sach {
    private String maSach, tenSach;
    private TacGia tacGia;
    private TheLoai theLoai;
    private NhaXuatBan NXB;
    private double donGia;
    private int soLuong;
    private byte[] hinhAnh;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, TacGia tacGia, TheLoai theLoai, NhaXuatBan NXB, double donGia, int soLuong, byte[] hinhAnh) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.NXB = NXB;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.hinhAnh = hinhAnh;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public NhaXuatBan getNXB() {
        return NXB;
    }

    public void setNXB(NhaXuatBan NXB) {
        this.NXB = NXB;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    
    
}
