
package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import java.awt.*;

/**
 * A sub panel of the service request panel that is used to obtain a boolean value from the user
 * that displays as a checkbox.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class InputCheckBoxPanel extends javax.swing.JPanel implements ICustomPaint, Iinput {

    private Color color1;
    private Color color2;
    private int arcWidth;
    private int arcHeight;

    /**
     * Create a new InputCheckBoxPanel.
     */
    public InputCheckBoxPanel() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        checkbox.setBackground(new Color(0,0,0,0));
        color1 = new Color(0,0,0,0);
        color2 = new Color(0,0,0,0);
        arcWidth = 0;
        arcHeight = 0;
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

    /**
     * set the text of the label.
     *
     * @param title The new text of the label.
     */
    public void setTitleLabelText(String title){
        titleLabel.setText(title);
    }

    /**
     * Get the text of the label.
     *
     * @return The text of the label.
     */
    public String getTitleLabelText(){
        return titleLabel.getText();
    }

    /**
     * set the value of the input.
     *
     * @param text the value of the input.
     */
    @Override
    public void setValue(String[] text) {
        checkbox.setState(Boolean.parseBoolean(text[0]));
    }

    /**
     * Get the value of the checkbox.
     *
     * @return the value of the input.
     */
    @Override
    public String[] getValue() {
        return new String[]{String.valueOf(checkbox.getState())};
    }

    @Override
    public void setTitleLabel(String text) {
        titleLabel.setText(text);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        checkbox = new java.awt.Checkbox();

        setOpaque(false);

        titleLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        titleLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
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
    private java.awt.Checkbox checkbox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
