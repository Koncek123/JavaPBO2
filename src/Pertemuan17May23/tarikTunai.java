/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan17May23;

/**
 *
 * @author ACER
 */
public class tarikTunai extends javax.swing.JFrame {

    /**
     * Creates new form tarikTunai
     */
    public tarikTunai() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNominal = new javax.swing.JTextField();
        btnTarik = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxInfo = new javax.swing.JTextArea();
        btnSelesai = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.Color.blue);
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(java.awt.Color.blue);
        jPanel2.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(1024, 600, 530, 300);

        jPanel3.setBackground(java.awt.Color.blue);
        jPanel3.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jumlah Penarikan");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 10, 110, 20);
        jPanel3.add(txtNominal);
        txtNominal.setBounds(130, 10, 110, 30);

        btnTarik.setBackground(java.awt.Color.blue);
        btnTarik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTarik.setForeground(new java.awt.Color(255, 255, 255));
        btnTarik.setText("Tarik");
        btnTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarikActionPerformed(evt);
            }
        });
        jPanel3.add(btnTarik);
        btnTarik.setBounds(100, 70, 90, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informasi Penarikan");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 130, 120, 15);

        boxInfo.setColumns(20);
        boxInfo.setRows(5);
        jScrollPane1.setViewportView(boxInfo);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 166, 96);

        btnSelesai.setBackground(java.awt.Color.blue);
        btnSelesai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSelesai.setForeground(new java.awt.Color(255, 255, 255));
        btnSelesai.setText("Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelesai);
        btnSelesai.setBounds(70, 270, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1024, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarikActionPerformed
        informasiSaldoModel saldo = new informasiSaldoModel();
        tarikTunaiModel tarik = new tarikTunaiModel();
        
        tarik.setNominal(Integer.parseInt(txtNominal.getText()));
        
        int sisa =  saldo.getDuit()-tarik.getNominal();
        saldo.setDuit(sisa);
        
        boxInfo.setText("Jumlah Penarikan: Rp." + tarik.getNominal()+
                "\nSisa saldo: Rp"+ Integer.toString(sisa));
    }//GEN-LAST:event_btnTarikActionPerformed

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
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarikTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tarikTunai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea boxInfo;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton btnTarik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
}