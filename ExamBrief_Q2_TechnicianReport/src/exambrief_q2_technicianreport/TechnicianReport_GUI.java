/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exambrief_q2_technicianreport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author FS
 */
public class TechnicianReport_GUI extends javax.swing.JFrame implements ITechnician  {

    /**
     * Creates new form TechnicianReport_GUI
     */
    public TechnicianReport_GUI() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locationComboBox = new javax.swing.JComboBox<>();
        nameTextField = new javax.swing.JTextField();
        repairCostTextField = new javax.swing.JTextField();
        rateTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        processReportMenuItem = new javax.swing.JMenuItem();
        clearMenuItem = new javax.swing.JMenuItem();
        saveReportMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technician Report");

        locationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));

        jLabel1.setText("Technician Location:");

        jLabel2.setText("Technician Name:");

        jLabel3.setText("Repair Cost:");

        jLabel4.setText("Rate:");

        reportTextArea.setEditable(false);
        reportTextArea.setColumns(20);
        reportTextArea.setRows(5);
        jScrollPane1.setViewportView(reportTextArea);

        jLabel5.setText("Technician Report");

        jMenu1.setText("File");

        exitMenuItem.setText("Exit ");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        processReportMenuItem.setText("Process Report");
        processReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReportMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(processReportMenuItem);

        clearMenuItem.setText("Clear");
        clearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(clearMenuItem);

        saveReportMenuItem.setText("Save Report");
        saveReportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveReportMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(saveReportMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField)
                            .addComponent(repairCostTextField)
                            .addComponent(rateTextField)
                            .addComponent(locationComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 136, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5)))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairCostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Method to process report based on user input and display it in the text area
    private void processReport() {
     String location = (String) locationComboBox.getSelectedItem();
        String name = nameTextField.getText();
        String repairCostStr = repairCostTextField.getText();
        String rateStr = rateTextField.getText();

        if (validateData(location, name, repairCostStr, rateStr)) {
            double repairCost = Double.parseDouble(repairCostStr);
            double rate = Double.parseDouble(rateStr) / 100;  // Convert rate to percentage (10% becomes 0.1)
            double pay = calculatePay(repairCostStr, rateStr);

            // Format and display the report in the text area
            reportTextArea.setText("TECHNICIAN LOCATION: " + location + "\n" +
                                   "TECHNICIAN NAME: " + name + "\n" +
                                   "REPAIR COST: R " + repairCost + "\n" +
                                   "TECHNICIAN RATE: " + (rate * 100) + "%\n" +
                                   "CALCULATED PAY: R " + pay);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid data. Please check all fields.");
        }
    }
    
     // Method to clear all input fields and the report display area
    private void clearInputs() {
        // Reset all input components to default values
        locationComboBox.setSelectedIndex(0);  // Reset combo box to first item
        nameTextField.setText("");             // Clear name field
        repairCostTextField.setText("");       // Clear repair cost field
        rateTextField.setText("");             // Clear rate field
        reportTextArea.setText("");            // Clear report text area
    }

    // Method to save the current report to a file named "report.txt"
    private void saveReport() {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
            writer.write("TECHNICIAN REPORT\n");
            writer.write("****************************\n");
            writer.write("TECHNICIAN LOCATION: " + locationComboBox.getSelectedItem() + "\n");
            writer.write("TECHNICIAN NAME: " + nameTextField.getText() + "\n");
            writer.write("REPAIR COST: R " + repairCostTextField.getText() + "\n");
            writer.write("TECHNICIAN RATE: " + rateTextField.getText() + "%\n");
            writer.write("CALCULATED PAY: R " + calculatePay(repairCostTextField.getText(), rateTextField.getText()) + "\n");
            writer.write("****************************\n");
            JOptionPane.showMessageDialog(this, "Report saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving report.");
        }
    }

   // Calculate technician's pay by multiplying repair cost with rate (converted from percentage)
    @Override
    public double calculatePay(String repairCostStr, String rateStr) {
        double repairCost = Double.parseDouble(repairCostStr);
        double rate = Double.parseDouble(rateStr) / 100;  // Convert percentage rate to decimal
        return repairCost * rate;
    }

    // Validate input data
    @Override
    public boolean validateData(String location, String name, String repairCostStr, String rateStr) {
        if (location.isEmpty() || name.isEmpty()) return false;
        double repairCost = Double.parseDouble(repairCostStr);
        double rate = Double.parseDouble(rateStr);
        return repairCost > 0 && rate > 0;
    }

    
    private void processReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReportMenuItemActionPerformed
        processReport();
    }//GEN-LAST:event_processReportMenuItemActionPerformed

    private void clearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuItemActionPerformed
      clearInputs();
    }//GEN-LAST:event_clearMenuItemActionPerformed

    private void saveReportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveReportMenuItemActionPerformed
        saveReport();
    }//GEN-LAST:event_saveReportMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(TechnicianReport_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechnicianReport_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechnicianReport_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechnicianReport_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnicianReport_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clearMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JMenuItem processReportMenuItem;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JTextField repairCostTextField;
    private javax.swing.JTextArea reportTextArea;
    private javax.swing.JMenuItem saveReportMenuItem;
    // End of variables declaration//GEN-END:variables

}
