
package SwingGUI;

import Dao.CarDAO;
import Dao.SalesDAO;
import Table.Car;
import java.util.List;
import javax.swing.JOptionPane;
import javax.print.*;
import java.text.*;
import javax.swing.JTable;


public class CarGUI extends javax.swing.JFrame {

    private CarDAO carDAO;
    private SalesGUI salesGUI;
    private SalesDAO salesDAO;
    
    
    public CarGUI() {
        initComponents();
         try{
            carDAO =new CarDAO();
            
        } catch (Exception exc){
            JOptionPane.showMessageDialog(this,"Error:"+exc,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Model_idjLabel1 = new javax.swing.JLabel();
        searchjTextField1 = new javax.swing.JTextField();
        searchjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddCarjButton1 = new javax.swing.JButton();
        UpdateCarjButton2 = new javax.swing.JButton();
        DeleteCarjButton3 = new javax.swing.JButton();
        printjButton5 = new javax.swing.JButton();
        salesjButton1 = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CarGUI");
        setPreferredSize(new java.awt.Dimension(714, 600));
        setType(java.awt.Window.Type.UTILITY);

        Model_idjLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Model_idjLabel1.setText("Model_id");

        searchjTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjTextField1ActionPerformed(evt);
            }
        });

        searchjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        searchjButton1.setText("Search");
        searchjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Model_Id", "Color", "Year", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        AddCarjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddCarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+.png"))); // NOI18N
        AddCarjButton1.setText("Add Car");
        AddCarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCarjButton1ActionPerformed(evt);
            }
        });

        UpdateCarjButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpdateCarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update.png"))); // NOI18N
        UpdateCarjButton2.setText("Update Car");
        UpdateCarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCarjButton2ActionPerformed(evt);
            }
        });

        DeleteCarjButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeleteCarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        DeleteCarjButton3.setText("Delete Car");
        DeleteCarjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCarjButton3ActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(Model_idjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchjButton1)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddCarjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateCarjButton2)
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printjButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteCarjButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchjButton1)
                    .addComponent(Model_idjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCarjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateCarjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteCarjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(printjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        salesjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salesjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        salesjButton1.setText("Sales");
        salesjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesjButton1ActionPerformed(evt);
            }
        });

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salesjButton1)
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
       CarGUI.this.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void salesjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesjButton1ActionPerformed
        SalesGUI showsales =new SalesGUI();
        CarGUI.this.setVisible(false);
         showsales.setVisible(true);
         showsales.refreshSalesView();
    }//GEN-LAST:event_salesjButton1ActionPerformed

    private void searchjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjTextField1ActionPerformed
        
    }//GEN-LAST:event_searchjTextField1ActionPerformed

    private void searchjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButton1ActionPerformed
       
        try{
            String Model_id =searchjTextField1.getText();
            
            List<Car> car =null;
            
            if(Model_id !=null && Model_id.trim().length()>0){
                car =carDAO.searchCar(Model_id);
            }
            else{
                car =carDAO.getAllCar();
            }
            
            Carjtable mode=new Carjtable(car);
            jTable1.setModel(mode);
            
        } catch(Exception exc){
            JOptionPane.showMessageDialog(CarGUI.this, "Error:" + exc, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchjButton1ActionPerformed

    private void DeleteCarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCarjButton3ActionPerformed
       
         try{
            // get the selected row
            int row =jTable1.getSelectedRow();
            //make sure a row is selected
            if(row<0){
                JOptionPane.showMessageDialog(CarGUI.this,"You must select an car","Error", JOptionPane.ERROR_MESSAGE);
                return;  
             }
            //prompt the user
             int response =JOptionPane.showConfirmDialog(CarGUI.this,"Delete this Car?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(response !=JOptionPane.YES_NO_OPTION){
                 return;
             }
            //get the current model
            Car mode =(Car)jTable1.getValueAt(row,Carjtable.OBJECT);
            //delete the model
            carDAO.deleteCar(mode.getId());
            //refresh GUI
            refreshCarView();
            //show success message
            JOptionPane.showMessageDialog(CarGUI.this,"Model deleted succesfully.","Model Deleted",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(CarGUI.this,"Error deleting Model:"+exc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteCarjButton3ActionPerformed

    private void AddCarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCarjButton1ActionPerformed
        Add_UpdateCar fromAdd_UpdateCar =new Add_UpdateCar(CarGUI.this,carDAO);   
       fromAdd_UpdateCar.setVisible(true);
    }//GEN-LAST:event_AddCarjButton1ActionPerformed

    private void UpdateCarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCarjButton2ActionPerformed
      
        //get the selected item
        int row =jTable1.getSelectedRow();
        
        //make sure a row is selected
        if(row<0){
            JOptionPane.showMessageDialog(CarGUI.this,"you must select an car", "Error",JOptionPane.ERROR_MESSAGE);
            return ;}
        //get the current car
        Car mode =(Car) jTable1.getValueAt(row,Carjtable.OBJECT);
        //create Form
        Add_UpdateCar form =new Add_UpdateCar(CarGUI.this,carDAO,mode,true);
        
        //show Form
        form.setVisible(true);
    }//GEN-LAST:event_UpdateCarjButton2ActionPerformed

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

     public void refreshCarView() {
        
        try{
            List<Car> car=carDAO.getAllCar();
            
            Carjtable mode =new Carjtable(car);
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
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCarjButton1;
    private javax.swing.JButton DeleteCarjButton3;
    private javax.swing.JLabel Model_idjLabel1;
    private javax.swing.JButton UpdateCarjButton2;
    private javax.swing.JButton backButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printjButton5;
    private javax.swing.JButton salesjButton1;
    private javax.swing.JButton searchjButton1;
    private javax.swing.JTextField searchjTextField1;
    // End of variables declaration//GEN-END:variables
}
