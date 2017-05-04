/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko; 

/**
 *
 * @author LUCKY
 */
public class home extends javax.swing.JFrame {

    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
    }
    
    public JTextField getTxtKode(){         
        return txtkode;     
    }     
    public JTextField getTxtNama(){         
        return txtnama;     
    }    
    public JTextField getTxtHarga(){         
        return txtharga;     
    }     
    public JComboBox getCbKategori(){         
        return cbKategoriBrg;     
    }     
    public JComboBox getCbJenis(){         
        return cbjenis;     
    }    
    public JComboBox getCbCariKategori(){        
        return cbCariKategori;    
    }   
    public JButton getButtonHapus(){   
        return Btn_Hapus;  
    }        
    public JButton getButtonBersih(){     
        return Btn_Bersih;   
    }   
    public JButton getButtonSimpan(){   
        return Btn_Simpan;  
    }   
    public JButton getButtonUbah(){   
        return Btn_Ubah;     
    }    
    public JButton getButtonKeluar(){    
        return Btn_Keluar;    
    }   
    public JTable getTableData(){       
        return Tabel1;   
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfAdmin = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        cbCariKategori = new javax.swing.JComboBox<>();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Cari = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        txtkode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Admin Toko :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data Barang di Toko");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Kode Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Kategori Barang");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Jenis Packaging");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Harga");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Pencarian Berdasarkan Kategori ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        tfAdmin.setEditable(false);
        getContentPane().add(tfAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 300, -1));
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 300, -1));

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));
        getContentPane().add(cbKategoriBrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 300, -1));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Kardus", "Botol" }));
        getContentPane().add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 300, -1));

        cbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));
        getContentPane().add(cbCariKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 90, -1));

        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 90, -1));

        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, -1));

        Btn_Cari.setText("Cari");
        Btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CariActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        Btn_Keluar.setText("Keluar");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 90, -1));

        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 90, -1));

        Btn_Bersih.setText("Bersihkan");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 90, -1));
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 300, -1));

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 540, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CariActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
        //ctoko.isiTable();
    }//GEN-LAST:event_Btn_CariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String user1 = login.user;
        tfAdmin.setText(""+user1);
    }//GEN-LAST:event_formWindowOpened

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        ctoko.isiField(Tabel1.getSelectedRow());
    }//GEN-LAST:event_Tabel1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String user = null;
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Cari;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbCariKategori;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAdmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
