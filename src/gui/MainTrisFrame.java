package gui;

import java.awt.Color;
import tris.PvPGame;
import tris.Human;
import tris.PvEGame;
import tris.PvPTableModel;

public class MainTrisFrame extends javax.swing.JFrame {
    
    private final PvPTableModel playerDataHandler;
    
    public MainTrisFrame() {
        initComponents();
        playerDataHandler = new PvPTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MainPanel = new javax.swing.JPanel();
        MainImage = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        PvpButton = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        PveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(460, 190));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setLayout(new java.awt.GridBagLayout());

        MainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/mainImage.png"))); // NOI18N
        MainImage.setText(null);
        MainImage.setToolTipText("Click for match summary");
        MainImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MainImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainImage.setFocusable(false);
        MainImage.setPreferredSize(new java.awt.Dimension(840, 480));
        MainImage.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        MainImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MainImageMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        MainPanel.add(MainImage, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.5;
        MainPanel.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weighty = 1.0;
        MainPanel.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weighty = 1.0;
        MainPanel.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        MainPanel.add(filler4, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        PvpButton.setBackground(new java.awt.Color(0, 0, 0));
        PvpButton.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        PvpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/PvP.png"))); // NOI18N
        PvpButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 7, 153), 2, true));
        PvpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PvpButton.setFocusPainted(false);
        PvpButton.setFocusable(false);
        PvpButton.setPreferredSize(new java.awt.Dimension(200, 85));
        PvpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PvpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PvpButtonMouseExited(evt);
            }
        });
        PvpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PvpButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(PvpButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(filler6, gridBagConstraints);

        PveButton.setBackground(new java.awt.Color(0, 0, 0));
        PveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/PvE.png"))); // NOI18N
        PveButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(127, 7, 153), 2, true));
        PveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PveButton.setFocusPainted(false);
        PveButton.setFocusable(false);
        PveButton.setPreferredSize(new java.awt.Dimension(200, 85));
        PveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PveButtonMouseExited(evt);
            }
        });
        PveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(PveButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        MainPanel.add(jPanel1, gridBagConstraints);

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PvpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PvpButtonActionPerformed
        this.setVisible(false);
        
        PlayersSelectionDialog playersSelectionDialog = new PlayersSelectionDialog(this, true);
        playersSelectionDialog.setVisible(true);
        
        new PvPGame(
                new Human(playersSelectionDialog.getPlayer1Symbol(), playersSelectionDialog.getPlayer1Name()), 
                new Human(playersSelectionDialog.getPlayer2Symbol(), playersSelectionDialog.getPlayer2Name()), 
                this,
                playerDataHandler);

    }//GEN-LAST:event_PvpButtonActionPerformed

    private void PvpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvpButtonMouseEntered
        PvpButton.setBackground(Color.decode("#7F0799"));
    }//GEN-LAST:event_PvpButtonMouseEntered

    private void PvpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvpButtonMouseExited
        PvpButton.setBackground(Color.black);
    }//GEN-LAST:event_PvpButtonMouseExited

    private void PveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PveButtonMouseEntered
        PveButton.setBackground(Color.decode("#7F0799"));
    }//GEN-LAST:event_PveButtonMouseEntered

    private void PveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PveButtonActionPerformed
        this.setVisible(false);
        
        PvESettingsSelectionDialog difficultySelectionDialog = new PvESettingsSelectionDialog(this, true);
        difficultySelectionDialog.setVisible(true);
        
        new PvEGame(this, playerDataHandler, difficultySelectionDialog.getDifficulty(), difficultySelectionDialog.isPlayerStarting());
    }//GEN-LAST:event_PveButtonActionPerformed

    private void PveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PveButtonMouseExited
        PveButton.setBackground(Color.black);
    }//GEN-LAST:event_PveButtonMouseExited

    private void MainImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainImageMouseClicked
        new PvPTable(this, true, playerDataHandler).setVisible(true);
    }//GEN-LAST:event_MainImageMouseClicked

    private void MainImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainImageMouseEntered
        MainImage.setBorder(new javax.swing.border.LineBorder(Color.YELLOW, 2, true));
    }//GEN-LAST:event_MainImageMouseEntered

    private void MainImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainImageMouseExited
        MainImage.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 2, true));
    }//GEN-LAST:event_MainImageMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainImage;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton PveButton;
    private javax.swing.JButton PvpButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
