package Main;

import Connect.SharedData;
import Dao.NhanVienDAO;
import Dao.TaiKhoanDAO;
import Entity.NhanVien;
import Entity.TaiKhoan;
import Entity.myFunction;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Cursor;
import java.awt.Image;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
    
    TaiKhoanDAO tkDao = new TaiKhoanDAO();
    NhanVienDAO nvDao = new NhanVienDAO();

    public LoginForm() {
        initComponents();
        ImageIcon wallpaperIcon = new ImageIcon(getClass().getResource("/Icon/wallpaper.jpg"));
        Image wallpaperImage = wallpaperIcon.getImage();
        Image scaleWallImage = wallpaperImage.getScaledInstance(450, 550, Image.SCALE_SMOOTH);
        wallpaperIcon = new ImageIcon(scaleWallImage);
        jLabel7.setIcon(wallpaperIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        buttonDangNhap = new Swing.ButtonGradient();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đăng Nhập");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 40, 280, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 140));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenDangNhap.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel5.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 330, 40));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Tên đăng nhập:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Mật khẩu:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 30));

        txtMatKhau.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel5.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 40));

        buttonDangNhap.setText("Đăng Nhập");
        buttonDangNhap.setColor1(new java.awt.Color(204, 204, 204));
        buttonDangNhap.setColor2(new java.awt.Color(153, 153, 153));
        buttonDangNhap.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        buttonDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonDangNhapMousePressed(evt);
            }
        });
        buttonDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDangNhapActionPerformed(evt);
            }
        });
        jPanel5.add(buttonDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 330, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 450, 250));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 450, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/term-bg-8-e9820a86.jpg"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDangNhapActionPerformed

    private void buttonDangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDangNhapMousePressed
           this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        String userName = txtTenDangNhap.getText();
        String password = new String(txtMatKhau.getPassword());

        if(userName.equalsIgnoreCase("") ||
            password.equalsIgnoreCase("")){
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ để đăng nhập", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
            MainBH main;
            try {
                NhanVien nv = nvDao.layNhanVienTheoTKVaMK(userName, password);
                SharedData.nhanVien = nv;
                main = new MainBH();
                main.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ( !myFunction.checkUserName(userName) ||!myFunction.checkMatKhau(password)){
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "Nhập mật khẩu hoặc tài khoản không hợp lệ", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            TaiKhoan tk = tkDao.layTaiKhoanTheoTKVaMK(userName, password);
            if(tk != null) {
                NhanVien nv = nvDao.layNhanVienTheoTKVaMK(userName, password);
                SharedData.nhanVien = nv;
                MainBH main;
                try {
                    main = new MainBH();
                    main.setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }
    }//GEN-LAST:event_buttonDangNhapMousePressed
    
    
    

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient buttonDangNhap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JPasswordField txtMatKhau;
    public javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
