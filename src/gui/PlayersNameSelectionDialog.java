package gui;

import javax.swing.ImageIcon;
import tris.Main;

public class PlayersNameSelectionDialog extends javax.swing.JDialog {    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PlayersNameSelectionDialog.class.getName());

    public PlayersNameSelectionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        player1Image = new javax.swing.JLabel();
        player2Image = new javax.swing.JLabel();
        player1TextField = new javax.swing.JTextField();
        player2TextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusable(false);
        setLocation(new java.awt.Point(600, 430));
        setMaximumSize(new java.awt.Dimension(700, 220));
        setMinimumSize(new java.awt.Dimension(700, 220));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(700, 220));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        player1Image.setBackground(new java.awt.Color(0, 0, 0));
        player1Image.setMaximumSize(new java.awt.Dimension(310, 100));
        player1Image.setMinimumSize(new java.awt.Dimension(310, 100));
        player1Image.setPreferredSize(new java.awt.Dimension(310, 100));
        player1Image.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(player1Image, gridBagConstraints);
        player1Image.setIcon(new ImageIcon(Main.class.getResource("/media/Player1.png")));

        player2Image.setBackground(new java.awt.Color(0, 0, 0));
        player2Image.setMaximumSize(new java.awt.Dimension(310, 100));
        player2Image.setMinimumSize(new java.awt.Dimension(310, 100));
        player2Image.setPreferredSize(new java.awt.Dimension(310, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel1.add(player2Image, gridBagConstraints);
        player2Image.setIcon(new ImageIcon(Main.class.getResource("/media/Player2.png")));

        player1TextField.setColumns(15);
        player1TextField.setFont(new java.awt.Font("Adwaita Mono", 1, 14)); // NOI18N
        player1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player1TextField.setText("Player1");
        player1TextField.setBorder(null);
        player1TextField.setMaximumSize(new java.awt.Dimension(140, 35));
        player1TextField.setMinimumSize(new java.awt.Dimension(140, 35));
        player1TextField.setName(""); // NOI18N
        player1TextField.setPreferredSize(new java.awt.Dimension(140, 35));
        player1TextField.setSelectionEnd(10);
        player1TextField.setSelectionStart(0);
        player1TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                player1TextFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(player1TextField, gridBagConstraints);

        player2TextField.setColumns(15);
        player2TextField.setFont(new java.awt.Font("Adwaita Mono", 1, 14)); // NOI18N
        player2TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player2TextField.setText("Player2");
        player2TextField.setBorder(null);
        player2TextField.setMaximumSize(new java.awt.Dimension(140, 35));
        player2TextField.setMinimumSize(new java.awt.Dimension(140, 35));
        player2TextField.setPreferredSize(new java.awt.Dimension(140, 35));
        player2TextField.setSelectionEnd(0);
        player2TextField.setSelectionStart(10);
        player2TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                player2TextFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        jPanel1.add(player2TextField, gridBagConstraints);

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

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void player1TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_player1TextFieldFocusLost
        String text = player1TextField.getText();
        if (text.length() > 10) {
            player1TextField.setText(text.substring(0, 10));
        }
        if (text.equals(player2TextField.getText())) {
            player1TextField.setText("Player1");
        }
    }//GEN-LAST:event_player1TextFieldFocusLost

    private void player2TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_player2TextFieldFocusLost
        String text = player2TextField.getText();
        if (text.length() > 10) {
            player2TextField.setText(text.substring(0, 10));
        }
        if (text.equals(player1TextField.getText())) {
            player2TextField.setText("Player2");
        }
    }//GEN-LAST:event_player2TextFieldFocusLost

    public String getPlayer1Name() {
        return player1TextField.getText();
    }
    
    public String getPlayer2Name() {
        return player2TextField.getText();
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel player1Image;
    private javax.swing.JTextField player1TextField;
    private javax.swing.JLabel player2Image;
    private javax.swing.JTextField player2TextField;
    // End of variables declaration//GEN-END:variables
}
