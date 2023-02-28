package Form;

import Dao.KhachHangDAO;
import Dao.LoaiKhachHangDAO;
import Entity.KhachHang;
import Entity.LoaiKhachHang;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.sort.RowFilters;

public class FormKhachHang extends javax.swing.JPanel {
    
    static LoaiKhachHangDAO loaiDao = new LoaiKhachHangDAO();
    static KhachHangDAO khDao = new KhachHangDAO();
    static SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
    
    public FormKhachHang() {
        initComponents();
        fillDataLoaiKhachHang();
        fillDataKhachHang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        lblRefeshKH = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTimKiemTheoMaKH = new Swing.TextField();
        jLabel11 = new javax.swing.JLabel();
        cbo_SearchBy3 = new javax.swing.JComboBox<>();
        btnChiTietKhachHang = new Swing.ButtonGradient();
        btnThemKH = new Swing.ButtonGradient();
        btnXoaKH = new Swing.ButtonGradient();
        btnCapNhatKH = new Swing.ButtonGradient();
        pnlTacGia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLoaiKH = new javax.swing.JTable();
        lblRefeshLoaiKH = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiemLoaiKH = new Swing.TextField();
        btnThemLoaiKH = new Swing.ButtonGradient();
        btnXoaLoaiKH = new Swing.ButtonGradient();
        btnCapNhatLoaiKH = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        pnlSach.setBackground(new java.awt.Color(255, 255, 255));

        tblKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Ngày sinh", "Email", "Địa chỉ", "SĐT", "Loại khách hàng"
            }
        ));
        tblKH.setRequestFocusEnabled(false);
        tblKH.setRowHeight(30);
        tblKH.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane1.setViewportView(tblKH);

        lblRefeshKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefeshKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefeshKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefeshKHMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Nhập thông tin Khách hàng");

        txtTimKiemTheoMaKH.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        txtTimKiemTheoMaKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaKHKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel11.setText("Tìm kiếm theo:");

        cbo_SearchBy3.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cbo_SearchBy3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khách hàng", "Tên khách hàng", "Loại khách hàng" }));

        btnChiTietKhachHang.setText("Chi tiết");
        btnChiTietKhachHang.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnChiTietKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChiTietKhachHangMousePressed(evt);
            }
        });

        btnThemKH.setText("Thêm");
        btnThemKH.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemKHMousePressed(evt);
            }
        });

        btnXoaKH.setText("Xóa");
        btnXoaKH.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnXoaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaKHMousePressed(evt);
            }
        });

        btnCapNhatKH.setText("Cập Nhật");
        btnCapNhatKH.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnCapNhatKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatKHMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlSachLayout = new javax.swing.GroupLayout(pnlSach);
        pnlSach.setLayout(pnlSachLayout);
        pnlSachLayout.setHorizontalGroup(
            pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlSachLayout.createSequentialGroup()
                        .addComponent(txtTimKiemTheoMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cbo_SearchBy3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lblRefeshKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                        .addComponent(btnChiTietKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhatKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(pnlSachLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSachLayout.setVerticalGroup(
            pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSachLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTimKiemTheoMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhatKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChiTietKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblRefeshKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSachLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_SearchBy3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khách hàng", pnlSach);

        pnlTacGia.setBackground(new java.awt.Color(255, 255, 255));

        tblLoaiKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblLoaiKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã loại", "Tên loại"
            }
        ));
        tblLoaiKH.setRequestFocusEnabled(false);
        tblLoaiKH.setRowHeight(30);
        tblLoaiKH.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(tblLoaiKH);

        lblRefeshLoaiKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefeshLoaiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefeshLoaiKHMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Nhập loại khách hàng");

        txtTimKiemLoaiKH.setText("Loại khách hàng");
        txtTimKiemLoaiKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiemLoaiKH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemLoaiKHFocusLost(evt);
            }
        });
        txtTimKiemLoaiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemLoaiKHMousePressed(evt);
            }
        });
        txtTimKiemLoaiKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemLoaiKHKeyReleased(evt);
            }
        });

        btnThemLoaiKH.setText("Thêm");
        btnThemLoaiKH.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnThemLoaiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemLoaiKHMousePressed(evt);
            }
        });

        btnXoaLoaiKH.setText("Xóa");
        btnXoaLoaiKH.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXoaLoaiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaLoaiKHMousePressed(evt);
            }
        });

        btnCapNhatLoaiKH.setText("Cập Nhật");
        btnCapNhatLoaiKH.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnCapNhatLoaiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapNhatLoaiKHMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlTacGiaLayout = new javax.swing.GroupLayout(pnlTacGia);
        pnlTacGia.setLayout(pnlTacGiaLayout);
        pnlTacGiaLayout.setHorizontalGroup(
            pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlTacGiaLayout.createSequentialGroup()
                        .addComponent(txtTimKiemLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblRefeshLoaiKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 698, Short.MAX_VALUE)
                        .addComponent(btnThemLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnXoaLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnCapNhatLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTacGiaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTacGiaLayout.setVerticalGroup(
            pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTacGiaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoaLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapNhatLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTimKiemLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRefeshLoaiKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Loại khách hàng", pnlTacGia);

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

    // KHÁCH HÀNG
    private void lblRefeshKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefeshKHMousePressed

        fillDataKhachHang();
    }//GEN-LAST:event_lblRefeshKHMousePressed

    private void lblRefeshLoaiKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefeshLoaiKHMousePressed
        txtTimKiemLoaiKH.setText("Loại khách hàng");
    }//GEN-LAST:event_lblRefeshLoaiKHMousePressed

    private void txtTimKiemTheoMaKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaKHKeyReleased
        String searchBy = cbo_SearchBy3.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã khách hàng")){
            String name = txtTimKiemTheoMaKH.getText();
            DefaultTableModel modelKH = new DefaultTableModel();
            modelKH = (DefaultTableModel) tblKH.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelKH);
            tblKH.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,0));
        } else if(searchBy.equalsIgnoreCase("Tên khách hàng")){
            String name = txtTimKiemTheoMaKH.getText();
            DefaultTableModel modelKH = new DefaultTableModel();
            modelKH = (DefaultTableModel) tblKH.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelKH);
            tblKH.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else {
            String name = txtTimKiemTheoMaKH.getText();
            DefaultTableModel modelKH = new DefaultTableModel();
            modelKH = (DefaultTableModel) tblKH.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelKH);
            tblKH.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,6));
        }
        
    }//GEN-LAST:event_txtTimKiemTheoMaKHKeyReleased

    private void txtTimKiemLoaiKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemLoaiKHKeyReleased
        String name = txtTimKiemLoaiKH.getText();
        DefaultTableModel modelKH = new DefaultTableModel();
        modelKH = (DefaultTableModel) tblLoaiKH.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelKH);
        tblLoaiKH.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtTimKiemLoaiKHKeyReleased

    private void txtTimKiemLoaiKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemLoaiKHMousePressed
        txtTimKiemLoaiKH.setText("");
    }//GEN-LAST:event_txtTimKiemLoaiKHMousePressed

    private void txtTimKiemLoaiKHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemLoaiKHFocusLost
        txtTimKiemLoaiKH.setText("Loại khách hàng");
    }//GEN-LAST:event_txtTimKiemLoaiKHFocusLost

    private void btnChiTietKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChiTietKhachHangMousePressed
        int pos = tblKH.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu xem", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormChiTietKhachHang formChiTietKhachHang = new FormChiTietKhachHang();
            formChiTietKhachHang.setVisible(true);
        }
    }//GEN-LAST:event_btnChiTietKhachHangMousePressed

    private void btnThemKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemKHMousePressed
        FormThemKhachHang formThemKhachHang = new FormThemKhachHang();
        formThemKhachHang.setVisible(true);
    }//GEN-LAST:event_btnThemKHMousePressed

    private void btnXoaKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaKHMousePressed
        int pos = tblKH.getSelectedRow();
        if(pos < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                KhachHang kh = khDao.layKhachHangTheoMa(tblKH.getValueAt(pos, 0).toString());
                if(khDao.deleteKhachHang(kh) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataKhachHang();
                }
                else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaKHMousePressed

    private void btnCapNhatKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatKHMousePressed
        int pos = tblKH.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatKhachHang formCapNhatKhachHang = new FormCapNhatKhachHang();
            formCapNhatKhachHang.setVisible(true);
            formCapNhatKhachHang.txtTenKH.setText(tblKH.getValueAt(pos, 1).toString());
            formCapNhatKhachHang.txtNgaySinhKH.setText(tblKH.getValueAt(pos, 2).toString());
            formCapNhatKhachHang.txtEmailKH.setText(tblKH.getValueAt(pos, 3).toString());
            formCapNhatKhachHang.txtDiaChiKH.setText(tblKH.getValueAt(pos, 4).toString());
            formCapNhatKhachHang.txtSDTKH.setText(tblKH.getValueAt(pos, 5).toString());
            formCapNhatKhachHang.cboLoaiKH.setSelectedItem(tblKH.getValueAt(pos, 6).toString());
        }
    }//GEN-LAST:event_btnCapNhatKHMousePressed

    private void btnThemLoaiKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemLoaiKHMousePressed
        FormThemTheLoaiKH formThemTheLoaiKH = new FormThemTheLoaiKH();
        formThemTheLoaiKH.setVisible(true);
    }//GEN-LAST:event_btnThemLoaiKHMousePressed

    private void btnXoaLoaiKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaLoaiKHMousePressed
        int pos = tblLoaiKH.getSelectedRow();
        if(pos == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                LoaiKhachHang kh = loaiDao.lay1KhachHang(tblLoaiKH.getValueAt(pos, 0).toString());
                if(loaiDao.deleteLoaiKhachHang(kh) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataLoaiKhachHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnXoaLoaiKHMousePressed

    private void btnCapNhatLoaiKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatLoaiKHMousePressed
        int pos = tblLoaiKH.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            FormCapNhatLoaiKH formCapNhatLoaiKH = new FormCapNhatLoaiKH();
            formCapNhatLoaiKH.setVisible(true);
            formCapNhatLoaiKH.txtTenLoaiKH.setText(tblLoaiKH.getValueAt(pos, 1).toString());
        }
    }//GEN-LAST:event_btnCapNhatLoaiKHMousePressed

   // TABLE LOAI KHACH HANG
    public static void fillDataLoaiKhachHang(){
        DefaultTableModel model = (DefaultTableModel) tblLoaiKH.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<2;i++){
            tblLoaiKH.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(LoaiKhachHang loaiKH : loaiDao.layDSLoaiKhachHang()){  
            Object[] rowData = new Object[2];
            rowData[0] = loaiKH.getMaLoaiKhachHang();
            rowData[1] = loaiKH.getTenLoaiKhachHang();
            model.addRow(rowData);
        }
    }
    
    //TABLE KHÁCH HÀNG
    public static void fillDataKhachHang(){
        DefaultTableModel model = (DefaultTableModel) tblKH.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblKH.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);     
        for(KhachHang kh : khDao.layDSKhachHang()){  
            Object[] rowData = new Object[7];
            rowData[0] = kh.getMaKhachHang();
            rowData[1] = kh.getTenKhachHang();
            rowData[2] = dfm.format(kh.getNgaySinh());
            rowData[3] = kh.getEmail();
            rowData[4] = kh.getDiaChi();
            rowData[5] = kh.getSDT();
            rowData[6] = kh.getLoai().getTenLoaiKhachHang();
            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnCapNhatKH;
    private Swing.ButtonGradient btnCapNhatLoaiKH;
    private Swing.ButtonGradient btnChiTietKhachHang;
    private Swing.ButtonGradient btnThemKH;
    private Swing.ButtonGradient btnThemLoaiKH;
    private Swing.ButtonGradient btnXoaKH;
    private Swing.ButtonGradient btnXoaLoaiKH;
    private javax.swing.JComboBox<String> cbo_SearchBy3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblRefeshKH;
    private javax.swing.JLabel lblRefeshLoaiKH;
    private javax.swing.JPanel pnlSach;
    private javax.swing.JPanel pnlTacGia;
    public static javax.swing.JTable tblKH;
    public static javax.swing.JTable tblLoaiKH;
    private Swing.TextField txtTimKiemLoaiKH;
    private Swing.TextField txtTimKiemTheoMaKH;
    // End of variables declaration//GEN-END:variables
}
