package io.github.gageallencarpenter.view.panel.backstage;

import io.github.gageallencarpenter.Powershell;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;

import javax.swing.*;
import java.awt.*;

/**
 * A panel that displays all events occurring in the application. A terminal is provided
 * to troubleshoot different scripts running under the hood. The terminal is also a java
 * implementation of powershell, you can handle any powershell command in the terminal. The
 * panel also displays the event viewer which displays the object state of all services
 * as they pass through the application.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class BackstagePanel extends javax.swing.JPanel { //TODO: Add Event Viewer Functionality

    private static BackstagePanel instance;
    private final Powershell powershell = new Powershell();

    /**
     * Create a new BackstagePanel.
     */
    private BackstagePanel() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        new ScrollPane(eventScroll);
        new ScrollPane(terminalScroll);
        eventTable.setFillsViewportHeight(true);
        eventTable.setBackground(Color.BLACK);
    }

    /**
     * Get the instance of the BackstagePanel.
     *
     * @return The instance of the BackstagePanel.
     */
    public static BackstagePanel getInstance(){
        if(instance == null){
            instance = new BackstagePanel();
        }
        return instance;
    }

    /**
     * Add text to the powershell terminal.
     *
     * @param text The service to display.
     */
    public void addTerminalText(String text) {
        //noinspection SynchronizeOnNonFinalField
        synchronized (terminalConsole) {
            terminalConsole.append(text);
            terminalConsole.append("\n");
        }
    }

    /**
     * Clear the event viewer of all services.
     */
    public void clearEvents(){
        SwingUtilities.invokeLater(()->eventTable.removeAllRows());
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanelBottom = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        eventScroll = new javax.swing.JScrollPane();
        eventTable = new io.github.gageallencarpenter.view.table.Table();
        eventsLabel = new javax.swing.JLabel();
        backgroundPanelTop = new io.github.gageallencarpenter.view.panels.BackgroundPanel();
        terminalScroll = new javax.swing.JScrollPane();
        terminalConsole = new javax.swing.JTextArea();
        terminalLabel = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        commandField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        backgroundPanelBottom.setArcHeight(60);
        backgroundPanelBottom.setArcWidth(60);
        backgroundPanelBottom.setColor2(new java.awt.Color(51, 51, 51));

        eventTable.setForeground(new java.awt.Color(255, 255, 255));
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Task", "Duration", "Organization", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventScroll.setViewportView(eventTable);

        eventsLabel.setForeground(new java.awt.Color(255, 255, 255));
        eventsLabel.setText("EVENTS");

        javax.swing.GroupLayout backgroundPanelBottomLayout = new javax.swing.GroupLayout(backgroundPanelBottom);
        backgroundPanelBottom.setLayout(backgroundPanelBottomLayout);
        backgroundPanelBottomLayout.setHorizontalGroup(
            backgroundPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventScroll))
                .addGap(20, 20, 20))
        );
        backgroundPanelBottomLayout.setVerticalGroup(
            backgroundPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(eventsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eventScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        backgroundPanelTop.setArcHeight(60);
        backgroundPanelTop.setArcWidth(60);
        backgroundPanelTop.setColor2(new java.awt.Color(51, 51, 51));

        terminalConsole.setBackground(new java.awt.Color(0, 0, 0));
        terminalConsole.setColumns(20);
        terminalConsole.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        terminalConsole.setForeground(new java.awt.Color(255, 255, 255));
        terminalConsole.setLineWrap(true);
        terminalConsole.setRows(5);
        terminalConsole.setToolTipText("");
        terminalConsole.setWrapStyleWord(true);
        terminalScroll.setViewportView(terminalConsole);

        terminalLabel.setForeground(new java.awt.Color(255, 255, 255));
        terminalLabel.setText("TERMINAL");

        enterButton.setBackground(new java.awt.Color(61, 140, 193));
        enterButton.setForeground(new java.awt.Color(255, 255, 255));
        enterButton.setText("ENTER");
        enterButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enterButton.setOpaque(true);
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        commandField.setBackground(new java.awt.Color(0, 0, 0));
        commandField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgroundPanelTopLayout = new javax.swing.GroupLayout(backgroundPanelTop);
        backgroundPanelTop.setLayout(backgroundPanelTopLayout);
        backgroundPanelTopLayout.setHorizontalGroup(
            backgroundPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanelTopLayout.createSequentialGroup()
                        .addComponent(commandField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(terminalScroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanelTopLayout.createSequentialGroup()
                        .addComponent(terminalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        backgroundPanelTopLayout.setVerticalGroup(
            backgroundPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(terminalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminalScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commandField))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backgroundPanelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(backgroundPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * execute the powershell command that the user has typed into the terminal
     *
     * @param evt the event that triggers this method
     */
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        for(String s: powershell.execute(commandField.getText())){
            terminalConsole.append(s);
            terminalConsole.append("\n");
        }
        commandField.setText("");
    }//GEN-LAST:event_enterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.panels.BackgroundPanel backgroundPanelBottom;
    private io.github.gageallencarpenter.view.panels.BackgroundPanel backgroundPanelTop;
    private javax.swing.JTextField commandField;
    private javax.swing.JButton enterButton;
    private javax.swing.JScrollPane eventScroll;
    private io.github.gageallencarpenter.view.table.Table eventTable;
    private javax.swing.JLabel eventsLabel;
    private javax.swing.JTextArea terminalConsole;
    private javax.swing.JLabel terminalLabel;
    private javax.swing.JScrollPane terminalScroll;
    // End of variables declaration//GEN-END:variables
}
