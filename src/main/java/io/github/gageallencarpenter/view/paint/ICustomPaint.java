package io.github.gageallencarpenter.view.paint;

import java.awt.*;

/**
 * An interface for painting components.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public interface ICustomPaint {

    /**
     * get the first color of the gradient.
     *
     * @return The first color of the gradient.
     */
    Color getColor1();

    /**
     * Set the first color of the gradient.
     *
     * @param color1 The new first color of the gradient.
     */
    void setColor1(Color color1);

    /**
     * Get the second color of the gradient.
     *
     * @return The second color of the gradient.
     */
    Color getColor2();

    /**
     * Set the second color of the gradient.
     *
     * @param color2 The new second color of the gradient.
     */
    void setColor2(Color color2);

    /**
     * Get the arc width of the gradient.
     *
     * @return The arc width of the gradient.
     */
    int getArcWidth();

    /**
     * Set the arc width of the gradient.
     *
     * @param arcWidth The new arc width of the gradient.
     */
    void setArcWidth(int arcWidth);

    /**
     * Get the arc height of the gradient.
     *
     * @return The arc height of the gradient.
     */
    int getArcHeight();

    /**
     * Set the arc height of the gradient.
     *
     * @param arcHeight The new arc height of the gradient.
     */
    void setArcHeight(int arcHeight);

    /**
     * Paint component implementation for rounded panels.
     *
     * @param graphics The graphics object to paint with.
     * @param color1 The first color of the gradient.
     * @param color2 The second color of the gradient.
     * @param arcWidth The arc width of the gradient.
     * @param arcHeight The arc height of the gradient.
     * @param width The width of the component.
     * @param height The height of the component.
     */
    static void roundedPanel(Graphics graphics, Color color1, Color color2, int arcWidth, int arcHeight,int width, int height){
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, height, color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, width, height, arcWidth, arcHeight);
    }

    /**
     * Paint component implementation for rounded panels that have a horizontal gradient.
     *
     * @param graphics The graphics object to paint with.
     * @param color1 The first color of the gradient.
     * @param color2 The second color of the gradient.
     * @param arcWidth The arc width of the gradient.
     * @param arcHeight The arc height of the gradient.
     * @param width The width of the component.
     * @param height The height of the component.
     */
    static void roundedHorizontalPanel(Graphics graphics, Color color1, Color color2, int arcWidth, int arcHeight,int width, int height){
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, width, 0, color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, width, height, arcWidth, arcHeight);
    }

    /**
     * Paint component implementation for rounded panels with bubbles.
     *
     * @param graphics The graphics object to paint with.
     * @param color1 The first color of the gradient.
     * @param color2 The second color of the gradient.
     * @param arcWidth The arc width of the gradient.
     * @param arcHeight The arc height of the gradient.
     * @param width The width of the component.
     * @param height The height of the component.
     */
    static void bubblePanel(Graphics graphics, Color color1, Color color2, int arcWidth, int arcHeight,int width, int height){
        roundedPanel( graphics, color1, color2, arcWidth, arcHeight, width, height);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(width - (height / 2), 10, height, height);
        g2.fillOval(width - (height / 2) - 20, height / 2 + 20, height, height);
    }

    /**
     * Paint component implementation for rounded panels that are used as headers.
     *
     * @param graphics The graphics object to paint with.
     * @param color1 The first color of the gradient.
     * @param color2 The second color of the gradient.
     * @param arcWidth The arc width of the gradient.
     * @param arcHeight The arc height of the gradient.
     * @param width The width of the component.
     * @param height The height of the component.
     */
    static void headPanel(Graphics graphics, Color color1, Color color2, int arcWidth, int arcHeight,int width, int height){
        roundedPanel( graphics, color1, color2, arcWidth, arcHeight, width, height);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.fillRect(0,0,25,height);
        g2.fillRect(width-25,height-25, width, height);
    }

    /**
     * Paint component implementation for selected components. Selected components will have an outline once selected.
     *
     * @param graphics The graphics object to paint with.
     * @param color1 The first color of the gradient.
     * @param color2 The second color of the gradient.
     * @param arcWidth The arc width of the gradient.
     * @param arcHeight The arc height of the gradient.
     * @param width The width of the component.
     * @param height The height of the component.
     * @param selected If the component is selected.
     * @param over If the mouse is over the component.
     */
    static void selectedComponent(Graphics graphics, Color color1, Color color2, int arcWidth, int arcHeight,int width, int height, boolean selected, boolean over){
       if(selected || over){
           Graphics2D g2 = (Graphics2D) graphics;
           g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           if(selected){
               g2.setColor(color1);
           } else {
               g2.setColor(color2);
           }
           g2.fillRoundRect(10, 0, width-20, height, arcWidth, arcHeight);
       }
    }

    /**
     * Paint component implementation for rounded panels that act as menu panels.
     *
     * @param graphics The graphics object to paint with.
     * @param color1 The first color of the gradient.
     * @param color2 The second color of the gradient.
     * @param arcWidth The arc width of the gradient.
     * @param arcHeight The arc height of the gradient.
     * @param width The width of the component.
     * @param height The height of the component.
     */
    static void menuPanel(Graphics graphics, Color color1, Color color2, int arcWidth, int arcHeight,int width, int height){
        roundedPanel( graphics, color1, color2, arcWidth, arcHeight, width, height);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.fillRect(width-20,0,width,height);
    }
}
