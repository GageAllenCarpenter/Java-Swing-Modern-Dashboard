package io.github.gageallencarpenter.view.panel.services;

import javax.swing.*;

/**
 * Type used to describe the type of input a panel is expecting. This is used to
 * get the correct input from the user. As well as set the value of the input listed
 * for a service.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public interface Iinput {

    /**
     * set the value of the input.
     *
     * @param text the value of the input.
     */
    void setValue(String[] text);

    /**
     * get the value of the input.
     *
     * @return the value of the input.
     */
    String[] getValue();


    void setTitleLabel(String text);

    /**
     * get the input panel.
     *
     * @return the input panel.
     */
    default JComponent getComponent() {
        return (JComponent) this;
    }
}
