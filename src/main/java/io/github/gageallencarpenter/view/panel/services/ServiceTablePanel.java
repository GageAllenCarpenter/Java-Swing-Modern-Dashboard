package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.controller.Post;
import io.github.gageallencarpenter.view.button.RenderButton;
import io.github.gageallencarpenter.view.button.Button;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;
import io.github.gageallencarpenter.view.table.Table;

import java.awt.event.MouseEvent;

/**
 * Table that displays all services. Services are pulled from the service list
 * and displayed in the table. Each service has a button that can be clicked to
 * start or stop the service. The table also functions with the search bar.
 * All services refer to changes to the operating system.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ServiceTablePanel extends javax.swing.JPanel implements ITable {

    private static ServiceTablePanel instance;
    private final Button  button = new Button();
    private final Post employ = new Post();

    /**
     * Creates new form ServiceTablePanel
     */
    private ServiceTablePanel() {
        button.setText("SELECT");
        initComponents();
        initTable();
        new ScrollPane(taskScroll);
    }

    /**
     * Returns the instance of the ServiceTablePanel.
     *
     * @return The instance of the ServiceTablePanel.
     */
    public static ServiceTablePanel getInstance(){
        if(instance == null){
            instance = new ServiceTablePanel();
        }
        return instance;
    }

    /**
     * gets the table.
     */
    @Override
    public Table getTable() {
        return serviceTable;
    }

    /**
     * initializes the table model.
     */
    private synchronized void initTable(){
        serviceTable.setFillsViewportHeight(true);
        serviceTable.setDefaultRenderer(Object.class, new RenderButton());
        //Note: The following code is for demonstration purposes only
        serviceTable.addRow(new Object[]{"Service 1", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 2", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 3", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 4", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 5", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 6", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 7", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 8", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 9", 1, button, "      inactive"});
        serviceTable.addRow(new Object[]{"Service 10", 1, button, "     inactive"});
    }

    public void updateTable(){
        serviceTable.removeAllRows();
        initTable();
    }

    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskScroll = new javax.swing.JScrollPane();
        serviceTable = new io.github.gageallencarpenter.view.table.Table();

        setOpaque(false);

        serviceTable.setBackground(new java.awt.Color(0, 0, 0));
        serviceTable.setForeground(new java.awt.Color(255, 255, 255));
        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Task", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        serviceTable.setGridColor(new java.awt.Color(51, 51, 51));
        serviceTable.setShowGrid(true);
        serviceTable.setShowVerticalLines(false);
        serviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceTableMouseClicked(evt);
            }
        });
        taskScroll.setViewportView(serviceTable);

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
     * When a service is clicked, the service is started and the middleware is notified.
     *
     * @param evt The mouse event.
     */
    private void serviceTableMouseClicked(MouseEvent evt) {//GEN-FIRST:event_serviceTableMouseClicked

    }//GEN-LAST:event_serviceTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.table.Table serviceTable;
    private javax.swing.JScrollPane taskScroll;
    // End of variables declaration//GEN-END:variables
}
