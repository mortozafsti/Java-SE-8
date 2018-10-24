package EvidenceSwingOne;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sun.util.logging.resources.logging;

public class StudentsView extends javax.swing.JFrame {

    public StudentsView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        ckbCodding = new javax.swing.JCheckBox();
        ckbWritting = new javax.swing.JCheckBox();
        ckbReading = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cmbRound = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        lblMsg = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        tblTableDisplay = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advance Java Evidence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Data And Display");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Age");

        txtAge.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Gender");

        buttonGroup1.add(rdMale);
        rdMale.setSelected(true);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Hobby");

        ckbCodding.setText("Codding");

        ckbWritting.setText("Writting");

        ckbReading.setText("Reading");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Round");

        cmbRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Round", "Round-32", "Round-33", "Round-34", "Round-34" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Note");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        btnDisplay.setText("Add To Table And Write To File");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClearTable.setText("ClearTable");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        btnRead.setText("DisplayFromFile");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtEmail)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ckbCodding)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ckbWritting)
                                        .addGap(18, 18, 18)
                                        .addComponent(ckbReading))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdFemale))
                                    .addComponent(cmbRound, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearTable))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRead)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckbCodding)
                        .addComponent(ckbWritting)
                        .addComponent(ckbReading)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisplay)
                    .addComponent(btnClear)
                    .addComponent(btnClearTable))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRead)
                    .addComponent(btnExit)))
        );

        tblTableDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Age", "Gender", "Hobby", "Round", "Note"
            }
        ));
        tblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDisplay);

        javax.swing.GroupLayout tblTableDisplayLayout = new javax.swing.GroupLayout(tblTableDisplay);
        tblTableDisplay.setLayout(tblTableDisplayLayout);
        tblTableDisplayLayout.setHorizontalGroup(
            tblTableDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblTableDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tblTableDisplayLayout.setVerticalGroup(
            tblTableDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblTableDisplayLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(tblTableDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblTableDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed
    public boolean checkEmailValid(String email) {

        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        if (atpos > 2 && (dotpos - atpos) > 2 && dotpos < email.length() - 2) {
            return true;
        } else {
            return false;
        }
    }
    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        String name = "", email = "", age = "0", gender = "", hobby = "", round = "", note = "";
        if (txtName.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Enter the Name");
        } else if (!checkEmailValid(txtEmail.getText()) || txtEmail.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Enter the Email");
        } else if (Integer.parseInt(txtAge.getText()) < 18 || Integer.parseInt(txtAge.getText()) > 70) {
            JOptionPane.showMessageDialog(null, "Enter the Age");
        } else if (buttonGroup1.getSelection().isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Enter the Gender");
        } else if (!ckbCodding.isSelected() && !ckbWritting.isSelected() && !ckbReading.isSelected()) {
            JOptionPane.showMessageDialog(null, "Enter the Hobby");
        } else if (cmbRound.getItemAt(cmbRound.getSelectedIndex()) == "Select A Round") {
            JOptionPane.showMessageDialog(null, "Enter the Round");
        } else if (txtNote.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Enter the Note");
        } else {
            name = txtName.getText();
            email = txtEmail.getText();
            age = txtAge.getText();
            if (rdMale.isSelected()) {
                gender = rdMale.getText();
            }
            if (rdFemale.isSelected()) {
                gender = rdFemale.getText();
            }
            if (ckbCodding.isSelected()) {
                hobby += ckbCodding.getText();
            }
            if (ckbReading.isSelected()) {
                hobby += ckbReading.getText();
            }
            if (ckbWritting.isSelected()) {
                hobby += ckbWritting.getText();
            }

            round = cmbRound.getItemAt(cmbRound.getSelectedIndex());
            note = txtNote.getText();

            Student student = new Student(name, email, age, gender, hobby, round, note);
            List<Student> students = new ArrayList<>();
            students.add(student);

            DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
            Object[] row = new Object[7];
            for (int i = 0; i < students.size(); i++) {
                row[0] = students.get(i).getName();
                row[1] = students.get(i).getEmail();
                row[2] = students.get(i).getAge();
                row[3] = students.get(i).getGender();
                row[4] = students.get(i).getHobby();
                row[5] = students.get(i).getRound();
                row[6] = students.get(i).getNote();
                model.addRow(row);

                try {
                    Utils.writeToFile("mortoza", students);

                } catch (Exception e) {
                    Logger.getLogger(StudentsView.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            lblMsg.setText("Successfully Add To the Table");

        }
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtName.setText("");
        txtEmail.setText("");
        txtAge.setText("0");

        //buttonGroup1.clearSelection();
        rdMale.setSelected(true);

        ckbCodding.setSelected(false);
        ckbWritting.setSelected(false);
        ckbReading.setSelected(false);

        cmbRound.setSelectedIndex(0);
        txtNote.setText("");

        lblMsg.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed

        String column[] = {" Name ", " Email ", " Age ", " Gender ", " Hobby ", " Round ", " Note ",};
        DefaultTableModel tableModel;
        tableModel = new DefaultTableModel(0, 7);
        tableModel.setColumnIdentifiers(column);
        tblDisplay.setModel(tableModel);
        Utils.displayFromFile("mortoza", tableModel);

    }//GEN-LAST:event_btnReadActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_btnClearTableActionPerformed

    private void tblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMouseClicked

        int i = tblDisplay.getSelectedRow();
        TableModel model = tblDisplay.getModel();
        txtName.setText(model.getValueAt(i, 0).toString());
        txtEmail.setText(model.getValueAt(i, 1).toString());
        txtAge.setText(model.getValueAt(i, 2).toString());

        String gender = model.getValueAt(i, 3).toString();
        if (rdMale.equals("Male")) {
            rdMale.setSelected(true);
        } else {
            rdMale.setSelected(false);
        }
        if (rdFemale.equals("Male")) {
            rdFemale.setSelected(true);
        } else {
            rdFemale.setSelected(false);
        }
        String hobby = model.getValueAt(i, 4).toString();
        if (hobby.contains("Codding")) {
            ckbCodding.setSelected(true);
        } else {
            ckbCodding.setSelected(false);
        }
        if (hobby.contains("Reading")) {
            ckbReading.setSelected(true);
        } else {
            ckbReading.setSelected(false);
        }
        if (hobby.contains("Writting")) {
            ckbWritting.setSelected(true);
        } else {
            ckbWritting.setSelected(false);
        }
        String round = model.getValueAt(i, 5).toString();
        cmbRound.setSelectedItem(round);

        txtNote.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_tblDisplayMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRead;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbCodding;
    private javax.swing.JCheckBox ckbReading;
    private javax.swing.JCheckBox ckbWritting;
    private javax.swing.JComboBox<String> cmbRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JPanel tblTableDisplay;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNote;
    // End of variables declaration//GEN-END:variables
}
