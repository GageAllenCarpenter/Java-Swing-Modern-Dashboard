package io.github.gageallencarpenter.view.frame;

import io.github.gageallencarpenter.model.ResourceList;
import io.github.gageallencarpenter.view.motion.Drag;
import io.github.gageallencarpenter.view.panels.MainPanel;
import io.github.gageallencarpenter.view.panel.backstage.BackstagePanel;
import io.github.gageallencarpenter.view.panel.dashboard.HomePanel;
import io.github.gageallencarpenter.view.panel.services.ServicePanel;

import javax.swing.*;
import java.awt.Desktop;
import java.net.URI;

/**
 * The main frame of the application. This frame contains everything that is displayed to the user.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class Application extends JFrame{

    private static Application instance;
    private ResourceList resource;

    /**
     * Create a new Application.
     */
    private Application(){
        initComponents();

        initDrag();
        mainPanel.getSimpleTitleBar().init(this);
        int end  = ResourceList.size() + 5;
        mainPanel.getDashboardPanel().getMenu().addMenuInterface((int index) -> {
            switch (index) {
                case 1 -> setForm(HomePanel.getInstance());
                case 2 -> setForm(ServicePanel.getInstance());
                case 3 -> setForm(BackstagePanel.getInstance());
                case 6 -> Desktop.getDesktop().browse(new URI(ResourceList.getResources().get(0).getUrl()));
                case 7 -> Desktop.getDesktop().browse(new URI(ResourceList.getResources().get(1).getUrl()));
                default -> System.exit(0);
            }
        });
        setForm(HomePanel.getInstance());
        setVisible(true);
    }

    /**
     * Allows only one instance of this class to be created
     * If an instance already exists, it will return the instance
     * If an instance does not exist, it will create a new instance
     * @return instance of this class
     */
    public static Application getInstance(){
        if(instance == null){
            instance = new Application();
        }
        return instance;
    }

    /**
     * Initializes the components of the frame.
     *
     * @param com The components of the frame.
     */
    private void setForm(JComponent com) {
        mainPanel.getDashboardPanel().getCenterPanel().removeAll();
        mainPanel.getDashboardPanel().getCenterPanel().add(com);
        mainPanel.getDashboardPanel().getCenterPanel().repaint();
        mainPanel.getDashboardPanel().getCenterPanel().revalidate();
    }

    /**
     * Initializes the drag functionality of the frame.
     */
    private void initDrag(){
        Drag.getInstance().initMoving(this, mainPanel.getDashboardPanel().getMenu());
    }

    /**
     * Repaints the frame.
     */
    public void repaintAll(){
        Application.getInstance().invalidate();
        Application.getInstance().validate();
        Application.getInstance().repaint();
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new io.github.gageallencarpenter.view.panels.MainPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.panels.MainPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
