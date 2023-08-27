
package io.github.gageallencarpenter.view.panel.dashboard;

import io.github.gageallencarpenter.view.scrollbar.ScrollPane;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

/**
 * The HomePanel is a custom panel for displaying the home page of the application.
 * The home page includes the service allocator, launch pad, service overview,
 * duration overview, and history overview.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class HomePanel extends javax.swing.JPanel { //TODO : Add URL Functionality to Launch Panel

    private static HomePanel instance;

    /**
     * Create a new HomePanel.
     */
    private HomePanel() {
        initComponents();
        initCards();
        setBackground(new Color(0,0,0,0));
        new ScrollPane(historyScroll);
        new ScrollPane(taskAllocationScroll);
        new ScrollPane(launchScroll);
        launchPadPanel.setBackground(new Color(0,0,0,0));
    }

    /**
     * Get the instance of the HomePanel.
     *
     * @return The instance of the HomePanel.
     */
    public static HomePanel getInstance(){
        if(instance == null){
            instance = new HomePanel();
        }
        return instance;
    }

    public void incrementDescriptionCardPanel1Description(){
        descriptionCardPanel1.setDescription(String.valueOf(Integer.parseInt(descriptionCardPanel1.getDescription()) + 1));
    }

    public void decrementDescriptionCardPanel1Description(){
        descriptionCardPanel1.setDescription(String.valueOf(Integer.parseInt(descriptionCardPanel1.getDescription()) - 1));
    }

    public void incrementDescriptionCardPanel2Description(){
        descriptionCardPanel2.setDescription(String.valueOf(Integer.parseInt(descriptionCardPanel2.getDescription()) + 1));
    }

    public void decrementDescriptionCardPanel2Description(){
        descriptionCardPanel2.setDescription(String.valueOf(Integer.parseInt(descriptionCardPanel2.getDescription()) - 1));
    }

    public void redirect(String link){
        try {
            Desktop.getDesktop().browse(new URI(link));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private void initCards(){
        launchCardPanel1.setData("App Title", new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/calendar.png"))));
        launchCardPanel2.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/automate.png"))));
        launchCardPanel3.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/business.png"))));
        launchCardPanel4.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/cloud.png"))));
        launchCardPanel5.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/lock.png"))));
        launchCardPanel6.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/office.png"))));
        launchCardPanel7.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/business.png"))));
        launchCardPanel8.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/chrome.png"))));
        launchCardPanel9.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/automate.png"))));
        launchCardPanel10.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/cloud.png"))));
        launchCardPanel11.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/office.png"))));
        launchCardPanel12.setData("App Title",new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/business.png"))));
        descriptionCardPanel1.setData("Metric Title", new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/stock.png"))), "0");
        descriptionCardPanel2.setData("Metric Title", new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/vitals.png"))), "0");
    }

    public ServiceAllocatorPanel getServiceAllocatorPanel() {
        return taskAllocatorPanel;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainHomePanel = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        launchLabel = new javax.swing.JLabel();
        taskLabel = new javax.swing.JLabel();
        taskAllocationScroll = new javax.swing.JScrollPane();
        taskAllocatorPanel = new io.github.gageallencarpenter.view.panel.dashboard.ServiceAllocatorPanel();
        launchScroll = new javax.swing.JScrollPane();
        launchPadPanel = new javax.swing.JPanel();
        launchPadLayeredPane = new javax.swing.JLayeredPane();
        launchCardPanel1 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel7 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel9 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel8 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel6 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel10 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel12 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel11 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel4 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel5 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel3 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        launchCardPanel2 = new io.github.gageallencarpenter.view.panels.TitlePanel();
        historyPanel = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        historyLabel = new javax.swing.JLabel();
        historyScroll = new javax.swing.JScrollPane();
        historyLog = new javax.swing.JTextArea();
        overviewPanel = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        overviewLayeredPane = new javax.swing.JLayeredPane();
        descriptionCardPanel1 = new io.github.gageallencarpenter.view.panels.DescriptionCardPanel();
        descriptionCardPanel2 = new io.github.gageallencarpenter.view.panels.DescriptionCardPanel();
        overviewLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        mainHomePanel.setArcHeight(60);
        mainHomePanel.setArcWidth(60);
        mainHomePanel.setColor2(new java.awt.Color(51, 51, 51));

        launchLabel.setForeground(new java.awt.Color(255, 255, 255));
        launchLabel.setText("Launch");

        taskLabel.setForeground(new java.awt.Color(255, 255, 255));
        taskLabel.setText("Service Allocation");

        taskAllocationScroll.setViewportView(taskAllocatorPanel);

        launchPadPanel.setOpaque(false);

        launchPadLayeredPane.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        launchCardPanel1.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel1.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel1.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel1.setTitleLabelText("App One");
        launchCardPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel1MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel1);

        launchCardPanel7.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel7.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel7.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel7.setTitleLabelText("App Two");
        launchCardPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel7MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel7);

        launchCardPanel9.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel9.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel9.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel9.setTitleLabelText("App Three");
        launchCardPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel9MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel9);

        launchCardPanel8.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel8.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel8.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel8.setTitleLabelText("App Four");
        launchCardPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel8MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel8);

        launchCardPanel6.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel6.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel6.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel6.setTitleLabelText("App Five");
        launchCardPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel6MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel6);

        launchCardPanel10.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel10.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel10.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel10.setTitleLabelText("App Six");
        launchCardPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel10MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel10);

        launchCardPanel12.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel12.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel12.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel12.setTitleLabelText("App Seven");
        launchCardPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel12MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel12);

        launchCardPanel11.setAutoscrolls(true);
        launchCardPanel11.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel11.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel11.setIconLabel(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N
        launchCardPanel11.setTitleLabelText("App Eight");
        launchCardPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel11MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel11);

        launchCardPanel4.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel4.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel4.setTitleLabelText("App Nine");
        launchCardPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel4MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel4);

        launchCardPanel5.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel5.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel5.setTitleLabelText("App Ten");
        launchCardPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel5MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel5);

        launchCardPanel3.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel3.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel3.setTitleLabelText("App Eleven");
        launchCardPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel3MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel3);

        launchCardPanel2.setColor1(new java.awt.Color(133, 166, 201));
        launchCardPanel2.setColor2(new java.awt.Color(133, 166, 201));
        launchCardPanel2.setTitleLabelText("App Twelve");
        launchCardPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                launchCardPanel2MouseClicked(evt);
            }
        });
        launchPadLayeredPane.add(launchCardPanel2);

        javax.swing.GroupLayout launchPadPanelLayout = new javax.swing.GroupLayout(launchPadPanel);
        launchPadPanel.setLayout(launchPadPanelLayout);
        launchPadPanelLayout.setHorizontalGroup(
            launchPadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(launchPadLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        launchPadPanelLayout.setVerticalGroup(
            launchPadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(launchPadLayeredPane)
        );

        launchScroll.setViewportView(launchPadPanel);

        javax.swing.GroupLayout mainHomePanelLayout = new javax.swing.GroupLayout(mainHomePanel);
        mainHomePanel.setLayout(mainHomePanelLayout);
        mainHomePanelLayout.setHorizontalGroup(
            mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainHomePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(launchScroll)
                    .addComponent(taskLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taskAllocationScroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(launchLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        mainHomePanelLayout.setVerticalGroup(
            mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHomePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(launchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(launchScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(taskLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskAllocationScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        historyPanel.setArcHeight(60);
        historyPanel.setArcWidth(60);
        historyPanel.setColor2(new java.awt.Color(51, 51, 51));

        historyLabel.setForeground(new java.awt.Color(255, 255, 255));
        historyLabel.setText("History");

        historyLog.setBackground(new java.awt.Color(0, 0, 0));
        historyLog.setColumns(20);
        historyLog.setForeground(new java.awt.Color(255, 255, 255));
        historyLog.setLineWrap(true);
        historyLog.setRows(5);
        historyLog.setWrapStyleWord(true);
        historyLog.setBorder(null);
        historyScroll.setViewportView(historyLog);

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(historyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historyScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(historyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historyScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        overviewPanel.setArcHeight(60);
        overviewPanel.setArcWidth(60);
        overviewPanel.setColor2(new java.awt.Color(51, 51, 51));

        overviewLayeredPane.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        descriptionCardPanel1.setArcWidth(40);
        descriptionCardPanel1.setColor1(new java.awt.Color(133, 166, 201));
        descriptionCardPanel1.setColor2(new java.awt.Color(133, 166, 201));
        overviewLayeredPane.add(descriptionCardPanel1);

        descriptionCardPanel2.setColor1(new java.awt.Color(133, 166, 201));
        descriptionCardPanel2.setColor2(new java.awt.Color(133, 166, 201));
        overviewLayeredPane.add(descriptionCardPanel2);

        overviewLabel.setForeground(new java.awt.Color(255, 255, 255));
        overviewLabel.setText("Overview");

        javax.swing.GroupLayout overviewPanelLayout = new javax.swing.GroupLayout(overviewPanel);
        overviewPanel.setLayout(overviewPanelLayout);
        overviewPanelLayout.setHorizontalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(overviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overviewLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(overviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(overviewLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        overviewLayeredPane.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(mainHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(overviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(historyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(overviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void launchCardPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel1MouseClicked

    }//GEN-LAST:event_launchCardPanel1MouseClicked

    private void launchCardPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel7MouseClicked

    }//GEN-LAST:event_launchCardPanel7MouseClicked

    private void launchCardPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel9MouseClicked

    }//GEN-LAST:event_launchCardPanel9MouseClicked

    private void launchCardPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel8MouseClicked

    }//GEN-LAST:event_launchCardPanel8MouseClicked

    private void launchCardPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel6MouseClicked

    }//GEN-LAST:event_launchCardPanel6MouseClicked

    private void launchCardPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel10MouseClicked

    }//GEN-LAST:event_launchCardPanel10MouseClicked

    private void launchCardPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel12MouseClicked

    }//GEN-LAST:event_launchCardPanel12MouseClicked

    private void launchCardPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel11MouseClicked

    }//GEN-LAST:event_launchCardPanel11MouseClicked

    private void launchCardPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel4MouseClicked

    }//GEN-LAST:event_launchCardPanel4MouseClicked

    private void launchCardPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel5MouseClicked

    }//GEN-LAST:event_launchCardPanel5MouseClicked

    private void launchCardPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel3MouseClicked

    }//GEN-LAST:event_launchCardPanel3MouseClicked

    private void launchCardPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_launchCardPanel2MouseClicked

    }//GEN-LAST:event_launchCardPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.panels.DescriptionCardPanel descriptionCardPanel1;
    private io.github.gageallencarpenter.view.panels.DescriptionCardPanel descriptionCardPanel2;
    private javax.swing.JLabel historyLabel;
    private javax.swing.JTextArea historyLog;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel historyPanel;
    private javax.swing.JScrollPane historyScroll;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel1;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel10;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel11;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel12;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel2;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel3;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel4;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel5;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel6;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel7;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel8;
    private io.github.gageallencarpenter.view.panels.TitlePanel launchCardPanel9;
    private javax.swing.JLabel launchLabel;
    private javax.swing.JLayeredPane launchPadLayeredPane;
    private javax.swing.JPanel launchPadPanel;
    private javax.swing.JScrollPane launchScroll;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel mainHomePanel;
    private javax.swing.JLabel overviewLabel;
    private javax.swing.JLayeredPane overviewLayeredPane;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel overviewPanel;
    private javax.swing.JScrollPane taskAllocationScroll;
    private io.github.gageallencarpenter.view.panel.dashboard.ServiceAllocatorPanel taskAllocatorPanel;
    private javax.swing.JLabel taskLabel;
    // End of variables declaration//GEN-END:variables
}
