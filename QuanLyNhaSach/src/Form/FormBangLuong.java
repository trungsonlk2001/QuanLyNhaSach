package Form;

import Dao.BangCongDAO;
import Dao.NhanVienDAO;
import Entity.BangCong;
import Entity.NhanVien;
import Entity.Sach;
import Entity.myFunction;
import static Form.FormSach.sDao;
import com.raven.datechooser.DateChooser;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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

public class FormBangLuong extends javax.swing.JPanel {

    NhanVienDAO nvDao = new NhanVienDAO();
    BangCongDAO bcDao = new BangCongDAO();
    
    public FormBangLuong() {
        initComponents();
        getComboBoxNhanVien();
        fillDataBangCong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboNhanVien = new Swing.ComboboxSuggestion();
        txtMaNhanVien = new Swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtThang = new Swing.TextField();
        roundPanel1 = new Swing.RoundPanel();
        txtTimTheoThang = new Swing.TextField();
        lblTimKiem = new javax.swing.JLabel();
        txtTimNhanVien = new Swing.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTiet = new javax.swing.JTable();
        lblTongTien = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoNgayLam = new Swing.TextField();
        jLabel7 = new javax.swing.JLabel();
        txtNghiCoPhep = new Swing.TextField();
        jLabel11 = new javax.swing.JLabel();
        txtNghiKhongPhep = new Swing.TextField();
        lblRefresh = new javax.swing.JLabel();
        btnThemBangCong = new Swing.ButtonGradient();
        btnXoaBangCong = new Swing.ButtonGradient();
        btnUpdateBangCong = new Swing.ButtonGradient();
        btnXuatFile = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        cboNhanVien.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cboNhanVien.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboNhanVienPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtMaNhanVien.setEditable(false);
        txtMaNhanVien.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Nhân viên");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Mã nhân viên:");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("Tháng:");

        txtThang.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        roundPanel1.setBackground(new java.awt.Color(51, 51, 255));

