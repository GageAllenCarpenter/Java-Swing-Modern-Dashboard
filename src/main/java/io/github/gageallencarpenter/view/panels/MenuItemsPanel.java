package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.view.list.MenuFactory;
import io.github.gageallencarpenter.view.list.MenuInterface;
import io.github.gageallencarpenter.view.paint.ICustomPaint;
import io.github.gageallencarpenter.view.scrollbar.ScrollPane;
import java.awt.Color;
import java.awt.Graphics;

public class MenuItemsPanel extends javax.swing.JPanel implements ICustomPaint {

    private MenuInterface menu;
    private Color color1 = Color.BLACK;
    private Color color2 = Color.BLACK;
    private int arcWidth = 40;
    private int arcHeight = 40;
    
    public MenuItemsPanel() {
        initComponents();
        setOpaque(false);
        menuFactory.setOpaque(false);
        new ScrollPane(menuScroll);
    }
    
    /**
     * adds a menu interface to the menu factory.
     *
     * @param menu The menu interface to receive.
     */
    public void addMenuInterface(MenuInterface menu) {
        this.menu = menu;
        menuFactory.addMenuInterface(menu);
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
     * get the menu interface.
     *
     * @return The menu interface.
     */
    public MenuInterface getMenu() {
        return menu;
    }

    /**
     * get the menu interface.
     *
     * @return The menu interface.
     */
    public MenuFactory<String> getMenuFactory() {
        return menuFactory;
    }
    
    /**
     * Paint the component.
     *
     * @param graphics  the <code>Graphics</code> context in which to paint
     */
    @Override
    protected void paintChildren(Graphics graphics) {
        ICustomPaint.menuPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintChildren(graphics);
    }
    
    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuScroll = new javax.swing.JScrollPane();
        menuFactory = new io.github.gageallencarpenter.view.list.MenuFactory<>();

        menuFactory.setToolTipText("");
        menuScroll.setViewportView(menuFactory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.list.MenuFactory<String> menuFactory;
    private javax.swing.JScrollPane menuScroll;
    // End of variables declaration//GEN-END:variables
}
