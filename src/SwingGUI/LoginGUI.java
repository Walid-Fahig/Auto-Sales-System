
package SwingGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class LoginGUI extends javax.swing.JFrame {
    
     Connection conn;
     ResultSet rs;
     PreparedStatement pst;
    
    public LoginGUI() {
        initComponents();
         try{           
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","");
            System.out.println("LoginDB  - DB  connection successful to:");
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        combox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel1 = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        usernameComboBox1 = new javax.swing.JComboBox<>();
        goButton1 = new javax.swing.JButton();
        imagekiajLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        usernameLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel1.setText("Username");

        passwordLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel1.setText("Password");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        usernameComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        goButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        goButton1.setText("GO");
        goButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButton1ActionPerformed(evt);
            }
        });

        imagekiajLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imagekiajLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iwdwdndex.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/imagewsds.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("منظومة معرض سيارات");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(passwordLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameComboBox1, 0, 289, Short.MAX_VALUE))))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagekiajLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagekiajLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(goButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combox(){
        
        try{
            String  sql="select name from login";
            pst=conn.prepareStatement(sql);
            rs =pst.executeQuery();
            
            while(rs.next()){
                String name=rs.getString("name");
                usernameComboBox1.addItem(name);
            }
        } catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
        }
    }
    
    
    
    private void goButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButton1ActionPerformed
      
       try
       {
           String sql="select * from login where name=? and  password=?";
           pst=conn.prepareStatement(sql);
           pst.setString(1, (String) usernameComboBox1.getSelectedItem());
           pst.setString(2, String.valueOf(jPasswordField1.getPassword()));
           rs=pst.executeQuery();
           if(rs.next())
           {
               MainInterfacee Interface=new MainInterfacee() ;
               LoginGUI.this.setVisible(false);
               Interface.refreshModelView();
               Interface.setVisible(true);
               
           }
           else
           {
           JOptionPane.showMessageDialog(null,"invalid login","invalid login",0);    
           }      
       }  
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(this, "Error during login", "Error",
					JOptionPane.ERROR_MESSAGE);		
       }
    }//GEN-LAST:event_goButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
  
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goButton1;
    private javax.swing.JLabel imagekiajLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JComboBox<String> usernameComboBox1;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables

   
}
