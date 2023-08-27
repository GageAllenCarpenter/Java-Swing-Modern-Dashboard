package io.github.gageallencarpenter.view.panel.dashboard;

import java.awt.Color;

/**
 * Represents a collection of services level of completion.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class PriorityProgressPanel extends javax.swing.JPanel {

    private int priority = 0;

    /**
     * Create a new PriorityProgressPanel.
     */
    public PriorityProgressPanel() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * get the priorityCardPanel
     * @return the priorityCardPanel
     */
    public PriorityCardPanel getPriorityCardPanel() {
        return priorityCardPanel;
    }

    /**
     * get the progressPanel
     * @return the progressPanel
     */
    public ProgressPanel getProgressPanel() {
        return progressPanel;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressPanel1 = new io.github.gageallencarpenter.view.panel.dashboard.ProgressPanel();
        priorityCardPanel = new io.github.gageallencarpenter.view.panel.dashboard.PriorityCardPanel();
        progressPanel = new io.github.gageallencarpenter.view.panel.dashboard.ProgressPanel();

        setOpaque(false);

        priorityCardPanel.setColor1(new java.awt.Color(133, 166, 201));
        priorityCardPanel.setColor2(new java.awt.Color(133, 166, 201));

        progressPanel.setColor1(new java.awt.Color(31, 31, 31));
        progressPanel.setColor2(new java.awt.Color(31, 31, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(priorityCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priorityCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityCardPanel priorityCardPanel;
    private io.github.gageallencarpenter.view.panel.dashboard.ProgressPanel progressPanel;
    private io.github.gageallencarpenter.view.panel.dashboard.ProgressPanel progressPanel1;
    // End of variables declaration//GEN-END:variables
}
