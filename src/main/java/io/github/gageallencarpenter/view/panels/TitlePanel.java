
package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import javax.swing.*;
import java.awt.*;

/**
 * A panel that displays a title and an icon
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class TitlePanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 15;
    private int arcHeight = 15;

    /**
     * Create a new TitlePanel.
     */
    public TitlePanel() {
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

    /**
     * set the icon of the panel.
     *
     * @param  icon  The new icon of the panel.
     */
    public void setIconLabel(Icon icon){
        iconLabel.setIcon(icon);
    }

    /**
     * get the icon of the panel.
     *
     * @return The icon
     */
    public Icon getIconLabel(){
        return iconLabel.getIcon();
    }

    /**
     * set the title of the panel.
     *
     * @param  title  The new title of the panel.
     */
    public void setTitleLabelText(String title){
        titleLabel.setText(title);
    }

    /**
     * get the title of the panel.
     *
     * @return The title
     */
    public String getTitleLabelText(){
        return titleLabel.getText();
    }

    public void setData(String title, Icon icon){
        setTitleLabelText(title);
        setIconLabel(icon);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        setOpaque(false);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        titleLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the panel.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.bubblePanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintComponent(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
