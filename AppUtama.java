/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_mvc_unsika;


import java.awt.Frame;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;
import Sintia.View.viewPelangganInternal;
import Sintia.View.viewBarang;
import Sintia.View.viewTransaksi;

/**
 *
 * @author ACER
 */

public class AppUtama extends javax.swing.JFrame {

    /**
     * Creates new form AppUtama
     */
    public AppUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        DekstopUtama = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuMasterPelanggan = new javax.swing.JMenuItem();
        menuMasterBarang = new javax.swing.JMenuItem();
        menuMasterPemasok = new javax.swing.JMenuItem();
        menuMasterUser = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuTransaksiPOS = new javax.swing.JMenuItem();

        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Maseter Barang");
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DekstopUtama.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout DekstopUtamaLayout = new javax.swing.GroupLayout(DekstopUtama);
        DekstopUtama.setLayout(DekstopUtamaLayout);
        DekstopUtamaLayout.setHorizontalGroup(
            DekstopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        DekstopUtamaLayout.setVerticalGroup(
            DekstopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Program Point of Sales");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Master");

        menuMasterPelanggan.setText("Master Pelanggan");
        menuMasterPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasterPelangganActionPerformed(evt);
            }
        });
        jMenu2.add(menuMasterPelanggan);

        menuMasterBarang.setText("Master Barang");
        menuMasterBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasterBarangActionPerformed(evt);
            }
        });
        jMenu2.add(menuMasterBarang);

        menuMasterPemasok.setText("Master Pemasok");
        menuMasterPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasterPemasokActionPerformed(evt);
            }
        });
        jMenu2.add(menuMasterPemasok);

        menuMasterUser.setText("Master User");
        menuMasterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasterUserActionPerformed(evt);
            }
        });
        jMenu2.add(menuMasterUser);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi Barang");

        menuTransaksiPOS.setText("Transaksi (POS)");
        menuTransaksiPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiPOSActionPerformed(evt);
            }
        });
        jMenu3.add(menuTransaksiPOS);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DekstopUtama)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DekstopUtama)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMasterPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasterPelangganActionPerformed
        // TODO add your handling code here:
        viewPelangganInternal pelanggan = new viewPelangganInternal();
        this.DekstopUtama.add(pelanggan);
        pelanggan.show();
        
    }//GEN-LAST:event_menuMasterPelangganActionPerformed

    private void menuMasterBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasterBarangActionPerformed
        // TODO add your handling code here:
        viewBarang barang = new viewBarang();
        this.DekstopUtama.add(barang);
        barang.show();
    }//GEN-LAST:event_menuMasterBarangActionPerformed

    private void menuTransaksiPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiPOSActionPerformed
        // TODO add your handling code here:
        viewTransaksi vT = new  viewTransaksi();
        this.DekstopUtama.add(vT);
        vT.show();
    }//GEN-LAST:event_menuTransaksiPOSActionPerformed

    private void menuMasterPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasterPemasokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMasterPemasokActionPerformed

    private void menuMasterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasterUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMasterUserActionPerformed

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
            java.util.logging.Logger.getLogger(AppUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DekstopUtama;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuMasterBarang;
    private javax.swing.JMenuItem menuMasterPelanggan;
    private javax.swing.JMenuItem menuMasterPemasok;
    private javax.swing.JMenuItem menuMasterUser;
    private javax.swing.JMenuItem menuTransaksiPOS;
    // End of variables declaration//GEN-END:variables
}
