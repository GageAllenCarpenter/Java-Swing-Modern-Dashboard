package io.github.gageallencarpenter.view.motion;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Used to handle when a user drags a component.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class Drag {

    private static Drag instance;
    private int x;
    private int y;

    /**
     * Create a new Drag.
     */
    private Drag(){}

    /**
     * Allows only one instance of this class to be created
     * If an instance already exists, it will return the instance
     * If an instance does not exist, it will create a new instance
     * @return instance of this class
     */
    public static Drag getInstance(){
        if(instance == null){
            instance = new Drag();
        }
        return instance;
    }

    /**
     * Allows a component to be dragged
     *
     * @param frame The frame to be dragged
     * @param com The component to be dragged
     */
    public void initMoving(JFrame frame, JComponent com) {
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (frame.getExtendedState() != JFrame.MAXIMIZED_BOTH && SwingUtilities.isLeftMouseButton(me)) {
                    x = me.getX() + 3;
                    y = me.getY() + 3;
                }
            }

            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me) && me.getClickCount() == 2) {
                    if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        frame.setExtendedState(JFrame.NORMAL);
                    } else {
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    }
                }
            }

        });
        com.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        frame.setExtendedState(JFrame.NORMAL);
                    }
                    frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
                }
            }
        });
    }
}
