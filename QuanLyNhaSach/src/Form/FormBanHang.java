package Form;

import Connect.SharedData;
import Dao.ChiTietHoaDonDAO;
import Dao.HoaDonDAO;
import Dao.KhachHangDAO;
import Dao.SachDAO;
import Dao.TacGiaDAO;
import Dao.TheLoaiDAO;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.Sach;
import Entity.TacGia;
import Entity.TheLoai;
import Entity.myFunction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.sort.RowFilters;

public class FormBanHang extends javax.swing.JPanel {

    TacGiaDAO tgDao = new TacGiaDAO();
    SachDAO sachDao = new SachDAO();
    KhachHangDAO khDao = new KhachHangDAO();
    ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
    HoaDonDAO hdDao = new HoaDonDAO();
    TheLoaiDAO tlDao = new TheLoaiDAO();
    private SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
    
    public FormBanHang() {
        initComponents();
        fillDataSach();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        cboSearchBy = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNgayLap = new Swing.TextField();
        txtKhachHang = new Swing.TextField();
        txtSDTKH = new Swing.TextField();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiem = new Swing.TextField();
        jLabel7 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblTimKH = new javax.swing.JLabel();
        lblRefreshBH = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtChietKhau = new Swing.TextField();
        lblRefreshBH1 = new javax.swing.JLabel();
        btnInHoaDon = new Swing.ButtonGradient();
        btnThanhToan = new Swing.ButtonGradient();
        btnThemHD = new Swing.ButtonGradient();
        btnXoaHD = new Swing.ButtonGradient();
        btnTangSL = new Swing.ButtonGradient();
        btnGiamSL = new Swing.ButtonGradient();
        btnApDungCK = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        tblCTHD.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblCTHD.setRequestFocusEnabled(false);
        tblCTHD.setRowHeight(30);
        tblCTHD.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane1.setViewportView(tblCTHD);

        tblSach.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Đơn giá", "Số lượng"
            }
        ));
        tblSach.setRequestFocusEnabled(false);
        tblSach.setRowHeight(30);
        tblSach.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(tblSach);

        cboSearchBy.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cboSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Thể loại", "Tác giả" }));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Tìm kiếm theo:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("SĐT Khách Hàng:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Tên khách hàng:");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Ngày lập:");

        txtNgayLap.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtKhachHang.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtSDTKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Bán hàng");

        txtTimKiem.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(221, 83, 83));
        jLabel7.setText("Tổng:");

        lblTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblTongTien.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(221, 83, 83));
        lblTongTien.setText("0.0Đ");

        lblTimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_search_30px.png"))); // NOI18N
        lblTimKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTimKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTimKHMousePressed(evt);
            }
        });

        lblRefreshBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefreshBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshBHMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setText("Chiết khấu:");

        txtChietKhau.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        lblRefreshBH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefreshBH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshBH1MousePressed(evt);
            }
        });

        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnInHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInHoaDonMousePressed(evt);
            }
        });
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThanhToanMousePressed(evt);
            }
        });
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnThemHD.setText("Thêm");
        btnThemHD.setFocusable(false);
        btnThemHD.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnThemHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemHDMousePressed(evt);
            }
        });
        btnThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDActionPerformed(evt);
            }
        });

        btnXoaHD.setText("Xóa");
        btnXoaHD.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnXoaHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaHDMousePressed(evt);
            }
        });
        btnXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHDActionPerformed(evt);
            }
        });

        btnTangSL.setText("Tăng");
        btnTangSL.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnTangSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTangSLMousePressed(evt);
            }
        });
        btnTangSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangSLActionPerformed(evt);
            }
        });

        btnGiamSL.setText("Giảm");
        btnGiamSL.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        btnGiamSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGiamSLMousePressed(evt);
            }
        });

        btnApDungCK.setText("Áp dụng");
        btnApDungCK.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnApDungCK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnApDungCKMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnThemHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoaHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTangSL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGiamSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRefreshBH))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cboSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApDungCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblRefreshBH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongTien))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTimKH))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(546, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTimKH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRefreshBH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTangSL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGiamSL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblTongTien)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRefreshBH1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(btnApDungCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblTimKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTimKHMousePressed
        
        
        String s = txtSDTKH.getText();
        if(s.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại", "Thông báo", JOptionPane.ERROR_MESSAGE);   
        }
        else if(!myFunction.checkSDT(s)){
            JOptionPane.showMessageDialog(this, "Số điện thoại nhập không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);            
        }
        else{
            try {
                KhachHang kh = khDao.layKhachHangTheoSDT(txtSDTKH.getText());
                if(kh == null){
                JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                txtKhachHang.setText(kh.getTenKhachHang());
            } catch (Exception e) {
                System.out.println("Khách hàng null: " + e.toString());
            }            
        }
    }//GEN-LAST:event_lblTimKHMousePressed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        String searchBy = cboSearchBy.getSelectedItem().toString();
        if(searchBy.equalsIgnoreCase("Mã sách")){
            String name = txtTimKiem.getText();
            DefaultTableModel modelSach = new DefaultTableModel();
            modelSach = (DefaultTableModel) tblSach.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,0));
        } else if(searchBy.equalsIgnoreCase("Tên sách")){
            String name = txtTimKiem.getText();
            DefaultTableModel modelSach = new DefaultTableModel();
            modelSach = (DefaultTableModel) tblSach.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,1));
        } else if(searchBy.equalsIgnoreCase("Thể loại")){
            String name = txtTimKiem.getText();
            DefaultTableModel modelSach = new DefaultTableModel();
            modelSach = (DefaultTableModel) tblSach.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,2));
        } else {
            String name = txtTimKiem.getText();
            DefaultTableModel modelSach = new DefaultTableModel();
            modelSach = (DefaultTableModel) tblSach.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
            tblSach.setRowSorter(trs);
            trs.setRowFilter(RowFilters.regexFilter(name,3));
        }
        
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void lblRefreshBHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshBHMousePressed
        fillDataSach();
    }//GEN-LAST:event_lblRefreshBHMousePressed

    private void lblRefreshBH1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshBH1MousePressed
        txtChietKhau.setText("");
        double tong = 0;
        if(tblCTHD.getRowCount()>0){
            for(int i=0;i<tblCTHD.getRowCount();i++){
                tong = tong + Double.parseDouble(tblCTHD.getValueAt(i, 4).toString());
            }
            lblTongTien.setText(String.valueOf(tong));
        } else {
            JOptionPane.showMessageDialog(this, "Chưa có sách nào trong hóa đơn", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_lblRefreshBH1MousePressed

    private void btnInHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInHoaDonMousePressed
        HoaDon hd = getHoaDonGanNhat();
        int maHoaDon = hd.getMaHoaDon();
        System.out.println(maHoaDon);
        try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("src/Report/rptHoaDon2.jrxml");
            map.put("sMaHD", maHoaDon);
            java.sql.Connection con = Connect.DatabaseHelper.getConnection();
            JasperPrint p = JasperFillManager.fillReport(rpt, map, con);
            JasperViewer.viewReport(p, false);
        } catch (Exception e) {
            System.out.println("Lỗi in hóa đơn: " + e.toString());
        }
    }//GEN-LAST:event_btnInHoaDonMousePressed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnThanhToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMousePressed
                String s1 = txtKhachHang.getText();
        String s2 = txtNgayLap.getText();
        String s3 = txtChietKhau.getText();
        
        if(txtKhachHang.getText().equalsIgnoreCase("") ||            
           txtNgayLap.getText().equalsIgnoreCase("") || 
           lblTongTien.getText().equalsIgnoreCase("0.0") ||
           txtChietKhau.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (!myFunction.checkTen(s1) || !myFunction.checkNgayThang(s2) || !myFunction.checkChietKhau(s3)){
            JOptionPane.showMessageDialog(this, "Tên, ngày sinh, hoặc chiết khấu nhập không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }         
        else {
            try {
                
                // THÊM HÓA ĐƠN
                HoaDon hd = getEntityHoaDon();               
                if(hdDao.addHoaDon(hd)>0){  
                    ArrayList<ChiTietHoaDon> list = getEntityCTHD();
                    ArrayList<Sach> listSach  = new ArrayList<>();
                    
                    // THÊM CHI TIẾT HÓA ĐƠN
                    for (ChiTietHoaDon chiTietHoaDon : list) {
                        cthddao.addChiTietHoaDon(chiTietHoaDon);
                   }
                    
                    // LẤY DANH SÁCH SÁCH TRONG HÓA ĐƠN ĐỂ CẬP NHẬT SỐ LƯỢNG
                    for (int i=0;i<tblCTHD.getRowCount();i++){
                        Sach s = sachDao.laySachTheoMa(tblCTHD.getValueAt(i, 0).toString());
                        listSach.add(s);
                    } 
                    
                    // CẬP NHẬT SỐ LƯỢNG SÁCH
                    for (int i=0;i<tblCTHD.getRowCount();i++) {
                        String maSach = listSach.get(i).getMaSach();
                        int soLuong = listSach.get(i).getSoLuong() - Integer.parseInt(tblCTHD.getValueAt(i, 2).toString());
                        if(soLuong < 0) {
                            JOptionPane.showMessageDialog(this, "Không đủ số lượng sách bán", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            sachDao.updateSoLuongSach(maSach, soLuong);
                        }                     
                   }
                    JOptionPane.showMessageDialog(this, "Thanh toán thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataSach();
                    DefaultTableModel modelCTHD = (DefaultTableModel) tblCTHD.getModel();
                    modelCTHD.setRowCount(0);
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("Lỗi hoa don: " + e.toString());
            }
        }
        txtChietKhau.setText("");
        txtKhachHang.setText("");
        txtSDTKH.setText("");
        txtNgayLap.setText("");
    }//GEN-LAST:event_btnThanhToanMousePressed

    private void btnThemHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemHDMousePressed
              
        int pos = tblSach.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để thêm", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            String input = JOptionPane.showInputDialog("Nhập số lượng sách: ");
            if(Integer.parseInt(input) > Integer.parseInt(tblSach.getValueAt(pos, 5).toString()) ||
               Integer.parseInt(input) < 0){
                JOptionPane.showMessageDialog(this, "Nhập sai vui lòng nhập lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            else {
                DefaultTableModel modelCTHD = new DefaultTableModel();
                modelCTHD = (DefaultTableModel) tblCTHD.getModel(); 
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(JLabel.CENTER);
                for(int i=0;i<5;i++){
                    tblCTHD.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
                String maSach = tblSach.getValueAt(pos, 0).toString();
                String tenSach = tblSach.getValueAt(pos, 1).toString();
                int soLuong = Integer.parseInt(input);
                int soLuongBD = Integer.parseInt(tblSach.getValueAt(pos, 5).toString());
                double donGia = Double.parseDouble(tblSach.getValueAt(pos, 4).toString());
                tblSach.setValueAt(soLuongBD - soLuong, pos, 5);
                double thanhTien = donGia * soLuong;
                double tong = 0;
                Object[] rowData = new Object[5];
                rowData[0] = maSach;
                rowData[1] = tenSach;
                rowData[2] = soLuong;
                rowData[3] = donGia;
                rowData[4] = thanhTien;
                modelCTHD.addRow(rowData);
                    for(int i=0;i<modelCTHD.getRowCount();i++){
                        tong = tong + Double.parseDouble(tblCTHD.getValueAt(i, 4).toString());
                    }
                lblTongTien.setText(String.valueOf(tong));       
                }
        }
    }//GEN-LAST:event_btnThemHDMousePressed

    private void btnThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemHDActionPerformed

    private void btnXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaHDActionPerformed

    private void btnXoaHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaHDMousePressed
                double tong = 0;
        int pos = tblCTHD.getSelectedRow();
        if(pos >= 0){
            int modelIndex = tblCTHD.convertRowIndexToModel(pos);           
            Sach s = sachDao.laySachTheoMa(tblCTHD.getValueAt(pos, 0).toString());                    
            for(int i=0;i<tblSach.getRowCount();i++){
                if(tblSach.getValueAt(i, 0).toString().equalsIgnoreCase(tblCTHD.getValueAt(pos, 0).toString())){
                    int slSachTrongHD = Integer.parseInt(tblCTHD.getValueAt(pos, 2).toString());
                    int slSach = Integer.parseInt(tblSach.getValueAt(i, 5).toString());
                    int slSachSauKhiXoaHD = slSach + slSachTrongHD;
                    tblSach.setValueAt(slSachSauKhiXoaHD, i, 5);
                }
            }
            DefaultTableModel modelCTHD = (DefaultTableModel) tblCTHD.getModel();
            modelCTHD.removeRow(modelIndex);
            fillDataSach();
        } 
        else{
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        
        for(int i=0;i<tblCTHD.getRowCount();i++){
            tong = tong + Double.parseDouble(tblCTHD.getValueAt(i, 4).toString());
        }
        lblTongTien.setText(String.valueOf(tong));
    }//GEN-LAST:event_btnXoaHDMousePressed

    private void btnTangSLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangSLMousePressed
        int pos = tblCTHD.getSelectedRow();
        int slBD = Integer.parseInt(tblCTHD.getValueAt(pos, 2).toString());
        slBD++;
        tblCTHD.setValueAt(slBD, pos, 2);          
        double donGia = Double.parseDouble(tblCTHD.getValueAt(pos, 3).toString());
        int slHT = Integer.parseInt(tblCTHD.getValueAt(pos, 2).toString());
        double thanhTien = donGia * slHT;
        tblCTHD.setValueAt(thanhTien, pos, 4);
        double tong = 0;
        for(int i=0;i<tblCTHD.getRowCount();i++){
            tong = tong + Double.parseDouble(tblCTHD.getValueAt(i, 4).toString());
        }
        lblTongTien.setText(String.valueOf(tong));
        for(int i=0;i<tblSach.getRowCount();i++){
            if(tblSach.getValueAt(i, 0).toString().equalsIgnoreCase(tblCTHD.getValueAt(pos, 0).toString())){
                int slConLai = Integer.parseInt(tblSach.getValueAt(i, 5).toString()) - 1;
                if(slConLai < 0){
                    JOptionPane.showMessageDialog(this, "Không còn đủ số lượng bán", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                    tblSach.setValueAt(slConLai, i, 5);
                }           
            }
        }    
    }//GEN-LAST:event_btnTangSLMousePressed

    private void btnTangSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTangSLActionPerformed

    private void btnGiamSLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiamSLMousePressed
                int pos = tblCTHD.getSelectedRow();
        int slBD = Integer.parseInt(tblCTHD.getValueAt(pos, 2).toString());
        slBD--;
        if(slBD < 1){
            JOptionPane.showMessageDialog(this, "Không thể giảm hơn nữa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            tblCTHD.setValueAt(slBD, pos, 2);
            double donGia = Double.parseDouble(tblCTHD.getValueAt(pos, 3).toString());
            int slHT = Integer.parseInt(tblCTHD.getValueAt(pos, 2).toString());
            double thanhTien = donGia * slHT;
            tblCTHD.setValueAt(thanhTien, pos, 4);
            double tong = 0;
            for(int i=0;i<tblCTHD.getRowCount();i++){
                tong = tong + Double.parseDouble(tblCTHD.getValueAt(i, 4).toString());
            }
            lblTongTien.setText(String.valueOf(tong));
            for(int i=0;i<tblSach.getRowCount();i++){
                if(tblSach.getValueAt(i, 0).toString().equalsIgnoreCase(tblCTHD.getValueAt(pos, 0).toString())){
                    int slConLai = Integer.parseInt(tblSach.getValueAt(i, 5).toString()) + 1;
                    tblSach.setValueAt(slConLai, i, 5);
                }
            }
        }
    }//GEN-LAST:event_btnGiamSLMousePressed

    private void btnApDungCKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApDungCKMousePressed
         int chietKhau = Integer.parseInt(txtChietKhau.getText());
        double tongTien = Double.parseDouble(lblTongTien.getText());
        if(chietKhau >= 0){
            tongTien = tongTien - (tongTien*chietKhau)/100;
        }
        lblTongTien.setText(String.valueOf(tongTien));
    }//GEN-LAST:event_btnApDungCKMousePressed

    // GET HÓA ĐƠN GẦN NHẤT
     public HoaDon getHoaDonGanNhat(){
        List<HoaDon> listHD = hdDao.layDSHoaDon();
        HoaDon hdTam = listHD.get(listHD.size()-1);
        return hdTam;
    }
    
    // GET ENTITY
    public ArrayList<ChiTietHoaDon> getEntityCTHD(){
        ArrayList<ChiTietHoaDon> listCTHD = new ArrayList<>();
        for (int i=0;i<tblCTHD.getRowCount();i++) {
            ChiTietHoaDon cthd = new ChiTietHoaDon();
            Sach s = sachDao.laySachTheoMa(tblCTHD.getValueAt(i, 0).toString());
            cthd.setHoaDon(getHoaDonGanNhat());
            cthd.setSach(s);
            cthd.setSoLuong(Integer.parseInt(tblCTHD.getValueAt(i,2).toString()));
            listCTHD.add(cthd);
        }      
        return listCTHD;
    }
    
    public HoaDon getEntityHoaDon() throws ParseException{
        HoaDon hd = new HoaDon();
        hd.setKhachHang(khDao.layKhachHangTheoSDT(txtSDTKH.getText()));
        hd.setNhanVien(SharedData.nhanVien);
        hd.setNgayLap(dfm.parse(txtNgayLap.getText()));
        hd.setChietKhau(Float.parseFloat(txtChietKhau.getText()));
        hd.setTongTien(Double.parseDouble(lblTongTien.getText()));
        return hd;
    }
    
    // GET COMBOBOX
    public void getComboBoxTheLoai(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboSearchBy.getModel();
        for(TheLoai tl : tlDao.layDSTheLoai()){
            cboModel.addElement(tl.getTenTheLoai());
        }
    }
    
    // SEARCH    
    public void searchSachTheoTheLoai(String name){
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblSach.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,2));
    }
    
    public void searchSachTheoTacGia(String name){
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblSach.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,3));
    }
    
    // TABLE SÁCH
    public void fillDataSach(){
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<6;i++){
            tblSach.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelSach.setRowCount(0);     
        for(Sach s : sachDao.layDSSach()){  
            Object[] rowData = new Object[7];
            rowData[0] = s.getMaSach();
            rowData[1] = s.getTenSach();
            rowData[3] = s.getTacGia().getTenTacGia();
            rowData[2] = s.getTheLoai().getTenTheLoai();
            rowData[4] = s.getDonGia();
            rowData[5] = s.getSoLuong();
            modelSach.addRow(rowData);
        }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnApDungCK;
    private Swing.ButtonGradient btnGiamSL;
    private Swing.ButtonGradient btnInHoaDon;
    private Swing.ButtonGradient btnTangSL;
    private Swing.ButtonGradient btnThanhToan;
    private Swing.ButtonGradient btnThemHD;
    private Swing.ButtonGradient btnXoaHD;
    private javax.swing.JComboBox<String> cboSearchBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRefreshBH;
    private javax.swing.JLabel lblRefreshBH1;
    private javax.swing.JLabel lblTimKH;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTable tblSach;
    private Swing.TextField txtChietKhau;
    private Swing.TextField txtKhachHang;
    private Swing.TextField txtNgayLap;
    private Swing.TextField txtSDTKH;
    private Swing.TextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
