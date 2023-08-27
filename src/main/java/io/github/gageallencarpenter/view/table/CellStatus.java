package io.github.gageallencarpenter.view.table;

import io.github.gageallencarpenter.model.StatusList;

/**
 * A model that represents a cell in a table.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class CellStatus extends javax.swing.JPanel {

    /**
     * Create a new CellStatus.
     */
    public CellStatus(StatusList type) {
        initComponents();
        status.setType(type);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new io.github.gageallencarpenter.view.table.TableStatus();

        setBackground(new java.awt.Color(0, 0, 0));

        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("tableStatus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.table.TableStatus status;
    // End of variables declaration//GEN-END:variables
}
