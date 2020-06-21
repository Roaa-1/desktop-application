
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UpdateItem extends javax.swing.JFrame {

    Connection connection =null;
    Statement statement = null;
    ResultSet resultSet = null;
    String query;
    PreparedStatement stmt;
    
    public UpdateItem() {
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

        jTextField7 = new javax.swing.JTextField();
        itemSN = new javax.swing.JPanel();
        name = new javax.swing.JRadioButton();
        category = new javax.swing.JRadioButton();
        supplier = new javax.swing.JRadioButton();
        amount = new javax.swing.JRadioButton();
        price = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        itemID = new javax.swing.JTextField();
        updateItem = new javax.swing.JButton();
        itemName = new javax.swing.JTextField();
        itemCateg = new javax.swing.JTextField();
        itemPrice = new javax.swing.JTextField();
        itemSupp = new javax.swing.JTextField();
        itemAmount = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextField7.setColumns(10);

        setLocation(new java.awt.Point(200, 200));

        itemSN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hiragino Kaku Gothic Std", 0, 14))); // NOI18N

        name.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        name.setText("Name");

        category.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        category.setText("Category");

        supplier.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        supplier.setText("Supplier");

        amount.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        amount.setText("Amount");

        price.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 12)); // NOI18N
        price.setText("Price");

        jLabel1.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 2, 12)); // NOI18N
        jLabel1.setText("Please Enter The Item Serial Number :");

        updateItem.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 14)); // NOI18N
        updateItem.setText("Update");
        updateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemActionPerformed(evt);
            }
        });

        itemName.setColumns(10);

        itemCateg.setColumns(10);

        itemPrice.setColumns(10);

        itemSupp.setColumns(10);

        itemAmount.setColumns(10);

        cancel.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemSNLayout = new javax.swing.GroupLayout(itemSN);
        itemSN.setLayout(itemSNLayout);
        itemSNLayout.setHorizontalGroup(
            itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemSNLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addGroup(itemSNLayout.createSequentialGroup()
                        .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price)
                            .addComponent(category)
                            .addComponent(supplier)
                            .addComponent(amount))
                        .addGap(34, 34, 34)
                        .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSNLayout.createSequentialGroup()
                                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemSupp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(itemSNLayout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(itemSNLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1)))
                                .addGap(45, 45, 45))
                            .addComponent(itemID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        itemSNLayout.setVerticalGroup(
            itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSNLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemSNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category)
                    .addComponent(itemCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier)
                    .addComponent(itemSupp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemSNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount)
                    .addComponent(itemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/item.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(itemSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void updateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemActionPerformed

        if(name.isSelected()||price.isSelected()||category.isSelected()||supplier.isSelected()||amount.isSelected()){
        int fieldCount=0;
        if(itemID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Enter the Serial Number");}
        else {
        int sn = Integer.parseInt(itemID.getText());
        
     
          if(name.isSelected()){
              try{
              query="UPDATE items SET item_name=? WHERE item_sn=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, itemName.getText());
              stmt.setInt(2, sn);
              stmt.executeUpdate();
              fieldCount++;
              
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
          }
          
          if(price.isSelected()){
              try{
              query="UPDATE items SET item_price=? WHERE item_sn=?";
              stmt=connection.prepareStatement(query);
              stmt.setDouble(1, Double.parseDouble(itemPrice.getText()));
              stmt.setInt(2, sn);
              stmt.executeUpdate();
              fieldCount++;
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
          }
          
          if(category.isSelected()){

              try{
  
              query="UPDATE items SET item_category=? WHERE item_sn=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, itemCateg.getText());
              stmt.setInt(2, sn);
              stmt.executeUpdate();
              fieldCount++;
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
          }
          
          if(supplier.isSelected()){

              try{
              query="UPDATE items SET supplier_id=? WHERE item_sn=?";
              stmt=connection.prepareStatement(query);
              stmt.setString(1, itemSupp.getText());
              stmt.setInt(2, sn);
              stmt.executeUpdate();
              fieldCount++;
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
             }
          

            if(amount.isSelected()){

              try{
              query="UPDATE items SET item_amount=? WHERE item_sn=?";
              stmt=connection.prepareStatement(query);
              stmt.setInt(1, Integer.parseInt(itemAmount.getText()));
              stmt.setInt(2, sn);
              stmt.executeUpdate();
              fieldCount++;
 
              }
              catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
          
              }  
             }
            
              JOptionPane.showMessageDialog(this,""+ fieldCount+" Fields Updated Successfully");
        }}
        else
            JOptionPane.showMessageDialog(this, "Please select an option!");
      
    }//GEN-LAST:event_updateItemActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amount;
    private javax.swing.JButton cancel;
    private javax.swing.JRadioButton category;
    private javax.swing.JTextField itemAmount;
    private javax.swing.JTextField itemCateg;
    private javax.swing.JTextField itemID;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JPanel itemSN;
    private javax.swing.JTextField itemSupp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JRadioButton name;
    private javax.swing.JRadioButton price;
    private javax.swing.JRadioButton supplier;
    private javax.swing.JButton updateItem;
    // End of variables declaration//GEN-END:variables
}
