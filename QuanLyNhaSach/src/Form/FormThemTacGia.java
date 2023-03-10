package Form;

import Dao.TacGiaDAO;
import Entity.TacGia;
import Entity.myFunction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FormThemTacGia extends javax.swing.JFrame {

    SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
    static TacGiaDAO tgDao = new TacGiaDAO();
    
    public FormThemTacGia() {
        initComponents();
    }

    public TacGia getEntityTacGia() throws ParseException{
            TacGia tg = new TacGia();
            tg.setTenTacGia(txtTenTG.getText());
            tg.setQueQuan(txtQueQuanTG.getText());
            tg.setNgaySinh(dfm.parse(txtNgaySinhTG.getText()));
            if(txtNgayMatTG.getText().equalsIgnoreCase("")){
                tg.setNgayMat(null);
            }else {
                tg.setNgayMat(dfm.parse(txtNgayMatTG.getText()));
            }            
            tg.setQuocTich(txtQuocTichTG.getText());
            tg.setChiTiet(txtChiTietTG.getText());
            return tg;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTenTG = new javax.swing.JTextField();
        txtNgaySinhTG = new javax.swing.JTextField();
        txtNgayMatTG = new javax.swing.JTextField();
        txtQueQuanTG = new javax.swing.JTextField();
        txtQuocTichTG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChiTietTG = new javax.swing.JTextArea();
        lbl_CheckHoTen = new javax.swing.JLabel();
        lbl_CheckNgaySinh = new javax.swing.JLabel();
        lbl_CheckNgayMat = new javax.swing.JLabel();
        lbl_CheckQueQuan = new javax.swing.JLabel();
        lbl_CheckQuocTich = new javax.swing.JLabel();
        btnReset = new Swing.ButtonGradient();
        btnLuu1 = new Swing.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nh???p th??ng tin t??c gi???");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("T??n t??c gi???:");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("Ng??y sinh:");

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel10.setText("Ng??y m???t:");

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel11.setText("Qu?? qu??n:");

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel12.setText("Qu???c t???ch:");

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel13.setText("Chi ti???t:");

        txtTenTG.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtTenTG.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenTGCaretUpdate(evt);
            }
        });

        txtNgaySinhTG.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNgaySinhTG.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNgaySinhTGCaretUpdate(evt);
            }
        });

        txtNgayMatTG.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNgayMatTG.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNgayMatTGCaretUpdate(evt);
            }
        });

        txtQueQuanTG.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtQueQuanTG.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtQueQuanTGCaretUpdate(evt);
            }
        });

        txtQuocTichTG.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtQuocTichTG.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtQuocTichTGCaretUpdate(evt);
            }
        });

        txtChiTietTG.setColumns(20);
        txtChiTietTG.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtChiTietTG.setRows(5);
        jScrollPane1.setViewportView(txtChiTietTG);

        lbl_CheckHoTen.setText("*");

        lbl_CheckNgaySinh.setText("*");

        lbl_CheckNgayMat.setText("*");

        lbl_CheckQueQuan.setText("*");

        lbl_CheckQuocTich.setText("*");

        btnReset.setText("R???ng");
        btnReset.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
        });

        btnLuu1.setText("L??u");
        btnLuu1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnLuu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLuu1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNgaySinhTG, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtTenTG)
                            .addComponent(txtNgayMatTG)
                            .addComponent(txtQueQuanTG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuocTichTG)
                            .addComponent(lbl_CheckHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CheckNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CheckNgayMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CheckQueQuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_CheckQuocTich, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CheckHoTen)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNgaySinhTG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CheckNgaySinh)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNgayMatTG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CheckNgayMat)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtQueQuanTG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CheckQueQuan)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtQuocTichTG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CheckQuocTich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(127, 127, 127)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenTGCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenTGCaretUpdate
        // TODO add your handling code here:
        String s = txtTenTG.getText();
        
        if(!myFunction.checkTen(s)){
            lbl_CheckHoTen.setText("Nh???p t??n theo ????ng ?????nh d???ng VD: L?? L??i");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckHoTen.setText("Ph???i nh???p m???c n??y");
                return;
            }
        }
        else{
            lbl_CheckHoTen.setText("???");
        }
    }//GEN-LAST:event_txtTenTGCaretUpdate

    private void txtNgaySinhTGCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNgaySinhTGCaretUpdate
        // TODO add your handling code here:
        String s = txtNgaySinhTG.getText();
        
        if(!myFunction.checkNgayThang(s)){
            lbl_CheckNgaySinh.setText("Nh???p ng??y ch??a ????ng ?????nh d???ng dd-mm-yyyy");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckNgaySinh.setText("Ph???i nh???p m???c n??y");
                return;
            }
        }
        else{
            lbl_CheckNgaySinh.setText("???");
        }
    }//GEN-LAST:event_txtNgaySinhTGCaretUpdate

    private void txtNgayMatTGCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNgayMatTGCaretUpdate
        // TODO add your handling code here:
        String s = txtNgayMatTG.getText();
        
        if(!myFunction.checkNgayThang(s)){
            lbl_CheckNgayMat.setText("Nh???p ng??y ch??a ????ng ?????nh d???ng dd-mm-yyyy");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckNgayMat.setText("*");
                return;
            }
        }
        else{
            lbl_CheckNgayMat.setText("???");
        }
    }//GEN-LAST:event_txtNgayMatTGCaretUpdate

    private void txtQueQuanTGCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtQueQuanTGCaretUpdate
        // TODO add your handling code here:
        String s = txtQueQuanTG.getText();
        
        if(!myFunction.checkTen(s)){
            lbl_CheckQueQuan.setText("Nh???p t??n theo ????ng ?????nh d???ng VD: S??n La");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckQueQuan.setText("Ph???i nh???p m???c n??y");
                return;
            }
        }
        else{
            lbl_CheckQueQuan.setText("???");
        }
    }//GEN-LAST:event_txtQueQuanTGCaretUpdate

    private void txtQuocTichTGCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtQuocTichTGCaretUpdate
        // TODO add your handling code here:
        String s = txtQuocTichTG.getText();
        
        if(!myFunction.checkTen(s)){
            lbl_CheckQuocTich.setText("Nh???p t??n theo ????ng ?????nh d???ng VD: Vi???t Nam");            
            if(s.equalsIgnoreCase("")){
                lbl_CheckQuocTich.setText("Ph???i nh???p m???c n??y");
                return;
            }
        }
        else{
            lbl_CheckQuocTich.setText("???");
        }
    }//GEN-LAST:event_txtQuocTichTGCaretUpdate

    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        txtTenTG.setText("");
        txtChiTietTG.setText("");
        txtNgayMatTG.setText("");
        txtNgaySinhTG.setText("");
        txtQueQuanTG.setText("");
        txtQuocTichTG.setText("");
    }//GEN-LAST:event_btnResetMousePressed

    private void btnLuu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuu1MousePressed
        if(txtTenTG.getText().equalsIgnoreCase("") || 
           txtQueQuanTG.getText().equalsIgnoreCase("") ||
           txtNgaySinhTG.getText().equalsIgnoreCase("") ||
           txtQuocTichTG.getText().equalsIgnoreCase("") ||
           txtChiTietTG.getText().equalsIgnoreCase("")) {
           JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ????? th??ng tin", "Th??ng b??o", JOptionPane.ERROR_MESSAGE);
        } else if (!myFunction.checkTen(txtTenTG.getText()) || !myFunction.checkNgayThang(txtNgaySinhTG.getText()) 
                    || !myFunction.checkTen(txtQueQuanTG.getText())|| !myFunction.checkTen(txtQuocTichTG.getText())){ 
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p c??c th??ng tin h???p l???", "Th??ng b??o", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                TacGia tg = getEntityTacGia();
                if(tgDao.addTacGia(tg) > 0) {
                    JOptionPane.showMessageDialog(this, "Th??m th??nh c??ng", "Th??ng b??o", JOptionPane.INFORMATION_MESSAGE);
                    FormSach.fillDataTacGia();
                    this.dispose();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnLuu1MousePressed

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
            java.util.logging.Logger.getLogger(FormThemTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThemTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThemTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThemTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThemTacGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ButtonGradient btnLuu1;
    private Swing.ButtonGradient btnReset;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CheckHoTen;
    private javax.swing.JLabel lbl_CheckNgayMat;
    private javax.swing.JLabel lbl_CheckNgaySinh;
    private javax.swing.JLabel lbl_CheckQueQuan;
    private javax.swing.JLabel lbl_CheckQuocTich;
    private javax.swing.JTextArea txtChiTietTG;
    private javax.swing.JTextField txtNgayMatTG;
    private javax.swing.JTextField txtNgaySinhTG;
    private javax.swing.JTextField txtQueQuanTG;
    private javax.swing.JTextField txtQuocTichTG;
    private javax.swing.JTextField txtTenTG;
    // End of variables declaration//GEN-END:variables
}
