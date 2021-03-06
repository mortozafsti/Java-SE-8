/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Domain.DailyCollectionReport;
import Service.DailyCollectionService;
import Utils.DailyCollectionReportService;
import Utils.MenuForFieldAssisteant;
import Utils.MenuForManager;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DailyCollectionReportFormSingleView extends javax.swing.JFrame {

    /**
     * Creates new form DailyCollectionReportView
     */
    public DailyCollectionReportFormSingleView() {
        initComponents();
        comboBoxItemFromDatabase();
        MenuForFieldAssisteant.menuManager(this);
        displayCollectionByDailyBasisIntoTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCollectionDisplay = new javax.swing.JTable();
        cmbMonth = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Member Code");

        tblCollectionDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "M_Code", "Day1", "Day2", "Day3", "Day4", "Day5", "Day6", "Day7", "Day8", "Day9", "Day10", "Day11", "Day12", "Day13", "Day14", "Day15", "Day16", "Day17", "Day18", "Day19", "Day20", "Day21", "Day22", "Day23", "Day24", "Day25", "Day26", "Day27", "Day28", "Day29", "Day30", "Day31"
            }
        ));
        jScrollPane2.setViewportView(tblCollectionDisplay);

        cmbMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonthItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonthItemStateChanged

        displayCollectionByDailyBasisIntoTable();

    }//GEN-LAST:event_cmbMonthItemStateChanged

    /**
     * @param args the command line arguments
     */
    private DefaultComboBoxModel comboBoxModel = null;

    public void comboBoxItemFromDatabase() {
        comboBoxModel = new DefaultComboBoxModel();
        /*    List<DailyCollection> dailyCollections = DailyCollectionService.getMonthList();
        for (DailyCollection dc : dailyCollections) {
            comboBoxModel.addElement(dc.getMonth()); 
        }
        cmbMonth.setModel(comboBoxModel); */
    }

    public void displayCollectionByDailyBasisIntoTable() {
        DefaultTableModel model = (DefaultTableModel) tblCollectionDisplay.getModel();
        Object[] row = new Object[33];
        String selectMonth = cmbMonth.getItemAt(cmbMonth.getSelectedIndex());
        List<DailyCollectionReport> list = DailyCollectionReportService.dailyCollectForSinglememberView(DailyCollectionService.getDailyCollectionByMonthAndMCode(11,"0015"));
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getName();
            row[1] = list.get(i).getCode();
            row[2] = list.get(i).getDayAmount1();
            row[3] = list.get(i).getDayAmount2();
            row[4] = list.get(i).getDayAmount3();
            row[5] = list.get(i).getDayAmount4();
            row[6] = list.get(i).getDayAmount5();
            row[7] = list.get(i).getDayAmount6();
            row[8] = list.get(i).getDayAmount7();
            row[9] = list.get(i).getDayAmount8();
            row[10] = list.get(i).getDayAmount9();
            row[11] = list.get(i).getDayAmount10();
            row[12] = list.get(i).getDayAmount11();
            row[13] = list.get(i).getDayAmount12();
            row[14] = list.get(i).getDayAmount13();
            row[15] = list.get(i).getDayAmount14();
            row[16] = list.get(i).getDayAmount15();
            row[17] = list.get(i).getDayAmount16();
            row[18] = list.get(i).getDayAmount17();
            row[19] = list.get(i).getDayAmount18();
            row[20] = list.get(i).getDayAmount19();
            row[21] = list.get(i).getDayAmount20();
            row[22] = list.get(i).getDayAmount21();
            row[23] = list.get(i).getDayAmount22();
            row[24] = list.get(i).getDayAmount23();
            row[25] = list.get(i).getDayAmount24();
            row[26] = list.get(i).getDayAmount25();
            row[27] = list.get(i).getDayAmount26();
            row[28] = list.get(i).getDayAmount27();
            row[29] = list.get(i).getDayAmount28();
            row[30] = list.get(i).getDayAmount29();
            row[31] = list.get(i).getDayAmount30();
            row[32] = list.get(i).getDayAmount31();
            
            model.addRow(row);

        }
    }

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
            java.util.logging.Logger.getLogger(DailyCollectionReportFormSingleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DailyCollectionReportFormSingleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DailyCollectionReportFormSingleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyCollectionReportFormSingleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DailyCollectionReportFormSingleView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCollectionDisplay;
    // End of variables declaration//GEN-END:variables
}
