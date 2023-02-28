package Form;

import Dao.NhaXuatBanDAO;
import Entity.NhaXuatBan;
import Entity.myFunction;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class FormCapNhatNhaXuatBan extends javax.swing.JFrame {

    NhaXuatBanDAO nxbDao = new NhaXuatBanDAO();
    
    public FormCapNhatNhaXuatBan() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNXB = new javax.swing.JTextField();
        txtDiaChiNXB = new javax.swing.JTextField();
        txtSDTNXB = new javax.swing.JTextField();
        txtEmailNXB = new javax.swing.JTextField();
        lbl_CheckHoTen = new javax.swing.JLabel();
        lbl_CheckDC = new javax.swing.JLabel();
        lbl_CheckSDT = new javax.swing.JLabel();
        lbl_CheckEmail = new javax.swing.JLabel();
        btnReset = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập nhật nhà xuất bản");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Tên NXB:");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Địa chỉ:");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("SĐT:");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        txtTenNXB.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenNXB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenNXBCaretUpdate(evt);
            }
        });

        txtDiaChiNXB.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtDiaChiNXB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDiaChiNXBCaretUpdate(evt);
            }
        });

        txtSDTNXB.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSDTNXB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSDTNXBCaretUpdate(evt);
            }
        });

        txtEmailNXB.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtEmailNXB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEmailNXBCaretUpdate(evt);
            }
        });

        lbl_CheckHoTen.setText("*");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_CheckHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTenNXB)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_CheckDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiaChiNXB, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_CheckEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmailNXB)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CheckSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSDTNXB))))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckHoTen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDiaChiNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckDC)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSDTNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckSDT)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckEmail)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public NhaXuatBan getEntityNhaXuatBan() throws ParseException{
         int pos = FormSach.tblNXB.getSelectedRow();
            NhaXuatBan nxb = new NhaXuatBan();
            nxb.setMaNXB(Integer.parseInt(FormSach.tblNXB.getValueAt(pos, 0).toString()));
            nxb.setTenNXB(txtTenNXB.getText());
            nxb.setDiaChi(txtDiaChiNXB.getText());
            nxb.setEmail(txtEmailNXB.getText());
            nxb.setSDT(txtSDTNXB.getText());
            return nxb;
    }
    
    private void txtTenNXBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenNXBCaretUpdate
        // TODO add your handling code here:
        String s = txtTenNXB.getText();
        
        if(!myFunction.checkTenNXB(s)){
            lbl_CheckHoTen.setText("Nhập tên theo đúng định dạng VD: NXB Thanh Hóa");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckHoTen.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckHoTen.setText("✓");
        }
    }//GEN-LAST:event_txtTenNXBCaretUpdate

    private void txtDiaChiNXBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDiaChiNXBCaretUpdate
        // TODO add your handling code here:
        String s = txtDiaChiNXB.getText();
                     
        if(s.equalsIgnoreCase("")){
            lbl_CheckDC.setText("Phải nhập mục này");
            return;
        }
        else{
            lbl_CheckDC.setText("✓");
        }
    }//GEN-LAST:event_txtDiaChiNXBCaretUpdate

    private void txtSDTNXBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSDTNXBCaretUpdate
        // TODO add your handling code here:
        String s = txtSDTNXB.getText();
        
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
    }//GEN-LAST:event_txtSDTNXBCaretUpdate

    private void txtEmailNXBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEmailNXBCaretUpdate
        // TODO add your handling code here:
        String s = txtEmailNXB.getText();
        
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
    }//GEN-LAST:event_txtEmailNXBCaretUpdate

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
         txtTenNXB.setText("");
        txtDiaChiNXB.setText("");
        txtSDTNXB.setText("");
        txtEmailNXB.setText("");
    }//GEN-LAST:event_btnResetMousePressed

    private void btnLuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMousePressed
        if(txtTenNXB.getText().equalsIgnoreCase("") || 
          txtDiaChiNXB.getText().equalsIgnoreCase("") ||
          txtEmailNXB.getText().equalsIgnoreCase("") ||
          txtSDTNXB.getText().equalsIgnoreCase("") ){
           JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
       } else if (!myFunction.checkTenNXB(txtTenNXB.getText()) || !myFunction.checkSDT(txtSDTNXB.getText()) || !myFunction.checkEmail(txtEmailNXB.getText())){ 
            JOptionPane.showMessageDialog(this, "Vui lòng nhập các thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE); 
        } else {
           try {
                NhaXuatBan nxb = getEntityNhaXuatBan();
                if(nxbDao.updateNhaXuatBan(nxb) > 0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    FormSach.fillDataNhaXuatBan();
                    this.dispose();
                }
           } catch (Exception e) {
               System.out.println("Lỗi cập nhật: " + e.toString());
           }
       }
    }//GEN-LAST:event_btnLuuMousePressed

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
            java.util.logging.Logger.getLogger(FormCapNhatNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatNhaXuatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCapNhatNhaXuatBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CheckDC;
    private javax.swing.JLabel lbl_CheckEmail;
    private javax.swing.JLabel lbl_CheckHoTen;
    private javax.swing.JLabel lbl_CheckSDT;
    public javax.swing.JTextField txtDiaChiNXB;
    public javax.swing.JTextField txtEmailNXB;
    public javax.swing.JTextField txtSDTNXB;
    public javax.swing.JTextField txtTenNXB;
    // End of variables declaration//GEN-END:variables
}
