
package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.button.Button;
import io.github.gageallencarpenter.view.paint.ICustomPaint;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;

import java.awt.*;

/**
 * A panel that is used to get user input for a given service. That panel can then be used to
 * launch the service directly from this panel or from the launch button in the ServicePanel.
 * This panel can also be removed from the queue by clicking the remove button.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public final class ServiceRequestPanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 15;
    private int arcHeight = 15;
    private Button launchButton;
    private Button removeButton;

    /**
     * Create a new ServiceRequestPanel.
     */
    public ServiceRequestPanel() {
        initComponents();
        initLaunchButtons();
        initRemoveButtons();
        setBackground(new Color(0,0,0,0));
        inputPane.setBackground(new Color(0,0,0,0));
        inputPanePanel.setBackground(new Color(0,0,0,0));
        inputPanel.setBackground(new Color(0,0,0,0));
        new ScrollPane(inputScroll);
    }

    private void initLaunchButtons(){
        launchButton = new Button();
        launchButton.setText("Launch");
        launchButton.setColor1(new Color(52, 52, 52));
        launchButton.setColor2(new Color(52, 52, 52));
        launchButton.addActionListener(e -> ServicePanel.getInstance().removeService(this));
        buttonPanel.add(launchButton);
    }

    private void initRemoveButtons(){
        removeButton = new Button();
        removeButton.setText("Remove");
        removeButton.setColor1(new Color(61, 140, 193));
        removeButton.setColor2(new Color(61, 140, 193));
        removeButton.addActionListener(e -> ServicePanel.getInstance().removeService(this));
        buttonPanel.add(removeButton);
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
     * Set the title label text.
     *
     * @param title The new text for the title label.
     */
    public void setTitleLabelText(String title){
        titleLabel.setText(title);
    }

    /**
     * Get the title label text.
     *
     * @return The title label text.
     */
    public String getTitleLabelText(){
        return titleLabel.getText();
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        inputScroll = new javax.swing.JScrollPane();
        inputPanePanel = new javax.swing.JPanel();
        inputPane = new javax.swing.JLayeredPane();
        buttonPanel = new javax.swing.JPanel();

        setOpaque(false);

        titleLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");
        titleLabel.setToolTipText("");

        inputPanel.setBackground(new java.awt.Color(0, 0, 0));

        inputPanePanel.setBackground(new java.awt.Color(0, 0, 0));

        inputPane.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        javax.swing.GroupLayout inputPanePanelLayout = new javax.swing.GroupLayout(inputPanePanel);
        inputPanePanel.setLayout(inputPanePanelLayout);
        inputPanePanelLayout.setHorizontalGroup(
            inputPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(inputPane)
                .addGap(0, 0, 0))
        );
        inputPanePanelLayout.setVerticalGroup(
            inputPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(inputPane)
                .addGap(0, 0, 0))
        );

        inputScroll.setViewportView(inputPanePanel);

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(inputScroll)
                .addGap(0, 0, 0))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(inputScroll)
                .addGap(0, 0, 0))
        );

        buttonPanel.setOpaque(false);
        buttonPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paints the component
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.bubblePanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintComponent(graphics);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLayeredPane inputPane;
    private javax.swing.JPanel inputPanePanel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane inputScroll;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
