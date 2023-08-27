package io.github.gageallencarpenter.view.frame;

import io.github.gageallencarpenter.view.motion.Drag;

import javax.swing.*;
import java.awt.*;

/**
 * A custom title bar for JFrames.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class SimpleTitleBar extends javax.swing.JPanel {

    private int x;
    private int y;

    /**
     * Create a new SimpleTitleBar.
     */
    public SimpleTitleBar() {
        initComponents();
    }

    /**
     * Initialize the components of the SimpleTitleBar.
     */
    public void init(JFrame frame) {
        ComponentResizer resize = new ComponentResizer();
        resize.setSnapSize(new Dimension(10, 10));
        resize.setMinimumSize(new Dimension(300, 200));
        resize.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        resize.registerComponent(frame);
        Drag.getInstance().initMoving(frame, this);
        simpleButtonBar1.initEvent(frame);
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();
        simpleButtonBar1 = new SimpleButtonBar();

        setBackground(new java.awt.Color(50, 50, 50));

        panelMove.setOpaque(false);

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(panelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(simpleButtonBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(panelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(simpleButtonBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMove;
    private SimpleButtonBar simpleButtonBar1;
    // End of variables declaration//GEN-END:variables
}
