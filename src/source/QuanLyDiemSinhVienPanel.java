package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class QuanLyDiemSinhVienPanel extends javax.swing.JPanel {

    /** Creates new form QuanLySinhVienPanel */
    public QuanLyDiemSinhVienPanel() {
        initComponents();
        loadThongTin();
    }
   
    DefaultTableModel tablemodel = new DefaultTableModel();
    public String strConnection = "jdbc:sqlserver://DESKTOP-4SSFG6O\\SQLEXPRESS:1433;Databasename=BaiTapLon;user=sa;password=sa";
    int max = 0;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtMaSinhVien = new javax.swing.JTextField();
        txtTiengAnh = new javax.swing.JTextField();
        txtTinHoc = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnTimKiem = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSinhVienDiem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaSinhVienTimKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lb_DiemTrungBinh = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản lý điểm");

        jLabel3.setText("Mã sinh viên");

        jLabel4.setText("Họ tên");

        jLabel5.setText("TIếng Anh");

        jLabel6.setText("Tin học");

        jLabel7.setText("GDTC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTiengAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtTinHoc)
                            .addComponent(txtGDTC))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon-16.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new-icon-16.png"))); // NOI18N
        btnNhapMoi.setText("Add new");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-document-edit-icon-16.png"))); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        tableSinhVienDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSinhVienDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSinhVienDiemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSinhVienDiem);

        jLabel2.setText("Mã sinh viên");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Điểm TB");

        lb_DiemTrungBinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_DiemTrungBinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_DiemTrungBinh.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_DiemTrungBinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(lb_DiemTrungBinh)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)))
                        .addGap(38, 38, 38)
                        .addComponent(txtMaSinhVienTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnTimKiem))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnNhapMoi)
                .addGap(57, 57, 57)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(62, 62, 62)
                .addComponent(btnCapNhat)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem)
                        .addComponent(txtMaSinhVienTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnNhapMoi)
                    .addComponent(btnSave)
                    .addComponent(btnCapNhat))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
    }// </editor-fold>//GEN-END:initComponents
    Object []rows = new Object[6];
    
    void loadThongTin() {
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            tablemodel = new DefaultTableModel();
            String []titles = {"Số thứ tự", "Mã số sinh viên", "Họ tên", "Tiếng Anh" , "Tin Học", "Giáo dục thể chất"};
            tablemodel.setColumnIdentifiers(titles);
            ResultSet rs = s.executeQuery("select Ma,BangDiem.MaSinhVien,HoTen, TiengAnh, TinHoc, GDTC\n" +
"from BangDiem\n" +
"left join SinhVien on BangDiem.MaSinhVien = SinhVien.MaSinhVien");
           // Statement ssv = con.createStatement();
           // ResultSet rsSinhVien = ssv.executeQuery("select * from SinhVien where MaSinhVien = '" + rs.getString(2));
            tableSinhVienDiem.setModel(tablemodel);  
            while (rs.next()) {             
                rows[0] = rs.getInt("Ma");
                rows[1] = rs.getString("MaSinhVien");
                rows[2] = rs.getString("HoTen");
                rows[3] = rs.getFloat("TiengAnh");
                rows[4] = rs.getFloat("TinHoc");
                rows[5] = rs.getFloat("GDTC");              
                tablemodel.addRow(rows);
            }
             con.close();                                           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void tinhDiemTrungBinh() {
        float dtb = 0;
            dtb = (Float.parseFloat(txtTiengAnh.getText()) + Float.parseFloat(txtTinHoc.getText()) + Float.parseFloat(txtGDTC.getText())) / 3;
            lb_DiemTrungBinh.setText(dtb + "");
    }
    
    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            s.executeUpdate("update BangDiem set TiengAnh = " + Float.parseFloat(txtTiengAnh.getText()) + ", TinHoc = "  
                    + Float.parseFloat(txtTinHoc.getText()) + ", GDTC = " + Float.parseFloat(txtGDTC.getText()) + " where MaSinhVien = '" + txtMaSinhVien.getText() + "'");
            con.close();
            tinhDiemTrungBinh();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        loadThongTin();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        // TODO add your handling code here:
        txtGDTC.setText("");
        txtHoTen.setText("");
        txtMaSinhVien.setText("");
        txtTiengAnh.setText("");
        txtTinHoc.setText("");
        lb_DiemTrungBinh.setText("");
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void tableSinhVienDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSinhVienDiemMouseClicked
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            int r = tableSinhVienDiem.getSelectedRow();
            Object mssv = tablemodel.getValueAt(r,  1);
            ResultSet rs = s.executeQuery("select Ma,SinhVien.MaSinhVien,HoTen, TiengAnh, TinHoc, GDTC\n" +
"from BangDiem\n" +
"left join SinhVien on BangDiem.MaSinhVien = SinhVien.MaSinhVien\n" +
"where BangDiem.MaSinhVien = '" + mssv + "'");
            System.out.print(mssv + "");
            if  (rs.next()) {
                txtMaSinhVien.setText(rs.getString("MaSinhVien") + "");
                txtHoTen.setText(rs.getString("HoTen") + "");
                txtTiengAnh.setText(rs.getFloat("TiengAnh") + "");
                txtTinHoc.setText(rs.getFloat("TinHoc") + "");
                txtGDTC.setText(rs.getFloat("GDTC") + "");
            } 
            con.close();
            tinhDiemTrungBinh();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tableSinhVienDiemMouseClicked

    public void TimMaSo() {
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select max(Ma) from BangDiem");
            if (rs.next()) {
                max = rs.getInt(1) + 1;
            } else 
                max = 1;
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            s.execute("insert into BangDiem values (" + max + ",'" + txtMaSinhVien.getText() + "'," 
                    + txtTiengAnh.getText() + "," + txtTinHoc.getText() + "," + txtGDTC.getText() + ")");
            con.close();
            JOptionPane.showMessageDialog(this, "Lưu thông tin thành công!!!");
            tinhDiemTrungBinh();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        loadThongTin();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select *\n" +
"from SinhVien\n" +
"left join BangDiem on SinhVien.MaSinhVien = BangDiem.MaSinhVien where SinhVien.MaSinhVien = '"  + txtMaSinhVienTimKiem.getText() + "'");
            if (rs.next()) {
                txtMaSinhVien.setText(rs.getString("MaSinhVien"));
                txtHoTen.setText(rs.getString("HoTen"));
                txtTiengAnh.setText(rs.getFloat("TiengAnh") + "");
                txtTinHoc.setText(rs.getFloat("TinHoc") + "");
                txtGDTC.setText(rs.getFloat("GDTC" )+ ""); 
                float diemtb = (rs.getFloat("TiengAnh") + rs.getFloat("TinHoc") + rs.getFloat("GDTC" )) / 3;
                lb_DiemTrungBinh.setText(diemtb + "");
            } else 
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên " + txtMaSinhVienTimKiem.getText());
            con.close();
            
            TimMaSo();
            tinhDiemTrungBinh();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            Connection con = DriverManager.getConnection(strConnection);
            Statement s = con.createStatement();
            s.executeUpdate("delete from BangDiem where MaSinhVien = '" + txtMaSinhVien.getText() + "'");
            con.close();
            JOptionPane.showMessageDialog(this, "Đã xóa bảng điểm của sinh viên " + txtMaSinhVienTimKiem.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        loadThongTin();
    }//GEN-LAST:event_btnXoaActionPerformed
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lb_DiemTrungBinh;
    private javax.swing.JTable tableSinhVienDiem;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSinhVien;
    private javax.swing.JTextField txtMaSinhVienTimKiem;
    private javax.swing.JTextField txtTiengAnh;
    private javax.swing.JTextField txtTinHoc;
    // End of variables declaration//GEN-END:variables
}