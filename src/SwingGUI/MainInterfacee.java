
package SwingGUI;



import Dao.ModelDAO;
import Table.Model;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.text.*;
import java.awt.print.*;


public class MainInterfacee extends javax.swing.JFrame {

     private ModelDAO modelDAO;
     
    public MainInterfacee() {
        initComponents();
         try{
            modelDAO =new ModelDAO();
        } catch (Exception exc){
            JOptionPane.showMessageDialog(this,"Error:"+exc,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
     MainInterfacee(ModelDAO themodelDAO) {
         modelDAO=themodelDAO;
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        searchPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddModelButton1 = new javax.swing.JButton();
        updatemodelButton2 = new javax.swing.JButton();
        deleteModelButton3 = new javax.swing.JButton();
        printButton4 = new javax.swing.JButton();
        nameLabel1 = new javax.swing.JLabel();
        searchTextField1 = new javax.swing.JTextField();
        searchButton5 = new javax.swing.JButton();
        logoutButton9 = new javax.swing.JButton();
        carButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainInterface");
        setType(java.awt.Window.Type.UTILITY);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Make", "Name", "Class"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setViewportView(jTable1);

        AddModelButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddModelButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/+.png"))); // NOI18N
        AddModelButton1.setText("Add Model");
        AddModelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddModelButton1ActionPerformed(evt);
            }
        });

        updatemodelButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updatemodelButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update.png"))); // NOI18N
        updatemodelButton2.setText("Update Model");
        updatemodelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemodelButton2ActionPerformed(evt);
            }
        });

        deleteModelButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteModelButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x.png"))); // NOI18N
        deleteModelButton3.setText("Delete Model");
        deleteModelButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteModelButton3ActionPerformed(evt);
            }
        });

        printButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printButton4.setText("Print");
        printButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButton4ActionPerformed(evt);
            }
        });

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel1.setText("Name");

        searchTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextField1ActionPerformed(evt);
            }
        });

        searchButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        searchButton5.setText("Search");
        searchButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanel1Layout = new javax.swing.GroupLayout(searchPanel1);
        searchPanel1.setLayout(searchPanel1Layout);
        searchPanel1Layout.setHorizontalGroup(
            searchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(searchPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchPanel1Layout.createSequentialGroup()
                        .addComponent(printButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(searchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchPanel1Layout.createSequentialGroup()
                            .addComponent(AddModelButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatemodelButton2)
                            .addGap(119, 119, 119)
                            .addComponent(deleteModelButton3))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );
        searchPanel1Layout.setVerticalGroup(
            searchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(searchPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatemodelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddModelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteModelButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(printButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Model", searchPanel1);

        logoutButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        logoutButton9.setText("Logout");
        logoutButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton9ActionPerformed(evt);
            }
        });

        carButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        carButton9.setText("Car");
        carButton9.setToolTipText("");
        carButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutButton9)
                        .addGap(470, 470, 470)
                        .addComponent(carButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton9ActionPerformed
       int logout;
         logout=JOptionPane.showConfirmDialog(null,"Do you want to Exit?","Logout",0,3);
         if(logout==0)
         {LoginGUI loginGUI = new LoginGUI();    
         MainInterfacee.this.setVisible(false);
         loginGUI.setVisible(true);}
    }//GEN-LAST:event_logoutButton9ActionPerformed

    private void carButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carButton9ActionPerformed
       CarGUI car = new CarGUI();    
         car.setVisible(true);
         car.refreshCarView();
    }//GEN-LAST:event_carButton9ActionPerformed

    private void searchButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton5ActionPerformed

        try{
            String Name =searchTextField1.getText();

            List<Model> model =null;

            if(Name !=null && Name.trim().length()>0){
                model =modelDAO.searchModel(Name);
            }
            else{
                model =modelDAO.getAllModel();
            }

            Modeljtable mode =new Modeljtable(model);
            jTable1.setModel(mode);

        } catch(Exception exc){
            JOptionPane.showMessageDialog(MainInterfacee.this, "Error:" + exc, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButton5ActionPerformed

    private void searchTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextField1ActionPerformed
       
    }//GEN-LAST:event_searchTextField1ActionPerformed

    private void printButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButton4ActionPerformed
        try{

            // MessageFormat header =new MessageFormat("Pagee Header");
            //  MessageFormat   footer =new MessageFormat("Page{1,number,,integer}");
            jTable1.print();
            //jTable1.print(jTable1.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e){
            //  System.err.format("Cannot print %s%n", e.getMessage());
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_printButton4ActionPerformed

    private void deleteModelButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteModelButton3ActionPerformed
        try{
            // get the selected row
            int row =jTable1.getSelectedRow();
            //make sure a row is selected
            if(row<0){
                JOptionPane.showMessageDialog(MainInterfacee.this,"You must select an model","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //prompt the user
            int response =JOptionPane.showConfirmDialog(MainInterfacee.this,"Delete this Model?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

            if(response !=JOptionPane.YES_NO_OPTION){
                return;
            }
            //get the current model
            Model mode =(Model)jTable1.getValueAt(row,Modeljtable.OBJECT);
            //delete the model
            modelDAO.deleteModel(mode.getId());
            //refresh GUI
            refreshModelView();
            //show success message
            JOptionPane.showMessageDialog(MainInterfacee.this,"Model deleted succesfully.","Model Deleted",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(MainInterfacee.this,"Error deleting Model:"+exc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteModelButton3ActionPerformed

    private void updatemodelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemodelButton2ActionPerformed
        //get the selected item
        int row =jTable1.getSelectedRow();

        //make sure a row is selected
        if(row<0){
            JOptionPane.showMessageDialog(MainInterfacee.this,"you must select an model", "Error",JOptionPane.ERROR_MESSAGE);
            return ;}
        //get the current model
        Model mode =(Model) jTable1.getValueAt(row,Modeljtable.OBJECT);
        //create Form
        Add_UpdateModel form =new Add_UpdateModel(MainInterfacee.this,modelDAO,mode,true);

        //show Form
        form.setVisible(true);
    }//GEN-LAST:event_updatemodelButton2ActionPerformed

    private void AddModelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddModelButton1ActionPerformed

        Add_UpdateModel fromAdd_Updatemodel =new Add_UpdateModel(MainInterfacee.this,modelDAO);

        fromAdd_Updatemodel.setVisible(true);
    }//GEN-LAST:event_AddModelButton1ActionPerformed

    
    public void refreshModelView() {
        
        try{
            List<Model> model=modelDAO.getAllModel();
            
            Modeljtable mode =new Modeljtable((model));
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
            java.util.logging.Logger.getLogger(MainInterfacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterfacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterfacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterfacee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new MainInterfacee().setVisible(true);
                
                }catch(Exception exc){   
                    exc.printStackTrace();
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddModelButton1;
    private javax.swing.JButton carButton9;
    private javax.swing.JButton deleteModelButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton9;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JButton printButton4;
    private javax.swing.JButton searchButton5;
    private javax.swing.JPanel searchPanel1;
    private javax.swing.JTextField searchTextField1;
    private javax.swing.JButton updatemodelButton2;
    // End of variables declaration//GEN-END:variables
  
    
}//End class
