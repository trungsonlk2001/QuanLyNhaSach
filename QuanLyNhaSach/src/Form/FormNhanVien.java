package Form;

import Dao.ChucVuDAO;
import Dao.NhanVienDAO;
import Dao.TaiKhoanDAO;
import Entity.ChucVu;
import Entity.NhanVien;
import Entity.TaiKhoan;
import static Form.FormKhachHang.dfm;
import static Form.FormKhachHang.tblKH;
import static Form.FormSach.tblTL;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.sort.RowFilters;

public class FormNhanVien extends javax.swing.JPanel {
    
    static ChucVuDAO cvDao = new ChucVuDAO();
    static NhanVienDAO nvDao = new NhanVienDAO();
    static TaiKhoanDAO tkDao = new TaiKhoanDAO();

    public FormNhanVien() {
        initComponents();
        fillDataChucVu();
        fillDataNhanVien();
        fillDataTaiKhoan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        pnlNhanVien = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        lblRefreshNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiemTheoMaNV = new Swing.TextField();
        cbo_SearchBy = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnChiTietNV = new Swing.ButtonGradient();
        btnThemNV = new Swing.ButtonGradient();
        btnXoaNV = new Swing.ButtonGradient();
        btnSuaNV = new Swing.ButtonGradient();
        pnlChucVu = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCV = new javax.swing.JTable();
        lblRefreshChucVu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiemChucVu = new Swing.TextField();
        btnThemCV = new Swing.ButtonGradient();
        btnXoaCV = new Swing.ButtonGradient();
        btnCapNhatCV = new Swing.ButtonGradient();
        pnlTaiKhoan = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTK = new javax.swing.JTable();
        lblRefeshTK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTimKiemTheoMaTK = new Swing.TextField();
        jLabel9 = new javax.swing.JLabel();
        cbo_SearchBy1 = new javax.swing.JComboBox<>();
        btnThemTK = new Swing.ButtonGradient();
        btnXoaTK = new Swing.ButtonGradient();
        btnCapNhatTK = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1412, 893));

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setFocusable(false);
        jTabbedPane3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        pnlNhanVien.setBackground(new java.awt.Color(255, 255, 255));

        tblNV.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Lương cơ bản", "Chức vụ"
            }
        ));
        tblNV.setGridColor(new java.awt.Color(255, 255, 255));
        tblNV.setRequestFocusEnabled(false);
        tblNV.setRowHeight(30);
        tblNV.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane3.setViewportView(tblNV);

        lblRefreshNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefreshNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefreshNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshNVMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Nhập thông tin Nhân viên");

        txtTimKiemTheoMaNV.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        txtTimKiemTheoMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaNVKeyReleased(evt);
            }
        });

        cbo_SearchBy.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cbo_SearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Tên nhân viên", "Chức vụ" }));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Tìm kiếm theo:");

        btnChiTietNV.setText("Chi Tiết");
        btnChiTietNV.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnChiTietNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChiTietNVMousePressed(evt);
            }
        });

        btnThemNV.setText("Thêm");
        btnThemNV.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnThemNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemNVMousePressed(evt);
            }
        });

        btnXoaNV.setText("Xóa");
        btnXoaNV.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnXoaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaNVMousePressed(evt);
            }
        });

        btnSuaNV.setText("Cập Nhật");
        btnSuaNV.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnSuaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSuaNVMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNhanVienLayout.createSequentialGroup()
                        .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
                            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlNhanVienLayout.createSequentialGroup()
                        .addComponent(txtTimKiemTheoMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbo_SearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblRefreshNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChiTietNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNhanVienLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTimKiemTheoMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_SearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRefreshNV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChiTietNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Nhân viên", pnlNhanVien);

        pnlChucVu.setBackground(new java.awt.Color(255, 255, 255));

        tblCV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã chức vụ", "Tên chức vụ"
            }
        ));
        tblCV.setRequestFocusEnabled(false);
        tblCV.setRowHeight(30);
        tblCV.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane4.setViewportView(tblCV);

        lblRefreshChucVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefreshChucVu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefreshChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshChucVuMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 135, 135));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Nhập thông tin Chức vụ");

        txtTimKiemChucVu.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiemChucVu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemChucVuKeyReleased(evt);
            }
        });

        btnThemCV.setText("Thêm");
        btnThemCV.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnThemCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemCVMousePressed(evt);
            }
        });

        btnXoaCV.setText("Xóa");
        btnXoaCV.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXoaCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaCVMousePressed(evt);
            }
        });
        btnXoaCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCVActionPerformed(evt);
            }
        });

        btnCapNhatCV.setText("Cập Nhật");
        btnCapNhatCV.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnCapNhatCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatCVMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlChucVuLayout = new javax.swing.GroupLayout(pnlChucVu);
        pnlChucVu.setLayout(pnlChucVuLayout);
        pnlChucVuLayout.setHorizontalGroup(
            pnlChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChucVuLayout.createSequentialGroup()
                        .addGroup(pnlChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
                            .addGroup(pnlChucVuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlChucVuLayout.createSequentialGroup()
                        .addComponent(txtTimKiemChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRefreshChucVu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemCV, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhatCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        pnlChucVuLayout.setVerticalGroup(
            pnlChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChucVuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(pnlChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiemChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRefreshChucVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCapNhatCV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Chức vụ", pnlChucVu);

        pnlTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

        tblTK.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        tblTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tài khoản", "Mã nhân viên", "Tên nhân viên", "Tên đăng nhập", "Mật khẩu"
            }
        ));
        tblTK.setRequestFocusEnabled(false);
        tblTK.setRowHeight(30);
        tblTK.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane5.setViewportView(tblTK);

        lblRefeshTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefeshTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefeshTKMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Nhập thông tin Tài khoản");

        txtTimKiemTheoMaTK.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        txtTimKiemTheoMaTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaTKKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel9.setText("Tìm kiếm theo:");

        cbo_SearchBy1.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cbo_SearchBy1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Tên nhân viên", "Tên đăng nhập", " " }));

        btnThemTK.setText("Thêm");
        btnThemTK.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnThemTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemTKMousePressed(evt);
            }
        });

        btnXoaTK.setText("Xóa");
        btnXoaTK.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnXoaTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaTKMousePressed(evt);
            }
        });

        btnCapNhatTK.setText("Cập Nhật");
        btnCapNhatTK.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        btnCapNhatTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatTKMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlTaiKhoanLayout = new javax.swing.GroupLayout(pnlTaiKhoan);
        pnlTaiKhoan.setLayout(pnlTaiKhoanLayout);
        pnlTaiKhoanLayout.setHorizontalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                        .addComponent(txtTimKiemTheoMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_SearchBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(lblRefeshTK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE)
                        .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnCapNhatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTaiKhoanLayout.setVerticalGroup(
            pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaiKhoanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTimKiemTheoMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTaiKhoanLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_SearchBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRefeshTK, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Tài khoản", pnlTaiKhoan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane3)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane3)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblRefreshNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshNVMousePressed

        fillDataNhanVien();
    }//GEN-LAST:event_lblRefreshNVMousePressed

    private void lblRefreshChucVuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshChucVuMousePressed
        txtTimKiemChucVu.setText("Tìm kiếm theo tên");
        fillDataChucVu();
    }//GEN-LAST:event_lblRefreshChucVuMousePressed

    
    private void lblRefeshTKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefeshTKMousePressed

       fillDataTaiKhoan();
    }//GEN-LAST:event_lblRefeshTKMousePressed

    private void txtTimKiemTheoMaNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaNVKeyReleased
        String searchBy = cbo_SearchBy.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã nhân viên")){
            String name = txtTimKiemTheoMaNV.getText();
            DefaultTableModel modelNV = new DefaultTableModel();
            modelNV = (DefaultTableModel) tblNV.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
            tblNV.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,0));  
        } else if (searchBy.equalsIgnoreCase("Tên nhân viên")){
            String name = txtTimKiemTheoMaNV.getText();
            DefaultTableModel modelNV = new DefaultTableModel();
            modelNV = (DefaultTableModel) tblNV.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
            tblNV.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else {
            String name = txtTimKiemTheoMaNV.getText();
            DefaultTableModel modelNV = new DefaultTableModel();
            modelNV = (DefaultTableModel) tblNV.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
            tblNV.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,6));
        }
        
    }//GEN-LAST:event_txtTimKiemTheoMaNVKeyReleased

    private void txtTimKiemChucVuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemChucVuKeyReleased
        String name = txtTimKiemChucVu.getText();
        DefaultTableModel modelNV = new DefaultTableModel();
        modelNV = (DefaultTableModel) tblCV.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
        tblCV.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtTimKiemChucVuKeyReleased

    private void txtTimKiemTheoMaTKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaTKKeyReleased
        String searchBy = cbo_SearchBy1.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã nhân viên")){
            String name = txtTimKiemTheoMaTK.getText();
            DefaultTableModel modelNV = new DefaultTableModel();
            modelNV = (DefaultTableModel) tblTK.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
            tblTK.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else if(searchBy.equalsIgnoreCase("Tên nhân viên")){
            String name = txtTimKiemTheoMaTK.getText();
            DefaultTableModel modelNV = new DefaultTableModel();
            modelNV = (DefaultTableModel) tblTK.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
            tblTK.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,2));
        } else {
            String name = txtTimKiemTheoMaTK.getText();
            DefaultTableModel modelNV = new DefaultTableModel();
            modelNV = (DefaultTableModel) tblTK.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelNV);
            tblTK.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,3));
        }
        
    }//GEN-LAST:event_txtTimKiemTheoMaTKKeyReleased

    private void btnChiTietNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChiTietNVMousePressed
        int pos = tblNV.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xem", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormChiTietNhanVien formChiTietNhanVien = new FormChiTietNhanVien();
            formChiTietNhanVien.setVisible(true);
        }
    }//GEN-LAST:event_btnChiTietNVMousePressed

    private void btnThemNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNVMousePressed
        FormThemNhanVien formThemNhanVien = new FormThemNhanVien();
        formThemNhanVien.setVisible(true);
    }//GEN-LAST:event_btnThemNVMousePressed

    private void btnXoaNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaNVMousePressed
        int pos = tblNV.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                NhanVien nv = nvDao.layNhanVienTheoMa(tblNV.getValueAt(pos, 0).toString());
                if(nvDao.deleteNhanVien(nv) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataNhanVien();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaNVMousePressed

    private void btnSuaNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaNVMousePressed
        int pos = tblNV.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatNhanVien formCapNhatNhanVien = new FormCapNhatNhanVien();
            formCapNhatNhanVien.setVisible(true);
            formCapNhatNhanVien.txtTenNV.setText(tblNV.getValueAt(pos, 1).toString());
            formCapNhatNhanVien.txtNgaySinhNV.setText(tblNV.getValueAt(pos, 2).toString());           
            formCapNhatNhanVien.txtDiaChiNV.setText(tblNV.getValueAt(pos, 3).toString());
            formCapNhatNhanVien.txtSDTNV.setText(tblNV.getValueAt(pos, 4).toString());
            formCapNhatNhanVien.txtLuongCoBan.setText(tblNV.getValueAt(pos, 5).toString());
            formCapNhatNhanVien.cboChucVu.setSelectedItem(tblNV.getValueAt(pos, 6).toString());
        }
    }//GEN-LAST:event_btnSuaNVMousePressed

    private void btnThemCVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemCVMousePressed
        FormThemChucVu formThemChucVu = new FormThemChucVu();
        formThemChucVu.setVisible(true);
    }//GEN-LAST:event_btnThemCVMousePressed

    private void btnXoaCVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaCVMousePressed
        int pos = tblCV.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ChucVu cv = cvDao.layChucVuTheoMa(tblCV.getValueAt(pos, 0).toString());
                if(cvDao.deleteChucVu(cv) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataChucVu();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaCVMousePressed

    private void btnCapNhatCVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatCVMousePressed
        int pos = tblCV.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatChucVu formCapNhatChucVu = new FormCapNhatChucVu();
            formCapNhatChucVu.setVisible(true);
            formCapNhatChucVu.txtTenCV.setText(tblCV.getValueAt(pos, 1).toString());
        }
    }//GEN-LAST:event_btnCapNhatCVMousePressed

    private void btnXoaCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaCVActionPerformed

    private void btnThemTKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemTKMousePressed
        FormThemTaiKhoan formThemTaiKhoan = new FormThemTaiKhoan();
        formThemTaiKhoan.setVisible(true);
    }//GEN-LAST:event_btnThemTKMousePressed

    private void btnXoaTKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaTKMousePressed
        int pos = tblTK.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                TaiKhoan tk = tkDao.layTaiKhoanTheoMa(tblTK.getValueAt(pos, 0).toString());
                if(tkDao.deleteTaiKhoan(tk) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataChucVu();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaTKMousePressed

    private void btnCapNhatTKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatTKMousePressed
        int pos = tblTK.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatTaiKhoan formCapNhatTaiKhoan = new FormCapNhatTaiKhoan();
            formCapNhatTaiKhoan.setVisible(true);
            formCapNhatTaiKhoan.txtMaNV.setText(tblTK.getValueAt(pos, 1).toString());
            formCapNhatTaiKhoan.txtTenDangNhap.setText(tblTK.getValueAt(pos, 3).toString());
            formCapNhatTaiKhoan.txtMatKhau.setText(tblTK.getValueAt(pos, 4).toString());
        }
    }//GEN-LAST:event_btnCapNhatTKMousePressed

    
    // TABLE CHỨC VỤ
    public static void fillDataChucVu(){
        DefaultTableModel model = (DefaultTableModel) tblCV.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<2;i++){
            tblCV.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(ChucVu cv : cvDao.layDSChucVu()){  
            Object[] rowData = new Object[2];
            rowData[0] = cv.getMaChucVu();
            rowData[1] = cv.getTenChucVu();
            model.addRow(rowData);
        }
    }
    
    // TABLE NHÂN VIÊN
    public static void fillDataNhanVien(){
        DefaultTableModel model = (DefaultTableModel) tblNV.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblNV.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(NhanVien nv : nvDao.layDSNhanVien()){  
            Object[] rowData = new Object[7];
            rowData[0] = nv.getMaNhanVien();
            rowData[1] = nv.getTenNhanVien();
            rowData[2] = dfm.format(nv.getNgaySinh());           
            rowData[3] = nv.getDiaChi();
            rowData[4] = nv.getSDT();
            rowData[5] = nv.getLuongCoBan();
            rowData[6] = nv.getCv().getTenChucVu();
            model.addRow(rowData);
        }
    }
    
    // TABLE TÀI KHOẢN
    public static void fillDataTaiKhoan(){
        DefaultTableModel model = (DefaultTableModel) tblTK.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblTK.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(TaiKhoan tk : tkDao.layDSTaiKhoan()){  
            Object[] rowData = new Object[5];
            rowData[0] = tk.getMaTaiKhoan();
            rowData[1] = tk.getNhanVien().getMaNhanVien();
            rowData[2] = tk.getNhanVien().getTenNhanVien();           
            rowData[3] = tk.getTenDangNhap();
            rowData[4] = tk.getMatKhau();
            model.addRow(rowData);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnCapNhatCV;
    private Swing.ButtonGradient btnCapNhatTK;
    private Swing.ButtonGradient btnChiTietNV;
    private Swing.ButtonGradient btnSuaNV;
    private Swing.ButtonGradient btnThemCV;
    private Swing.ButtonGradient btnThemNV;
    private Swing.ButtonGradient btnThemTK;
    private Swing.ButtonGradient btnXoaCV;
    private Swing.ButtonGradient btnXoaNV;
    private Swing.ButtonGradient btnXoaTK;
    private javax.swing.JComboBox<String> cbo_SearchBy;
    private javax.swing.JComboBox<String> cbo_SearchBy1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblRefeshTK;
    private javax.swing.JLabel lblRefreshChucVu;
    private javax.swing.JLabel lblRefreshNV;
    private javax.swing.JPanel pnlChucVu;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlTaiKhoan;
    public static javax.swing.JTable tblCV;
    public static javax.swing.JTable tblNV;
    public static javax.swing.JTable tblTK;
    private Swing.TextField txtTimKiemChucVu;
    private Swing.TextField txtTimKiemTheoMaNV;
    private Swing.TextField txtTimKiemTheoMaTK;
    // End of variables declaration//GEN-END:variables
}
