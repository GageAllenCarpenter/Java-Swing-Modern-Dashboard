package io.github.gageallencarpenter.view.table;

import io.github.gageallencarpenter.model.StatusList;
import io.github.gageallencarpenter.view.paint.GradientList;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 * A custom table status.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class TableStatus extends JLabel {

    private final GradientList gradient = new GradientList();
    private StatusList type;

    /**
     * Create a new TableStatus.
     */
    public TableStatus() {
        setForeground(Color.WHITE);
    }

    /**
     * Create a new TableStatus.
     *
     * @return The type of the status.
     */
    public StatusList getType() {
        return type;
    }

    public void setType(StatusList type) {
        this.type = type;
        setText(type.toString());
        repaint();
    }

    /**
     * Paint the component.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) graphics;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if (null == type) {
                g = new GradientPaint(0, 0, new Color(255, 255, 255), 0, getHeight(), new Color(255, 255, 255));
            } else g = switch (type) {
                case DONE -> new GradientPaint(0, 0, gradient.getGradient(0).color1(), 0, getHeight(), gradient.getGradient(0).color2());
                case QUEUED -> new GradientPaint(0, 0, gradient.getGradient(0).color1(), 0, getHeight(), gradient.getGradient(0).color2());
                case SELECTED -> new GradientPaint(20, 20, gradient.getGradient(0).color1(), 0, getHeight(), gradient.getGradient(0).color2());
                case UNSELECTED -> new GradientPaint(0, 0, gradient.getGradient(0).color1(), 0, getHeight(), gradient.getGradient(0).color2());
                default -> new GradientPaint(0, 0, gradient.getGradient(0).color1(), 0, getHeight(), gradient.getGradient(0).color2());
            };
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(graphics);
    }
}
