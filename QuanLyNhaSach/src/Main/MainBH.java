package Main;

import Connect.SharedData;
import Form.FormBanHang;
import Form.FormBangLuong;
import Form.FormDefault;
import Form.FormHoaDon;
import Form.FormKhachHang;
import Form.FormNhanVien;
import Form.FormPhieuNhap;
import Form.FormQuanLyPhieuNhap;
import Form.FormSach;
import Form.FormThongKe;
import Form.FormSachHetHang;
import Swing.MenuItem;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class MainBH extends javax.swing.JFrame {
    
    FormSach formSach;
    FormBanHang formBanHang;
    FormKhachHang formKhachHang;
    FormNhanVien formNhanVien;

    public MainBH() throws SQLException, ParseException {
        initComponents();
        initMenu();
        formSach = new FormSach();
        formBanHang = new FormBanHang();
        formKhachHang = new FormKhachHang();
        formNhanVien = new FormNhanVien();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý nhà sách");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menus.setBackground(new java.awt.Color(0, 51, 153));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hiệu Sách Tri Thức");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    // LOGIN VÀ PHÂN QUYỀN
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setForm(new FormDefault());
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        setForm(new FormDefault());
    }//GEN-LAST:event_jLabel1MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        this.dispose();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    
    public void initMenu(){
        ImageIcon iconNV = new ImageIcon(getClass().getResource("/Icon/Employee.png"));
        ImageIcon iconS = new ImageIcon(getClass().getResource("/Icon/Books.png"));
        ImageIcon iconHD = new ImageIcon(getClass().getResource("/Icon/Receipt.png"));
        ImageIcon iconPN = new ImageIcon(getClass().getResource("/Icon/Basket.png"));
        ImageIcon iconKH = new ImageIcon(getClass().getResource("/Icon/Customers.png"));
        ImageIcon iconLuong = new ImageIcon(getClass().getResource("/Icon/Money.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/Icon/subMenu.png"));
        
        MenuItem menuNV1 = new MenuItem(iconSubMenu, "Quản lý nhân viên", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(formNhanVien);
            }
        });
        MenuItem menuNV2 = new MenuItem(iconSubMenu, "Chấm công", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MenuItem menuNV3 = new MenuItem(iconSubMenu, "Bán hàng", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(formBanHang);
            }
        });
        MenuItem menuNV4 = new MenuItem(iconSubMenu, "Lập phiếu nhập", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(new FormPhieuNhap());
            }
        });
        MenuItem menuNV5 = new MenuItem(iconSubMenu, "Thống kê doanh thu", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setForm(new FormThongKe());
                } catch (SQLException ex) {
                    Logger.getLogger(MainBH.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        MenuItem menuNV6 = new MenuItem(iconSubMenu, "Thống kê sách hết hàng", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(new FormSachHetHang());
            }
        });
       
        MenuItem menuS1 = new MenuItem(iconSubMenu, "Quản lý sách", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(formSach);
            }
        });
        
        MenuItem menuHD1 = new MenuItem(iconSubMenu, "Tìm kiếm hóa đơn", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(new FormHoaDon());
            }
        });
              
        MenuItem menuPN1 = new MenuItem(iconSubMenu, "Tìm kiếm phiếu nhập", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(new FormQuanLyPhieuNhap());
            }
        });
        
        MenuItem menuLuong1 = new MenuItem(iconSubMenu, "Quản lý lương", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(new FormBangLuong());
            }
        });
        
        MenuItem menuKhachHang1 = new MenuItem(iconSubMenu, "Quản lý khách hàng", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setForm(formKhachHang);
            }
        });      
        
        MenuItem menuThongKe1 = new MenuItem(iconSubMenu, "Bảng lương", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        if(SharedData.nhanVien.getCv().getTenChucVu().equals("Quản lý")){
            MenuItem menuNV = new MenuItem(iconNV, "Nhân viên", null, menuNV1,menuNV2,menuNV3,menuNV4,menuNV5,menuNV6);
            MenuItem menuSach = new MenuItem(iconS, "Sách", null, menuS1);
            MenuItem menuHoaDon = new MenuItem(iconHD, "Hóa đơn", null, menuHD1);
            MenuItem menuPhieuNhap = new MenuItem(iconPN, "Phiếu nhập", null, menuPN1);
            MenuItem menuLuong = new MenuItem(iconLuong,"Lương",null,menuLuong1);
            MenuItem menuKhachHang = new MenuItem(iconKH, "Khách hàng", null, menuKhachHang1);
            addMenu(menuNV,menuSach,menuHoaDon,menuPhieuNhap,menuLuong,menuKhachHang);  
        } else {
            MenuItem menuNV = new MenuItem(iconNV, "Nhân viên", null,menuNV3,menuNV4,menuNV5,menuNV6);
            MenuItem menuSach = new MenuItem(iconS, "Sách", null, menuS1);
            MenuItem menuHoaDon = new MenuItem(iconHD, "Hóa đơn", null, menuHD1);
            MenuItem menuPhieuNhap = new MenuItem(iconPN, "Phiếu nhập", null, menuPN1);            
            MenuItem menuKhachHang = new MenuItem(iconKH, "Khách hàng", null, menuKhachHang1);
            addMenu(menuNV,menuSach,menuHoaDon,menuPhieuNhap,menuKhachHang);  
        }
               
    }

   private void addMenu(MenuItem... menu) {
        for (MenuItem menu1 : menu) {
            menus.add(menu1);
            addEventMouse(menu1);
            ArrayList<MenuItem> subMenu = menu1.getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
                addEventMouse(m);
            }
        }
        menus.revalidate();
    }
    
   public void addEventMouse(Component com) {
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {                
                com.setBackground(new Color(226, 104, 104));
                clearAllSelect(com);
            }

        });
    }

    public void clearAllSelect(Component com) {
        for (Component c : menus.getComponents()) {
            if (com != c) {
                c.setBackground(new Color(0,0,153));
            }
        }
    }
    
    public void setForm(JComponent com){
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
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
            java.util.logging.Logger.getLogger(MainBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainBH().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainBH.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(MainBH.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel mainPanel;
    public javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menus;
    // End of variables declaration//GEN-END:variables
}
