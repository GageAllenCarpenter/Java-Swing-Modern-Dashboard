
package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import javax.swing.*;
import java.awt.*;

/**
 * Displays an image with title and subtitle on a gradient panel.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class DescriptionCardPanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth;
    private int arcHeight;
    private String description = "description";

    /**
     * Create a new DescriptionCardPanel.
     */
    public DescriptionCardPanel() {
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

    public String getDescription() {
        return lbDescription.getText();
    }

    public void setDescription(String description) {
        lbDescription.setText(this.description = description);
    }

    public void setData(String title, Icon icon, String description) {
        lbTitle.setText(title);
        lbIcon.setIcon(icon);
        lbDescription.setText(description);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Title");
        lbTitle.setToolTipText("");

        lbDescription.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Adds a rounded bubble effect to the panel.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.bubblePanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintComponent(graphics);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
