
package SwingGUI;

import Dao.CarDAO;
import Table.Car;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Add_UpdateCar extends javax.swing.JFrame {

    private Connection conn;
    private ResultSet rs;
    private PreparedStatement pst;
    
    private CarDAO carDAO;
    private CarGUI carGUI;
    private Car previousCar =null;
    private boolean updateCar =false;
    
    public Add_UpdateCar(CarGUI theCarGUI, CarDAO theCarDAO,
            Car thePreviousCar , boolean theUpdateCar) {
        this();
        carDAO =theCarDAO;
        carGUI =theCarGUI;
        
        previousCar =thePreviousCar;
        updateCar =theUpdateCar;
        
        if(updateCar){
            setTitle("Update Car");
            populateGui(previousCar);
        }
    }//End method Add_UpdateCar
    
    public Add_UpdateCar(CarGUI theCarGUI,CarDAO theCarDAO) {
      this(theCarGUI,theCarDAO,null,false);
    }
    
    private void populateGui(Car theCar) {
        model_idjComboBox1.setSelectedItem(theCar.getModel_id());
        colorjTextField1.setText(theCar.getColor());
        yearjTextField1.setText(theCar.getYear());
        pricejTextField1.setText(theCar.getPrice());
                
    }//End method populateGui
    
    public Add_UpdateCar() {
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
            String  sql="select id from model";
            pst=conn.prepareStatement(sql);
            rs =pst.executeQuery();
            
            while(rs.next()){
                String id=rs.getString("id");
                model_idjComboBox1.addItem(id);
            }
        } catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
        }
    }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        model_idjLabel1 = new javax.swing.JLabel();
        model_idjComboBox1 = new javax.swing.JComboBox<>();
        colorjLabel1 = new javax.swing.JLabel();
        colorjTextField1 = new javax.swing.JTextField();
        yearjLabel1 = new javax.swing.JLabel();
        yearjTextField1 = new javax.swing.JTextField();
        pricejLabel1 = new javax.swing.JLabel();
        pricejTextField1 = new javax.swing.JTextField();
        savejButton1 = new javax.swing.JButton();
        canceljButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Car");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(450, 451));
        setType(java.awt.Window.Type.UTILITY);

        model_idjLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        model_idjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        model_idjLabel1.setText("Model_id");

        model_idjComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        model_idjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        colorjLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        colorjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        colorjLabel1.setText("Color");

        colorjTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        yearjLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yearjLabel1.setText("Year");

        yearjTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pricejLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricejLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pricejLabel1.setText("price");

        pricejTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pricejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(model_idjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(model_idjComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorjTextField1)
                    .addComponent(yearjTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pricejTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(model_idjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(model_idjComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorjTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        savejButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        savejButton1.setText("Save");
        savejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButton1ActionPerformed(evt);
            }
        });

        canceljButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        canceljButton2.setText("Cancel");
        canceljButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 218, Short.MAX_VALUE)
                        .addComponent(savejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(canceljButton2)
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canceljButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void canceljButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceljButton2ActionPerformed
          setVisible(false);
    }//GEN-LAST:event_canceljButton2ActionPerformed

    private void savejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButton1ActionPerformed

            saveCar(); 
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
            java.util.logging.Logger.getLogger(Add_UpdateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_UpdateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_UpdateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_UpdateCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_UpdateCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceljButton2;
    private javax.swing.JLabel colorjLabel1;
    private javax.swing.JTextField colorjTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> model_idjComboBox1;
    private javax.swing.JLabel model_idjLabel1;
    private javax.swing.JLabel pricejLabel1;
    private javax.swing.JTextField pricejTextField1;
    private javax.swing.JButton savejButton1;
    private javax.swing.JLabel yearjLabel1;
    private javax.swing.JTextField yearjTextField1;
    // End of variables declaration//GEN-END:variables

    private void saveCar() {
       combox();
        String model_id =(String) model_idjComboBox1.getSelectedItem();
        String color =colorjTextField1.getText();
        String year =yearjTextField1.getText();
        String price =pricejTextField1.getText();
        
     Car car =null;
     if (model_idjComboBox1.getSelectedItem().equals("")||colorjTextField1.getText().equals("")||yearjTextField1.getText().equals("")||pricejTextField1.getText().equals(""))
    {  
           JOptionPane.showMessageDialog(null,"input content index ","process add Car",JOptionPane.ERROR_MESSAGE);
    }else{
          if(updateCar){
              car =previousCar;
              car.setModel_id(model_id);
              car.setColor(color);
              car.setYear(year);
              car.setPrice(price);
          }     
          else{
              
           car =new Car(model_id,color,year,price);
          }
          try{
            
            if(updateCar){
                carDAO.updateCar(car);
            }else{
                carDAO.addCar(car);
            }
            //close Form       
            setVisible(false);
            //refresh gui list
            carGUI.refreshCarView();
            //show message
            JOptionPane.showMessageDialog(carGUI,"car saved succesfully.","Car saved",JOptionPane.INFORMATION_MESSAGE);
           
        } catch(Exception exc){
            JOptionPane.showMessageDialog(carGUI,"Error saving Car:"+ exc.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
          
     }
     
    }//End method saveCar
    
}//End class
