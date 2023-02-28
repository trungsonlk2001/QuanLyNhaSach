package Form;

import Connect.SharedData;
import Dao.ChiTietPhieuNhapDAO;
import Dao.NhaXuatBanDAO;
import Dao.NhanVienDAO;
import Dao.PhieuNhapDAO;
import Dao.SachDAO;
import Dao.TheLoaiDAO;
import Entity.ChiTietPhieuNhap;
import Entity.NhaXuatBan;
import Entity.PhieuNhap;
import Entity.Sach;
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

public class FormPhieuNhap extends javax.swing.JPanel {

    SachDAO sachDao = new SachDAO();
    NhaXuatBanDAO nxbDao = new NhaXuatBanDAO();
    NhanVienDAO nvDao = new NhanVienDAO();
    TheLoaiDAO tlDao = new TheLoaiDAO();
    PhieuNhapDAO pnDao = new PhieuNhapDAO();
    ChiTietPhieuNhapDAO ctpnDao = new ChiTietPhieuNhapDAO();
    private SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
    
    public FormPhieuNhap() {
        initComponents();
        fillDataSach();
        getComboBoxNXB();
        getComboBoxTheLoai();
        getComboBoxNXBAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTPN = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        cboTheLoai = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboNXB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNgayLap = new Swing.TextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenSach = new Swing.TextField();
        jLabel7 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        cboAutoNXB = new Swing.ComboboxSuggestion();
        jLabel5 = new javax.swing.JLabel();
        btnThanhToan = new Swing.ButtonGradient();
        btnInPhieuNhap = new Swing.ButtonGradient();
        btnThem = new Swing.ButtonGradient();
        btnXoa = new Swing.ButtonGradient();
        btnTangSL = new Swing.ButtonGradient();
        btnGiamSL = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        tblCTPN.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblCTPN.setRequestFocusEnabled(false);
        tblCTPN.setRowHeight(30);
        tblCTPN.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane1.setViewportView(tblCTPN);

        tblSach.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Nhà xuất bản", "Số lượng"
            }
        ));
        tblSach.setRequestFocusEnabled(false);
        tblSach.setRowHeight(30);
        tblSach.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(tblSach);
        if (tblSach.getColumnModel().getColumnCount() > 0) {
            tblSach.getColumnModel().getColumn(4).setResizable(false);
        }

        cboTheLoai.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cboTheLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTheLoaiItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Thể loại:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("NXB:");

        cboNXB.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cboNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboNXBMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Tên sách:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel6.setText("Nhà xuất bản:");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel8.setText("Ngày lập:");

        txtNgayLap.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 135, 135));
        jLabel4.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Phiếu nhập");

        txtTenSach.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenSachKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Tổng tiền:");

        lblTongTien.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(102, 102, 255));
        lblTongTien.setText("0.0Đ");

        cboAutoNXB.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cboAutoNXB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboAutoNXBKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        btnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThanhToanMousePressed(evt);
            }
        });

        btnInPhieuNhap.setText("In phiếu nhập");
        btnInPhieuNhap.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        btnInPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInPhieuNhapMousePressed(evt);
            }
        });
        btnInPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInPhieuNhapActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemMousePressed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaMousePressed(evt);
            }
        });

        btnTangSL.setText("Tăng");
        btnTangSL.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        btnTangSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTangSLMousePressed(evt);
            }
        });

        btnGiamSL.setText("Giảm");
        btnGiamSL.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        btnGiamSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGiamSLMousePressed(evt);
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
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongTien))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboAutoNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTangSL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGiamSL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboAutoNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addComponent(btnInPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(cboNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnTangSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnGiamSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTongTien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboTheLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTheLoaiItemStateChanged
        String name = cboTheLoai.getSelectedItem().toString();
        searchSachTheoTheLoai(name);
    }//GEN-LAST:event_cboTheLoaiItemStateChanged

    private void cboNXBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboNXBMousePressed
        String name = cboNXB.getSelectedItem().toString();
        searchSachTheoNXB(name);
    }//GEN-LAST:event_cboNXBMousePressed

    private void txtTenSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenSachKeyReleased
        String name = txtTenSach.getText();
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblSach.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtTenSachKeyReleased

    private void cboAutoNXBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboAutoNXBKeyReleased
        
    }//GEN-LAST:event_cboAutoNXBKeyReleased

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        fillDataSach();
    }//GEN-LAST:event_jLabel5MousePressed

    private void btnThanhToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhToanMousePressed
        if(cboAutoNXB.getSelectedItem().toString().equalsIgnoreCase("") ||            
           txtNgayLap.getText().equalsIgnoreCase("") || 
           lblTongTien.getText().equalsIgnoreCase("0.0")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (!myFunction.checkNgayThang(txtNgayLap.getText())){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng ngày tháng", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
               PhieuNhap pn = getEntityPhieuNhap();               
               if(pnDao.addPhieuNhap(pn)>0){  
                    ArrayList<ChiTietPhieuNhap> list = getEntityCTPN();
                    ArrayList<Sach> listSach  = new ArrayList<>();
                    for (ChiTietPhieuNhap chiTietPhieuNhap : list) {
                        ctpnDao.addChiTietPhieuNhap(chiTietPhieuNhap);
                    }
                    for (int i=0;i<tblCTPN.getRowCount();i++){
                        Sach s = sachDao.laySachTheoMa(tblCTPN.getValueAt(i, 0).toString());
                        listSach.add(s);
                    } 
                    for (int i=0;i<tblCTPN.getRowCount();i++) {
                        String maSach = listSach.get(i).getMaSach();
                        int soLuong = listSach.get(i).getSoLuong() + Integer.parseInt(tblCTPN.getValueAt(i, 2).toString());
                        if(soLuong <= 0) {
                            JOptionPane.showMessageDialog(this, "Số lượng không đúng", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            sachDao.updateSoLuongSach(maSach, soLuong);
                        }                     
                   }
                    JOptionPane.showMessageDialog(this, "Thanh toán thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    fillDataSach();
                    DefaultTableModel modelCTHD = (DefaultTableModel) tblCTPN.getModel();
                    modelCTHD.setRowCount(0);
               }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnThanhToanMousePressed

    private void btnInPhieuNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInPhieuNhapMousePressed
        PhieuNhap pn = getPhieuNhapGanNhat();
        int maPhieuNhap = pn.getMaPhieuNhap();
        System.out.println(maPhieuNhap);
        try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("src/Report/rptPhieuNhap1.jrxml");
            map.put("sMaPN", maPhieuNhap);
            java.sql.Connection con = Connect.DatabaseHelper.getConnection();
            JasperPrint p = JasperFillManager.fillReport(rpt, map, con);
            JasperViewer.viewReport(p, false);
        } catch (Exception e) {
            System.out.println("Lỗi in phiếu nhập: " + e.toString());
        }
    }//GEN-LAST:event_btnInPhieuNhapMousePressed

    private void btnThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMousePressed
        int pos = tblSach.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để thêm", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            String inputSL = JOptionPane.showInputDialog("Nhập số lượng sách: ");
            String inputDonGia = JOptionPane.showInputDialog("Nhập đơn giá bán: ");
            if(Integer.parseInt(inputSL) < 0 ||
                Double.parseDouble(inputDonGia) < 1000){
                JOptionPane.showMessageDialog(this, "Nhập sai vui lòng nhập lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            else {
                DefaultTableModel modelCTHD = (DefaultTableModel) tblCTPN.getModel();
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setHorizontalAlignment(JLabel.CENTER);
                for(int i=0;i<5;i++){
                    tblCTPN.getColumnModel().getColumn(i).setCellRenderer(renderer);
                }
                modelCTHD.setRowCount(0);  
                String maSach = tblSach.getValueAt(pos, 0).toString();
                String tenSach = tblSach.getValueAt(pos, 1).toString();
                int soLuong = Integer.parseInt(inputSL);
                double donGia = Double.parseDouble(inputDonGia);
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
                        tong = tong + Double.parseDouble(tblCTPN.getValueAt(i, 4).toString());
                    }
                lblTongTien.setText(String.valueOf(tong));
                fillDataSach();
                }
        }
    }//GEN-LAST:event_btnThemMousePressed

    private void btnXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMousePressed
        double tong = 0;
        int pos = tblCTPN.getSelectedRow();
        if(pos >= 0){
            int modelIndex = tblCTPN.convertRowIndexToModel(pos);
            DefaultTableModel modelCTHD = (DefaultTableModel) tblCTPN.getModel();
            modelCTHD.removeRow(modelIndex);
            fillDataSach();
        } 
        else{
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        for(int i=0;i<tblCTPN.getRowCount();i++){
            tong = tong + Double.parseDouble(tblCTPN.getValueAt(i, 4).toString());
        }
        lblTongTien.setText(String.valueOf(tong));
    }//GEN-LAST:event_btnXoaMousePressed

    private void btnTangSLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangSLMousePressed
        int pos = tblCTPN.getSelectedRow();
        int slBD = Integer.parseInt(tblCTPN.getValueAt(pos, 2).toString());
        slBD++;
        tblCTPN.setValueAt(slBD, pos, 2);          
        double donGia = Double.parseDouble(tblCTPN.getValueAt(pos, 3).toString());
        int slHT = Integer.parseInt(tblCTPN.getValueAt(pos, 2).toString());
        double thanhTien = donGia * slHT;
        tblCTPN.setValueAt(thanhTien, pos, 4);
        double tong = 0;
        for(int i=0;i<tblCTPN.getRowCount();i++){
            tong = tong + Double.parseDouble(tblCTPN.getValueAt(i, 4).toString());
        }
        lblTongTien.setText(String.valueOf(tong));
    }//GEN-LAST:event_btnTangSLMousePressed

    private void btnGiamSLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiamSLMousePressed
        int pos = tblCTPN.getSelectedRow();
        int slBD = Integer.parseInt(tblCTPN.getValueAt(pos, 2).toString());
        slBD--;
        if(slBD < 1){
            JOptionPane.showMessageDialog(this, "Không thể giảm hơn nữa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            tblCTPN.setValueAt(slBD, pos, 2);   
            double donGia = Double.parseDouble(tblCTPN.getValueAt(pos, 3).toString());
            int slHT = Integer.parseInt(tblCTPN.getValueAt(pos, 2).toString());
            double thanhTien = donGia * slHT;
            tblCTPN.setValueAt(thanhTien, pos, 4);
            double tong = 0;
            for(int i=0;i<tblCTPN.getRowCount();i++){
                tong = tong + Double.parseDouble(tblCTPN.getValueAt(i, 4).toString());
            }
            lblTongTien.setText(String.valueOf(tong));            
        }
    }//GEN-LAST:event_btnGiamSLMousePressed

    private void btnInPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInPhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInPhieuNhapActionPerformed

    public void search(){
        
    }
    
    public PhieuNhap getPhieuNhapGanNhat(){
        List<PhieuNhap> listPN = pnDao.layDSPhieuNhap();
        PhieuNhap pnTam = listPN.get(listPN.size()-1);
        return pnTam;
    }
    
    // GET COMBOBOX
    public void getComboBoxTheLoai(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboTheLoai.getModel();
        for(TheLoai tl : tlDao.layDSTheLoai()){
            cboModel.addElement(tl.getTenTheLoai());
        }
    }
    
    public void getComboBoxNXB(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboNXB.getModel();
        for(NhaXuatBan nxb : nxbDao.layDSNhaXuatBan()){
            cboModel.addElement(nxb.getTenNXB());
        }
    }
    
    public void getComboBoxNXBAuto(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboAutoNXB.getModel();
        for(NhaXuatBan nxb : nxbDao.layDSNhaXuatBan()){
            cboModel.addElement(nxb.getTenNXB());
        }
    }
    
     // SEARCH
    public void searchSachTheoTen(String name){
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblSach.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name));
    }
    
    public void searchSachTheoTheLoai(String name){
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblSach.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,2));
    }
    
    public void searchSachTheoNXB(String name){
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblSach.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblSach.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,4));
    }
    
    // TABLE SÁCH
    public void fillDataSach(){
        DefaultTableModel modelSach = (DefaultTableModel) tblSach.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<6;i++){
            tblSach.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelSach.setRowCount(0);    
        for(Sach s : sachDao.layDSSach()){  
            Object[] rowData = new Object[6];
            rowData[0] = s.getMaSach();
            rowData[1] = s.getTenSach();
            rowData[3] = s.getTacGia().getTenTacGia();
            rowData[2] = s.getTheLoai().getTenTheLoai();
            rowData[4] = s.getNXB().getTenNXB();
            rowData[5] = s.getSoLuong();
            modelSach.addRow(rowData);
        }
    }
    
    public ArrayList<ChiTietPhieuNhap> getEntityCTPN(){
        ArrayList<ChiTietPhieuNhap> listCTPN = new ArrayList<>();
        for (int i=0;i<tblCTPN.getRowCount();i++) {
            ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap();
            Sach s = sachDao.laySachTheoMa(tblCTPN.getValueAt(i, 0).toString());
            ctpn.setPhieuNhap(getPhieuNhapGanNhat());
            ctpn.setSach(s);
            ctpn.setSoLuong(Integer.parseInt(tblCTPN.getValueAt(i,2).toString()));
            ctpn.setDonGia(Double.parseDouble(tblCTPN.getValueAt(i,3).toString()));
            listCTPN.add(ctpn);
        }      
        return listCTPN;
    }
    
    public PhieuNhap getEntityPhieuNhap() throws ParseException{
        PhieuNhap pn = new PhieuNhap();
        pn.setNXB(nxbDao.layNhaXuatBanTheoTen(cboAutoNXB.getSelectedItem().toString()));
        pn.setNhanVien(nvDao.layNhanVienTheoMa(String.valueOf(SharedData.nhanVien.getMaNhanVien())));
        pn.setNgayLap(dfm.parse(txtNgayLap.getText()));
        pn.setTongTien(Double.parseDouble(lblTongTien.getText()));
        return pn;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnGiamSL;
    private Swing.ButtonGradient btnInPhieuNhap;
    private Swing.ButtonGradient btnTangSL;
    private Swing.ButtonGradient btnThanhToan;
    private Swing.ButtonGradient btnThem;
    private Swing.ButtonGradient btnXoa;
    private Swing.ComboboxSuggestion cboAutoNXB;
    private javax.swing.JComboBox<String> cboNXB;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTongTien;
    public javax.swing.JTable tblCTPN;
    public javax.swing.JTable tblSach;
    private Swing.TextField txtNgayLap;
    private Swing.TextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
