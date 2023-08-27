package io.github.gageallencarpenter.view.frame;

import java.awt.*;

import io.github.gageallencarpenter.view.button.ToolBarButton;
import javaswingdev.GoogleMaterialDesignIcon;
import javaswingdev.GoogleMaterialIcon;
import javax.swing.JFrame;

/**
 * A custom JFrame that has a simple button bar at the top.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class SimpleButtonBar extends javax.swing.JPanel {

    /**
     * Create a new SimpleButtonBar.
     */
    public SimpleButtonBar() {
        initComponents();
        setOpaque(false);
        cmdClose.setIcon(iconClose.toIcon());
        cmdResize.setIcon(iconRestore.toIcon());
        cmdMinimize.setIcon(iconMinimize.toIcon());
        cmdMinimize.setFont(cmdMinimize.getFont().deriveFont(Font.PLAIN, 3));
    }


    /**
     * Adds a window state listener to the frame, which changes the icon of the resize button depending on the state of
     * the frame
     *
     * @param frame The JFrame that you want to receive the title bar to.
     */
    public void initEvent(JFrame frame) {
        frame.addWindowStateListener(we -> {
            if (we.getNewState() == JFrame.MAXIMIZED_BOTH) {
                cmdResize.setIcon(iconMax.toIcon());
            } else if (we.getNewState() == JFrame.NORMAL) {
                cmdResize.setIcon(iconRestore.toIcon());
            }
        });
        cmdClose.addActionListener(ae -> System.exit(0));
        cmdMinimize.addActionListener(ae -> frame.setState(JFrame.ICONIFIED));
        cmdResize.addActionListener(ae -> {
            if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                frame.setExtendedState(JFrame.NORMAL);
            } else {
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconClose = new GoogleMaterialIcon();
        iconMax = new GoogleMaterialIcon();
        iconMinimize = new GoogleMaterialIcon();
        iconRestore = new GoogleMaterialIcon();
        cmdClose = new ToolBarButton();
        cmdResize = new ToolBarButton();
        cmdMinimize = new ToolBarButton();

        iconClose.setColor1(new java.awt.Color(111, 111, 111));
        iconClose.setColor2(new java.awt.Color(215, 215, 215));
        iconClose.setIcon(GoogleMaterialDesignIcon.CLOSE);
        iconClose.setSize(18);

        iconMax.setColor1(new java.awt.Color(111, 111, 111));
        iconMax.setColor2(new java.awt.Color(215, 215, 215));
        iconMax.setIcon(GoogleMaterialDesignIcon.CONTENT_COPY);
        iconMax.setSize(16);

        iconMinimize.setColor1(new java.awt.Color(111, 111, 111));
        iconMinimize.setColor2(new java.awt.Color(215, 215, 215));
        iconMinimize.setIcon(GoogleMaterialDesignIcon.REMOVE);
        iconMinimize.setSize(18);

        iconRestore.setColor1(new java.awt.Color(111, 111, 111));
        iconRestore.setColor2(new java.awt.Color(215, 215, 215));
        iconRestore.setIcon(GoogleMaterialDesignIcon.CROP_DIN);

        cmdClose.setHoverColor(new java.awt.Color(255, 48, 48));

        cmdMinimize.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cmdMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdResize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(cmdResize, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(cmdMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ToolBarButton cmdClose;
    private ToolBarButton cmdMinimize;
    private ToolBarButton cmdResize;
    private GoogleMaterialIcon iconClose;
    private GoogleMaterialIcon iconMax;
    private GoogleMaterialIcon iconMinimize;
    private GoogleMaterialIcon iconRestore;
    // End of variables declaration//GEN-END:variables
}
