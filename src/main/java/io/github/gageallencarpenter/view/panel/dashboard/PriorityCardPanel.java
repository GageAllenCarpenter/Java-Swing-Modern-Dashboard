package io.github.gageallencarpenter.view.panel.dashboard;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import javax.swing.*;
import java.awt.*;

/**
 * A sub panel of the service allocator that shows the status of a given collection of priorities.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class PriorityCardPanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 15;
    private int arcHeight = 15;

    /**
     * Create a new PriorityCardPanel.
     */
    public PriorityCardPanel() {
        initComponents();
        setOpaque(false);
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
     * Get the width of the arc.
     *
     * @return The width of the arc.
     */
    @Override
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * Set the width of the arc.
     *
     * @param arcWidth The new width of the arc.
     */
    @Override
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the height of the arc.
     *
     * @return The height of the arc.
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the height of the arc.
     *
     * @param arcHeight The new height of the arc.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    /**
     * get the label icon
     *
     * @return the label icon
     */
    public JLabel getIconLabel() {
        return iconLabel;
    }

    /**
     * set the label text
     *
     * @param iconLabel the label text
     */
    public void setIconLabel(JLabel iconLabel) {
        this.iconLabel = iconLabel;
    }

    /**
     * get the title label text
     *
     * @return the label text
     */
    public JLabel getTitleLabel() {
        return titleLabel;
    }

    /**
     * set the title label text
     *
     * @param titleLabel the label text
     */
    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    /**
     * set the description label text
     *
     * @param title the label text
     */
    public void setTitleLabelText(String title){
        titleLabel.setText(title);
    }

    /**
     * get the description label text
     *
     * @return the label text
     */
    public String getTitleLabelText(){
        return titleLabel.getText();
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stock.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        titleLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the component.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.roundedPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintComponent(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
