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
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    public bill() {
        initComponents();
        generate_bill_no();
    }

    bill(String pro, String ta, String pri, String qty,
            Vector service, Vector product, Vector quantity, Vector tax, Vector price, int ser) {
        initComponents();
        generate_bill_no();
//        try {
//            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
//            java.sql.Statement S = C.createStatement();
//            ResultSet r = S.executeQuery("select * from gst");
//            while (r.next()) {
//                gstcategory.addItem(r.getString("category"));
//            }
//
//            // TODO add your handling code here:
//        } catch (SQLException ex) {
//            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//        } 

        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int i;
        double totel = 0;
        for (i = 0; i < service.size(); i++) {
            Vector v = new Vector();
            v.add(i + 1);

            v.add(service.get(i));

            v.add(product.get(i));
            v.add(quantity.get(i));
            v.add(tax.get(i));
            v.add(price.get(i));
            v.add(Integer.parseInt(quantity.get(i).toString()) * Double.parseDouble(price.get(i).toString()));
            totel = totel + Integer.parseInt(quantity.get(i).toString()) * Double.parseDouble(price.get(i).toString());
            t.addRow(v);

        }

        Vector v = new Vector();
        v.add(i + 1);

        v.add("");
        v.add(pro);
        v.add(qty);
        v.add(ta);
        v.add(pri);
        totel = totel + Integer.parseInt(qty) * Double.parseDouble(pri);
        ta = ta.replace("%", "");
        totel = totel + (totel * (Double.parseDouble(ta) / 100));

        v.add(totel);

        t.addRow(v);
        gtotel.setText(String.valueOf(totel));
//        try {
//                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
//                java.sql.Statement S = C.createStatement();
//                ResultSet r = S.executeQuery("select * from `insert`");
//                DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
//                while (jTable1.getRowCount() != 0) {
//                    t.removeRow(0);
//                }
//                while (r.next()) {
//                    Vector v = new Vector();
//                    v.add(r.getString(1));
//                    
//                    v.add(r.getString(2));
//                    v.add(r.getString(4));
//                    v.add(r.getString(5));
//                    v.add(r.getString(6));
//                    v.add(r.getString(7));
//                    v.add(r.getString(10));
//                    v.add(r.getString(9));
//                    v.add(r.getString(12));
//                     v.add(r.getString(8));
//                     v.add(r.getString(13));
//                    t.addRow(v);
//
//                }
//
//            } catch (SQLException ex) {
//                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//            }
        //To change body of generated methods, choose Tools | Templates.
    }

    //service
    bill(String sertype, String am, String seleper, String per1, String per2,
            Vector service, Vector product, Vector quantity, Vector tax, Vector price, int ser) {
        initComponents();
        generate_bill_no();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        int i;
        double totel = 0;
        for (i = 0; i < service.size(); i++) {
            Vector v = new Vector();
            v.add(i + 1);

            v.add(service.get(i));

            v.add(product.get(i));
            v.add(quantity.get(i));
            v.add(tax.get(i));
            v.add(price.get(i));
            v.add(Integer.parseInt(quantity.get(i).toString()) * Double.parseDouble(price.get(i).toString()));
            totel = totel + Integer.parseInt(quantity.get(i).toString()) * Double.parseDouble(price.get(i).toString());

            t.addRow(v);

        }

        Vector v = new Vector();
        v.add(i + 1);

        v.add(sertype);
        v.add("");
        v.add("");
        v.add("");
        v.add(am);

        v.add(am);

        t.addRow(v);
        totel = totel + Integer.parseInt(am);
        gtotel.setText(String.valueOf(totel));

//To change body of generated methods, choose Tools | Templates.
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        gst = new javax.swing.JTextField();
        billno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        gtotel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        billtype = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Technodroid");
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE A NEW BILL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 340, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("TIRUR ROAD THAZHEPPALAM ,676101");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 270, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Malappuram, Kerala");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Assosciate computer security system");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 340, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Contact NO :9072071405");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("GST NUMBER : ABC!23DEF09LK");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Email : azfakht@gmail.com");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("GST NUMBER");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("BILL NO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CUSTOMER NAME");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 30));
        jPanel2.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 280, 30));
        jPanel2.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 280, 30));
        jPanel2.add(gst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 280, 30));
        jPanel2.add(billno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 80, 40));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CONTACT NUMBER");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 470, 200));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SI No", "Service", "Product", "Quantity", "Tax", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 960, 250));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 100, 30));

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, 100, 30));

        jButton3.setText("Service");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 230, 30));
        getContentPane().add(gtotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 130, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 110, 30));

        jButton4.setText("Add Product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 30));

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 100, 30));

        billtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bill Type", "Cash Bill", "Credit Bill" }));
        getContentPane().add(billtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 150, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/technodroid/wall.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1000, 710));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Calculator");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Notepad");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Vector serVector = new Vector();
        Vector product = new Vector();
        Vector quantity = new Vector();
        Vector tax = new Vector();
        Vector price = new Vector();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            serVector.add(jTable1.getValueAt(i, 1).toString());
            product.add(jTable1.getValueAt(i, 2).toString());
            quantity.add(jTable1.getValueAt(i, 3).toString());
            tax.add(jTable1.getValueAt(i, 4).toString());
            price.add(jTable1.getValueAt(i, 5).toString());

        }
        int ser = jTable1.getRowCount();

        service s = new service(serVector, product, quantity, tax, price, ser);
        s.setVisible(true);// TODO add your handling code here:
        //this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Vector serVector = new Vector();
        Vector product = new Vector();
        Vector quantity = new Vector();
        Vector tax = new Vector();
        Vector price = new Vector();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            serVector.add(jTable1.getValueAt(i, 1).toString());
            product.add(jTable1.getValueAt(i, 2).toString());
            quantity.add(jTable1.getValueAt(i, 3).toString());
            tax.add(jTable1.getValueAt(i, 4).toString());
            price.add(jTable1.getValueAt(i, 5).toString());

        }
        int ser = jTable1.getRowCount();
        billitems b = new billitems(serVector, product, quantity, tax, price, ser);
        b.setVisible(true);        // TODO add your handling code here:
