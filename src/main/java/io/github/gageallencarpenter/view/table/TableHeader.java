package io.github.gageallencarpenter.view.table;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 * A custom table header.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class TableHeader extends JLabel {

    /**
     * Create a new TableHeader.
     *
     * @param text The text to display.
     */
    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.BLACK);
        setFont(new Font("sanserif", Font.BOLD, 12));
        setForeground(new Color(255,255,255));
        setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    /**
     * Paint the component.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(new Color(0,0,0));
        graphics.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
}
