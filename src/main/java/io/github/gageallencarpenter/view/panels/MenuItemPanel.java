package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.paint.ICustomPaint;
import io.github.gageallencarpenter.view.record.MenuModel;
import java.awt.*;

/**
 * A panel that displays a menu item. Menu items are used to navigate the application and
 * are nested in the menu panel.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class MenuItemPanel extends javax.swing.JPanel implements ICustomPaint {

    private boolean selected;
    private boolean over;
    private Color color1 = new Color(255, 255, 255, 80);
    private Color color2 = new Color(0,0,0,0);
    private int arcWidth = 20;
    private int arcHeight = 20;

    /**
     * Create a new MenuItemPanel.
     */
    public MenuItemPanel(MenuModel data) {
        initComponents();
        if (null == data.type()) {
            lbName.setText(" ");
        } else switch (data.type()) {
            case MENU -> {
                lbIcon.setIcon(data.toIcon());
                lbName.setText(data.name());
            }
            case TITLE -> {
                lbIcon.setText(data.name());
                lbIcon.setFont(new Font("sanserif", Font.BOLD, 12));
                lbName.setVisible(false);
            }
            default -> lbName.setText(" ");
        }
        setBackground(new Color(0,0,0,0));
    }


    /**
     * If the selected variable is true, then the component will be painted with a blue border, otherwise it will be
     * painted with a black border.
     *
     * @param selected This is a boolean value that indicates whether the button is selected or not.
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }


    /**
     * If the mouse is over the button, set the over variable to true and repaint the button.
     *
     * @param over This is a boolean that tells us whether the mouse is over the button or not.
     */
    public void setOver(boolean over) {
        this.over = over;
        repaint();
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

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        lbIcon.setForeground(new java.awt.Color(255, 255, 255));

        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbIcon)
                .addGap(10, 10, 10)
                .addComponent(lbName)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the component.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.selectedComponent(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight(),selected, over);
        super.paintComponent(graphics);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
