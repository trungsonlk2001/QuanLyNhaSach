package Form;

import Dao.ChucVuDAO;
import Dao.NhanVienDAO;
import Entity.ChucVu;
import Entity.NhanVien;
import Entity.myFunction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormCapNhatNhanVien extends javax.swing.JFrame {

    ChucVuDAO cvDao = new ChucVuDAO();
    NhanVienDAO nvDao = new NhanVienDAO();
    SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
    
    public FormCapNhatNhanVien() {
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
        lbl_CheckHoTen = new javax.swing.JLabel();
        lbl_CheckNgaySinh = new javax.swing.JLabel();
        lbl_CheckDC = new javax.swing.JLabel();
        lbl_CheckSDT = new javax.swing.JLabel();
        lbl_CheckLuong = new javax.swing.JLabel();
        btnReset = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật nhân viên");

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

        lbl_CheckHoTen.setText("*");

        lbl_CheckNgaySinh.setText("*");

        lbl_CheckDC.setText("*");

        lbl_CheckSDT.setText("*");

        lbl_CheckLuong.setText("*");

        btnReset.setText("Rỗng");
        btnReset.setFocusable(false);
        btnReset.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.setFocusable(false);
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(96, 96, 96)
                                            .addComponent(lbl_CheckSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 290, Short.MAX_VALUE)
                            .addComponent(lbl_CheckLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_CheckNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenNV)
                                    .addComponent(txtNgaySinhNV)
                                    .addComponent(lbl_CheckHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CheckDC, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLuongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLuongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CheckLuong)
                        .addGap(58, 130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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
                if(nvDao.updateNhanVien(nv) > 0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    FormNhanVien.fillDataNhanVien();
                    this.dispose();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: "+ e.toString());
            }
        }
    }//GEN-LAST:event_btnLuuMousePressed

    public NhanVien getEntityNhanVien() throws ParseException{
        int pos = FormNhanVien.tblNV.getSelectedRow();
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(Integer.parseInt(FormNhanVien.tblNV.getValueAt(pos, 0).toString()));
        nv.setTenNhanVien(txtTenNV.getText());
        nv.setNgaySinh(dfm.parse(txtNgaySinhNV.getText()));
        nv.setLuongCoBan(Double.parseDouble(txtLuongCoBan.getText()));
        nv.setDiaChi(txtDiaChiNV.getText());
        nv.setSDT(txtSDTNV.getText());
        ChucVu cv = cvDao.layChucVuTheoTen(cboChucVu.getSelectedItem().toString());
        nv.setCv(cv);
        return nv;
    }
    
    public void getComboBoxChucVu(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboChucVu.getModel();
        for(ChucVu cv : cvDao.layDSChucVu()){
            cboModel.addElement(cv.getTenChucVu());
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCapNhatNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnReset;
    public javax.swing.JComboBox<String> cboChucVu;
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
    public javax.swing.JTextField txtDiaChiNV;
    public javax.swing.JTextField txtLuongCoBan;
    public javax.swing.JTextField txtNgaySinhNV;
    public javax.swing.JTextField txtSDTNV;
    public javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
