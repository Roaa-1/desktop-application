
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UpdateEmployee extends javax.swing.JFrame {
    
    Connection connection =null;
    Statement statement = null;
    ResultSet resultSet = null;
    String query;
    PreparedStatement stmt;
    
    public UpdateEmployee() {
        initComponents();
        doConnect();
    }
    public void doConnect(){
    try{
        String URL="jdbc:mysql://localhost:3306/SuperMarket";
        String username ="root";
        String password="12341234a";
        connection = DriverManager.getConnection(URL,username,password);
        statement= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

    }
     catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JRadioButton();
        phone = new javax.swing.JRadioButton();
        privillege = new javax.swing.JRadioButton();
        password = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        empID = new javax.swing.JTextField();
        updateEmp = new javax.swing.JButton();
        empName = new javax.swing.JTextField();
        empPhone = new javax.swing.JTextField();
        empPass = new javax.swing.JTextField();
        EmpPrivllige = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(200, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hiragino Kaku Gothic Std", 0, 14))); // NOI18N

        name.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        name.setText("Name");

        phone.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        phone.setText("Phone");

        privillege.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        privillege.setText("Privillege");

        password.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        password.setText("Password");

        jLabel1.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 2, 12)); // NOI18N
        jLabel1.setText("Please Enter The Employee ID :");

        updateEmp.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 14)); // NOI18N
        updateEmp.setText("Update");
        updateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmpActionPerformed(evt);
            }
        });

        empName.setColumns(10);

        empPhone.setColumns(10);

        empPass.setColumns(10);

        EmpPrivllige.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "Admin" }));

        cancel.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(name)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(privillege))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password)
                                    .addComponent(phone))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(empPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmpPrivllige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(empPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(empPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privillege)
                    .addComponent(EmpPrivllige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmpActionPerformed
    
        if(name.isSelected()||phone.isSelected()||privillege.isSelected()||password.isSelected()){
        if(empID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Enter the ID!");}
        else {
      int fieldCount=0;
      int id = Integer.parseInt(empID.getText());
        
    
         
          if(name.isSelected()){
              try{
              query="UPDATE employee SET emp_name=? WHERE ID=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, empName.getText());
              stmt.setInt(2, id);
                stmt.executeUpdate();
              fieldCount++;
              
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
          }
          
          if(phone.isSelected()){
              try{
              query="UPDATE employee SET phone=? WHERE ID=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, empPhone.getText());
              stmt.setInt(2, id);
              stmt.executeUpdate();
              fieldCount++;
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
          }
          
          if(privillege.isSelected()){

              try{
              int priv=EmpPrivllige.getSelectedIndex();
              
              String value;
              if(priv==0)
                value="Staff";
              else 
                value="Admin";
              
            
              query="UPDATE employee SET privillege=? WHERE ID=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, value);
              stmt.setInt(2, id);
              stmt.executeUpdate();
              fieldCount++; 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
          }
          
          if(password.isSelected()){
              try{
              query="UPDATE employee SET emp_password=? WHERE ID=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, empPass.getText());
              stmt.setInt(2, id);
              stmt.executeUpdate();
              fieldCount++;
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
             }

              JOptionPane.showMessageDialog(this, ""+ fieldCount+" Fields is updated successfully");
     }}
     else 
         JOptionPane.showMessageDialog(this, "Please select an option!");
      
    }//GEN-LAST:event_updateEmpActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EmpPrivllige;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField empID;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empPass;
    private javax.swing.JTextField empPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton name;
    private javax.swing.JRadioButton password;
    private javax.swing.JRadioButton phone;
    private javax.swing.JRadioButton privillege;
    private javax.swing.JButton updateEmp;
    // End of variables declaration//GEN-END:variables
}
