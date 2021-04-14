/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.HangHoa;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.HangHoaService;

/**
 *
 * @author 84327
 */
public class ChiTietHangHoa extends javax.swing.JFrame {
    HangHoaService hangHoaService;
    DefaultTableModel defaulttableModel;
    /**
     * Creates new form ChiTietHangHoa
     */
    public void setTable(List<HangHoa> hhs){
        for(HangHoa hh : hhs){
            defaulttableModel.addRow(new Object[]{hh.getMaHang(),hh.getTenMatHang(),hh.getNamSanXuat(),hh.getDonGian(),hh.getSoLuong()});
        }
    }
    public ChiTietHangHoa() {
        initComponents();
        hangHoaService = new HangHoaService();
        defaulttableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableHH.setModel(defaulttableModel);
        defaulttableModel.addColumn("Mã Hàng");
        defaulttableModel.addColumn("Tên Mặt Hàng");
        defaulttableModel.addColumn("Năm sản xuất");
        defaulttableModel.addColumn("Đơn giá");
        defaulttableModel.addColumn("Số Lượng");
        setTable(hangHoaService.getALLHangHoa());
        
        
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMH = new javax.swing.JTextField();
        jTextFieldTen = new javax.swing.JTextField();
        jTextFieldNam = new javax.swing.JTextField();
        jTextFieldDG = new javax.swing.JTextField();
        jTextFieldSL = new javax.swing.JTextField();
        jButtonTim = new javax.swing.JButton();
        jTextFieldTim = new javax.swing.JTextField();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHH = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Hang_Hoa"); // NOI18N

        jLabel1.setText("Ma_Hang");

        jLabel2.setText("Ten_Hang");

        jLabel3.setText("Nam_SX");

        jLabel4.setText("Don_Gia");

        jLabel5.setText("So_Luong");

        jButtonTim.setText("Tìm kiếm");
        jButtonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimActionPerformed(evt);
            }
        });

        jButtonThem.setText("Thêm");

        jButtonSua.setText("Sửa");

        jButtonXoa.setText("Xóa");

        jButtonThoat.setText("Thoát");

        jTableHH.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableHH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTim, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jTextFieldMH)
                    .addComponent(jTextFieldTen)
                    .addComponent(jTextFieldNam)
                    .addComponent(jTextFieldDG)
                    .addComponent(jTextFieldSL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTim)
                    .addComponent(jTextFieldTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThoat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHHMouseClicked
        int row = jTableHH.getSelectedRow();
        String MH = (String) jTableHH.getValueAt(row, 0);
        String Ten = (String) jTableHH.getValueAt(row, 1);
        String Nam = (String) jTableHH.getValueAt(row, 2);
        String DonGia = (String) jTableHH.getValueAt(row, 3);
        String SoLuong = (String) jTableHH.getValueAt(row, 4);
        jTextFieldMH.setText(MH);
        jTextFieldTen.setText(Ten);
        jTextFieldNam.setText(Nam);
        jTextFieldDG.setText(DonGia);
        jTextFieldSL.setText(SoLuong);
    }//GEN-LAST:event_jTableHHMouseClicked

    private void jButtonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimActionPerformed
        String tenMH;
        tenMH = jTextFieldTim.getText();
        HangHoa hh = new HangHoa();
        hh = hangHoaService.getHangHoa(tenMH);
        jTextFieldMH.setText(hh.getMaHang());
        jTextFieldTen.setText(hh.getTenMatHang());
        jTextFieldNam.setText(hh.getNamSanXuat());
        jTextFieldDG.setText(hh.getDonGian());
        jTextFieldSL.setText(hh.getSoLuong());
        //new TimKiem().setVisible(true);
    }//GEN-LAST:event_jButtonTimActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonTim;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableHH;
    private javax.swing.JTextField jTextFieldDG;
    private javax.swing.JTextField jTextFieldMH;
    private javax.swing.JTextField jTextFieldNam;
    private javax.swing.JTextField jTextFieldSL;
    private javax.swing.JTextField jTextFieldTen;
    private javax.swing.JTextField jTextFieldTim;
    // End of variables declaration//GEN-END:variables
}
