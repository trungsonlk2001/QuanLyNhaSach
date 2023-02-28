package Form;

import Dao.NhaXuatBanDAO;
import Dao.SachDAO;
import Dao.TacGiaDAO;
import Dao.TheLoaiDAO;
import Entity.NhaXuatBan;
import Entity.Sach;
import Entity.TacGia;
import Entity.TheLoai;
import static Form.FormSachHetHang.sDao;
import Model.TableModel;
import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jdesktop.swingx.sort.RowFilters;

public class FormSach extends javax.swing.JPanel {
    
    static NhaXuatBanDAO nxbDao = new NhaXuatBanDAO();
    static TheLoaiDAO tlDao = new TheLoaiDAO();
    static TacGiaDAO tgDao = new TacGiaDAO();
    static SachDAO sDao = new SachDAO();
    static SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
    byte[] anh = null;
    static DecimalFormat df = new DecimalFormat("#,###");
    static List<Sach> dsS;

    public FormSach() throws ParseException {
        initComponents();
        fillDataNhaXuatBan();
        fillDataTheLoai();
        fillDataTacGia();
        fillDataSach();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlSach = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        txtTimKiemTheoTen = new Swing.TextField();
        jLabel8 = new javax.swing.JLabel();
        cbo_SearchBy = new javax.swing.JComboBox<>();
        btnXuatExcel = new Swing.ButtonGradient();
        btnChiTietSach = new Swing.ButtonGradient();
        btnThem = new Swing.ButtonGradient();
        btnXoa = new Swing.ButtonGradient();
        btnCapNhat = new Swing.ButtonGradient();
        pnlTacGia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTG = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiemTheoMaTG = new Swing.TextField();
        jLabel9 = new javax.swing.JLabel();
        cbo_SearchBy1 = new javax.swing.JComboBox<>();
        btnChiTietTacGia = new Swing.ButtonGradient();
        btnThemTG = new Swing.ButtonGradient();
        btnXoaTG = new Swing.ButtonGradient();
        btnCapNhatTG = new Swing.ButtonGradient();
        pnlTheLoai = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTL = new javax.swing.JTable();
        lblRefeshTL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiemTheoTenTL = new Swing.TextField();
        jLabel10 = new javax.swing.JLabel();
        cbo_SearchBy2 = new javax.swing.JComboBox<>();
        btnThemTheLoai = new Swing.ButtonGradient();
        btnXoaTL = new Swing.ButtonGradient();
        btnCapNhatTL = new Swing.ButtonGradient();
        pnlNhaXuatBan = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNXB = new javax.swing.JTable();
        lblRefreshNXB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiemTheoMaNXB = new Swing.TextField();
        jLabel11 = new javax.swing.JLabel();
        cbo_SearchBy3 = new javax.swing.JComboBox<>();
        btnChiTietNXB = new Swing.ButtonGradient();
        btnThemNXB = new Swing.ButtonGradient();
        btnXoaNXB = new Swing.ButtonGradient();
        btnCapNhatNXB = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        pnlSach.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Nhập thông tin Sách");

        tblSach.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Thể loại", "Nhà xuất bản", "Đơn giá", "Số lượng", "Hình ảnh"
            }
        ));
        tblSach.setRequestFocusEnabled(false);
        tblSach.setRowHeight(35);
        tblSach.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane5.setViewportView(tblSach);

        txtTimKiemTheoTen.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtTimKiemTheoTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemTheoTenMousePressed(evt);
            }
        });
        txtTimKiemTheoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoTenKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setText("Tìm kiếm theo:");

        cbo_SearchBy.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cbo_SearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên sách", "Tác giả", "Thể loại", "Nhà xuất bản" }));

        btnXuatExcel.setText("Xuất file");
        btnXuatExcel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatExcelMousePressed(evt);
            }
        });

        btnChiTietSach.setText("Chi Tiết");
        btnChiTietSach.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnChiTietSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChiTietSachMousePressed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemMousePressed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaMousePressed(evt);
            }
        });

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlSachLayout = new javax.swing.GroupLayout(pnlSach);
        pnlSach.setLayout(pnlSachLayout);
        pnlSachLayout.setHorizontalGroup(
            pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_SearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnChiTietSach, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        pnlSachLayout.setVerticalGroup(
            pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSachLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSachLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_SearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTimKiemTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChiTietSach, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sách", pnlSach);

        pnlTacGia.setBackground(new java.awt.Color(255, 255, 255));

        tblTG.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblTG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã tác giả", "Tên tác giả", "Quê quán", "Ngày sinh", "Ngày mất", "Quốc tịch", "Chi tiết"
            }
        ));
        tblTG.setRequestFocusEnabled(false);
        tblTG.setRowHeight(35);
        tblTG.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(tblTG);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Nhập thông tin Tác giả");

        txtTimKiemTheoMaTG.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtTimKiemTheoMaTG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaTGKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setText("Tìm kiếm theo:");

        cbo_SearchBy1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cbo_SearchBy1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tác giả", "Tên tác giả", "Quốc tịch" }));

        btnChiTietTacGia.setText("Chi Tiết");
        btnChiTietTacGia.setFocusable(false);
        btnChiTietTacGia.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnChiTietTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChiTietTacGiaMousePressed(evt);
            }
        });

        btnThemTG.setText("Thêm");
        btnThemTG.setFocusable(false);
        btnThemTG.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnThemTG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemTGMousePressed(evt);
            }
        });

        btnXoaTG.setText("Xóa");
        btnXoaTG.setFocusable(false);
        btnXoaTG.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnXoaTG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaTGMousePressed(evt);
            }
        });

        btnCapNhatTG.setText("Cập Nhật");
        btnCapNhatTG.setFocusable(false);
        btnCapNhatTG.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCapNhatTG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatTGMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlTacGiaLayout = new javax.swing.GroupLayout(pnlTacGia);
        pnlTacGia.setLayout(pnlTacGiaLayout);
        pnlTacGiaLayout.setHorizontalGroup(
            pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTacGiaLayout.createSequentialGroup()
                .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTacGiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTacGiaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlTacGiaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtTimKiemTheoMaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_SearchBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addComponent(btnChiTietTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnThemTG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnXoaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhatTG, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTacGiaLayout.setVerticalGroup(
            pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTacGiaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTimKiemTheoMaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaTG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhatTG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemTG, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChiTietTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTacGiaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_SearchBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tác giả", pnlTacGia);

        pnlTheLoai.setBackground(new java.awt.Color(255, 255, 255));

        tblTL.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã thể loại", "Tên thể loại"
            }
        ));
        tblTL.setRequestFocusEnabled(false);
        tblTL.setRowHeight(35);
        tblTL.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane3.setViewportView(tblTL);

        lblRefeshTL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefeshTL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefeshTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefeshTLMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Nhập thông tin Thể loại");

        txtTimKiemTheoTenTL.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        txtTimKiemTheoTenTL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoTenTLKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel10.setText("Tìm kiếm theo:");

        cbo_SearchBy2.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cbo_SearchBy2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã thể loại", "Tên thể loại" }));

        btnThemTheLoai.setText("Thêm");
        btnThemTheLoai.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnThemTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemTheLoaiMousePressed(evt);
            }
        });

        btnXoaTL.setText("Xóa");
        btnXoaTL.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXoaTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaTLMousePressed(evt);
            }
        });

        btnCapNhatTL.setText("Cập Nhật");
        btnCapNhatTL.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnCapNhatTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatTLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlTheLoaiLayout = new javax.swing.GroupLayout(pnlTheLoai);
        pnlTheLoai.setLayout(pnlTheLoaiLayout);
        pnlTheLoaiLayout.setHorizontalGroup(
            pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                        .addComponent(txtTimKiemTheoTenTL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_SearchBy2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(lblRefeshTL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                        .addComponent(btnThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnXoaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCapNhatTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTheLoaiLayout.setVerticalGroup(
            pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTheLoaiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTimKiemTheoTenTL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCapNhatTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoaTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThemTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRefeshTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
                    .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_SearchBy2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thể loại", pnlTheLoai);

        pnlNhaXuatBan.setBackground(new java.awt.Color(255, 255, 255));

        tblNXB.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblNXB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhà xuất bản", "Tên nhà xuất bản", "Địa chỉ", "Số diện thoại", "Email"
            }
        ));
        tblNXB.setRequestFocusEnabled(false);
        tblNXB.setRowHeight(35);
        tblNXB.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane4.setViewportView(tblNXB);

        lblRefreshNXB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefreshNXB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefreshNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshNXBMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Nhập thông tin Nhà xuất bản");

        txtTimKiemTheoMaNXB.setFocusable(false);
        txtTimKiemTheoMaNXB.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtTimKiemTheoMaNXB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaNXBKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel11.setText("Tìm kiếm theo:");

        cbo_SearchBy3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cbo_SearchBy3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà xuất bản", "Tên nhà xuất bản", "Số điện thoại" }));

        btnChiTietNXB.setText("Chi Tiết");
        btnChiTietNXB.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnChiTietNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChiTietNXBMousePressed(evt);
            }
        });

        btnThemNXB.setText("Thêm");
        btnThemNXB.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnThemNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemNXBMousePressed(evt);
            }
        });

        btnXoaNXB.setText("Xóa");
        btnXoaNXB.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnXoaNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaNXBMousePressed(evt);
            }
        });

        btnCapNhatNXB.setText("Cập Nhật");
        btnCapNhatNXB.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCapNhatNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatNXBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlNhaXuatBanLayout = new javax.swing.GroupLayout(pnlNhaXuatBan);
        pnlNhaXuatBan.setLayout(pnlNhaXuatBanLayout);
        pnlNhaXuatBanLayout.setHorizontalGroup(
            pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhaXuatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhaXuatBanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlNhaXuatBanLayout.createSequentialGroup()
                        .addComponent(txtTimKiemTheoMaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_SearchBy3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(lblRefreshNXB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                        .addComponent(btnChiTietNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnThemNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnXoaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnCapNhatNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlNhaXuatBanLayout.setVerticalGroup(
            pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhaXuatBanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTimKiemTheoMaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCapNhatNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChiTietNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblRefreshNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNhaXuatBanLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_SearchBy3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhà xuất bản", pnlNhaXuatBan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        try {
            fillDataSach();
        } catch (ParseException ex) {
            Logger.getLogger(FormSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MousePressed

   
    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

        fillDataTacGia();
    }//GEN-LAST:event_jLabel2MousePressed

    
    // THỂ LOẠI
    private void lblRefeshTLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefeshTLMousePressed
        txtTimKiemTheoTenTL.setText("Tên thể loại");
        fillDataTheLoai();
    }//GEN-LAST:event_lblRefeshTLMousePressed

    private void lblRefreshNXBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshNXBMousePressed

        fillDataNhaXuatBan();
    }//GEN-LAST:event_lblRefreshNXBMousePressed

    private void txtTimKiemTheoTenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenMousePressed
        

    }//GEN-LAST:event_txtTimKiemTheoTenMousePressed

    private void txtTimKiemTheoTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenKeyReleased
        String searchBy = cbo_SearchBy.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Tên sách")){
            String name = txtTimKiemTheoTen.getText();
            TableModel modelSach = new TableModel();
            modelSach = (TableModel) tblSach.getModel();
            TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else if(searchBy.equalsIgnoreCase("Tác giả")){
            String name = txtTimKiemTheoTen.getText();
            TableModel modelSach = new TableModel();
            modelSach = (TableModel) tblSach.getModel();
            TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,2));
        } else if(searchBy.equalsIgnoreCase("Nhà xuất bản")){
            String name = txtTimKiemTheoTen.getText();
            TableModel modelSach = new TableModel();
            modelSach = (TableModel) tblSach.getModel();
            TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,4));
        } else {
            String name = txtTimKiemTheoTen.getText();
            TableModel modelSach = new TableModel();
            modelSach = (TableModel) tblSach.getModel();
            TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,3));
        }
        
        
    }//GEN-LAST:event_txtTimKiemTheoTenKeyReleased

    private void txtTimKiemTheoMaTGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaTGKeyReleased
        String searchBy = cbo_SearchBy1.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã tác giả")){
            String name = txtTimKiemTheoMaTG.getText();
            DefaultTableModel modelTG = new DefaultTableModel();
            modelTG = (DefaultTableModel) tblTG.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelTG);
            tblTG.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,0));
        } else if(searchBy.equalsIgnoreCase("Tên tác giả")){
            String name = txtTimKiemTheoMaTG.getText();
            DefaultTableModel modelTG = new DefaultTableModel();
            modelTG = (DefaultTableModel) tblTG.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelTG);
            tblTG.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else if(searchBy.equalsIgnoreCase("Quốc tịch")){
            String name = txtTimKiemTheoMaTG.getText();
            DefaultTableModel modelTG = new DefaultTableModel();
            modelTG = (DefaultTableModel) tblTG.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelTG);
            tblTG.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,5));
        }
        
    }//GEN-LAST:event_txtTimKiemTheoMaTGKeyReleased

    private void txtTimKiemTheoTenTLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenTLKeyReleased
        String searchBy = cbo_SearchBy2.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã thể loại")){
            String name = txtTimKiemTheoTenTL.getText();
            DefaultTableModel modelTL = new DefaultTableModel();
            modelTL = (DefaultTableModel) tblTL.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelTL);
            tblTL.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,0));
        } else {
            String name = txtTimKiemTheoTenTL.getText();
            DefaultTableModel modelTL = new DefaultTableModel();
            modelTL = (DefaultTableModel) tblTL.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelTL);
            tblTL.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        }        
    }//GEN-LAST:event_txtTimKiemTheoTenTLKeyReleased

    private void txtTimKiemTheoMaNXBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaNXBKeyReleased
        String searchBy = cbo_SearchBy3.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã nhà xuất bản")){
            String name = txtTimKiemTheoMaNXB.getText();
            DefaultTableModel modelNXB = new DefaultTableModel();
            modelNXB = (DefaultTableModel) tblNXB.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNXB);
            tblNXB.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,0));
        } else if(searchBy.equalsIgnoreCase("Tên nhà xuất bản")) {
            String name = txtTimKiemTheoMaNXB.getText();
            DefaultTableModel modelNXB = new DefaultTableModel();
            modelNXB = (DefaultTableModel) tblNXB.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNXB);
            tblNXB.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else {
            String name = txtTimKiemTheoMaNXB.getText();
            DefaultTableModel modelNXB = new DefaultTableModel();
            modelNXB = (DefaultTableModel) tblNXB.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNXB);
            tblNXB.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,3));
        }
        
    }//GEN-LAST:event_txtTimKiemTheoMaNXBKeyReleased

    private void btnXuatExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMousePressed
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet();

            XSSFRow row = null;
            Cell cell = null;

            row = sheet.createRow(3);

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã sách");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Tên sách");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Tác giả");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Thể loại");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Nhà xuất bản");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Đơn giá");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Số lượng");

            List<Sach> listSachHH = sDao.layDSSach();

            if(listSachHH != null){
                int s = listSachHH.size();
                for(int i=0;i<s;i++){
                    Sach sach = listSachHH.get(i);
                    row = sheet.createRow(5 + i);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(sach.getMaSach());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(sach.getTenSach());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(sach.getTacGia().getTenTacGia());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(sach.getTheLoai().getTenTheLoai());

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(sach.getNXB().getTenNXB());

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(sach.getDonGia());

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(sach.getSoLuong());
                }

                String date = LocalDate.now().toString();
                File f = new File("D:/New Folder/Kiem Hang " + date + ".xlsx");
                FileOutputStream fis = new FileOutputStream(f);
                workbook.write(fis);
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("Lỗi xuất file: " + e.toString());
        }
    }//GEN-LAST:event_btnXuatExcelMousePressed

    private void btnChiTietSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChiTietSachMousePressed
        int pos = tblSach.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách cần xem", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormChiTietSach formChiTietSach = new FormChiTietSach();
            formChiTietSach.setVisible(true);
        }
    }//GEN-LAST:event_btnChiTietSachMousePressed

    private void btnThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMousePressed
        FormNhapSach formNhapSach = new FormNhapSach();
        formNhapSach.setVisible(true);
    }//GEN-LAST:event_btnThemMousePressed

    private void btnXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMousePressed
        int pos = tblSach.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Sach s = sDao.laySachTheoMa(tblSach.getValueAt(pos, 0).toString());
                if(sDao.deleteSach(s) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataSach();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaMousePressed

    private void btnCapNhatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMousePressed
        int pos = tblSach.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            Sach s = sDao.laySachTheoMa(tblSach.getValueAt(pos, 0).toString());
            FormCapNhatSach formCapNhatSach = new FormCapNhatSach();
            formCapNhatSach.setVisible(true);
            formCapNhatSach.txtTenSach.setText(tblSach.getValueAt(pos, 1).toString());
            formCapNhatSach.cboTacGia.setSelectedItem(tblSach.getValueAt(pos, 2).toString());
            formCapNhatSach.cboNXB.setSelectedItem(tblSach.getValueAt(pos, 4).toString());
            try {
                formCapNhatSach.txtDonGia.setText(df.parse(tblSach.getValueAt(pos, 5).toString()).toString());
            } catch (ParseException ex) {
                Logger.getLogger(FormSach.class.getName()).log(Level.SEVERE, null, ex);
            }
            formCapNhatSach.txtSoLuong.setText(tblSach.getValueAt(pos, 6).toString());
            formCapNhatSach.cboTheLoai.setSelectedItem(tblSach.getValueAt(pos, 3).toString());
            formCapNhatSach.lblHinh.setIcon((Icon) tblSach.getValueAt(pos, 7)); 
            anh = s.getHinhAnh();
        }
    }//GEN-LAST:event_btnCapNhatMousePressed

    private void btnChiTietTacGiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChiTietTacGiaMousePressed
        int pos = tblTG.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tác giả cần xem", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormChiTietTacGia formChiTietTacGia = new FormChiTietTacGia();
            formChiTietTacGia.setVisible(true);
        }
    }//GEN-LAST:event_btnChiTietTacGiaMousePressed

    private void btnThemTGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemTGMousePressed
        FormThemTacGia formThemTacGia = new FormThemTacGia();
        formThemTacGia.setVisible(true);
    }//GEN-LAST:event_btnThemTGMousePressed

    private void btnXoaTGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaTGMousePressed
       int pos = tblTG.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                TacGia tg = tgDao.layTacGiaTheoMa(tblTG.getValueAt(pos, 0).toString());
                if(tgDao.deleteTacGia(tg) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataTacGia();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaTGMousePressed

    private void btnCapNhatTGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatTGMousePressed
        int pos = tblTG.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatTacGia formCapNhatTacGia = new FormCapNhatTacGia();
            formCapNhatTacGia.setVisible(true);
            formCapNhatTacGia.txtTenTG.setText(tblTG.getValueAt(pos, 1).toString());
            formCapNhatTacGia.txtQueQuanTG.setText(tblTG.getValueAt(pos, 2).toString());
            formCapNhatTacGia.txtNgaySinhTG.setText(tblTG.getValueAt(pos, 3).toString());
            if(tblTG.getValueAt(pos, 4).toString().equalsIgnoreCase("Chưa mất")){
                formCapNhatTacGia.txtNgayMatTG.setText("");
            } else {
                formCapNhatTacGia.txtNgayMatTG.setText(tblTG.getValueAt(pos, 4).toString());
            }          
            formCapNhatTacGia.txtQuocTichTG.setText(tblTG.getValueAt(pos, 5).toString());            
            formCapNhatTacGia.txtChiTietTG.setText(tblTG.getValueAt(pos, 6).toString());          
        }
    }//GEN-LAST:event_btnCapNhatTGMousePressed

    private void btnThemTheLoaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemTheLoaiMousePressed
        FormThemTheLoai formThemTheLoai = new FormThemTheLoai();
        formThemTheLoai.setVisible(true);
    }//GEN-LAST:event_btnThemTheLoaiMousePressed

    private void btnXoaTLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaTLMousePressed
        int pos = tblTL.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                TheLoai tl = tlDao.layTheLoaiTheoMa(tblTL.getValueAt(pos, 0).toString());
                if(tlDao.deleteTheLoai(tl) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataTheLoai();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaTLMousePressed

    private void btnCapNhatTLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatTLMousePressed
        int pos = tblTL.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatTheLoai formCapNhatTheLoai = new FormCapNhatTheLoai();
            formCapNhatTheLoai.setVisible(true);
            formCapNhatTheLoai.txtTenTL.setText(tblTL.getValueAt(pos, 1).toString());
        }     
    }//GEN-LAST:event_btnCapNhatTLMousePressed

    private void btnChiTietNXBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChiTietNXBMousePressed
        int pos = tblNXB.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà xuất bản cần xem", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormChiTietNXB formChiTietNXB = new FormChiTietNXB();
            formChiTietNXB.setVisible(true);
        }
    }//GEN-LAST:event_btnChiTietNXBMousePressed

    private void btnThemNXBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNXBMousePressed
        FormThemNhaXuatBan formThemNhaXuatBan = new FormThemNhaXuatBan();
        formThemNhaXuatBan.setVisible(true);
    }//GEN-LAST:event_btnThemNXBMousePressed

    private void btnXoaNXBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaNXBMousePressed
       int pos = tblNXB.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                NhaXuatBan nxb = nxbDao.layNhaXuatBanTheoMa(tblNXB.getValueAt(pos, 0).toString());
                if(nxbDao.deleteNhaXuatBan(nxb) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataNhaXuatBan();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaNXBMousePressed

    private void btnCapNhatNXBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatNXBMousePressed
        int pos = tblNXB.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatNhaXuatBan formCapNhatNhaXuatBan = new FormCapNhatNhaXuatBan();
            formCapNhatNhaXuatBan.setVisible(true);
            formCapNhatNhaXuatBan.txtTenNXB.setText(tblNXB.getValueAt(pos, 1).toString());
            formCapNhatNhaXuatBan.txtDiaChiNXB.setText(tblNXB.getValueAt(pos, 2).toString());
            formCapNhatNhaXuatBan.txtSDTNXB.setText(tblNXB.getValueAt(pos, 3).toString());
            formCapNhatNhaXuatBan.txtEmailNXB.setText(tblNXB.getValueAt(pos, 4).toString());
        }
    }//GEN-LAST:event_btnCapNhatNXBMousePressed

    // TABLE NHÀ XUẤT BẢN
     public static void fillDataNhaXuatBan(){
        DefaultTableModel model = (DefaultTableModel) tblNXB.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblNXB.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(NhaXuatBan nxb : nxbDao.layDSNhaXuatBan()){  
            Object[] rowData = new Object[5];
            rowData[0] = nxb.getMaNXB();
            rowData[1] = nxb.getTenNXB();
            rowData[2] = nxb.getDiaChi();
            rowData[3] = nxb.getSDT();
            rowData[4] = nxb.getEmail();
            model.addRow(rowData);
        }
    }
     
    // TABLE THỂ LOẠI
    public static void fillDataTheLoai(){
        DefaultTableModel model = (DefaultTableModel) tblTL.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<2;i++){
            tblTL.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(TheLoai tl : tlDao.layDSTheLoai()){  
            Object[] rowData = new Object[2];
            rowData[0] = tl.getMaTheLoai();
            rowData[1] = tl.getTenTheLoai();
            model.addRow(rowData);
        }
    }
    
    // TABLE TÁC GIẢ
    public static void fillDataTacGia(){
        DefaultTableModel model = (DefaultTableModel) tblTG.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblTG.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(TacGia tg : tgDao.layDSTacGia()){  
            Object[] rowData = new Object[7];
            rowData[0] = tg.getMaTacGia();
            rowData[1] = tg.getTenTacGia();
            rowData[2] = tg.getQueQuan();
            rowData[3] = dfm.format(tg.getNgaySinh());
            if(tg.getNgayMat() == null){
                rowData[4] = "Chưa mất";
            } else {
                rowData[4] = dfm.format(tg.getNgayMat());
            }            
            rowData[5] = tg.getQuocTich();
            rowData[6] = tg.getChiTiet();
            model.addRow(rowData);
        }
    }
    
    // TABLE SÁCH
    public static void fillDataSach() throws ParseException{
        List<Sach> dsS = sDao.layDSSach();
        String [] columnName = {"Mã sách","Tên sách","Tác giả","Thể loại","Nhà xuất bản","Đơn giá","Số lượng","Hình ảnh"};
        Object[][] rows = new Object[dsS.size()][8];
        for(int i = 0;i<dsS.size();i++){        
            rows[i][0] = dsS.get(i).getMaSach();
            rows[i][1] = dsS.get(i).getTenSach();
            rows[i][2] = dsS.get(i).getTacGia().getTenTacGia();
            rows[i][3] = dsS.get(i).getTheLoai().getTenTheLoai();
            rows[i][4] = dsS.get(i).getNXB().getTenNXB();
            rows[i][5] = dsS.get(i).getDonGia();
            rows[i][6] = dsS.get(i).getSoLuong(); 
            ImageIcon image = new ImageIcon(new ImageIcon(dsS.get(i).getHinhAnh()).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH));
            rows[i][7] = image; 
        }
        
        TableModel model = new TableModel(rows,columnName);
        tblSach.setModel(model);
        tblSach.setRowHeight(140);
        tblSach.getColumnModel().getColumn(7).setPreferredWidth(140);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblSach.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    
    public static void fillDataSachWithListSach(List<Sach> dsS){
        tblSach.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        
        String [] columnName = {"Mã sách","Tên sách","Tác giả","Thể loại","Nhà xuất bản","Đơn giá","Số lượng","Hình ảnh"};
        Object[][] rows = new Object[dsS.size()][8];
   
        
        for(int i = 0;i<dsS.size();i++){        
            rows[i][0] = dsS.get(i).getMaSach();
            rows[i][1] = dsS.get(i).getTenSach();
            rows[i][2] = dsS.get(i).getTacGia().getTenTacGia();
            rows[i][3] = dsS.get(i).getTheLoai().getTenTheLoai();
            rows[i][4] = dsS.get(i).getNXB().getTenNXB();
            rows[i][5] = dsS.get(i).getDonGia();
            rows[i][6] = dsS.get(i).getSoLuong(); 
            ImageIcon image = new ImageIcon(new ImageIcon(dsS.get(i).getHinhAnh()).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH));
            if (image!=null){
                rows[i][7] = image; 
            }
            else{
                rows[i][7] = "null";
            }
        }
        
        TableModel model = new TableModel(rows,columnName);
        tblSach.setModel(model);
        tblSach.setRowHeight(140);
        tblSach.getColumnModel().getColumn(7).setPreferredWidth(140);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblSach.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        tblSach.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnCapNhat;
    private Swing.ButtonGradient btnCapNhatNXB;
    private Swing.ButtonGradient btnCapNhatTG;
    private Swing.ButtonGradient btnCapNhatTL;
    private Swing.ButtonGradient btnChiTietNXB;
    private Swing.ButtonGradient btnChiTietSach;
    private Swing.ButtonGradient btnChiTietTacGia;
    private Swing.ButtonGradient btnThem;
    private Swing.ButtonGradient btnThemNXB;
    private Swing.ButtonGradient btnThemTG;
    private Swing.ButtonGradient btnThemTheLoai;
    private Swing.ButtonGradient btnXoa;
    private Swing.ButtonGradient btnXoaNXB;
    private Swing.ButtonGradient btnXoaTG;
    private Swing.ButtonGradient btnXoaTL;
    private Swing.ButtonGradient btnXuatExcel;
    private javax.swing.JComboBox<String> cbo_SearchBy;
    private javax.swing.JComboBox<String> cbo_SearchBy1;
    private javax.swing.JComboBox<String> cbo_SearchBy2;
    private javax.swing.JComboBox<String> cbo_SearchBy3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblRefeshTL;
    private javax.swing.JLabel lblRefreshNXB;
    private javax.swing.JPanel pnlNhaXuatBan;
    private javax.swing.JPanel pnlSach;
    private javax.swing.JPanel pnlTacGia;
    private javax.swing.JPanel pnlTheLoai;
    public static javax.swing.JTable tblNXB;
    public static javax.swing.JTable tblSach;
    public static javax.swing.JTable tblTG;
    public static javax.swing.JTable tblTL;
    private Swing.TextField txtTimKiemTheoMaNXB;
    private Swing.TextField txtTimKiemTheoMaTG;
    private Swing.TextField txtTimKiemTheoTen;
    private Swing.TextField txtTimKiemTheoTenTL;
    // End of variables declaration//GEN-END:variables
}
