package Form;

import Dao.NhanVienDAO;
import Dao.TaiKhoanDAO;
import Entity.NhanVien;
import Entity.TaiKhoan;
import Entity.myFunction;
import javax.swing.JOptionPane;

public class FormCapNhatTaiKhoan extends javax.swing.JFrame {

    NhanVienDAO nvDao = new NhanVienDAO();
    TaiKhoanDAO tkDao = new TaiKhoanDAO();
    
    public FormCapNhatTaiKhoan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        lbl_CheckMaNV = new javax.swing.JLabel();
        lbl_CheckTenDN = new javax.swing.JLabel();
        lbl_CheckMK = new javax.swing.JLabel();
        btnReset = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật tài khoản");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Mã nhân viên:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Tên đăng nhập:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        txtMaNV.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtMaNV.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaNVCaretUpdate(evt);
            }
        });

        txtTenDangNhap.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenDangNhap.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenDangNhapCaretUpdate(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtMatKhau.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMatKhauCaretUpdate(evt);
            }
        });

        lbl_CheckMaNV.setText("*");

        lbl_CheckTenDN.setText("*");

        lbl_CheckMK.setText("*");

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
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_CheckMK, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(txtTenDangNhap)
                            .addComponent(lbl_CheckMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CheckTenDN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(80, 86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckMaNV)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckTenDN)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckMK)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaNVCaretUpdate
        // TODO add your handling code here:
        String s = txtMaNV.getText();
        
        if(!myFunction.checkSoLuong(s)){
            lbl_CheckMaNV.setText("Nhập thông tin theo đúng định dạng số");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckMaNV.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckMaNV.setText("✓");
        }
    }//GEN-LAST:event_txtMaNVCaretUpdate

    private void txtTenDangNhapCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenDangNhapCaretUpdate
        // TODO add your handling code here:
        String s = txtTenDangNhap.getText();
        
        if(!myFunction.checkUserName(s)){
            lbl_CheckTenDN.setText("Nhập thông tin theo đúng định dạng VD: user01");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckTenDN.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckTenDN.setText("✓");
        }
    }//GEN-LAST:event_txtTenDangNhapCaretUpdate

    private void txtMatKhauCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMatKhauCaretUpdate
        // TODO add your handling code here:
        String s = txtMatKhau.getText();
        
        if(!myFunction.checkMatKhau(s)){
            lbl_CheckMK.setText("Nhập thông tin theo đúng định dạng VD: User01");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckMK.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckMK.setText("✓");
        }
    }//GEN-LAST:event_txtMatKhauCaretUpdate

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        txtMaNV.setText("");
        txtTenDangNhap.setText("");
        txtMatKhau.setText("");
    }//GEN-LAST:event_btnResetMousePressed

    private void btnLuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMousePressed
        if(txtTenDangNhap.getText().equalsIgnoreCase("") ||
           txtMaNV.getText().equalsIgnoreCase("") ||
           txtMatKhau.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (!myFunction.checkSoLuong(txtMaNV.getText()) || !myFunction.checkUserName(txtTenDangNhap.getText()) || !myFunction.checkMatKhau(txtMatKhau.getText())){ 
            JOptionPane.showMessageDialog(this, "Vui lòng nhập các thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE); 
        } else {
            try {
                TaiKhoan tk = getEntityTaiKhoan();
                if(tkDao.updateTaiKhoan(tk) > 0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    FormNhanVien.fillDataTaiKhoan();
                    this.dispose();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnLuuMousePressed

    public TaiKhoan getEntityTaiKhoan(){
        int pos = FormNhanVien.tblTK.getSelectedRow();
        TaiKhoan tk = new TaiKhoan();
        tk.setMaTaiKhoan(Integer.parseInt(FormNhanVien.tblTK.getValueAt(pos, 0).toString()));
        NhanVien nv = nvDao.layNhanVienTheoMa(txtMaNV.getText());
        tk.setNhanVien(nv);
        tk.setTenDangNhap(txtTenDangNhap.getText());
        tk.setMatKhau(txtMatKhau.getText());
        return tk;
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
            java.util.logging.Logger.getLogger(FormCapNhatTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCapNhatTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CheckMK;
    private javax.swing.JLabel lbl_CheckMaNV;
    private javax.swing.JLabel lbl_CheckTenDN;
    public javax.swing.JTextField txtMaNV;
    public javax.swing.JTextField txtMatKhau;
    public javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
