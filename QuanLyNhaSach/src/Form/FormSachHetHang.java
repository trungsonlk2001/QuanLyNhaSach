package Form;

import Dao.NhaXuatBanDAO;
import Dao.SachDAO;
import Dao.TacGiaDAO;
import Dao.TheLoaiDAO;
import Entity.Sach;
import java.awt.Image;
import Model.TableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableRowSorter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.jdesktop.swingx.sort.RowFilters;

public class FormSachHetHang extends javax.swing.JPanel {

    static SachDAO sDao = new SachDAO();
    
    public FormSachHetHang() {
        initComponents();
        fillDataSachHetHang();
        fillDataSachCanHetHang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        pnlSach3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSach3 = new javax.swing.JTable();
        txtTimKiemTheoMaSach = new Swing.TextField();
        txtTimKiemTheoTenSach = new Swing.TextField();
        btnXuatFile = new Swing.ButtonGradient();
        pnlSach4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSach4 = new javax.swing.JTable();
        txtTimKiemTheoMaSach1 = new Swing.TextField();
        txtTimKiemTheoTenSach1 = new Swing.TextField();
        btnXuatFile1 = new Swing.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane4.setFocusable(false);
        jTabbedPane4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        pnlSach3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Sách hết hàng");

        tblSach3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblSach3.setForeground(new java.awt.Color(255, 0, 51));
        tblSach3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Thể loại", "Nhà xuất bản", "Đơn giá", "Số lượng", "Hình ảnh"
            }
        ));
        tblSach3.setRequestFocusEnabled(false);
        tblSach3.setRowHeight(35);
        tblSach3.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane8.setViewportView(tblSach3);

        txtTimKiemTheoMaSach.setText("Mã sách");
        txtTimKiemTheoMaSach.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiemTheoMaSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemTheoMaSachMousePressed(evt);
            }
        });
        txtTimKiemTheoMaSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaSachKeyReleased(evt);
            }
        });

        txtTimKiemTheoTenSach.setText("Tên sách");
        txtTimKiemTheoTenSach.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiemTheoTenSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemTheoTenSachMousePressed(evt);
            }
        });
        txtTimKiemTheoTenSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoTenSachKeyReleased(evt);
            }
        });

        btnXuatFile.setText("Xuất file");
        btnXuatFile.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatFileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlSach3Layout = new javax.swing.GroupLayout(pnlSach3);
        pnlSach3.setLayout(pnlSach3Layout);
        pnlSach3Layout.setHorizontalGroup(
            pnlSach3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSach3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemTheoMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiemTheoTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(pnlSach3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
        );
        pnlSach3Layout.setVerticalGroup(
            pnlSach3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSach3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(pnlSach3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSach3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiemTheoTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiemTheoMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Sách hết hàng", pnlSach3);

        pnlSach4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_35px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Sách cận hết hàng");

        tblSach4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tblSach4.setForeground(new java.awt.Color(255, 0, 51));
        tblSach4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Thể loại", "Nhà xuất bản", "Đơn giá", "Số lượng", "Hình ảnh"
            }
        ));
        tblSach4.setRequestFocusEnabled(false);
        tblSach4.setRowHeight(35);
        tblSach4.setSelectionBackground(new java.awt.Color(237, 237, 237));
        jScrollPane9.setViewportView(tblSach4);

        txtTimKiemTheoMaSach1.setText("Mã sách");
        txtTimKiemTheoMaSach1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiemTheoMaSach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemTheoMaSach1MousePressed(evt);
            }
        });
        txtTimKiemTheoMaSach1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoMaSach1KeyReleased(evt);
            }
        });

        txtTimKiemTheoTenSach1.setText("Tên sách");
        txtTimKiemTheoTenSach1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTimKiemTheoTenSach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimKiemTheoTenSach1MousePressed(evt);
            }
        });
        txtTimKiemTheoTenSach1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoTenSach1KeyReleased(evt);
            }
        });

        btnXuatFile1.setText("Xuất file");
        btnXuatFile1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnXuatFile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatFile1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlSach4Layout = new javax.swing.GroupLayout(pnlSach4);
        pnlSach4.setLayout(pnlSach4Layout);
        pnlSach4Layout.setHorizontalGroup(
            pnlSach4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSach4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemTheoMaSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiemTheoTenSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 781, Short.MAX_VALUE)
                .addComponent(btnXuatFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(pnlSach4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane9)
        );
        pnlSach4Layout.setVerticalGroup(
            pnlSach4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSach4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(42, 42, 42)
                .addGroup(pnlSach4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSach4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlSach4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiemTheoTenSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiemTheoMaSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXuatFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Sách cận hết hàng", pnlSach4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane4)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane4)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        txtTimKiemTheoMaSach.setText("Mã sách");
        txtTimKiemTheoTenSach.setEnabled(true);
        txtTimKiemTheoTenSach.setText("Tên sách");
        txtTimKiemTheoMaSach.setEnabled(true);
        fillDataSachHetHang();
    }//GEN-LAST:event_jLabel7MousePressed

    private void txtTimKiemTheoMaSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaSachMousePressed
        txtTimKiemTheoMaSach.setEnabled(true);
        txtTimKiemTheoMaSach.setText("");
        txtTimKiemTheoTenSach.setText("Tên sách");
        txtTimKiemTheoTenSach.setEnabled(false);
    }//GEN-LAST:event_txtTimKiemTheoMaSachMousePressed

    private void txtTimKiemTheoMaSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaSachKeyReleased
        String name = txtTimKiemTheoMaSach.getText();
        TableModel modelSach = new Model.TableModel();
        modelSach = (TableModel) tblSach3.getModel();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
        tblSach3.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,0));
    }//GEN-LAST:event_txtTimKiemTheoMaSachKeyReleased

    private void txtTimKiemTheoTenSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenSachMousePressed
        txtTimKiemTheoTenSach.setEnabled(true);
        txtTimKiemTheoTenSach.setText("");
        txtTimKiemTheoMaSach.setText("Mã sách");
        txtTimKiemTheoMaSach.setEnabled(false);
    }//GEN-LAST:event_txtTimKiemTheoTenSachMousePressed

    private void txtTimKiemTheoTenSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenSachKeyReleased
        String name = txtTimKiemTheoTenSach.getText();
        TableModel modelSach = new TableModel();
        modelSach = (TableModel) tblSach3.getModel();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
        tblSach3.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtTimKiemTheoTenSachKeyReleased

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        txtTimKiemTheoMaSach.setText("Mã sách");
        txtTimKiemTheoTenSach.setEnabled(true);
        txtTimKiemTheoTenSach.setText("Tên sách");
        txtTimKiemTheoMaSach.setEnabled(true);
        fillDataSachCanHetHang();
    }//GEN-LAST:event_jLabel9MousePressed

    private void txtTimKiemTheoMaSach1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaSach1MousePressed
        txtTimKiemTheoMaSach1.setEnabled(true);
        txtTimKiemTheoMaSach1.setText("");
        txtTimKiemTheoTenSach1.setText("Tên sách");
        txtTimKiemTheoTenSach1.setEnabled(false);
    }//GEN-LAST:event_txtTimKiemTheoMaSach1MousePressed

    private void txtTimKiemTheoMaSach1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoMaSach1KeyReleased
        String name = txtTimKiemTheoMaSach1.getText();
        TableModel modelSach = new Model.TableModel();
        modelSach = (TableModel) tblSach4.getModel();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
        tblSach4.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,0));
    }//GEN-LAST:event_txtTimKiemTheoMaSach1KeyReleased

    private void txtTimKiemTheoTenSach1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenSach1MousePressed
        txtTimKiemTheoTenSach1.setEnabled(true);
        txtTimKiemTheoTenSach1.setText("");
        txtTimKiemTheoMaSach1.setText("Mã sách");
        txtTimKiemTheoMaSach1.setEnabled(false);
    }//GEN-LAST:event_txtTimKiemTheoTenSach1MousePressed

    private void txtTimKiemTheoTenSach1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoTenSach1KeyReleased
        String name = txtTimKiemTheoTenSach1.getText();
        TableModel modelSach = new TableModel();
        modelSach = (TableModel) tblSach4.getModel();
        TableRowSorter<TableModel> trs = new TableRowSorter<>(modelSach);
        tblSach4.setRowSorter(trs);
        trs.setRowFilter(RowFilters.regexFilter(name,1));
    }//GEN-LAST:event_txtTimKiemTheoTenSach1KeyReleased

    private void btnXuatFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatFileMousePressed
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

            List<Sach> listSachHH = sDao.layDSSachHetHang();

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
                File f = new File("D:/New Folder/Sach Het Hang " + date + ".xlsx");
                FileOutputStream fis = new FileOutputStream(f);
                workbook.write(fis);
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("Lỗi xuất file: " + e.toString());
        }
    }//GEN-LAST:event_btnXuatFileMousePressed

    private void btnXuatFile1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatFile1MousePressed
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

            List<Sach> listSachHH = sDao.layDSSachCanHetHang();

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
                File f = new File("D:/New Folder/Sach Gan Het Hang " + date + ".xlsx");
                FileOutputStream fis = new FileOutputStream(f);
                workbook.write(fis);
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("Lỗi xuất file: " + e.toString());
        }
    }//GEN-LAST:event_btnXuatFile1MousePressed

    public static void fillDataSachHetHang(){
        List<Sach> dsS = sDao.layDSSachHetHang();
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
        
        Model.TableModel model = new Model.TableModel(rows,columnName);
        tblSach3.setModel(model);
        tblSach3.setRowHeight(140);
        tblSach3.getColumnModel().getColumn(7).setPreferredWidth(140);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblSach3.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    
    public static void fillDataSachCanHetHang(){
        List<Sach> dsS = sDao.layDSSachCanHetHang();
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
        
        Model.TableModel model = new Model.TableModel(rows,columnName);
        tblSach4.setModel(model);
        tblSach4.setRowHeight(140);
        tblSach4.getColumnModel().getColumn(7).setPreferredWidth(140);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<7;i++){
            tblSach4.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnXuatFile;
    private Swing.ButtonGradient btnXuatFile1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JPanel pnlSach3;
    private javax.swing.JPanel pnlSach4;
    public static javax.swing.JTable tblSach3;
    public static javax.swing.JTable tblSach4;
    private Swing.TextField txtTimKiemTheoMaSach;
    private Swing.TextField txtTimKiemTheoMaSach1;
    private Swing.TextField txtTimKiemTheoTenSach;
    private Swing.TextField txtTimKiemTheoTenSach1;
    // End of variables declaration//GEN-END:variables
}
