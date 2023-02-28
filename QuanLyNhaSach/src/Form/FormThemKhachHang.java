package Form;

import Dao.KhachHangDAO;
import Entity.KhachHang;
import Entity.LoaiKhachHang;
import Entity.myFunction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormThemKhachHang extends javax.swing.JFrame {
    
    KhachHangDAO khDao = new KhachHangDAO();
    SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");

    public FormThemKhachHang() {
        initComponents();
        getComboBoxLoaiKhachHang();
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
        txtTenKH = new javax.swing.JTextField();
        txtNgaySinhKH = new javax.swing.JTextField();
        txtDiaChiKH = new javax.swing.JTextField();
        txtSDTKH = new javax.swing.JTextField();
        cboLoaiKH = new javax.swing.JComboBox<>();
        txtEmailKH = new javax.swing.JTextField();
        lbl_CheckHoTen = new javax.swing.JLabel();
        lbl_CheckNgaySinh = new javax.swing.JLabel();
        lbl_CheckDC = new javax.swing.JLabel();
        lbl_CheckSDT = new javax.swing.JLabel();
        lbl_CheckEmail = new javax.swing.JLabel();
        btnReset = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhập thông tin khách hàng");

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
        jLabel5.setText("Loại khách hàng:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Email:");

        txtTenKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenKHCaretUpdate(evt);
            }
        });

        txtNgaySinhKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNgaySinhKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNgaySinhKHCaretUpdate(evt);
            }
        });

        txtDiaChiKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtDiaChiKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDiaChiKHCaretUpdate(evt);
            }
        });

        txtSDTKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSDTKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSDTKHCaretUpdate(evt);
            }
        });
        txtSDTKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTKHActionPerformed(evt);
            }
        });

        cboLoaiKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtEmailKH.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtEmailKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEmailKHCaretUpdate(evt);
            }
        });

        lbl_CheckHoTen.setText("*");

        lbl_CheckNgaySinh.setText("*");

        lbl_CheckDC.setText("*");

        lbl_CheckSDT.setText("*");

        lbl_CheckEmail.setText("*");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(173, 192, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_CheckEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmailKH, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))))))
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
                                .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(txtNgaySinhKH)
                                .addComponent(lbl_CheckHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_CheckNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CheckDC, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_CheckSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckHoTen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgaySinhKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckNgaySinh)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiaChiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckDC)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckSDT)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckEmail)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
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

     public KhachHang getEntityKhachHang() throws ParseException{
            KhachHang kh = new KhachHang();
            kh.setTenKhachHang(txtTenKH.getText());
            kh.setNgaySinh(dfm.parse(txtNgaySinhKH.getText()));
            kh.setEmail(txtEmailKH.getText());
            kh.setDiaChi(txtDiaChiKH.getText());
            kh.setSDT(txtSDTKH.getText());
            LoaiKhachHang loai = khDao.layTenLoaiKhachHang(cboLoaiKH.getSelectedItem().toString());
            kh.setLoai(loai);
            return kh;
    }
    
    private void txtTenKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenKHCaretUpdate
        // TODO add your handling code here:
        String s = txtTenKH.getText();
        
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
    }//GEN-LAST:event_txtTenKHCaretUpdate

    private void txtNgaySinhKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNgaySinhKHCaretUpdate
        // TODO add your handling code here:
        String s = txtNgaySinhKH.getText();
        
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
    }//GEN-LAST:event_txtNgaySinhKHCaretUpdate

    private void txtDiaChiKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDiaChiKHCaretUpdate
        // TODO add your handling code here:
        String s = txtDiaChiKH.getText();
                     
        if(s.equalsIgnoreCase("")){
            lbl_CheckDC.setText("Phải nhập mục này");
            return;
        }
        else{
            lbl_CheckDC.setText("✓");
        }
    }//GEN-LAST:event_txtDiaChiKHCaretUpdate

    private void txtSDTKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSDTKHCaretUpdate
        // TODO add your handling code here:
        String s = txtSDTKH.getText();
        
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
    }//GEN-LAST:event_txtSDTKHCaretUpdate

    private void txtEmailKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEmailKHCaretUpdate
        // TODO add your handling code here:
        String s = txtEmailKH.getText();
        
        if(!myFunction.checkEmail(s)){
            lbl_CheckEmail.setText("Email không hợp lệ");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckEmail.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckEmail.setText("✓");
        }
    }//GEN-LAST:event_txtEmailKHCaretUpdate

    private void txtSDTKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTKHActionPerformed

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        txtTenKH.setText("");
        txtNgaySinhKH.setText("");
        txtEmailKH.setText("");
        txtDiaChiKH.setText("");
        txtSDTKH.setText("");
        cboLoaiKH.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetMousePressed

    private void btnLuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMousePressed
        if(txtTenKH.getText().equalsIgnoreCase("") || 
           txtNgaySinhKH.getText().equalsIgnoreCase("") ||
           txtEmailKH.getText().equalsIgnoreCase("") ||
           txtDiaChiKH.getText().equalsIgnoreCase("") ||
           txtSDTKH.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);         
        } else if (!myFunction.checkTen(txtTenKH.getText()) || !myFunction.checkNgayThang(txtNgaySinhKH.getText()) 
                    || !myFunction.checkSDT(txtSDTKH.getText()) || !myFunction.checkEmail(txtEmailKH.getText())){ 
            JOptionPane.showMessageDialog(this, "Vui lòng nhập các thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE); 
        } else {
            try {                
                KhachHang kh = getEntityKhachHang();
                if(khDao.addKhachHang(kh) > 0){
                    JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    FormKhachHang.fillDataKhachHang();
                    this.dispose();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: "+ e.toString());
            }
        }
    }//GEN-LAST:event_btnLuuMousePressed

    public void getComboBoxLoaiKhachHang(){
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboLoaiKH.getModel();
        for(LoaiKhachHang loai : khDao.layDSLoaiKhachHang()){
            cboModel.addElement(loai.getTenLoaiKhachHang());
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThemKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnReset;
    private javax.swing.JComboBox<String> cboLoaiKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CheckDC;
    private javax.swing.JLabel lbl_CheckEmail;
    private javax.swing.JLabel lbl_CheckHoTen;
    private javax.swing.JLabel lbl_CheckNgaySinh;
    private javax.swing.JLabel lbl_CheckSDT;
    private javax.swing.JTextField txtDiaChiKH;
    private javax.swing.JTextField txtEmailKH;
    private javax.swing.JTextField txtNgaySinhKH;
    private javax.swing.JTextField txtSDTKH;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
