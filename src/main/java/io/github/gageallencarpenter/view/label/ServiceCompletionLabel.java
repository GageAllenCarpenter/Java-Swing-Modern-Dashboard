package io.github.gageallencarpenter.view.label;

import io.github.gageallencarpenter.model.StatusList;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * A custom label for displaying the status of services or collections of services.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ServiceCompletionLabel extends JLabel {

    private StatusList statusList;

    /**
     * Create a new ServiceCompletionLabel.
     */
    public ServiceCompletionLabel(){
        statusList = StatusList.EMPTY;
        setText(statusList.toString());
        setForeground(Color.WHITE);
    }

    /**
     * get the status list.
     *
     * @return The status list.
     */
    public StatusList getStatusList(){
        return statusList;
    }

    /**
     * Set the status list.
     *
     * @param statusList The new status list.
     */
    public void setStatusList(StatusList statusList){
        this.statusList = statusList;
        setText(statusList.toString());
    }
}
