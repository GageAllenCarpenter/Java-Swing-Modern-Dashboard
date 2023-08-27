package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.panel.dashboard.MenuPanel;
import io.github.gageallencarpenter.view.paint.ICustomPaint;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;

import javax.swing.*;
import java.awt.*;

/**
 * DashboardPanel is a custom panel for displaying the dashboard of the application.
 * The dashboard includes everything within the header panel, menu panel and the main panel.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class DashboardPanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 40;
    private int arcHeight = 40;

    /**
     * Create a new DashboardPanel.
     */
    public DashboardPanel() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(0,0,0));
        new ScrollPane(centerScroll);
    }

    /**
     * Get the header panel.
     *
     * @return The header panel.
     */
    public HeaderPanel getHeaderPanel() {
        return headerPanel;
    }

    /**
     * Get the menu panel.
     *
     * @return The menu panel.
     */
    public MenuPanel getMenu() {
        return menu;
    }

    /**
     * Get the main panel.
     *
     * @return The main panel.
     */
    public JPanel getCenterPanel() {
        return mainPanel;
    }

    /**
     * Get the first color of the gradient.
     *
     * @return The first color of the gradient.
     */
    @Override
    public Color getColor1() {
        return color1;
    }

    /**
     * Set the first color of the gradient.
     *
     * @param color1 The new first color of the gradient.
     */
    @Override
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * Get the second color of the gradient.
     *
     * @return The second color of the gradient.
     */
    @Override
    public Color getColor2() {
        return color2;
    }

    /**
     * Set the second color of the gradient.
     *
     * @param color2 The new second color of the gradient.
     */
    @Override
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * Get the arc width of the gradient.
     *
     * @return The arc width of the gradient.
     */
    @Override
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * Set the arc width of the gradient.
     *
     * @param arcWidth The new arc width of the gradient.
     */
    @Override
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the arc height of the gradient.
     *
     * @return The arc height of the gradient.
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the arc height of the gradient.
     *
     * @param arcHeight The new arc height of the gradient.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new io.github.gageallencarpenter.view.panel.dashboard.MenuPanel();
        headerPanel = new io.github.gageallencarpenter.view.panels.HeaderPanel();
        centerScroll = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        headerPanel.setColor2(new java.awt.Color(0, 0, 0));

        centerScroll.setBorder(null);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());
        centerScroll.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(centerScroll)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(centerScroll)
                .addGap(20, 20, 20))
        );

        headerPanel.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the component.
     * @param graphics  the <code>Graphics</code> context in which to paint
     */
    @Override
    protected void paintChildren(Graphics graphics) {
        ICustomPaint.roundedPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintChildren(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane centerScroll;
    private io.github.gageallencarpenter.view.panels.HeaderPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private io.github.gageallencarpenter.view.panel.dashboard.MenuPanel menu;
    // End of variables declaration//GEN-END:variables
}
