package gui;

import tris.PvPTableModel;

public class PvPTable extends javax.swing.JDialog {
    
    PvPTableModel model;

    public PvPTable(java.awt.Frame parent, boolean modal, PvPTableModel m) {
        super(parent, modal);
        model = m;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(600, 300));
        setResizable(false);

        dataTable.setModel(model);
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
