package io.github.gageallencarpenter.view.panels;

import io.github.gageallencarpenter.controller.Search;
import io.github.gageallencarpenter.view.paint.ICustomPaint;

import java.awt.*;

/**
 * Responsible for displaying the searchbar along with refresh, search, and hamburger menu buttons.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class HeaderPanel extends javax.swing.JPanel implements ICustomPaint { //TODO: implement hamburger menu and refresh buttons

    private final Search search = new Search();
    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 0;
    private int  arcHeight = 0;

    /**
     * Create a new HeaderPanel.
     */
    public HeaderPanel() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        refreshLabel = new javax.swing.JLabel();
        searchText = new io.github.gageallencarpenter.view.textfield.SearchText();

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });

        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N

        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        refreshLabel.setToolTipText("");
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshLabelMousePressed(evt);
            }
        });

        searchText.setToolTipText("");
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(refreshLabel)
                .addGap(18, 18, 18)
                .addComponent(menuLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(refreshLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * When the refresh button is clicked, the application is refreshed
     * @param evt the mouse event
     */
    private void refreshLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMousePressed

    }//GEN-LAST:event_refreshLabelMousePressed

    /**
     * When the search button is clicked, the application searches for the text in the search bar
     * @param evt the mouse event
     */
    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        search.searchRows(searchText.getText());
    }//GEN-LAST:event_searchLabelMouseClicked

    /**
     * When the user enters a key into the search bar, the application searches for the text in the search bar
     * @param evt the key event
     */
    private void searchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyPressed
        search.searchRows(searchText.getText());
    }//GEN-LAST:event_searchBarKeyPressed

    /**
     * When an action occurs within the search bar, the application searches for the text in the search bar
     * @param evt the action event
     */
    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        search.searchRows(searchText.getText());
    }//GEN-LAST:event_searchTextActionPerformed

    /**
     * When a key is pressed within the search bar, the application searches for the text in the search bar
     * @param evt the key event
     */
    private void searchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyPressed
        search.searchRows(searchText.getText());
    }//GEN-LAST:event_searchTextKeyPressed

    /**
     * Get the color of the first gradient of the panel
     * @return the color of the gradient
     */
    @Override
    public Color getColor1() {
        return color1;
    }

    /**
     * set the color of the first gradient of the panel
     * @param color1 The new first color of the gradient.
     */
    @Override
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * Get the color of the second gradient of the panel
     * @return the color of the gradient
     */
    @Override
    public Color getColor2() {
        return color2;
    }

    /**
     * set the color of the second gradient of the panel
     * @param color2 The new second color of the gradient.
     */
    @Override
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * Get the arc width of the panel
     * @return the arc width
     */
    @Override
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * set the arc width of the panel
     * @param arcWidth The new arc width.
     */
    @Override
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the arc height of the panel
     * @return the arc height
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * set the arc height of the panel
     * @param arcHeight The new arc height.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    /**
     * Paints the panel with the headPanel theme
     * @param graphics the graphics object
     */
    @Override
    protected void paintChildren(Graphics graphics) {
        ICustomPaint.headPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintChildren(graphics);
    }

    public Search getSearch() {
        return search;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JLabel searchLabel;
    private io.github.gageallencarpenter.view.textfield.SearchText searchText;
    // End of variables declaration//GEN-END:variables
}
