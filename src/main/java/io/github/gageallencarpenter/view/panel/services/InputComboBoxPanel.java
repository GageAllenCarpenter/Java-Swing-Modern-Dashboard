
package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.paint.ICustomPaint;

import java.awt.*;
import java.util.Objects;

/**
 * A sub panel of the service request panel that is used to obtain a combo box value from the user.
 * This is used to get a value from a list of options.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class InputComboBoxPanel extends javax.swing.JPanel implements ICustomPaint, Iinput {

    private Color color1 = new Color(0,0,0,0);
    private Color color2 = new Color(0,0,0,0);
    private int arcWidth = 0;
    private int arcHeight = 0;
    private final String title;
    private final String[] options;

    /**
     * Create a new InputComboBoxPanel.
     */
    public InputComboBoxPanel(String title, String[] options) {
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.title = title;
        this.options = options;
        setTitleLabelText(title);
        setComboBoxOptions(options);
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
     * Get the arc height of the panel
     *
     * @return The arc height of the panel.
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the arc height of the panel.
     *
     * @param arcHeight The new arc height of the panel.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    /**
     * set the text of the title label.
     *
     * @param title The new text of the title label.
     */
    public void setTitleLabelText(String title){
        titleLabel.setText(title);
    }

    /**
     * Get the text of the title label.
     *
     * @return The text of the title label.
     */
    public String getTitleLabelText(){
        return titleLabel.getText();
    }

    /**
     * Add an item to the combo box.
     *
     * @param item The item to receive to the combo box.
     */
    public void addComboBoxItem(String item){
        comboBox.addItem(item);
    }

    /**
     * receive an array of items to the combo box.
     *
     * @param items The array of items to receive to the combo box.
     */
    public void setComboBoxOptions(String[] items){
        for (String item : items) {
            comboBox.addItem(item);
        }
    }

    /**
     * remove an item from the combo box.
     *
     * @param item The item to remove from the combo box.
     */
    public void removeComboBoxItem(String item){
        comboBox.removeItem(item);
    }

    /**
     * remove all items from the combo box.
     */
    public void removeAllComboBoxItems(){
        comboBox.removeAllItems();
    }

    /**
     * set the selected item of the combo box.
     *
     * @param item The item to set as the selected item of the combo box.
     */
    public void setSelectedComboBoxItem(String item){
        comboBox.setSelectedItem(item);
    }

    /**
     * Get the selected item of the combo box.
     *
     * @return The selected item of the combo box.
     */
    public String getSelectedComboBoxItem(){
        return Objects.requireNonNull(comboBox.getSelectedItem()).toString();
    }

    /**
     * set the value of the input.
     *
     * @param text the value of the input.
     */
    @Override
    public void setValue(String[] text) {
        setSelectedComboBoxItem(text[0]);
    }

    /**
     * Get the value of the current selected item of the combo box.
     *
     * @return The value of the current selected item of the combo box.
     */
    @Override
    public String[] getValue(){
        return new String[]{getSelectedComboBoxItem()};
    }

    @Override
    public void setTitleLabel(String text) {
        setTitleLabelText(text);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

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
                .addGap(5, 5, 5)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(comboBox, 0, 141, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the panel
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.roundedPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintComponent(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
