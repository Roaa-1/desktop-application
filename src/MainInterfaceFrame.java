import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;


public class MainInterfaceFrame extends JFrame {
    
    EmployeeLogIn e = new EmployeeLogIn();
   
    
    private JMenu file;
    private JMenuItem logOut;
    private JMenuItem exit; 
     
    private JMenu edit;
    private JMenu insert;
    private JMenuItem insertEmployee;
    private JMenuItem insertItem;
    private JMenuItem insertSupplier;
    
    private JMenu update;
    private JMenuItem updateEmployee;
    private JMenuItem updateItem;
    private JMenuItem updateSupplier;
    
    private JMenu delete;
    private JMenuItem deleteEmployee;
    private JMenuItem deleteItem;
    private JMenuItem deleteSupplier;
    
    private JMenu view;
    private JMenuItem viewEmployee;
    private JMenuItem viewItem;
    private JMenuItem viewSupplier;
    
    
   public MainInterfaceFrame(){
       
   MainInterfacePanel main=new MainInterfacePanel();
   add(main);
   setSize(1000,1000);
   setLocation(200,200);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   Icon fileIcon = new ImageIcon(getClass().getResource("file.png"));
   file = new JMenu();
   file.setToolTipText("File");
   file.setIcon(fileIcon);
    logOut = new JMenuItem("Log-Out");
    exit= new JMenuItem("Exit");
    file.add(logOut);
    file.add(exit);
    
    
    Icon editIcon = new ImageIcon(getClass().getResource("edit.png"));
    edit = new JMenu();
    edit.setToolTipText("Edit");
    edit.setIcon(editIcon);
    // create sub-menus
    insert = new JMenu("Insert");
    update = new JMenu("Update");
    delete = new JMenu("delete");
    
    
    
    insertEmployee = new JMenuItem("Insert Employee");
    insertItem= new JMenuItem("Insert Item");
    insertSupplier=  new JMenuItem("Insert Supplier");
    insert.add(insertEmployee);
    insert.add(insertItem);
    insert.add(insertSupplier);
    
    updateEmployee=  new JMenuItem("Update Employee");;
    updateItem=  new JMenuItem("Update Item");;
    updateSupplier=  new JMenuItem("Update Supplier");;
    update.add(updateEmployee);
    update.add(updateItem);
    update.add(updateSupplier);
    
    deleteEmployee=  new JMenuItem("Delete Employee");
    deleteItem = new JMenuItem("Delete Item");;
    deleteSupplier= new JMenuItem("Delete Supplier");
    delete.add(deleteEmployee);
    delete.add(deleteItem);
    delete.add(deleteSupplier);
   
    edit.add(insert);
    edit.add(update);
    edit.add(delete);
    
    // View menu
    view = new JMenu();
    view.setToolTipText("View");
    Icon viewIcon = new ImageIcon(getClass().getResource("view.png"));
    view.setIcon(viewIcon);
    
    viewEmployee= new JMenuItem();    
    
    viewEmployee= new JMenuItem("View Employees");
    viewItem= new JMenuItem("View Items");
    viewSupplier= new JMenuItem("View Suppliers");
    view.add(viewEmployee);
    view.add(viewItem);
    view.add(viewSupplier);
    
    JMenuBar bar = new JMenuBar();
    setJMenuBar(bar);
    
    bar.add(file);
    bar.add(edit);
    bar.add(view);
   
    
    logOut.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
              EmployeeLogIn frame = new EmployeeLogIn();
              frame.setVisible(true);
             dispose();
          }
          }
    );
    
    exit.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
              System.exit(0);
              }
          }
    );
    
    insertEmployee.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){ 
                  if(e.empPriv.equals("Admin")){
                    InsertEmployee frame = new InsertEmployee();
                    frame.setVisible(true);
                  }
                  else 
                    JOptionPane.showMessageDialog(MainInterfaceFrame.this, "Access is not allowed");
          }}
    );
   
    insertItem.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
              InsertItem frame = new InsertItem();
              frame.setVisible(true);
          }
          }
    );
    
    insertSupplier.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
              InsertSupplier frame = new InsertSupplier();
              frame.setVisible(true);
          }
          }
    );
    
    updateEmployee.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
              if(e.empPriv.equals("Admin")){
              UpdateEmployee frame = new UpdateEmployee();
              frame.setVisible(true);
              }
              else
              JOptionPane.showMessageDialog(MainInterfaceFrame.this, "Access is not allowed");
          }
          }
    );
    
    updateItem.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
                UpdateItem frame = new UpdateItem();
                frame.setVisible(true);
          }
          }
    );
    
    updateSupplier.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
                UpdateSupplier frame = new UpdateSupplier();
                frame.setVisible(true);
          }
          }
    );
    
    deleteItem.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
                DeleteItem frame = new DeleteItem();
                frame.setVisible(true);
          }
          }
    );
    
    deleteEmployee.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
              if(e.empPriv.equals("Admin")){
                DeleteEmployee frame = new DeleteEmployee();
                frame.setVisible(true);
              }
              else
              JOptionPane.showMessageDialog(MainInterfaceFrame.this, "Access is not allowed");
          }
          }
    );
    
    deleteSupplier.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent Event){
                DeleteSupplier frame = new DeleteSupplier();
                frame.setVisible(true);
          }
          }
    );
    
    viewEmployee.addActionListener(
    new ActionListener(){
         public void actionPerformed(ActionEvent Event) {
             if(e.empPriv.equals("Admin")){
             ViewEmployees frame = new ViewEmployees();
             frame.setVisible(true);
                  }
                  else 
                    JOptionPane.showMessageDialog(MainInterfaceFrame.this, "Access is not allowed");
             
       }
    }
    );
    
    viewItem.addActionListener(
    new ActionListener(){
       public void actionPerformed(ActionEvent e) {
             ViewItems frame = new ViewItems();
             frame.setVisible(true);       }
    
    });
    
    viewSupplier.addActionListener(
    new ActionListener(){
       public void actionPerformed(ActionEvent e) {
             ViewSuppliers frame = new ViewSuppliers();
             frame.setVisible(true);       }
    
    }
    );
    

    
    }
   
            
}
