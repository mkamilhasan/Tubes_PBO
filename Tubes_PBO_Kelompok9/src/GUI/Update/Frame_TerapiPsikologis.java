/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Update;

import Database.DB_Terapi_Psikologis;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Frame_TerapiPsikologis extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Terapi_Psikologis
     */
    public Frame_TerapiPsikologis() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_KodeTerapi = new javax.swing.JTextField();
        jTextField2_NamaTerapi = new javax.swing.JTextField();
        jTextField3_Deskripsi = new javax.swing.JTextField();
        jTextField4_KodeDokter = new javax.swing.JTextField();
        jButton1_Back = new javax.swing.JButton();
        jButton3_Update = new javax.swing.JButton();
        jButton4_Add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1_reset = new javax.swing.JButton();
        jTextField4_BiayaTerapi = new javax.swing.JTextField();
        jButton2_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Terapi Psikologis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Terapi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Terapi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deskripsi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kode Dokter");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Biaya Terapi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jTextField1_KodeTerapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_KodeTerapiActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_KodeTerapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 510, -1));
        getContentPane().add(jTextField2_NamaTerapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 510, -1));
        getContentPane().add(jTextField3_Deskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 510, 90));
        getContentPane().add(jTextField4_KodeDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 510, -1));

        jButton1_Back.setBackground(new java.awt.Color(153, 153, 0));
        jButton1_Back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1_Back.setText("Back");
        jButton1_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_BackMouseClicked(evt);
            }
        });
        getContentPane().add(jButton1_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 104, -1));

        jButton3_Update.setBackground(new java.awt.Color(51, 255, 255));
        jButton3_Update.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3_Update.setText("update");
        jButton3_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3_UpdateMouseClicked(evt);
            }
        });
        getContentPane().add(jButton3_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 124, -1));

        jButton4_Add.setBackground(new java.awt.Color(51, 255, 255));
        jButton4_Add.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4_Add.setText("add");
        jButton4_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_AddMouseClicked(evt);
            }
        });
        getContentPane().add(jButton4_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 115, -1));

        jPanel1.setBackground(new java.awt.Color(37, 41, 88));

        jButton1_reset.setText("reset");

        jButton2_Delete.setBackground(new java.awt.Color(255, 51, 51));
        jButton2_Delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2_Delete.setText("Delete");
        jButton2_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_DeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 216, Short.MAX_VALUE)
                .addComponent(jTextField4_BiayaTerapi, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton1_reset)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(jTextField4_BiayaTerapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_reset)
                    .addComponent(jButton2_Delete))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_UpdateMouseClicked
        // TODO add your handling code here:
        DB_Terapi_Psikologis farmasi = new DB_Terapi_Psikologis(
                jTextField1_KodeTerapi.getText(), 
                jTextField2_NamaTerapi.getText(), 
                jTextField3_Deskripsi.getText(), 
                jTextField4_KodeDokter.getText(), 
                "Terapi Kimia", 
                "Demam", 
                "Panas Demam"
        );
        farmasi.update();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
    }//GEN-LAST:event_jButton3_UpdateMouseClicked

    private void jTextField1_KodeTerapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_KodeTerapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_KodeTerapiActionPerformed

    private void jButton1_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_BackMouseClicked
        // TODO add your handling code here:
        Frame_Home jF = new Frame_Home();
        jF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1_BackMouseClicked

    private void jButton4_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_AddMouseClicked
        // TODO add your handling code here:
        DB_Terapi_Psikologis farmasi = new DB_Terapi_Psikologis(
                jTextField1_KodeTerapi.getText(), 
                jTextField2_NamaTerapi.getText(), 
                jTextField3_Deskripsi.getText(), 
                jTextField4_KodeDokter.getText(), 
                "Terapi Kimia", 
                "Demam", 
                "Panas Demam"
        );
        farmasi.insert();
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan..");
    }//GEN-LAST:event_jButton4_AddMouseClicked

    private void jButton2_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_DeleteMouseClicked
        // TODO add your handling code here:
        DB_Terapi_Psikologis farmasi = new DB_Terapi_Psikologis(
                jTextField1_KodeTerapi.getText(), 
                jTextField2_NamaTerapi.getText(), 
                jTextField3_Deskripsi.getText(), 
                jTextField4_KodeDokter.getText(), 
                "Terapi Kimia", 
                "Demam", 
                "Panas Demam"
        );
        farmasi.delete();
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
    }//GEN-LAST:event_jButton2_DeleteMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_TerapiPsikologis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_TerapiPsikologis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_TerapiPsikologis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_TerapiPsikologis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_TerapiPsikologis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Back;
    private javax.swing.JButton jButton1_reset;
    private javax.swing.JButton jButton2_Delete;
    private javax.swing.JButton jButton3_Update;
    private javax.swing.JButton jButton4_Add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_KodeTerapi;
    private javax.swing.JTextField jTextField2_NamaTerapi;
    private javax.swing.JTextField jTextField3_Deskripsi;
    private javax.swing.JTextField jTextField4_BiayaTerapi;
    private javax.swing.JTextField jTextField4_KodeDokter;
    // End of variables declaration//GEN-END:variables
}
