
package SwingGUI;

import Dao.SalesDAO;
import Table.Car;
import Table.Sales;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class AddSales extends javax.swing.JFrame {
   
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement pst;
    
    private SalesDAO salesDAO;
    private SalesGUI salesGUI;
    private Sales previousSales =null;
    private boolean addsales =false;
    
    public AddSales(SalesGUI theSalesGUI,SalesDAO theSalesDAO,
            Sales thePreviousSales , boolean theaddsales) {
        this();
        salesDAO =theSalesDAO;
        salesGUI =theSalesGUI;
        
        previousSales =thePreviousSales;
        addsales =theaddsales;
        
        if(addsales){
            populateGui(previousSales);
        }
    }//End method AddSales
   
     public AddSales(SalesGUI theSalesGUI,SalesDAO theSalesDAO) {
      this(theSalesGUI,theSalesDAO,null,false);
    }
     
     private void populateGui(Sales theSales) {
       
        pricejTextField1.setText(theSales.getPrice());
        
    }//End method populateGui
     
    public AddSales() {
       
        initComponents();
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","");
            }
            catch (Exception e)
            {
            System.out.println(e);
            }
        combox();
        combox2();
    }

     private void combox(){
        
        try{
            String  sql="select * from car_del";
            pst=conn.prepareStatement(sql);
            rs =pst.executeQuery();
            
            while(rs.next()){
              //  String id=rs.getString("model_id");
                
              //  model_idjComboBox1.addItem(id);
            }
        } catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
        }
    }
     
     private void combox2(){
        
        try{
            String  sql="select * from login";
            pst=conn.prepareStatement(sql);
            rs =pst.executeQuery();
            
            while(rs.next()){
                String id=rs.getString("id");
                
                user_idjComboBox1.addItem(id);
            }
        } catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pricejLabel1 = new javax.swing.JLabel();
        pricejTextField1 = new javax.swing.JTextField();
        payment_typejLabel1 = new javax.swing.JLabel();
        user_idjLabel1 = new javax.swing.JLabel();
        user_idjComboBox1 = new javax.swing.JComboBox<>();
        payment_typejTextField2 = new javax.swing.JTextField();
        savejButton1 = new javax.swing.JButton();
        canceljButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Sales");
        setType(java.awt.Window.Type.UTILITY);

        pricejLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricejLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pricejLabel1.setText("Price");

        payment_typejLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        payment_typejLabel1.setText("payment_type");

        user_idjLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_idjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user_idjLabel1.setText("user_id");

        user_idjComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_idjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        payment_typejTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_idjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payment_typejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pricejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pricejTextField1)
                    .addComponent(user_idjComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 303, Short.MAX_VALUE)
                    .addComponent(payment_typejTextField2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment_typejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment_typejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_idjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_idjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        savejButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        savejButton1.setText("Save");
        savejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButton1ActionPerformed(evt);
            }
        });

        canceljButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        canceljButton1.setText("Cancel");
        canceljButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(savejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(canceljButton1)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(canceljButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void canceljButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceljButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_canceljButton1ActionPerformed

    private void savejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButton1ActionPerformed
         saveSales();
    }//GEN-LAST:event_savejButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceljButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel payment_typejLabel1;
    private javax.swing.JTextField payment_typejTextField2;
    private javax.swing.JLabel pricejLabel1;
    private javax.swing.JTextField pricejTextField1;
    private javax.swing.JButton savejButton1;
    private javax.swing.JComboBox<String> user_idjComboBox1;
    private javax.swing.JLabel user_idjLabel1;
    // End of variables declaration//GEN-END:variables

    private void saveSales() {
        combox();
        combox2();
        
      //  String model_id= (String) model_idjComboBox1.getSelectedItem();
        String price = pricejTextField1.getText();
        //String year =yearjTextField1.getText();
        String payment_type =payment_typejTextField2.getText();
        String user_id =(String) user_idjComboBox1.getSelectedItem();
        
        Sales sales =null;
        
        if (pricejTextField1.getText().equals("")||payment_typejTextField2.getText().equals("")||user_idjComboBox1.getSelectedItem().equals(""))
        {  
           JOptionPane.showMessageDialog(null,"input content index ","process add Sales",JOptionPane.ERROR_MESSAGE);
        }
        else
            if(addsales){
              sales =previousSales;
           //   sales.setModel_id(model_id);
              sales.setPrice(price);
            //  sales.setYear(year);
          } 
            else{
                sales =new Sales(price,payment_type,user_id);
            }
                
        {   
        try{
            
            salesDAO.addSales(sales);
            //close Form       
            setVisible(false);
            //refresh gui list
            salesGUI.refreshSalesView();
            //show message
            JOptionPane.showMessageDialog(salesGUI,"sales saved succesfully.","sales saved",JOptionPane.INFORMATION_MESSAGE);
           
        } catch(Exception exc){
            JOptionPane.showMessageDialog(salesGUI,"Error saving sales:"+ exc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//End method saveSales

}//End class
