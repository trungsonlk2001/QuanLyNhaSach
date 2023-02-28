package Form;

import Dao.NhaXuatBanDAO;
import Dao.SachDAO;
import Dao.TacGiaDAO;
import Dao.TheLoaiDAO;
import Entity.NhaXuatBan;
import Entity.Sach;
import Entity.TacGia;
import Entity.TheLoai;
import Entity.myFunction;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FormCapNhatSach extends javax.swing.JFrame {

    NhaXuatBanDAO nxbDao = new NhaXuatBanDAO();
    TacGiaDAO tgDao = new TacGiaDAO();
    TheLoaiDAO tlDao = new TheLoaiDAO();
    SachDAO sDao = new SachDAO();
    String fileName = null;
    int pos = FormSach.tblSach.getSelectedRow();
    File f;
    byte[] anhSach = null;
    
    public FormCapNhatSach() {
        initComponents();
        getComboBoxTheLoai();
        getComboBoxNXB();
        getComboBoxTacGia();
        Sach s = sDao.laySachTheoMa(FormSach.tblSach.getValueAt(pos, 0).toString());
        anhSach = s.getHinhAnh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCapNhatSach = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        cboTheLoai = new javax.swing.JComboBox<>();
        lblHinh = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        lbl_CheckTenSach = new javax.swing.JLabel();
        lbl_CheckSL = new javax.swing.JLabel();
        lbl_CheckDonGia = new javax.swing.JLabel();
        cboTacGia = new Swing.ComboboxSuggestion();
        cboNXB = new Swing.ComboboxSuggestion();
        btnChonAnh = new Swing.ButtonGradient();
        btnReset = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật sách");

        pnlCapNhatSach.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Tên sách:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Tác giả:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Nhà xuất bản:");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Số lượng:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Thể loại");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Hình ảnh:");

        txtTenSach.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenSach.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenSachCaretUpdate(evt);
            }
        });

        txtSoLuong.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSoLuong.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSoLuongCaretUpdate(evt);
            }
        });

        cboTheLoai.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Đơn giá:");

        txtDonGia.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtDonGia.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDonGiaCaretUpdate(evt);
            }
        });

        lbl_CheckTenSach.setText("*");

        lbl_CheckSL.setText("*");

        lbl_CheckDonGia.setText("*");

        cboTacGia.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        cboNXB.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        btnChonAnh.setText("Chọn");
        btnChonAnh.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnChonAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChonAnhMousePressed(evt);
            }
        });

        btnReset.setText("Rỗng");
        btnReset.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLuuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlCapNhatSachLayout = new javax.swing.GroupLayout(pnlCapNhatSach);
        pnlCapNhatSach.setLayout(pnlCapNhatSachLayout);
        pnlCapNhatSachLayout.setHorizontalGroup(
            pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatSachLayout.createSequentialGroup()
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCapNhatSachLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cboTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_CheckTenSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTenSach)))
                            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                        .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatSachLayout.createSequentialGroup()
                                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24))))
                                    .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSoLuong)
                                        .addComponent(txtDonGia)
                                        .addComponent(lbl_CheckSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_CheckDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCapNhatSachLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cboNXB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        pnlCapNhatSachLayout.setVerticalGroup(
            pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckTenSach)
                .addGap(18, 18, 18)
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckSL)
                .addGap(18, 18, 18)
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckDonGia)
                .addGap(18, 18, 18)
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCapNhatSachLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(106, 171, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatSachLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCapNhatSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCapNhatSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void getComboBoxTheLoai(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboTheLoai.getModel();
        List<TheLoai> tlList = tlDao.layDSTheLoai();
        Collections.sort(tlList, new Comparator<TheLoai>() {
            @Override
            public int compare(TheLoai o1, TheLoai o2) {
                return o1.getTenTheLoai().compareTo(o2.getTenTheLoai());
            }
        });
        
        for(TheLoai tl : tlList){
            cboModel.addElement(tl.getTenTheLoai());
        }
    }
    
    public void getComboBoxTacGia(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboTacGia.getModel();
        List<TacGia> tgList = tgDao.layDSTacGia();
        Collections.sort(tgList, new Comparator<TacGia>() {
            @Override
            public int compare(TacGia o1, TacGia o2) {
                return o1.getTenTacGia().compareTo(o2.getTenTacGia());
            }
        });
        for(TacGia tg : tgList){
            cboModel.addElement(tg.getTenTacGia());
        }
    }
    
    public void getComboBoxNXB(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboNXB.getModel();
        List<NhaXuatBan> nxbList = nxbDao.layDSNhaXuatBan();
        Collections.sort(nxbList, new Comparator<NhaXuatBan>() {
            @Override
            public int compare(NhaXuatBan o1, NhaXuatBan o2) {
                return o1.getTenNXB().compareTo(o2.getTenNXB());
            }
        });
        for(NhaXuatBan nxb: nxbList){
            cboModel.addElement(nxb.getTenNXB());
        }
    }
    
    public Sach getEntitySach() throws ParseException{
        int pos = FormSach.tblSach.getSelectedRow();
            Sach s = sDao.laySachTheoMa(FormSach.tblSach.getValueAt(pos, 0).toString());
            s.setMaSach(FormSach.tblSach.getValueAt(pos, 0).toString());
            s.setTenSach(txtTenSach.getText());
            s.setDonGia(Double.parseDouble(txtDonGia.getText()));
            s.setNXB(nxbDao.layNhaXuatBanTheoTen(cboNXB.getSelectedItem().toString()));
            s.setTacGia(tgDao.layTacGiaTheoTen(cboTacGia.getSelectedItem().toString()));
            s.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
            s.setTheLoai(tlDao.layTheLoaiTheoTen(cboTheLoai.getSelectedItem().toString()));
            s.setHinhAnh(anhSach);
            return s;
    }
    
    private void txtTenSachCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenSachCaretUpdate
        // TODO add your handling code here:
        String s = txtTenSach.getText();
        
        if(!myFunction.checkTenSach(s)){
            lbl_CheckTenSach.setText("Nhập tên theo đúng định dạng VD: Vẫn còn kịp");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckTenSach.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckTenSach.setText("✓");
        }
    }//GEN-LAST:event_txtTenSachCaretUpdate

    private void txtSoLuongCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSoLuongCaretUpdate
        // TODO add your handling code here:
        String s = txtSoLuong.getText();
        
        if(!myFunction.checkSoLuong(s)){
            lbl_CheckSL.setText("Nhập thông tin theo đúng định dạng số");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckSL.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckSL.setText("✓");
        }
    }//GEN-LAST:event_txtSoLuongCaretUpdate

    private void txtDonGiaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDonGiaCaretUpdate
        // TODO add your handling code here:
        String s = txtDonGia.getText();
        
        if(!myFunction.checkTien(s)){
            lbl_CheckDonGia.setText("Nhập đơn giá theo đúng định dạng số >= 1000");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckDonGia.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckDonGia.setText("✓");
        }
    }//GEN-LAST:event_txtDonGiaCaretUpdate

    private void btnChonAnhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMousePressed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png","jpg","jpeg");
        chooser.addChoosableFileFilter(fnef);
        chooser.showOpenDialog(null);        
        f = chooser.getSelectedFile();
        fileName = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_SMOOTH));
        lblHinh.setIcon(imageIcon);
        try {
            File image = new File(fileName);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int i; (i = fis.read(buf))!=-1;){
                bos.write(buf,0,i);
            }
            anhSach = bos.toByteArray();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnChonAnhMousePressed

    private void btnLuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMousePressed
        if(txtTenSach.getText().equalsIgnoreCase("") || 
           txtSoLuong.getText().equalsIgnoreCase("") ||
           txtDonGia.getText().equalsIgnoreCase("") ||
           lblHinh.getIcon() == null){
           JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (!myFunction.checkTenSach(txtTenSach.getText()) 
                    || !myFunction.checkSoLuong(txtSoLuong.getText()) 
                    || !myFunction.checkTien(txtDonGia.getText())){ 
            JOptionPane.showMessageDialog(this, "Vui lòng nhập các thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Sach s = getEntitySach();
                if(sDao.updateSach(s) > 0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    FormSach.fillDataSach();
                    this.dispose();
                }
           } catch (Exception e) {
               System.out.println("Lỗi thêm: " + e.toString());
           }
        }
    }//GEN-LAST:event_btnLuuMousePressed

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
           txtTenSach.setText("");
           cboTacGia.setSelectedIndex(0);
           cboNXB.setSelectedIndex(0);
           txtSoLuong.setText("");
           txtDonGia.setText("");
           lblHinh.removeAll();
    }//GEN-LAST:event_btnResetMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCapNhatSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnChonAnh;
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnReset;
    public Swing.ComboboxSuggestion cboNXB;
    public Swing.ComboboxSuggestion cboTacGia;
    public javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lbl_CheckDonGia;
    private javax.swing.JLabel lbl_CheckSL;
    private javax.swing.JLabel lbl_CheckTenSach;
    private javax.swing.JPanel pnlCapNhatSach;
    public javax.swing.JTextField txtDonGia;
    public javax.swing.JTextField txtSoLuong;
    public javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
