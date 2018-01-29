/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technodroid;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();

        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();
            ResultSet r = S.executeQuery("select * from `insert`");
            DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString(1));

                v.add(r.getString(2));
                v.add(r.getString(4));
                v.add(r.getString(5));
                v.add(r.getString(8));
                v.add(r.getString(7));
                v.add(r.getString(10));
                v.add(r.getString(6));
                v.add(r.getString(11));

                t.addRow(v);

            }

        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        category = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Technodroid");
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchboxKeyPressed(evt);
            }
        });
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 10, 270, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Show Items");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI No", "Date", "Product Name", "Description", "image", "Stock", "Tax", "Price", "Category"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 940, 380));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 80, 30));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, -1, 30));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, 70, 30));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Product", "Date", "Stock", "Price", "Category", " ", " " }));
        category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryItemStateChanged(evt);
            }
        });
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        getContentPane().add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, 30));

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Use\\Documents\\icons\\wall.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));

        jMenu1.setText("File");

        jMenuItem2.setText("Add Product");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem12.setText("Add New Staff");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem3.setText("New Bill");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Old Bill");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem13.setText("Staff Details");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("Expence Details");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Balence Sheet");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem9.setText("Expence");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Export");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Import");
        jMenu1.add(jMenuItem11);

        jMenuItem6.setText("about");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Window");

        jMenuItem7.setText("Calculater");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Note");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Backup");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ProcessBuilder b = new ProcessBuilder("calc.exe");
        try {
            Process p = b.start();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ProcessBuilder b = new ProcessBuilder("notepad.exe");
        try {
            Process p = b.start();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "please select item");
        } else {

            insert i = new insert(
                    jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString(),
                    jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString()
            );

            i.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    private void searchboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyPressed
        if (evt.getKeyCode() == 10) {
            String sql = null;
            if (category.getSelectedItem().equals("Product")) {
                sql = "select * from `insert` where productname like '" + searchbox.getText() + "%'";

            }
            if (category.getSelectedItem().equals("Stock")) {
                sql = "select * from `insert` where stock like '" + searchbox.getText() + "%'";

            }
            if (category.getSelectedItem().equals("Price")) {
                sql = "select * from `insert` where price like '" + searchbox.getText() + "%'";

            }
            if (category.getSelectedItem().equals("Date")) {
                sql = "select * from `insert` where date like '" + searchbox.getText() + "%'";

            }
            if (category.getSelectedItem().equals("Category")) {
                sql = "select * from `insert` where gstcategory like '" + searchbox.getText() + "%'";

            }
            try {
                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
                java.sql.Statement S = C.createStatement();
                ResultSet r = S.executeQuery(sql);
                DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
                while (jTable1.getRowCount() != 0) {
                    t.removeRow(0);
                }
                while (r.next()) {
                    Vector v = new Vector();
                    v.add(r.getString(1));

                    v.add(r.getString(2));
                    v.add(r.getString(4));
                    v.add(r.getString(5));
                    v.add(r.getString(8));
                    v.add(r.getString(7));
                    v.add(r.getString(10));
                    v.add(r.getString(6));
                    v.add(r.getString(11));

                    t.addRow(v);

                }

            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_searchboxKeyPressed

    private void categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryItemStateChanged

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        /*showitem.addItem("Processor");
        showitem.addItem("Motherboard");
        showitem.addItem("Ram");
        showitem.addItem("Hard Disk");
        showitem.addItem("SMPS");
showitem.addItem("Cabinet");
showitem.addItem("UPS");
showitem.addItem("VGA card?grafics");
showitem.addItem("CD drive");
showitem.addItem("CPU fan");
showitem.addItem("etc..");
company.addItem("intel");
company.addItem("gigabyte");
company.addItem("etc..");*/
// TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        expence e = new expence();
        e.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        insert i = new insert();
        i.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        bill b = new bill();
        b.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        oldbill o = new oldbill();
        o.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        staff s = new staff();
        s.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        staffdetails s = new staffdetails();
        s.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        expencedetails e = new expencedetails();
        e.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        balencesheet b = new balencesheet();
        b.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();

            S.executeUpdate("DELETE FROM `insert` WHERE id=" + jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(rootPane, " delete sucssessfully");
        } catch (SQLException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        main m = new main();
        m.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
login l=new login();
l.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
