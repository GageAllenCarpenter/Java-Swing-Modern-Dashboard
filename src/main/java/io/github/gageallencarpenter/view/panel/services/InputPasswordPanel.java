
package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import java.awt.*;

/**
 * A sub panel of the service request panel that is used to obtain a password value from the user
 * that displays as a password field.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class InputPasswordPanel extends javax.swing.JPanel implements ICustomPaint, Iinput {

    private Color color1 = new Color(0,0,0,0);
    private Color color2 = new Color(0,0,0,0);
    private int arcWidth = 0;
    private int arcHeight = 0;

    /**
     * Create a new InputPasswordPanel.
     *
     * @param title The title of the panel.
     */
    public InputPasswordPanel(String title) {
        initComponents();
        titleLabel.setText(title);
        setBackground(new Color(0,0,0,0));
        passwordField.setBorder(null);
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
     * Sets the title label of the panel.
     */
    public void setTitleLabelText(String title){
        titleLabel.setText(title);
    }

    /**
     * Get the text of the title label.
     *
     * @return The value of the input.
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
        passwordField.setText(text[0]);
    }

    /**
     * Get the value of the input.
     *
     * @return The value of the input.
     */
    @Override
    public String[] getValue(){
        return new String[]{passwordField.getText()};
    }

    @Override
    public void setTitleLabel(String text) {
        titleLabel.setText(text);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setOpaque(false);

        titleLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        titleLabel.setToolTipText("");

        passwordField.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
