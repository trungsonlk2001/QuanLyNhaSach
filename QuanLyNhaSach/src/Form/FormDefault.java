package Form;

import Connect.SharedData;

public class FormDefault extends javax.swing.JPanel {

    public FormDefault() {
        initComponents();
//        lblMaNhanVien.setText(String.valueOf(SharedData.nhanVien.getMaNhanVien()));
//        lblTenNhanVien.setText(SharedData.nhanVien.getTenNhanVien());
//        lblChucVu.setText(SharedData.nhanVien.getCv().getTenChucVu());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbAnh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jlbAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bookshop.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 1448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jlbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbAnh;
    // End of variables declaration//GEN-END:variables
}
