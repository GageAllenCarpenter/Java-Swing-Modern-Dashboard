package io.github.gageallencarpenter.view.label;

import javax.swing.*;

/**
 * A custom label for displaying the percentage of services that have been completed.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class PercentageServiceCountLabel extends JLabel {

    /**
     * Create a new PercentageServiceCountLabel.
     */
    public PercentageServiceCountLabel() {
        setText("0%");
    }

    public void setLabel(float percentage){
        setText(percentage+"%");
    }
}
