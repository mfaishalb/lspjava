/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Dimension;

/**
 *
 * @author Aries
 */
public class Main1 extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    DataSiswa ds =new DataSiswa();
    DataGuru dg =new DataGuru();
    Datakelas dk =new Datakelas();
    info inf =new info();
    spp sp =new spp();
    Pengaturan pe =new Pengaturan();
    laporanSPP lp = new laporanSPP();
    laporanSPP1 lpp = new laporanSPP1();
    laporanSPP11 lps = new laporanSPP11();
    
    
    public Main1() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baground1 = new Komponen.baground();
        Cetak = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Pembayaran SPP");
        setResizable(false);

        Cetak.setBorder(new javax.swing.border.MatteBorder(null));
        Cetak.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu2.setText("Data Master ||");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Users-Student-icon.png"))); // NOI18N
        jMenuItem1.setText("Data Siswa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Teacher-icon.png"))); // NOI18N
        jMenuItem2.setText("Data Guru");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/folder-documents-icon.png"))); // NOI18N
        jMenuItem3.setText("Data Kelas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        Cetak.add(jMenu2);

        jMenu3.setText("Pembayaran ||");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Actions-view-list-details-icon.png"))); // NOI18N
        jMenuItem4.setText("Pembayaran SPP");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        Cetak.add(jMenu3);

        jMenu4.setText("Cetak ||");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printer-icon.png"))); // NOI18N
        jMenuItem10.setText("Laporan Per Siswa");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printer-icon.png"))); // NOI18N
        jMenuItem5.setText("Laporan Per Kelas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printer-icon.png"))); // NOI18N
        jMenuItem9.setText("Laporan Seluruh");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        Cetak.add(jMenu4);

        jMenu5.setText("Informasi ||");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Science-School-icon.png"))); // NOI18N
        jMenuItem6.setText("SMK Hogwarts Jakarta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        Cetak.add(jMenu5);

        jMenu1.setText("Pengaturan");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Actions-configure-toolbars-icon.png"))); // NOI18N
        jMenuItem8.setText("Pengaturan Akun");
        jMenuItem8.setEnabled(false);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout-icon.png"))); // NOI18N
        jMenuItem7.setText("Keluar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        Cetak.add(jMenu1);

        setJMenuBar(Cetak);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(baground1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(baground1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        login l = new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        baground1.add(ds);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = ds.getSize();
        ds.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        dg.dispose();
        dk.dispose();lp.dispose();
        inf.dispose();
        sp.dispose();
        pe.dispose();lpp.dispose();
        ds.setVisible(true);
        lps.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        baground1.add(dg);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = dg.getSize();
        dg.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lpp.dispose();
        dk.dispose();lp.dispose();
        inf.dispose();
        sp.dispose();pe.dispose();
        dg.setVisible(true);lps.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        baground1.add(dk);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = dk.getSize();
        dk.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lp.dispose();
        dg.dispose();lpp.dispose();
        inf.dispose();
        sp.dispose();pe.dispose();
        dk.setVisible(true);lps.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        baground1.add(sp);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = sp.getSize();
        sp.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lpp.dispose();
        dk.dispose();lps.dispose();
        inf.dispose();lp.dispose();
        dg.dispose();pe.dispose();
        sp.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
       
        baground1.add(inf);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = inf.getSize();
        inf.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lps.dispose();
        dk.dispose();lpp.dispose();
        sp.dispose();pe.dispose();
        dg.dispose();
        lp.dispose();
        inf.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        baground1.add(lp);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = lp.getSize();
        lp.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lpp.dispose();
        dk.dispose();pe.dispose();
        sp.dispose();lps.dispose();
        dg.dispose();
        inf.dispose();
        lp.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        baground1.add(pe);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = pe.getSize();
        pe.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lp.dispose();
        dk.dispose();lpp.dispose();
        sp.dispose();lps.dispose();
        dg.dispose();
        inf.dispose();
        pe.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        baground1.add(lpp);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = lpp.getSize();
        lpp.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lp.dispose();
        dk.dispose();lpp.setVisible(true);
        sp.dispose();lps.dispose();
        dg.dispose();
        inf.dispose();
        pe.dispose();
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        baground1.add(lps);
        Dimension parentSize = baground1.getSize();
        Dimension childSize = lps.getSize();
        lps.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ds.dispose();lp.dispose();
        dk.dispose();lpp.dispose();
        sp.dispose();lps.setVisible(true);
        dg.dispose();
        inf.dispose();
        pe.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Cetak;
    private Komponen.baground baground1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
