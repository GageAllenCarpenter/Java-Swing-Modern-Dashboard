
package io.github.gageallencarpenter.view.panel.dashboard;

import io.github.gageallencarpenter.view.paint.GradientList;

import java.util.ArrayList;


/**
 * Contains an overview of all service priority reserves. Each group of priorities is represented with
 * two labels and a progress bar. The labels describe the name of the group and the status of that group.
 * The progress bar shows the level of completion of that group.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ServiceAllocatorPanel extends javax.swing.JPanel {

    private final PriorityProgressPanel[] priorityProgressPanels = new PriorityProgressPanel[6];
    private final GradientList gradientList = new GradientList();

    /**
     * Create a new ServiceAllocatorPanel.
     */
    public ServiceAllocatorPanel() {
        initComponents();
        initProgressPanels();
        setBackground(gradientList.getTransparent());
    }

    public void initProgressPanels(){
        priorityProgressPanels[0] = priorityOne;
        priorityProgressPanels[1] = priorityTwo;
        priorityProgressPanels[2] = priorityThree;
        priorityProgressPanels[3] = priorityFour;
        priorityProgressPanels[4] = priorityFive;
        priorityProgressPanels[5] = prioritySix;

        for(int i = 0; i < priorityProgressPanels.length; i++){
            priorityProgressPanels[i].getPriorityCardPanel().getTitleLabel().setText("Priority " + (i + 1));
            priorityProgressPanels[i].setPriority(i + 1);
        }
    }

    public PriorityProgressPanel[] getProgressPanels(){
        return priorityProgressPanels;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priorityProgressLayeredPane = new javax.swing.JLayeredPane();
        priorityOne = new io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel();
        priorityTwo = new io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel();
        priorityThree = new io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel();
        priorityFour = new io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel();
        priorityFive = new io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel();
        prioritySix = new io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel();

        setOpaque(false);

        priorityProgressLayeredPane.setLayout(new java.awt.GridLayout(6, 1, 5, 5));
        priorityProgressLayeredPane.add(priorityOne);
        priorityProgressLayeredPane.add(priorityTwo);
        priorityProgressLayeredPane.add(priorityThree);
        priorityProgressLayeredPane.add(priorityFour);
        priorityProgressLayeredPane.add(priorityFive);
        priorityProgressLayeredPane.add(prioritySix);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priorityProgressLayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priorityProgressLayeredPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel priorityFive;
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel priorityFour;
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel priorityOne;
    private javax.swing.JLayeredPane priorityProgressLayeredPane;
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel prioritySix;
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel priorityThree;
    private io.github.gageallencarpenter.view.panel.dashboard.PriorityProgressPanel priorityTwo;
    // End of variables declaration//GEN-END:variables
}
