
package SwingGUI;

import Dao.ModelDAO;
import Table.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Add_UpdateModel extends javax.swing.JFrame {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement pst;
    
    private ModelDAO modelDAO;
    private MainInterfacee mainInterfacee;
    
    private Model previousModel =null;
    private boolean updateMode =false;
    private int loginId;
    
    public Add_UpdateModel(MainInterfacee theMainInterfacee, ModelDAO theModelDAO,
            Model thePreviousModel , boolean theUpdateMode) {
        this();
        modelDAO =theModelDAO;
        mainInterfacee =theMainInterfacee;
        
        previousModel =thePreviousModel;
        updateMode =theUpdateMode;
        
        if(updateMode){
            setTitle("Update Model");
            populateGui(previousModel);
        }
    }//End method Add_UpdateModel

    public Add_UpdateModel(MainInterfacee theMainInterfacee, ModelDAO theModelDAO) {
      this(theMainInterfacee,theModelDAO,null,false);
    }
    
    
    private void populateGui(Model theModel) {
        makeComboBox1.setSelectedItem(theModel.getmake());
        nameTextField1.setText(theModel.getName());
        classComboBox1.setSelectedItem(theModel.getclass());
    }
    /**
     * Creates new form AddModel
     */
    public Add_UpdateModel() {
        initComponents();
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","");
            }
            catch (Exception e)
            {
            System.out.println(e);
            }    
        combox();
    }

    private void combox(){
        
        try{
            String  sql="select * from model";
            pst=conn.prepareStatement(sql);
            rs =pst.executeQuery();
            
            while(rs.next()){
                String make=rs.getString("make");
                String _class=rs.getString("class");
                makeComboBox1.addItem(make);
                classComboBox1.addItem(_class);
            }
        } catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        makeLabel = new javax.swing.JLabel();
        makeComboBox1 = new javax.swing.JComboBox<>();
        nameLabel1 = new javax.swing.JLabel();
        nameTextField1 = new javax.swing.JTextField();
        classLabel1 = new javax.swing.JLabel();
        classComboBox1 = new javax.swing.JComboBox<>();
        saveButton1 = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Model");
        setType(java.awt.Window.Type.UTILITY);

        makeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        makeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        makeLabel.setText("Make");

        makeComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        makeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel1.setText("Name");

        nameTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        classLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classLabel1.setText("Class");

        classComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        classComboBox1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(makeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makeComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField1)
                    .addComponent(classComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        saveButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveButton1.setText("Save");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        cancelButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
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
                        .addGap(0, 213, Short.MAX_VALUE)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cancelButton1)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
         saveModel();
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
       
         Add_UpdateModel.this.setVisible(false);
    }//GEN-LAST:event_cancelButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_UpdateModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_UpdateModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_UpdateModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_UpdateModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_UpdateModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton1;
    private javax.swing.JComboBox<String> classComboBox1;
    private javax.swing.JLabel classLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> makeComboBox1;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JButton saveButton1;
    // End of variables declaration//GEN-END:variables

    private void saveModel() {
        combox();
        String make =(String) makeComboBox1.getSelectedItem();
        String Name =nameTextField1.getText();
        String _class=(String) classComboBox1.getSelectedItem();
        
        Model mode =null;
   if (makeComboBox1.getSelectedItem().equals("")||nameTextField1.getText().equals("")||classComboBox1.getSelectedItem().equals(""))
   {  
           JOptionPane.showMessageDialog(null,"input content index ","process add model",JOptionPane.ERROR_MESSAGE);
    }
   else{
          if(updateMode){
              mode =previousModel;
              mode.setmake(make);
              mode.setName(Name);
              mode.setclass(_class);
          }     
          else{
           mode =new Model(make,Name,_class);
          }
        try{
            
            if(updateMode){
                modelDAO.updateModel(mode);
            }else{
                modelDAO.addModel(mode);
            }
            //close Form       
            setVisible(false);
            //refresh gui list
            mainInterfacee.refreshModelView();
            //show message
            JOptionPane.showMessageDialog(mainInterfacee,"model saved succesfully.","Model saved",JOptionPane.INFORMATION_MESSAGE);
           
        } catch(Exception exc){
            JOptionPane.showMessageDialog(mainInterfacee,"Error saving Model:"+ exc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
         }//End else
    }//End method saveModel
}//End class

