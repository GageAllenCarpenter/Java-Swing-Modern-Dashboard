package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.frame.Application;
import io.github.gageallencarpenter.view.label.NumericServiceCountLabel;
import io.github.gageallencarpenter.view.label.PercentageServiceCountLabel;
import io.github.gageallencarpenter.view.paint.GradientList;
import io.github.gageallencarpenter.view.progressbar.ProgressBar;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;

import javax.swing.*;
import java.util.LinkedList;


/**
 * Provides a panel for displaying various systems administration operations.
 * Company based operations are case specific instances of steps required to onboard a new client
 * for that organization. Service based operations are generic steps required to receive or change a specific feature
 * in their native operating system. App based operations are web based applications that can be installed from
 * Chocolatey or other package managers.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ServicePanel extends javax.swing.JPanel {

    private static ServicePanel instance;
    private LinkedList<ServiceRequestPanel> services = new LinkedList<>();
    private final GradientList gradientList = new GradientList();

    /**
     * Constructor for the ServicePanel class.
     */
    private ServicePanel() {
        initComponents();
        initQueue();
        initProgressBar();
        new ScrollPane(operationScroll);
        new ScrollPane(scrollQueue);
        setForm(ServiceTablePanel.getInstance());
    }

    /**
     * Allows only one instance of this class to be created
     * If an instance already exists, it will return the instance
     * If an instance does not exist, it will create a new instance
     * @return instance of this class
     */
    public static ServicePanel getInstance(){
        if(instance == null){
            instance = new ServicePanel();
        }
        return instance;
    }

    /**
     * Sets the form to be displayed in the main service panel
     * @param com The form to be displayed
     */
    private void setForm(JComponent com){
        mainOperationsPanel.removeAll();
        mainOperationsPanel.add(com);
        mainOperationsPanel.setOpaque(false);
        mainOperationsPanel.repaint();
        mainOperationsPanel.revalidate();
    }


    private void initProgressBar(){
        progressBar.getModernProgressBarUI().setColor1(gradientList.getMultiGradient(0).colorOne());
        progressBar.getModernProgressBarUI().setColor2(gradientList.getMultiGradient(0).colorTwo());
        progressBar.getModernProgressBarUI().setColor3(gradientList.getMultiGradient(0).colorThree());
    }

    /**
     * Initializes the queue panel by adding ten
     * transparent panels to the queue panel. This
     * prevents the naturally occurring resizing
     * that would occur from the vertical box layout
     * when the queue is empty.
     */
    private void initQueue(){
        for(int i = 0; i < 10; i++){
            JPanel panel = new JPanel();
            panel.setOpaque(false);
            queueLayeredPane.add(panel);
        }
    }

    /**
     * Adds a service request to the queue panel.
     *
     * @param com The service request to be added.
     */
    public void addService(ServiceRequestPanel com){
        com.setColor1(gradientList.getGradient(0).color1());
        com.setColor2(gradientList.getGradient(0).color2());
        queueLayeredPane.add(com, 0);
        services.add(com);
        Application.getInstance().repaintAll();
    }

    public void removeService(ServiceRequestPanel com){
        queueLayeredPane.remove(com);
        services.remove(com);
        Application.getInstance().repaintAll();
    }

    public void resetQueue(){
        queueLayeredPane.removeAll();
        initQueue();
        Application.getInstance().repaintAll();
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablePanel = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        titleLabel = new javax.swing.JLabel();
        companyLabel = new javax.swing.JLabel();
        appLabel = new javax.swing.JLabel();
        serviceLabel = new javax.swing.JLabel();
        operationScroll = new javax.swing.JScrollPane();
        mainOperationsPanel = new javax.swing.JPanel();
        progressPanel = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        servicesLabel = new javax.swing.JLabel();
        numericServiceCount = new io.github.gageallencarpenter.view.label.NumericServiceCountLabel();
        percentageServiceCount = new io.github.gageallencarpenter.view.label.PercentageServiceCountLabel();
        progressBar = new io.github.gageallencarpenter.view.progressbar.ProgressBar();
        serviceQueuePanel = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        launchButton = new javax.swing.JButton();
        scrollQueue = new javax.swing.JScrollPane();
        queuePanel = new javax.swing.JPanel();
        queueLayeredPane = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        tablePanel.setArcHeight(60);
        tablePanel.setArcWidth(60);
        tablePanel.setColor2(new java.awt.Color(51, 51, 51));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Services");

        companyLabel.setForeground(new java.awt.Color(255, 255, 255));
        companyLabel.setText("Company");
        companyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companyLabelMouseClicked(evt);
            }
        });

        appLabel.setForeground(new java.awt.Color(255, 255, 255));
        appLabel.setText("App");
        appLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appLabelMouseClicked(evt);
            }
        });

        serviceLabel.setForeground(new java.awt.Color(255, 255, 255));
        serviceLabel.setText("Service");
        serviceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceLabelMouseClicked(evt);
            }
        });

        operationScroll.setBorder(null);
        operationScroll.setOpaque(false);

        mainOperationsPanel.setOpaque(false);
        mainOperationsPanel.setLayout(new java.awt.BorderLayout());
        operationScroll.setViewportView(mainOperationsPanel);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(operationScroll)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(304, 304, 304)
                        .addComponent(companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(serviceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(appLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(companyLabel)
                    .addComponent(appLabel)
                    .addComponent(serviceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(operationScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        operationScroll.getAccessibleContext().setAccessibleDescription("");

        progressPanel.setArcHeight(60);
        progressPanel.setArcWidth(60);
        progressPanel.setAutoscrolls(true);
        progressPanel.setColor2(new java.awt.Color(51, 51, 51));

        servicesLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        servicesLabel.setForeground(new java.awt.Color(255, 255, 255));
        servicesLabel.setText("Tasks");
        servicesLabel.setToolTipText("");

        numericServiceCount.setForeground(new java.awt.Color(255, 255, 255));

        percentageServiceCount.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout progressPanelLayout = new javax.swing.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(progressPanelLayout.createSequentialGroup()
                        .addComponent(servicesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numericServiceCount, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(557, 557, 557)
                        .addComponent(percentageServiceCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numericServiceCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentageServiceCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        serviceQueuePanel.setArcHeight(60);
        serviceQueuePanel.setArcWidth(60);
        serviceQueuePanel.setColor2(new java.awt.Color(51, 51, 51));

        launchButton.setBackground(new java.awt.Color(0, 0, 0));
        launchButton.setForeground(new java.awt.Color(255, 255, 255));
        launchButton.setText("LAUNCH");
        launchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButtonActionPerformed(evt);
            }
        });

        queuePanel.setOpaque(false);

        queueLayeredPane.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        javax.swing.GroupLayout queuePanelLayout = new javax.swing.GroupLayout(queuePanel);
        queuePanel.setLayout(queuePanelLayout);
        queuePanelLayout.setHorizontalGroup(
            queuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(queueLayeredPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        queuePanelLayout.setVerticalGroup(
            queuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(queueLayeredPane)
        );

        scrollQueue.setViewportView(queuePanel);

        javax.swing.GroupLayout serviceQueuePanelLayout = new javax.swing.GroupLayout(serviceQueuePanel);
        serviceQueuePanel.setLayout(serviceQueuePanelLayout);
        serviceQueuePanelLayout.setHorizontalGroup(
            serviceQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serviceQueuePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(serviceQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollQueue, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(launchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        serviceQueuePanelLayout.setVerticalGroup(
            serviceQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, serviceQueuePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(launchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(serviceQueuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceQueuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Displays the company table panel once the company label has been clicked
     * @param evt the event that triggered the method
     */
    private void companyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyLabelMouseClicked
        setForm(CompanyTablePanel.getInstance());
    }//GEN-LAST:event_companyLabelMouseClicked

    /**
     * Displays the name table panel once the name label has been clicked
     * @param evt the event that triggered the method
     */
    private void serviceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceLabelMouseClicked
        setForm(ServiceTablePanel.getInstance());
    }//GEN-LAST:event_serviceLabelMouseClicked

    /**
     * Displays the app table panel or app cover panel once the app label has been clicked
     * @param evt the event that triggered the method
     */
    private void appLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appLabelMouseClicked
        setForm(AppTablePanel.getInstance());
    }//GEN-LAST:event_appLabelMouseClicked


    /**
     * launches all services that are currently in the queue. The launch process
     * involves the removal of all current service request panels in queue,
     * as well as the addition of the services data to the cache and work classes.
     *
     * @param evt the event that triggered the method
     */
    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchButtonActionPerformed

    }//GEN-LAST:event_launchButtonActionPerformed

    /**
     * Sets the text of the label
     * @param text the text to be set
     */
    public void setTitleLabelText(String text) {
        titleLabel.setText(text);
    }

    /**
     * gets the text of the label
     * @return  the text of the label
     */
    public String getTitleLabelText() {
        return titleLabel.getText();
    }

    /**
     * Returns the launch button that is used on the queue panel
     *
     * @return The launchButton object.
     */
    public JButton getLaunchButton() {
        return launchButton;
    }

    /**
     * Sets the text of the launch button to the text passed in as a parameter.
     *
     * @param text The text to display on the button.
     */
    public void setLaunchButtonText(String text){
        launchButton.setText(text);
    }

    /**
     * Returns the label that is used on the progress panel to count the number
     * of services that have been placed in the queue.
     * @return numericServiceCount
     */
    public NumericServiceCountLabel getNumericServiceCount() {
        return numericServiceCount;
    }

    /**
     * Returns the label that is used on the progress panel to display the percentage of
     * Services that have been completed.
     * @return percentageServiceCount
     */
    public PercentageServiceCountLabel getPercentageServiceCount() {
        return percentageServiceCount;
    }

    /**
     * Returns the progress bar that is used on the progress panel to display the progress of
     * the Services that have and have not been completed.
     * @return progressBar
     */
    public ProgressBar getServiceProgressBar() {
        return progressBar;
    }

    /**
     * Returns the JLayeredPane that is used on the queue panel to display the
     * service request panels.
     *
     * @return queueLayeredPane
     */
    public JLayeredPane getQueueLayeredPane() {
        return queueLayeredPane;
    }

    /**
     * Sets the queue panel to the form passed in as a parameter.
     *
     * @param queueLayeredPane the layered pane to be set
     */
    public void setQueueLayeredPane(JLayeredPane queueLayeredPane) {
        this.queueLayeredPane = queueLayeredPane;
    }

    /**
     * Returns the list of services that are currently in the queue.
     *
     * @return services
     */
    public LinkedList<ServiceRequestPanel> getServices() {
        return services;
    }

    /**
     * Sets the list of services that are currently in the queue.
     *
     * @param services the list of services to be set
     */
    public void setServices(LinkedList<ServiceRequestPanel> services) {
        this.services = services;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JButton launchButton;
    private javax.swing.JPanel mainOperationsPanel;
    private io.github.gageallencarpenter.view.label.NumericServiceCountLabel numericServiceCount;
    private javax.swing.JScrollPane operationScroll;
    private io.github.gageallencarpenter.view.label.PercentageServiceCountLabel percentageServiceCount;
    private io.github.gageallencarpenter.view.progressbar.ProgressBar progressBar;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel progressPanel;
    private javax.swing.JLayeredPane queueLayeredPane;
    private javax.swing.JPanel queuePanel;
    private javax.swing.JScrollPane scrollQueue;
    private javax.swing.JLabel serviceLabel;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel serviceQueuePanel;
    private javax.swing.JLabel servicesLabel;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel tablePanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