//        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        bill b = new bill();
        b.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < jTable1.getRowCount(); i++) {

//            if (!jTable1.getValueAt(i, 1).toString().equals("")) {
//                try {
//                    com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
//                    java.sql.Statement S = C.createStatement();
//
//                    S.executeUpdate("INSERT INTO `service`(`person1`, `person2`, `person`, `billno`) VALUES ('" + jTable1.getValueAt(i,) + "',[value-2],[value-3],[value-4],[value-5])");
//                    JOptionPane.showMessageDialog(rootPane, " Service Added");
//                } catch (SQLException ex) {
//                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
//
//                }
//            }
            try {
                com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
                java.sql.Statement S = C.createStatement();

                S.executeUpdate("INSERT INTO `bill`( `billno`, `date`, `custemername`, `contactno`, `gstno`, `service`, `productname`, `quantity`, `tax`, `price`, `billtype`) VALUES ('" + billno.getText() + "','" + jDateChooser1.getDate().toString() + "','" + cname.getText() + "','" + cn.getText() + "','" + gst.getText() + "','" + jTable1.getValueAt(i, 1).toString() + "','" + jTable1.getValueAt(i, 2).toString() + "','" + (jTable1.getValueAt(i, 3).toString().equals("") ? "0" : jTable1.getValueAt(i, 3).toString()) + "','" + jTable1.getValueAt(i, 4).toString() + "','" + jTable1.getValueAt(i, 5).toString() + "','" + billtype.getSelectedItem().toString() + "')");
                if (!jTable1.getValueAt(i, 2).toString().equals("")) {
                    try {

                        int stock = 0;
                        ResultSet r = S.executeQuery("SELECT `stock` FROM `insert` WHERE `productname`='"+jTable1.getValueAt(i, 2).toString()+"'");
                        while (r.next()) {
                            stock = r.getInt("stock");
                        }
                        S.executeUpdate("UPDATE `insert` SET `stock`='"+(stock-Integer.parseInt(jTable1.getValueAt(i, 3).toString()))+"' WHERE `productname`='"+jTable1.getValueAt(i, 2).toString()+"'");
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
        JOptionPane.showMessageDialog(rootPane, " Print sucssessfully");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
ProcessBuilder b = new ProcessBuilder("calc.exe");
        try {
            Process p = b.start();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 ProcessBuilder b = new ProcessBuilder("notepad.exe");
        try {
            Process p = b.start();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }               // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billno;
    private javax.swing.JComboBox<String> billtype;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField gst;
    private javax.swing.JTextField gtotel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void generate_bill_no() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            com.mysql.jdbc.Connection C = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/apps?", "root", "");
            java.sql.Statement S = C.createStatement();
            ResultSet r = S.executeQuery("select max(billno) as billno from bill");

            while (r.next()) {
                System.out.println(r.getString("billno"));
                if (r.getString("billno") == null) {
                    billno.setText("1");
                } else {
                    billno.setText(String.valueOf(Integer.parseInt(r.getString("billno")) + 1));
                }
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
