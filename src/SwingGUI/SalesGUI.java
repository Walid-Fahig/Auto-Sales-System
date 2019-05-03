
package SwingGUI;

import Dao.SalesDAO;
import Table.Sales;
import javax.swing.JOptionPane;
import javax.print.*;
import java.text.*;
import java.util.List;



public class SalesGUI extends javax.swing.JFrame {

    private SalesDAO salesDAO;
    
    
    public SalesGUI() {
        initComponents();
        try{
            salesDAO =new SalesDAO();
        } catch (Exception exc){
            JOptionPane.showMessageDialog(this,"Error:"+exc,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addSalesjButton1 = new javax.swing.JButton();
        deleteSalesjButton3 = new javax.swing.JButton();
        printjButton5 = new javax.swing.JButton();
        backjButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalesGUI");
        setPreferredSize(new java.awt.Dimension(714, 600));
        setType(java.awt.Window.Type.UTILITY);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Model_id", "Price", "Year", "Date", "payment_type", "user_id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        addSalesjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addSalesjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+.png"))); // NOI18N
        addSalesjButton1.setText("Add Sales");
        addSalesjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSalesjButton1ActionPerformed(evt);
            }
        });

        deleteSalesjButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteSalesjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        deleteSalesjButton3.setText("delete Sales");
        deleteSalesjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSalesjButton3ActionPerformed(evt);
            }
        });

        printjButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printjButton5.setText("Print");
        printjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printjButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(addSalesjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118)
                                .addComponent(deleteSalesjButton3)
                                .addGap(140, 140, 140))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteSalesjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSalesjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(printjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backjButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backjButton4.setText("Back");
        backjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backjButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton4ActionPerformed
        CarGUI car = new CarGUI();    
         SalesGUI.this.setVisible(false);
         car.refreshCarView();
         car.setVisible(true);
    }//GEN-LAST:event_backjButton4ActionPerformed

    private void printjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printjButton5ActionPerformed
       try{
            
           // MessageFormat header =new MessageFormat("Pagee Header"); 
         //  MessageFormat   footer =new MessageFormat("Page{1,number,,integer}");
               jTable1.print();
                //jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
                 
        } catch (Exception e){
          //  System.err.format("Cannot print %s%n", e.getMessage());
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_printjButton5ActionPerformed

    private void addSalesjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSalesjButton1ActionPerformed
        AddSales fromAddSales =new AddSales(SalesGUI.this,salesDAO);   
        fromAddSales.setVisible(true);
    }//GEN-LAST:event_addSalesjButton1ActionPerformed

    private void deleteSalesjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSalesjButton3ActionPerformed
       
        try{
            // get the selected row
            int row =jTable1.getSelectedRow();
            //make sure a row is selected
            if(row<0){
                JOptionPane.showMessageDialog(SalesGUI.this,"You must select an sales","Error", JOptionPane.ERROR_MESSAGE);
                return;  
             }
            //prompt the user
             int response =JOptionPane.showConfirmDialog(SalesGUI.this,"Delete this sales?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(response !=JOptionPane.YES_NO_OPTION){
                 return;
             }
            //get the current sales
            Sales mode =(Sales)jTable1.getValueAt(row,Salesjtable.OBJECT);
            //delete the model
            salesDAO.deleteSales(mode.getId());
            //refresh GUI
            refreshSalesView();
            //show success message
            JOptionPane.showMessageDialog(SalesGUI.this,"Sales deleted succesfully.","Sales Deleted",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(SalesGUI.this,"Error deleting Sales:"+exc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteSalesjButton3ActionPerformed

     public void refreshSalesView() {
        
        try{
           List<Sales> sales=salesDAO.getAllSales();
            
            Salesjtable mode =new Salesjtable(sales);
            jTable1.setModel(mode);
            
        } catch(Exception exc) {
            JOptionPane.showMessageDialog(this,"Error:" + exc, "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(SalesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSalesjButton1;
    private javax.swing.JButton backjButton4;
    private javax.swing.JButton deleteSalesjButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printjButton5;
    // End of variables declaration//GEN-END:variables
}
