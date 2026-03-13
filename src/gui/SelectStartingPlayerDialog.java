package gui;

import javax.swing.ImageIcon;
import tris.Main;
import tris.Symbol;

public class SelectStartingPlayerDialog extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SelectStartingPlayerDialog.class.getName());

    private Symbol startingSymbol = Symbol.X;
    
    public SelectStartingPlayerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        xButton = new javax.swing.JToggleButton();
        oButton = new javax.swing.JToggleButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(760, 465));
        setMaximumSize(new java.awt.Dimension(350, 215));
        setMinimumSize(new java.awt.Dimension(350, 215));
        setPreferredSize(new java.awt.Dimension(350, 215));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(215, 47, 252));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        xButton.setBackground(new java.awt.Color(127, 7, 153));
        buttonGroup1.add(xButton);
        xButton.setSelected(true);
        xButton.setBorder(null);
        xButton.setBorderPainted(false);
        xButton.setContentAreaFilled(false);
        xButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xButton.setFocusPainted(false);
        xButton.setFocusable(false);
        xButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xButtonStateChanged(evt);
            }
        });
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(xButton, gridBagConstraints);
        xButton.setIcon(new ImageIcon(Main.class.getResource("/media/X.png")));

        oButton.setBackground(new java.awt.Color(127, 7, 153));
        buttonGroup1.add(oButton);
        oButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 7, 153), 2));
        oButton.setBorderPainted(false);
        oButton.setFocusPainted(false);
        oButton.setFocusable(false);
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(oButton, gridBagConstraints);
        oButton.setIcon(new ImageIcon(Main.class.getResource("/media/O.png")));

        okButton.setBackground(new java.awt.Color(0, 0, 0));
        okButton.setFont(new java.awt.Font("Adwaita Mono", 1, 24)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("OK");
        okButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        okButton.setBorderPainted(false);
        okButton.setFocusable(false);
        okButton.setMaximumSize(new java.awt.Dimension(72, 15));
        okButton.setMinimumSize(new java.awt.Dimension(72, 15));
        okButton.setPreferredSize(new java.awt.Dimension(72, 15));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.4;
        jPanel1.add(okButton, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        oButton.setContentAreaFilled(false);
        xButton.setContentAreaFilled(true);
        startingSymbol = Symbol.O;
    }//GEN-LAST:event_oButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        xButton.setContentAreaFilled(false);
        oButton.setContentAreaFilled(true);
        startingSymbol = Symbol.X;
    }//GEN-LAST:event_xButtonActionPerformed

    private void xButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_xButtonStateChanged

    public Symbol getSelectedSymbol() {
        return startingSymbol;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton oButton;
    private javax.swing.JButton okButton;
    private javax.swing.JToggleButton xButton;
    // End of variables declaration//GEN-END:variables
}
