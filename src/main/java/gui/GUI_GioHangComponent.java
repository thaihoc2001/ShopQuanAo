/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author hieud
 */
public class GUI_GioHangComponent extends javax.swing.JPanel {

    /**
     * Creates new form GUI_GioHangComponent
     */
    public GUI_GioHangComponent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTru = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        btnCong = new javax.swing.JButton();
        lblTenSP = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnXoa1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnTru.setText("-");

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoLuong.setText("1");

        btnCong.setText("+");

        lblTenSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTenSP.setText("Áo Sample");

        lblDonGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDonGia.setText("350.000đ");

        lblTong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTong.setText("350.000đ");

        btnXoa1.setText("Xóa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnTru)
                    .addGap(13, 13, 13)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(btnCong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90)
                    .addComponent(lblTenSP)
                    .addGap(106, 106, 106)
                    .addComponent(lblDonGia)
                    .addGap(125, 125, 125)
                    .addComponent(lblTong)
                    .addGap(115, 115, 115)
                    .addComponent(btnXoa1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTenSP)
                        .addComponent(lblDonGia)
                        .addComponent(lblTong)
                        .addComponent(btnXoa1))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTong;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}