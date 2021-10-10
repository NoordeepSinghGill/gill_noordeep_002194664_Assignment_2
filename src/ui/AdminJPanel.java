/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Driver;
import model.DriverDetails;

/**
 *
 * @author 91942
 */
public class AdminJPanel extends javax.swing.JPanel {

    DriverDetails newDriver;
    private JPanel workArea;
    /**
     * Creates new form AdminJPanel
     */
    public AdminJPanel(JPanel workArea, DriverDetails newDriver) {
        initComponents();
        this.workArea = workArea;
        this.newDriver = newDriver;
        populateDriver();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDriver = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        chkexpired = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblexpired = new javax.swing.JTable();
        btnCheckStatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Username");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Admin control Panel");

        tblDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Driver name", "Password", "City", "Color", "Car Model", "Manufacturer", "Date of Manufacturer", "Seats", "Serial Number", "Telephone", "Maintanance Validity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDriver);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        chkexpired.setText("Expired Maintance Certificate");

        tblexpired.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Driver name", "Maintenance Certificate", "City", "Color", "Car Model", "Manufacturer", "Date of Manufacturer", "Seats", "Serial Number", "Telephone", "Maintanance Validity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblexpired);

        btnCheckStatus.setText("Check Status");
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 171, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(chkexpired)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btnCheckStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkexpired)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheckStatus)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String username = txtusername.getText(); 
        String password = txtpassword.getText();
        
        Driver vs = newDriver.addNewDriver();
        vs.setName(txtusername.getText());
        vs.setPassword(txtpassword.getText());
        
        JOptionPane.showMessageDialog(this, "Driver login credentials saved");
        
        txtusername.setText("");
        txtpassword.setText("");
        
        populateDriver();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int index = tblDriver.getSelectedRow();
        if(index < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDriver.getModel();
        Driver SelectedDriver = (Driver) model.getValueAt(index, 0);
        
        newDriver.deleteDriver(SelectedDriver);
        populateDriver();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int index = tblDriver.getSelectedRow();
        if(index < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to Update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDriver.getModel();
        Driver SelectedDriver = (Driver) model.getValueAt(index, 0);
        
        //admin updating Driver info
        newDriver.setAdminupdatecity(SelectedDriver.getCity());
        newDriver.setAdminupdatecolor(SelectedDriver.getColor());
        newDriver.setAdminupdatecarmodel(SelectedDriver.getCarmodel());
        newDriver.setAdminupdatemanufacturer(SelectedDriver.getManufacturer());
        newDriver.setAdminupdatedateofmanufacture(SelectedDriver.getDateofmanufacture());
        newDriver.setAdminupdateseats(SelectedDriver.getSeats());
        newDriver.setAdminupdateserialnumber(SelectedDriver.getSerialnumber());
        newDriver.setAdminuodatetelephonenumber(SelectedDriver.getTelephonenumber());
    
        //populateDriver();
        System.out.println(SelectedDriver);
        newDriver.setDriverforupdate(SelectedDriver.toString());
        AdminUpdateDriverJPanel updateDriver = new AdminUpdateDriverJPanel(workArea, newDriver);
        workArea.add("CustomerJPanel", updateDriver);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
       
        deletepreviousdata();
        
        if(chkexpired.isSelected()){
            DefaultTableModel model = (DefaultTableModel) tblexpired.getModel();
            model.setRowCount(0);
        
         for(Driver vs : newDriver.getNewDriver()){
            if(vs.getMaintananceExpired().equals("Expired")){
           Object[] row = new Object[11];
            row[0] = vs;
            row[1] = vs.getMaintananceExpired();
            row[2] = vs.getCity();
            row[3] = vs.getColor();
            row[4] = vs.getCarmodel();
            row[5] = vs.getManufacturer();
            row[6] = vs.getDateofmanufacture();
            row[7] = vs.getSeats();
            row[8] = vs.getSerialnumber();
            row[9] = vs.getTelephonenumber();
            row[10] = vs.getMaintananceExpired();
            model.addRow(row);
            }
         }
       }
        else{
               JOptionPane.showMessageDialog(this, "Please check the maintenance certificate checkbox");
           }
    }//GEN-LAST:event_btnCheckStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkexpired;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDriver;
    private javax.swing.JTable tblexpired;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private void populateDriver() {
        DefaultTableModel model = (DefaultTableModel) tblDriver.getModel();
        model.setRowCount(0);
        
        for(Driver vs : newDriver.getNewDriver()){
            Object[] row = new Object[11];
            row[0] = vs;
            row[1] = vs.getPassword();
            row[2] = vs.getCity();
            row[3] = vs.getColor();
            row[4] = vs.getCarmodel();
            row[5] = vs.getManufacturer();
            row[6] = vs.getDateofmanufacture();
            row[7] = vs.getSeats();
            row[8] = vs.getSerialnumber();
            row[9] = vs.getTelephonenumber();
            row[10] = vs.getMaintananceExpired();
            model.addRow(row);
        }
        
    }

    private void deletepreviousdata() {
        DefaultTableModel model = (DefaultTableModel) tblexpired.getModel();
        while(model.getRowCount() > 0){
            for(int i=0; i<model.getRowCount();i++){
                model.removeRow(i);
            }
        
        } 
    
    }
}