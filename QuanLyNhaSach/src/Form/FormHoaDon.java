package Form;

import Dao.ChiTietHoaDonDAO;
import Dao.HoaDonDAO;
import Dao.SachDAO;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.Sach;
import Entity.myFunction;
import static Form.FormKhachHang.khDao;
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

public class FormHoaDon extends javax.swing.JPanel {

    SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
    HoaDonDAO hdDao = new HoaDonDAO();
    ChiTietHoaDonDAO ctdhDao = new ChiTietHoaDonDAO();
    SachDAO sDao = new SachDAO();
    private DateChooser chDate = new DateChooser();
    
    public FormHoaDon() {
        initComponents();
        fillDataHoaDon();
        chDate.setTextField(txtDate);
        chDate.setDateSelectionMode(DateChooser.DateSelectionMode.BETWEEN_DATE_SELECTED);
        chDate.addActionDateChooserListener(new DateChooserAdapter() {
            @Override
            public void dateBetweenChanged(DateBetween date, DateChooserAction action) {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String dateFrom = df.format(date.getFromDate());
                String dateTo = df.format(date.getToDate());
                fillDataHoaDonTheoNgay(dateFrom, dateTo);
            }
            
        
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDate = new Swing.TextField();
        roundPanel2 = new Swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblNgayLap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblChietKhau = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNhanVien = new Swing.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSDTKH = new Swing.TextField();
        lblTimKH = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKhachHang = new Swing.TextField();
        btnXoaHD = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        txtDate.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtDate.setOpaque(true);
        txtDate.setPreferredSize(new java.awt.Dimension(7, 50));

        roundPanel2.setBackground(new java.awt.Color(237, 237, 237));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Mã hóa đơn:");

        lblMaHD.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblMaHD.setText("xxx");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Nhân viên:");

        lblTenNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblTenNV.setText("xxx");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Khách hàng:");

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

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel11.setText("Chiết khấu:");

        lblChietKhau.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblChietKhau.setText("xxx");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblChietKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(roundPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(roundPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(lblTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMaHD))
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
                    .addComponent(jLabel11)
                    .addComponent(lblChietKhau))
                .addGap(30, 30, 30)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTongTien))
                .addGap(30, 30, 30))
        );

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Chi tiết hóa đơn");

        tblCTHD.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblCTHD.setRequestFocusEnabled(false);
        tblCTHD.setRowHeight(30);
        tblCTHD.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(tblCTHD);

        tblHoaDon.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Nhân viên", "Khách hàng", "Ngày", "Chiêt khấu", "Tổng tiền"
            }
        ));
        tblHoaDon.setRequestFocusEnabled(false);
        tblHoaDon.setRowHeight(30);
        tblHoaDon.setSelectionBackground(new java.awt.Color(237, 237, 237));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblHoaDonMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Ngày lập:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Nhân viên:");

        txtNhanVien.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNhanVien.setPreferredSize(new java.awt.Dimension(59, 50));
        txtNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNhanVienKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Tìm kiếm hóa đơn");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("SDT");

        txtSDTKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSDTKH.setPreferredSize(new java.awt.Dimension(59, 50));
        txtSDTKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSDTKHKeyReleased(evt);
            }
        });

        lblTimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_search_30px.png"))); // NOI18N
        lblTimKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTimKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTimKHMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Khách hàng");

        txtKhachHang.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtKhachHang.setPreferredSize(new java.awt.Dimension(59, 50));
        txtKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKhachHangKeyReleased(evt);
            }
        });

        btnXoaHD.setText("Xóa");
        btnXoaHD.setFocusable(false);
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSDTKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTimKH)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTimKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(164, 164, 164)
                                .addComponent(btnXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void fillDataHoaDon(){
        DefaultTableModel modelHD = (DefaultTableModel) tblHoaDon.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblHoaDon.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelHD.setRowCount(0);
        for(HoaDon hd : hdDao.layDSHoaDon()){
            Object[] rowData = new Object[6];
            rowData[0] = hd.getMaHoaDon();
            if(hd.getNhanVien() == null){
                rowData[1] = "Đã nghỉ việc";
            } else {
                rowData[1] = hd.getNhanVien().getTenNhanVien();
            }
            rowData[2] = hd.getKhachHang().getTenKhachHang();          
            rowData[3] = dfm.format(hd.getNgayLap());
            rowData[4] = Float.toString(hd.getChietKhau());
            rowData[5] = Double.toString(hd.getTongTien());
            modelHD.addRow(rowData);         
        }
    }
    
    public void fillDataHoaDonTheoNgay(String dateFrom, String dateTo){
        DefaultTableModel modelHD = (DefaultTableModel) tblHoaDon.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblHoaDon.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelHD.setRowCount(0);
        for(HoaDon hd : hdDao.timHoaDon(dateFrom, dateTo)){
            Object[] rowData = new Object[6];
            rowData[0] = hd.getMaHoaDon();
            if(hd.getNhanVien() == null){
                rowData[1] = "Đã nghỉ việc";
            } else {
                rowData[1] = hd.getNhanVien().getTenNhanVien();
            }
            rowData[2] = hd.getKhachHang().getTenKhachHang();          
            rowData[3] = dfm.format(hd.getNgayLap());
            rowData[4] = Float.toString(hd.getChietKhau());
            rowData[5] = Double.toString(hd.getTongTien());
            modelHD.addRow(rowData);         
        }
    }
    
    public void fillDataHoaDonTheoSDTKH(String sdt){
        DefaultTableModel modelHD = (DefaultTableModel) tblHoaDon.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<5;i++){
            tblHoaDon.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelHD.setRowCount(0);
        for(HoaDon hd : hdDao.timHoaDonTheoSDTKhach(sdt)){
            Object[] rowData = new Object[6];
            rowData[0] = hd.getMaHoaDon();
            if(hd.getNhanVien() == null){
                rowData[1] = "Đã nghỉ việc";
            } else {
                rowData[1] = hd.getNhanVien().getTenNhanVien();
            }
            rowData[2] = hd.getKhachHang().getTenKhachHang();          
            rowData[3] = dfm.format(hd.getNgayLap());
            rowData[4] = Float.toString(hd.getChietKhau());
            rowData[5] = Double.toString(hd.getTongTien());
            modelHD.addRow(rowData);         
        }
    }
    
    public void fillDataCTHD(String name){
        DefaultTableModel modelCTHD = (DefaultTableModel) tblCTHD.getModel();
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<4;i++){
            tblCTHD.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        modelCTHD.setRowCount(0);
            for(ChiTietHoaDon cthd : ctdhDao.layDSChiTietHoaDon(name)){
                Object[] rowData = new Object[4];
                rowData[0] = cthd.getSach().getTenSach();
                rowData[1] = cthd.getSoLuong();
                rowData[2] = cthd.getSach().getDonGia();
                Double donGia = cthd.getSach().getDonGia();
                int soLuong = cthd.getSoLuong();
                rowData[3] = donGia * soLuong;
                modelCTHD.addRow(rowData);         
            }
    }
    
     public void resetDataCTHD(){
        lblMaHD.setText("xxx");
        lblTenNV.setText("xxx");
        lblTenKH.setText("xxx");
        lblNgayLap.setText("xxx");
        lblChietKhau.setText("xxx");
        lblTongTien.setText("xxx");
    }
    
    private void tblHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMousePressed
        int pos = tblHoaDon.rowAtPoint(evt.getPoint());
        lblMaHD.setText(tblHoaDon.getValueAt(pos, 0).toString());
        lblTenNV.setText(tblHoaDon.getValueAt(pos, 1).toString());
        lblTenKH.setText(tblHoaDon.getValueAt(pos, 2).toString());
        lblNgayLap.setText(tblHoaDon.getValueAt(pos, 3).toString());
        lblChietKhau.setText(tblHoaDon.getValueAt(pos, 4).toString());
        lblTongTien.setText(tblHoaDon.getValueAt(pos, 5).toString());
        fillDataCTHD(tblHoaDon.getValueAt(pos, 0).toString());
    }//GEN-LAST:event_tblHoaDonMousePressed

    private void txtNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhanVienKeyReleased
        String name = txtNhanVien.getText();
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblHoaDon.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblHoaDon.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtNhanVienKeyReleased

    private void txtSDTKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKHKeyReleased

    }//GEN-LAST:event_txtSDTKHKeyReleased

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
                fillDataHoaDonTheoSDTKH(s);
                txtDate.setText("");
            } catch (Exception e) {
                System.out.println("Khách hàng null: " + e.toString());
            }
        }
    }//GEN-LAST:event_lblTimKHMousePressed

    private void txtKhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKhachHangKeyReleased
        String name = txtKhachHang.getText();
        DefaultTableModel modelSach = new DefaultTableModel();
        modelSach = (DefaultTableModel) tblHoaDon.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelSach);
        tblHoaDon.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,2));
    }//GEN-LAST:event_txtKhachHangKeyReleased

    private void btnXoaHDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaHDMousePressed
        int pos = tblHoaDon.getSelectedRow();
        HoaDon hd = hdDao.layHoaDonTheoMa(tblHoaDon.getValueAt(pos, 0).toString());
        List<ChiTietHoaDon> cthdList = ctdhDao.layDSChiTietHoaDon(tblHoaDon.getValueAt(pos, 0).toString());  
        try {
            for (ChiTietHoaDon chiTietHoaDon : cthdList) {
                Sach s = sDao.laySachTheoMa(chiTietHoaDon.getSach().getMaSach());
                sDao.updateSoLuongSach(s.getMaSach(),s.getSoLuong() + chiTietHoaDon.getSoLuong());
                ctdhDao.deleteChiTietHoaDon(tblHoaDon.getValueAt(pos, 0).toString());
            }
            if(hdDao.deleteHoaDon(hd)>0){
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);                
                fillDataHoaDon();
                resetDataCTHD();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: "+e.toString());
        }
    }//GEN-LAST:event_btnXoaHDMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnXoaHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChietKhau;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTimKH;
    private javax.swing.JLabel lblTongTien;
    private Swing.RoundPanel roundPanel2;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTable tblHoaDon;
    private Swing.TextField txtDate;
    private Swing.TextField txtKhachHang;
    private Swing.TextField txtNhanVien;
    private Swing.TextField txtSDTKH;
    // End of variables declaration//GEN-END:variables
}
