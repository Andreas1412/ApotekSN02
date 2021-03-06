/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrBarang;
import javax.swing.JTable;

/**
 *
 * @author fanny r
 */
public class DaftarBarang extends javax.swing.JFrame {

    /**
     * Creates new form DaftarBarang
     */
    public DaftarBarang() {
        initComponents();

        mengisiCmbParameter();
    }

    private void mengisiCmbParameter() {
        CtrBarang cb = new CtrBarang();
        cmbGol.setModel(cb.getSemuaParGolongan());
        cmbUsia.setModel(cb.getSemuaUsia());
        cmbJnsObat.setModel(cb.getSemuaJenisObat());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupJnsBarang = new javax.swing.ButtonGroup();
        btnGroupBentuk = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        lblMerkBarang = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        txtFilterMerk = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblKode = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        lblMerk = new javax.swing.JLabel();
        txtMerk = new javax.swing.JTextField();
        lblSatuan = new javax.swing.JLabel();
        cmbSatuan = new javax.swing.JComboBox();
        lblJenis = new javax.swing.JLabel();
        rbNonObat = new javax.swing.JRadioButton();
        btnGroupJnsBarang.add(rbNonObat);
        rbObat = new javax.swing.JRadioButton();
        btnGroupJnsBarang.add(rbObat);
        lblGol = new javax.swing.JLabel();
        cmbGol = new javax.swing.JComboBox();
        lblUsia = new javax.swing.JLabel();
        cmbUsia = new javax.swing.JComboBox();
        lblBentuk = new javax.swing.JLabel();
        rbCair = new javax.swing.JRadioButton();
        btnGroupBentuk.add(rbCair);
        rbNonCair = new javax.swing.JRadioButton();
        btnGroupBentuk.add(rbNonCair);
        lblJnsObat = new javax.swing.JLabel();
        cmbJnsObat = new javax.swing.JComboBox();
        lblHarga = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        lblMerkBarang.setText("Merk Barang :");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblKode.setText("Kode :");

        lblMerk.setText("Merk :");

        lblSatuan.setText("Satuan:");

        cmbSatuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tablet", "Box", "Sachet", "Sctrip", "Botol" }));

        lblJenis.setText("Jenis Barang :");

        rbNonObat.setText("Non Obat");

        rbObat.setText("Obat");

        lblGol.setText("Golongan :");

        cmbGol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUsia.setText("Usia :");

        cmbUsia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBentuk.setText("Bentuk :");

        rbCair.setText("Cair");

        rbNonCair.setText("Non Cair");

        lblJnsObat.setText("Jenis Obat :");

        cmbJnsObat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblHarga.setText("Harga :");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");

        btnUbah.setText("Ubah");

        btnBatal.setText("Batal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMerk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSatuan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblJenis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGol, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBentuk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblJnsObat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHarga, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnTambah)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnUbah)
                        .addGap(18, 18, 18))
                    .addComponent(cmbJnsObat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbUsia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbGol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSatuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKode)
                            .addComponent(txtMerk, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rbObat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbNonObat))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rbCair)
                            .addGap(18, 18, 18)
                            .addComponent(rbNonCair)))
                    .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14)
                .addComponent(btnBatal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMerk)
                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSatuan)
                    .addComponent(cmbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenis)
                    .addComponent(rbNonObat)
                    .addComponent(rbObat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGol)
                    .addComponent(cmbGol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsia)
                    .addComponent(cmbUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBentuk)
                    .addComponent(rbCair)
                    .addComponent(rbNonCair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJnsObat)
                    .addComponent(cmbJnsObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHarga)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnBatal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMerkBarang)
                        .addGap(18, 18, 18)
                        .addComponent(txtFilterMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMerkBarang)
                    .addComponent(txtFilterMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
JTable tbl = (JTable) evt.getSource();
int baris = tbl.getSelectedRow();
txtKode.setText(tbl.getValueAt(baris,0).toString());
txtMerk.setText(tbl.getValueAt(baris,1).toString());
cmbSatuan.setSelectedItem(tbl.getValueAt(baris,2).toString());
String JnsBarang = tbl.getValueAt(baris,3).toString();

if (JnsBarang.equals("Obat")){
    rbObat.setSelected(true);
}else if (JnsBarang.equals("Non Obat")){
    rbNonObat.setSelected(true);
}

cmbGol.setSelectedItem(tbl.getValueAt(baris,4).toString());
cmbUsia.setSelectedItem(tbl.getValueAt(baris,4).toString());

String JnsBentuk = tbl.getValueAt(baris,6).toString();

if (JnsBarang.equals("Cair")){
    rbCair.setSelected(true);
}else if (JnsBarang.equals("Non Cair")){
    rbNonCair.setSelected(true);
}
cmbJnsObat.setSelectedItem(tbl.getValueAt(baris,7).toString());
txtHarga.setText(tbl.getValueAt(baris,8).toString());
    }//GEN-LAST:event_tblBarangMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String merkBarang;

        CtrBarang cb = new CtrBarang();
        tblBarang.setModel(cb.getCariBarang(txtFilterMerk.getText()));
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        CtrBarang cb = new CtrBarang();
        String merk = txtMerk.getText();
        String satuan = cmbSatuan.getSelectedItem().toString();
        String namaGolongan = cmbGol.getSelectedItem().toString();
        String namaUsia = cmbUsia.getSelectedItem().toString();
        String namaJenis = cmbJnsObat.getSelectedItem().toString();
        double harga = Double.parseDouble(txtHarga.getText());
        int kodeGol = cb.getParGolongan(namaGolongan);
        int kodeUsia = cb.getParUsia(namaUsia);
        int kodeJenisObat = cb.getParJnsObat(namaJenis);
        
        cb.setMerk(merk);
        cb.setUom(satuan);
        cb.getParam().setKodeJenis(ambilPilihanObat());
        cb.setKodeGolongan(kodeGol);
        cb.setKodeUsia(kodeUsia);
        cb.getParam().setKodeBentuk(ambilPilihanBentuk());
        cb.setKodeJenisObat(kodeJenisObat);
        cb.setHargaJual(harga);
        cb.tambahBarang();
        //refresh
        CtrBarang cb2 = new CtrBarang();
        tblBarang.setModel(cb2.getSemuaBarang());
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DaftarBarang db = new DaftarBarang();
                db.setTitle("list Daftar Barang");
                db.setVisible(true);
                CtrBarang cb = new CtrBarang();
                db.tblBarang.setModel(cb.getSemuaBarang());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.ButtonGroup btnGroupBentuk;
    private javax.swing.ButtonGroup btnGroupJnsBarang;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox cmbGol;
    private javax.swing.JComboBox cmbJnsObat;
    private javax.swing.JComboBox cmbSatuan;
    private javax.swing.JComboBox cmbUsia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBentuk;
    private javax.swing.JLabel lblGol;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblJnsObat;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblMerk;
    private javax.swing.JLabel lblMerkBarang;
    private javax.swing.JLabel lblSatuan;
    private javax.swing.JLabel lblUsia;
    private javax.swing.JRadioButton rbCair;
    private javax.swing.JRadioButton rbNonCair;
    private javax.swing.JRadioButton rbNonObat;
    private javax.swing.JRadioButton rbObat;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtFilterMerk;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMerk;
    // End of variables declaration//GEN-END:variables

    private int ambilPilihanObat() {
        int hasil = 1;
        if (rbObat.isSelected() == true) {
            hasil = 1;
        } else if (rbNonObat.isSelected() == true) {
            hasil = 2;
        }
        return hasil;
    }

    private int ambilPilihanBentuk() {
        int hasil = 1;
        if (rbCair.isSelected() == true) {
            hasil = 1;
        } else if (rbNonCair.isSelected() == true) {
            hasil = 2;
        }
        return hasil;
    }

}
