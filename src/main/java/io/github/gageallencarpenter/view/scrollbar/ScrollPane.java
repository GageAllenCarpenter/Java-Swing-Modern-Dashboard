package io.github.gageallencarpenter.view.scrollbar;

import javax.swing.*;
import java.awt.*;

import static javax.swing.BorderFactory.createEmptyBorder;

/**
 * A custom scroll pane.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ScrollPane{

    /**
     * Create a new ScrollPane.
     */
    public ScrollPane(JScrollPane scroll){
        scroll.setVerticalScrollBar(new ScrollBar());
        scroll.setHorizontalScrollBar(new ScrollBar());
        scroll.getVerticalScrollBar().setBackground(new Color(29,30,34));
        scroll.getHorizontalScrollBar().setBackground(new Color(29,30,34));
        scroll.setBorder(createEmptyBorder());
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
    }
}
