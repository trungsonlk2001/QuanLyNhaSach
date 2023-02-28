package Form;

import Dao.ChiTietPhieuNhapDAO;
import Dao.PhieuNhapDAO;
import Dao.SachDAO;
import Entity.ChiTietPhieuNhap;
import Entity.PhieuNhap;
import Entity.Sach;
import com.raven.datechooser.DateBetween;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.listener.DateChooserAction;
import com.raven.datechooser.listener.DateChooserAdapter;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.sort.RowFilters;

public class FormQuanLyPhieuNhap extends javax.swing.JPanel {
    
    SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
    PhieuNhapDAO pnDao = new PhieuNhapDAO();
    ChiTietPhieuNhapDAO ctpnDao = new ChiTietPhieuNhapDAO();
    SachDAO sDao = new SachDAO();
    private DateChooser chDate = new DateChooser();

    public FormQuanLyPhieuNhap() {
        initComponents();
        fillDataPhieuNhap();
        chDate.setTextField(txtDate);
        chDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        chDate.addActionDateChooserListener(new DateChooserAdapter() {
            @Override
            public void dateBetweenChanged(DateBetween date, DateChooserAction action) {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String dateFrom = df.format(date.getFromDate());
                String dateTo = df.format(date.getToDate());
                fillDataPhieuNhapTheoNgay(dateFrom, dateTo);
            }
            
        
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDate = new Swing.TextField();
        roundPanel2 = new Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaPN = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblNgayLap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTPN = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuNhap = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNhanVien = new Swing.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNXB = new Swing.TextField();
        btnXoaHD = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        txtDate.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtDate.setOpaque(true);
        txtDate.setPreferredSize(new java.awt.Dimension(7, 50));

        roundPanel2.setBackground(new java.awt.Color(237, 237, 237));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Mã phiếu nhập:");

        lblMaPN.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblMaPN.setText("xxx");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Nhân viên:");

        lblTenNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblTenNV.setText("xxx");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Nhà xuất bản:");

        lblTenKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblTenKH.setText("xxx");

        lblNgayLap.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblNgayLap.setText("xxx");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("Ngày:");

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel10.setText("Tổng tiền:");

        lblTongTien.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblTongTien.setText("xxx");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMaPN))
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTenNV))
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTenKH))
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblNgayLap))
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTongTien))
                .addGap(30, 30, 30))
        );

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Chi tiết phiếu nhập");

        tblCTPN.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tblCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblCTPN.setRequestFocusEnabled(false);
        tblCTPN.setRowHeight(30);
        tblCTPN.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(tblCTPN);

        tblPhieuNhap.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tblPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhập", "Nhân viên", "Nhà cung cấp", "Ngày", "Tổng tiền"
            }
        ));
        tblPhieuNhap.setRequestFocusEnabled(false);
        tblPhieuNhap.setRowHeight(30);
        tblPhieuNhap.setSelectionBackground(new java.awt.Color(237, 237, 237));
        tblPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPhieuNhapMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieuNhap);

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("Ngày lập:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("Nhân viên:");

        txtNhanVien.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        txtNhanVien.setPreferredSize(new java.awt.Dimension(59, 50));
        txtNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNhanVienKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Tìm kiếm phiếu nhập");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setText("Nhà xuất bản");

        txtNXB.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        txtNXB.setPreferredSize(new java.awt.Dimension(59, 50));
        txtNXB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNXBKeyReleased(evt);
            }
        });

        btnXoaHD.setText("Xóa");
        btnXoaHD.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXoaHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaHDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNXB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addContainerGap(204, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void fillDataPhieuNhap(){
        DefaultTableModel model = (DefaultTableModel) tblPhieuNhap.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblPhieuNhap.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);
        for(PhieuNhap pn : pnDao.layDSPhieuNhap()){
            Object[] rowData = new Object[5];
            rowData[0] = pn.getMaPhieuNhap();
            rowData[1] = pn.getNhanVien().getTenNhanVien();
            rowData[2] = pn.getNXB().getTenNXB();          
            rowData[3] = dfm.format(pn.getNgayLap());
            rowData[4] = Double.toString(pn.getTongTien());
            model.addRow(rowData);         
        }
    }
    
    public void fillDataPhieuNhapTheoNgay(String dateFrom, String dateTo){
        DefaultTableModel model = (DefaultTableModel) tblPhieuNhap.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblPhieuNhap.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);
        for(PhieuNhap pn : pnDao.timPhieuNhap(dateFrom, dateTo)){
            Object[] rowData = new Object[5];
            rowData[0] = pn.getMaPhieuNhap();
            rowData[1] = pn.getNhanVien().getTenNhanVien();
            rowData[2] = pn.getNXB().getTenNXB();          
            rowData[3] = dfm.format(pn.getNgayLap());
            rowData[4] = Double.toString(pn.getTongTien());
            model.addRow(rowData);         
        }
    }
    
    public void fillDataCTPN(String name){
        DefaultTableModel model = (DefaultTableModel) tblCTPN.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<4;i++){
            tblCTPN.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        model.setRowCount(0);
            for(ChiTietPhieuNhap ctpn : ctpnDao.layDSChiTietPhieuNhap(name)){
                Object[] rowData = new Object[4];
                rowData[0] = ctpn.getSach().getTenSach();
                rowData[1] = ctpn.getSoLuong();
                rowData[2] = ctpn.getDonGia();
                Double donGia = ctpn.getDonGia();
                int soLuong = ctpn.getSoLuong();
                rowData[3] = donGia * soLuong;
                model.addRow(rowData);         
            }
    }
    
    public void resetDataCTPN(){
        lblMaPN.setText("xxx");
        lblTenNV.setText("xxx");
        lblTenKH.setText("xxx");
        lblNgayLap.setText("xxx");
        lblTongTien.setText("xxx");
    }
    
    private void tblPhieuNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuNhapMousePressed
        int pos = tblPhieuNhap.rowAtPoint(evt.getPoint());
        lblMaPN.setText(tblPhieuNhap.getValueAt(pos, 0).toString());
        lblTenNV.setText(tblPhieuNhap.getValueAt(pos, 1).toString());
        lblTenKH.setText(tblPhieuNhap.getValueAt(pos, 2).toString());
        lblNgayLap.setText(tblPhieuNhap.getValueAt(pos, 3).toString());
        lblTongTien.setText(tblPhieuNhap.getValueAt(pos, 4).toString());
        fillDataCTPN(tblPhieuNhap.getValueAt(pos, 0).toString());
    }//GEN-LAST:event_tblPhieuNhapMousePressed

    private void txtNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhanVienKeyReleased
        String name = txtNhanVien.getText();
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblPhieuNhap.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblPhieuNhap.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtNhanVienKeyReleased

    private void txtNXBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNXBKeyReleased
        String name = txtNXB.getText();
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblPhieuNhap.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblPhieuNhap.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,2));
    }//GEN-LAST:event_txtNXBKeyReleased

    private void btnXoaHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaHDMousePressed
        int pos = tblPhieuNhap.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu nhập cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        int kiemTra = 0;
        PhieuNhap pn = pnDao.layPhieuNhapTheoMa(tblPhieuNhap.getValueAt(pos, 0).toString());
        List<ChiTietPhieuNhap> ctpnList = ctpnDao.layDSChiTietPhieuNhap(tblPhieuNhap.getValueAt(pos, 0).toString());  
        try {
            // KIỂM TRA SỐ LƯỢNG SÁCH
            for (ChiTietPhieuNhap chiTietPhieuNhap : ctpnList) {
                Sach s = sDao.laySachTheoMa(chiTietPhieuNhap.getSach().getMaSach());
                if(s.getSoLuong() < chiTietPhieuNhap.getSoLuong()){
                    JOptionPane.showMessageDialog(this, "Số lượng sách không đủ để xóa","Thông báo", JOptionPane.ERROR_MESSAGE);
                    kiemTra = -1;               
                }
            }
            
            // CẬP NHẬT
            if(kiemTra == 0){
                for(ChiTietPhieuNhap chiTietPhieuNhap: ctpnList) {
                    Sach s = sDao.laySachTheoMa(chiTietPhieuNhap.getSach().getMaSach());                 
                    sDao.updateSoLuongSach(s.getMaSach(),s.getSoLuong() - chiTietPhieuNhap.getSoLuong());
                    ctpnDao.deleteChiTietPhieuNhap(tblPhieuNhap.getValueAt(pos, 0).toString());
                } 
                if(pnDao.deletePhieuNhap(pn)>0){
                    JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);                
                    fillDataPhieuNhap();
                    resetDataCTPN();
                } else {
                        JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            System.out.println("Lỗi xóa phiếu nhập: "+e.toString());
        }
    }//GEN-LAST:event_btnXoaHDMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnXoaHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMaPN;
    private javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTongTien;
    private Swing.RoundPanel roundPanel2;
    private javax.swing.JTable tblCTPN;
    private javax.swing.JTable tblPhieuNhap;
    private Swing.TextField txtDate;
    private Swing.TextField txtNXB;
    private Swing.TextField txtNhanVien;
    // End of variables declaration//GEN-END:variables
}
