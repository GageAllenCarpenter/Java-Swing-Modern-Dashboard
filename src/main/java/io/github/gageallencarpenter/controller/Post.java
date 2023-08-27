package io.github.gageallencarpenter.controller;

import io.github.gageallencarpenter.view.button.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 * Employ class is the controller for tables with buttons in the application. Objects that implement
 * the ITable interface are passed to the Employ class to be controlled by the Employ class. Employ
 * employs services to perform tasks. Employ does not perform tasks directly but delegates tasks to
 * their respective views.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class Post {

    /**
     * Handles the event of a button being clicked in any of the tables in the application.
     * This allows for services to be selected and for the service panel to be updated.
     *
     * @param serviceBoard The service board panel.
     * @param application  The application that was clicked.
     */
    public void receive(JTable serviceBoard, MouseEvent application) {
        int column = serviceBoard.columnAtPoint(application.getPoint());
        int row = serviceBoard.rowAtPoint(application.getPoint());
        if (row < serviceBoard.getRowCount() && column < serviceBoard.getColumnCount()) {
            Object value = serviceBoard.getValueAt(row, column);
            if (value instanceof Button button) {
                SwingUtilities.invokeLater(() -> {
                    button.doClick();
                });
            }
        }
    }
}

