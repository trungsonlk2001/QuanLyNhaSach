package Form;

import Dao.LoaiKhachHangDAO;
import Entity.LoaiKhachHang;
import Entity.myFunction;
import javax.swing.JOptionPane;

public class FormThemTheLoaiKH extends javax.swing.JFrame {

    LoaiKhachHangDAO loaiDAO = new LoaiKhachHangDAO();
    
    public FormThemTheLoaiKH() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenLoaiKH = new javax.swing.JTextField();
        lbl_CheckTenLoai = new javax.swing.JLabel();
        btnRong = new Swing.ButtonGradient();
        btnLuu = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhập loại khách hàng");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Tên loại khách hàng:");

        txtTenLoaiKH.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtTenLoaiKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenLoaiKHCaretUpdate(evt);
            }
        });

        lbl_CheckTenLoai.setText("*");

        btnRong.setText("Rỗng");
        btnRong.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnRong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRongMousePressed(evt);
            }
        });
        btnRong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRongActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
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
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRong, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CheckTenLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenLoaiKH, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CheckTenLoai)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // GET ENTITY
    public LoaiKhachHang getEntityLoaiKhachHang(){
        LoaiKhachHang loaiKH = new LoaiKhachHang();
        loaiKH.setTenLoaiKhachHang(txtTenLoaiKH.getText());
        return loaiKH;
    }
    
    private void txtTenLoaiKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenLoaiKHCaretUpdate
        // TODO add your handling code here:
        String s = txtTenLoaiKH.getText();
        
        if(!myFunction.checkTenLoai(s)){
            lbl_CheckTenLoai.setText("Nhập tên theo đúng định dạng VD: Vãng lai");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckTenLoai.setText("Phải nhập mục này");
                return;
            }
        }
        else{
            lbl_CheckTenLoai.setText("✓");
        }
    }//GEN-LAST:event_txtTenLoaiKHCaretUpdate

    private void btnRongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRongMousePressed
             txtTenLoaiKH.setText("");
    }//GEN-LAST:event_btnRongMousePressed

    private void btnRongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRongActionPerformed

    private void btnLuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMousePressed
               if(txtTenLoaiKH.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (!myFunction.checkTenLoai(txtTenLoaiKH.getText())){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else{
            try {
            LoaiKhachHang loaiKH = getEntityLoaiKhachHang();
            if(loaiDAO.addLoaiKhachHang(loaiKH) > 0){
                JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                FormKhachHang.fillDataLoaiKhachHang();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.toString());
            }
        }       
    }//GEN-LAST:event_btnLuuMousePressed

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThemTheLoaiKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu;
    private Swing.ButtonGradient btnRong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CheckTenLoai;
    private javax.swing.JTextField txtTenLoaiKH;
    // End of variables declaration//GEN-END:variables
}
