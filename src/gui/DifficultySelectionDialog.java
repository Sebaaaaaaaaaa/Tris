package gui;

public class DifficultySelectionDialog extends javax.swing.JDialog {
    
    public DifficultySelectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        easyDifficultyButton = new javax.swing.JToggleButton();
        mediumDifficultyButton = new javax.swing.JToggleButton();
        impossibleDifficultyButton = new javax.swing.JToggleButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(760, 465));
        setMaximumSize(new java.awt.Dimension(400, 150));
        setMinimumSize(new java.awt.Dimension(400, 150));
        setPreferredSize(new java.awt.Dimension(400, 150));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 150));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(easyDifficultyButton);
        easyDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyDifficultyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(easyDifficultyButton, gridBagConstraints);

        buttonGroup1.add(mediumDifficultyButton);
        mediumDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumDifficultyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(mediumDifficultyButton, gridBagConstraints);

        buttonGroup1.add(impossibleDifficultyButton);
        impossibleDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impossibleDifficultyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(impossibleDifficultyButton, gridBagConstraints);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(okButton, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void easyDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyDifficultyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_easyDifficultyButtonActionPerformed

    private void mediumDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumDifficultyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumDifficultyButtonActionPerformed

    private void impossibleDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impossibleDifficultyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impossibleDifficultyButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton easyDifficultyButton;
    private javax.swing.JToggleButton impossibleDifficultyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton mediumDifficultyButton;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