        txtTimTheoThang.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_search_30px.png"))); // NOI18N
        lblTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTimKiemMousePressed(evt);
            }
        });

        txtTimNhanVien.setText("Tên nhân viên");
        txtTimNhanVien.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimNhanVienMousePressed(evt);
            }
        });
        txtTimNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimNhanVienKeyReleased(evt);
            }
        });

        tblChiTiet.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bảng công", "Mã nhân viên", "Tên nhân viên", "Số ngày làm", "Có phép", "Không phép", "Tháng", "Tổng tiền"
            }
        ));
        tblChiTiet.setRequestFocusEnabled(false);
        tblChiTiet.setRowHeight(30);
        tblChiTiet.setSelectionBackground(new java.awt.Color(237, 237, 237));
        tblChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblChiTietMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTiet);

        lblTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblTongTien.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 255, 255));
        lblTongTien.setText("0.0Đ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tổng:");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTimKiem)
                .addGap(18, 18, 18)
                .addComponent(txtTimNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblTongTien))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2)))
                .addGap(19, 19, 19))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimTheoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTongTien))
                .addGap(19, 19, 19))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Bảng lương");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Số ngày làm:");

        txtSoNgayLam.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Nghỉ có phép:");

        txtNghiCoPhep.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel11.setText("Nghỉ không phép:");

        txtNghiKhongPhep.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        lblRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshMousePressed(evt);
            }
        });

        btnThemBangCong.setText("Thêm");
        btnThemBangCong.setFocusable(false);
        btnThemBangCong.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnThemBangCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemBangCongMousePressed(evt);
            }
        });

        btnXoaBangCong.setText("Xóa");
        btnXoaBangCong.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXoaBangCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaBangCongMousePressed(evt);
            }
        });

        btnUpdateBangCong.setText("Cập nhật");
        btnUpdateBangCong.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnUpdateBangCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateBangCongMousePressed(evt);
            }
        });

        btnXuatFile.setText("Xuất file");
        btnXuatFile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatFileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoNgayLam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(467, 467, 467)
                                .addComponent(lblRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(51, 51, 51)
                                .addComponent(txtNghiCoPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNghiKhongPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThemBangCong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaBangCong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateBangCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoNgayLam, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNghiCoPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNghiKhongPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnThemBangCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoaBangCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateBangCong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblRefreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMousePressed
        reset();
    }//GEN-LAST:event_lblRefreshMousePressed

    private void txtTimNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimNhanVienKeyReleased
        String name = txtTimNhanVien.getText();
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblChiTiet.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblChiTiet.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,2));
    }//GEN-LAST:event_txtTimNhanVienKeyReleased

    private void cboNhanVienPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboNhanVienPopupMenuWillBecomeInvisible
        NhanVien nv = nvDao.layNhanVienTheoTen(cboNhanVien.getSelectedItem().toString());
        txtMaNhanVien.setText(String.valueOf(nv.getMaNhanVien()));
    }//GEN-LAST:event_cboNhanVienPopupMenuWillBecomeInvisible

    private void tblChiTietMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietMousePressed
        int pos = tblChiTiet.getSelectedRow();
        if(pos < 0){
            return;
        } else {
            txtMaNhanVien.setText(tblChiTiet.getValueAt(pos, 1).toString());
            txtSoNgayLam.setText(tblChiTiet.getValueAt(pos, 3).toString());
            txtNghiCoPhep.setText(tblChiTiet.getValueAt(pos, 4).toString());
            txtNghiKhongPhep.setText(tblChiTiet.getValueAt(pos, 5).toString());
            txtThang.setText(tblChiTiet.getValueAt(pos, 6).toString());
            cboNhanVien.setSelectedItem(tblChiTiet.getValueAt(pos, 2).toString());
        }
    }//GEN-LAST:event_tblChiTietMousePressed

    private void lblTimKiemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTimKiemMousePressed
        String thang = txtTimTheoThang.getText();
        double tongTien = 0;
        if(thang.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
            txtTimTheoThang.requestFocus();
        } else {
            fillDataBangCongTheoThang(thang);
            for(int i=0;i<tblChiTiet.getRowCount();i++){
                tongTien = tongTien + Double.parseDouble(tblChiTiet.getValueAt(i, 7).toString());
            }            
            lblTongTien.setText(Double.toString(tongTien));
        }        
    }//GEN-LAST:event_lblTimKiemMousePressed

    private void txtTimNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimNhanVienMousePressed
        txtTimNhanVien.setText("");
    }//GEN-LAST:event_txtTimNhanVienMousePressed

    private void btnThemBangCongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemBangCongMousePressed
         int check = 0;
        if(txtMaNhanVien.getText().equalsIgnoreCase("") || 
            txtSoNgayLam.getText().equalsIgnoreCase("") ||
            txtNghiCoPhep.getText().equalsIgnoreCase("") ||
            txtNghiKhongPhep.getText().equalsIgnoreCase("") ||
            txtThang.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if(!myFunction.checkSoNgay(txtSoNgayLam.getText()) || !myFunction.checkSoNgay(txtNghiCoPhep.getText()) ||
                    !myFunction.checkSoNgay(txtNghiKhongPhep.getText()) || !myFunction.checkThang(txtThang.getText())){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                BangCong bc = getEntityBangCong();
                for (BangCong bc2 : bcDao.layDSBangCong()) {
                    if(bc.getNhanVien().getMaNhanVien() == bc2.getNhanVien().getMaNhanVien() &&
                        bc.getThang().equalsIgnoreCase(bc2.getThang())){
                        check = 1;
                        break;
                    }
                }
                if(check == 1){
                    JOptionPane.showMessageDialog(this, "Dữ liệu bị trùng", "Thông báo", JOptionPane.ERROR_MESSAGE);
                } else {
                    if(bcDao.addBangCong(bc)>0){
                        JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        fillDataBangCong();
                        reset();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                }                
            } catch (Exception e) {
                System.out.println("Lỗi btn Thêm: " + e.toString());
            }
        }                    
    }//GEN-LAST:event_btnThemBangCongMousePressed

    private void btnXoaBangCongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaBangCongMousePressed
        int pos = tblChiTiet.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu để xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else{
            try {
                BangCong bc = bcDao.layBangCongTheoMa(tblChiTiet.getValueAt(pos, 0).toString());
                if(bcDao.deleteBangCong(bc) > 0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataBangCong();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);                    
                }
            } catch (Exception e) {
                System.out.println("Lỗi btn xóa: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaBangCongMousePressed

    private void btnUpdateBangCongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateBangCongMousePressed
        int pos = tblChiTiet.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dữ liệu để cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                BangCong bc = getEntityBangCongUpdate();
                if(bcDao.updateBangCong(bc)>0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataBangCong();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }               
            } catch (Exception e) {
                System.out.println("Lỗi btn cập nhật: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnUpdateBangCongMousePressed

    private void btnXuatFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatFileMousePressed
        try {
            XSSFWorkbook workbook1 = new XSSFWorkbook();
            XSSFSheet sheet = workbook1.createSheet();

            XSSFRow row = null;
            Cell cell = null;

            row = sheet.createRow(3);

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã bảng công");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Mã nhân viên");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Tên nhân viên");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Số ngày làm");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Có phép");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Không phép");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Tháng");
            
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Tổng tiền");

            List<BangCong> listBangCongHH = bcDao.layDSBangCong();

            if(listBangCongHH != null){
                int s = listBangCongHH.size();
                for(int i=0;i<s;i++){
                    BangCong bangcong = listBangCongHH.get(i);
                    row = sheet.createRow(5 + i);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(bangcong.getMaBangCong());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(bangcong.getNhanVien().getMaNhanVien());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(bangcong.getNhanVien().getTenNhanVien());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(bangcong.getSoNgayLam());

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(bangcong.getNghiCoPhep());

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(bangcong.getNghiKhongPhep());

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(bangcong.getThang());
                    
                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(bangcong.getTongTien());
                }

                String date = LocalDate.now().toString();
                File f = new File("D:/New Folder/BangLuong " + date + ".xlsx");
                FileOutputStream fis = new FileOutputStream(f);
                workbook1.write(fis);
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("Lỗi xuất file: " + e.toString());
        }
    }//GEN-LAST:event_btnXuatFileMousePressed
     
    private BangCong getEntityBangCong(){
        NhanVien nv = nvDao.layNhanVienTheoMa(txtMaNhanVien.getText());
        BangCong bc = new BangCong();
        bc.setNhanVien(nv);
        bc.setSoNgayLam(Integer.parseInt(txtSoNgayLam.getText()));
        bc.setNghiCoPhep(Integer.parseInt(txtNghiCoPhep.getText()));
        bc.setNghiKhongPhep(Integer.parseInt(txtNghiKhongPhep.getText()));
        bc.setThang(txtThang.getText());
        double tongTien = ( Integer.parseInt(txtSoNgayLam.getText()) + Integer.parseInt(txtSoNgayLam.getText()) ) * nv.getLuongCoBan();
        bc.setTongTien(tongTien);
        return bc;
    }  
    
    private BangCong getEntityBangCongUpdate(){
        int pos = tblChiTiet.getSelectedRow();
        NhanVien nv = nvDao.layNhanVienTheoMa(txtMaNhanVien.getText());
        BangCong bc = new BangCong();
        bc.setMaBangCong(Integer.parseInt(tblChiTiet.getValueAt(pos, 0).toString()));
        bc.setNhanVien(nv);
        bc.setSoNgayLam(Integer.parseInt(txtSoNgayLam.getText()));
        bc.setNghiCoPhep(Integer.parseInt(txtNghiCoPhep.getText()));
        bc.setNghiKhongPhep(Integer.parseInt(txtNghiKhongPhep.getText()));
        bc.setThang(txtThang.getText());
        double tongTien = ( Integer.parseInt(txtSoNgayLam.getText()) + Integer.parseInt(txtNghiCoPhep.getText()) ) * nv.getLuongCoBan();
        bc.setTongTien(tongTien);
        return bc;
    }
    
    private void fillDataBangCong(){
        DefaultTableModel modelBC = new DefaultTableModel();
        modelBC = (DefaultTableModel) tblChiTiet.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<8;i++){
            tblChiTiet.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelBC.setRowCount(0);     
        for(BangCong bc: bcDao.layDSBangCong()){  
            Object[] rowData = new Object[8];
            rowData[0] = bc.getMaBangCong();
            rowData[1] = bc.getNhanVien().getMaNhanVien();
            rowData[2] = bc.getNhanVien().getTenNhanVien();
            rowData[3] = bc.getSoNgayLam();
            rowData[4] = bc.getNghiCoPhep();
            rowData[5] = bc.getNghiKhongPhep();
            rowData[6] = bc.getThang();
            rowData[7] = bc.getTongTien();
            modelBC.addRow(rowData);
        }
    }  
    
    private void fillDataBangCongTheoThang(String thang){
        DefaultTableModel modelBC = new DefaultTableModel();
        modelBC = (DefaultTableModel) tblChiTiet.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<8;i++){
            tblChiTiet.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelBC.setRowCount(0);     
        for(BangCong bc: bcDao.layDSBangCongTheoThang(thang)){  
            Object[] rowData = new Object[8];
            rowData[0] = bc.getMaBangCong();
            rowData[1] = bc.getNhanVien().getMaNhanVien();
            rowData[2] = bc.getNhanVien().getTenNhanVien();
            rowData[3] = bc.getSoNgayLam();
            rowData[4] = bc.getNghiCoPhep();
            rowData[5] = bc.getNghiKhongPhep();
            rowData[6] = bc.getThang();
            rowData[7] = bc.getTongTien();
            modelBC.addRow(rowData);
        }
    }

    public void getComboBoxNhanVien(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboNhanVien.getModel();
        List<NhanVien> nvList = nvDao.layDSNhanVien();
        Collections.sort(nvList, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTenNhanVien().compareToIgnoreCase(o2.getTenNhanVien());
            }
        });
        for (NhanVien nv : nvList) {
            cboModel.addElement(nv.getTenNhanVien());
        }
    }
    
    public void reset(){
        txtMaNhanVien.setText("");
        txtSoNgayLam.setText("");
        txtNghiCoPhep.setText("");
        txtNghiKhongPhep.setText("");
        txtThang.setText("");
        cboNhanVien.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnThemBangCong;
    private Swing.ButtonGradient btnUpdateBangCong;
    private Swing.ButtonGradient btnXoaBangCong;
    private Swing.ButtonGradient btnXuatFile;
    private Swing.ComboboxSuggestion cboNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTongTien;
    private Swing.RoundPanel roundPanel1;
    private javax.swing.JTable tblChiTiet;
    private Swing.TextField txtMaNhanVien;
    private Swing.TextField txtNghiCoPhep;
    private Swing.TextField txtNghiKhongPhep;
    private Swing.TextField txtSoNgayLam;
    private Swing.TextField txtThang;
    private Swing.TextField txtTimNhanVien;
    private Swing.TextField txtTimTheoThang;
    // End of variables declaration//GEN-END:variables
}
