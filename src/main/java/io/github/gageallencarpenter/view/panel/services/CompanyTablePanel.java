package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.button.Button;
import io.github.gageallencarpenter.view.button.RenderButton;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;
import io.github.gageallencarpenter.view.table.Table;

import javax.swing.*;

/**
 * A panel that displays a table of organizations. Each organization is a row in the table.
 * Each row has a button that allows the user to select the organization. Once selected, the
 * corresponding organizations boarding services will be displayed in queue.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class CompanyTablePanel extends javax.swing.JPanel implements ITable {

    private static CompanyTablePanel instance;
    private final Button button = new Button();

    /**
     * Create a new CompanyTablePanel.
     */
    private CompanyTablePanel() {
        button.setText("SELECT");
        initComponents();
        initTable();
        new ScrollPane(companyScroll);
    }

    /**
     * Get the instance of the CompanyTablePanel.
     *
     * @return The instance of the CompanyTablePanel.
     */
    public static CompanyTablePanel getInstance(){
        if(instance == null){
            instance = new CompanyTablePanel();
        }
        return instance;
    }

    /**
     * get the table.
     *
     * @return The table.
     */
    @Override
    public Table getTable() {
        return companyTable;
    }

    /**
     * Initialize the table.
     */
    public synchronized void initTable() {
        companyTable.setFillsViewportHeight(true);
        companyTable.setDefaultRenderer(Object.class, new RenderButton());
        //TODO: Update
/*        cache.get(FolderList.FOLDER, FileList.ORGANIZATION, new TypeReference<>() {}).forEach(organization -> {
            SwingUtilities.invokeLater(() ->companyTable.addRow(new Object[]{organization.getName(), 0, 0, button}));
        });*/
    }

    public void updateTable(){
        companyTable.removeAllRows();
        initTable();
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyScroll = new javax.swing.JScrollPane();
        companyTable = new io.github.gageallencarpenter.view.table.Table();

        setOpaque(false);

        companyTable.setAutoCreateRowSorter(true);
        companyTable.setBackground(new java.awt.Color(0, 0, 0));
        companyTable.setForeground(new java.awt.Color(255, 255, 255));
        companyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company", "Quantity", "Duration", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        companyTable.setGridColor(new java.awt.Color(51, 51, 51));
        companyTable.setShowGrid(true);
        companyTable.setShowVerticalLines(false);
        companyScroll.setViewportView(companyTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(companyScroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(companyScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane companyScroll;
    private io.github.gageallencarpenter.view.table.Table companyTable;
    // End of variables declaration//GEN-END:variables
}
