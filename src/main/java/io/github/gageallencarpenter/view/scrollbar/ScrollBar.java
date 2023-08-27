package io.github.gageallencarpenter.view.scrollbar;

import javax.swing.*;
import java.awt.*;

/**
 * A custom scroll bar.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ScrollBar extends JScrollBar {

    /**
     * Create a new ScrollBar.
     */
    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(20,19,24));
        setUnitIncrement(20);
    }
}