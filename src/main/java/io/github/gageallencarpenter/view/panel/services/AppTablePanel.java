package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.controller.Post;
import io.github.gageallencarpenter.view.button.Button;
import io.github.gageallencarpenter.view.button.RenderButton;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;
import io.github.gageallencarpenter.view.table.Table;

import java.awt.*;

/**
 * A panel that displays a table of services.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class AppTablePanel extends javax.swing.JPanel implements ITable {

    private static AppTablePanel instance;
    private final Post post = new Post();
    private final Button installButton = new Button();
    private final Button uninstallButton = new Button();

    /**
     * Create a new AppTablePanel.
     */
    private AppTablePanel() {
        initComponents();
        initTable();
        initButtons();
        new ScrollPane(taskScroll);
    }

    private void initButtons(){
        installButton.setText("INSTALL");
        uninstallButton.setText("UNINSTALL");
        uninstallButton.setColor1(new Color(61, 140, 193));
        uninstallButton.setColor2(new Color(61, 140, 193));
    }

    /**
     * Get the instance of the AppTablePanel.
     *
     * @return The instance of the AppTablePanel.
     */
    public static AppTablePanel getInstance(){
        if(instance == null){
            instance = new AppTablePanel();
        }
        return instance;
    }

    /**
     * Initialize the table.
     */
    private synchronized void initTable(){
        appTable.setFillsViewportHeight(true);
        appTable.setDefaultRenderer(Object.class, new RenderButton());
    }

    /**
     * Get the table
     *
     * @return the app table
     */
    @Override
    public Table getTable() {
        return appTable;
    }

    public Button getInstallButton() {
        return installButton;
    }

    public Button getUninstallButton() {
        return uninstallButton;
    }
    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskScroll = new javax.swing.JScrollPane();
        appTable = new io.github.gageallencarpenter.view.table.Table();

        setOpaque(false);

        appTable.setBackground(new java.awt.Color(0, 0, 0));
        appTable.setForeground(new java.awt.Color(255, 255, 255));
        appTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "App", "Quantity", "Install", "Uninstall"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appTable.setGridColor(new java.awt.Color(51, 51, 51));
        appTable.setShowGrid(true);
        appTable.setShowVerticalLines(false);
        appTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTableMouseClicked(evt);
            }
        });
        taskScroll.setViewportView(appTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskScroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Add a service to queue when the button is clicked.
     *
     * @param evt The event.
     */
    private void appTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTableMouseClicked
        //TODO make this work with the Add and Remove buttons
    }//GEN-LAST:event_appTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.table.Table appTable;
    private javax.swing.JScrollPane taskScroll;
    // End of variables declaration//GEN-END:variables
}
