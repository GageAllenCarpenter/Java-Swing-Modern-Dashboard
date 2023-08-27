package io.github.gageallencarpenter.view.panels;


import io.github.gageallencarpenter.view.paint.ICustomPaint;

import java.awt.*;

/**
 * A custom panel for displaying the background of the application.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class BackgroundPanel extends javax.swing.JPanel{

    private Color color1;
    private Color color2;
    private int arcWidth;
    private int arcHeight;

    /**
     * Create a new BackgroundPanel.
     */
    public BackgroundPanel() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(0,0,0));
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        arcWidth = 0;
        arcHeight = 0;
    }

    /**
     * Get the first color of the gradient.
     *
     * @return The first color of the gradient.
     */
    public Color getColor1() {
        return color1;
    }

    /**
     * Set the first color of the gradient.
     *
     * @param color1 The new first color of the gradient.
     */
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * Get the second color of the gradient.
     *
     * @return The second color of the gradient.
     */
    public Color getColor2() {
        return color2;
    }

    /**
     * Set the second color of the gradient.
     *
     * @param color2 The new second color of the gradient.
     */
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * Get the arc width of the panel.
     *
     * @return The arc width of the panel.
     */
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * Set the arc width of the panel.
     *
     * @param arcWidth The new arc width of the panel.
     */
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the arc height of the panel.
     *
     * @return The arc height of the panel.
     */
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the arc height of the panel.
     *
     * @param arcHeight The new arc height of the panel.
     */
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the panel.
     *
     * @param graphics The graphics object.
     */
    @Override
    protected void paintChildren(Graphics graphics) {
        ICustomPaint.roundedPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintChildren(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
