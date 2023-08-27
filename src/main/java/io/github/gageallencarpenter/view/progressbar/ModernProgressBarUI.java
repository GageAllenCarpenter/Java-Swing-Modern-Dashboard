package io.github.gageallencarpenter.view.progressbar;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class ModernProgressBarUI extends BasicProgressBarUI {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.PINK;
    private Color color3 = Color.WHITE;
    private Color borderColor = Color.BLACK;
    private int barHeight = 20;
    private int barWidth = 200;

    /**
     * Controls the width of the overall progress bar.
     *
     * @return The width of the progress bar.
     */
    @Override
    protected Dimension getPreferredInnerHorizontal() {
        return new Dimension(barWidth, barHeight);
    }

    /**
     * Draws a rounded rectangle with a gradient fill
     *
     * @param g The Graphics object to paint to.
     * @param c The component that is being painted.
     */
    @Override
    protected void paintDeterminate(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int iStrokeWidth = 3;
        g2d.setStroke(new BasicStroke(iStrokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(borderColor); //Outline of progress bar
        RoundRectangle2D outline = new RoundRectangle2D.Double((iStrokeWidth >> 1), (iStrokeWidth >> 1), progressBar.getWidth() - iStrokeWidth, progressBar.getHeight() - iStrokeWidth, progressBar.getHeight(), progressBar.getHeight());
        g2d.draw(outline);
        int iInnerHeight = progressBar.getHeight() - (iStrokeWidth * 4);
        int iInnerWidth = progressBar.getWidth() - (iStrokeWidth * 4);
        double dProgress = progressBar.getPercentComplete();
        if (dProgress < 0) {
            dProgress = 0;
        } else if (dProgress > 1) {
            dProgress = 1;
        }
        iInnerWidth = (int) Math.round(iInnerWidth * dProgress);
        int x = iStrokeWidth * 2;
        int y = iStrokeWidth * 2;
        Point2D start = new Point2D.Double(x, y);
        Point2D end = new Point2D.Double(x, y + iInnerHeight);
        float[] dist = {0.0f, 0.25f, 1.0f};
        Color[] colors = {color1, color2, color3};
        LinearGradientPaint p = new LinearGradientPaint(start, end, dist, colors);
        g2d.setPaint(p);
        RoundRectangle2D fill = new RoundRectangle2D.Double(iStrokeWidth * 2, iStrokeWidth * 2, iInnerWidth, iInnerHeight, iInnerHeight, iInnerHeight);
        g2d.fill(fill);
        g2d.dispose();
    }

    /**
     * returns the height of the bar.
     *
     * @return The barHeight variable is being returned.
     */
    public int getBarHeight() {
        return barHeight;
    }

    /**
     * Sets the height of the bar.
     *
     * @param barHeight The height of the bar in pixels.
     */
    public void setBarHeight(int barHeight) {
        this.barHeight = barHeight;
    }

    /**
     * returns the width of the bar.
     *
     * @return The barWidth variable is being returned.
     */
    public int getBarWidth() {
        return barWidth;
    }

    /**
     * sets the barWidth variable to the value of the barWidth parameter.
     *
     * @param barWidth The width of the bar in pixels.
     */
    public void setBarWidth(int barWidth) {
        this.barWidth = barWidth;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}