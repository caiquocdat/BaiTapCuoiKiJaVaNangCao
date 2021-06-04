/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.ThongTinNhanVien;
import model.ThongTinNhanVienDAO;

/**
 *
 * @author PhongVu
 */
public class FrThongTinNhanVien extends javax.swing.JFrame {
    
    ThongTinNhanVienDAO dao = new ThongTinNhanVienDAO();
    /**
     * Creates new form FrThongTinCaNhan
     */
     public void fillDatabase() {
        String [] arr={"MaNV","TenNV","NgaySinh","GioiTinh"};
        
        DefaultTableModel model = (DefaultTableModel) jTable_thongTinNhanVien.getModel();
        
        model.setRowCount(0);
        for (ThongTinNhanVien ee : dao.getAllNV()) {
            Object dataRow[] = new Object[7];
            dataRow[0] = ee.getMaNV();
            dataRow[1] = ee.getTenNV();
            dataRow[2] = ee.getNgaySinh();
            dataRow[3] = ee.getGioiTinh();
            model.addRow(dataRow);
        }
        
        
    }
    public FrThongTinNhanVien() {
        initComponents();
        fillDatabase();
        //Dùng để chỉ chọn được một hàng duy nhất khi kích chuột vào jtable
        jTable_thongTinNhanVien.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_thongTinNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_maNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tenNhanVien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_ngaySinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_gioiTinh = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_dong1 = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        txt_timKiem = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_thongTinNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "TenNV", "NgaySinh", "GioiTinh"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        jTable_thongTinNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_thongTinNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_thongTinNhanVien);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Tên Nhân Viên");

        jLabel4.setText("Ngày Sinh");

        jLabel5.setText("Giới Tính");

        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.png"))); // NOI18N
        btn_them.setText("Nhập mới");
        btn_them.setActionCommand("");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh (1).png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setActionCommand("");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setActionCommand("");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_dong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        btn_dong1.setText("Đóng");
        btn_dong1.setActionCommand("");
        btn_dong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dong1ActionPerformed(evt);
            }
        });

        btn_luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btn_luu.setText("Thêm");
        btn_luu.setActionCommand("");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        txt_timKiem.setText("Nhập MaNV");
        txt_timKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_timKiemMouseClicked(evt);
            }
        });
        txt_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timKiemActionPerformed(evt);
            }
        });

        btn_timKiem.setText("Tìm kiếm");
        btn_timKiem.setActionCommand("");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        jLabel9.setText("Tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txt_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(txt_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ngaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_gioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(btn_them)
                            .addGap(18, 18, 18)
                            .addComponent(btn_luu)
                            .addGap(18, 18, 18)
                            .addComponent(btn_sua)
                            .addGap(18, 18, 18)
                            .addComponent(btn_xoa)
                            .addGap(18, 18, 18)
                            .addComponent(btn_dong1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_timKiem))))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luu)
                    .addComponent(btn_them)
                    .addComponent(btn_xoa)
                    .addComponent(btn_sua)
                    .addComponent(btn_dong1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void resetForm() {
        txt_maNhanVien.setText("");
        txt_tenNhanVien.setText("");
        txt_ngaySinh.setText("");
        txt_gioiTinh.setText("");
    }
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        resetForm();
       
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
           int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            if (validateForm()) {
                try {
                    ThongTinNhanVien eeNew = getModel();
                    if (dao.update(eeNew) > 0) {
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        fillDatabase();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.toString());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin!!!");
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
         int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
        if (txt_maNhanVien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã Nhân Viên");
        } else {
            try {
                if (txt_maNhanVien.getText().isEmpty() == false) {
                    if(dao.delete(txt_maNhanVien.getText())>0)
                    {
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                    }
                }
                fillDatabase();
                
                resetForm();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.toString());
            }}
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_dong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dong1ActionPerformed
        // TODO add your handling code here:
         FrTrangChu frTrangChu= new FrTrangChu();
       frTrangChu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_dong1ActionPerformed
    public boolean validateForm() {
        if (txt_maNhanVien.getText().isEmpty() || txt_tenNhanVien.getText().isEmpty() || txt_ngaySinh.getText().isEmpty() || txt_gioiTinh.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public ThongTinNhanVien getModel() {
        ThongTinNhanVien ee = new ThongTinNhanVien();
        ee.setMaNV(txt_maNhanVien.getText());
        ee.setTenNV(txt_tenNhanVien.getText());
        ee.setNgaySinh(txt_ngaySinh.getText());
        ee.setGioiTinh(txt_gioiTinh.getText());
        return ee;
    }
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
          int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Thêm", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            if (validateForm()) {
                ThongTinNhanVien ee = getModel();
                try {
                    if (dao.add(ee) > 0) {
                        fillDatabase();
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        resetForm();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.toString());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin!!!");
            }
        }
        
    }//GEN-LAST:event_btn_luuActionPerformed

    private void txt_timKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_timKiemMouseClicked
        // TODO add your handling code here:
        txt_timKiem.setText("");
    }//GEN-LAST:event_txt_timKiemMouseClicked

    private void txt_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timKiemActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        // TODO add your handling code here:
        if (txt_timKiem.getText().isEmpty()||txt_timKiem.getText().equals("Nhập MaNV")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập MSV");
        } else {
            DefaultTableModel model = (DefaultTableModel) jTable_thongTinNhanVien.getModel();
            model.setRowCount(0);
            for (ThongTinNhanVien ee : dao.getAllNV()) {
                if ((ee.getMaNV().trim()).contains(txt_timKiem.getText())) {
                    
                    Object dataRow[] = new Object[7];
                    dataRow[0] = ee.getMaNV();
                    dataRow[1] = ee.getTenNV();
                    dataRow[2] = ee.getNgaySinh();
                    dataRow[3] = ee.getGioiTinh();
                    model.addRow(dataRow);

                }

            }
            txt_timKiem.setText("");
        }    
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void jTable_thongTinNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_thongTinNhanVienMouseClicked
        // TODO add your handling code here:
         int i = jTable_thongTinNhanVien.getSelectedRow();
        TableModel model = jTable_thongTinNhanVien.getModel();
        txt_maNhanVien.setText(model.getValueAt(i, 0).toString());
        txt_tenNhanVien.setText(model.getValueAt(i, 1).toString());
        txt_ngaySinh.setText(model.getValueAt(i, 2).toString());
        txt_gioiTinh.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable_thongTinNhanVienMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrThongTinNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrThongTinNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dong1;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_thongTinNhanVien;
    private javax.swing.JTextField txt_gioiTinh;
    private javax.swing.JTextField txt_maNhanVien;
    private javax.swing.JTextField txt_ngaySinh;
    private javax.swing.JTextField txt_tenNhanVien;
    private javax.swing.JTextField txt_timKiem;
    // End of variables declaration//GEN-END:variables
}