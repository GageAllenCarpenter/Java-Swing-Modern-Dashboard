
package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import java.awt.*;

/**
 * A panel that displays a title and an icon
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class roundedBackgroundPanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 15;
    private int arcHeight = 15;

    /**
     * Create a new TitlePanel.
     */
    public roundedBackgroundPanel() {
        initComponents();
        setBackground(new Color(0,0,0,0));
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
     * Get the width of the rounded corners.
     *
     * @return The width of the rounded corners.
     */
    @Override
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * Set the width of the rounded corners.
     *
     * @param arcWidth The new width of the rounded corners.
     */
    @Override
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the height of the rounded corners.
     *
     * @return The height of the rounded corners.
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the height of the rounded corners.
     *
     * @param arcHeight The new height of the rounded corners.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the panel.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.roundedPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintComponent(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
