package io.github.gageallencarpenter.view.panel.dashboard;

import io.github.gageallencarpenter.model.MenuList;
import io.github.gageallencarpenter.model.ResourceList;
import io.github.gageallencarpenter.view.list.MenuInterface;
import io.github.gageallencarpenter.view.paint.ICustomPaint;
import io.github.gageallencarpenter.view.panels.MenuItemsPanel;
import io.github.gageallencarpenter.view.record.MenuModel;

import java.awt.*;

/**
 * The panel that contains the menu.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class MenuPanel extends javax.swing.JPanel implements ICustomPaint {

    private MenuInterface menu;
    private Color color1 = Color.BLACK;
    private Color color2 = Color.BLACK;
    private int arcWidth = 40;
    private int arcHeight = 40;

    /**
     * Create a new MenuPanel.
     */
    public MenuPanel() {
        initComponents();
        setOpaque(false);
        createList();
    }

    /**
     * adds a menu interface to the menu factory.
     *
     * @param menu The menu interface to receive.
     */
    public void addMenuInterface(MenuInterface menu) {
        this.menu = menu;
        menuItemsPanel.getMenuFactory().addMenuInterface(menu);
    }

    /**
     * Adds menu items to the menu.
     */
    private void createList(){
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("","Tools", MenuList.TITLE));
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("dashboard", "Dashboard", MenuList.MENU));
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("operations", "Services", MenuList.MENU));
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("backstage", "Backstage", MenuList.MENU));
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("","", MenuList.EMPTY));
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("","Resources", MenuList.TITLE));
        for(int i = 0; i < ResourceList.size(); i++){
            menuItemsPanel.getMenuFactory().addItem(new MenuModel(ResourceList.getResources().get(i).getIcon(), ResourceList.getResources().get(i).getName(), ResourceList.getResources().get(i).getMenu()));
        }
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("","", MenuList.EMPTY));
        menuItemsPanel.getMenuFactory().addItem(new MenuModel("logout","Logout", MenuList.MENU));
    }

    public MenuItemsPanel getMenuItemsPanel(){
        return menuItemsPanel;
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
     * Paint the component.
     *
     * @param graphics  the <code>Graphics</code> context in which to paint
     */
    @Override
    protected void paintChildren(Graphics graphics) {
        ICustomPaint.menuPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintChildren(graphics);
    }
    
    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuItemsPanel = new io.github.gageallencarpenter.view.panels.MenuItemsPanel();

        titlePanel.setBackground(new java.awt.Color(0, 0, 0));
        titlePanel.setOpaque(false);

        logoLabel.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dragon.png"))); // NOI18N
        logoLabel.setToolTipText("");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logoLabel;
    private io.github.gageallencarpenter.view.panels.MenuItemsPanel menuItemsPanel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
