/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.KhachHangDAO;
import entity.KhachHang;
import entity.TaiKhoan;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SessionFactory;
import service.KhachHangService;
import util.MySessionFactory;

/**
 *
 * @author hieud
 */
public class GUI_QLKH extends javax.swing.JPanel {

    private final List<KhachHang> list;
    DefaultTableModel model;
    KhachHangService khachhangdao;
    private int selectRow;

    /**
     * Creates new form GUI_QLKH
     */
    public GUI_QLKH() {
        initComponents();
        SessionFactory sessionFactory = new MySessionFactory().getSessionFactory();
        khachhangdao = new KhachHangDAO(sessionFactory);
        list = khachhangdao.getListKhachHang();
        model = (DefaultTableModel) tableDSKhachHang.getModel();
        showTable();
    }

    public void showTable() {
        model.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for (KhachHang kh1 : list) {
            model.addRow(new Object[]{
                kh1.getMaKhachHang(), kh1.getHoTen(), kh1.getDiaChi(), formatter.format(kh1.getNgaySinh()), kh1.getSoDienThoai(), kh1.getGioiTinh(), kh1.getEmail()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHoTen = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jcbGioiTinh = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnThemKhachHang = new javax.swing.JButton();
        btnSuaKhachHang = new javax.swing.JButton();
        btnXoaKhachHang = new javax.swing.JButton();
        btnXoaTrangForm = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDSKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setText("Qu???n L?? Kh??ch H??ng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblHoTen.setText("H??? v?? t??n");

        lblDiaChi.setText("?????a ch???");

        lblNgaySinh.setText("Ng??y sinh");

        lblSoDienThoai.setText("S??? ??i???n tho???i");

        lblGioiTinh.setText("Gi???i t??nh");

        lblEmail.setText("Email");

        lblTaiKhoan.setText("T??i kho???n");

        lblMatKhau.setText("M???t kh???u");

        txtNgaySinh.setText("dd/MM/yyyy");
        txtNgaySinh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNgaySinhFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNgaySinhFocusLost(evt);
            }
        });

        jcbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "N???", "Kh??c" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSoDienThoai)
                        .addComponent(lblNgaySinh, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblDiaChi)
                    .addComponent(lblHoTen))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen)
                    .addComponent(txtDiaChi)
                    .addComponent(txtNgaySinh)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTaiKhoan)
                            .addComponent(lblMatKhau))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtTaiKhoan)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblGioiTinh))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(jcbGioiTinh, 0, 250, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen)
                    .addComponent(lblGioiTinh)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(lblEmail)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(lblTaiKhoan)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDienThoai)
                    .addComponent(lblMatKhau)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnThemKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnThemKhachHang.setText("Th??m kh??ch h??ng");
        btnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachHangActionPerformed(evt);
            }
        });

        btnSuaKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaKhachHang.setText("S???a kh??ch h??ng");
        btnSuaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKhachHangActionPerformed(evt);
            }
        });

        btnXoaKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaKhachHang.setText("X??a kh??ch h??ng");
        btnXoaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhachHangActionPerformed(evt);
            }
        });

        btnXoaTrangForm.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaTrangForm.setText("X??a tr???ng form");
        btnXoaTrangForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnThemKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnSuaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXoaTrangForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSuaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnXoaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnXoaTrangForm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        txtTimKiem.setText("Nh???p n???i dung t??m ki???m");

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("T??m ki???m");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableDSKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? Kh??ch h??ng", "H??? v?? t??n", "?????a ch???", "Ng??y sinh", "S??? ??i???n tho???i", "Gi???i t??nh", "Email"
            }
        ));
        tableDSKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDSKhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiem)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachHangActionPerformed
        KhachHang kh = new KhachHang();
        kh.setHoTen(txtHoTen.getText());
        kh.setDiaChi(txtDiaChi.getText());
        try {
            kh.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(txtNgaySinh.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        kh.setSoDienThoai(txtSoDienThoai.getText());
        kh.setGioiTinh((String) jcbGioiTinh.getSelectedItem());
        kh.setEmail(txtEmail.getText());
        kh.setTaiKhoan(new TaiKhoan(txtTaiKhoan.getText(), jPasswordField1.getText(), kh));
        if (khachhangdao.addKhachHang(kh)) {
            xoaTrang();
            list.add(kh);
            showTable();
        } else {
            JOptionPane.showMessageDialog(this, "Th??m kh??ch h??ng th???t b???i");
        }
    }//GEN-LAST:event_btnThemKhachHangActionPerformed

    private void btnSuaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKhachHangActionPerformed
        selectRow = tableDSKhachHang.getSelectedRow();
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Kh??ng c?? kh??ch h??ng ????? s???a");
        } else if (selectRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n kh??ch h??ng c???n s???a");
        } else {
            KhachHang kh = new KhachHang();
            kh.setMaKhachHang(list.get(selectRow).getMaKhachHang());
            kh.setHoTen(txtHoTen.getText());
            kh.setDiaChi(txtDiaChi.getText());
            try {
                kh.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(txtNgaySinh.getText()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            kh.setSoDienThoai(txtSoDienThoai.getText());
            kh.setGioiTinh((String) jcbGioiTinh.getSelectedItem());
            kh.setEmail(txtEmail.getText());
            System.out.println(kh);
            TaiKhoan tk = new TaiKhoan(txtTaiKhoan.getText(), jPasswordField1.getText(), kh);
            tk.setMaTaiKhoan(list.get(selectRow).getTaiKhoan().getMaTaiKhoan());
            kh.setTaiKhoan(tk);
            if (khachhangdao.updateKhachHang(kh)) {
                tableDSKhachHang.setValueAt(txtHoTen.getText(), selectRow, 1);
                tableDSKhachHang.setValueAt(txtDiaChi.getText(), selectRow, 2);
                tableDSKhachHang.setValueAt(txtNgaySinh.getText(), selectRow, 3);
                tableDSKhachHang.setValueAt(txtSoDienThoai.getText(), selectRow, 4);
                tableDSKhachHang.setValueAt(jcbGioiTinh.getSelectedItem(), selectRow, 5);
                tableDSKhachHang.setValueAt(txtEmail.getText(), selectRow, 6);
                JOptionPane.showMessageDialog(this, "C???p nh???t kh??ch h??ng th??nh c??ng");
                xoaTrang();
            }else{
                JOptionPane.showMessageDialog(this, "C???p nh???t kh??ch h??ng th???t b???i");
            }
        }
    }//GEN-LAST:event_btnSuaKhachHangActionPerformed

    private void tableDSKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSKhachHangMouseClicked
        // TODO add your handling code here:
        selectRow = tableDSKhachHang.getSelectedRow();
        if (selectRow != -1) {
            loadDataToTxtField(list.get(selectRow));
        }
    }//GEN-LAST:event_tableDSKhachHangMouseClicked

    private void btnXoaTrangFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangFormActionPerformed
        xoaTrang();
    }//GEN-LAST:event_btnXoaTrangFormActionPerformed

    private void btnXoaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhachHangActionPerformed
        selectRow = tableDSKhachHang.getSelectedRow();
        if(selectRow >= 0){
            int maKhachHang = list.get(selectRow).getMaKhachHang();
            if(khachhangdao.deleteKhachHang(maKhachHang)){
                model.removeRow(selectRow);
                JOptionPane.showMessageDialog(this, "X??a kh??ch h??ng th??nh c??ng");
            }else{
                JOptionPane.showMessageDialog(this, "X??a kh??ch h??ng th???t b???i");
            }
        }
    }//GEN-LAST:event_btnXoaKhachHangActionPerformed

    private void txtNgaySinhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgaySinhFocusGained
        txtNgaySinh.setText("");
    }//GEN-LAST:event_txtNgaySinhFocusGained

    private void txtNgaySinhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNgaySinhFocusLost

    }//GEN-LAST:event_txtNgaySinhFocusLost

    private void loadDataToTxtField(KhachHang s) {
        txtHoTen.setText(s.getHoTen());
        txtDiaChi.setText(s.getDiaChi());
        SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
        txtNgaySinh.setText(sm.format(s.getNgaySinh()));
        txtEmail.setText(s.getEmail());
        txtSoDienThoai.setText(s.getSoDienThoai());
        txtTaiKhoan.setText(s.getTaiKhoan().getTenDangNhap());
        jPasswordField1.setText(s.getTaiKhoan().getMatKhau());
        jcbGioiTinh.setSelectedItem(s.getGioiTinh());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaKhachHang;
    private javax.swing.JButton btnThemKhachHang;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaKhachHang;
    private javax.swing.JButton btnXoaTrangForm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbGioiTinh;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableDSKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void xoaTrang() {
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtNgaySinh.setText("");
        txtEmail.setText("");
        txtSoDienThoai.setText("");
        txtTaiKhoan.setText("");
        jPasswordField1.setText("");
        jcbGioiTinh.setSelectedItem(null);
    }
}
