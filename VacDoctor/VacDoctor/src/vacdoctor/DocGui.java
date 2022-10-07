/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacdoctor;

/**23/3/22
 *DocGui.java
 * @author John Ringrose
 */
public class DocGui extends javax.swing.JFrame {
 // data memebers
    DocPQ myDocPQ;
    /**
     * Creates new form DocGui
     */
    public DocGui() {
        initComponents();
        myDocPQ = new DocPQ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        patientDetailsLBL = new javax.swing.JLabel();
        patienrDetailsLBL = new javax.swing.JTextField();
        priorityLBL = new javax.swing.JLabel();
        priorityTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        removeBTN = new javax.swing.JButton();
        nextBTn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        listBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLBL.setText("Name:");

        patientDetailsLBL.setText("Patient Details");

        priorityLBL.setText("Priority");

        priorityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityTFActionPerformed(evt);
            }
        });

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        removeBTN.setText("Remove");
        removeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTNActionPerformed(evt);
            }
        });

        nextBTn.setText("Next in Queue");
        nextBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTnActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        listBTN.setText("List");
        listBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBTNActionPerformed(evt);
            }
        });

        displayBTN.setText("Display people registered for vaccine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priorityLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priorityTF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(removeBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(nextBTn))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(patientDetailsLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patienrDetailsLBL))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(listBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientDetailsLBL)
                    .addComponent(patienrDetailsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLBL)
                    .addComponent(priorityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(removeBTN)
                    .addComponent(listBTN)
                    .addComponent(nextBTn)
                    .addComponent(displayBTN))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_removeBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        //get peerson name
        Person temp = new Person();//temp person
        temp.setName(nameLBL.getText());//used set method I put the data from user into Person
        temp.setDetails(patienrDetailsLBL.getText());//get p
        //create temp person object
        //get priorityRating
        int priority = Integer.parseInt(priorityTF.getText());
        //create temp PQElement
        PQElement tempPQE = new PQElement(temp, priority);
        //add the temp PQElement to myDocPQ using enqueue()
        myDocPQ.enqueue(priority, temp);
        displayTA.append("\nPerson added");
    }//GEN-LAST:event_addBTNActionPerformed

    private void nextBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTnActionPerformed
        // TODO add your handling code here:
        // create temp PQElement
    }//GEN-LAST:event_nextBTnActionPerformed

    private void priorityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityTFActionPerformed

    private void listBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBTNActionPerformed
        // TODO add your handling code here:
       printPQ();
    }//GEN-LAST:event_listBTNActionPerformed

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
            java.util.logging.Logger.getLogger(DocGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton displayBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listBTN;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBTn;
    private javax.swing.JTextField patienrDetailsLBL;
    private javax.swing.JLabel patientDetailsLBL;
    private javax.swing.JLabel priorityLBL;
    private javax.swing.JTextField priorityTF;
    private javax.swing.JButton removeBTN;
    // End of variables declaration//GEN-END:variables
}