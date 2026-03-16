package gui;

public class DifficultySelectionDialog extends javax.swing.JDialog {
    
    private Integer difficulty = 1;
    private Boolean isPlayerStarting = true;
    
    public DifficultySelectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        difficultyButtonsGroup = new javax.swing.ButtonGroup();
        startingPlayerButtonsGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        easyDifficultyButton = new javax.swing.JToggleButton();
        mediumDifficultyButton = new javax.swing.JToggleButton();
        impossibleDifficultyButton = new javax.swing.JToggleButton();
        okButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerButton = new javax.swing.JToggleButton();
        superRobotButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(760, 465));
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 150));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        easyDifficultyButton.setBackground(new java.awt.Color(51, 204, 0));
        difficultyButtonsGroup.add(easyDifficultyButton);
        easyDifficultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/EASY_MODE_IMG.png"))); // NOI18N
        easyDifficultyButton.setSelected(true);
        easyDifficultyButton.setBorderPainted(false);
        easyDifficultyButton.setFocusable(false);
        easyDifficultyButton.setMaximumSize(new java.awt.Dimension(50, 50));
        easyDifficultyButton.setMinimumSize(new java.awt.Dimension(50, 50));
        easyDifficultyButton.setPreferredSize(new java.awt.Dimension(50, 50));
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

        mediumDifficultyButton.setBackground(new java.awt.Color(255, 153, 0));
        difficultyButtonsGroup.add(mediumDifficultyButton);
        mediumDifficultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/MEDIUM_MODE_IMG.png"))); // NOI18N
        mediumDifficultyButton.setBorderPainted(false);
        mediumDifficultyButton.setFocusable(false);
        mediumDifficultyButton.setMaximumSize(new java.awt.Dimension(50, 50));
        mediumDifficultyButton.setMinimumSize(new java.awt.Dimension(50, 50));
        mediumDifficultyButton.setPreferredSize(new java.awt.Dimension(50, 50));
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

        impossibleDifficultyButton.setBackground(new java.awt.Color(102, 0, 0));
        difficultyButtonsGroup.add(impossibleDifficultyButton);
        impossibleDifficultyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/HARD_MODE_IMG.png"))); // NOI18N
        impossibleDifficultyButton.setBorderPainted(false);
        impossibleDifficultyButton.setFocusable(false);
        impossibleDifficultyButton.setMaximumSize(new java.awt.Dimension(50, 50));
        impossibleDifficultyButton.setMinimumSize(new java.awt.Dimension(50, 50));
        impossibleDifficultyButton.setPreferredSize(new java.awt.Dimension(50, 50));
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

        okButton.setBackground(new java.awt.Color(0, 0, 0));
        okButton.setFont(new java.awt.Font("Adwaita Mono", 1, 18)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("OK");
        okButton.setBorderPainted(false);
        okButton.setFocusable(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(okButton, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(127, 7, 153));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        playerButton.setBackground(new java.awt.Color(127, 7, 153));
        startingPlayerButtonsGroup.add(playerButton);
        playerButton.setFont(new java.awt.Font("Adwaita Mono", 1, 18)); // NOI18N
        playerButton.setForeground(new java.awt.Color(255, 255, 255));
        playerButton.setSelected(true);
        playerButton.setText("PLAYER");
        playerButton.setBorderPainted(false);
        playerButton.setFocusable(false);
        playerButton.setMaximumSize(new java.awt.Dimension(100, 25));
        playerButton.setMinimumSize(new java.awt.Dimension(100, 25));
        playerButton.setPreferredSize(new java.awt.Dimension(100, 25));
        playerButton.setRolloverEnabled(false);
        playerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(playerButton, gridBagConstraints);

        superRobotButton.setBackground(new java.awt.Color(127, 7, 153));
        startingPlayerButtonsGroup.add(superRobotButton);
        superRobotButton.setFont(new java.awt.Font("Adwaita Mono", 1, 18)); // NOI18N
        superRobotButton.setForeground(new java.awt.Color(255, 255, 255));
        superRobotButton.setText("SUPER ROBOT");
        superRobotButton.setBorderPainted(false);
        superRobotButton.setFocusable(false);
        superRobotButton.setMaximumSize(new java.awt.Dimension(100, 25));
        superRobotButton.setMinimumSize(new java.awt.Dimension(100, 25));
        superRobotButton.setPreferredSize(new java.awt.Dimension(100, 25));
        superRobotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superRobotButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(superRobotButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void easyDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyDifficultyButtonActionPerformed
        difficulty = 1;
    }//GEN-LAST:event_easyDifficultyButtonActionPerformed

    private void mediumDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumDifficultyButtonActionPerformed
        difficulty = 2;
    }//GEN-LAST:event_mediumDifficultyButtonActionPerformed

    private void impossibleDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impossibleDifficultyButtonActionPerformed
        difficulty = 3;
    }//GEN-LAST:event_impossibleDifficultyButtonActionPerformed

    private void playerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerButtonActionPerformed
        isPlayerStarting = true;
    }//GEN-LAST:event_playerButtonActionPerformed

    private void superRobotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superRobotButtonActionPerformed
        isPlayerStarting = false;
    }//GEN-LAST:event_superRobotButtonActionPerformed

    public Integer getDifficulty() {
        return difficulty;
    }
    
    public Boolean isPlayerStarting() {
        return isPlayerStarting;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup difficultyButtonsGroup;
    private javax.swing.JToggleButton easyDifficultyButton;
    private javax.swing.JToggleButton impossibleDifficultyButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton mediumDifficultyButton;
    private javax.swing.JButton okButton;
    private javax.swing.JToggleButton playerButton;
    private javax.swing.ButtonGroup startingPlayerButtonsGroup;
    private javax.swing.JToggleButton superRobotButton;
    // End of variables declaration//GEN-END:variables
}
