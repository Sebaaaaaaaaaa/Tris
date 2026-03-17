package gui;

import javax.swing.JOptionPane;
import tris.Symbol;

public class PlayersSelectionDialog extends javax.swing.JDialog {    

    private Symbol player1Symbol = Symbol.X;
    
    public PlayersSelectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        symbolSelectionButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        player1Image = new javax.swing.JLabel();
        player2Image = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        player1TextField = new javax.swing.JTextField();
        player1SymbolButton = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        player2TextField = new javax.swing.JTextField();
        player2SymbolButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusable(false);
        setLocation(new java.awt.Point(600, 430));
        setMaximumSize(new java.awt.Dimension(700, 300));
        setMinimumSize(new java.awt.Dimension(700, 300));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(700, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        player1Image.setBackground(new java.awt.Color(0, 0, 0));
        player1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Player1.png"))); // NOI18N
        player1Image.setMaximumSize(new java.awt.Dimension(310, 100));
        player1Image.setMinimumSize(new java.awt.Dimension(310, 100));
        player1Image.setPreferredSize(new java.awt.Dimension(310, 100));
        player1Image.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(player1Image, gridBagConstraints);

        player2Image.setBackground(new java.awt.Color(0, 0, 0));
        player2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Player2.png"))); // NOI18N
        player2Image.setMaximumSize(new java.awt.Dimension(310, 100));
        player2Image.setMinimumSize(new java.awt.Dimension(310, 100));
        player2Image.setPreferredSize(new java.awt.Dimension(310, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel1.add(player2Image, gridBagConstraints);

        okButton.setBackground(new java.awt.Color(255, 255, 0));
        okButton.setFont(new java.awt.Font("Adwaita Mono", 1, 24)); // NOI18N
        okButton.setText("OK");
        okButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        okButton.setBorderPainted(false);
        okButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okButton.setFocusable(false);
        okButton.setMaximumSize(new java.awt.Dimension(34, 30));
        okButton.setMinimumSize(new java.awt.Dimension(34, 30));
        okButton.setPreferredSize(new java.awt.Dimension(34, 30));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.4;
        jPanel1.add(okButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler7, gridBagConstraints);

        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        player1TextField.setFont(new java.awt.Font("Adwaita Mono", 1, 36)); // NOI18N
        player1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player1TextField.setText("PLAYER1");
        player1TextField.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(player1TextField, gridBagConstraints);

        player1SymbolButton.setBackground(new java.awt.Color(0, 0, 0));
        symbolSelectionButtonGroup.add(player1SymbolButton);
        player1SymbolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/smaller_O.png"))); // NOI18N
        player1SymbolButton.setSelected(true);
        player1SymbolButton.setBorder(null);
        player1SymbolButton.setBorderPainted(false);
        player1SymbolButton.setContentAreaFilled(false);
        player1SymbolButton.setFocusable(false);
        player1SymbolButton.setMaximumSize(new java.awt.Dimension(55, 55));
        player1SymbolButton.setMinimumSize(new java.awt.Dimension(55, 55));
        player1SymbolButton.setPreferredSize(new java.awt.Dimension(55, 55));
        player1SymbolButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/media/smaller_X.png"))); // NOI18N
        player1SymbolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1SymbolButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(player1SymbolButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        player2TextField.setFont(new java.awt.Font("Adwaita Mono", 1, 36)); // NOI18N
        player2TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player2TextField.setText("PLAYER2");
        player2TextField.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(player2TextField, gridBagConstraints);

        player2SymbolButton.setBackground(new java.awt.Color(0, 0, 0));
        symbolSelectionButtonGroup.add(player2SymbolButton);
        player2SymbolButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/smaller_O.png"))); // NOI18N
        player2SymbolButton.setBorder(null);
        player2SymbolButton.setContentAreaFilled(false);
        player2SymbolButton.setFocusable(false);
        player2SymbolButton.setMaximumSize(new java.awt.Dimension(55, 55));
        player2SymbolButton.setMinimumSize(new java.awt.Dimension(55, 55));
        player2SymbolButton.setPreferredSize(new java.awt.Dimension(55, 55));
        player2SymbolButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/media/smaller_X.png"))); // NOI18N
        player2SymbolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2SymbolButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(player2SymbolButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if(player1TextField.getText().equals(player2TextField.getText())) {
            JOptionPane.showMessageDialog(
               this,
                "Players names MUST be different...",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } else if (player1TextField.getText().isBlank()) {
            player1TextField.setText("PLAYER1");
            JOptionPane.showMessageDialog(
               this,
                "Player1 name MUST be set...",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } else if (player2TextField.getText().isBlank()) {
            player2TextField.setText("PLAYER2");
            JOptionPane.showMessageDialog(
               this,
                "Player2 name MUST be set...",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            String player1Name = player1TextField.getText();
            String player2Name = player2TextField.getText();
            if (player1Name.length() > 10) player1Name = player1Name.substring(0, 10);
            player1TextField.setText(player1Name.toUpperCase());
            if (player2Name.length() > 10) player2Name = player2Name.substring(0, 10);
            player2TextField.setText(player2Name.toUpperCase());
            dispose();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void player1SymbolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1SymbolButtonActionPerformed
        player1Symbol = Symbol.X;
    }//GEN-LAST:event_player1SymbolButtonActionPerformed

    private void player2SymbolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2SymbolButtonActionPerformed
        player1Symbol = Symbol.O;
    }//GEN-LAST:event_player2SymbolButtonActionPerformed

    public String getPlayer1Name() {
        return player1TextField.getText();
    }
    
    public String getPlayer2Name() {
        return player2TextField.getText();
    }
    
    public Symbol getPlayer1Symbol() {
        return player1Symbol;
    }
    
    public Symbol getPlayer2Symbol() {
        return player1Symbol.getOpposite();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel player1Image;
    private javax.swing.JToggleButton player1SymbolButton;
    private javax.swing.JTextField player1TextField;
    private javax.swing.JLabel player2Image;
    private javax.swing.JToggleButton player2SymbolButton;
    private javax.swing.JTextField player2TextField;
    private javax.swing.ButtonGroup symbolSelectionButtonGroup;
    // End of variables declaration//GEN-END:variables
}
