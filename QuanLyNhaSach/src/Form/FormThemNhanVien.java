package Form;

import Dao.ChucVuDAO;
import Dao.NhanVienDAO;
import Entity.ChucVu;
import Entity.KhachHang;
import Entity.LoaiKhachHang;
import Entity.NhanVien;
import Entity.myFunction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormThemNhanVien extends javax.swing.JFrame {
    
    ChucVuDAO cvDao = new ChucVuDAO();
    NhanVienDAO nvDao = new NhanVienDAO();
    SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");

    public FormThemNhanVien() {
        initComponents();
        getComboBoxChucVu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtNgaySinhNV = new javax.swing.JTextField();
        txtDiaChiNV = new javax.swing.JTextField();
        txtSDTNV = new javax.swing.JTextField();
        cboChucVu = new javax.swing.JComboBox<>();
        txtLuongCoBan = new javax.swing.JTextField();
        lbl_CheckNgaySinh = new javax.swing.JLabel();
        lbl_CheckHoTen = new javax.swing.JLabel();
        lbl_CheckDC = new javax.swing.JLabel();
        lbl_CheckSDT = new javax.swing.JLabel();
        lbl_CheckLuong = new javax.swing.JLabel();
        btnReset = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhập thông tin nhân viên");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Họ tên:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Ngày sinh:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Địa chỉ:");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("SĐT:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Chức vụ:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Lương cơ bản:");

        txtTenNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenNV.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenNVCaretUpdate(evt);
            }
        });

        txtNgaySinhNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNgaySinhNV.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNgaySinhNVCaretUpdate(evt);
            }
        });

        txtDiaChiNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtDiaChiNV.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDiaChiNVCaretUpdate(evt);
            }
        });

        txtSDTNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSDTNV.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSDTNVCaretUpdate(evt);
            }
        });

        cboChucVu.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtLuongCoBan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtLuongCoBan.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtLuongCoBanCaretUpdate(evt);
            }
        });

        lbl_CheckNgaySinh.setText("*");

        lbl_CheckHoTen.setText("*");

        lbl_CheckDC.setText("*");

        lbl_CheckSDT.setText("*");

        lbl_CheckLuong.setText("*");

        btnReset.setText("Rỗng");
        btnReset.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetMouseReleased(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLuuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(lbl_CheckSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbl_CheckLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(txtNgaySinhNV)
                                .addComponent(lbl_CheckHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_CheckNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_CheckDC, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLuongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckHoTen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckNgaySinh)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckDC)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckSDT)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLuongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckLuong)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public NhanVien getEntityNhanVien() throws ParseException{
            NhanVien nv = new NhanVien();
            nv.setTenNhanVien(txtTenNV.getText());
            nv.setNgaySinh(dfm.parse(txtNgaySinhNV.getText()));
            nv.setLuongCoBan(Double.parseDouble(txtLuongCoBan.getText()));
            nv.setDiaChi(txtDiaChiNV.getText());
            nv.setSDT(txtSDTNV.getText());
            ChucVu cv = cvDao.layChucVuTheoTen(cboChucVu.getSelectedItem().toString());
            nv.setCv(cv);
            return nv;
    }
    
    private void txtTenNVCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenNVCaretUpdate
        // TODO add your handling code here:
        String s = txtTenNV.getText();
        
        if(!myFunction.checkTen(s)){
            lbl_CheckHoTen.setText("Nhập tên theo đúng định dạng VD: Lê Lơi");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckHoTen.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckHoTen.setText("✓");
        }
    }//GEN-LAST:event_txtTenNVCaretUpdate

    private void txtNgaySinhNVCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNgaySinhNVCaretUpdate
        String s = txtNgaySinhNV.getText();
        
        if(!myFunction.checkNgayThang(s)){
            lbl_CheckNgaySinh.setText("Nhập ngày chưa đúng định dạng dd-mm-yyyy");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckNgaySinh.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckNgaySinh.setText("✓");
        }
    }//GEN-LAST:event_txtNgaySinhNVCaretUpdate

    private void txtDiaChiNVCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDiaChiNVCaretUpdate
        // TODO add your handling code here:
        String s = txtDiaChiNV.getText();
                     
        if(s.equalsIgnoreCase("")){
            lbl_CheckDC.setText("Phải nhập mục này");
            return;
        }
        else{
            lbl_CheckDC.setText("✓");
        }
    }//GEN-LAST:event_txtDiaChiNVCaretUpdate

    private void txtSDTNVCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSDTNVCaretUpdate
        // TODO add your handling code here:
        String s = txtSDTNV.getText();
        
        if(!myFunction.checkSDT(s)){
            lbl_CheckSDT.setText("hãy nhập đúng số điện thoại");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckSDT.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckSDT.setText("✓");
        }
    }//GEN-LAST:event_txtSDTNVCaretUpdate

    private void txtLuongCoBanCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtLuongCoBanCaretUpdate
        // TODO add your handling code here:
        String s = txtLuongCoBan.getText();
        
        if(!myFunction.checkTien(s)){
            lbl_CheckLuong.setText("Số tiền lương không hợp lệ");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckLuong.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckLuong.setText("✓");
        }
    }//GEN-LAST:event_txtLuongCoBanCaretUpdate

    private void btnResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetMouseReleased

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        txtTenNV.setText("");
        txtDiaChiNV.setText("");
        txtLuongCoBan.setText("");
        txtSDTNV.setText("");
        txtNgaySinhNV.setText("");
    }//GEN-LAST:event_btnResetMousePressed

    private void btnLuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMousePressed
        String s1 = txtTenNV.getText();
        String s2 = txtDiaChiNV.getText();
        String s3 = txtNgaySinhNV.getText();
        String s4 = txtSDTNV.getText();
        String s5 = txtLuongCoBan.getText();
        
        if(txtTenNV.getText().equalsIgnoreCase("") || 
            txtNgaySinhNV.getText().equalsIgnoreCase("") ||
            txtLuongCoBan.getText().equalsIgnoreCase("") ||
            txtDiaChiNV.getText().equalsIgnoreCase("") ||
            txtSDTNV.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);         
        } else if (!myFunction.checkTen(s1) || !myFunction.checkNgayThang(s3) 
                    || !myFunction.checkSDT(s4) || !myFunction.checkTien(s5)){ 
            JOptionPane.showMessageDialog(this, "Vui lòng nhập các thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            try {                
                NhanVien nv = getEntityNhanVien();
                if(nvDao.addNhanVien(nv) > 0){
                    JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    FormNhanVien.fillDataNhanVien();
                    this.dispose();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: "+ e.toString());
            }
        }
    }//GEN-LAST:event_btnLuuMousePressed

    public void getComboBoxChucVu(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboChucVu.getModel();
        for(ChucVu cv : cvDao.layDSChucVu()){
            cboModel.addElement(cv.getTenChucVu());
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThemNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnReset;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CheckDC;
    private javax.swing.JLabel lbl_CheckHoTen;
    private javax.swing.JLabel lbl_CheckLuong;
    private javax.swing.JLabel lbl_CheckNgaySinh;
    private javax.swing.JLabel lbl_CheckSDT;
    private javax.swing.JTextField txtDiaChiNV;
    private javax.swing.JTextField txtLuongCoBan;
    private javax.swing.JTextField txtNgaySinhNV;
    private javax.swing.JTextField txtSDTNV;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
