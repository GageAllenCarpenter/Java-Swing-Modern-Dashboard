package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.frame.SimpleTitleBar;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;

import java.awt.Color;

/**
 * The main panel of the application. This panel contains all panels and components.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Create a new MainPanel.
     */
    public MainPanel() {
        initComponents();
        setBackground(new Color(0,0,0));
        new ScrollPane(jScrollPane);
    }

    /**
     * Get the dashboard panel.
     *
     * @return The dashboard panel.
     */
    public DashboardPanel getDashboardPanel() {
        return dashboardPanel;
    }

    /**
     * Get the service request panel.
     *
     * @return The service request panel.
     */
    public SimpleTitleBar getSimpleTitleBar() {
        return simpleTitleBar;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        dashboardPanel = new io.github.gageallencarpenter.view.panels.DashboardPanel();
        simpleTitleBar = new io.github.gageallencarpenter.view.frame.SimpleTitleBar();

        setBackground(new java.awt.Color(0, 0, 0));

        dashboardPanel.setColor2(new java.awt.Color(67, 67, 67));
        jScrollPane.setViewportView(dashboardPanel);

        simpleTitleBar.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simpleTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(simpleTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.panels.DashboardPanel dashboardPanel;
    private javax.swing.JScrollPane jScrollPane;
    private io.github.gageallencarpenter.view.frame.SimpleTitleBar simpleTitleBar;
    // End of variables declaration//GEN-END:variables
}
