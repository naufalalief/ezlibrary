/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepus;

/**
 *
 * @author HP
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        jLabel2.setText(main.getnama());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        daftarbuku = new javax.swing.JLabel();
        daftarpengembalian = new javax.swing.JLabel();
        daftarpeminjaman = new javax.swing.JLabel();
        tambahmember = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OPERATOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, 60));

        daftarbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarbukuMouseClicked(evt);
            }
        });
        getContentPane().add(daftarbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 20));

        daftarpengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarpengembalianMouseClicked(evt);
            }
        });
        getContentPane().add(daftarpengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 300, 20));

        daftarpeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarpeminjamanMouseClicked(evt);
            }
        });
        getContentPane().add(daftarpeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 280, 20));

        tambahmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahmemberMouseClicked(evt);
            }
        });
        getContentPane().add(tambahmember, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void daftarbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarbukuMouseClicked
        // TODO add your handling code here:
        new daftarbuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarbukuMouseClicked

    private void daftarpengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarpengembalianMouseClicked
        new daftarpengembalian().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarpengembalianMouseClicked

    private void daftarpeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarpeminjamanMouseClicked
        // TODO add your handling code here:
        new daftarpeminjaman().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarpeminjamanMouseClicked

    private void tambahmemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahmemberMouseClicked
        // TODO add your handling code here:
        new daftarmember().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahmemberMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel daftarbuku;
    private javax.swing.JLabel daftarpeminjaman;
    private javax.swing.JLabel daftarpengembalian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel tambahmember;
    // End of variables declaration//GEN-END:variables
}