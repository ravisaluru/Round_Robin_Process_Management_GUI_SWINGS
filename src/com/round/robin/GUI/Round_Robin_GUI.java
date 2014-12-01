/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.round.robin.GUI;

import java.text.DecimalFormat;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import round_robin_processing.Driver;
import round_robin_processing.Process;

/**
 *
 * @author Ravi
 */
public class Round_Robin_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Round_Robin_GUI
     */
    public Round_Robin_GUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        newProcessListTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        processedProcessesListTable = new javax.swing.JTable();
        cpuUsageHeaderLabel = new javax.swing.JLabel();
        cpuUsageDisplayValueLabel = new javax.swing.JLabel();
        numberOfProcessLabel = new javax.swing.JLabel();
        valueOfProcessToAddInputText = new javax.swing.JTextField();
        setNumberOfProcessesButton = new javax.swing.JButton();
        burstTimeInputLabel = new javax.swing.JLabel();
        valueOfQuantumTimeValueTextField = new javax.swing.JTextField();
        quantumTimeValueInputButton = new javax.swing.JButton();
        mainSimulateActionButton = new javax.swing.JButton();
        newProcessListLabel = new javax.swing.JLabel();
        processedListLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Round Robin Process Simulation");
        setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        newProcessListTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), java.awt.Color.lightGray));
        newProcessListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process Id", "Arrival Time", "Burst Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        newProcessListTable.setToolTipText("The New Process Added to the system are listed here!");
        newProcessListTable.setName("New Processes Added List"); // NOI18N
        jScrollPane1.setViewportView(newProcessListTable);
        if (newProcessListTable.getColumnModel().getColumnCount() > 0) {
            newProcessListTable.getColumnModel().getColumn(0).setResizable(false);
            newProcessListTable.getColumnModel().getColumn(1).setResizable(false);
            newProcessListTable.getColumnModel().getColumn(2).setResizable(false);
        }

        processedProcessesListTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 153), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 153, 153), new java.awt.Color(255, 204, 204)));
        processedProcessesListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process Id", "Burst Time", "Waitl Time", "Turn Around Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        processedProcessesListTable.setToolTipText("The Processed Processes are displayed here!");
        processedProcessesListTable.setName("Processed Processes List"); // NOI18N
        jScrollPane2.setViewportView(processedProcessesListTable);
        if (processedProcessesListTable.getColumnModel().getColumnCount() > 0) {
            processedProcessesListTable.getColumnModel().getColumn(0).setResizable(false);
            processedProcessesListTable.getColumnModel().getColumn(1).setResizable(false);
            processedProcessesListTable.getColumnModel().getColumn(2).setResizable(false);
            processedProcessesListTable.getColumnModel().getColumn(3).setResizable(false);
        }

        cpuUsageHeaderLabel.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        cpuUsageHeaderLabel.setLabelFor(cpuUsageHeaderLabel);
        cpuUsageHeaderLabel.setText("CPU Usage");
        cpuUsageHeaderLabel.setToolTipText("");
        cpuUsageHeaderLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(204, 204, 255)));
        cpuUsageHeaderLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cpuUsageHeaderLabel.setIconTextGap(10);

        cpuUsageDisplayValueLabel.setLabelFor(cpuUsageDisplayValueLabel);
        cpuUsageDisplayValueLabel.setToolTipText("The total CPU usage Value");
        cpuUsageDisplayValueLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        numberOfProcessLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        numberOfProcessLabel.setLabelFor(numberOfProcessLabel);
        numberOfProcessLabel.setText("Enter the Number of Processes To Simulate");

        valueOfProcessToAddInputText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valueOfProcessToAddInputText.setToolTipText("Enter the Number of Processes for Simulation as an Integer");
        valueOfProcessToAddInputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueOfProcessToAddInputTextActionPerformed(evt);
            }
        });

        setNumberOfProcessesButton.setText("Add");
        setNumberOfProcessesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNumberOfProcessesButtonActionPerformed(evt);
            }
        });

        burstTimeInputLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        burstTimeInputLabel.setLabelFor(burstTimeInputLabel);
        burstTimeInputLabel.setText("Enter the Quantum Time for the Processes To Simulate");

        valueOfQuantumTimeValueTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valueOfQuantumTimeValueTextField.setToolTipText("Enter the Quantum Time as an Decimal, exmaple 4.4");
        valueOfQuantumTimeValueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueOfQuantumTimeValueTextFieldActionPerformed(evt);
            }
        });

        quantumTimeValueInputButton.setText("Add");
        quantumTimeValueInputButton.setToolTipText("Select to Freeze the Burst Time");
        quantumTimeValueInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantumTimeValueInputButtonActionPerformed(evt);
            }
        });

        mainSimulateActionButton.setText("Simulate");
        mainSimulateActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSimulateActionButtonActionPerformed(evt);
            }
        });

        newProcessListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newProcessListLabel.setText("The New Process Added to the system are listed here!");

        processedListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processedListLabel.setText("The Processed Processes are displayed here!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(newProcessListLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numberOfProcessLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpuUsageHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(cpuUsageDisplayValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mainSimulateActionButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(valueOfProcessToAddInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(setNumberOfProcessesButton)))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processedListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(valueOfQuantumTimeValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(quantumTimeValueInputButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(burstTimeInputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cpuUsageDisplayValueLabel, cpuUsageHeaderLabel, mainSimulateActionButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newProcessListLabel)
                            .addComponent(processedListLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cpuUsageHeaderLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cpuUsageDisplayValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(mainSimulateActionButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfProcessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burstTimeInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNumberOfProcessesButton)
                    .addComponent(quantumTimeValueInputButton)
                    .addComponent(valueOfQuantumTimeValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueOfProcessToAddInputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cpuUsageHeaderLabel, mainSimulateActionButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valueOfProcessToAddInputTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueOfProcessToAddInputTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueOfProcessToAddInputTextActionPerformed

    private void setNumberOfProcessesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNumberOfProcessesButtonActionPerformed
        // TODO add your handling code here:
        try{
            Driver.numProcesses = Integer.parseInt(valueOfProcessToAddInputText.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Please Enter Only Integer", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Oops Error Thrown Round_Robin_GUI -> setsetNumberOfProcessesButtonActionPerformed, error message =[" + ex.getMessage() + "]");
        }
    }//GEN-LAST:event_setNumberOfProcessesButtonActionPerformed

    private void quantumTimeValueInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantumTimeValueInputButtonActionPerformed
        // TODO add your handling code here:
        try{
            DecimalFormat format = new DecimalFormat("#.#");
            Driver.timeQuantum = Double.parseDouble(valueOfQuantumTimeValueTextField.getText());
            Driver.timeQuantum = Double.parseDouble(format.format(Driver.timeQuantum));
            valueOfQuantumTimeValueTextField.setEditable(Boolean.FALSE);
            valueOfQuantumTimeValueTextField.setText(Driver.timeQuantum.toString());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Please Enter Only Decimal Format", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Oops Error Thrown Round_Robin_GUI -> setsetNumberOfProcessesButtonActionPerformed, error message =[" + ex.getMessage() + "]");
        }
        
    }//GEN-LAST:event_quantumTimeValueInputButtonActionPerformed

    private void valueOfQuantumTimeValueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueOfQuantumTimeValueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueOfQuantumTimeValueTextFieldActionPerformed

    private void mainSimulateActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSimulateActionButtonActionPerformed
        // TODO add your handling code here:
        if(Driver.numProcesses == null && Driver.timeQuantum == null){
            JOptionPane.showMessageDialog(this, "Please set the Number of Process and the Quantum before selecting Simulate", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Driver.simulate();
            DefaultTableModel model = (DefaultTableModel) newProcessListTable.getModel();
            if(Driver.processList != null && !Driver.processList.isEmpty()){
                Iterator<Process> it = Driver.processList.iterator();
                while(it.hasNext()){
                    model.addRow(getRowObject(it.next()));
                }
            }
        }
    }//GEN-LAST:event_mainSimulateActionButtonActionPerformed

    private Object[] getRowObject(Process p){
        Integer pid = p.getPid();
        Double arrivalTime = p.getArrivalTime();
        Double burstTime = p.getBurstTime();
        Object[] row = {pid, arrivalTime, burstTime};
        return row;
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
            java.util.logging.Logger.getLogger(Round_Robin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Round_Robin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Round_Robin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Round_Robin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Round_Robin_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel burstTimeInputLabel;
    private javax.swing.JLabel cpuUsageDisplayValueLabel;
    private javax.swing.JLabel cpuUsageHeaderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainSimulateActionButton;
    private javax.swing.JLabel newProcessListLabel;
    private javax.swing.JTable newProcessListTable;
    private javax.swing.JLabel numberOfProcessLabel;
    private javax.swing.JLabel processedListLabel;
    private javax.swing.JTable processedProcessesListTable;
    private javax.swing.JButton quantumTimeValueInputButton;
    private javax.swing.JButton setNumberOfProcessesButton;
    private javax.swing.JTextField valueOfProcessToAddInputText;
    private javax.swing.JTextField valueOfQuantumTimeValueTextField;
    // End of variables declaration//GEN-END:variables
}
