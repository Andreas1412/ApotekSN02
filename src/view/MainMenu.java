/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 200NS
 */
public class MainMenu extends javax.swing.JFrame {
DaftarKaryawan daftarKaryawan;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setTitle("System Apotek G-Inova");
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        Login lg = new Login();
        setVisible(true);
        
        tampilMenu();
    }

    private void tampilMenu(){
        daftarKaryawan= new DaftarKaryawan();
        daftarKaryawan.setVisible(false);
        DesktopUtama.add(daftarKaryawan);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopUtama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miExit = new javax.swing.JMenuItem();
        menuDaftar = new javax.swing.JMenu();
        miKaryawan = new javax.swing.JMenuItem();
        miBarang = new javax.swing.JMenuItem();
        miDistributor = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout DesktopUtamaLayout = new javax.swing.GroupLayout(DesktopUtama);
        DesktopUtama.setLayout(DesktopUtamaLayout);
        DesktopUtamaLayout.setHorizontalGroup(
            DesktopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        DesktopUtamaLayout.setVerticalGroup(
            DesktopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        menuFile.setText("File");
        menuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileActionPerformed(evt);
            }
        });

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFile.add(miExit);

        jMenuBar1.add(menuFile);

        menuDaftar.setText("Daftar");

        miKaryawan.setText("Daftar Karyawan");
        miKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKaryawanActionPerformed(evt);
            }
        });
        menuDaftar.add(miKaryawan);

        miBarang.setText("Daftar Barang");
        menuDaftar.add(miBarang);

        miDistributor.setText("Daftar Distributor");
        menuDaftar.add(miDistributor);

        jMenuBar1.add(menuDaftar);

        menuHelp.setText("Help");

        miAbout.setText("About");
        menuHelp.add(miAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopUtama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopUtama)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKaryawanActionPerformed
     // TODO add your handling code here:
    setTampilanAktif("Karyawan");
    }//GEN-LAST:event_miKaryawanActionPerformed

    private void menuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFileActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this,
        "Apakah anda yakin ingin keluar ?","EXIT",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE)
        == JOptionPane.YES_OPTION){
        System.exit(0);
    }
    }//GEN-LAST:event_miExitActionPerformed
    
    private void setTampilanAktif(String menu){
        daftarKaryawan.setVisible(true);
        
        if (menu == "Karyawan"){
            daftarKaryawan.setVisible(true);
        }
    }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopUtama;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuDaftar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miBarang;
    private javax.swing.JMenuItem miDistributor;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miKaryawan;
    // End of variables declaration//GEN-END:variables
}
