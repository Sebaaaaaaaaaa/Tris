package gui;

public class TrisBoardDialog extends javax.swing.JDialog {
    
      private final Integer[] coords = new Integer[2];
    
    public TrisBoardDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Integer[] getLastClickCoords() {
        return coords;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        box1 = new javax.swing.JButton();
        box2 = new javax.swing.JButton();
        box3 = new javax.swing.JButton();
        box4 = new javax.swing.JButton();
        box5 = new javax.swing.JButton();
        box6 = new javax.swing.JButton();
        box7 = new javax.swing.JButton();
        box8 = new javax.swing.JButton();
        box9 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setLocation(new java.awt.Point(610, 190));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        box1.setBackground(new java.awt.Color(127, 7, 153));
        box1.setBorder(null);
        box1.setBorderPainted(false);
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box1, gridBagConstraints);

        box2.setBackground(new java.awt.Color(127, 7, 153));
        box2.setBorder(null);
        box2.setBorderPainted(false);
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box2, gridBagConstraints);

        box3.setBackground(new java.awt.Color(127, 7, 153));
        box3.setBorder(null);
        box3.setBorderPainted(false);
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box3, gridBagConstraints);

        box4.setBackground(new java.awt.Color(127, 7, 153));
        box4.setBorder(null);
        box4.setBorderPainted(false);
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box4, gridBagConstraints);

        box5.setBackground(new java.awt.Color(127, 7, 153));
        box5.setBorder(null);
        box5.setBorderPainted(false);
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box5, gridBagConstraints);

        box6.setBackground(new java.awt.Color(127, 7, 153));
        box6.setBorder(null);
        box6.setBorderPainted(false);
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box6, gridBagConstraints);

        box7.setBackground(new java.awt.Color(127, 7, 153));
        box7.setBorder(null);
        box7.setBorderPainted(false);
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box7, gridBagConstraints);

        box8.setBackground(new java.awt.Color(127, 7, 153));
        box8.setBorder(null);
        box8.setBorderPainted(false);
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box8, gridBagConstraints);

        box9.setBackground(new java.awt.Color(127, 7, 153));
        box9.setBorder(null);
        box9.setBorderPainted(false);
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(box9, gridBagConstraints);

        filler1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 6, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(filler4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        coords[0] = 0;
        coords[1] = 0;
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        coords[0] = 0;
        coords[1] = 1;
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        coords[0] = 0;
        coords[1] = 2;
    }//GEN-LAST:event_box3ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        coords[0] = 1;
        coords[1] = 0;
    }//GEN-LAST:event_box4ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        coords[0] = 1;
        coords[1] = 1;
    }//GEN-LAST:event_box5ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        coords[0] = 1;
        coords[1] = 2;
    }//GEN-LAST:event_box6ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        coords[0] = 2;
        coords[1] = 0;
    }//GEN-LAST:event_box7ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        coords[0] = 2;
        coords[1] = 1;
    }//GEN-LAST:event_box8ActionPerformed

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        coords[0] = 2;
        coords[1] = 2;
    }//GEN-LAST:event_box9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton box1;
    private javax.swing.JButton box2;
    private javax.swing.JButton box3;
    private javax.swing.JButton box4;
    private javax.swing.JButton box5;
    private javax.swing.JButton box6;
    private javax.swing.JButton box7;
    private javax.swing.JButton box8;
    private javax.swing.JButton box9;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
