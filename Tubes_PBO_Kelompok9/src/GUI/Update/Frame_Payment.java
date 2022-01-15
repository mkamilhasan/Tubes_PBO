/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Update;

import Database.DB_Payment;
import javax.swing.JOptionPane;

/**
 *
 * @author Zenbook
 */
public class Frame_Payment extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Payment
     */
    public Frame_Payment() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_JumlahTagihan = new javax.swing.JTextField();
        jTextField2_NoPembayaran = new javax.swing.JTextField();
        jTextField3_MetodePembayaran = new javax.swing.JTextField();
        jTextField4_DeskripsiPembayaran = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1_Back = new javax.swing.JButton();
        jButton2_Add = new javax.swing.JButton();
        jButton3_Delete = new javax.swing.JButton();
        jButton4_Update = new javax.swing.JButton();
        jButton1_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Data Payment");

        jPanel1.setBackground(new java.awt.Color(37, 41, 88));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jumlah Tagihan          :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Pembayaran          :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deskripsi Pembayaran :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Metode Pembayaran   :");

        jTextField4_DeskripsiPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_DeskripsiPembayaranActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAYMENT");

        jButton1_Back.setBackground(new java.awt.Color(204, 0, 0));
        jButton1_Back.setText("Back");
        jButton1_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_BackMouseClicked(evt);
            }
        });
        jButton1_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_BackActionPerformed(evt);
            }
        });

        jButton2_Add.setBackground(new java.awt.Color(153, 255, 255));
        jButton2_Add.setText("add");
        jButton2_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_AddMouseClicked(evt);
            }
        });

        jButton3_Delete.setBackground(new java.awt.Color(204, 51, 0));
        jButton3_Delete.setText("delete");
        jButton3_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3_DeleteMouseClicked(evt);
            }
        });

        jButton4_Update.setBackground(new java.awt.Color(153, 255, 153));
        jButton4_Update.setText("update");
        jButton4_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_UpdateMouseClicked(evt);
            }
        });

        jButton1_reset.setBackground(new java.awt.Color(153, 204, 255));
        jButton1_reset.setText("reset");
        jButton1_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(301, 301, 301))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1_Back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2_Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_reset)
                                .addGap(75, 75, 75)
                                .addComponent(jButton3_Delete)
                                .addGap(95, 95, 95)
                                .addComponent(jButton4_Update))
                            .addComponent(jTextField3_MetodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1_JumlahTagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2_NoPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4_DeskripsiPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1_Back)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_JumlahTagihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2_NoPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4_DeskripsiPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField3_MetodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3_Delete)
                                    .addComponent(jButton4_Update)
                                    .addComponent(jButton2_Add)
                                    .addComponent(jButton1_reset))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4_DeskripsiPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_DeskripsiPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_DeskripsiPembayaranActionPerformed

    private void jButton1_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_BackActionPerformed

    private void jButton1_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_BackMouseClicked
        // TODO add your handling code here:
        Frame_Home jF = new Frame_Home();
        jF.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1_BackMouseClicked

    private void jButton2_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_AddMouseClicked
        // TODO add your handling code here:
        DB_Payment payment = new DB_Payment(
                Integer.parseInt(jTextField2_NoPembayaran.getText()), 
                Integer.parseInt(jTextField1_JumlahTagihan.getText()),
                jTextField4_DeskripsiPembayaran.getText(), 
                jTextField3_MetodePembayaran.getText()
        );      
        payment.insert();
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan..");
    }//GEN-LAST:event_jButton2_AddMouseClicked

    private void jButton3_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_DeleteMouseClicked
        // TODO add your handling code here:
        DB_Payment payment = new DB_Payment(
                Integer.parseInt(jTextField2_NoPembayaran.getText()), 
                Integer.parseInt(jTextField1_JumlahTagihan.getText()),
                jTextField4_DeskripsiPembayaran.getText(), 
                jTextField3_MetodePembayaran.getText()
        );      
        payment.delete();
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
    }//GEN-LAST:event_jButton3_DeleteMouseClicked

    private void jButton4_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_UpdateMouseClicked
        // TODO add your handling code here:
        DB_Payment payment = new DB_Payment(
                Integer.parseInt(jTextField2_NoPembayaran.getText()), 
                Integer.parseInt(jTextField1_JumlahTagihan.getText()),
                jTextField4_DeskripsiPembayaran.getText(), 
                jTextField3_MetodePembayaran.getText()
        );      
        payment.update();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
    }//GEN-LAST:event_jButton4_UpdateMouseClicked

    private void jButton1_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_resetMouseClicked
        // TODO add your handling code here:
        DB_Payment payment = new DB_Payment(
                Integer.parseInt(jTextField2_NoPembayaran.getText()), 
                Integer.parseInt(jTextField1_JumlahTagihan.getText()),
                jTextField4_DeskripsiPembayaran.getText(), 
                jTextField3_MetodePembayaran.getText()
        );      
        payment.reset();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
    }//GEN-LAST:event_jButton1_resetMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Back;
    private javax.swing.JButton jButton1_reset;
    private javax.swing.JButton jButton2_Add;
    private javax.swing.JButton jButton3_Delete;
    private javax.swing.JButton jButton4_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_JumlahTagihan;
    private javax.swing.JTextField jTextField2_NoPembayaran;
    private javax.swing.JTextField jTextField3_MetodePembayaran;
    private javax.swing.JTextField jTextField4_DeskripsiPembayaran;
    // End of variables declaration//GEN-END:variables
}
